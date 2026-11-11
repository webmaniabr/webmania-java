package com.webmania.sdk.model.api2nfcomissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/nfcom-issuance.openapi.json; see contract-provenance.json. */
public final class EmitterIssueNfcomPayloadAssinanteVariant0ContratoVariant0DataFim extends JsonValue {
 private static final JsonNode SCHEMA = Json.parse("{\"anyOf\":[{\"type\":\"string\",\"format\":\"date\",\"x-conditional-rules\":[\"Accepted server date format(s): Y-m-d\",\"after_or_equal:assinante.contrato.data_inicio\"]},{\"type\":\"null\"}],\"description\":\"Data de t\\u00e9rmino do contrato Formato: YYYY-MM-DD\",\"x-documented-condition\":\"Data de t\\u00e9rmino do contrato Formato: YYYY-MM-DD\",\"x-documented-size\":\"10\"}");
 public EmitterIssueNfcomPayloadAssinanteVariant0ContratoVariant0DataFim(JsonNode node) { super(node); }
 private static final JsonNode VARIANT_0 = SCHEMA.path("anyOf").path(0);
 public static EmitterIssueNfcomPayloadAssinanteVariant0ContratoVariant0DataFim ofVariant0(String value) { return new EmitterIssueNfcomPayloadAssinanteVariant0ContratoVariant0DataFim(Json.scalar(value)); }
 public boolean matchesVariant0() { return matchesVariant("api2/nfcom-issuance.openapi.json", SCHEMA, VARIANT_0); }
 public String asVariant0() { JsonNode value = checkedVariant("api2/nfcom-issuance.openapi.json", SCHEMA, VARIANT_0); return stringValue(value); }
 private static final JsonNode VARIANT_1 = SCHEMA.path("anyOf").path(1);
 public static EmitterIssueNfcomPayloadAssinanteVariant0ContratoVariant0DataFim ofVariant1(JsonValue value) { return new EmitterIssueNfcomPayloadAssinanteVariant0ContratoVariant0DataFim(value == null ? null : value.toJson()); }
 public boolean matchesVariant1() { return matchesVariant("api2/nfcom-issuance.openapi.json", SCHEMA, VARIANT_1); }
 public JsonValue asVariant1() { JsonNode value = checkedVariant("api2/nfcom-issuance.openapi.json", SCHEMA, VARIANT_1); return (value).isNull() || (value).isMissingNode() ? null : new JsonValue(value); }
}
