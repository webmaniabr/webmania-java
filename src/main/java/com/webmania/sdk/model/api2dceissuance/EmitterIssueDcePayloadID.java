package com.webmania.sdk.model.api2dceissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/dce-issuance.openapi.json; see contract-provenance.json. */
public final class EmitterIssueDcePayloadID extends JsonValue {
 private static final JsonNode SCHEMA = Json.parse("{\"anyOf\":[{\"type\":\"string\",\"maxLength\":100},{\"type\":\"null\"}],\"description\":\"ID externo de controle da opera\\u00e7\\u00e3o.\",\"x-documented-condition\":\"ID externo de controle da opera\\u00e7\\u00e3o.\",\"x-documented-size\":\"1-100\"}");
 public EmitterIssueDcePayloadID(JsonNode node) { super(node); }
 private static final JsonNode VARIANT_0 = SCHEMA.path("anyOf").path(0);
 public static EmitterIssueDcePayloadID ofVariant0(String value) { return new EmitterIssueDcePayloadID(Json.scalar(value)); }
 public boolean matchesVariant0() { return matchesVariant("api2/dce-issuance.openapi.json", SCHEMA, VARIANT_0); }
 public String asVariant0() { JsonNode value = checkedVariant("api2/dce-issuance.openapi.json", SCHEMA, VARIANT_0); return stringValue(value); }
 private static final JsonNode VARIANT_1 = SCHEMA.path("anyOf").path(1);
 public static EmitterIssueDcePayloadID ofVariant1(JsonValue value) { return new EmitterIssueDcePayloadID(value == null ? null : value.toJson()); }
 public boolean matchesVariant1() { return matchesVariant("api2/dce-issuance.openapi.json", SCHEMA, VARIANT_1); }
 public JsonValue asVariant1() { JsonNode value = checkedVariant("api2/dce-issuance.openapi.json", SCHEMA, VARIANT_1); return (value).isNull() || (value).isMissingNode() ? null : new JsonValue(value); }
}
