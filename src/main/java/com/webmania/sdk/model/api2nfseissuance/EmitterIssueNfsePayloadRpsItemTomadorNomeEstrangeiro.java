package com.webmania.sdk.model.api2nfseissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/nfse-issuance.openapi.json; see contract-provenance.json. */
public final class EmitterIssueNfsePayloadRpsItemTomadorNomeEstrangeiro extends JsonValue {
 private static final JsonNode SCHEMA = Json.parse("{\"anyOf\":[{\"anyOf\":[{\"type\":\"string\",\"minLength\":1,\"maxLength\":150},{\"type\":\"null\"}]},{\"type\":\"string\",\"minLength\":1,\"maxLength\":250}],\"description\":\"Nome Completo\",\"x-documented-condition\":\"Nome Completo\",\"x-documented-size\":\"2-150\"}");
 public EmitterIssueNfsePayloadRpsItemTomadorNomeEstrangeiro(JsonNode node) { super(node); }
 private static final JsonNode VARIANT_0 = SCHEMA.path("anyOf").path(0);
 public static EmitterIssueNfsePayloadRpsItemTomadorNomeEstrangeiro ofVariant0(EmitterIssueNfsePayloadRpsItemTomadorNomeEstrangeiroVariant0 value) { return new EmitterIssueNfsePayloadRpsItemTomadorNomeEstrangeiro(value == null ? null : value.toJson()); }
 public boolean matchesVariant0() { return matchesVariant("api2/nfse-issuance.openapi.json", SCHEMA, VARIANT_0); }
 public EmitterIssueNfsePayloadRpsItemTomadorNomeEstrangeiroVariant0 asVariant0() { JsonNode value = checkedVariant("api2/nfse-issuance.openapi.json", SCHEMA, VARIANT_0); return (value).isNull() || (value).isMissingNode() ? null : new EmitterIssueNfsePayloadRpsItemTomadorNomeEstrangeiroVariant0(value); }
 private static final JsonNode VARIANT_1 = SCHEMA.path("anyOf").path(1);
 public static EmitterIssueNfsePayloadRpsItemTomadorNomeEstrangeiro ofVariant1(String value) { return new EmitterIssueNfsePayloadRpsItemTomadorNomeEstrangeiro(Json.scalar(value)); }
 public boolean matchesVariant1() { return matchesVariant("api2/nfse-issuance.openapi.json", SCHEMA, VARIANT_1); }
 public String asVariant1() { JsonNode value = checkedVariant("api2/nfse-issuance.openapi.json", SCHEMA, VARIANT_1); return stringValue(value); }
}
