package com.webmania.sdk;

import java.nio.charset.StandardCharsets;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/** Causal physical-structure checks, with paired attributed byte-exact references. */
class Preview7StructureTest {
 private static final String XLSX="application/vnd.openxmlformats-officedocument.spreadsheetml.sheet";
 private static byte[] fixture(String name)throws Exception{try(var in=Preview7StructureTest.class.getResourceAsStream("/preview7/"+name)){assertNotNull(in);return in.readAllBytes();}}
 private static byte[] bytes(String text){return text.getBytes(StandardCharsets.ISO_8859_1);}
 @Test void pdfUsesLivePhysicalRootGenerationAndPageTree()throws Exception {
  byte[] plain=fixture("canonical_plain.pdf"),protectedPdf=fixture("canonical_protected.pdf");assertEquals(344,plain.length);assertEquals(660,protectedPdf.length);
  assertEquals(Download.Kind.PDF,FileChecks.inspect("application/pdf",plain));assertEquals(Download.Kind.ENCRYPTED_PDF,FileChecks.inspect("application/pdf",protectedPdf));
  String original=new String(plain,StandardCharsets.ISO_8859_1);
  for(String changed:new String[]{original.replace("/Type /Catalog","/Type /Invalid"),original.replace("0000000009 00000 n","0000000009 00000 f"),original.replace("0000000009 00000 n","0000000010 00000 n"),original.replace("/Root 1 0 R","/Root 1 1 R"),original.replace("/Type /Pages","/Type /Bogus"),original.replace("/Count 1","/Count 2"),original.replace("/Parent 2 0 R","/Parent 1 0 R"),original.replace("/Kids [3 0 R]","/Kids [1 0 R]")})assertNull(FileChecks.inspect("application/pdf",bytes(changed)));
  assertNull(FileChecks.inspect("application/pdf",bytes(new String(protectedPdf,StandardCharsets.ISO_8859_1).replace("/Encrypt 4 0 R","/Encrypt 4 1 R"))));
 }
 @Test void workbookAndLinkedWorksheetRequireTheActualParent() {
  for(String member:new String[]{"xl/workbook.xml","[Content_Types].xml","xl/_rels/workbook.xml.rels","xl/worksheets/sheet1.xml"}) {
   var files=FileFixtures.workbook();String original=new String(files.get(member),StandardCharsets.UTF_8),changed;
   if(member.endsWith("workbook.xml"))changed=original.replace("<sheets>","<extLst>").replace("</sheets>","</extLst>");
   else if(member.endsWith("sheet1.xml"))changed=original.replace("<sheetData/>","<extLst><sheetData/></extLst>");
   else if(member.endsWith(".rels"))changed=original.replace("<Relationship Id=","<wrapper><Relationship Id=").replace("/></Relationships>","/></wrapper></Relationships>");
   else changed=original.replaceFirst("<Override [^>]+/>","<wrapper>$0</wrapper>");
   assertNotEquals(original,changed);files.put(member,changed.getBytes(StandardCharsets.UTF_8));assertEquals(Download.Kind.XML,FileChecks.inspect("application/xml",files.get(member)),"Mutation remains well-formed XML");assertNull(FileChecks.inspect(XLSX,FileFixtures.zip(files,0,false)),member);
  }
 }
 @Test void originsRejectDotSegmentsAndEveryExplicitInvalidPort() {
  for(String value:new String[]{"https://example.invalid/a/../b","https://example.invalid/%2e%2E/b","https://example.invalid/a/./b","https://example.invalid/%2E/b","https://example.invalid:0/","https://example.invalid:65536/","https://example.invalid:/","https://[::1]:0/","https://[::1]:65536/","https://[::1]:/"})assertThrows(IllegalArgumentException.class,()->ClientConfig.builder().origin("api1/fiscal.openapi.json",java.net.URI.create(value)),value);
  for(String value:new String[]{"https://example.invalid/prefix/","https://example.invalid:1/a.b/","https://example.invalid:65535/prefix/","http://[::1]:1234/prefix/"})assertDoesNotThrow(()->ClientConfig.builder().origin("api1/fiscal.openapi.json",java.net.URI.create(value)),value);
 }
 @Test void sheetIdsStayInsideTheirUnsignedIntDomain() {
  for(String id:new String[]{"1","4294967295","4294967296","999999999999999999999","01"}) {
   var files=FileFixtures.workbook();String workbook=new String(files.get("xl/workbook.xml"),StandardCharsets.UTF_8);files.put("xl/workbook.xml",workbook.replace("sheetId=\"1\"","sheetId=\""+id+"\"").getBytes(StandardCharsets.UTF_8));
   assertEquals(id.equals("1")||id.equals("4294967295")?Download.Kind.XLSX:null,FileChecks.inspect(XLSX,FileFixtures.zip(files,0,false)),id);
  }
 }
 @Test void eightDistinctRelationshipsCanShareOneWorksheet() {
  var files=FileFixtures.workbook();String workbook=new String(files.get("xl/workbook.xml"),StandardCharsets.UTF_8),rels=new String(files.get("xl/_rels/workbook.xml.rels"),StandardCharsets.UTF_8);
  String sheet="<sheet name=\"Sheet1\" sheetId=\"1\" r:id=\"sheet1\"/>",relationship=rels.substring(rels.indexOf("<Relationship Id="),rels.indexOf("/>")+2);var sheets=new StringBuilder();var links=new StringBuilder();
  for(int i=1;i<=8;i++){sheets.append(sheet.replace("Sheet1","Sheet"+i).replace("sheetId=\"1\"","sheetId=\""+i+"\"").replace("sheet1\"","sheet"+i+"\""));links.append(relationship.replace("Id=\"sheet1\"","Id=\"sheet"+i+"\""));}
  files.put("xl/workbook.xml",workbook.replace(sheet,sheets).getBytes(StandardCharsets.UTF_8));files.put("xl/_rels/workbook.xml.rels",rels.replace(relationship,links).getBytes(StandardCharsets.UTF_8));assertEquals(Download.Kind.XLSX,FileChecks.inspect(XLSX,FileFixtures.zip(files,0,false)));
 }
}
