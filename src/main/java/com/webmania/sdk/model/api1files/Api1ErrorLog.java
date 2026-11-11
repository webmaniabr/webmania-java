package com.webmania.sdk.model.api1files;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api1/files.openapi.json; see contract-provenance.json. */
public final class Api1ErrorLog extends JsonValue {
 private static final JsonNode SCHEMA = Json.parse("{\"anyOf\":[{\"type\":\"string\"},{\"type\":\"object\",\"properties\":{\"cStat\":{\"anyOf\":[{\"type\":\"string\"},{\"type\":\"integer\"}]},\"xMotivo\":{\"type\":\"string\"}},\"additionalProperties\":true}]}");
 public Api1ErrorLog(JsonNode node) { super(node); }
 private static final JsonNode VARIANT_0 = SCHEMA.path("anyOf").path(0);
 public static Api1ErrorLog ofVariant0(String value) { return new Api1ErrorLog(Json.scalar(value)); }
 public boolean matchesVariant0() { return matchesVariant("api1/files.openapi.json", SCHEMA, VARIANT_0); }
 public String asVariant0() { JsonNode value = checkedVariant("api1/files.openapi.json", SCHEMA, VARIANT_0); return stringValue(value); }
 private static final JsonNode VARIANT_1 = SCHEMA.path("anyOf").path(1);
 public static Api1ErrorLog ofVariant1(Api1ErrorLogVariant1 value) { return new Api1ErrorLog(value == null ? null : value.toJson()); }
 public boolean matchesVariant1() { return matchesVariant("api1/files.openapi.json", SCHEMA, VARIANT_1); }
 public Api1ErrorLogVariant1 asVariant1() { JsonNode value = checkedVariant("api1/files.openapi.json", SCHEMA, VARIANT_1); return (value).isNull() || (value).isMissingNode() ? null : new Api1ErrorLogVariant1(value); }
}
