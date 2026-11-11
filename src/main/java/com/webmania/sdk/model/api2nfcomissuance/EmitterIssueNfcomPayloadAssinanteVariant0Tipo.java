package com.webmania.sdk.model.api2nfcomissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/nfcom-issuance.openapi.json; see contract-provenance.json. */
public final class EmitterIssueNfcomPayloadAssinanteVariant0Tipo extends JsonValue {
 private static final JsonNode SCHEMA = Json.parse("{\"anyOf\":[{\"type\":[\"integer\",\"string\"],\"pattern\":\"^-?\\\\d+$\",\"minimum\":1,\"x-sdk-numeric-minimum\":\"1\",\"maximum\":99,\"x-sdk-numeric-maximum\":\"99\"},{\"type\":\"null\"}],\"description\":\"Tipo do assinante 1 - Comercial/Industrial 2 - Poder P\\u00fablico 3 - Residencial/Pessoa F\\u00edsica (padr\\u00e3o) 4 - P\\u00fablico 5 - Semi-P\\u00fablico 6 - Outros\",\"x-documented-condition\":\"Tipo do assinante 1 - Comercial/Industrial 2 - Poder P\\u00fablico 3 - Residencial/Pessoa F\\u00edsica (padr\\u00e3o) 4 - P\\u00fablico 5 - Semi-P\\u00fablico 6 - Outros\",\"x-documented-size\":\"1\"}");
 public EmitterIssueNfcomPayloadAssinanteVariant0Tipo(JsonNode node) { super(node); }
 private static final JsonNode VARIANT_0 = SCHEMA.path("anyOf").path(0);
 public static EmitterIssueNfcomPayloadAssinanteVariant0Tipo ofVariant0(EmitterIssueNfcomPayloadAssinanteVariant0TipoVariant0 value) { return new EmitterIssueNfcomPayloadAssinanteVariant0Tipo(value == null ? null : value.toJson()); }
 public boolean matchesVariant0() { return matchesVariant("api2/nfcom-issuance.openapi.json", SCHEMA, VARIANT_0); }
 public EmitterIssueNfcomPayloadAssinanteVariant0TipoVariant0 asVariant0() { JsonNode value = checkedVariant("api2/nfcom-issuance.openapi.json", SCHEMA, VARIANT_0); return (value).isNull() || (value).isMissingNode() ? null : new EmitterIssueNfcomPayloadAssinanteVariant0TipoVariant0(value); }
 private static final JsonNode VARIANT_1 = SCHEMA.path("anyOf").path(1);
 public static EmitterIssueNfcomPayloadAssinanteVariant0Tipo ofVariant1(JsonValue value) { return new EmitterIssueNfcomPayloadAssinanteVariant0Tipo(value == null ? null : value.toJson()); }
 public boolean matchesVariant1() { return matchesVariant("api2/nfcom-issuance.openapi.json", SCHEMA, VARIANT_1); }
 public JsonValue asVariant1() { JsonNode value = checkedVariant("api2/nfcom-issuance.openapi.json", SCHEMA, VARIANT_1); return (value).isNull() || (value).isMissingNode() ? null : new JsonValue(value); }
}
