package com.webmania.sdk.model.api2monitormanagement;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/monitor-management.openapi.json; see contract-provenance.json. */
public final class MonitorSearchRequestStatus extends JsonValue {
 private static final JsonNode SCHEMA = Json.parse("{\"anyOf\":[{\"type\":\"string\",\"enum\":[\"aprovado\",\"cancelado\",\"encerrado\",\"pendente\"]},{\"type\":\"array\",\"items\":{\"type\":\"string\",\"enum\":[\"aprovado\",\"cancelado\",\"encerrado\",\"pendente\"]},\"minItems\":1}]}");
 public MonitorSearchRequestStatus(JsonNode node) { super(node); }
 private static final JsonNode VARIANT_0 = SCHEMA.path("anyOf").path(0);
 public static MonitorSearchRequestStatus ofVariant0(String value) { return new MonitorSearchRequestStatus(Json.scalar(value)); }
 public boolean matchesVariant0() { return matchesVariant("api2/monitor-management.openapi.json", SCHEMA, VARIANT_0); }
 public String asVariant0() { JsonNode value = checkedVariant("api2/monitor-management.openapi.json", SCHEMA, VARIANT_0); return stringValue(value); }
 private static final JsonNode VARIANT_1 = SCHEMA.path("anyOf").path(1);
 public static MonitorSearchRequestStatus ofVariant1(java.util.List<String> value) { return new MonitorSearchRequestStatus(array(value, v -> Json.scalar(v))); }
 public boolean matchesVariant1() { return matchesVariant("api2/monitor-management.openapi.json", SCHEMA, VARIANT_1); }
 public java.util.List<String> asVariant1() { JsonNode value = checkedVariant("api2/monitor-management.openapi.json", SCHEMA, VARIANT_1); return list(value, v -> stringValue(v)); }
}
