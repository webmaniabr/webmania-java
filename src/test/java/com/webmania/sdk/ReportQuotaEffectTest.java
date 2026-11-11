package com.webmania.sdk;

import java.nio.charset.StandardCharsets;
import java.time.Duration;
import java.util.Map;
import org.junit.jupiter.api.Test;
import com.webmania.sdk.model.api1files.FiscalDownloadReportRequest;
import com.webmania.sdk.model.api1files.Uuid;
import com.webmania.sdk.model.api1fiscal.FiscalCompanyUpdateRequest;
import com.webmania.sdk.model.api1fiscal.FiscalCompanyUpdateRequestCnae;
import com.webmania.sdk.model.api1fiscal.FiscalUpdateCompanyRequest;
import com.webmania.sdk.model.api1fiscal.NfeGetSefazStatusRequest;
import static org.junit.jupiter.api.Assertions.*;

class ReportQuotaEffectTest {
 private static final String UUID="d8604a71-32c6-4a38-9a10-00000000e703";
 private static FiscalDownloadReportRequest report(){return new FiscalDownloadReportRequest().setUuid(Uuid.ofVariant0(UUID));}
 private static Credentials company(){return Credentials.company("QuotaKeyOnly","QuotaSecretOnly","QuotaAccessOnly","QuotaAccessSecretOnly");}
 private static ClientConfig config(SocketFixture peer,String module,Duration timeout){return ClientConfig.builder().origin(module,peer.origin()).deadline(timeout).build();}
 private static void privateContext(ApiException e){assertNull(e.reference(),"report capability is not a recovery selector");assertFalse(e.toString().contains(UUID));for(String secret:new String[]{"QuotaKeyOnly","QuotaSecretOnly","QuotaAccessOnly","QuotaAccessSecretOnly"})assertFalse(e.toString().contains(secret));}
 private static void request(SocketFixture peer,int expected){
  assertEquals(expected,peer.requests.size(),"no retry or follow");assertEquals(expected,peer.connections.get(),"no additional connection");
  for(var r:peer.requests){assertEquals("GET",r.method());assertEquals("/relatorio/"+UUID+"/",r.target());assertEquals(0,r.body().length);for(String h:new String[]{"authorization","x-consumer-key","x-consumer-secret","x-access-token","x-access-token-secret"})assertFalse(r.headers().containsKey(h),"public report forwarded credentials");}
 }
 @Test void reportDropAfterCompleteRequestIsUnknown()throws Exception{
  try(var peer=new SocketFixture(false);var client=new WebmaniaClient(config(peer,"api1/files.openapi.json",Duration.ofSeconds(3)),Credentials.anonymousFile())){
   peer.responder=r->null;var e=assertThrows(ApiException.class,()->client.fiscalDownloadReport(report()));assertEquals(ApiException.Kind.TRANSPORT,e.kind());assertEquals(0,e.status());assertTrue(e.outcomeUncertain());privateContext(e);request(peer,1);
  }
 }
 @Test void passiveGetDropRemainsKnown()throws Exception{
  try(var peer=new SocketFixture(false);var client=new WebmaniaClient(config(peer,"api1/fiscal.openapi.json",Duration.ofSeconds(3)),company())){
   peer.responder=r->null;var e=assertThrows(ApiException.class,()->client.nfeGetSefazStatus(new NfeGetSefazStatusRequest()));assertEquals(ApiException.Kind.TRANSPORT,e.kind());assertFalse(e.outcomeUncertain());assertEquals(1,peer.requests.size());assertEquals(0,peer.requests.get(0).body().length);
  }
 }
 @Test void typedPostDropRemainsUnknown()throws Exception{
  try(var peer=new SocketFixture(false);var client=new WebmaniaClient(config(peer,"api1/fiscal.openapi.json",Duration.ofSeconds(3)),company())){
   peer.responder=r->null;var body=new FiscalCompanyUpdateRequest().setCnae(FiscalCompanyUpdateRequestCnae.ofVariant2(null));var e=assertThrows(ApiException.class,()->client.fiscalUpdateCompany(new FiscalUpdateCompanyRequest().setBody(body)));assertEquals(ApiException.Kind.TRANSPORT,e.kind());assertTrue(e.outcomeUncertain());assertEquals(1,peer.requests.size());assertEquals("POST",peer.requests.get(0).method());assertArrayEquals("{\"cnae\":null}".getBytes(StandardCharsets.UTF_8),peer.requests.get(0).body());
  }
 }
 @Test void completeReportJson422RemainsKnown()throws Exception{
  try(var peer=new SocketFixture(false);var client=new WebmaniaClient(config(peer,"api1/files.openapi.json",Duration.ofSeconds(3)),Credentials.anonymousFile())){
   peer.reply=new SocketFixture.Reply(422,"application/json","{\"error\":\"known rejection\"}".getBytes(StandardCharsets.UTF_8),Map.of(),0,0,null,false);var e=assertThrows(ApiException.class,()->client.fiscalDownloadReport(report()));assertEquals(ApiException.Kind.HTTP,e.kind());assertEquals(422,e.status());assertFalse(e.outcomeUncertain());privateContext(e);request(peer,1);
  }
 }
 @Test void closedBeforeSendHasNoUncertaintyOrIo()throws Exception{
  try(var peer=new SocketFixture(false)){
   var client=new WebmaniaClient(config(peer,"api1/files.openapi.json",Duration.ofSeconds(3)),Credentials.anonymousFile());client.close();var e=assertThrows(ApiException.class,()->client.fiscalDownloadReport(report()));assertEquals(ApiException.Kind.CLOSED,e.kind());assertFalse(e.outcomeUncertain());privateContext(e);request(peer,0);
  }
 }
 @Test void successfulReportCsvStillWorks()throws Exception{
  try(var peer=new SocketFixture(false);var client=new WebmaniaClient(config(peer,"api1/files.openapi.json",Duration.ofSeconds(3)),Credentials.anonymousFile())){
   byte[] bytes="id,status\n1,ok\n".getBytes(StandardCharsets.UTF_8);peer.reply=SocketFixture.Reply.bytes("text/csv",bytes);assertArrayEquals(bytes,client.fiscalDownloadReport(report()).data().bytes());request(peer,1);
  }
 }
 @Test void reportProtocol200HasPossibleQuotaEffect()throws Exception{
  try(var peer=new SocketFixture(false);var client=new WebmaniaClient(config(peer,"api1/files.openapi.json",Duration.ofSeconds(3)),Credentials.anonymousFile())){
   peer.reply=SocketFixture.Reply.bytes("application/pdf","not a PDF".getBytes(StandardCharsets.UTF_8));var e=assertThrows(ApiException.class,()->client.fiscalDownloadReport(report()));assertEquals(ApiException.Kind.PROTOCOL,e.kind());assertEquals(200,e.status());assertTrue(e.outcomeUncertain());privateContext(e);request(peer,1);
  }
 }
 @Test void reportTimeoutAfterAdmissionHasPossibleQuotaEffect()throws Exception{
  try(var peer=new SocketFixture(false);var client=new WebmaniaClient(config(peer,"api1/files.openapi.json",Duration.ofSeconds(1)),Credentials.anonymousFile())){
   peer.reply=new SocketFixture.Reply(200,"text/csv",new byte[0],Map.of(),2500,0,null,false);var e=assertThrows(ApiException.class,()->client.fiscalDownloadReport(report()));assertEquals(ApiException.Kind.TIMEOUT,e.kind());assertTrue(e.outcomeUncertain());privateContext(e);request(peer,1);
  }
 }
 @Test void reportBusiness200StillHasPossibleQuotaEffect()throws Exception{
  try(var peer=new SocketFixture(false);var client=new WebmaniaClient(config(peer,"api1/files.openapi.json",Duration.ofSeconds(3)),Credentials.anonymousFile())){
   peer.reply=SocketFixture.Reply.json("{\"error\":false}");var e=assertThrows(ApiException.class,()->client.fiscalDownloadReport(report()));assertEquals(ApiException.Kind.API,e.kind());assertEquals(200,e.status());assertTrue(e.outcomeUncertain());privateContext(e);request(peer,1);
  }
 }
 @Test void reportCancelAfterAdmissionHasPossibleQuotaEffect()throws Exception{
  try(var peer=new SocketFixture(false);var client=new WebmaniaClient(config(peer,"api1/files.openapi.json",Duration.ofSeconds(3)),Credentials.anonymousFile())){
   peer.reply=new SocketFixture.Reply(200,"text/csv",new byte[0],Map.of(),2500,0,null,false);
   var future=client.fiscalDownloadReportAsync(report());long end=System.nanoTime()+java.util.concurrent.TimeUnit.SECONDS.toNanos(2);
   while(peer.requests.isEmpty() && System.nanoTime()<end)Thread.sleep(1);
   assertEquals(1,peer.requests.size(),"complete request admitted before cancellation");assertTrue(future.cancel(true));
   var cancelled=assertThrows(ApiCancellationException.class,future::join);var e=cancelled.context();assertEquals(ApiException.Kind.CANCELLED,e.kind());assertTrue(e.outcomeUncertain());privateContext(e);request(peer,1);
  }
 }

}
