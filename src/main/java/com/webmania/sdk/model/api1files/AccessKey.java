package com.webmania.sdk.model.api1files;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api1/files.openapi.json; see contract-provenance.json. */
public final class AccessKey extends JsonValue {
 private static final JsonNode SCHEMA = Json.parse("{\"type\":\"string\",\"minLength\":44,\"maxLength\":44,\"pattern\":\"^[0-9A-Z]{44}$\",\"description\":\"44-character fiscal access key. Keep as text. Alphanumeric issuer identifiers are accepted only when enabled by the provider/environment.\"}");
 public AccessKey(JsonNode node) { super(node); }
 private static final JsonNode VARIANT_0 = Json.parse("{\"type\":\"string\",\"minLength\":44,\"maxLength\":44,\"pattern\":\"^[0-9A-Z]{44}$\",\"description\":\"44-character fiscal access key. Keep as text. Alphanumeric issuer identifiers are accepted only when enabled by the provider/environment.\"}");
 public static AccessKey ofVariant0(String value) { return new AccessKey(Json.scalar(value)); }
 public boolean matchesVariant0() { return matchesVariant("api1/files.openapi.json", SCHEMA, VARIANT_0); }
 public String asVariant0() { JsonNode value = checkedVariant("api1/files.openapi.json", SCHEMA, VARIANT_0); return stringValue(value); }
}
