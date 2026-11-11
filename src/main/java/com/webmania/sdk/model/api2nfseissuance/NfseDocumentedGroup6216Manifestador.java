package com.webmania.sdk.model.api2nfseissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/nfse-issuance.openapi.json; see contract-provenance.json. */
public final class NfseDocumentedGroup6216Manifestador extends JsonValue {
 private static final JsonNode SCHEMA = Json.parse("{\"type\":[\"number\",\"string\"],\"description\":\"Participa\\u00e7\\u00e3o do manifestador na NFS-e 1 - Tomador 2 - Intermedi\\u00e1rio\",\"x-documented-size\":\"1\"}");
 public NfseDocumentedGroup6216Manifestador(JsonNode node) { super(node); }
 private static final JsonNode VARIANT_0 = Json.parse("{\"type\":\"number\",\"description\":\"Participa\\u00e7\\u00e3o do manifestador na NFS-e 1 - Tomador 2 - Intermedi\\u00e1rio\",\"x-documented-size\":\"1\"}");
 public static NfseDocumentedGroup6216Manifestador ofVariant0(java.math.BigDecimal value) { return new NfseDocumentedGroup6216Manifestador(Json.scalar(value)); }
 public boolean matchesVariant0() { return matchesVariant("api2/nfse-issuance.openapi.json", SCHEMA, VARIANT_0); }
 public java.math.BigDecimal asVariant0() { JsonNode value = checkedVariant("api2/nfse-issuance.openapi.json", SCHEMA, VARIANT_0); return decimalValue(value); }
 private static final JsonNode VARIANT_1 = Json.parse("{\"type\":\"string\",\"description\":\"Participa\\u00e7\\u00e3o do manifestador na NFS-e 1 - Tomador 2 - Intermedi\\u00e1rio\",\"x-documented-size\":\"1\"}");
 public static NfseDocumentedGroup6216Manifestador ofVariant1(String value) { return new NfseDocumentedGroup6216Manifestador(Json.scalar(value)); }
 public boolean matchesVariant1() { return matchesVariant("api2/nfse-issuance.openapi.json", SCHEMA, VARIANT_1); }
 public String asVariant1() { JsonNode value = checkedVariant("api2/nfse-issuance.openapi.json", SCHEMA, VARIANT_1); return stringValue(value); }
}
