package com.webmania.sdk.model.api2reports;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/reports.openapi.json; see contract-provenance.json. */
public final class ReportUuid extends JsonValue {
 private static final JsonNode SCHEMA = Json.parse("{\"type\":\"string\",\"pattern\":\"^[0-9A-Fa-f]{8}-[0-9A-Fa-f]{4}-[0-9A-Fa-f]{4}-[0-9A-Fa-f]{4}-[0-9A-Fa-f]{12}$\",\"description\":\"Report UUID in its canonical 8-4-4-4-12 hexadecimal form.\"}");
 public ReportUuid(JsonNode node) { super(node); }
 private static final JsonNode VARIANT_0 = Json.parse("{\"type\":\"string\",\"pattern\":\"^[0-9A-Fa-f]{8}-[0-9A-Fa-f]{4}-[0-9A-Fa-f]{4}-[0-9A-Fa-f]{4}-[0-9A-Fa-f]{12}$\",\"description\":\"Report UUID in its canonical 8-4-4-4-12 hexadecimal form.\"}");
 public static ReportUuid ofVariant0(String value) { return new ReportUuid(Json.scalar(value)); }
 public boolean matchesVariant0() { return matchesVariant("api2/reports.openapi.json", SCHEMA, VARIANT_0); }
 public String asVariant0() { JsonNode value = checkedVariant("api2/reports.openapi.json", SCHEMA, VARIANT_0); return stringValue(value); }
}
