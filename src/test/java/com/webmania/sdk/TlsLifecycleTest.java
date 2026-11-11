package com.webmania.sdk;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.net.Socket;
import java.time.Duration;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import javax.net.ssl.SSLSocket;

/** Bounds deliberately retain the reported 1500 ms cancellation threshold. */
@SuppressWarnings("try")
class TlsLifecycleTest {
 private static final String MUTATION="nfeIssueDocument",READ="monitorListCompanies";
 private static final long BOUND=1500;
 private static com.fasterxml.jackson.databind.JsonNode input(String id) {
  var value=OperationSocketTest.FIXTURES.get(id).path("input").deepCopy();if(id.equals(MUTATION))((com.fasterxml.jackson.databind.node.ObjectNode)value.path("body")).put("ID","tls-order");return value;
 }
 private static byte[] response(String id){return Json.bytes(OperationSocketTest.FIXTURES.get(id).path("response"));}
 private static WebmaniaClient client(TlsLifecycleFixture peer,String id,Duration deadline){var op=Contract.operation(id);return new WebmaniaClient(ClientConfig.builder().origin(op.path("module").asText(),peer.origin()).sslContext(SocketFixture.trust).deadline(deadline).build(),OperationSocketTest.credentials(op,"default"));}
 private static CompletableFuture<?> invoke(WebmaniaClient client,String id)throws Exception{return OperationSocketTest.invoke(client,id,input(id));}
 private static void ready(TlsLifecycleFixture peer)throws Exception {assertTrue(peer.reached.await(3,TimeUnit.SECONDS),"Peer phase gate "+peer.phase);}
 @SuppressWarnings("unchecked")
 private static AtomicReference<Socket> handle(CompletableFuture<?> future)throws Exception {var field=future.getClass().getDeclaredField("socket");field.setAccessible(true);return (AtomicReference<Socket>)field.get(future);}
 private static void blocked(TlsLifecycleFixture.Phase phase)throws Exception {
  String method=phase==TlsLifecycleFixture.Phase.HANDSHAKE?"startHandshake":phase==TlsLifecycleFixture.Phase.HEADERS?"readLine":"copy";long end=System.nanoTime()+TimeUnit.SECONDS.toNanos(3);
  while(System.nanoTime()<end){for(var row:Thread.getAllStackTraces().entrySet())if(row.getKey().getName().equals("webmania-http") && java.util.Arrays.stream(row.getValue()).anyMatch(f->f.getClassName().equals(Wire.class.getName())) && java.util.Arrays.stream(row.getValue()).anyMatch(f->f.getMethodName().equals(method)))return;Thread.sleep(2);}fail("Client did not enter actual TLS phase "+phase);
 }
 private static long bounded(Thread thread,TlsLifecycleFixture peer)throws Exception {
  long start=System.nanoTime();thread.start();thread.join(BOUND);boolean late=thread.isAlive();if(late){for(var frame:thread.getStackTrace())System.out.println("TLS_CONTROL_STALLED "+frame);peer.close();thread.join(BOUND);}assertFalse(late,"TLS control exceeded unchanged "+BOUND+" ms bound");return TimeUnit.NANOSECONDS.toMillis(System.nanoTime()-start);
 }
 private static void ended(TlsLifecycleFixture peer,AtomicReference<Socket> active,Socket raw)throws Exception {
  long end=System.nanoTime()+TimeUnit.MILLISECONDS.toNanos(BOUND);while(raw!=null && !raw.isClosed() && System.nanoTime()<end)Thread.sleep(2);if(raw!=null)assertTrue(raw.isClosed(),"Raw TCP abort completed");assertTrue(peer.finished.await(BOUND,TimeUnit.MILLISECONDS),"Peer observed raw EOF/reset");end=System.nanoTime()+TimeUnit.MILLISECONDS.toNanos(BOUND);while(active.get()!=null && System.nanoTime()<end)Thread.sleep(2);assertNull(active.get(),"Worker cleared raw handle after owned cleanup");assertEquals(1,peer.accepted.get());assertEquals(peer.phase==TlsLifecycleFixture.Phase.HANDSHAKE || peer.phase==TlsLifecycleFixture.Phase.EOF_HANDSHAKE?0:1,peer.requests.get());assertEquals(1,peer.ended.get());
 }
 private static void context(ApiException e,String id,ApiException.Kind kind) {
  context(e,id,kind,null);
 }
 private static void context(ApiException e,String id,ApiException.Kind kind,TlsLifecycleFixture.Phase phase) {
  assertEquals(kind,e.kind());assertEquals(id.equals(MUTATION) && phase!=TlsLifecycleFixture.Phase.HANDSHAKE && phase!=TlsLifecycleFixture.Phase.EOF_HANDSHAKE,e.outcomeUncertain());if(id.equals(MUTATION) && phase!=TlsLifecycleFixture.Phase.EOF_HEADERS){assertNotNull(e.reference());assertEquals("tls-order",e.reference().value());assertFalse(e.toString().contains("tls-order"));}else assertNull(e.reference());
 }
 private static void workersStopped(WebmaniaClient client)throws Exception {var field=ClientCore.class.getDeclaredField("workers");field.setAccessible(true);assertTrue(((java.util.concurrent.ExecutorService)field.get(client)).awaitTermination(BOUND,TimeUnit.MILLISECONDS),"Owned exchange workers terminated after client.close");}
 @Test void callerInterruptionInEachActualTlsPhaseRetainsContextAndInterruptFlag()throws Exception {
  for(var phase:new TlsLifecycleFixture.Phase[]{TlsLifecycleFixture.Phase.HANDSHAKE,TlsLifecycleFixture.Phase.HEADERS,TlsLifecycleFixture.Phase.BODY})for(int trial=0;trial<10;trial++) {
   String id=trial%2==0?MUTATION:READ,protocol=trial%2==0?"TLSv1.3":"TLSv1.2";
   try(var peer=new TlsLifecycleFixture(phase,protocol,response(id));var client=client(peer,id,Duration.ofSeconds(10))) {
    var failure=new AtomicReference<Throwable>();var interrupted=new AtomicBoolean();
    Thread caller=new Thread(()->{try{var request=OperationSocketTest.input(id,input(id));client.getClass().getMethod(id,request.getClass()).invoke(client,request);}catch(java.lang.reflect.InvocationTargetException e){failure.set(e.getCause());}catch(Throwable e){failure.set(e);}finally{interrupted.set(Thread.currentThread().isInterrupted());}},"tls-blocking-caller");
    caller.start();ready(peer);blocked(phase);long start=System.nanoTime();caller.interrupt();caller.join(BOUND);boolean late=caller.isAlive();if(late){for(var frame:caller.getStackTrace())System.out.println("TLS_INTERRUPT_STALLED "+frame);peer.close();caller.join(BOUND);}assertFalse(late,"Caller interrupt exceeded unchanged 1500 ms bound");context(assertInstanceOf(ApiException.class,failure.get()),id,ApiException.Kind.CANCELLED,phase);assertTrue(interrupted.get());assertTrue(peer.finished.await(BOUND,TimeUnit.MILLISECONDS));assertEquals(1,peer.accepted.get());assertEquals(phase==TlsLifecycleFixture.Phase.HANDSHAKE?0:1,peer.requests.get());System.out.println("TLS_LIFECYCLE action=interrupt phase="+phase+" trial="+trial+" ms="+TimeUnit.NANOSECONDS.toMillis(System.nanoTime()-start)+" protocol="+protocol);
   }
  }
 }
 @Test void futureCancellationKeepsRawTransportPublishedUntilWorkerCleanup()throws Exception {
  for(var phase:new TlsLifecycleFixture.Phase[]{TlsLifecycleFixture.Phase.HANDSHAKE,TlsLifecycleFixture.Phase.HEADERS,TlsLifecycleFixture.Phase.BODY})for(int trial=0;trial<10;trial++) {
   String id=trial%2==0?MUTATION:READ;try(var peer=new TlsLifecycleFixture(phase,trial%2==0?"TLSv1.3":"TLSv1.2",response(id));var client=client(peer,id,Duration.ofSeconds(10))) {
    var future=invoke(client,id);var active=handle(future);ready(peer);blocked(phase);Socket raw=active.get();assertNotNull(raw);assertFalse(raw instanceof SSLSocket,"Only raw TCP is published");var thrown=new AtomicReference<Throwable>();boolean interrupt=trial%2==0;
    long elapsed=bounded(new Thread(()->{try{assertTrue(future.cancel(interrupt));assertTrue(future.cancel(interrupt));}catch(Throwable e){thrown.set(e);}},"tls-future-cancel"),peer);assertNull(thrown.get());assertTrue(future.isCancelled());var cancelled=assertThrows(ApiCancellationException.class,()->future.get());context(cancelled.context(),id,ApiException.Kind.CANCELLED,phase);assertSame(cancelled,assertThrows(ApiCancellationException.class,()->future.get(1,TimeUnit.SECONDS)));assertSame(cancelled,assertThrows(ApiCancellationException.class,future::join));assertSame(cancelled,assertThrows(ApiCancellationException.class,()->future.getNow(null)));assertTrue(raw.isClosed(),"Cancel closes raw TCP before returning");ended(peer,active,raw);System.out.println("TLS_LIFECYCLE action=future-cancel phase="+phase+" trial="+trial+" ms="+elapsed);
   }
  }
 }
 @Test void deadlinesAndClientCloseEndAllTlsPhasesWithoutWaitingForPeerShutdown()throws Exception {
  for(boolean deadline:new boolean[]{false,true})for(var phase:new TlsLifecycleFixture.Phase[]{TlsLifecycleFixture.Phase.HANDSHAKE,TlsLifecycleFixture.Phase.HEADERS,TlsLifecycleFixture.Phase.BODY})for(int trial=0;trial<10;trial++) {
   String id=trial%2==0?MUTATION:READ;try(var peer=new TlsLifecycleFixture(phase,trial%2==0?"TLSv1.3":"TLSv1.2",response(id));var client=client(peer,id,deadline?Duration.ofMillis(500):Duration.ofSeconds(10))) {
    var future=invoke(client,id);var active=handle(future);ready(peer);blocked(phase);Socket raw=active.get();assertNotNull(raw);assertFalse(raw instanceof SSLSocket);var thrown=new AtomicReference<Throwable>();long start=System.nanoTime();
    if(!deadline)bounded(new Thread(()->{try{client.close();client.close();}catch(Throwable e){thrown.set(e);}},"tls-client-close"),peer);
    context(OperationSocketTest.error(future),id,deadline?ApiException.Kind.TIMEOUT:ApiException.Kind.CLOSED,phase);assertNull(thrown.get());if(!deadline)assertTrue(raw.isClosed(),"Client close aborts raw TCP before returning");ended(peer,active,raw);if(!deadline)workersStopped(client);assertTrue(TimeUnit.NANOSECONDS.toMillis(System.nanoTime()-start)<BOUND);System.out.println("TLS_LIFECYCLE action="+(deadline?"deadline":"client-close")+" phase="+phase+" trial="+trial);
   }
  }
 }
 @Test void completedResponsesAndEofDoNotWaitForCloseNotifyOrReplay()throws Exception {
  for(var phase:new TlsLifecycleFixture.Phase[]{TlsLifecycleFixture.Phase.COMPLETE,TlsLifecycleFixture.Phase.EOF_HANDSHAKE,TlsLifecycleFixture.Phase.EOF_HEADERS,TlsLifecycleFixture.Phase.EOF_BODY})for(int trial=0;trial<10;trial++) {
   String id=trial%2==0?MUTATION:READ;try(var peer=new TlsLifecycleFixture(phase,trial%2==0?"TLSv1.3":"TLSv1.2",response(id));var client=client(peer,id,Duration.ofSeconds(10))) {
    var future=invoke(client,id);var active=handle(future);ready(peer);long start=System.nanoTime();if(phase==TlsLifecycleFixture.Phase.COMPLETE){var result=assertInstanceOf(ApiResult.class,future.get(BOUND,TimeUnit.MILLISECONDS));assertEquals(200,result.status());assertEquals("webmania-java/0.1.0-preview.9",peer.userAgent);}else context(OperationSocketTest.error(future),id,ApiException.Kind.TRANSPORT,phase);ended(peer,active,null);assertTrue(TimeUnit.NANOSECONDS.toMillis(System.nanoTime()-start)<BOUND);System.out.println("TLS_LIFECYCLE action=completion phase="+phase+" trial="+trial);
   }
  }
  for(int trial=0;trial<10;trial++)try(var peer=new TlsLifecycleFixture(TlsLifecycleFixture.Phase.COMPLETE,"TLSv1.3",response(READ));var client=new WebmaniaClient(ClientConfig.builder().origin(Contract.operation(READ).path("module").asText(),java.net.URI.create(peer.origin().toString().replace("localhost","127.0.0.1"))).sslContext(SocketFixture.trust).build(),OperationSocketTest.credentials(Contract.operation(READ),"default"))) {
   var future=invoke(client,READ);var active=handle(future);context(OperationSocketTest.error(future),READ,ApiException.Kind.TRANSPORT);assertTrue(peer.finished.await(BOUND,TimeUnit.MILLISECONDS));assertEquals(1,peer.accepted.get());assertEquals(0,peer.requests.get());long end=System.nanoTime()+TimeUnit.MILLISECONDS.toNanos(BOUND);while(active.get()!=null && System.nanoTime()<end)Thread.sleep(2);assertNull(active.get());System.out.println("TLS_LIFECYCLE action=hostname-rejection trial="+trial);
  }
 }
 @Test void cancellationPublicationAndCompletionRacesHaveOneTransportLifetime()throws Exception {
  for(int trial=0;trial<20;trial++)try(var peer=new TlsLifecycleFixture(TlsLifecycleFixture.Phase.RACE,trial%2==0?"TLSv1.3":"TLSv1.2",response(READ));var client=client(peer,READ,Duration.ofSeconds(10))) {
   var future=invoke(client,READ);var active=handle(future);ready(peer);blocked(TlsLifecycleFixture.Phase.BODY);var thrown=new AtomicReference<Throwable>();
   Thread release=new Thread(peer.complete::countDown,"tls-release-response");Thread cancel=new Thread(()->{try{future.cancel(true);}catch(Throwable e){thrown.set(e);}},"tls-race-cancel");release.start();long elapsed=bounded(cancel,peer);release.join(BOUND);assertFalse(release.isAlive());assertNull(thrown.get());assertTrue(future.isDone());assertTrue(future.isCancelled() || future.get(BOUND,TimeUnit.MILLISECONDS) instanceof ApiResult<?>);ended(peer,active,null);System.out.println("TLS_LIFECYCLE action=completion-race trial="+trial+" ms="+elapsed);
  }
  for(int trial=0;trial<20;trial++)try(var peer=new TlsLifecycleFixture(TlsLifecycleFixture.Phase.HANDSHAKE,"TLSv1.3",response(READ));var client=client(peer,READ,Duration.ofSeconds(10))) {
   var future=invoke(client,READ);var active=handle(future);future.cancel(true);client.close();workersStopped(client);assertNull(active.get());assertTrue(future.isCancelled());assertTrue(peer.accepted.get()<=1);assertEquals(0,peer.requests.get());System.out.println("TLS_LIFECYCLE action=publication-race trial="+trial);
  }
 }
 @Test void timedOutTlsCallDoesNotStarveTheSameClientsNextExchange()throws Exception {
  try(var peer=new SocketFixture(true);var client=new WebmaniaClient(ClientConfig.builder().origin(Contract.operation(READ).path("module").asText(),peer.origin()).sslContext(SocketFixture.trust).deadline(Duration.ofMillis(500)).build(),OperationSocketTest.credentials(Contract.operation(READ),"default"))) {
   var received=new java.util.concurrent.CountDownLatch(1);var count=new java.util.concurrent.atomic.AtomicInteger();peer.responder=request->{int current=count.incrementAndGet();received.countDown();return new SocketFixture.Reply(200,"application/json",response(READ),java.util.Map.of(),0,current==1?2000:0,null,false);};
   var first=invoke(client,READ);assertTrue(received.await(3,TimeUnit.SECONDS));blocked(TlsLifecycleFixture.Phase.BODY);context(OperationSocketTest.error(first),READ,ApiException.Kind.TIMEOUT);var recovered=assertInstanceOf(ApiResult.class,invoke(client,READ).get(BOUND,TimeUnit.MILLISECONDS));assertEquals(200,recovered.status());assertEquals(2,peer.requests.size());client.close();workersStopped(client);System.out.println("TLS_LIFECYCLE action=same-client-recovery requests=2");
  }
 }
}
