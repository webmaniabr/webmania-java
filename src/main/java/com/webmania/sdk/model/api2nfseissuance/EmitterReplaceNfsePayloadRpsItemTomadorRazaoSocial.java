package com.webmania.sdk.model.api2nfseissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/nfse-issuance.openapi.json; see contract-provenance.json. */
public final class EmitterReplaceNfsePayloadRpsItemTomadorRazaoSocial extends JsonValue {
 private static final JsonNode SCHEMA = Json.parse("{\"anyOf\":[{\"type\":\"string\",\"minLength\":1},{\"type\":\"string\",\"minLength\":1,\"maxLength\":250,\"x-conditional-rules\":[\"required_with:rps.*.tomador.cnpj\"]}]}");
 public EmitterReplaceNfsePayloadRpsItemTomadorRazaoSocial(JsonNode node) { super(node); }
 private static final JsonNode VARIANT_0 = SCHEMA.path("anyOf").path(0);
 public static EmitterReplaceNfsePayloadRpsItemTomadorRazaoSocial ofVariant0(String value) { return new EmitterReplaceNfsePayloadRpsItemTomadorRazaoSocial(Json.scalar(value)); }
 public boolean matchesVariant0() { return matchesVariant("api2/nfse-issuance.openapi.json", SCHEMA, VARIANT_0); }
 public String asVariant0() { JsonNode value = checkedVariant("api2/nfse-issuance.openapi.json", SCHEMA, VARIANT_0); return stringValue(value); }
 private static final JsonNode VARIANT_1 = SCHEMA.path("anyOf").path(1);
 public static EmitterReplaceNfsePayloadRpsItemTomadorRazaoSocial ofVariant1(String value) { return new EmitterReplaceNfsePayloadRpsItemTomadorRazaoSocial(Json.scalar(value)); }
 public boolean matchesVariant1() { return matchesVariant("api2/nfse-issuance.openapi.json", SCHEMA, VARIANT_1); }
 public String asVariant1() { JsonNode value = checkedVariant("api2/nfse-issuance.openapi.json", SCHEMA, VARIANT_1); return stringValue(value); }
}
