package com.webmania.sdk.model.api2monitormanagement;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/monitor-management.openapi.json; see contract-provenance.json. */
public final class MonitorDocumentCteOsFornecedor extends JsonValue {
 private static final JsonNode SCHEMA = Json.parse("{\"anyOf\":[{\"type\":\"object\",\"properties\":{\"razao_social\":{\"type\":\"string\"},\"documento\":{\"anyOf\":[{\"type\":\"string\"},{\"type\":\"null\"}]},\"uf\":{\"anyOf\":[{\"type\":\"string\"},{\"type\":\"null\"}]}},\"additionalProperties\":true},{\"type\":\"null\"}]}");
 public MonitorDocumentCteOsFornecedor(JsonNode node) { super(node); }
 private static final JsonNode VARIANT_0 = SCHEMA.path("anyOf").path(0);
 public static MonitorDocumentCteOsFornecedor ofVariant0(MonitorDocumentCteOsFornecedorVariant0 value) { return new MonitorDocumentCteOsFornecedor(value == null ? null : value.toJson()); }
 public boolean matchesVariant0() { return matchesVariant("api2/monitor-management.openapi.json", SCHEMA, VARIANT_0); }
 public MonitorDocumentCteOsFornecedorVariant0 asVariant0() { JsonNode value = checkedVariant("api2/monitor-management.openapi.json", SCHEMA, VARIANT_0); return (value).isNull() || (value).isMissingNode() ? null : new MonitorDocumentCteOsFornecedorVariant0(value); }
 private static final JsonNode VARIANT_1 = SCHEMA.path("anyOf").path(1);
 public static MonitorDocumentCteOsFornecedor ofVariant1(JsonValue value) { return new MonitorDocumentCteOsFornecedor(value == null ? null : value.toJson()); }
 public boolean matchesVariant1() { return matchesVariant("api2/monitor-management.openapi.json", SCHEMA, VARIANT_1); }
 public JsonValue asVariant1() { JsonNode value = checkedVariant("api2/monitor-management.openapi.json", SCHEMA, VARIANT_1); return (value).isNull() || (value).isMissingNode() ? null : new JsonValue(value); }
}
