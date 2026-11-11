package com.webmania.sdk.model.api2dceissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/dce-issuance.openapi.json; see contract-provenance.json. */
public final class DceItemGroupQuantidade extends JsonValue {
 private static final JsonNode SCHEMA = Json.parse("{\"type\":[\"number\",\"string\"],\"pattern\":\"^-?(?:\\\\d+\\\\.?\\\\d*|\\\\.\\\\d+)(?:[eE][+-]?\\\\d+)?$\",\"minimum\":0.0,\"maximum\":99999999999.9999,\"x-sdk-numeric-minimum\":\"0\",\"x-sdk-numeric-maximum\":\"99999999999.9999\",\"description\":\"Quantidade do item. Aceita at\\u00e9 4 casas decimais.\",\"x-documented-condition\":\"Quantidade do item. Aceita at\\u00e9 4 casas decimais.\",\"x-documented-size\":\"13v4\"}");
 public DceItemGroupQuantidade(JsonNode node) { super(node); }
 private static final JsonNode VARIANT_0 = Json.parse("{\"type\":\"number\",\"pattern\":\"^-?(?:\\\\d+\\\\.?\\\\d*|\\\\.\\\\d+)(?:[eE][+-]?\\\\d+)?$\",\"minimum\":0.0,\"maximum\":99999999999.9999,\"x-sdk-numeric-minimum\":\"0\",\"x-sdk-numeric-maximum\":\"99999999999.9999\",\"description\":\"Quantidade do item. Aceita at\\u00e9 4 casas decimais.\",\"x-documented-condition\":\"Quantidade do item. Aceita at\\u00e9 4 casas decimais.\",\"x-documented-size\":\"13v4\"}");
 public static DceItemGroupQuantidade ofVariant0(java.math.BigDecimal value) { return new DceItemGroupQuantidade(Json.scalar(value)); }
 public boolean matchesVariant0() { return matchesVariant("api2/dce-issuance.openapi.json", SCHEMA, VARIANT_0); }
 public java.math.BigDecimal asVariant0() { JsonNode value = checkedVariant("api2/dce-issuance.openapi.json", SCHEMA, VARIANT_0); return decimalValue(value); }
 private static final JsonNode VARIANT_1 = Json.parse("{\"type\":\"string\",\"pattern\":\"^-?(?:\\\\d+\\\\.?\\\\d*|\\\\.\\\\d+)(?:[eE][+-]?\\\\d+)?$\",\"minimum\":0.0,\"maximum\":99999999999.9999,\"x-sdk-numeric-minimum\":\"0\",\"x-sdk-numeric-maximum\":\"99999999999.9999\",\"description\":\"Quantidade do item. Aceita at\\u00e9 4 casas decimais.\",\"x-documented-condition\":\"Quantidade do item. Aceita at\\u00e9 4 casas decimais.\",\"x-documented-size\":\"13v4\"}");
 public static DceItemGroupQuantidade ofVariant1(String value) { return new DceItemGroupQuantidade(Json.scalar(value)); }
 public boolean matchesVariant1() { return matchesVariant("api2/dce-issuance.openapi.json", SCHEMA, VARIANT_1); }
 public String asVariant1() { JsonNode value = checkedVariant("api2/dce-issuance.openapi.json", SCHEMA, VARIANT_1); return stringValue(value); }
}
