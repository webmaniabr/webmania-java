package com.webmania.sdk.model.api2dceissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/dce-issuance.openapi.json; see contract-provenance.json. */
public final class EmitterIssueDcePayloadUrlNotificacao extends JsonValue {
 private static final JsonNode SCHEMA = Json.parse("{\"anyOf\":[{\"type\":\"string\",\"format\":\"uri\",\"maxLength\":500},{\"type\":\"null\"}],\"description\":\"URL para receber notifica\\u00e7\\u00f5es autom\\u00e1ticas de status.\",\"x-documented-condition\":\"URL para receber notifica\\u00e7\\u00f5es autom\\u00e1ticas de status.\",\"x-documented-size\":\"at\\u00e9 500\"}");
 public EmitterIssueDcePayloadUrlNotificacao(JsonNode node) { super(node); }
 private static final JsonNode VARIANT_0 = SCHEMA.path("anyOf").path(0);
 public static EmitterIssueDcePayloadUrlNotificacao ofVariant0(String value) { return new EmitterIssueDcePayloadUrlNotificacao(Json.scalar(value)); }
 public boolean matchesVariant0() { return matchesVariant("api2/dce-issuance.openapi.json", SCHEMA, VARIANT_0); }
 public String asVariant0() { JsonNode value = checkedVariant("api2/dce-issuance.openapi.json", SCHEMA, VARIANT_0); return stringValue(value); }
 private static final JsonNode VARIANT_1 = SCHEMA.path("anyOf").path(1);
 public static EmitterIssueDcePayloadUrlNotificacao ofVariant1(JsonValue value) { return new EmitterIssueDcePayloadUrlNotificacao(value == null ? null : value.toJson()); }
 public boolean matchesVariant1() { return matchesVariant("api2/dce-issuance.openapi.json", SCHEMA, VARIANT_1); }
 public JsonValue asVariant1() { JsonNode value = checkedVariant("api2/dce-issuance.openapi.json", SCHEMA, VARIANT_1); return (value).isNull() || (value).isMissingNode() ? null : new JsonValue(value); }
}
