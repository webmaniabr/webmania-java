package com.webmania.sdk;

import com.fasterxml.jackson.databind.JsonNode;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.nio.charset.StandardCharsets;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

class OperationSocketTest {
 static final Map<String,JsonNode> FIXTURES=new java.util.HashMap<>();
 static {try(var in=OperationSocketTest.class.getResourceAsStream("/operation-fixtures.json")){if(in==null)throw new java.io.IOException();for(JsonNode f:Json.parse(in.readAllBytes()))FIXTURES.put(f.path("id").asText(),f);}catch(java.io.IOException e){throw new ExceptionInInitializerError();}}
 static Credentials credentials(JsonNode op,String mode) {
  String scope=op.path("security").toString();
  if(mode.equals("token"))return Credentials.documentToken("synthetic-document+token/=");
  if(mode.equals("anonymous") || op.path("security").isEmpty())return Credentials.anonymousFile();
  if(scope.contains("Reseller"))return Credentials.reseller("synthetic-key","synthetic-secret","synthetic-access","synthetic-access-secret");
  if(scope.contains("ConsumerKey"))return Credentials.company("synthetic-key","synthetic-secret","synthetic-access","synthetic-access-secret");
  if(scope.contains("MonitorBearer"))return Credentials.monitor("synthetic-monitor");
  if(scope.contains("FiscalFileCompanyBearer"))return Credentials.fileCompany("synthetic-files");
  return Credentials.issuer("synthetic-issuer");
 }
 static JsonModel input(String id,JsonNode value)throws Exception {JsonNode op=Contract.operation(id);return (JsonModel)Class.forName("com.webmania.sdk."+op.path("package").asText()+"."+op.path("request").asText()).getConstructor(JsonNode.class).newInstance(value);}
 static CompletableFuture<?> invoke(WebmaniaClient client,String id,JsonNode value)throws Exception {JsonModel input=input(id,value);return (CompletableFuture<?>)client.getClass().getMethod(id+"Async",input.getClass()).invoke(client,input);}
 static ApiException error(CompletableFuture<?> future)throws Exception {try{future.get(5,java.util.concurrent.TimeUnit.SECONDS);fail("Expected failure");return null;}catch(java.util.concurrent.ExecutionException e){assertInstanceOf(ApiException.class,e.getCause());return (ApiException)e.getCause();}}
 @Test void everyOperationOverHttp()throws Exception {matrix(false);}
 @Test void everyOperationOverTls()throws Exception {matrix(true);}
 private void matrix(boolean tls)throws Exception {
  try(var server=new SocketFixture(tls)) {
   for(String id:Contract.operationIds().stream().sorted().toList()) {
    JsonNode op=Contract.operation(id);JsonNode schema=Contract.operationSchema(op);JsonNode fixture=FIXTURES.get(id);assertNotNull(fixture,id);
    String security=op.path("security").toString();var modes=new java.util.ArrayList<String>();modes.add("default");
    if(security.contains("DocumentToken") || security.contains("FiscalDocumentLinkToken"))modes.add("token");
    if(op.path("binary").asBoolean() && (schema.path("x-auth-origin-policy").has("unauthenticated") || security.contains("{}")))modes.add("anonymous");
    for(String mode:modes) {
     int before=server.requests.size();
     if(op.path("binary").asBoolean()) {
      JsonNode content=schema.path("responses").path("200").path("content");String media=content.properties().stream().map(Map.Entry::getKey).filter(x->!x.equals("application/json")).findFirst().orElse("application/pdf");
      byte[] body=FileFixtures.valid(media);server.reply=SocketFixture.Reply.bytes(media,body);
     } else {
      int success=schema.path("responses").properties().stream().map(Map.Entry::getKey).filter(x->x.matches("2[0-9]{2}")).mapToInt(Integer::parseInt).min().orElse(200);
      server.reply=new SocketFixture.Reply(success,"application/json",fixture.path("response").toString().getBytes(StandardCharsets.UTF_8),Map.of(),0,0,null,false);
     }
     try(var client=new WebmaniaClient(server.config(op.path("module").asText()),credentials(op,mode))) {
      var call=invoke(client,id,fixture.path("input"));
      if(!op.path("enabled").asBoolean()){assertEquals(ApiException.Kind.CAPABILITY_DISABLED,error(call).kind(),id);assertEquals(before,server.requests.size());continue;}
      Object result;
      try{result=call.get(10,java.util.concurrent.TimeUnit.SECONDS);}catch(Exception e){throw new AssertionError(id+" "+mode,e);}
      assertInstanceOf(ApiResult.class,result,id);assertEquals(before+1,server.requests.size(),id);
      var request=server.requests.get(before);assertEquals(op.path("method").asText(),request.method(),id);
      String route=op.path("path").asText();for(JsonNode p:schema.path("parameters"))if(p.path("in").asText().equals("path"))route=route.replace("{"+p.path("name").asText()+"}",fixture.path("input").path(p.path("name").asText()).asText());
      assertEquals(route,request.target().split("\\?",2)[0],id);
      if(fixture.path("input").has("body"))assertArrayEquals(Json.bytes(fixture.path("input").path("body")),request.body(),id);
      else assertEquals(0,request.body().length,id);
      Credentials used=credentials(op,mode);for(var h:used.headers.entrySet())assertEquals(h.getValue(),request.headers().get(h.getKey().toLowerCase(java.util.Locale.ROOT)),id);
      assertEquals(used.headers.containsKey("Authorization"),request.headers().containsKey("authorization"),id);
      assertEquals(used.headers.containsKey("X-Consumer-Key"),request.headers().containsKey("x-consumer-key"),id);
      assertEquals(mode.equals("token"),request.target().contains("token=synthetic-document%2Btoken%2F%3D"),id);
      if(op.path("binary").asBoolean())assertArrayEquals(server.reply.body(),((Download)((ApiResult<?>)result).data()).bytes(),id);
      server.reply=SocketFixture.Reply.json("{\"error\":false}");
      assertEquals(ApiException.Kind.API,error(invoke(client,id,fixture.path("input"))).kind(),id);
      var invalid=fixture.path("input").deepCopy();((com.fasterxml.jackson.databind.node.ObjectNode)invalid).put("_unexpected_wrapper_field",true);
      int beforeInvalid=server.requests.size();
      assertEquals(ApiException.Kind.VALIDATION,error(invoke(client,id,invalid)).kind(),id);
      assertEquals(beforeInvalid,server.requests.size(),id);
     }
    }
   }
   System.out.println("Controlled "+(tls?"TLS":"HTTP")+" operation exchanges: "+server.requests.size());
  }
 }
}
