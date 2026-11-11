package com.webmania.sdk.model.api2nfseissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/nfse-issuance.openapi.json; see contract-provenance.json. */
public final class EmitterIssueNfsePayloadRpsItemTomadorIdEstrangeiro extends JsonValue {
 private static final JsonNode SCHEMA = Json.parse("{\"anyOf\":[{\"anyOf\":[{\"type\":\"string\",\"maxLength\":40},{\"type\":\"null\"}]},{\"type\":\"string\",\"minLength\":1,\"maxLength\":40}],\"description\":\"N\\u00famero de Identifica\\u00e7\\u00e3o (Passaporte ou outro documento legal)\",\"x-documented-condition\":\"N\\u00famero de Identifica\\u00e7\\u00e3o (Passaporte ou outro documento legal)\",\"x-documented-size\":\"1-20\"}");
 public EmitterIssueNfsePayloadRpsItemTomadorIdEstrangeiro(JsonNode node) { super(node); }
 private static final JsonNode VARIANT_0 = SCHEMA.path("anyOf").path(0);
 public static EmitterIssueNfsePayloadRpsItemTomadorIdEstrangeiro ofVariant0(EmitterIssueNfsePayloadRpsItemTomadorIdEstrangeiroVariant0 value) { return new EmitterIssueNfsePayloadRpsItemTomadorIdEstrangeiro(value == null ? null : value.toJson()); }
 public boolean matchesVariant0() { return matchesVariant("api2/nfse-issuance.openapi.json", SCHEMA, VARIANT_0); }
 public EmitterIssueNfsePayloadRpsItemTomadorIdEstrangeiroVariant0 asVariant0() { JsonNode value = checkedVariant("api2/nfse-issuance.openapi.json", SCHEMA, VARIANT_0); return (value).isNull() || (value).isMissingNode() ? null : new EmitterIssueNfsePayloadRpsItemTomadorIdEstrangeiroVariant0(value); }
 private static final JsonNode VARIANT_1 = SCHEMA.path("anyOf").path(1);
 public static EmitterIssueNfsePayloadRpsItemTomadorIdEstrangeiro ofVariant1(String value) { return new EmitterIssueNfsePayloadRpsItemTomadorIdEstrangeiro(Json.scalar(value)); }
 public boolean matchesVariant1() { return matchesVariant("api2/nfse-issuance.openapi.json", SCHEMA, VARIANT_1); }
 public String asVariant1() { JsonNode value = checkedVariant("api2/nfse-issuance.openapi.json", SCHEMA, VARIANT_1); return stringValue(value); }
}
