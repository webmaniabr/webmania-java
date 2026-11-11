package com.webmania.sdk;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.HexFormat;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ConsumerArtifactTest {
 @Test void cleanMavenConsumerResolvesAndRunsExactInstalledCandidate()throws Exception {
  String expected=System.getProperty("webmania.expectedArtifactSha");if(expected==null)return;
  Path artifact=Path.of(WebmaniaClient.class.getProtectionDomain().getCodeSource().getLocation().toURI());
  Path repository=artifact;for(int i=0;i<5;i++)repository=repository.getParent();
  Path temporary=Files.createTempDirectory("webmania-maven-consumer-");
  try(var server=new SocketFixture(false)) {
   Path source=Path.of("examples/consumer");
   try(var paths=Files.walk(source)) {for(Path p:paths.filter(x->!x.toString().contains("target")).toList()) {Path target=temporary.resolve(source.relativize(p));if(Files.isDirectory(p))Files.createDirectories(target);else Files.copy(p,target);}}
   var build=new ProcessBuilder("mvn","-o","-B","-ntp","-Dmaven.repo.local="+repository,"package","dependency:build-classpath","-Dmdep.outputFile=classpath.txt").directory(temporary.toFile()).redirectErrorStream(true).start();
   byte[] buildOutput=build.getInputStream().readAllBytes();assertTrue(build.waitFor(60,TimeUnit.SECONDS),"Clean consumer build deadline");assertEquals(0,build.exitValue(),new String(buildOutput,StandardCharsets.UTF_8));
   String classpath=Files.readString(temporary.resolve("classpath.txt")).strip();Path selected=null;for(String item:classpath.split(java.util.regex.Pattern.quote(java.io.File.pathSeparator)))if(item.contains("webmania-sdk-"))selected=Path.of(item);
   assertNotNull(selected);assertEquals(artifact.toRealPath(),selected.toRealPath());assertEquals(expected,HexFormat.of().formatHex(MessageDigest.getInstance("SHA-256").digest(Files.readAllBytes(selected))));
   server.reply=SocketFixture.Reply.json(OperationSocketTest.FIXTURES.get("monitorListCompanies").path("response").toString());
   String javaExecutable=Path.of(System.getProperty("java.home"),"bin","java").toString();
   var run=new ProcessBuilder(javaExecutable,"-cp",temporary.resolve("target/classes")+java.io.File.pathSeparator+classpath,"Quickstart",server.origin().toString()).directory(temporary.toFile()).redirectErrorStream(true);run.environment().put("WEBMANIA_MONITOR_TOKEN","synthetic-monitor");Process process=run.start();String output=new String(process.getInputStream().readAllBytes(),StandardCharsets.UTF_8);assertTrue(process.waitFor(15,TimeUnit.SECONDS));assertEquals(0,process.exitValue(),output);assertEquals("HTTP 200",output.strip());assertEquals(1,server.requests.size());assertEquals("/2/monitor/empresas?page=1&per_page=10",server.requests.get(0).target());assertEquals("Bearer synthetic-monitor",server.requests.get(0).headers().get("authorization"));
   server.responder=request-> {
    String operation=request.method().equals("POST")?"monitorCreateCompany":"monitorUpdateCompany";
    int status=request.method().equals("POST")?201:200;
    return new SocketFixture.Reply(status,"application/json",OperationSocketTest.FIXTURES.get(operation).path("response").toString().getBytes(StandardCharsets.UTF_8),java.util.Map.of(),0,0,null,false);
   };
   var management=new ProcessBuilder(javaExecutable,"-cp",temporary.resolve("target/classes")+java.io.File.pathSeparator+classpath,"TypedManagementExample",server.origin().toString()).directory(temporary.toFile()).redirectErrorStream(true);management.environment().put("WEBMANIA_MONITOR_TOKEN","synthetic-monitor");
   Process typed=management.start();String typedOutput=new String(typed.getInputStream().readAllBytes(),StandardCharsets.UTF_8);assertTrue(typed.waitFor(15,TimeUnit.SECONDS));assertEquals(0,typed.exitValue(),typedOutput);assertEquals("HTTP 201 200",typedOutput.strip());assertEquals(3,server.requests.size());assertEquals("POST",server.requests.get(1).method());assertEquals("PUT",server.requests.get(2).method());assertTrue(server.requests.get(2).target().endsWith("00000000-0000-4000-8000-000000000001"));
   assertEquals("Synthetic fixture",Json.parse(server.requests.get(1).body()).path("razao_social").asText());assertEquals("Synthetic updated",Json.parse(server.requests.get(2).body()).path("razao_social").asText());
   System.out.println("Clean consumer resolved and executed candidate SHA-256 "+expected);
  }finally{try(var paths=Files.walk(temporary)){for(Path p:paths.sorted(java.util.Comparator.reverseOrder()).toList())Files.deleteIfExists(p);}}
 }
}
