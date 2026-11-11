package com.webmania.sdk.model.api2monitormanagement;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/monitor-management.openapi.json; see contract-provenance.json. */
public final class MonitorNotification extends JsonValue {
 private static final JsonNode SCHEMA = Json.parse("{\"anyOf\":[{\"$ref\":\"#/components/schemas/MonitorNotification1\"},{\"$ref\":\"#/components/schemas/MonitorNotification2\"},{\"$ref\":\"#/components/schemas/MonitorNotification3\"},{\"$ref\":\"#/components/schemas/MonitorNotification4\"},{\"$ref\":\"#/components/schemas/MonitorNotification5\"}],\"description\":\"Known notification types. Preserve additional fields and handle unknown future types safely. UUID is the stable correlation key and differs from an access key. No delivery signature or retry guarantee is published; do not infer authenticity from parsing the payload.\"}");
 public MonitorNotification(JsonNode node) { super(node); }
 private static final JsonNode VARIANT_0 = SCHEMA.path("anyOf").path(0);
 public static MonitorNotification ofVariant0(MonitorNotification1 value) { return new MonitorNotification(value == null ? null : value.toJson()); }
 public boolean matchesVariant0() { return matchesVariant("api2/monitor-management.openapi.json", SCHEMA, VARIANT_0); }
 public MonitorNotification1 asVariant0() { JsonNode value = checkedVariant("api2/monitor-management.openapi.json", SCHEMA, VARIANT_0); return (value).isNull() || (value).isMissingNode() ? null : new MonitorNotification1(value); }
 private static final JsonNode VARIANT_1 = SCHEMA.path("anyOf").path(1);
 public static MonitorNotification ofVariant1(MonitorNotification2 value) { return new MonitorNotification(value == null ? null : value.toJson()); }
 public boolean matchesVariant1() { return matchesVariant("api2/monitor-management.openapi.json", SCHEMA, VARIANT_1); }
 public MonitorNotification2 asVariant1() { JsonNode value = checkedVariant("api2/monitor-management.openapi.json", SCHEMA, VARIANT_1); return (value).isNull() || (value).isMissingNode() ? null : new MonitorNotification2(value); }
 private static final JsonNode VARIANT_2 = SCHEMA.path("anyOf").path(2);
 public static MonitorNotification ofVariant2(MonitorNotification3 value) { return new MonitorNotification(value == null ? null : value.toJson()); }
 public boolean matchesVariant2() { return matchesVariant("api2/monitor-management.openapi.json", SCHEMA, VARIANT_2); }
 public MonitorNotification3 asVariant2() { JsonNode value = checkedVariant("api2/monitor-management.openapi.json", SCHEMA, VARIANT_2); return (value).isNull() || (value).isMissingNode() ? null : new MonitorNotification3(value); }
 private static final JsonNode VARIANT_3 = SCHEMA.path("anyOf").path(3);
 public static MonitorNotification ofVariant3(MonitorNotification4 value) { return new MonitorNotification(value == null ? null : value.toJson()); }
 public boolean matchesVariant3() { return matchesVariant("api2/monitor-management.openapi.json", SCHEMA, VARIANT_3); }
 public MonitorNotification4 asVariant3() { JsonNode value = checkedVariant("api2/monitor-management.openapi.json", SCHEMA, VARIANT_3); return (value).isNull() || (value).isMissingNode() ? null : new MonitorNotification4(value); }
 private static final JsonNode VARIANT_4 = SCHEMA.path("anyOf").path(4);
 public static MonitorNotification ofVariant4(MonitorNotification5 value) { return new MonitorNotification(value == null ? null : value.toJson()); }
 public boolean matchesVariant4() { return matchesVariant("api2/monitor-management.openapi.json", SCHEMA, VARIANT_4); }
 public MonitorNotification5 asVariant4() { JsonNode value = checkedVariant("api2/monitor-management.openapi.json", SCHEMA, VARIANT_4); return (value).isNull() || (value).isMissingNode() ? null : new MonitorNotification5(value); }
}
