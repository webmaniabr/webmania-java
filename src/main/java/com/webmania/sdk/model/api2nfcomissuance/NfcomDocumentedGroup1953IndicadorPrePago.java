package com.webmania.sdk.model.api2nfcomissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/nfcom-issuance.openapi.json; see contract-provenance.json. */
public final class NfcomDocumentedGroup1953IndicadorPrePago extends JsonValue {
 private static final JsonNode SCHEMA = Json.parse("{\"type\":[\"integer\",\"string\"],\"description\":\"Indica se o servi\\u00e7o \\u00e9 pr\\u00e9-pago 1 - Servi\\u00e7o pr\\u00e9-pago\",\"x-documented-size\":\"1\"}");
 public NfcomDocumentedGroup1953IndicadorPrePago(JsonNode node) { super(node); }
 private static final JsonNode VARIANT_0 = Json.parse("{\"type\":\"integer\",\"description\":\"Indica se o servi\\u00e7o \\u00e9 pr\\u00e9-pago 1 - Servi\\u00e7o pr\\u00e9-pago\",\"x-documented-size\":\"1\"}");
 public static NfcomDocumentedGroup1953IndicadorPrePago ofVariant0(java.math.BigInteger value) { return new NfcomDocumentedGroup1953IndicadorPrePago(Json.scalar(value)); }
 public boolean matchesVariant0() { return matchesVariant("api2/nfcom-issuance.openapi.json", SCHEMA, VARIANT_0); }
 public java.math.BigInteger asVariant0() { JsonNode value = checkedVariant("api2/nfcom-issuance.openapi.json", SCHEMA, VARIANT_0); return integerValue(value); }
 private static final JsonNode VARIANT_1 = Json.parse("{\"type\":\"string\",\"description\":\"Indica se o servi\\u00e7o \\u00e9 pr\\u00e9-pago 1 - Servi\\u00e7o pr\\u00e9-pago\",\"x-documented-size\":\"1\"}");
 public static NfcomDocumentedGroup1953IndicadorPrePago ofVariant1(String value) { return new NfcomDocumentedGroup1953IndicadorPrePago(Json.scalar(value)); }
 public boolean matchesVariant1() { return matchesVariant("api2/nfcom-issuance.openapi.json", SCHEMA, VARIANT_1); }
 public String asVariant1() { JsonNode value = checkedVariant("api2/nfcom-issuance.openapi.json", SCHEMA, VARIANT_1); return stringValue(value); }
}
