package com.webmania.sdk;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.nio.charset.StandardCharsets;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ReviewBRegressionTest {
 @Test void everyOperationUsesACompleteDistinctParameterSurface()throws Exception {
  for(String id:Contract.operationIds()) {
   var metadata=Contract.operation(id);var op=Contract.operationSchema(metadata);var expected=new java.util.HashSet<String>();
   for(var p:op.path("parameters"))expected.add(p.path("name").asText());if(op.has("requestBody"))expected.add("body");
   Class<?> type=Class.forName("com.webmania.sdk."+metadata.path("package").asText()+"."+metadata.path("request").asText());
   assertNotNull(type.getConstructor().newInstance());var fields=type.getDeclaredField("FIELDS");fields.setAccessible(true);assertEquals(expected,fields.get(null),id);
   for(String name:expected) {
    String suffix=java.util.Arrays.stream(name.split("[^A-Za-z0-9]+")).filter(x->!x.isEmpty()).map(x->Character.toUpperCase(x.charAt(0))+x.substring(1)).collect(java.util.stream.Collectors.joining());
    var getter=type.getMethod("get"+suffix);assertNotNull(type.getMethod("set"+suffix,getter.getReturnType()),id+" "+name);
   }
  }
  assertEquals("MonitorCreateCompanyParameters",Contract.operation("monitorCreateCompany").path("request").asText());assertEquals("MonitorUpdateCompanyParameters",Contract.operation("monitorUpdateCompany").path("request").asText());
 }
 @Test void synchronousInterruptionRetainsTheSentCallContext()throws Exception {
  for(String id:new String[]{"nfeIssueDocument","nfeGetSefazStatus"})try(var s=new SocketFixture(false);var c=new WebmaniaClient(s.config("api1/fiscal.openapi.json"),Credentials.company("synthetic-key","synthetic-secret","synthetic-access","synthetic-access-secret"))) {
   var received=new CountDownLatch(1);s.responder=r->{received.countDown();return new SocketFixture.Reply(200,"application/json","{}".getBytes(StandardCharsets.UTF_8),Map.of(),2000,0,null,false);};
   JsonNode input=OperationSocketTest.FIXTURES.get(id).path("input").deepCopy();if(id.equals("nfeIssueDocument"))((com.fasterxml.jackson.databind.node.ObjectNode)input.path("body")).put("ID","B-INT-001");
   JsonModel request=OperationSocketTest.input(id,input);AtomicReference<Throwable> result=new AtomicReference<>();var interrupted=new java.util.concurrent.atomic.AtomicBoolean();
   Thread caller=new Thread(()->{try{c.getClass().getMethod(id,request.getClass()).invoke(c,request);}catch(java.lang.reflect.InvocationTargetException e){result.set(e.getCause());}catch(Exception e){result.set(e);}finally{interrupted.set(Thread.currentThread().isInterrupted());}});
   caller.start();assertTrue(received.await(3,TimeUnit.SECONDS));caller.interrupt();caller.join(1500);assertFalse(caller.isAlive());assertInstanceOf(ApiException.class,result.get());var error=(ApiException)result.get();assertEquals(ApiException.Kind.CANCELLED,error.kind());assertEquals(id,error.operation());assertEquals(id.equals("nfeIssueDocument"),error.outcomeUncertain());assertTrue(interrupted.get());if(id.equals("nfeIssueDocument"))assertEquals("B-INT-001",error.reference().value());assertEquals(1,s.requests.size());
  }
 }
 @Test void redirectsPreserveUncertaintyAndAllowOnlyDeliberateDestinationAccess()throws Exception {
  try(var source=new SocketFixture(false);var target=new SocketFixture(false)) {
   String destination=target.origin()+"/darps/abcdefab-cdef-4abc-8fab-cdefabcdefab?token=redirect-sensitive";
   source.reply=new SocketFixture.Reply(302,"text/html",new byte[0],Map.of("Location",destination,"X-Request-ID","ABCDEFAB-CDEF-4ABC-8FAB-CDEFABCDEFAB"),0,0,null,false);
   try(var c=new WebmaniaClient(source.config("api1/fiscal.openapi.json"),Credentials.company("synthetic-key","synthetic-secret","synthetic-access","synthetic-access-secret"))) {
    var input=OperationSocketTest.FIXTURES.get("nfeIssueDocument").path("input").deepCopy();((com.fasterxml.jackson.databind.node.ObjectNode)input.path("body")).put("ID","B-REDIR-001");
    var e=OperationSocketTest.error(OperationSocketTest.invoke(c,"nfeIssueDocument",input));assertEquals(ApiException.Kind.REDIRECT,e.kind());assertTrue(e.outcomeUncertain());assertEquals("B-REDIR-001",e.reference().value());assertEquals(destination,e.redirect().value());assertNull(e.correlation());assertFalse(e.toString().contains("redirect-sensitive"));assertFalse(new ObjectMapper().writeValueAsString(e.redirect()).contains("redirect-sensitive"));
    assertFalse(OperationSocketTest.error(OperationSocketTest.invoke(c,"nfeGetSefazStatus",OperationSocketTest.FIXTURES.get("nfeGetSefazStatus").path("input"))).outcomeUncertain());
   }
   try(var c=new WebmaniaClient(source.config("api2/emitter-files.openapi.json"),Credentials.fileCompany("synthetic-files"))) {
    var r=(ApiResult<?>)OperationSocketTest.invoke(c,"fileGetNfsePdf",OperationSocketTest.FIXTURES.get("fileGetNfsePdf").path("input")).get(3,TimeUnit.SECONDS);assertEquals(302,r.status());assertNull(r.correlation());assertTrue(r.outcomeUncertain());var d=(Download)r.data();assertTrue(d.isRedirect());assertEquals(destination,d.redirectTarget().value());assertEquals(0,d.bytes().length);assertFalse(d.toString().contains("redirect-sensitive"));assertFalse(new ObjectMapper().writeValueAsString(d).contains("redirect-sensitive"));assertFalse(new ObjectMapper().writeValueAsString(r).contains("redirect-sensitive"));assertFalse(new ObjectMapper().writeValueAsString(d.redirectTarget()).contains("redirect-sensitive"));
   }
   assertEquals(0,target.requests.size());assertEquals(3,source.requests.size());
  }
 }
}
