package com.webmania.sdk.model.api2emitterfiles;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/emitter-files.openapi.json; see contract-provenance.json. */
public final class FiscalFileUuid extends JsonValue {
 private static final JsonNode SCHEMA = Json.parse("{\"type\":\"string\",\"format\":\"uuid\",\"pattern\":\"^[0-9a-fA-F]{8}(?:-[0-9a-fA-F]{4}){3}-[0-9a-fA-F]{12}$\"}");
 public FiscalFileUuid(JsonNode node) { super(node); }
 private static final JsonNode VARIANT_0 = Json.parse("{\"type\":\"string\",\"format\":\"uuid\",\"pattern\":\"^[0-9a-fA-F]{8}(?:-[0-9a-fA-F]{4}){3}-[0-9a-fA-F]{12}$\"}");
 public static FiscalFileUuid ofVariant0(String value) { return new FiscalFileUuid(Json.scalar(value)); }
 public boolean matchesVariant0() { return matchesVariant("api2/emitter-files.openapi.json", SCHEMA, VARIANT_0); }
 public String asVariant0() { JsonNode value = checkedVariant("api2/emitter-files.openapi.json", SCHEMA, VARIANT_0); return stringValue(value); }
}
