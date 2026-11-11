package com.webmania.sdk.model.api2cteissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/cte-issuance.openapi.json; see contract-provenance.json. */
public final class EmitterIssueCtePayloadImpostosIcmsAliquota extends JsonValue {
 private static final JsonNode SCHEMA = Json.parse("{\"type\":[\"number\",\"string\"],\"pattern\":\"^-?(?:\\\\d+\\\\.?\\\\d*|\\\\.\\\\d+)(?:[eE][+-]?\\\\d+)?$\",\"minimum\":0.0,\"maximum\":999.99,\"x-sdk-numeric-minimum\":\"0\",\"x-sdk-numeric-maximum\":\"999.99\",\"description\":\"Al\\u00edquota do ICMS\",\"x-documented-condition\":\"Al\\u00edquota do ICMS\",\"x-documented-size\":\"3v2\"}");
 public EmitterIssueCtePayloadImpostosIcmsAliquota(JsonNode node) { super(node); }
 private static final JsonNode VARIANT_0 = Json.parse("{\"type\":\"number\",\"pattern\":\"^-?(?:\\\\d+\\\\.?\\\\d*|\\\\.\\\\d+)(?:[eE][+-]?\\\\d+)?$\",\"minimum\":0.0,\"maximum\":999.99,\"x-sdk-numeric-minimum\":\"0\",\"x-sdk-numeric-maximum\":\"999.99\",\"description\":\"Al\\u00edquota do ICMS\",\"x-documented-condition\":\"Al\\u00edquota do ICMS\",\"x-documented-size\":\"3v2\"}");
 public static EmitterIssueCtePayloadImpostosIcmsAliquota ofVariant0(java.math.BigDecimal value) { return new EmitterIssueCtePayloadImpostosIcmsAliquota(Json.scalar(value)); }
 public boolean matchesVariant0() { return matchesVariant("api2/cte-issuance.openapi.json", SCHEMA, VARIANT_0); }
 public java.math.BigDecimal asVariant0() { JsonNode value = checkedVariant("api2/cte-issuance.openapi.json", SCHEMA, VARIANT_0); return decimalValue(value); }
 private static final JsonNode VARIANT_1 = Json.parse("{\"type\":\"string\",\"pattern\":\"^-?(?:\\\\d+\\\\.?\\\\d*|\\\\.\\\\d+)(?:[eE][+-]?\\\\d+)?$\",\"minimum\":0.0,\"maximum\":999.99,\"x-sdk-numeric-minimum\":\"0\",\"x-sdk-numeric-maximum\":\"999.99\",\"description\":\"Al\\u00edquota do ICMS\",\"x-documented-condition\":\"Al\\u00edquota do ICMS\",\"x-documented-size\":\"3v2\"}");
 public static EmitterIssueCtePayloadImpostosIcmsAliquota ofVariant1(String value) { return new EmitterIssueCtePayloadImpostosIcmsAliquota(Json.scalar(value)); }
 public boolean matchesVariant1() { return matchesVariant("api2/cte-issuance.openapi.json", SCHEMA, VARIANT_1); }
 public String asVariant1() { JsonNode value = checkedVariant("api2/cte-issuance.openapi.json", SCHEMA, VARIANT_1); return stringValue(value); }
}
