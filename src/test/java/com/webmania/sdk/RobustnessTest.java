package com.webmania.sdk;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.nio.charset.StandardCharsets;
import java.time.Duration;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RobustnessTest {
 static final String READ="monitorListCompanies";
 static final String MUTATE="fiscalUpdateCompany";
 static JsonNode fixture(String id){return OperationSocketTest.FIXTURES.get(id).path("input");}
 static WebmaniaClient monitor(SocketFixture s,Duration timeout,int limit) {
  return new WebmaniaClient(ClientConfig.builder().origin("api2/monitor-reads.openapi.json",s.origin()).deadline(timeout).maxResponseBytes(limit).build(),Credentials.monitor("synthetic-monitor"));
 }
 static byte[] bytes(String value){return value.getBytes(StandardCharsets.UTF_8);}
 @Test void errorPropertyAlwaysFailsAndFailuresCarryReconciliationReference()throws Exception {
  try(var s=new SocketFixture(false);var client=new WebmaniaClient(s.config("api1/fiscal.openapi.json"),Credentials.company("synthetic-key","synthetic-secret","synthetic-access","synthetic-access-secret"))) {
   var input=fixture("nfeIssueDocument").deepCopy();((com.fasterxml.jackson.databind.node.ObjectNode)input.path("body")).put("ID","order-2026-1");
   for(String error:new String[]{"false","null","\"\"","[]","{}","0"}) {
    s.reply=SocketFixture.Reply.json("{\"error\":"+error+",\"message\":\"synthetic-secret https://example.invalid/?token=sensitive\"}");
    ApiException e=OperationSocketTest.error(OperationSocketTest.invoke(client,"nfeIssueDocument",input));assertEquals(ApiException.Kind.API,e.kind());assertTrue(e.outcomeUncertain());assertEquals("order-2026-1",e.reference().value());assertNull(e.getCause());assertFalse(e.toString().contains("synthetic-secret"));
    String json=new ObjectMapper().writeValueAsString(e.reference());assertFalse(json.contains("order-2026-1"));assertTrue(json.contains("redacted"));
   }
   s.reply=new SocketFixture.Reply(503,"application/json",bytes("{}"),Map.of(),0,0,null,false);
   ApiException unavailable=OperationSocketTest.error(OperationSocketTest.invoke(client,"nfeIssueDocument",input));assertEquals(ApiException.Kind.HTTP,unavailable.kind());assertTrue(unavailable.outcomeUncertain());assertEquals("order-2026-1",unavailable.reference().value());
   s.reply=SocketFixture.Reply.json("{broken");ApiException broken=OperationSocketTest.error(OperationSocketTest.invoke(client,"nfeIssueDocument",input));assertEquals(ApiException.Kind.PROTOCOL,broken.kind());assertTrue(broken.outcomeUncertain());assertEquals("order-2026-1",broken.reference().value());
  }
 }
 @Test void deadlineIncludesBodyAndCancellationClosesTheCall()throws Exception {
  try(var s=new SocketFixture(false);var c=monitor(s,Duration.ofMillis(150),1024)) {
   s.reply=new SocketFixture.Reply(200,"application/json",bytes("{}"),Map.of(),0,1000,null,false);
   long start=System.nanoTime();ApiException timeout=OperationSocketTest.error(OperationSocketTest.invoke(c,READ,fixture(READ)));assertEquals(ApiException.Kind.TIMEOUT,timeout.kind());assertTrue(System.nanoTime()-start<TimeUnit.SECONDS.toNanos(1));
   var call=OperationSocketTest.invoke(c,READ,fixture(READ));Thread.sleep(40);assertTrue(call.cancel(true));assertTrue(call.isCancelled());
   int count=s.requests.size();Thread.sleep(200);assertEquals(count,s.requests.size(),"Cancellation must not retry");
  }
  try(var s=new SocketFixture(false);var c=new WebmaniaClient(ClientConfig.builder().origin("api1/fiscal.openapi.json",s.origin()).deadline(Duration.ofMillis(100)).build(),Credentials.company("synthetic-key","synthetic-secret","synthetic-access","synthetic-access-secret"))) {
   s.reply=new SocketFixture.Reply(200,"application/json",bytes("{}"),Map.of(),0,800,null,false);
   var issuance=fixture("nfeIssueDocument").deepCopy();((com.fasterxml.jackson.databind.node.ObjectNode)issuance.path("body")).put("ID","safe-order");ApiException e=OperationSocketTest.error(OperationSocketTest.invoke(c,"nfeIssueDocument",issuance));assertTrue(e.outcomeUncertain());assertEquals("safe-order",e.reference().value());
  }
 }
 @Test void truncationCloseChunkingLimitsAndRedirectAreBounded()throws Exception {
  try(var s=new SocketFixture(false);var destination=new SocketFixture(false);var c=monitor(s,Duration.ofSeconds(1),1024)) {
   s.reply=new SocketFixture.Reply(200,"application/json",bytes("{}"),Map.of(),0,0,200,false);
   assertEquals(ApiException.Kind.TRANSPORT,OperationSocketTest.error(OperationSocketTest.invoke(c,READ,fixture(READ))).kind());assertEquals(1,s.requests.size());
   s.reply=new SocketFixture.Reply(200,"application/json",bytes("{}"),Map.of(),0,0,2048,false);
   assertEquals(ApiException.Kind.LIMIT,OperationSocketTest.error(OperationSocketTest.invoke(c,READ,fixture(READ))).kind());
   s.reply=new SocketFixture.Reply(302,"text/html",bytes("<redirect/>"),Map.of("Location",destination.origin()+"/credential-leak"),0,0,null,false);
   assertEquals(ApiException.Kind.REDIRECT,OperationSocketTest.error(OperationSocketTest.invoke(c,READ,fixture(READ))).kind());assertEquals(0,destination.requests.size());
   String valid=OperationSocketTest.FIXTURES.get(READ).path("response").toString();
   s.reply=new SocketFixture.Reply(200,"application/json",bytes(valid),Map.of(),0,0,null,true);
   assertInstanceOf(ApiResult.class,OperationSocketTest.invoke(c,READ,fixture(READ)).get(2,TimeUnit.SECONDS));
   s.reply=new SocketFixture.Reply(200,"application/json",bytes(valid),Map.of(),0,0,-1,false);
   assertInstanceOf(ApiResult.class,OperationSocketTest.invoke(c,READ,fixture(READ)).get(2,TimeUnit.SECONDS));
  }
 }
 @Test void tlsTrustAndHostnameAreEnforced()throws Exception {
  try(var s=new SocketFixture(true)) {
   s.reply=SocketFixture.Reply.json(OperationSocketTest.FIXTURES.get(READ).path("response").toString());
   try(var c=monitor(s,Duration.ofSeconds(2),4096)){assertEquals(ApiException.Kind.TRANSPORT,OperationSocketTest.error(OperationSocketTest.invoke(c,READ,fixture(READ))).kind());}
   var mismatch=java.net.URI.create(s.origin().toString().replace("localhost","127.0.0.1"));
   try(var c=new WebmaniaClient(ClientConfig.builder().origin("api2/monitor-reads.openapi.json",mismatch).sslContext(SocketFixture.trust).build(),Credentials.monitor("synthetic-monitor"))){assertEquals(ApiException.Kind.TRANSPORT,OperationSocketTest.error(OperationSocketTest.invoke(c,READ,fixture(READ))).kind());}
   assertEquals(0,s.requests.size());
  }
 }
 @Test void wrongScopesAreRejectedBeforeIoAndClientsAreIsolated()throws Exception {
  try(var s=new SocketFixture(false);var wrong=new WebmaniaClient(s.config("api2/monitor-reads.openapi.json"),Credentials.issuer("synthetic-issuer"));var valid=new WebmaniaClient(s.config("api2/monitor-reads.openapi.json"),Credentials.monitor("synthetic-monitor"))) {
   assertEquals(ApiException.Kind.AUTH_SCOPE,OperationSocketTest.error(OperationSocketTest.invoke(wrong,READ,fixture(READ))).kind());assertEquals(0,s.requests.size());
   s.reply=SocketFixture.Reply.json(OperationSocketTest.FIXTURES.get(READ).path("response").toString());OperationSocketTest.invoke(valid,READ,fixture(READ)).get(2,TimeUnit.SECONDS);assertEquals("Bearer synthetic-monitor",s.requests.get(0).headers().get("authorization"));assertFalse(s.requests.get(0).headers().containsValue("synthetic-issuer"));
  }
 }
 @Test void omissionNullFalseZeroDecimalTextAndExtensionsSurvive()throws Exception {
  try(var s=new SocketFixture(false);var c=new WebmaniaClient(s.config("api1/fiscal.openapi.json"),Credentials.company("synthetic-key","synthetic-secret","synthetic-access","synthetic-access-secret"))) {
   JsonNode input=Json.parse("{\"body\":{\"cnae\":null,\"informacoes_fisco\":\"synthetic\",\"future\":{\"object\":{},\"array\":[],\"zero\":0,\"false\":false,\"decimal\":\"9007199254740999.9900\"}}}");s.reply=SocketFixture.Reply.json(OperationSocketTest.FIXTURES.get(MUTATE).path("response").toString());
   OperationSocketTest.invoke(c,MUTATE,input).get(2,TimeUnit.SECONDS);JsonNode sent=Json.parse(s.requests.get(0).body());assertTrue(sent.get("cnae").isNull());assertFalse(sent.has("ie"));assertTrue(sent.path("future").path("object").isObject());assertTrue(sent.path("future").path("array").isArray());assertEquals("9007199254740999.9900",sent.path("future").path("decimal").asText());assertFalse(sent.path("future").path("false").asBoolean());assertEquals(0,sent.path("future").path("zero").asInt());
  }
  var model=new com.webmania.sdk.model.api1fiscal.FiscalCompanyUpdateRequest();assertFalse(model.has("cnae"));model.explicitNull("cnae");assertTrue(model.isNull("cnae"));model.omit("cnae");assertFalse(model.has("cnae"));assertThrows(IllegalArgumentException.class,()->model.extension("cnae",new JsonValue(Json.parse("[]"))));
 }
 @Test void deepSensitiveValuesCapabilitiesUnicodeAndReferencesStayRedacted()throws Exception {
  String u="0a0b0c0d-0000-4000-8000-0000000000ab";
  Credentials credentials=Credentials.company(u,"synthetic-secret","synthetic-access","synthetic-access-secret");
  JsonNode snapshot=Json.parse("{\"body\":{\"ID\":\"safe-ref\",\"future\":{\"senha\":\"１２３４５６７８９０１\",\"url\":\"https://example.invalid/f/"+u+"?token=special-token\"}}}");
  Secrets secrets=new Secrets(credentials,snapshot);assertNull(secrets.correlation(u.toUpperCase(java.util.Locale.ROOT)));assertNull(secrets.correlation("special-token"));assertNull(secrets.correlation("１２３４５６７８９０１"));assertEquals("safe-ref",secrets.reference(snapshot,credentials).value());
  JsonNode ordinary=Json.parse("{\"body\":{\"uuid\":\""+u.toUpperCase(java.util.Locale.ROOT)+"\"}}");Secrets literal=new Secrets(credentials,ordinary);assertEquals(u.toUpperCase(java.util.Locale.ROOT),literal.reference(ordinary,credentials).value());assertNull(literal.reference(Json.parse("{\"body\":{\"uuid\":\""+u+"\"}}"),credentials));
  JsonNode nested=Json.parse("{\"senha\":\"deep-secret\"}");for(int i=0;i<100;i++){var n=com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();n.set("future",nested);nested=n;}Secrets deep=new Secrets(credentials,nested);assertNull(deep.correlation("deep-secret"));
 }
 @Test void callerCanPollOnlyByExplicitCallsAndResponseEnumsRemainForwardCompatible()throws Exception {
  String id="fiscalCreateOrPollReport";try(var s=new SocketFixture(false);var c=new WebmaniaClient(s.config("api1/fiscal.openapi.json"),Credentials.company("synthetic-key","synthetic-secret","synthetic-access","synthetic-access-secret"))) {
   s.reply=SocketFixture.Reply.json(OperationSocketTest.FIXTURES.get(id).path("response").toString());OperationSocketTest.invoke(c,id,fixture(id)).get(2,TimeUnit.SECONDS);Thread.sleep(5000);OperationSocketTest.invoke(c,id,fixture(id)).get(2,TimeUnit.SECONDS);assertEquals(2,s.requests.size());assertArrayEquals(s.requests.get(0).body(),s.requests.get(1).body());Thread.sleep(50);assertEquals(2,s.requests.size());
  }
  var model=new com.webmania.sdk.model.api1fiscal.NfeDocument(Json.parse("{\"uuid\":\"00000000-0000-4000-8000-000000000000\",\"status\":\"future-provider-status\"}"));assertEquals("future-provider-status",model.getStatus());
 }
 @Test void documentedSiblingComparisonsAndServerClockGapAreExplicit()throws Exception {
  String id="emitterIssueNfcom";var op=Contract.operation(id);var schema=Contract.operationSchema(op).path("requestBody").path("content").path("application/json").path("schema");var doc=Contract.document(op.path("module").asText());
  var request=fixture(id).path("body").deepCopy();((com.fasterxml.jackson.databind.node.ObjectNode)request.path("assinante").path("contrato")).put("data_fim","2025-12-31");
  assertThrows(IllegalArgumentException.class,()->Contract.validate(schema,request,doc));
  var serverRule=Json.parse("{\"type\":\"string\",\"x-conditional-rules\":[\"after_or_equal:today\"]}");
  assertDoesNotThrow(()->ConditionalRules.validate(serverRule,Json.scalar("1900-01-01"),serverRule));
 }

 @Test void responseEnumsAndExtensionFieldsRemainForwardCompatibleOverHttp()throws Exception {
  String id="monitorGetDocument";try(var s=new SocketFixture(false);var c=new WebmaniaClient(s.config("api2/monitor-documents.openapi.json"),Credentials.monitor("synthetic-monitor"))) {
   var response=OperationSocketTest.FIXTURES.get(id).path("response").deepCopy();((com.fasterxml.jackson.databind.node.ObjectNode)response).put("status","future-provider-status").put("future_extension",false);
   s.reply=SocketFixture.Reply.json(response.toString());var result=(ApiResult<?>)OperationSocketTest.invoke(c,id,fixture(id)).get(2,TimeUnit.SECONDS);var model=(JsonValue)result.data();assertEquals("future-provider-status",model.toJson().path("status").asText());assertFalse(model.toJson().path("future_extension").asBoolean());
  }
 }

 @Test void publicReportCapabilityRejectsCredentialsBeforeAnyIo()throws Exception {
  String id="fiscalDownloadReport";
  try(var s=new SocketFixture(false);var c=new WebmaniaClient(s.config("api1/files.openapi.json"),Credentials.company("synthetic-key","synthetic-secret","synthetic-access","synthetic-access-secret"))) {
   assertEquals(ApiException.Kind.AUTH_SCOPE,OperationSocketTest.error(OperationSocketTest.invoke(c,id,fixture(id))).kind());assertEquals(0,s.requests.size());
  }
 }
 @Test void monitorValidatesTopAndNestedFiltersIndependently()throws Exception {
  String id="monitorSearchDocuments";
  try(var s=new SocketFixture(false);var c=new WebmaniaClient(s.config("api2/monitor-documents.openapi.json"),Credentials.monitor("synthetic-monitor"))) {
   for(String body:new String[]{
    "{\"data_inicial\":\"2026-10-25\",\"data_final\":\"2026-10-01\",\"filtros\":{\"data_inicial\":\"2026-10-01\",\"data_final\":\"2026-10-25\"}}",
    "{\"data_inicial\":\"2026-10-01\",\"data_final\":\"2026-10-25\",\"filtros\":{\"data_inicial\":\"2026-10-25\",\"data_final\":\"2026-10-01\"}}",
    "{\"numero\":\"0\",\"filtros\":{\"numero\":\"1\"}}",
    "{\"numero\":\"1\",\"filtros\":{\"numero\":\"0\"}}"}) {
    assertEquals(ApiException.Kind.VALIDATION,OperationSocketTest.error(OperationSocketTest.invoke(c,id,Json.parse("{\"body\":"+body+"}"))).kind());assertEquals(0,s.requests.size());
   }
  }
 }

 @Test void effectsPolicyCoversActiveAndPassiveGetsAndConditionalRefresh()throws Exception {
  for(String id:new String[]{"b2bV1ListCompanies","b2bV1GetProcessedRequests"}) {
   boolean active=id.equals("b2bV1ListCompanies");
   try(var server=new SocketFixture(false);var c=new WebmaniaClient(ClientConfig.builder().origin("api1/b2b.openapi.json",server.origin()).deadline(Duration.ofMillis(100)).build(),Credentials.reseller("synthetic-key","synthetic-secret","synthetic-access","synthetic-access-secret"))) {
    server.reply=new SocketFixture.Reply(503,"application/json",bytes("{}"),Map.of(),0,0,null,false);assertEquals(active,OperationSocketTest.error(OperationSocketTest.invoke(c,id,fixture(id))).outcomeUncertain());
    server.reply=new SocketFixture.Reply(200,"application/json",bytes("{}"),Map.of(),0,500,null,false);assertEquals(active,OperationSocketTest.error(OperationSocketTest.invoke(c,id,fixture(id))).outcomeUncertain());
   }
  }
  for(int refresh:new int[]{0,1})try(var server=new SocketFixture(false);var c=new WebmaniaClient(server.config("api2/monitor-documents.openapi.json"),Credentials.monitor("synthetic-monitor"))) {
   var request=fixture("monitorGetDocument").deepCopy();((com.fasterxml.jackson.databind.node.ObjectNode)request).put("atualizar_status",refresh);server.reply=new SocketFixture.Reply(503,"application/json",bytes("{}"),Map.of(),0,0,null,false);assertEquals(refresh==1,OperationSocketTest.error(OperationSocketTest.invoke(c,"monitorGetDocument",request)).outcomeUncertain());
  }
 }
 @Test void provisionalResponsesAndChunkTrailersDoNotCauseRetries()throws Exception {
  try(var server=new SocketFixture(false);var c=monitor(server,Duration.ofSeconds(2),65536)) {
   String valid=OperationSocketTest.FIXTURES.get(READ).path("response").toString();server.reply=new SocketFixture.Reply(200,"application/json",bytes(valid),Map.of(),0,0,null,true);server.provisional=true;server.trailers=true;
   assertInstanceOf(ApiResult.class,OperationSocketTest.invoke(c,READ,fixture(READ)).get(3,TimeUnit.SECONDS));assertEquals(1,server.requests.size());
  }
 }
 @Test void correlationCannotEchoGenericSnapshotValuesOrPathCapability()throws Exception {
  String cap="abcdefab-cdef-4abc-8fab-cdefabcdefab";
  try(var server=new SocketFixture(false);var c=new WebmaniaClient(server.config("api1/files.openapi.json"),Credentials.anonymousFile())) {
   server.reply=new SocketFixture.Reply(503,"application/json",bytes("{}"),Map.of("X-Request-ID",cap.toUpperCase(java.util.Locale.ROOT)),0,0,null,false);var e=OperationSocketTest.error(OperationSocketTest.invoke(c,"fiscalDownloadReport",Json.parse("{\"uuid\":\""+cap+"\"}")));assertNull(e.correlation());
  }
  var source=Json.parse("{\"body\":{\"future_field\":\"generic-secret\"}}");var secrets=new Secrets(Credentials.monitor("synthetic-monitor"),source);assertNull(secrets.correlation("generic-secret"));
  var literal=new Secrets(Credentials.monitor(cap),Json.parse("{}"));assertEquals(cap.toUpperCase(java.util.Locale.ROOT),literal.correlation(cap.toUpperCase(java.util.Locale.ROOT)));
 }

 @Test void providerDiagnosticsRetainUsefulStructureWithoutSensitiveMaterial()throws Exception {
  try(var server=new SocketFixture(false);var c=new WebmaniaClient(server.config("api1/fiscal.openapi.json"),Credentials.company("synthetic-key","synthetic-secret","synthetic-access","synthetic-access-secret"))) {
   var input=fixture("nfeIssueDocument").deepCopy();((com.fasterxml.jackson.databind.node.ObjectNode)input.path("body")).putObject("extra_data").put("memo","generic-private-value");
   server.reply=SocketFixture.Reply.json("{\"error\":true,\"code\":\"VALIDATION_FAILED\",\"message\":\"Invalid input generic-private-value synthetic-secret https://example.invalid/?token=hidden\",\"errors\":{\"products\":[\"Must contain an item\"]}}");
   var e=OperationSocketTest.error(OperationSocketTest.invoke(c,"nfeIssueDocument",input));assertNotNull(e.details());assertEquals("VALIDATION_FAILED",e.details().getCode());assertTrue(e.details().getMessage().contains("Invalid input"));assertEquals(1,e.details().getViolations().size());assertEquals("Must contain an item",e.details().getViolations().get(0).message());
   String json=new ObjectMapper().writeValueAsString(e.details());assertFalse(json.contains("generic-private-value"));assertFalse(json.contains("synthetic-secret"));assertFalse(json.contains("example.invalid"));assertNull(e.getCause());
  }
 }

}
