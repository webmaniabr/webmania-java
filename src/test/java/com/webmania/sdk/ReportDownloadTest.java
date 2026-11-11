package com.webmania.sdk;

import java.io.ByteArrayOutputStream;
import java.net.ServerSocket;
import java.nio.charset.StandardCharsets;
import java.time.Duration;
import java.util.Map;
import org.junit.jupiter.api.Test;
import com.webmania.sdk.model.api1files.FiscalDownloadReportRequest;
import com.webmania.sdk.model.api1files.NfeDownloadXmlRequest;
import com.webmania.sdk.model.api1files.Uuid;
import static org.junit.jupiter.api.Assertions.*;

/** Legacy text/xml report tolerance, the current report download and chunk-size line budgets. */
class ReportDownloadTest {
 private static final String UUID="d8604a71-32c6-4a38-9a10-00000000e703";
 private static final String XLSX="application/vnd.openxmlformats-officedocument.spreadsheetml.sheet";
 private static FiscalDownloadReportRequest legacy(){return new FiscalDownloadReportRequest().setUuid(Uuid.ofVariant0(UUID));}
 private static Credentials company(){return Credentials.company("ReportKeyOnly","ReportSecretOnly","ReportAccessOnly","ReportAccessSecretOnly");}

 @Test void legacyReportLabeledTextXmlIsIdentifiedByItsBytes()throws Exception{
  try(var peer=new SocketFixture(false);var client=new WebmaniaClient(peer.config("api1/files.openapi.json"),Credentials.anonymousFile())){
   byte[] csv=FileFixtures.bytes("id;valor\r\n1;10.00\r\n");peer.reply=SocketFixture.Reply.bytes("text/xml",csv);
   var result=client.fiscalDownloadReport(legacy()).data();assertEquals(Download.Kind.CSV,result.kind());assertArrayEquals(csv,result.bytes());assertEquals("text/xml",result.contentType());
   byte[] workbook=FileFixtures.valid(XLSX);peer.reply=SocketFixture.Reply.bytes("text/xml",workbook);
   var sheet=client.fiscalDownloadReport(legacy()).data();assertEquals(Download.Kind.XLSX,sheet.kind());assertArrayEquals(workbook,sheet.bytes());
   for(byte[] refused:new byte[][]{FileFixtures.xml(),FileFixtures.valid("text/html")}) {
    peer.reply=SocketFixture.Reply.bytes("text/xml",refused);
    var e=assertThrows(ApiException.class,()->client.fiscalDownloadReport(legacy()));assertEquals(ApiException.Kind.PROTOCOL,e.kind());assertEquals(200,e.status());
   }
   assertEquals(4,peer.requests.size(),"no retry");
  }
 }
 @Test void otherFileOperationsGainNoReportTolerance()throws Exception{
  try(var peer=new SocketFixture(false);var client=new WebmaniaClient(peer.config("api1/files.openapi.json"),company())){
   peer.reply=SocketFixture.Reply.bytes("text/xml",FileFixtures.bytes("id;valor\r\n1;10.00\r\n"));
   var e=assertThrows(ApiException.class,()->client.nfeDownloadXml(new NfeDownloadXmlRequest(Json.parse("{\"identifier\":\""+UUID+"\"}"))));
   assertEquals(ApiException.Kind.PROTOCOL,e.kind());
  }
 }
 @Test void currentReportUrlStaysOnTheApprovedOriginAndPrefix()throws Exception{
  try(var peer=new SocketFixture(false)){
   var origin=java.net.URI.create(peer.origin()+"/api2-prefix");
   var config=ClientConfig.builder().origin("api2/reports.openapi.json",origin).deadline(Duration.ofSeconds(3)).build();
   try(var client=new WebmaniaClient(config,company())){
    byte[] pdf=FileFixtures.valid("application/pdf");peer.reply=SocketFixture.Reply.bytes("application/pdf",pdf);
    var file=client.fiscalReportDownload(origin+"/relatorios/"+UUID).data();assertEquals(Download.Kind.PDF,file.kind());assertArrayEquals(pdf,file.bytes());
    assertEquals(1,peer.requests.size());var sent=peer.requests.get(0);assertEquals("GET",sent.method());assertEquals("/api2-prefix/relatorios/"+UUID,sent.target());assertEquals("ReportKeyOnly",sent.headers().get("x-consumer-key"));
    String other=origin.getPort()==65535?"65534":"65535";
    for(String refused:new String[]{"https://example.invalid/relatorios/"+UUID,"http://user@localhost:"+origin.getPort()+"/api2-prefix/relatorios/"+UUID,"https://localhost:"+origin.getPort()+"/api2-prefix/relatorios/"+UUID,"http://localhost:"+other+"/api2-prefix/relatorios/"+UUID,origin+"/relatorio/"+UUID+"/",origin+"/relatorios/"+UUID+"/extra",origin+"/relatorios/../relatorios/"+UUID,origin+"/relatorios/"+UUID+"?download=1","http://127.0.0.1:"+origin.getPort()+"/api2-prefix/relatorios/"+UUID,"not a url"}) {
     var e=assertThrows(ApiException.class,()->client.fiscalReportDownload(refused),refused);assertEquals(ApiException.Kind.VALIDATION,e.kind());assertFalse(e.outcomeUncertain());
    }
    assertEquals(1,peer.requests.size(),"refused URLs never reach a socket");
    peer.reply=new SocketFixture.Reply(302,"text/html",FileFixtures.bytes("<html></html>"),Map.of("Location","https://example.invalid/relatorios/"+UUID),0,0,null,false);
    var redirect=assertThrows(ApiException.class,()->client.fiscalReportDownload(origin+"/relatorios/"+UUID));assertEquals(ApiException.Kind.REDIRECT,redirect.kind());
    assertEquals(2,peer.requests.size(),"credentials never follow a Location");
    peer.reply=new SocketFixture.Reply(404,"application/json",FileFixtures.bytes("{\"error\":\"not found\"}"),Map.of(),0,0,null,false);
    var missing=assertThrows(ApiException.class,()->client.fiscalReportDownload(origin+"/relatorios/"+UUID));assertEquals(ApiException.Kind.HTTP,missing.kind());assertFalse(missing.outcomeUncertain());
    peer.reply=SocketFixture.Reply.json("{\"error\":\"processando\"}");
    var pending=assertThrows(ApiException.class,()->client.fiscalReportDownload(origin+"/relatorios/"+UUID));assertEquals(ApiException.Kind.API,pending.kind());assertFalse(pending.toString().contains(UUID));
   }
  }
 }
 @Test void currentReportRefusesMonitorAndResellerScopes()throws Exception{
  try(var peer=new SocketFixture(false)){
   for(Credentials wrong:new Credentials[]{Credentials.monitor("MonitorOnly"),Credentials.reseller("a","b","c","d")}) {
    try(var client=new WebmaniaClient(peer.config("api2/reports.openapi.json"),wrong)){
     var e=assertThrows(ApiException.class,()->client.fiscalReportDownload(peer.origin()+"/relatorios/"+UUID));assertEquals(ApiException.Kind.AUTH_SCOPE,e.kind());
    }
   }
   assertEquals(0,peer.requests.size());
  }
 }
 @Test void chunkSizeLinesAreBudgetedPerLineNotAgainstHeaders()throws Exception{
  byte[] csv=FileFixtures.bytes("id;valor\r\n1;10.00\r\n");
  var many=new ByteArrayOutputStream();var expected=new ByteArrayOutputStream();
  for(int i=0;i<2400;i++){byte[] piece=csv;many.write((Integer.toHexString(piece.length)+";ext=padding-padding-padding\r\n").getBytes(StandardCharsets.US_ASCII));many.write(piece);many.write("\r\n".getBytes(StandardCharsets.US_ASCII));expected.write(piece);}
  many.write("0\r\n\r\n".getBytes(StandardCharsets.US_ASCII));
  try(var raw=new RawChunked(many.toByteArray());var client=new WebmaniaClient(ClientConfig.builder().origin("api1/files.openapi.json",raw.origin()).build(),Credentials.anonymousFile())){
   var file=client.fiscalDownloadReport(legacy()).data();assertEquals(Download.Kind.CSV,file.kind());assertArrayEquals(expected.toByteArray(),file.bytes());
  }
  byte[] oversize=("1;"+"x".repeat(16*1024)+"\r\nA\r\n0\r\n\r\n").getBytes(StandardCharsets.US_ASCII);
  try(var raw=new RawChunked(oversize);var client=new WebmaniaClient(ClientConfig.builder().origin("api1/files.openapi.json",raw.origin()).build(),Credentials.anonymousFile())){
   var e=assertThrows(ApiException.class,()->client.fiscalDownloadReport(legacy()));assertNotEquals(ApiException.Kind.API,e.kind());assertEquals(1,raw.accepted.get(),"no request is repeated");
  }
 }
 /** One-shot HTTP/1.1 server writing a raw chunked body after complete text/csv headers. */
 private static final class RawChunked implements AutoCloseable {
  final ServerSocket listener=new ServerSocket(0,5,java.net.InetAddress.getByName("127.0.0.1"));final java.util.concurrent.atomic.AtomicInteger accepted=new java.util.concurrent.atomic.AtomicInteger();
  private final Thread thread;
  RawChunked(byte[] body)throws Exception{thread=new Thread(()->{try(var s=listener.accept()){accepted.incrementAndGet();var in=s.getInputStream();int a=0,b=0,c=0,d;while((d=in.read())>=0){if(a=='\r'&&b=='\n'&&c=='\r'&&d=='\n')break;a=b;b=c;c=d;}var out=s.getOutputStream();out.write("HTTP/1.1 200 OK\r\nContent-Type: text/csv\r\nTransfer-Encoding: chunked\r\nConnection: close\r\n\r\n".getBytes(StandardCharsets.US_ASCII));out.write(body);out.flush();}catch(Exception ignored){}});thread.setDaemon(true);thread.start();}
  java.net.URI origin(){return java.net.URI.create("http://localhost:"+listener.getLocalPort());}
  @Override public void close()throws java.io.IOException{listener.close();try{thread.join(2000);}catch(InterruptedException e){Thread.currentThread().interrupt();}}
 }
}
