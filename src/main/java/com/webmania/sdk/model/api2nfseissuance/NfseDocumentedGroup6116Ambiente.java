package com.webmania.sdk.model.api2nfseissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/nfse-issuance.openapi.json; see contract-provenance.json. */
public final class NfseDocumentedGroup6116Ambiente extends JsonValue {
 private static final JsonNode SCHEMA = Json.parse("{\"type\":[\"number\",\"string\"],\"description\":\"Ambiente de emiss\\u00e3o da substitui\\u00e7\\u00e3o. 1 - Produ\\u00e7\\u00e3o 2 - Homologa\\u00e7\\u00e3o\",\"x-documented-size\":\"1\"}");
 public NfseDocumentedGroup6116Ambiente(JsonNode node) { super(node); }
 private static final JsonNode VARIANT_0 = Json.parse("{\"type\":\"number\",\"description\":\"Ambiente de emiss\\u00e3o da substitui\\u00e7\\u00e3o. 1 - Produ\\u00e7\\u00e3o 2 - Homologa\\u00e7\\u00e3o\",\"x-documented-size\":\"1\"}");
 public static NfseDocumentedGroup6116Ambiente ofVariant0(java.math.BigDecimal value) { return new NfseDocumentedGroup6116Ambiente(Json.scalar(value)); }
 public boolean matchesVariant0() { return matchesVariant("api2/nfse-issuance.openapi.json", SCHEMA, VARIANT_0); }
 public java.math.BigDecimal asVariant0() { JsonNode value = checkedVariant("api2/nfse-issuance.openapi.json", SCHEMA, VARIANT_0); return decimalValue(value); }
 private static final JsonNode VARIANT_1 = Json.parse("{\"type\":\"string\",\"description\":\"Ambiente de emiss\\u00e3o da substitui\\u00e7\\u00e3o. 1 - Produ\\u00e7\\u00e3o 2 - Homologa\\u00e7\\u00e3o\",\"x-documented-size\":\"1\"}");
 public static NfseDocumentedGroup6116Ambiente ofVariant1(String value) { return new NfseDocumentedGroup6116Ambiente(Json.scalar(value)); }
 public boolean matchesVariant1() { return matchesVariant("api2/nfse-issuance.openapi.json", SCHEMA, VARIANT_1); }
 public String asVariant1() { JsonNode value = checkedVariant("api2/nfse-issuance.openapi.json", SCHEMA, VARIANT_1); return stringValue(value); }
}
