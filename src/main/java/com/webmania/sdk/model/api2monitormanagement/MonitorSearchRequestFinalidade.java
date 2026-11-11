package com.webmania.sdk.model.api2monitormanagement;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/monitor-management.openapi.json; see contract-provenance.json. */
public final class MonitorSearchRequestFinalidade extends JsonValue {
 private static final JsonNode SCHEMA = Json.parse("{\"anyOf\":[{\"type\":[\"integer\",\"string\"],\"enum\":[0,1,2,3,4,\"0\",\"1\",\"2\",\"3\",\"4\"]},{\"type\":\"array\",\"items\":{\"type\":[\"integer\",\"string\"],\"enum\":[0,1,2,3,4,\"0\",\"1\",\"2\",\"3\",\"4\"]},\"minItems\":1}]}");
 public MonitorSearchRequestFinalidade(JsonNode node) { super(node); }
 private static final JsonNode VARIANT_0 = SCHEMA.path("anyOf").path(0);
 public static MonitorSearchRequestFinalidade ofVariant0(MonitorSearchRequestFinalidadeVariant0 value) { return new MonitorSearchRequestFinalidade(value == null ? null : value.toJson()); }
 public boolean matchesVariant0() { return matchesVariant("api2/monitor-management.openapi.json", SCHEMA, VARIANT_0); }
 public MonitorSearchRequestFinalidadeVariant0 asVariant0() { JsonNode value = checkedVariant("api2/monitor-management.openapi.json", SCHEMA, VARIANT_0); return (value).isNull() || (value).isMissingNode() ? null : new MonitorSearchRequestFinalidadeVariant0(value); }
 private static final JsonNode VARIANT_1 = SCHEMA.path("anyOf").path(1);
 public static MonitorSearchRequestFinalidade ofVariant1(java.util.List<MonitorSearchRequestFinalidadeVariant1Item> value) { return new MonitorSearchRequestFinalidade(array(value, v -> v == null ? null : v.toJson())); }
 public boolean matchesVariant1() { return matchesVariant("api2/monitor-management.openapi.json", SCHEMA, VARIANT_1); }
 public java.util.List<MonitorSearchRequestFinalidadeVariant1Item> asVariant1() { JsonNode value = checkedVariant("api2/monitor-management.openapi.json", SCHEMA, VARIANT_1); return list(value, v -> (v).isNull() || (v).isMissingNode() ? null : new MonitorSearchRequestFinalidadeVariant1Item(v)); }
}
