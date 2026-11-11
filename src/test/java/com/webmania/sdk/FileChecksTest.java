package com.webmania.sdk;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.nio.charset.StandardCharsets;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

class FileChecksTest {
 private static final String XLSX="application/vnd.openxmlformats-officedocument.spreadsheetml.sheet";
 private static byte[] b(String text){return FileFixtures.bytes(text);}
 @Test void fiscalXmlUtf8Utf16AndNamespaces() {
  assertEquals(Download.Kind.XML,FileChecks.inspect("application/xml",FileFixtures.xml()));
  for(var charset:new java.nio.charset.Charset[]{StandardCharsets.UTF_16,StandardCharsets.UTF_16LE,StandardCharsets.UTF_16BE})assertEquals(Download.Kind.XML,FileChecks.inspect("text/xml","<?xml version=\"1.0\" encoding=\"UTF-16\"?><cte:cteProc xmlns:cte=\"http://www.portalfiscal.inf.br/cte\"><cte:CTe/></cte:cteProc>".getBytes(charset)),charset.name());
  for(String invalid:new String[]{"<HTML/>","<x:html xmlns:x=\"anything\"/>","<invoice xmlns=\"http://www.w3.org/1999/xhtml\"/>","<h:invoice xmlns:h=\"http://www.w3.org/1999/xhtml\"/>","<error/>","<nfe><x></nfe>","<NFe/><NFe/>","<!DOCTYPE NFe [<!ENTITY leak SYSTEM 'http://127.0.0.1:1/never'>]><NFe>&leak;</NFe>","<!DOCTYPE NFe><NFe/>","<?xml version=\"1.0\" encoding=\"ISO-8859-1\"?><NFe/>","<NFe>&missing;</NFe>"})assertNull(FileChecks.inspect("application/xml",b(invalid)),invalid);
  assertNull(FileChecks.inspect("application/xml",new byte[]{'<','N','F','e','>',(byte)0xff,'<','/','N','F','e','>'}));
  assertNull(FileChecks.inspect("application/xml",b("<NFe>".repeat(129)+"</NFe>".repeat(129))));
  assertEquals(Download.Kind.XML,FileChecks.inspect("application/xml",b("<NFe>".repeat(128)+"</NFe>".repeat(128))));
  var attributes=new StringBuilder("<NFe xmlns=\"http://www.portalfiscal.inf.br/nfe\"");for(int i=0;i<256;i++)attributes.append(" a").append(i).append("=\"x\"");assertEquals(Download.Kind.XML,FileChecks.inspect("application/xml",b(attributes+"/>")));assertNull(FileChecks.inspect("application/xml",b(attributes+" extra=\"x\"/>")));
 }
 @Test void completePdfAndLexicalEncryption() {
  assertEquals(Download.Kind.PDF,FileChecks.inspect("application/pdf",FileFixtures.pdf("","/Comment (a /Encrypt in string) /Names [/Encrypt]")));
  assertEquals(Download.Kind.PDF,FileChecks.inspect("application/pdf",FileFixtures.pdf("/Info (/Encrypt) /Other /Encrypt /Encrypt null % /Encrypt 3 0 R\n","")));
  assertEquals(Download.Kind.ENCRYPTED_PDF,FileChecks.inspect("application/pdf",FileFixtures.pdf("/Encr#79pt 3 0 R","")));
  assertEquals(Download.Kind.ENCRYPTED_PDF,FileChecks.inspect("application/pdf",FileFixtures.pdf("/Encrypt "+FileFixtures.encryption(),"")));
  for(String invalid:new String[]{"%PDF-","%PDF-1.7\nsynthetic\u0000\u00ff","%PDF-1.7\n1 0 obj\n<<>>\nendobj\n%%EOF","%PDF-1.7\n1 0 obj\n<<>>\nendobj\nstartxref\n1\n%%EOF"})assertNull(FileChecks.inspect("application/pdf",b(invalid)),invalid);
  byte[] bad=FileFixtures.pdf("","");bad[bad.length-2]='X';assertNull(FileChecks.inspect("application/pdf",bad));
 }
 @Test void pdfStreamDoesNotInventEncryption() {
  String payload="endstream trailer << /Encrypt 3 0 R >>\n";
  var object=new StringBuilder("%PDF-1.7\n");int one=object.length();object.append("1 0 obj\n<< /Type /Catalog /Pages 2 0 R >>\nendobj\n");int two=object.length();object.append("2 0 obj\n<< /Type /Pages /Kids [] /Count 0 >>\nendobj\n");int three=object.length();object.append("3 0 obj\n<< /Length ").append(payload.length()).append(" >>\nstream\n").append(payload).append("endstream\nendobj\n");int xref=object.length();
  object.append("xref\n0 4\n0000000000 65535 f \n").append(String.format(java.util.Locale.ROOT,"%010d 00000 n \n%010d 00000 n \n%010d 00000 n \n",one,two,three)).append("trailer\n<< /Root 1 0 R /Size 4 >>\nstartxref\n").append(xref).append("\n%%EOF\n");assertEquals(Download.Kind.PDF,FileChecks.inspect("application/pdf",b(object.toString())));
 }
 @Test void zipCompleteEmptyDescriptorsAndZip64() {
  for(byte[] bytes:new byte[][]{FileFixtures.zip(),FileFixtures.zip(Map.of(),0,false),FileFixtures.zip(Map.of("a",b("data")),8,true),FileFixtures.zip(Map.of("a",b("data")),8,false),FileFixtures.zip64(FileFixtures.zip(),false),FileFixtures.zip64(FileFixtures.zip(),true),FileFixtures.zip64(FileFixtures.zip(Map.of(),0,false),false)})assertEquals(Download.Kind.ZIP,FileChecks.inspect("application/zip",bytes));
  assertEquals(Download.Kind.ENCRYPTED_ZIP,FileChecks.inspect("application/zip",FileFixtures.zip(Map.of("a",b("encrypted payload header and body")),1,false)));
 }
 @Test void zipRejectsTruncationMismatchesAndForgedMetadata() {
  byte[] valid=FileFixtures.zip();int e=valid.length-22,cd=(int)FileFixtures.number(valid,e+16,4);
  for(int length:new int[]{2,4,valid.length-1,valid.length-22})assertNull(FileChecks.inspect("application/zip",java.util.Arrays.copyOf(valid,length)));
  for(int position:new int[]{6,8,14,18,22,30,cd+8,cd+10,cd+16,cd+20,cd+24,cd+42,e+4,e+8,e+10,e+12,e+16}){byte[] bad=valid.clone();bad[position]^=1;assertNull(FileChecks.inspect("application/zip",bad),"offset "+position);}
  byte[] bad=FileFixtures.zip64(valid,false);bad[bad.length-22-20+4]=1;assertNull(FileChecks.inspect("application/zip",bad));
  byte[] descriptor=FileFixtures.zip(Map.of("a",b("data")),8,true);descriptor[35+4]^=1;assertNull(FileChecks.inspect("application/zip",descriptor));
 }
 @Test void zipRejectsDuplicatesOverlapsAndExpansionLimit() {
  var files=new LinkedHashMap<String,byte[]>();files.put("a",b("a"));files.put("b",b("b"));byte[] raw=FileFixtures.zip(files,0,false);int cd=(int)FileFixtures.number(raw,raw.length-6,4),second=cd+47;
  byte[] duplicate=raw.clone();duplicate[second+46]='a';assertNull(FileChecks.inspect("application/zip",duplicate));
  byte[] overlap=raw.clone();FileFixtures.set(overlap,second+42,0,4);assertNull(FileChecks.inspect("application/zip",overlap));
  byte[] bomb=FileFixtures.zip(Map.of("a",b("a")),8,true);int directory=(int)FileFixtures.number(bomb,bomb.length-6,4);FileFixtures.set(bomb,directory+24,512L*1024*1024+1,4);FileFixtures.set(bomb,31+1+4+8,512L*1024*1024+1,4);assertNull(FileChecks.inspect("application/zip",bomb));
 }
 @Test void xlsxPartsRelationshipsCrcAndEncryption() {
  assertEquals(Download.Kind.XLSX,FileChecks.inspect(XLSX,FileFixtures.zip(FileFixtures.workbook(),0,false)));
  var files=FileFixtures.workbook();files.remove("xl/worksheets/sheet1.xml");assertNull(FileChecks.inspect(XLSX,FileFixtures.zip(files,0,false)));
  files=FileFixtures.workbook();files.put("xl/worksheets/sheet1.xml",b("<html/>"));assertNull(FileChecks.inspect(XLSX,FileFixtures.zip(files,0,false)));
  files=FileFixtures.workbook();files.put("xl/_rels/workbook.xml.rels",b("<Relationships xmlns=\"http://schemas.openxmlformats.org/package/2006/relationships\"><Relationship Id=\"sheet1\" Type=\"a/worksheet\" Target=\"http://127.0.0.1/never\" TargetMode=\"External\"/></Relationships>"));assertNull(FileChecks.inspect(XLSX,FileFixtures.zip(files,0,false)));
  files=FileFixtures.workbook();files.put("xl/workbook.xml",b(new String(files.get("xl/workbook.xml"),StandardCharsets.UTF_8).replace("r:id=\"sheet1\"","r:id=\"missing\"")));assertNull(FileChecks.inspect(XLSX,FileFixtures.zip(files,0,false)));
  files=FileFixtures.workbook();files.put("../evil.xml",b("<evil/>"));assertNull(FileChecks.inspect(XLSX,FileFixtures.zip(files,0,false)));
  assertNull(FileChecks.inspect(XLSX,FileFixtures.zip(FileFixtures.workbook(),1,false)));
  byte[] corrupt=FileFixtures.zip(FileFixtures.workbook(),0,false);corrupt[49]^=1;assertNull(FileChecks.inspect(XLSX,corrupt));
 }
 @Test void xlsxDeflateAndAggregateInflationBounds()throws Exception {
  assertEquals(Download.Kind.XLSX,FileChecks.inspect(XLSX,deflate(FileFixtures.workbook())));
  var boundary=FileFixtures.workbook();int fixed=boundary.values().stream().mapToInt(value->value.length).sum();for(int i=0;i<3;i++)boundary.put("boundary"+i+".bin",new byte[8*1024*1024]);boundary.put("boundary-last.bin",new byte[8*1024*1024-fixed]);assertEquals(Download.Kind.XLSX,FileChecks.inspect(XLSX,deflate(boundary)),"Exactly 8 MiB per part and 32 MiB aggregate remain accepted");
  var files=FileFixtures.workbook();files.put("huge.bin",new byte[8*1024*1024+1]);assertNull(FileChecks.inspect(XLSX,deflate(files)));
  files=FileFixtures.workbook();for(int i=0;i<5;i++)files.put("part"+i+".bin",new byte[7*1024*1024]);assertNull(FileChecks.inspect(XLSX,deflate(files)));
 }
 private static byte[] deflate(Map<String,byte[]> files)throws Exception {var out=new java.io.ByteArrayOutputStream();try(var zip=new java.util.zip.ZipOutputStream(out)){for(var e:files.entrySet()){zip.putNextEntry(new java.util.zip.ZipEntry(e.getKey()));zip.write(e.getValue());zip.closeEntry();}}return out.toByteArray();}
 private static Map<String,byte[]> workbook(boolean strict) {
  var files=FileFixtures.workbook();if(strict)files.replaceAll((name,data)->b(new String(data,StandardCharsets.UTF_8).replace("http://schemas.openxmlformats.org/officeDocument/2006/relationships","http://purl.oclc.org/ooxml/officeDocument/relationships").replace("http://schemas.openxmlformats.org/spreadsheetml/2006/main","http://purl.oclc.org/ooxml/spreadsheetml/main")));return files;
 }
 @Test void xlsxRequiresExactRelationshipUrisAndResolvedWorksheetContentTypesOverHttpAndTls()throws Exception {
  String id="fiscalDownloadReport";var op=Contract.operation(id);var input=OperationSocketTest.FIXTURES.get(id).path("input");
  for(boolean tls:new boolean[]{false,true})try(var server=new SocketFixture(tls);var client=new WebmaniaClient(server.config(op.path("module").asText()),OperationSocketTest.credentials(op,"default"))) {
   for(boolean strict:new boolean[]{false,true}) {
    byte[] valid=deflate(workbook(strict));server.reply=SocketFixture.Reply.bytes(XLSX,valid);var accepted=(Download)((ApiResult<?>)OperationSocketTest.invoke(client,id,input).get(5,TimeUnit.SECONDS)).data();assertEquals(Download.Kind.XLSX,accepted.kind());assertArrayEquals(valid,accepted.bytes());
    for(int variant=0;variant<3;variant++) {
     var files=workbook(strict);String name=variant==0?"_rels/.rels":variant==1?"xl/_rels/workbook.xml.rels":"[Content_Types].xml";String value=new String(files.get(name),StandardCharsets.UTF_8);
     if(variant<2)value=value.replace(strict?"http://purl.oclc.org/ooxml/officeDocument/relationships/":"http://schemas.openxmlformats.org/officeDocument/2006/relationships/","urn:unrelated/");else value=value.replace("<Override PartName=\"/xl/worksheets/sheet1.xml\" ContentType=\"application/vnd.openxmlformats-officedocument.spreadsheetml.worksheet+xml\"/>","");files.put(name,b(value));
     int before=server.requests.size();server.reply=SocketFixture.Reply.bytes(XLSX,deflate(files));assertEquals(ApiException.Kind.PROTOCOL,OperationSocketTest.error(OperationSocketTest.invoke(client,id,input)).kind());assertEquals(before+1,server.requests.size());
    }
   }
  }
  var defaultType=FileFixtures.workbook();String value=new String(defaultType.get("[Content_Types].xml"),StandardCharsets.UTF_8).replace("ContentType=\"application/xml\"","ContentType=\"application/vnd.openxmlformats-officedocument.spreadsheetml.worksheet+xml\"").replace("<Override PartName=\"/xl/worksheets/sheet1.xml\" ContentType=\"application/vnd.openxmlformats-officedocument.spreadsheetml.worksheet+xml\"/>","");defaultType.put("[Content_Types].xml",b(value));assertEquals(Download.Kind.XLSX,FileChecks.inspect(XLSX,deflate(defaultType)));
 }
 @Test void lyingDeflatedMemberCannotMaterializeBeyondDeclaredOrRemainingBudget()throws Exception {
  var deflater=new java.util.zip.Deflater(6,true);deflater.setInput(new byte[8*1024*1024]);deflater.finish();byte[] compressed=new byte[16384];int length=deflater.deflate(compressed);assertTrue(deflater.finished());deflater.end();compressed=java.util.Arrays.copyOf(compressed,length);
  Class<?> entry=Class.forName("com.webmania.sdk.FileChecks$Entry");var constructor=entry.getDeclaredConstructors()[0];constructor.setAccessible(true);var read=FileChecks.class.getDeclaredMethod("read",byte[].class,entry,long.class);read.setAccessible(true);
  Object liar=constructor.newInstance("lying-final.bin",false,8,0L,(long)length,1L,0);
  var counter=assertInstanceOf(com.sun.management.ThreadMXBean.class,java.lang.management.ManagementFactory.getThreadMXBean());assertTrue(counter.isThreadAllocatedMemorySupported());counter.setThreadAllocatedMemoryEnabled(true);
  byte[] payload=compressed;assertThrows(java.lang.reflect.InvocationTargetException.class,()->read.invoke(null,payload,liar,1L));
  long before=counter.getThreadAllocatedBytes(Thread.currentThread().getId());assertThrows(java.lang.reflect.InvocationTargetException.class,()->read.invoke(null,payload,liar,1L));long allocated=counter.getThreadAllocatedBytes(Thread.currentThread().getId())-before;
  assertTrue(allocated<512*1024,"Lying member allocated "+allocated+" bytes with a one-byte remaining/declared budget");
  Object overRemaining=constructor.newInstance("over-remaining.bin",false,8,0L,(long)length,8L*1024*1024,0);assertThrows(java.lang.reflect.InvocationTargetException.class,()->read.invoke(null,payload,overRemaining,1L));
  var files=FileFixtures.workbook();files.put("empty/",new byte[0]);assertEquals(Download.Kind.XLSX,FileChecks.inspect(XLSX,deflate(files)));
 }
 @Test void csvSchemaRepresentations() {
  for(String valid:new String[]{"id,valor\r\n1,10\r\n","id;valor\n1;\"quoted;value\"\n","id\tvalor\n1\t\"line\nvalue\"\n","id,value\n1,\"a\"\"b\""})assertEquals(Download.Kind.CSV,FileChecks.inspect("text/csv",b(valid)),valid);
  for(String invalid:new String[]{"<html/>","{\"error\":true}","a,b\n1\n","a,b\n1,\"open","a,b\n1,\"closed\"x\n","a,b\n1,a\"b\n","one column\nonly\n","a,b\n1,\u0000\n"})assertNull(FileChecks.inspect("text/csv",b(invalid)),invalid);
  assertNull(FileChecks.inspect("text/csv",new byte[]{'a',',','b','\n','1',',',(byte)0xff}));
  assertNull(FileChecks.inspect("text/csv","a,b\n1,2\n".getBytes(StandardCharsets.UTF_16)));
 }
 @Test void genericReportsRequireARecognizedRepresentation() {
  for(String media:new String[]{"application/pdf","application/xml","application/zip","text/csv",XLSX})assertEquals(FileChecks.inspect(media,FileFixtures.valid(media)),FileChecks.inspect("application/octet-stream",FileFixtures.valid(media)));
  for(String invalid:new String[]{"arbitrary error text","<html><body>login</body></html>","<NFe>","%PDF-"})assertNull(FileChecks.inspect("application/octet-stream",b(invalid)),invalid);
 }
 @Test void malformedCorpusFailsClosedWithoutParserExceptions() {
  var random=new java.util.Random(30);for(String media:new String[]{"application/pdf","application/xml","application/zip",XLSX,"text/csv","application/octet-stream"})for(int i=0;i<100;i++){byte[] value=new byte[random.nextInt(200)];random.nextBytes(value);assertDoesNotThrow(()->FileChecks.inspect(media,value));}
 }
 @Test void actualTransportRejectsOldPrefixesAndHtmlAsXmlWithoutRetry()throws Exception {
  for(boolean tls:new boolean[]{false,true})try(var server=new SocketFixture(tls)) {
   for(String id:new String[]{"nfeDownloadDanfe","nfeDownloadXml","fiscalDownloadReport"}) {
    var op=Contract.operation(id);var fixture=OperationSocketTest.FIXTURES.get(id);assertNotNull(fixture,id);String media=id.equals("nfeDownloadDanfe")?"application/pdf":id.equals("nfeDownloadXml")?"application/xml":"application/zip";
    try(var client=new WebmaniaClient(server.config(op.path("module").asText()),OperationSocketTest.credentials(op,"default"))) {
     for(byte[] invalid:media.equals("application/pdf")?new byte[][]{b("%PDF-"),b("%PDF-1.7\nsynthetic\u0000\u00ff")}:media.equals("application/xml")?new byte[][]{b("<HTML/>"),b("<NFe xmlns=\"http://www.w3.org/1999/xhtml\"/>")}:new byte[][]{new byte[]{'P','K',3,4,0,-1}}) {
      int before=server.requests.size();server.reply=SocketFixture.Reply.bytes(media,invalid);assertEquals(ApiException.Kind.PROTOCOL,OperationSocketTest.error(OperationSocketTest.invoke(client,id,fixture.path("input"))).kind());assertEquals(before+1,server.requests.size());
     }
     byte[] bytes=FileFixtures.valid(media);server.reply=SocketFixture.Reply.bytes(media,bytes);var result=(ApiResult<?>)OperationSocketTest.invoke(client,id,fixture.path("input")).get(5,TimeUnit.SECONDS);var download=(Download)result.data();assertArrayEquals(bytes,download.bytes());assertNotNull(download.kind());assertFalse(download.encrypted());byte[] copy=download.bytes();copy[0]^=1;assertArrayEquals(bytes,download.bytes());
    }
   }
  }
 }
 @Test void protectedFileMetadataAndNonFileVariantsRemainDistinct()throws Exception {
  try(var server=new SocketFixture(false)) {
   String id="nfeDownloadDanfe";var op=Contract.operation(id);for(String mode:new String[]{"default","anonymous","token"})try(var client=new WebmaniaClient(server.config(op.path("module").asText()),OperationSocketTest.credentials(op,mode))) {
    byte[] bytes=FileFixtures.pdf("/Encrypt 3 0 R","");server.reply=SocketFixture.Reply.bytes("application/pdf",bytes);var result=(ApiResult<?>)OperationSocketTest.invoke(client,id,OperationSocketTest.FIXTURES.get(id).path("input")).get(5,TimeUnit.SECONDS);var file=(Download)result.data();assertEquals(Download.Kind.ENCRYPTED_PDF,file.kind());assertTrue(file.encrypted());assertArrayEquals(bytes,file.bytes());assertEquals(mode.equals("default")?Download.Protection.AUTHENTICATED:mode.equals("token")?Download.Protection.DOCUMENT_TOKEN:Download.Protection.POSSIBLY_PASSWORD_PROTECTED,file.protection());
   }
  }
  var pending=new Download(Json.parse("{\"status\":\"pending\"}"));assertTrue(pending.pending());assertNull(pending.kind());assertFalse(pending.encrypted());assertEquals(0,pending.bytes().length);
  var redirect=new Download(RedirectTarget.from("https://example.invalid/private"),Download.Protection.AUTHENTICATED);assertTrue(redirect.isRedirect());assertNull(redirect.kind());assertFalse(redirect.encrypted());assertEquals(0,redirect.bytes().length);
 }
}
