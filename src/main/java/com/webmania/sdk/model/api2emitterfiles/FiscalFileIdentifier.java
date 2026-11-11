package com.webmania.sdk.model.api2emitterfiles;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/emitter-files.openapi.json; see contract-provenance.json. */
public final class FiscalFileIdentifier extends JsonValue {
 private static final JsonNode SCHEMA = Json.parse("{\"anyOf\":[{\"type\":\"string\",\"format\":\"uuid\",\"pattern\":\"^[0-9a-fA-F]{8}(?:-[0-9a-fA-F]{4}){3}-[0-9a-fA-F]{12}$\"},{\"type\":\"string\",\"pattern\":\"^[0-9]{6}[A-Za-z0-9]{12}[0-9]{26}$\"}]}");
 public FiscalFileIdentifier(JsonNode node) { super(node); }
 private static final JsonNode VARIANT_0 = SCHEMA.path("anyOf").path(0);
 public static FiscalFileIdentifier ofVariant0(String value) { return new FiscalFileIdentifier(Json.scalar(value)); }
 public boolean matchesVariant0() { return matchesVariant("api2/emitter-files.openapi.json", SCHEMA, VARIANT_0); }
 public String asVariant0() { JsonNode value = checkedVariant("api2/emitter-files.openapi.json", SCHEMA, VARIANT_0); return stringValue(value); }
 private static final JsonNode VARIANT_1 = SCHEMA.path("anyOf").path(1);
 public static FiscalFileIdentifier ofVariant1(String value) { return new FiscalFileIdentifier(Json.scalar(value)); }
 public boolean matchesVariant1() { return matchesVariant("api2/emitter-files.openapi.json", SCHEMA, VARIANT_1); }
 public String asVariant1() { JsonNode value = checkedVariant("api2/emitter-files.openapi.json", SCHEMA, VARIANT_1); return stringValue(value); }
}
