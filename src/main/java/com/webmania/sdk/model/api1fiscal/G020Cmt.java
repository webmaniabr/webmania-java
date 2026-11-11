package com.webmania.sdk.model.api1fiscal;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api1/fiscal.openapi.json; see contract-provenance.json. */
public final class G020Cmt extends JsonValue {
 private static final JsonNode SCHEMA = Json.parse("{\"anyOf\":[{\"type\":\"string\",\"pattern\":\"^-?[0-9]{1,30}(?:[.,][0-9]{1,10})?$\"},{\"type\":\"number\"}],\"x-sdk-scalar\":\"decimal-input\",\"x-sdk-preferred-representation\":\"string\",\"x-decimal-digits\":30,\"x-decimal-scale-maximum\":10,\"description\":\"Capacidade M\\u00e1xima de Tra\\u00e7\\u00e3o | 0.0000 (em toneladas com 4 casas decimais)\",\"x-documentation-type\":\"integer\",\"x-documentation-size\":\"1-9v4\",\"x-documentation-requirements\":[{\"column\":\"NF-e\",\"markers\":[\"obrigatorio\",\"svg_required\"]}]}");
 public G020Cmt(JsonNode node) { super(node); }
 private static final JsonNode VARIANT_0 = SCHEMA.path("anyOf").path(0);
 public static G020Cmt ofVariant0(String value) { return new G020Cmt(Json.scalar(value)); }
 public boolean matchesVariant0() { return matchesVariant("api1/fiscal.openapi.json", SCHEMA, VARIANT_0); }
 public String asVariant0() { JsonNode value = checkedVariant("api1/fiscal.openapi.json", SCHEMA, VARIANT_0); return stringValue(value); }
 private static final JsonNode VARIANT_1 = SCHEMA.path("anyOf").path(1);
 public static G020Cmt ofVariant1(java.math.BigDecimal value) { return new G020Cmt(Json.scalar(value)); }
 public boolean matchesVariant1() { return matchesVariant("api1/fiscal.openapi.json", SCHEMA, VARIANT_1); }
 public java.math.BigDecimal asVariant1() { JsonNode value = checkedVariant("api1/fiscal.openapi.json", SCHEMA, VARIANT_1); return decimalValue(value); }
}
