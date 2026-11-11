package com.webmania.sdk.model.api1files;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api1/files.openapi.json; see contract-provenance.json. */
public final class Api1ErrorError extends JsonValue {
 private static final JsonNode SCHEMA = Json.parse("{\"anyOf\":[{\"type\":\"string\"},{\"type\":\"array\",\"items\":{\"type\":\"string\"}}]}");
 public Api1ErrorError(JsonNode node) { super(node); }
 private static final JsonNode VARIANT_0 = SCHEMA.path("anyOf").path(0);
 public static Api1ErrorError ofVariant0(String value) { return new Api1ErrorError(Json.scalar(value)); }
 public boolean matchesVariant0() { return matchesVariant("api1/files.openapi.json", SCHEMA, VARIANT_0); }
 public String asVariant0() { JsonNode value = checkedVariant("api1/files.openapi.json", SCHEMA, VARIANT_0); return stringValue(value); }
 private static final JsonNode VARIANT_1 = SCHEMA.path("anyOf").path(1);
 public static Api1ErrorError ofVariant1(java.util.List<String> value) { return new Api1ErrorError(array(value, v -> Json.scalar(v))); }
 public boolean matchesVariant1() { return matchesVariant("api1/files.openapi.json", SCHEMA, VARIANT_1); }
 public java.util.List<String> asVariant1() { JsonNode value = checkedVariant("api1/files.openapi.json", SCHEMA, VARIANT_1); return list(value, v -> stringValue(v)); }
}
