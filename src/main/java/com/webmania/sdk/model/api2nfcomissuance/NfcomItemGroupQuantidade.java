package com.webmania.sdk.model.api2nfcomissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/nfcom-issuance.openapi.json; see contract-provenance.json. */
public final class NfcomItemGroupQuantidade extends JsonValue {
 private static final JsonNode SCHEMA = Json.parse("{\"type\":[\"number\",\"string\"],\"pattern\":\"^-?(?:\\\\d+\\\\.?\\\\d*|\\\\.\\\\d+)(?:[eE][+-]?\\\\d+)?$\",\"minimum\":0.0001,\"x-sdk-numeric-minimum\":\"0.0001\",\"maximum\":99999999999.9999,\"x-sdk-numeric-maximum\":\"99999999999.9999\",\"description\":\"Quantidade do item (at\\u00e9 4 casas decimais)\",\"x-documented-condition\":\"Quantidade do item (at\\u00e9 4 casas decimais)\",\"x-documented-size\":\"15v4\"}");
 public NfcomItemGroupQuantidade(JsonNode node) { super(node); }
 private static final JsonNode VARIANT_0 = Json.parse("{\"type\":\"number\",\"pattern\":\"^-?(?:\\\\d+\\\\.?\\\\d*|\\\\.\\\\d+)(?:[eE][+-]?\\\\d+)?$\",\"minimum\":0.0001,\"x-sdk-numeric-minimum\":\"0.0001\",\"maximum\":99999999999.9999,\"x-sdk-numeric-maximum\":\"99999999999.9999\",\"description\":\"Quantidade do item (at\\u00e9 4 casas decimais)\",\"x-documented-condition\":\"Quantidade do item (at\\u00e9 4 casas decimais)\",\"x-documented-size\":\"15v4\"}");
 public static NfcomItemGroupQuantidade ofVariant0(java.math.BigDecimal value) { return new NfcomItemGroupQuantidade(Json.scalar(value)); }
 public boolean matchesVariant0() { return matchesVariant("api2/nfcom-issuance.openapi.json", SCHEMA, VARIANT_0); }
 public java.math.BigDecimal asVariant0() { JsonNode value = checkedVariant("api2/nfcom-issuance.openapi.json", SCHEMA, VARIANT_0); return decimalValue(value); }
 private static final JsonNode VARIANT_1 = Json.parse("{\"type\":\"string\",\"pattern\":\"^-?(?:\\\\d+\\\\.?\\\\d*|\\\\.\\\\d+)(?:[eE][+-]?\\\\d+)?$\",\"minimum\":0.0001,\"x-sdk-numeric-minimum\":\"0.0001\",\"maximum\":99999999999.9999,\"x-sdk-numeric-maximum\":\"99999999999.9999\",\"description\":\"Quantidade do item (at\\u00e9 4 casas decimais)\",\"x-documented-condition\":\"Quantidade do item (at\\u00e9 4 casas decimais)\",\"x-documented-size\":\"15v4\"}");
 public static NfcomItemGroupQuantidade ofVariant1(String value) { return new NfcomItemGroupQuantidade(Json.scalar(value)); }
 public boolean matchesVariant1() { return matchesVariant("api2/nfcom-issuance.openapi.json", SCHEMA, VARIANT_1); }
 public String asVariant1() { JsonNode value = checkedVariant("api2/nfcom-issuance.openapi.json", SCHEMA, VARIANT_1); return stringValue(value); }
}
