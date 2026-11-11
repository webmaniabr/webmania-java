package com.webmania.sdk.model.api2nfseissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/nfse-issuance.openapi.json; see contract-provenance.json. */
public final class NfseDocumentedGroup6116Motivo extends JsonValue {
 private static final JsonNode SCHEMA = Json.parse("{\"type\":[\"number\",\"string\"],\"description\":\"Motivo da substitui\\u00e7\\u00e3o 1 - Erro na emiss\\u00e3o 2 - Servi\\u00e7o n\\u00e3o prestado 4 - Duplicidade da nota\",\"x-documented-size\":\"1\"}");
 public NfseDocumentedGroup6116Motivo(JsonNode node) { super(node); }
 private static final JsonNode VARIANT_0 = Json.parse("{\"type\":\"number\",\"description\":\"Motivo da substitui\\u00e7\\u00e3o 1 - Erro na emiss\\u00e3o 2 - Servi\\u00e7o n\\u00e3o prestado 4 - Duplicidade da nota\",\"x-documented-size\":\"1\"}");
 public static NfseDocumentedGroup6116Motivo ofVariant0(java.math.BigDecimal value) { return new NfseDocumentedGroup6116Motivo(Json.scalar(value)); }
 public boolean matchesVariant0() { return matchesVariant("api2/nfse-issuance.openapi.json", SCHEMA, VARIANT_0); }
 public java.math.BigDecimal asVariant0() { JsonNode value = checkedVariant("api2/nfse-issuance.openapi.json", SCHEMA, VARIANT_0); return decimalValue(value); }
 private static final JsonNode VARIANT_1 = Json.parse("{\"type\":\"string\",\"description\":\"Motivo da substitui\\u00e7\\u00e3o 1 - Erro na emiss\\u00e3o 2 - Servi\\u00e7o n\\u00e3o prestado 4 - Duplicidade da nota\",\"x-documented-size\":\"1\"}");
 public static NfseDocumentedGroup6116Motivo ofVariant1(String value) { return new NfseDocumentedGroup6116Motivo(Json.scalar(value)); }
 public boolean matchesVariant1() { return matchesVariant("api2/nfse-issuance.openapi.json", SCHEMA, VARIANT_1); }
 public String asVariant1() { JsonNode value = checkedVariant("api2/nfse-issuance.openapi.json", SCHEMA, VARIANT_1); return stringValue(value); }
}
