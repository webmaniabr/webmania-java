package com.webmania.sdk.model.api2nfcomissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/nfcom-issuance.openapi.json; see contract-provenance.json. */
public final class EmitterIssueNfcomPayloadAssinanteVariant0ContratoVariant0Numero extends JsonValue {
 private static final JsonNode SCHEMA = Json.parse("{\"anyOf\":[{\"type\":\"string\",\"minLength\":1,\"maxLength\":60},{\"type\":\"null\"}],\"description\":\"N\\u00famero do contrato Ex: 12345/2025\",\"x-documented-condition\":\"N\\u00famero do contrato Ex: 12345/2025\",\"x-documented-size\":\"1-60\"}");
 public EmitterIssueNfcomPayloadAssinanteVariant0ContratoVariant0Numero(JsonNode node) { super(node); }
 private static final JsonNode VARIANT_0 = SCHEMA.path("anyOf").path(0);
 public static EmitterIssueNfcomPayloadAssinanteVariant0ContratoVariant0Numero ofVariant0(String value) { return new EmitterIssueNfcomPayloadAssinanteVariant0ContratoVariant0Numero(Json.scalar(value)); }
 public boolean matchesVariant0() { return matchesVariant("api2/nfcom-issuance.openapi.json", SCHEMA, VARIANT_0); }
 public String asVariant0() { JsonNode value = checkedVariant("api2/nfcom-issuance.openapi.json", SCHEMA, VARIANT_0); return stringValue(value); }
 private static final JsonNode VARIANT_1 = SCHEMA.path("anyOf").path(1);
 public static EmitterIssueNfcomPayloadAssinanteVariant0ContratoVariant0Numero ofVariant1(JsonValue value) { return new EmitterIssueNfcomPayloadAssinanteVariant0ContratoVariant0Numero(value == null ? null : value.toJson()); }
 public boolean matchesVariant1() { return matchesVariant("api2/nfcom-issuance.openapi.json", SCHEMA, VARIANT_1); }
 public JsonValue asVariant1() { JsonNode value = checkedVariant("api2/nfcom-issuance.openapi.json", SCHEMA, VARIANT_1); return (value).isNull() || (value).isMissingNode() ? null : new JsonValue(value); }
}
