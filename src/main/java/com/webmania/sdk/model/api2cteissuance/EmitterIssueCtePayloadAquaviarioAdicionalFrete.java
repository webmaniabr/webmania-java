package com.webmania.sdk.model.api2cteissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/cte-issuance.openapi.json; see contract-provenance.json. */
public final class EmitterIssueCtePayloadAquaviarioAdicionalFrete extends JsonValue {
 private static final JsonNode SCHEMA = Json.parse("{\"type\":[\"number\",\"string\"],\"pattern\":\"^-?(?:\\\\d+\\\\.?\\\\d*|\\\\.\\\\d+)(?:[eE][+-]?\\\\d+)?$\",\"minimum\":0.0,\"maximum\":9999999999999.99,\"x-sdk-numeric-minimum\":\"0\",\"x-sdk-numeric-maximum\":\"9999999999999.99\",\"x-conditional-rules\":[\"required_if:modalidade,3\"],\"description\":\"Valor adicional de frete\",\"x-documented-condition\":\"Valor adicional de frete\",\"x-documented-size\":\"13v2\"}");
 public EmitterIssueCtePayloadAquaviarioAdicionalFrete(JsonNode node) { super(node); }
 private static final JsonNode VARIANT_0 = Json.parse("{\"type\":\"number\",\"pattern\":\"^-?(?:\\\\d+\\\\.?\\\\d*|\\\\.\\\\d+)(?:[eE][+-]?\\\\d+)?$\",\"minimum\":0.0,\"maximum\":9999999999999.99,\"x-sdk-numeric-minimum\":\"0\",\"x-sdk-numeric-maximum\":\"9999999999999.99\",\"x-conditional-rules\":[\"required_if:modalidade,3\"],\"description\":\"Valor adicional de frete\",\"x-documented-condition\":\"Valor adicional de frete\",\"x-documented-size\":\"13v2\"}");
 public static EmitterIssueCtePayloadAquaviarioAdicionalFrete ofVariant0(java.math.BigDecimal value) { return new EmitterIssueCtePayloadAquaviarioAdicionalFrete(Json.scalar(value)); }
 public boolean matchesVariant0() { return matchesVariant("api2/cte-issuance.openapi.json", SCHEMA, VARIANT_0); }
 public java.math.BigDecimal asVariant0() { JsonNode value = checkedVariant("api2/cte-issuance.openapi.json", SCHEMA, VARIANT_0); return decimalValue(value); }
 private static final JsonNode VARIANT_1 = Json.parse("{\"type\":\"string\",\"pattern\":\"^-?(?:\\\\d+\\\\.?\\\\d*|\\\\.\\\\d+)(?:[eE][+-]?\\\\d+)?$\",\"minimum\":0.0,\"maximum\":9999999999999.99,\"x-sdk-numeric-minimum\":\"0\",\"x-sdk-numeric-maximum\":\"9999999999999.99\",\"x-conditional-rules\":[\"required_if:modalidade,3\"],\"description\":\"Valor adicional de frete\",\"x-documented-condition\":\"Valor adicional de frete\",\"x-documented-size\":\"13v2\"}");
 public static EmitterIssueCtePayloadAquaviarioAdicionalFrete ofVariant1(String value) { return new EmitterIssueCtePayloadAquaviarioAdicionalFrete(Json.scalar(value)); }
 public boolean matchesVariant1() { return matchesVariant("api2/cte-issuance.openapi.json", SCHEMA, VARIANT_1); }
 public String asVariant1() { JsonNode value = checkedVariant("api2/cte-issuance.openapi.json", SCHEMA, VARIANT_1); return stringValue(value); }
}
