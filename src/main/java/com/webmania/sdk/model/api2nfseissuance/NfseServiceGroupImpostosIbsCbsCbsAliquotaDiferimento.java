package com.webmania.sdk.model.api2nfseissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/nfse-issuance.openapi.json; see contract-provenance.json. */
public final class NfseServiceGroupImpostosIbsCbsCbsAliquotaDiferimento extends JsonValue {
 private static final JsonNode SCHEMA = Json.parse("{\"type\":[\"number\",\"string\"],\"pattern\":\"^-?(?:\\\\d+\\\\.?\\\\d*|\\\\.\\\\d+)(?:[eE][+-]?\\\\d+)?$\",\"minimum\":0,\"x-sdk-numeric-minimum\":\"0\",\"maximum\":100,\"x-sdk-numeric-maximum\":\"100\",\"description\":\"Percentual do diferimento Obrigat\\u00f3rio quando situa\\u00e7\\u00e3o tribut\\u00e1ria = 510\",\"x-documented-condition\":\"Percentual do diferimento Obrigat\\u00f3rio quando situa\\u00e7\\u00e3o tribut\\u00e1ria = 510\",\"x-documented-size\":\"3v2-4\"}");
 public NfseServiceGroupImpostosIbsCbsCbsAliquotaDiferimento(JsonNode node) { super(node); }
 private static final JsonNode VARIANT_0 = Json.parse("{\"type\":\"number\",\"pattern\":\"^-?(?:\\\\d+\\\\.?\\\\d*|\\\\.\\\\d+)(?:[eE][+-]?\\\\d+)?$\",\"minimum\":0,\"x-sdk-numeric-minimum\":\"0\",\"maximum\":100,\"x-sdk-numeric-maximum\":\"100\",\"description\":\"Percentual do diferimento Obrigat\\u00f3rio quando situa\\u00e7\\u00e3o tribut\\u00e1ria = 510\",\"x-documented-condition\":\"Percentual do diferimento Obrigat\\u00f3rio quando situa\\u00e7\\u00e3o tribut\\u00e1ria = 510\",\"x-documented-size\":\"3v2-4\"}");
 public static NfseServiceGroupImpostosIbsCbsCbsAliquotaDiferimento ofVariant0(java.math.BigDecimal value) { return new NfseServiceGroupImpostosIbsCbsCbsAliquotaDiferimento(Json.scalar(value)); }
 public boolean matchesVariant0() { return matchesVariant("api2/nfse-issuance.openapi.json", SCHEMA, VARIANT_0); }
 public java.math.BigDecimal asVariant0() { JsonNode value = checkedVariant("api2/nfse-issuance.openapi.json", SCHEMA, VARIANT_0); return decimalValue(value); }
 private static final JsonNode VARIANT_1 = Json.parse("{\"type\":\"string\",\"pattern\":\"^-?(?:\\\\d+\\\\.?\\\\d*|\\\\.\\\\d+)(?:[eE][+-]?\\\\d+)?$\",\"minimum\":0,\"x-sdk-numeric-minimum\":\"0\",\"maximum\":100,\"x-sdk-numeric-maximum\":\"100\",\"description\":\"Percentual do diferimento Obrigat\\u00f3rio quando situa\\u00e7\\u00e3o tribut\\u00e1ria = 510\",\"x-documented-condition\":\"Percentual do diferimento Obrigat\\u00f3rio quando situa\\u00e7\\u00e3o tribut\\u00e1ria = 510\",\"x-documented-size\":\"3v2-4\"}");
 public static NfseServiceGroupImpostosIbsCbsCbsAliquotaDiferimento ofVariant1(String value) { return new NfseServiceGroupImpostosIbsCbsCbsAliquotaDiferimento(Json.scalar(value)); }
 public boolean matchesVariant1() { return matchesVariant("api2/nfse-issuance.openapi.json", SCHEMA, VARIANT_1); }
 public String asVariant1() { JsonNode value = checkedVariant("api2/nfse-issuance.openapi.json", SCHEMA, VARIANT_1); return stringValue(value); }
}
