package com.webmania.sdk.model.api2monitormanagement;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/monitor-management.openapi.json; see contract-provenance.json. */
public final class MonitorManifestationState extends JsonValue {
 private static final JsonNode SCHEMA = Json.parse("{\"anyOf\":[{\"type\":\"object\",\"properties\":{\"codigo\":{\"type\":\"integer\"},\"descricao\":{\"anyOf\":[{\"type\":\"string\"},{\"type\":\"null\"}]},\"manifestado\":{\"type\":\"boolean\"},\"automatica\":{\"type\":\"boolean\"}},\"additionalProperties\":true,\"required\":[\"codigo\",\"descricao\",\"manifestado\",\"automatica\"],\"description\":\"List-only manifestation state for received NF-e. Code 0 and manifestado=false mean pending; real SEFAZ codes are 210200/210210/210220/210240.\"},{\"type\":\"null\"}]}");
 public MonitorManifestationState(JsonNode node) { super(node); }
 private static final JsonNode VARIANT_0 = SCHEMA.path("anyOf").path(0);
 public static MonitorManifestationState ofVariant0(MonitorManifestationStateVariant0 value) { return new MonitorManifestationState(value == null ? null : value.toJson()); }
 public boolean matchesVariant0() { return matchesVariant("api2/monitor-management.openapi.json", SCHEMA, VARIANT_0); }
 public MonitorManifestationStateVariant0 asVariant0() { JsonNode value = checkedVariant("api2/monitor-management.openapi.json", SCHEMA, VARIANT_0); return (value).isNull() || (value).isMissingNode() ? null : new MonitorManifestationStateVariant0(value); }
 private static final JsonNode VARIANT_1 = SCHEMA.path("anyOf").path(1);
 public static MonitorManifestationState ofVariant1(JsonValue value) { return new MonitorManifestationState(value == null ? null : value.toJson()); }
 public boolean matchesVariant1() { return matchesVariant("api2/monitor-management.openapi.json", SCHEMA, VARIANT_1); }
 public JsonValue asVariant1() { JsonNode value = checkedVariant("api2/monitor-management.openapi.json", SCHEMA, VARIANT_1); return (value).isNull() || (value).isMissingNode() ? null : new JsonValue(value); }
}
