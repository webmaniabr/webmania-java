package com.webmania.sdk.model.api2nfseissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/nfse-issuance.openapi.json; see contract-provenance.json. */
public final class EmitterIssueNfsePayloadRpsItemTomadorNomePais extends JsonValue {
 private static final JsonNode SCHEMA = Json.parse("{\"anyOf\":[{\"type\":\"string\",\"maxLength\":40},{\"type\":\"null\"}],\"description\":\"Nome do Pa\\u00eds\",\"x-documented-condition\":\"Nome do Pa\\u00eds\",\"x-documented-size\":\"1-40\"}");
 public EmitterIssueNfsePayloadRpsItemTomadorNomePais(JsonNode node) { super(node); }
 private static final JsonNode VARIANT_0 = SCHEMA.path("anyOf").path(0);
 public static EmitterIssueNfsePayloadRpsItemTomadorNomePais ofVariant0(String value) { return new EmitterIssueNfsePayloadRpsItemTomadorNomePais(Json.scalar(value)); }
 public boolean matchesVariant0() { return matchesVariant("api2/nfse-issuance.openapi.json", SCHEMA, VARIANT_0); }
 public String asVariant0() { JsonNode value = checkedVariant("api2/nfse-issuance.openapi.json", SCHEMA, VARIANT_0); return stringValue(value); }
 private static final JsonNode VARIANT_1 = SCHEMA.path("anyOf").path(1);
 public static EmitterIssueNfsePayloadRpsItemTomadorNomePais ofVariant1(JsonValue value) { return new EmitterIssueNfsePayloadRpsItemTomadorNomePais(value == null ? null : value.toJson()); }
 public boolean matchesVariant1() { return matchesVariant("api2/nfse-issuance.openapi.json", SCHEMA, VARIANT_1); }
 public JsonValue asVariant1() { JsonNode value = checkedVariant("api2/nfse-issuance.openapi.json", SCHEMA, VARIANT_1); return (value).isNull() || (value).isMissingNode() ? null : new JsonValue(value); }
}
