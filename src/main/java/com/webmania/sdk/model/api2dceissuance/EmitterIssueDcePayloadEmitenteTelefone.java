package com.webmania.sdk.model.api2dceissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/dce-issuance.openapi.json; see contract-provenance.json. */
public final class EmitterIssueDcePayloadEmitenteTelefone extends JsonValue {
 private static final JsonNode SCHEMA = Json.parse("{\"anyOf\":[{\"type\":\"string\",\"pattern\":\"^\\\\d{7,12}$\",\"x-conditional-rules\":[\"A server-side conditional or current catalog constraint also applies; this draft does not replace it.\"]},{\"type\":\"null\"}],\"description\":\"Telefone com DDD, somente n\\u00fameros.\",\"x-documented-condition\":\"Telefone com DDD, somente n\\u00fameros.\",\"x-documented-size\":\"7-12\"}");
 public EmitterIssueDcePayloadEmitenteTelefone(JsonNode node) { super(node); }
 private static final JsonNode VARIANT_0 = SCHEMA.path("anyOf").path(0);
 public static EmitterIssueDcePayloadEmitenteTelefone ofVariant0(String value) { return new EmitterIssueDcePayloadEmitenteTelefone(Json.scalar(value)); }
 public boolean matchesVariant0() { return matchesVariant("api2/dce-issuance.openapi.json", SCHEMA, VARIANT_0); }
 public String asVariant0() { JsonNode value = checkedVariant("api2/dce-issuance.openapi.json", SCHEMA, VARIANT_0); return stringValue(value); }
 private static final JsonNode VARIANT_1 = SCHEMA.path("anyOf").path(1);
 public static EmitterIssueDcePayloadEmitenteTelefone ofVariant1(JsonValue value) { return new EmitterIssueDcePayloadEmitenteTelefone(value == null ? null : value.toJson()); }
 public boolean matchesVariant1() { return matchesVariant("api2/dce-issuance.openapi.json", SCHEMA, VARIANT_1); }
 public JsonValue asVariant1() { JsonNode value = checkedVariant("api2/dce-issuance.openapi.json", SCHEMA, VARIANT_1); return (value).isNull() || (value).isMissingNode() ? null : new JsonValue(value); }
}
