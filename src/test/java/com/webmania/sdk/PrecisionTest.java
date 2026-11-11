package com.webmania.sdk;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PrecisionTest {
 @Test void everyNumericAnnotationUsesExactDecimalComparison()throws Exception {
  try(var in=getClass().getResourceAsStream("/numeric-annotations.json")) {
   assertNotNull(in);var cases=Json.parse(in.readAllBytes());assertEquals(259,cases.size());
   for(var c:cases) {
    var actual=Contract.document(c.path("module").asText()).at(c.path("pointer").asText());assertEquals(c.path("boundary").asText(),actual.path(c.path("keyword").asText()).asText());
    // Isolate each actual annotation from representation-pattern/length failures.
    var bound=JsonNodeFactory.instance.objectNode();bound.set(c.path("keyword").asText(),actual.path(c.path("keyword").asText()));
    assertTrue(Contract.valid(bound,Json.scalar(c.path("boundary").asText()),bound,0),c.path("pointer").asText());
    assertFalse(Contract.valid(bound,Json.scalar(c.path("outside").asText()),bound,0),c.path("pointer").asText());
   }
  }
 }
 @Test void typedUnionsPreserveDecimalTextAndNeverRequireDouble() {
  // The original positive exceeded the pinned 13-digit/2-decimal string branch.
  // TypedGetterTest retains that exact payload as an explicit rejected view.
  var value=com.webmania.sdk.model.api1fiscal.Decimal.ofVariant0("9007199254740.90");assertEquals("9007199254740.90",value.asVariant0());assertTrue(value.toJson().isTextual());
 }
}
