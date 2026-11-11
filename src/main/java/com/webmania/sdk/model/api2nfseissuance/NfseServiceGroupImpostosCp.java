package com.webmania.sdk.model.api2nfseissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/nfse-issuance.openapi.json; see contract-provenance.json. */
public final class NfseServiceGroupImpostosCp extends JsonValue {
 private static final JsonNode SCHEMA = Json.parse("{\"type\":[\"string\",\"number\"],\"description\":\"Al\\u00edquota do CP (Contribui\\u00e7\\u00e3o Patronal) Obs.: Dispon\\u00edvel apenas para o Padr\\u00e3o Nacional 0.00\",\"x-documented-size\":\"3v2\",\"x-documented-condition\":\"Al\\u00edquota do CP (Contribui\\u00e7\\u00e3o Patronal) Obs.: Dispon\\u00edvel apenas para o Padr\\u00e3o Nacional 0.00\"}");
 public NfseServiceGroupImpostosCp(JsonNode node) { super(node); }
 private static final JsonNode VARIANT_0 = Json.parse("{\"type\":\"string\",\"description\":\"Al\\u00edquota do CP (Contribui\\u00e7\\u00e3o Patronal) Obs.: Dispon\\u00edvel apenas para o Padr\\u00e3o Nacional 0.00\",\"x-documented-size\":\"3v2\",\"x-documented-condition\":\"Al\\u00edquota do CP (Contribui\\u00e7\\u00e3o Patronal) Obs.: Dispon\\u00edvel apenas para o Padr\\u00e3o Nacional 0.00\"}");
 public static NfseServiceGroupImpostosCp ofVariant0(String value) { return new NfseServiceGroupImpostosCp(Json.scalar(value)); }
 public boolean matchesVariant0() { return matchesVariant("api2/nfse-issuance.openapi.json", SCHEMA, VARIANT_0); }
 public String asVariant0() { JsonNode value = checkedVariant("api2/nfse-issuance.openapi.json", SCHEMA, VARIANT_0); return stringValue(value); }
 private static final JsonNode VARIANT_1 = Json.parse("{\"type\":\"number\",\"description\":\"Al\\u00edquota do CP (Contribui\\u00e7\\u00e3o Patronal) Obs.: Dispon\\u00edvel apenas para o Padr\\u00e3o Nacional 0.00\",\"x-documented-size\":\"3v2\",\"x-documented-condition\":\"Al\\u00edquota do CP (Contribui\\u00e7\\u00e3o Patronal) Obs.: Dispon\\u00edvel apenas para o Padr\\u00e3o Nacional 0.00\"}");
 public static NfseServiceGroupImpostosCp ofVariant1(java.math.BigDecimal value) { return new NfseServiceGroupImpostosCp(Json.scalar(value)); }
 public boolean matchesVariant1() { return matchesVariant("api2/nfse-issuance.openapi.json", SCHEMA, VARIANT_1); }
 public java.math.BigDecimal asVariant1() { JsonNode value = checkedVariant("api2/nfse-issuance.openapi.json", SCHEMA, VARIANT_1); return decimalValue(value); }
}
