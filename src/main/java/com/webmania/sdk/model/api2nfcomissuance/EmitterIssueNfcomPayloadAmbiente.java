package com.webmania.sdk.model.api2nfcomissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/nfcom-issuance.openapi.json; see contract-provenance.json. */
public final class EmitterIssueNfcomPayloadAmbiente extends JsonValue {
 private static final JsonNode SCHEMA = Json.parse("{\"type\":[\"integer\",\"string\"],\"pattern\":\"^-?\\\\d+$\",\"enum\":[\"1\",1,\"2\",2],\"description\":\"Identifica\\u00e7\\u00e3o do Ambiente da Sefaz 1 - Produ\\u00e7\\u00e3o 2 - Homologa\\u00e7\\u00e3o\",\"x-documented-condition\":\"Identifica\\u00e7\\u00e3o do Ambiente da Sefaz 1 - Produ\\u00e7\\u00e3o 2 - Homologa\\u00e7\\u00e3o\",\"x-documented-size\":\"1\"}");
 public EmitterIssueNfcomPayloadAmbiente(JsonNode node) { super(node); }
 private static final JsonNode VARIANT_0 = Json.parse("{\"type\":\"integer\",\"pattern\":\"^-?\\\\d+$\",\"enum\":[\"1\",1,\"2\",2],\"description\":\"Identifica\\u00e7\\u00e3o do Ambiente da Sefaz 1 - Produ\\u00e7\\u00e3o 2 - Homologa\\u00e7\\u00e3o\",\"x-documented-condition\":\"Identifica\\u00e7\\u00e3o do Ambiente da Sefaz 1 - Produ\\u00e7\\u00e3o 2 - Homologa\\u00e7\\u00e3o\",\"x-documented-size\":\"1\"}");
 public static EmitterIssueNfcomPayloadAmbiente ofVariant0(java.math.BigInteger value) { return new EmitterIssueNfcomPayloadAmbiente(Json.scalar(value)); }
 public boolean matchesVariant0() { return matchesVariant("api2/nfcom-issuance.openapi.json", SCHEMA, VARIANT_0); }
 public java.math.BigInteger asVariant0() { JsonNode value = checkedVariant("api2/nfcom-issuance.openapi.json", SCHEMA, VARIANT_0); return integerValue(value); }
 private static final JsonNode VARIANT_1 = Json.parse("{\"type\":\"string\",\"pattern\":\"^-?\\\\d+$\",\"enum\":[\"1\",1,\"2\",2],\"description\":\"Identifica\\u00e7\\u00e3o do Ambiente da Sefaz 1 - Produ\\u00e7\\u00e3o 2 - Homologa\\u00e7\\u00e3o\",\"x-documented-condition\":\"Identifica\\u00e7\\u00e3o do Ambiente da Sefaz 1 - Produ\\u00e7\\u00e3o 2 - Homologa\\u00e7\\u00e3o\",\"x-documented-size\":\"1\"}");
 public static EmitterIssueNfcomPayloadAmbiente ofVariant1(String value) { return new EmitterIssueNfcomPayloadAmbiente(Json.scalar(value)); }
 public boolean matchesVariant1() { return matchesVariant("api2/nfcom-issuance.openapi.json", SCHEMA, VARIANT_1); }
 public String asVariant1() { JsonNode value = checkedVariant("api2/nfcom-issuance.openapi.json", SCHEMA, VARIANT_1); return stringValue(value); }
}
