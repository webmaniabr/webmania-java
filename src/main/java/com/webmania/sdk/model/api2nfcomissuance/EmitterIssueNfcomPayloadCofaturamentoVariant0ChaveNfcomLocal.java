package com.webmania.sdk.model.api2nfcomissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/nfcom-issuance.openapi.json; see contract-provenance.json. */
public final class EmitterIssueNfcomPayloadCofaturamentoVariant0ChaveNfcomLocal extends JsonValue {
 private static final JsonNode SCHEMA = Json.parse("{\"anyOf\":[{\"type\":\"string\",\"minLength\":44,\"maxLength\":44,\"pattern\":\"^[0-9]{6}[A-Za-z0-9]{12}[0-9]{26}$\",\"x-conditional-rules\":[\"required_without:cofaturamento.nf_referenciada\",\"A server-side conditional or current catalog constraint also applies; this draft does not replace it.\"]},{\"type\":\"null\"}],\"description\":\"Chave da NFCom emitida pela operadora local Obrigat\\u00f3rio quando n\\u00e3o informar nf_referenciada\",\"x-documented-condition\":\"Chave da NFCom emitida pela operadora local Obrigat\\u00f3rio quando n\\u00e3o informar nf_referenciada\",\"x-documented-size\":\"44\"}");
 public EmitterIssueNfcomPayloadCofaturamentoVariant0ChaveNfcomLocal(JsonNode node) { super(node); }
 private static final JsonNode VARIANT_0 = SCHEMA.path("anyOf").path(0);
 public static EmitterIssueNfcomPayloadCofaturamentoVariant0ChaveNfcomLocal ofVariant0(String value) { return new EmitterIssueNfcomPayloadCofaturamentoVariant0ChaveNfcomLocal(Json.scalar(value)); }
 public boolean matchesVariant0() { return matchesVariant("api2/nfcom-issuance.openapi.json", SCHEMA, VARIANT_0); }
 public String asVariant0() { JsonNode value = checkedVariant("api2/nfcom-issuance.openapi.json", SCHEMA, VARIANT_0); return stringValue(value); }
 private static final JsonNode VARIANT_1 = SCHEMA.path("anyOf").path(1);
 public static EmitterIssueNfcomPayloadCofaturamentoVariant0ChaveNfcomLocal ofVariant1(JsonValue value) { return new EmitterIssueNfcomPayloadCofaturamentoVariant0ChaveNfcomLocal(value == null ? null : value.toJson()); }
 public boolean matchesVariant1() { return matchesVariant("api2/nfcom-issuance.openapi.json", SCHEMA, VARIANT_1); }
 public JsonValue asVariant1() { JsonNode value = checkedVariant("api2/nfcom-issuance.openapi.json", SCHEMA, VARIANT_1); return (value).isNull() || (value).isMissingNode() ? null : new JsonValue(value); }
}
