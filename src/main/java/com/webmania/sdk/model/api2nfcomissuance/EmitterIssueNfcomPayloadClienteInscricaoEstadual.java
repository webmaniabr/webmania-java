package com.webmania.sdk.model.api2nfcomissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/nfcom-issuance.openapi.json; see contract-provenance.json. */
public final class EmitterIssueNfcomPayloadClienteInscricaoEstadual extends JsonValue {
 private static final JsonNode SCHEMA = Json.parse("{\"anyOf\":[{\"type\":\"string\",\"minLength\":2,\"maxLength\":14,\"x-conditional-rules\":[\"required_if:cliente.indicador_ie,1\"]},{\"type\":\"null\"}],\"description\":\"N\\u00famero de Inscri\\u00e7\\u00e3o Estadual\",\"x-documented-condition\":\"N\\u00famero de Inscri\\u00e7\\u00e3o Estadual\",\"x-documented-size\":\"2-14\"}");
 public EmitterIssueNfcomPayloadClienteInscricaoEstadual(JsonNode node) { super(node); }
 private static final JsonNode VARIANT_0 = SCHEMA.path("anyOf").path(0);
 public static EmitterIssueNfcomPayloadClienteInscricaoEstadual ofVariant0(String value) { return new EmitterIssueNfcomPayloadClienteInscricaoEstadual(Json.scalar(value)); }
 public boolean matchesVariant0() { return matchesVariant("api2/nfcom-issuance.openapi.json", SCHEMA, VARIANT_0); }
 public String asVariant0() { JsonNode value = checkedVariant("api2/nfcom-issuance.openapi.json", SCHEMA, VARIANT_0); return stringValue(value); }
 private static final JsonNode VARIANT_1 = SCHEMA.path("anyOf").path(1);
 public static EmitterIssueNfcomPayloadClienteInscricaoEstadual ofVariant1(JsonValue value) { return new EmitterIssueNfcomPayloadClienteInscricaoEstadual(value == null ? null : value.toJson()); }
 public boolean matchesVariant1() { return matchesVariant("api2/nfcom-issuance.openapi.json", SCHEMA, VARIANT_1); }
 public JsonValue asVariant1() { JsonNode value = checkedVariant("api2/nfcom-issuance.openapi.json", SCHEMA, VARIANT_1); return (value).isNull() || (value).isMissingNode() ? null : new JsonValue(value); }
}
