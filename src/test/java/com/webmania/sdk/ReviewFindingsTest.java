package com.webmania.sdk;

import java.nio.charset.StandardCharsets;
import java.util.Map;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/** Per-reference tax class results, credential argument checks and the in-process bounded resolver. */
class ReviewFindingsTest {
 @Test void deleteTaxClassesKeepsPerReferenceResults()throws Exception{
  var op=Contract.operation("nfeDeleteTaxClasses");var input=OperationSocketTest.FIXTURES.get("nfeDeleteTaxClasses").path("input");
  try(var peer=new SocketFixture(false);var client=new WebmaniaClient(peer.config(op.path("module").asText()),Credentials.company("k","s","t","ts"))){
   var schema=Contract.operationSchema(op).path("responses").path("200");
   assertFalse(schema.isMissingNode());
   peer.reply=new SocketFixture.Reply(200,"application/json","[{\"referencia\":\"1\",\"msg\":\"removed\"},{\"referencia\":\"2\",\"error\":\"not found\"}]".getBytes(StandardCharsets.UTF_8),Map.of(),0,0,null,false);
   var result=(ApiResult<?>)OperationSocketTest.invoke(client,"nfeDeleteTaxClasses",input).get(5,java.util.concurrent.TimeUnit.SECONDS);
   var items=((JsonValue)result.data()).toJson();assertEquals(2,items.size(),"an item error must not reject every reference");assertEquals("not found",items.get(1).path("error").asText());
   peer.reply=SocketFixture.Reply.json("{\"error\":\"root failure\"}");
   assertEquals(ApiException.Kind.API,OperationSocketTest.error(OperationSocketTest.invoke(client,"nfeDeleteTaxClasses",input)).kind());
  }
 }
 @Test void companyCredentialPartsRejectNullAsInvalidArgument(){
  for(String[] parts:new String[][]{{null,"s","t","ts"},{"k",null,"t","ts"},{"k","s",null,"ts"},{"k","s","t",null}}) {
   var e=assertThrows(IllegalArgumentException.class,()->Credentials.company(parts[0],parts[1],parts[2],parts[3]));assertEquals("Invalid credential value",e.getMessage());
   assertThrows(IllegalArgumentException.class,()->Credentials.reseller(parts[0],parts[1],parts[2],parts[3]));
  }
 }
 @Test void inProcessResolverHonorsCancellationAndRefusesInvalidNames()throws Exception{
  var control=new Wire.Control(new java.util.concurrent.atomic.AtomicReference<>());
  assertThrows(java.io.IOException.class,()->Wire.resolveInProcess("bad host",System.nanoTime()+1_000_000_000L,control));
  control.stop();
  long start=System.nanoTime();
  assertThrows(java.io.IOException.class,()->Wire.resolveInProcess("example.invalid",System.nanoTime()+5_000_000_000L,control));
  assertTrue(System.nanoTime()-start<2_000_000_000L,"a stopped call returns without waiting for DNS");
  var fresh=new Wire.Control(new java.util.concurrent.atomic.AtomicReference<>());
  assertThrows(java.io.IOException.class,()->Wire.resolveInProcess("example.invalid",System.nanoTime()+3_000_000_000L,fresh),"unresolvable or timed out, never an address");
 }
 @Test void inProcessResolverBoundsConcurrentLookups()throws Exception{
  var control=new Wire.Control(new java.util.concurrent.atomic.AtomicReference<>());
  assertTrue(slotsReturn(16),"lookups abandoned by earlier calls give their slots back once they end");
  int taken=Wire.RESOLVER_SLOTS.drainPermits();
  try {
   long start=System.nanoTime();
   assertThrows(java.io.IOException.class,()->Wire.resolveInProcess("localhost",System.nanoTime()+5_000_000_000L,control),"every slot taken: no new resolver thread");
   assertTrue(System.nanoTime()-start<1_000_000_000L,"refused at once, without waiting for the deadline");
   assertEquals(0,Wire.RESOLVER_SLOTS.availablePermits(),"a refused lookup takes no slot");
  } finally {Wire.RESOLVER_SLOTS.release(taken);}
  assertNotNull(Wire.resolveInProcess("localhost",System.nanoTime()+5_000_000_000L,control));
  assertTrue(slotsReturn(16),"a finished lookup gives its slot back");
 }
 private static boolean slotsReturn(int expected)throws InterruptedException{
  long end=System.nanoTime()+15_000_000_000L;
  while(Wire.RESOLVER_SLOTS.availablePermits()!=expected && System.nanoTime()<end)Thread.sleep(20);
  return Wire.RESOLVER_SLOTS.availablePermits()==expected;
 }
}
