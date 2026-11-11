package com.webmania.sdk.model.api1files;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api1/files.openapi.json; see contract-provenance.json. */
public final class Uuid extends JsonValue {
 private static final JsonNode SCHEMA = Json.parse("{\"type\":\"string\",\"minLength\":36,\"maxLength\":36,\"description\":\"Opaque provider document/event UUID; preserve case/content.\"}");
 public Uuid(JsonNode node) { super(node); }
 private static final JsonNode VARIANT_0 = Json.parse("{\"type\":\"string\",\"minLength\":36,\"maxLength\":36,\"description\":\"Opaque provider document/event UUID; preserve case/content.\"}");
 public static Uuid ofVariant0(String value) { return new Uuid(Json.scalar(value)); }
 public boolean matchesVariant0() { return matchesVariant("api1/files.openapi.json", SCHEMA, VARIANT_0); }
 public String asVariant0() { JsonNode value = checkedVariant("api1/files.openapi.json", SCHEMA, VARIANT_0); return stringValue(value); }
}
