package com.webmania.sdk;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.webmania.sdk.model.api2monitorreads.MonitorListCompaniesRequest;
import com.webmania.sdk.model.api2monitorreads.MonitorListCompanyMunicipalitiesRequest;
import com.webmania.sdk.model.api2monitordocuments.MonitorListReportsRequest;
import java.math.BigInteger;
import java.time.Duration;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;
import java.util.function.Consumer;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PaginationMetadataTest {
 static final String[] OPERATIONS={"monitorListCompanies","monitorListReports","monitorListCompanyMunicipalities"};
 static CompletableFuture<? extends PageCollection<?>> start(WebmaniaClient client,String operation,int limit) {
  var options=new PaginationOptions(10,limit,Duration.ofSeconds(5));
  return switch(operation) {
   case "monitorListCompanies" -> client.pagination().companiesAsync(new MonitorListCompaniesRequest().setPerPage(BigInteger.valueOf(40)),options);
   case "monitorListReports" -> client.pagination().reportsAsync(new MonitorListReportsRequest().setPerPage(BigInteger.valueOf(40)),options);
   default -> client.pagination().companyMunicipalitiesAsync(new MonitorListCompanyMunicipalitiesRequest().setCompany(BoundedHelpersTest.U).setPerPage(BigInteger.valueOf(40)),options);
  };
 }
 static ObjectNode response(String operation,int current,int size,int count,int last,int total) {
  var body=(ObjectNode)Json.parse("{\"data\":[],\"meta\":{\"current_page\":"+current+",\"last_page\":"+last+",\"per_page\":"+size+",\"total\":"+total+"}}");
  var data=(com.fasterxml.jackson.databind.node.ArrayNode)body.path("data");for(int n=0;n<count;n++)data.add(BoundedHelpersTest.item(operation,(current-1)*size+n+1));return body;
 }
 @Test void allThreeRoutesRejectIncompatibleAndInvalidMetadataBeforeAnyNextFetch()throws Exception {
  List<Consumer<ObjectNode>> invalid=List.of(
   b->((ObjectNode)b.path("meta")).put("per_page",20),
   b->((ObjectNode)b.path("meta")).put("per_page",41),
   b->((ObjectNode)b.path("meta")).remove("per_page"),
   b->((ObjectNode)b.path("meta")).putNull("per_page"),
   b->((ObjectNode)b.path("meta")).put("per_page","40"),
   b->((ObjectNode)b.path("meta")).put("per_page",false),
   b->((ObjectNode)b.path("meta")).set("per_page",Json.parse("{}")),
   b->((ObjectNode)b.path("meta")).set("per_page",Json.parse("40.0000000000000000000000000000000001")),
   b->((ObjectNode)b.path("meta")).put("per_page",0),
   b->b.remove("meta"),b->b.putNull("meta"),b->b.put("meta","invalid")
  );
  for(String operation:OPERATIONS)try(var server=new SocketFixture(false);var client=new WebmaniaClient(server.config(Contract.operation(operation).path("module").asText()),Credentials.monitor("synthetic-monitor"))) {
   for(var mutation:invalid) {
    ObjectNode body=response(operation,1,40,40,3,120);mutation.accept(body);server.reply=SocketFixture.Reply.json(body.toString());int before=server.requests.size();
    var error=OperationSocketTest.error(start(client,operation,500));assertEquals(ApiException.Kind.PROTOCOL,error.kind(),operation);assertEquals(operation,error.operation());assertFalse(error.outcomeUncertain());assertEquals(before+1,server.requests.size());
   }
   // Exact reviewer reproduction: page1 is silently clipped to20, with meta20 instead of the requested40.
   server.reply=SocketFixture.Reply.json(response(operation,1,20,20,6,120).toString());int before=server.requests.size();assertEquals(ApiException.Kind.PROTOCOL,OperationSocketTest.error(start(client,operation,500)).kind());assertEquals(before+1,server.requests.size());
   // Even matching metadata cannot justify skipping a short non-final batch or an oversized batch.
   for(int count:new int[]{20,41}){server.reply=SocketFixture.Reply.json(response(operation,1,40,count,3,120).toString());before=server.requests.size();assertEquals(ApiException.Kind.PROTOCOL,OperationSocketTest.error(start(client,operation,500)).kind());assertEquals(before+1,server.requests.size());}
  }
 }
 @Test void coherentFortyBySixtyFiveAndExactDecimalMetadataWorkForAllThreeRoutes()throws Exception {
  for(String operation:OPERATIONS)for(boolean decimal:new boolean[]{false,true})try(var server=new SocketFixture(false);var client=new WebmaniaClient(server.config(Contract.operation(operation).path("module").asText()),Credentials.monitor("synthetic-monitor"))) {
   server.responder=request->{int current=BoundedHelpersTest.queryPage(request.target());String body=response(operation,current,40,40,3,120).toString();if(decimal)body=body.replace("\"per_page\":40","\"per_page\":40.0000000000000000000000000000000000");return SocketFixture.Reply.json(body);};
   var result=start(client,operation,65).get(3,TimeUnit.SECONDS);assertEquals(65,result.items().size());var ids=result.items().stream().map(x->((JsonValue)x).toJson().path("uuid").asText()).toList();assertEquals(65,new java.util.HashSet<>(ids).size());for(int i=0;i<65;i++)assertEquals(BoundedHelpersTest.item(operation,i+1).path("uuid").asText(),ids.get(i));assertEquals(PageCollection.Stop.ITEM_LIMIT,result.stop());assertEquals(BigInteger.TWO,result.nextPage());assertEquals(25,result.nextIndex());assertEquals(2,server.requests.size());for(var request:server.requests)assertTrue(request.target().contains("per_page=40"));
   server.responder=null;server.reply=SocketFixture.Reply.json(response(operation,1,40,20,1,20).toString());var finalShort=start(client,operation,65).get(3,TimeUnit.SECONDS);assertEquals(PageCollection.Stop.COMPLETE,finalShort.stop());assertEquals(20,finalShort.items().size());assertEquals(3,server.requests.size());
  }
 }
}
