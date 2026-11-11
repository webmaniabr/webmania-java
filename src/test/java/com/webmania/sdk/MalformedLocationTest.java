package com.webmania.sdk;

import com.webmania.sdk.model.api1fiscal.FiscalCompanyUpdateRequest;
import com.webmania.sdk.model.api1fiscal.FiscalUpdateCompanyRequest;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MalformedLocationTest {
 static final String CAP="FEDCBAFE-ABCD-4ABC-8ABC-FEDCBAFEDCBA";
 static final String LOW=CAP.toLowerCase(Locale.ROOT);
 static final String MIX="fEdCbAfE-AbCd-4aBc-8aBc-FeDcBaFeDcBa";
 static Credentials company(){return Credentials.company("synthetic-key","synthetic-secret","synthetic-access","synthetic-access-secret");}
 static ApiException request(WebmaniaClient client,SocketFixture server,String location,String correlation) {
  server.reply=new SocketFixture.Reply(302,"text/html",new byte[0],Map.of("Location",location,"X-Request-ID",correlation),0,0,null,false);
  var body=new FiscalCompanyUpdateRequest();body.explicitNull("cnae");
  return assertThrows(ApiException.class,()->client.fiscalUpdateCompany(new FiscalUpdateCompanyRequest().setBody(body)));
 }
 static String encoded(String text){StringBuilder out=new StringBuilder();for(byte b:text.getBytes(StandardCharsets.US_ASCII))out.append('%').append(String.format("%02X",b & 255));return out.toString();}
 @Test void malformedLocationPathsStillProtectKnownUuidWithoutAcceptingTheDestination()throws Exception {
  try(var source=new SocketFixture(false);var destination=new SocketFixture(false);var client=new WebmaniaClient(source.config("api1/fiscal.openapi.json"),company())) {
   List<String> locations=List.of("/private/"+CAP+"?token=synthetic-link-token",destination.origin()+"/private/"+CAP,"https://[invalid/private/"+CAP+"?token=synthetic-link-token","https://[invalid/private/%zz/"+encoded(CAP)+"?token=synthetic-link-token","//[invalid/private/"+CAP+"?bad=%zz");
   for(String location:locations)for(String echo:List.of(CAP,LOW,MIX)) {
    int before=source.requests.size();var error=request(client,source,location,echo);assertEquals(ApiException.Kind.REDIRECT,error.kind());assertTrue(error.outcomeUncertain());assertNull(error.correlation());assertEquals(before+1,source.requests.size());
    if(location.contains("[invalid"))assertNull(error.redirect());else assertNotNull(error.redirect());
    assertFalse(error.toString().contains(CAP));assertFalse(error.toString().contains("synthetic-link-token"));
   }
   assertEquals(0,destination.requests.size());
  }
 }
 @Test void queryValuesAndAuthorityUserInfoRemainOpaqueAndCaseLiteral()throws Exception {
  try(var server=new SocketFixture(false);var client=new WebmaniaClient(server.config("api1/fiscal.openapi.json"),company())) {
   List<String> locations=List.of("https://example.invalid/private/safe?token="+LOW,"https://[invalid/private/safe?token="+LOW,"https://[invalid/private/safe?token="+encoded(LOW),"https://"+LOW+"@example.invalid/private/safe","https://user:"+LOW+"@[invalid/private/safe","https://"+LOW+"/private/safe");
   for(String location:locations) {
    assertNull(request(client,server,location,LOW).correlation());assertEquals(CAP,request(client,server,location,CAP).correlation());assertEquals(MIX,request(client,server,location,MIX).correlation());
   }
  }
 }
 @Test void ordinaryUuidShapedCredentialsAreLiteralAndOpaqueUriDataIsNotAPath()throws Exception {
  try(var server=new SocketFixture(false);var client=new WebmaniaClient(server.config("api1/fiscal.openapi.json"),Credentials.company("synthetic-key",LOW,"synthetic-access","synthetic-access-secret"))) {
   assertNull(request(client,server,"https://[invalid/private/safe",LOW).correlation());assertEquals(CAP,request(client,server,"https://[invalid/private/safe",CAP).correlation());assertEquals(MIX,request(client,server,"https://[invalid/private/safe",MIX).correlation());
   assertEquals(CAP,request(client,server,"urn:"+LOW,CAP).correlation());
  }
  var secrets=new Secrets(company(),Json.parse("{}"));secrets.observeLocation("https://[invalid/private/"+encoded(CAP)+"?token=opaque-token");assertFalse(secrets.redact("Path "+LOW+" "+MIX+" opaque-token",512).contains(LOW));assertFalse(secrets.redact("Path "+LOW+" "+MIX+" opaque-token",512).contains(MIX));assertFalse(secrets.redact("Path "+LOW+" "+MIX+" opaque-token",512).contains("opaque-token"));
 }
 @Test void snapshotUrlDiscoveryUsesTheSamePathBoundaryAndOpaqueTokenPolicy() {
  for(String value:List.of("https://[invalid/private/safe?token="+LOW,"See https://"+LOW+"@example.invalid/private/safe")) {
   var secrets=new Secrets(company(),Json.parse("{\"future\":{\"url\":\""+value+"\"}}"));assertNull(secrets.correlation(LOW));assertEquals(CAP,secrets.correlation(CAP));assertEquals(MIX,secrets.correlation(MIX));
  }
  var path=new Secrets(company(),Json.parse("{\"future\":{\"url\":\"https://[invalid/private/"+CAP+"?opaque=value\"}}"));assertNull(path.correlation(LOW));assertNull(path.correlation(MIX));
 }

}
