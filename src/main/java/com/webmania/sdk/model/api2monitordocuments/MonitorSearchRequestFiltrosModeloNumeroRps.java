package com.webmania.sdk.model.api2monitordocuments;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/monitor-documents.openapi.json; see contract-provenance.json. */
public final class MonitorSearchRequestFiltrosModeloNumeroRps extends JsonValue {
 private static final JsonNode SCHEMA = Json.parse("{\"anyOf\":[{\"type\":\"number\",\"minimum\":1},{\"type\":\"string\",\"pattern\":\"^-?(?:\\\\d+\\\\.?\\\\d*|\\\\.\\\\d+)(?:[eE][+-]?\\\\d+)?$\"}],\"description\":\"JSON number or numeric string. Numeric bounds apply to the interpreted value; preserve decimal strings without conversion.\"}");
 public MonitorSearchRequestFiltrosModeloNumeroRps(JsonNode node) { super(node); }
 private static final JsonNode VARIANT_0 = SCHEMA.path("anyOf").path(0);
 public static MonitorSearchRequestFiltrosModeloNumeroRps ofVariant0(java.math.BigDecimal value) { return new MonitorSearchRequestFiltrosModeloNumeroRps(Json.scalar(value)); }
 public boolean matchesVariant0() { return matchesVariant("api2/monitor-documents.openapi.json", SCHEMA, VARIANT_0); }
 public java.math.BigDecimal asVariant0() { JsonNode value = checkedVariant("api2/monitor-documents.openapi.json", SCHEMA, VARIANT_0); return decimalValue(value); }
 private static final JsonNode VARIANT_1 = SCHEMA.path("anyOf").path(1);
 public static MonitorSearchRequestFiltrosModeloNumeroRps ofVariant1(String value) { return new MonitorSearchRequestFiltrosModeloNumeroRps(Json.scalar(value)); }
 public boolean matchesVariant1() { return matchesVariant("api2/monitor-documents.openapi.json", SCHEMA, VARIANT_1); }
 public String asVariant1() { JsonNode value = checkedVariant("api2/monitor-documents.openapi.json", SCHEMA, VARIANT_1); return stringValue(value); }
}
