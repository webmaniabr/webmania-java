package com.webmania.sdk.model.api2monitormanagement;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/monitor-management.openapi.json; see contract-provenance.json. */
public final class MonitorSearchRequestEmpresaUuid extends JsonValue {
 private static final JsonNode SCHEMA = Json.parse("{\"anyOf\":[{\"type\":\"string\",\"format\":\"uuid\"},{\"type\":\"array\",\"items\":{\"type\":\"string\",\"format\":\"uuid\"},\"maxItems\":50}],\"description\":\"Scalar UUID is normalized to an array. Arrays are lowercased, sorted and deduplicated, null/empty elements removed; maximum 50 distinct UUIDs, otherwise 422.\"}");
 public MonitorSearchRequestEmpresaUuid(JsonNode node) { super(node); }
 private static final JsonNode VARIANT_0 = SCHEMA.path("anyOf").path(0);
 public static MonitorSearchRequestEmpresaUuid ofVariant0(String value) { return new MonitorSearchRequestEmpresaUuid(Json.scalar(value)); }
 public boolean matchesVariant0() { return matchesVariant("api2/monitor-management.openapi.json", SCHEMA, VARIANT_0); }
 public String asVariant0() { JsonNode value = checkedVariant("api2/monitor-management.openapi.json", SCHEMA, VARIANT_0); return stringValue(value); }
 private static final JsonNode VARIANT_1 = SCHEMA.path("anyOf").path(1);
 public static MonitorSearchRequestEmpresaUuid ofVariant1(java.util.List<String> value) { return new MonitorSearchRequestEmpresaUuid(array(value, v -> Json.scalar(v))); }
 public boolean matchesVariant1() { return matchesVariant("api2/monitor-management.openapi.json", SCHEMA, VARIANT_1); }
 public java.util.List<String> asVariant1() { JsonNode value = checkedVariant("api2/monitor-management.openapi.json", SCHEMA, VARIANT_1); return list(value, v -> stringValue(v)); }
}
