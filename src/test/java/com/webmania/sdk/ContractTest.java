package com.webmania.sdk;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ContractTest {
 @Test void pinnedCases() throws Exception {
  try(var in=getClass().getResourceAsStream("/schema-cases.json")) {
   assertNotNull(in);
   for(var c:Json.parse(in.readAllBytes())) {
    boolean actual=Contract.accepts(c.path("module").asText(),c.path("schema").asText(),new JsonValue(c.get("instance")));
    assertEquals(c.path("valid").booleanValue(),actual,c.path("id").asText());
   }
  }
 }
 @Test void catalogAndDisabledCapability() {
  assertEquals(103,Contract.operationIds().size());
  long enabled=Contract.operationIds().stream().filter(x->Contract.operation(x).path("enabled").asBoolean()).count();assertEquals(102,enabled);
 }
}
