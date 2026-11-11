package com.webmania.sdk;

import com.fasterxml.jackson.databind.node.ObjectNode;
import com.webmania.sdk.model.api1fiscal.NfeCancelDocumentRequest;
import com.webmania.sdk.model.api1fiscal.NfeCancelRequest;
import com.webmania.sdk.model.api1fiscal.NfeIssueDocumentRequest;
import com.webmania.sdk.model.api1fiscal.Uuid;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.stream.Stream;
import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;
import static org.junit.jupiter.api.Assertions.*;

/** Author controls for seven diagnostic families, not an independent/full catalog acceptance. */
class DiagnosticPrivacyTest {
 static final String UUID="00000000-0000-4000-8000-000000000001";
 static final String CAP="aBcDeFaB-cDeF-4AbC-8FaB-cDeFaBcDeFaB";
 static Credentials company(){return Credentials.company("synthetic-key","synthetic-secret","synthetic-access","synthetic-access-secret");}
 static Secrets secrets(String json){return new Secrets(company(),Json.parse(json));}
 static DynamicTest control(String family,String name,org.junit.jupiter.api.function.Executable action) {
  return DynamicTest.dynamicTest(family+" "+name,()->{long start=System.nanoTime();action.execute();System.out.println("DIAGNOSTIC family="+family+" control="+name+" elapsed_ms="+TimeUnit.NANOSECONDS.toMillis(System.nanoTime()-start));});
 }
 static String encoded(String text,boolean lower){StringBuilder out=new StringBuilder();for(byte b:text.getBytes(StandardCharsets.UTF_8))out.append('%').append(String.format(lower?"%02x":"%02X",b&255));return out.toString();}
 @TestFactory Stream<DynamicTest> coreControls() {
  var checks=new ArrayList<DynamicTest>();
  for(boolean reverse:List.of(false,true)) {
   checks.add(control("REDACT-01","credential-union-reverse-"+reverse,()->{
    var s=new Secrets(Credentials.company(reverse?"1234-WXYZ":"ABCD-1234",reverse?"ABCD-1234":"1234-WXYZ","unrelated-access","unrelated-secret"),Json.parse("{}"));
    assertEquals("Public rejection: [redacted]; inspection complete.",s.redact("Public rejection: ABCD-1234-WXYZ; inspection complete.",2048));
   }));
   checks.add(control("REDACT-01","snapshot-union-reverse-"+reverse,()->{
    var s=secrets(reverse?"{\"first-private-key\":\"bridge-omega\",\"second-private-key\":\"alpha-bridge\"}":"{\"first-private-key\":\"alpha-bridge\",\"second-private-key\":\"bridge-omega\"}");
    assertEquals("Public [redacted] done",s.redact("Public alpha-bridge-omega done",2048));
   }));
  }
  checks.add(control("REDACT-01","self-overlap",()->assertEquals("[redacted]",new Secrets(Credentials.monitor("aba"),Json.parse("{}")).redact("ababa",128))));
  checks.add(control("REDACT-01","capability-and-opaque-union",()->{
   var s=secrets("{}");s.capability(CAP);s.observeLocation("/safe?opaque="+CAP.substring(24)+"-suffix");
   assertEquals("Public [redacted] done",s.redact("Public "+CAP+"-suffix done",512));
  }));
  checks.add(control("REDACT-01","url-union-and-original-marker",()->{
   var s=new Secrets(Credentials.monitor("url]"),Json.parse("{}"));
   assertEquals("Public [redacted-url] done",s.redact("Public https://example.invalid/private done",512));
  }));
  for(String token:List.of("z","7","ab"))checks.add(control("REDACT-02","short-opaque-"+token,()->{
   var s=secrets("{}");s.observeLocation("/public?opaque="+token);
   assertEquals("([redacted]), [redacted]; size label abc 17",s.redact("("+token+"), "+token+"; size label abc 17",512));
  }));
  checks.add(control("REDACT-02","unicode-underscore-boundaries",()->{
   var s=secrets("{}");s.observeLocation("/public?opaque=z");
   assertEquals("éz zé _z z_ 𐐀z z𐐀 [redacted] [redacted]",s.redact("éz zé _z z_ 𐐀z z𐐀 z z",512));
   assertEquals("([redacted])",s.redact("(z)",128));assertNull(s.correlation("z"));assertEquals("_z",s.correlation("_z"));
  }));
  checks.add(control("REDACT-02","short-credential-no-minimum",()->assertEquals("[redacted] a[redacted]",new Secrets(Credentials.monitor("x"),Json.parse("{}")).redact("x ax",128))));
  checks.add(control("REDACT-03","declared-names-booleans-and-marker",()->{
   var s=secrets("{\"body\":{\"uuid\":\""+UUID+"\",\"motivo\":\"private-reason\",\"future_flag\":true}}");
   assertEquals("body uuid motivo true false [redacted] 418",s.redact("body uuid motivo true false [redacted] 418",512));
   assertEquals("[redacted]",s.redact("private-reason",128));
  }));
  checks.add(control("REDACT-03","unknown-extension-key-stays-private",()->assertEquals("[redacted]",secrets("{\"private-extension-key\":false}").redact("private-extension-key",128))));
  checks.add(control("REDACT-03","private-values-override-public-vocabulary",()->{
   var s=new Secrets(Credentials.monitor("true"),Json.parse("{\"body\":{\"motivo\":\"uuid\"}}"));
   assertEquals("body motivo [redacted] [redacted] false",s.redact("body motivo uuid true false",512));
  }));
  checks.add(control("REDACT-03","short-location-and-ipv6-punctuation",()->{
   var s=secrets("{}");s.observeLocation("http://[::1]/a?x=z#b");
   assertEquals("IPv6 :: punctuation : / a public bbb size [redacted] [redacted]",s.redact("IPv6 :: punctuation : / a public bbb size z b",512));
  }));
  checks.add(control("REDACT-03","short-relative-location",()->{var s=secrets("{}");s.observeLocation("z");assertEquals("size [redacted]",s.redact("size z",128));}));
  for(boolean lower:List.of(false,true))for(boolean malformed:List.of(false,true))checks.add(control("REDACT-04","encoded-delimiters-"+lower+"-malformed-"+malformed,()->{
   var s=secrets("{}");String opaque="MiXeD-opaque-Value";s.observeLocation("/safe/"+(malformed?"%zz/":"")+encoded("?token="+opaque,lower));
   assertEquals("[redacted] "+opaque.toLowerCase(Locale.ROOT),s.redact(opaque+" "+opaque.toLowerCase(Locale.ROOT),512));assertTrue(s.contains(opaque));assertFalse(s.contains(opaque.toLowerCase(Locale.ROOT)));
  }));
  checks.add(control("REDACT-04","contextual-uuid-ascii-case",()->{
   var s=secrets("{}");s.observeLocation("https://[invalid/private/%zz/"+encoded(CAP,true));
   assertEquals("[redacted] [redacted]",s.redact(CAP.toLowerCase(Locale.ROOT)+" "+CAP.toUpperCase(Locale.ROOT),512));
  }));
  checks.add(control("REDACT-04","uuid-shaped-opaque-is-case-sensitive",()->{
   var s=secrets("{}");s.observeLocation("/safe?opaque="+CAP);assertEquals(CAP.toLowerCase(Locale.ROOT),s.redact(CAP.toLowerCase(Locale.ROOT),512));assertEquals("[redacted]",s.redact(CAP,512));
  }));
  for(String location:List.of("/safe#fragment-secret","/safe#token=fragment-secret","/safe;token=fragment-secret","https://[invalid;token=fragment-secret/safe","/safe?public=yes;token=fragment-secret"))checks.add(control("REDACT-05","location-"+location,()->{
   var s=secrets("{}");s.observeLocation(location);assertEquals("Public [redacted] done",s.redact("Public fragment-secret done",512));if(location.contains("[invalid"))assertNull(RedirectTarget.from(location));
  }));
  checks.add(control("REDACT-05","ordinary-relative-path-is-public",()->{var s=secrets("{}");s.observeLocation("/public/report");assertEquals("public report",s.redact("public report",128));}));
  checks.add(control("REDACT-06","exact-numeric-equivalence",()->{
   var s=secrets("{\"body\":{\"future_amount\":123.4500}}");assertEquals("[redacted] [redacted] -123.45 123.4501",s.redact("123.45000 1.2345e2 -123.45 123.4501",512));assertNull(s.correlation("12345e-2"));assertEquals("12346e-2",s.correlation("12346e-2"));
  }));
  checks.add(control("REDACT-06","compact-exponents-never-expand",()->{
   var s=secrets("{\"body\":{\"future_amount\":\"1e100000000\",\"other\":\"0e-100000000\"}}");
   assertEquals("[redacted] [redacted] 2e100000000",s.redact("10e99999999 0.000 2e100000000",512));
  }));
  checks.add(control("REDACT-06","all-projected-surfaces",()->{
   var s=new Secrets(Credentials.company("ABCD-1234","1234-WXYZ","unrelated-access","unrelated-secret"),Json.parse("{}"));
   var d=ProviderDetails.from(Json.parse("{\"code\":\"PUBLIC\",\"message\":\"Public ABCD-1234-WXYZ\",\"errors\":{\"ABCD-1234-WXYZ\":[\"ABCD-1234-WXYZ\"]}}"),s);
   assertEquals("PUBLIC",d.getCode());assertEquals("Public [redacted]",d.getMessage());assertEquals(new ProviderDetails.Violation("[redacted]","[redacted]"),d.getViolations().get(0));assertFalse(d.toJson().toString().contains("WXYZ"));assertFalse(d.toString().contains("WXYZ"));
  }));
  checks.add(control("REDACT-06","numeric-and-literal-union",()->{
   var s=new Secrets(Credentials.monitor(".45-private"),Json.parse("{\"body\":{\"private-number\":123.45}}"));
   assertEquals("[redacted]",s.redact("123.45-private",128));
  }));
  for(int count:List.of(8,32,96))checks.add(control("REDACT-07","bounded-similar-family-"+count,()->{
   var snapshot=Json.parse("{}");var text=new StringBuilder("Public ");for(int i=0;i<count;i++){String token="similar-private-prefix-"+i+"-tail";((ObjectNode)snapshot).put("private-"+i,token);text.append(token).append(' ');}
   var s=new Secrets(company(),snapshot);long start=System.nanoTime();String safe=s.redact(text.toString(),2048);assertTrue(TimeUnit.NANOSECONDS.toMillis(System.nanoTime()-start)<1000);assertTrue(safe.length()<=2049);assertFalse(safe.contains("similar-private-prefix"));assertFalse(safe.contains("-tail"));
   assertEquals("Unrelated public sentence",s.redact("Unrelated public sentence",128));
  }));
  checks.add(control("REDACT-07","bounded-input-fails-closed",()->assertEquals("[truncated]",secrets("{}").redact("p".repeat(8193)+" synthetic-secret",2048))));
  return checks.stream();
 }
 @TestFactory Stream<DynamicTest> typedLocalRequests() {
  var checks=new ArrayList<DynamicTest>();
  for(boolean tls:List.of(false,true))for(String mime:List.of("application/json","application/problem+json","text/plain")) {
   String transport=(tls?"tls":"http")+"-"+mime;
   for(boolean reversed:List.of(false,true))checks.add(control("REDACT-01","typed-"+transport+"-reverse-"+reversed,()->{
    try(var source=new SocketFixture(tls);var client=new WebmaniaClient(source.config("api1/fiscal.openapi.json"),Credentials.company(reversed?"1234-WXYZ":"ABCD-1234",reversed?"ABCD-1234":"1234-WXYZ","unrelated-access","unrelated-secret"))) {
     source.reply=new SocketFixture.Reply(500,mime,"{\"error\":\"Public rejection: ABCD-1234-WXYZ; inspection complete.\"}".getBytes(StandardCharsets.UTF_8),Map.of(),0,0,null,false);
     var request=new NfeCancelDocumentRequest().setBody(new NfeCancelRequest().setUuid(Uuid.ofVariant0(UUID)).setMotivo("Synthetic cancellation reason for controlled testing"));
     var e=assertThrows(ApiException.class,()->client.nfeCancelDocument(request));assertEquals("Public rejection: [redacted]; inspection complete.",e.details().getMessage());assertEquals(500,e.status());assertTrue(e.outcomeUncertain());assertEquals(1,source.requests.size());assertNotNull(e.reference());assertEquals(UUID,e.reference().value());assertNull(e.getCause());assertFalse(e.toString().contains("WXYZ"));
    }
   }));
   for(String mode:List.of("encoded","fragment","matrix","short","relative"))checks.add(control(mode.equals("encoded")?"REDACT-04":mode.equals("short")?"REDACT-02":mode.equals("relative")?"REDACT-03":"REDACT-05","typed-"+transport+"-"+mode,()->{
    String token=mode.equals("short")?"z":UUID;String location=switch(mode){case "encoded"->"/private/%zz/"+encoded("?token="+token,true);case "fragment"->"/private#token="+token;case "matrix"->"https://[invalid/private;token="+token;case "short"->"/private?x=z";default->"/public/report";};
    try(var source=new SocketFixture(tls);var destination=new SocketFixture(tls);var client=new WebmaniaClient(source.config("api1/fiscal.openapi.json"),company())) {
     String message=mode.equals("relative")?"body uuid motivo true false [redacted] 418":"Public "+token+"; size label abc";
     var json=com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode().put("message",message);source.reply=new SocketFixture.Reply(302,mime,Json.bytes(json),Map.of("Location",location,"X-Request-ID",token),0,0,null,false);
     var request=new NfeCancelDocumentRequest().setBody(new NfeCancelRequest().setUuid(Uuid.ofVariant0(UUID)).setMotivo("Synthetic cancellation reason for controlled testing"));
     var e=assertThrows(ApiException.class,()->client.nfeCancelDocument(request));assertEquals(ApiException.Kind.REDIRECT,e.kind());assertTrue(e.outcomeUncertain());assertEquals(1,source.requests.size());assertEquals(0,destination.requests.size());assertEquals(mode.equals("relative")?message:"Public [redacted]; size label abc",e.details().getMessage());
     if(mode.equals("encoded")||mode.equals("fragment")||mode.equals("matrix")){assertNull(e.reference());assertNull(e.correlation());}else assertNotNull(e.reference());
     if(mode.equals("matrix")||mode.equals("encoded"))assertNull(e.redirect());else {assertNotNull(e.redirect());assertEquals(location,e.redirect().value());assertFalse(e.redirect().toString().contains(token));}
    }
   }));
   checks.add(control("REDACT-06","typed-fiscal-"+transport,()->{
    try(var source=new SocketFixture(tls);var client=new WebmaniaClient(source.config("api1/fiscal.openapi.json"),company())) {
     var input=OperationSocketTest.FIXTURES.get("nfeIssueDocument").path("input").deepCopy();((ObjectNode)input.path("body")).put("ID","safe-order").putObject("extra_data").put("fiscal_memo","SYNTHETIC-FISCAL-VALUE").put("private-numeric-field","123.4500");
     source.reply=new SocketFixture.Reply(422,mime,"{\"error\":true,\"code\":\"VALIDATION_FAILED\",\"message\":\"Invalid produtos nome: SYNTHETIC-FISCAL-VALUE amount 1.2345e2; true false\",\"errors\":{\"produtos\":[\"nome must be a string\"]}}".getBytes(StandardCharsets.UTF_8),Map.of(),0,0,null,false);
     var e=assertThrows(ApiException.class,()->client.nfeIssueDocument(new NfeIssueDocumentRequest(input)));assertEquals(422,e.status());assertTrue(e.outcomeUncertain());assertEquals(1,source.requests.size());assertEquals("VALIDATION_FAILED",e.details().getCode());assertEquals("Invalid produtos nome: [redacted] amount [redacted]; true false",e.details().getMessage());assertEquals(new ProviderDetails.Violation("produtos","nome must be a string"),e.details().getViolations().get(0));assertEquals("safe-order",e.reference().value());assertFalse(e.reference().toString().contains("safe-order"));
    }
   }));
   checks.add(control("REDACT-07","typed-quota-"+transport,()->{
    try(var source=new SocketFixture(tls);var client=new WebmaniaClient(source.config("api1/fiscal.openapi.json"),company())) {
     var response=com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode().put("error",true).put("message","p".repeat(8193)+" synthetic-secret");
     source.reply=new SocketFixture.Reply(500,mime,Json.bytes(response),Map.of("X-Request-ID","safe-correlation"),0,0,null,false);
     var request=new NfeCancelDocumentRequest().setBody(new NfeCancelRequest().setUuid(Uuid.ofVariant0(UUID)).setMotivo("Synthetic cancellation reason for controlled testing"));
     var e=assertThrows(ApiException.class,()->client.nfeCancelDocument(request));assertEquals(ApiException.Kind.API,e.kind());assertEquals("[truncated]",e.details().getMessage());assertTrue(e.outcomeUncertain());assertEquals(1,source.requests.size());assertEquals("safe-correlation",e.correlation());assertEquals(UUID,e.reference().value());
    }
   }));
  }
  return checks.stream();
 }
}
