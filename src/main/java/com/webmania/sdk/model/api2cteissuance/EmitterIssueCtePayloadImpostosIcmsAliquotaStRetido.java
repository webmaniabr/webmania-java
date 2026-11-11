package com.webmania.sdk.model.api2cteissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/cte-issuance.openapi.json; see contract-provenance.json. */
public final class EmitterIssueCtePayloadImpostosIcmsAliquotaStRetido extends JsonValue {
 private static final JsonNode SCHEMA = Json.parse("{\"type\":[\"number\",\"string\"],\"pattern\":\"^-?(?:\\\\d+\\\\.?\\\\d*|\\\\.\\\\d+)(?:[eE][+-]?\\\\d+)?$\",\"minimum\":0.0,\"maximum\":999.99,\"x-sdk-numeric-minimum\":\"0\",\"x-sdk-numeric-maximum\":\"999.99\",\"description\":\"Al\\u00edquota com substitui\\u00e7\\u00e3o tribut\\u00e1ria\",\"x-documented-condition\":\"Al\\u00edquota com substitui\\u00e7\\u00e3o tribut\\u00e1ria\",\"x-documented-size\":\"3v2\"}");
 public EmitterIssueCtePayloadImpostosIcmsAliquotaStRetido(JsonNode node) { super(node); }
 private static final JsonNode VARIANT_0 = Json.parse("{\"type\":\"number\",\"pattern\":\"^-?(?:\\\\d+\\\\.?\\\\d*|\\\\.\\\\d+)(?:[eE][+-]?\\\\d+)?$\",\"minimum\":0.0,\"maximum\":999.99,\"x-sdk-numeric-minimum\":\"0\",\"x-sdk-numeric-maximum\":\"999.99\",\"description\":\"Al\\u00edquota com substitui\\u00e7\\u00e3o tribut\\u00e1ria\",\"x-documented-condition\":\"Al\\u00edquota com substitui\\u00e7\\u00e3o tribut\\u00e1ria\",\"x-documented-size\":\"3v2\"}");
 public static EmitterIssueCtePayloadImpostosIcmsAliquotaStRetido ofVariant0(java.math.BigDecimal value) { return new EmitterIssueCtePayloadImpostosIcmsAliquotaStRetido(Json.scalar(value)); }
 public boolean matchesVariant0() { return matchesVariant("api2/cte-issuance.openapi.json", SCHEMA, VARIANT_0); }
 public java.math.BigDecimal asVariant0() { JsonNode value = checkedVariant("api2/cte-issuance.openapi.json", SCHEMA, VARIANT_0); return decimalValue(value); }
 private static final JsonNode VARIANT_1 = Json.parse("{\"type\":\"string\",\"pattern\":\"^-?(?:\\\\d+\\\\.?\\\\d*|\\\\.\\\\d+)(?:[eE][+-]?\\\\d+)?$\",\"minimum\":0.0,\"maximum\":999.99,\"x-sdk-numeric-minimum\":\"0\",\"x-sdk-numeric-maximum\":\"999.99\",\"description\":\"Al\\u00edquota com substitui\\u00e7\\u00e3o tribut\\u00e1ria\",\"x-documented-condition\":\"Al\\u00edquota com substitui\\u00e7\\u00e3o tribut\\u00e1ria\",\"x-documented-size\":\"3v2\"}");
 public static EmitterIssueCtePayloadImpostosIcmsAliquotaStRetido ofVariant1(String value) { return new EmitterIssueCtePayloadImpostosIcmsAliquotaStRetido(Json.scalar(value)); }
 public boolean matchesVariant1() { return matchesVariant("api2/cte-issuance.openapi.json", SCHEMA, VARIANT_1); }
 public String asVariant1() { JsonNode value = checkedVariant("api2/cte-issuance.openapi.json", SCHEMA, VARIANT_1); return stringValue(value); }
}
