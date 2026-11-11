package com.webmania.sdk.model.api2cteissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/cte-issuance.openapi.json; see contract-provenance.json. */
public final class CteDocumentedGroup6120Sequencia extends JsonValue {
 private static final JsonNode SCHEMA = Json.parse("{\"type\":[\"integer\",\"string\"],\"description\":\"N\\u00famero sequencial deste evento de cancelamento (1 a 999).\",\"x-documented-size\":\"1-3\"}");
 public CteDocumentedGroup6120Sequencia(JsonNode node) { super(node); }
 private static final JsonNode VARIANT_0 = Json.parse("{\"type\":\"integer\",\"description\":\"N\\u00famero sequencial deste evento de cancelamento (1 a 999).\",\"x-documented-size\":\"1-3\"}");
 public static CteDocumentedGroup6120Sequencia ofVariant0(java.math.BigInteger value) { return new CteDocumentedGroup6120Sequencia(Json.scalar(value)); }
 public boolean matchesVariant0() { return matchesVariant("api2/cte-issuance.openapi.json", SCHEMA, VARIANT_0); }
 public java.math.BigInteger asVariant0() { JsonNode value = checkedVariant("api2/cte-issuance.openapi.json", SCHEMA, VARIANT_0); return integerValue(value); }
 private static final JsonNode VARIANT_1 = Json.parse("{\"type\":\"string\",\"description\":\"N\\u00famero sequencial deste evento de cancelamento (1 a 999).\",\"x-documented-size\":\"1-3\"}");
 public static CteDocumentedGroup6120Sequencia ofVariant1(String value) { return new CteDocumentedGroup6120Sequencia(Json.scalar(value)); }
 public boolean matchesVariant1() { return matchesVariant("api2/cte-issuance.openapi.json", SCHEMA, VARIANT_1); }
 public String asVariant1() { JsonNode value = checkedVariant("api2/cte-issuance.openapi.json", SCHEMA, VARIANT_1); return stringValue(value); }
}
