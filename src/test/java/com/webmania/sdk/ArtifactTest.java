package com.webmania.sdk;
import java.nio.file.Files;
import java.nio.file.Path;
import java.security.MessageDigest;
import java.util.HexFormat;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ArtifactTest {
 @Test void installedCandidateIsTheLoadedSdk()throws Exception {
  String expected=System.getProperty("webmania.expectedArtifactSha");
  if(expected!=null) {
   Path source=Path.of(WebmaniaClient.class.getProtectionDomain().getCodeSource().getLocation().toURI());
   assertTrue(source.toString().endsWith(".jar"));assertEquals(expected,HexFormat.of().formatHex(MessageDigest.getInstance("SHA-256").digest(Files.readAllBytes(source))));
   System.out.println("Loaded installed candidate SHA-256 "+expected);
  } else assertNotNull(WebmaniaClient.class.getProtectionDomain().getCodeSource());
 }
}
