package com.webmania.sdk;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

final class SecretsRenderedTextTest {
 private static Credentials credentials(){return Credentials.company("fixture-key","fixture-secret","fixture-access","fixture-access-secret");}
 @Test void displayCleanupCannotReconstructPrivateFiscalText() {
  String reason="Private fiscal reason for controlled testing";
  for(char control:new char[]{0,1,13,127,133}) {
   var secrets=new Secrets(credentials(),Json.scalar(reason));
   String provider="Provider: "+reason.replaceFirst(" ",String.valueOf(control));
   assertEquals("Provider: [redacted]",secrets.redact(provider,2048));
  }
 }
 @Test void originalControlLiteralsAndPublicLayoutRemainCorrect() {
  String original="private"+((char)0)+"fiscal";
  var secrets=new Secrets(credentials(),Json.scalar(original));
  assertEquals("Provider: [redacted]",secrets.redact("Provider: "+original,2048));
  assertEquals("Public note\nnext\tcolumn",secrets.redact("Public"+((char)0)+"note\nnext\tcolumn",2048));
 }
}
