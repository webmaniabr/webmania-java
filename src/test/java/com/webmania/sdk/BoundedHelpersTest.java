package com.webmania.sdk;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.webmania.sdk.model.api2monitorreads.MonitorListCompaniesRequest;
import com.webmania.sdk.model.api2monitorreads.MonitorListCompanyMunicipalitiesRequest;
import com.webmania.sdk.model.api2monitordocuments.MonitorListReportsRequest;
import com.webmania.sdk.model.api2monitordocuments.MonitorGetImportStatusRequest;
import com.webmania.sdk.model.api1fiscal.FiscalCreateOrPollReportRequest;
import com.webmania.sdk.model.api1fiscal.FiscalReportRequest;
import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.time.Duration;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BoundedHelpersTest {
 static final String U="00000000-0000-4000-8000-000000000001";
 static PaginationOptions pages(int maxPages,int maxItems){return new PaginationOptions(maxPages,maxItems,Duration.ofSeconds(5));}
 static JsonNode item(String operation,int number) {
  String uuid="00000000-0000-4000-8000-"+String.format("%012x",number);
  var item=(ObjectNode)Json.parse("{\"uuid\":\""+uuid+"\"}");
  if(operation.equals("monitorListCompanyMunicipalities"))item.put("tipo_download",1).put("municipio","Synthetic").put("uf","SP").put("codigo_ibge","3550308");
  if(operation.equals("monitorListReports"))item.put("relatorio","xml").put("modelo","nfe").put("status","concluido");
  return item;
 }
 static SocketFixture.Reply page(String operation,int current,int last,int count) {
  var body=(ObjectNode)Json.parse("{\"data\":[],\"meta\":{\"current_page\":"+current+",\"last_page\":"+last+",\"per_page\":10,\"total\":"+(last*count)+"}}");
  var data=(com.fasterxml.jackson.databind.node.ArrayNode)body.path("data");for(int n=0;n<count;n++)data.add(item(operation,current*10+n));
  return SocketFixture.Reply.json(body.toString());
 }
 static int queryPage(String target) {String query=java.net.URI.create("http://fixture"+target).getQuery();for(String part:query.split("&"))if(part.startsWith("page="))return Integer.parseInt(part.substring(5));throw new IllegalArgumentException();}
 static CompletableFuture<? extends PageCollection<?>> paginate(WebmaniaClient client,String operation,PaginationOptions options) {
  return switch(operation) {
   case "monitorListCompanies" -> client.pagination().companiesAsync(new MonitorListCompaniesRequest().setPage(BigInteger.ONE).setPerPage(BigInteger.TEN),options);
   case "monitorListReports" -> client.pagination().reportsAsync(new MonitorListReportsRequest().setStatus("processando").setPerPage(BigInteger.TEN),options);
   default -> client.pagination().companyMunicipalitiesAsync(new MonitorListCompanyMunicipalitiesRequest().setCompany(U).setPerPage(BigInteger.TEN),options);
  };
 }
 @Test void allThreePaginatorsFollowMetadataWithFrozenFiltersAndNoExtraFetch()throws Exception {
  for(String operation:new String[]{"monitorListCompanies","monitorListReports","monitorListCompanyMunicipalities"})try(var s=new SocketFixture(false);var c=new WebmaniaClient(s.config(Contract.operation(operation).path("module").asText()),Credentials.monitor("synthetic-monitor"))) {
   s.responder=r->page(operation,queryPage(r.target()),2,10);
   var result=paginate(c,operation,pages(4,20)).get(3,TimeUnit.SECONDS);assertEquals(PageCollection.Stop.COMPLETE,result.stop());assertEquals(20,result.items().size());assertEquals(2,result.pagesFetched());assertEquals(2,s.requests.size());assertEquals(1,queryPage(s.requests.get(0).target()));assertEquals(2,queryPage(s.requests.get(1).target()));assertNull(result.nextPage());for(var r:s.requests)assertEquals("Bearer synthetic-monitor",r.headers().get("authorization"));
  }
  try(var s=new SocketFixture(false);var c=new WebmaniaClient(s.config("api2/monitor-reads.openapi.json"),Credentials.monitor("synthetic-monitor"))) {
   s.responder=r->{var original=page("monitorListCompanies",queryPage(r.target()),2,50);var body=(ObjectNode)Json.parse(original.body());((ObjectNode)body.path("meta")).put("per_page",50);var p=SocketFixture.Reply.json(body.toString());return new SocketFixture.Reply(p.status(),p.media(),p.body(),p.headers(),0,50,null,false);};
   var input=new MonitorListCompaniesRequest().setPesquisa("original-filter");var future=c.pagination().companiesAsync(input,pages(3,100));input.setPesquisa("changed-filter");future.get(3,TimeUnit.SECONDS);assertEquals(2,s.requests.size());for(var r:s.requests){assertTrue(r.target().contains("pesquisa=original-filter"));assertFalse(r.target().contains("changed-filter"));}
  }
 }
 @Test void paginationLimitsContinuationProtocolErrorsAndCancellationAreExplicit()throws Exception {
  try(var s=new SocketFixture(false);var c=new WebmaniaClient(s.config("api2/monitor-reads.openapi.json"),Credentials.monitor("synthetic-monitor"))) {
   s.responder=r->page("monitorListCompanies",queryPage(r.target()),3,10);
   var limited=c.pagination().companies(new MonitorListCompaniesRequest().setPerPage(BigInteger.TEN),pages(1,100));assertEquals(PageCollection.Stop.PAGE_LIMIT,limited.stop());assertEquals(BigInteger.TWO,limited.nextPage());assertEquals(1,s.requests.size());
   var clipped=c.pagination().companies(new MonitorListCompaniesRequest().setPerPage(BigInteger.TEN),pages(5,1));assertEquals(PageCollection.Stop.ITEM_LIMIT,clipped.stop());assertEquals(BigInteger.ONE,clipped.nextPage());assertEquals(1,clipped.nextIndex());assertEquals(1,clipped.items().size());assertEquals(2,s.requests.size());
   s.responder=r->page("monitorListCompanies",99,100,1);assertEquals(ApiException.Kind.PROTOCOL,OperationSocketTest.error(c.pagination().companiesAsync(new MonitorListCompaniesRequest().setPerPage(BigInteger.TEN),pages(5,10))).kind());assertEquals(3,s.requests.size());
   s.responder=r->new SocketFixture.Reply(503,"application/json","{}".getBytes(StandardCharsets.UTF_8),Map.of(),0,0,null,false);assertEquals(ApiException.Kind.HTTP,OperationSocketTest.error(c.pagination().companiesAsync(new MonitorListCompaniesRequest().setPerPage(BigInteger.TEN),pages(5,10))).kind());assertEquals(4,s.requests.size());
   s.responder=r->new SocketFixture.Reply(200,"application/json",page("monitorListCompanies",1,2,1).body(),Map.of(),0,1000,null,false);
   assertEquals(ApiException.Kind.TIMEOUT,OperationSocketTest.error(c.pagination().companiesAsync(new MonitorListCompaniesRequest().setPerPage(BigInteger.TEN),new PaginationOptions(3,30,Duration.ofMillis(100)))).kind());
   int before=s.requests.size();var future=c.pagination().companiesAsync(new MonitorListCompaniesRequest().setPerPage(BigInteger.TEN),pages(3,30));long end=System.nanoTime()+TimeUnit.SECONDS.toNanos(2);while(s.requests.size()==before && System.nanoTime()<end)Thread.sleep(5);assertTrue(future.cancel(true));assertTrue(future.isCancelled());
  }
 }
 static PollingOptions polling(int attempts,Duration deadline){return new PollingOptions(attempts,deadline,Duration.ofSeconds(5));}
 static SocketFixture.Reply importState(String state) {return SocketFixture.Reply.json("{\"uuid\":\""+U+"\",\"status\":\""+state+"\",\"processado\":0,\"importados\":[],\"descartados\":[]}");}
 static SocketFixture.Reply reportState(String state) {return SocketFixture.Reply.json("{\"uuid\":\""+U+"\",\"status\":\""+state+"\",\"url\":\"https://example.invalid/relatorio/"+U+"?token=report-capability\"}");}
 static FiscalCreateOrPollReportRequest reportRequest(){return new FiscalCreateOrPollReportRequest().setBody(new FiscalReportRequest().setModelo("nfe").setRelatorio("danfe").setNumeroInicio("1").setNumeroFinal("5"));}
 @Test void bothWaitersUseAtLeastFiveSecondsAndReuseTheExactFrozenRequest()throws Exception {
  try(var imports=new SocketFixture(false);var reports=new SocketFixture(false);var monitor=new WebmaniaClient(imports.config("api2/monitor-documents.openapi.json"),Credentials.monitor("synthetic-monitor"));var company=new WebmaniaClient(reports.config("api1/fiscal.openapi.json"),Credentials.company("synthetic-key","synthetic-secret","synthetic-access","synthetic-access-secret"))) {
   var i=new java.util.concurrent.atomic.AtomicInteger();var r=new java.util.concurrent.atomic.AtomicInteger();imports.responder=q->importState(i.incrementAndGet()==1?"processando":"concluido");reports.responder=q->reportState(r.incrementAndGet()==1?"processando":"concluido");
   var importRequest=new MonitorGetImportStatusRequest().setUuid(U);var report=reportRequest();
   var importWait=monitor.processing().monitorImportAsync(importRequest,polling(3,Duration.ofSeconds(12)));var reportWait=company.processing().fiscalReportAsync(report,polling(3,Duration.ofSeconds(12)));importRequest.setUuid("00000000-0000-4000-8000-000000000099");report.setBody(report.getBody().setNumeroFinal("9"));
   var doneImport=importWait.get(12,TimeUnit.SECONDS);var doneReport=reportWait.get(12,TimeUnit.SECONDS);assertTrue(doneImport.completed());assertTrue(doneReport.completed());assertEquals(2,doneImport.attempts());assertEquals(2,doneReport.attempts());assertEquals(imports.requests.get(0).target(),imports.requests.get(1).target());assertArrayEquals(reports.requests.get(0).body(),reports.requests.get(1).body());assertTrue(imports.receivedNanos.get(1)-imports.receivedNanos.get(0)>=TimeUnit.SECONDS.toNanos(5));assertTrue(reports.receivedNanos.get(1)-reports.receivedNanos.get(0)>=TimeUnit.SECONDS.toNanos(5));
   assertFalse(doneReport.toString().contains("report-capability"));assertFalse(new ObjectMapper().writeValueAsString(doneReport).contains("report-capability"));assertEquals("5",Json.parse(reports.requests.get(1).body()).path("numero_final").asText());assertEquals(2,reports.requests.size());
  }
 }
 @SuppressWarnings("try") // Explicit close is the lifecycle behavior under test.
 @Test void waitersHaveAttemptDeadlineUnknownStateAndCancellationBounds()throws Exception {
  assertThrows(IllegalArgumentException.class,()->new PollingOptions(3,Duration.ofSeconds(20),Duration.ofMillis(1)));
  try(var s=new SocketFixture(false);var c=new WebmaniaClient(s.config("api2/monitor-documents.openapi.json"),Credentials.monitor("synthetic-monitor"))) {
   s.reply=importState("processando");var req=new MonitorGetImportStatusRequest().setUuid(U);assertEquals(WaitResult.Stop.ATTEMPT_LIMIT,c.processing().monitorImport(req,polling(1,Duration.ofSeconds(2))).stop());
   assertEquals(WaitResult.Stop.DEADLINE,c.processing().monitorImport(req,polling(3,Duration.ofMillis(100))).stop());assertEquals(2,s.requests.size());
   s.reply=importState("future-state");assertEquals(WaitResult.Stop.UNKNOWN_STATE,c.processing().monitorImport(req,polling(3,Duration.ofSeconds(2))).stop());assertEquals(3,s.requests.size());
   s.reply=importState("invalido");assertEquals(WaitResult.Stop.INVALID_STATE,c.processing().monitorImport(req,polling(3,Duration.ofSeconds(2))).stop());
   s.reply=importState("processando");var pending=c.processing().monitorImportAsync(req,polling(3,Duration.ofSeconds(10)));long end=System.nanoTime()+TimeUnit.SECONDS.toNanos(2);while(s.requests.size()<5 && System.nanoTime()<end)Thread.sleep(5);assertTrue(pending.cancel(true));int count=s.requests.size();Thread.sleep(150);assertEquals(count,s.requests.size());
   var closing=c.processing().monitorImportAsync(req,polling(3,Duration.ofSeconds(10)));c.close();assertEquals(ApiException.Kind.CLOSED,OperationSocketTest.error(closing).kind());
  }
 }
 @Test void fixedPageSizeCollectsSeventyFiveDistinctItemsWithAnExactContinuation()throws Exception {
  try(var s=new SocketFixture(false);var c=new WebmaniaClient(s.config("api2/monitor-reads.openapi.json"),Credentials.monitor("synthetic-monitor"))) {
   s.responder=request->{
    int current=queryPage(request.target());int size=java.util.Arrays.stream(java.net.URI.create("http://fixture"+request.target()).getQuery().split("&")).filter(q->q.startsWith("per_page=")).mapToInt(q->Integer.parseInt(q.substring(9))).findFirst().orElseThrow();
    int offset=(current-1)*size;var body=(ObjectNode)Json.parse("{\"data\":[],\"meta\":{\"current_page\":"+current+",\"last_page\":"+((120+size-1)/size)+",\"per_page\":"+size+",\"total\":120}}");
    var data=(com.fasterxml.jackson.databind.node.ArrayNode)body.path("data");for(int index=offset;index<Math.min(120,offset+size);index++)data.add(item("monitorListCompanies",index+1));return SocketFixture.Reply.json(body.toString());
   };
   var result=c.pagination().companies(new MonitorListCompaniesRequest().setPerPage(BigInteger.valueOf(50)),pages(5,75));assertEquals(75,result.items().size());var ids=result.items().stream().map(x->x.getUuid()).toList();assertEquals(75,new java.util.HashSet<>(ids).size());for(int index=0;index<75;index++)assertEquals(item("monitorListCompanies",index+1).path("uuid").asText(),ids.get(index));assertEquals(2,s.requests.size());assertTrue(s.requests.get(0).target().contains("per_page=50"));assertTrue(s.requests.get(1).target().contains("per_page=50"));assertEquals(PageCollection.Stop.ITEM_LIMIT,result.stop());assertEquals(BigInteger.TWO,result.nextPage());assertEquals(25,result.nextIndex());
  }
 }
 @Test void reportWaitKeepsCapabilitiesAcrossPollsWithoutChangingImportUuidSemantics()throws Exception {
  String cap="abcdefab-cdef-4abc-8fab-cdefabcdefab";String upper=cap.toUpperCase(java.util.Locale.ROOT);String mixed="aBcDeFaB-CdEf-4aBc-8FaB-CdEfAbCdEfAb";String compact="abcdefabcdefabcdefabcdefabcdefab";
  try(var reportServer=new SocketFixture(false);var importServer=new SocketFixture(false);var company=new WebmaniaClient(reportServer.config("api1/fiscal.openapi.json"),Credentials.company("synthetic-key","synthetic-secret","synthetic-access","synthetic-access-secret"));var monitor=new WebmaniaClient(importServer.config("api2/monitor-documents.openapi.json"),Credentials.monitor("synthetic-monitor"))) {
   var reportCalls=new java.util.concurrent.atomic.AtomicInteger();var importCalls=new java.util.concurrent.atomic.AtomicInteger();
   reportServer.responder=request->reportCalls.incrementAndGet()==1?SocketFixture.Reply.json("{\"uuid\":\""+cap+"\",\"status\":\"processando\",\"url\":\"/relatorio/"+compact+"?token=workflow-private-token\"}"):new SocketFixture.Reply(503,"application/json",("{\"code\":\"PROCESSING_FAILED\",\"message\":\"Report "+cap+" "+upper+" "+mixed+" "+compact.toUpperCase(java.util.Locale.ROOT)+" workflow-private-token failed\"}").getBytes(StandardCharsets.UTF_8),Map.of("X-Request-ID",mixed),0,0,null,false);
   importServer.responder=request->importCalls.incrementAndGet()==1?SocketFixture.Reply.json("{\"uuid\":\""+cap+"\",\"status\":\"processando\",\"processado\":0,\"importados\":[],\"descartados\":[]}"):new SocketFixture.Reply(503,"application/json",("{\"message\":\"Import "+upper+" failed\"}").getBytes(StandardCharsets.UTF_8),Map.of("X-Request-ID",upper),0,0,null,false);
   var reportFuture=company.processing().fiscalReportAsync(reportRequest(),polling(3,Duration.ofSeconds(12)));var importFuture=monitor.processing().monitorImportAsync(new MonitorGetImportStatusRequest().setUuid(cap),polling(3,Duration.ofSeconds(12)));
   var reportFailure=assertThrows(java.util.concurrent.ExecutionException.class,()->reportFuture.get(12,TimeUnit.SECONDS));var reportError=(ApiException)reportFailure.getCause();assertNotNull(reportError.details());String message=reportError.details().getMessage();assertTrue(message.contains("failed"));for(String value:new String[]{cap,upper,mixed,compact.toUpperCase(java.util.Locale.ROOT),"workflow-private-token"})assertFalse(message.contains(value),value);assertNull(reportError.correlation());assertArrayEquals(reportServer.requests.get(0).body(),reportServer.requests.get(1).body());assertEquals(2,reportServer.requests.size());
   var importFailure=assertThrows(java.util.concurrent.ExecutionException.class,()->importFuture.get(12,TimeUnit.SECONDS));var importError=(ApiException)importFailure.getCause();assertTrue(importError.details().getMessage().contains(upper));assertEquals(upper,importError.correlation());assertEquals(2,importServer.requests.size());
   // A separate direct call has no report-workflow context, even on the same client instance.
   var independent=OperationSocketTest.error(company.fiscalCreateOrPollReportAsync(reportRequest()));assertTrue(independent.details().getMessage().contains(upper));assertEquals(mixed,independent.correlation());
  }
 }

}
