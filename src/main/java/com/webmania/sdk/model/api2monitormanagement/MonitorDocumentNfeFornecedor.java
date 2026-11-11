package com.webmania.sdk.model.api2monitormanagement;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/monitor-management.openapi.json; see contract-provenance.json. */
public final class MonitorDocumentNfeFornecedor extends JsonValue {
 private static final JsonNode SCHEMA = Json.parse("{\"anyOf\":[{\"type\":\"object\",\"properties\":{\"razao_social\":{\"type\":\"string\"},\"documento\":{\"anyOf\":[{\"type\":\"string\"},{\"type\":\"null\"}]},\"uf\":{\"anyOf\":[{\"type\":\"string\"},{\"type\":\"null\"}]}},\"additionalProperties\":true},{\"type\":\"null\"}]}");
 public MonitorDocumentNfeFornecedor(JsonNode node) { super(node); }
 private static final JsonNode VARIANT_0 = SCHEMA.path("anyOf").path(0);
 public static MonitorDocumentNfeFornecedor ofVariant0(MonitorDocumentNfeFornecedorVariant0 value) { return new MonitorDocumentNfeFornecedor(value == null ? null : value.toJson()); }
 public boolean matchesVariant0() { return matchesVariant("api2/monitor-management.openapi.json", SCHEMA, VARIANT_0); }
 public MonitorDocumentNfeFornecedorVariant0 asVariant0() { JsonNode value = checkedVariant("api2/monitor-management.openapi.json", SCHEMA, VARIANT_0); return (value).isNull() || (value).isMissingNode() ? null : new MonitorDocumentNfeFornecedorVariant0(value); }
 private static final JsonNode VARIANT_1 = SCHEMA.path("anyOf").path(1);
 public static MonitorDocumentNfeFornecedor ofVariant1(JsonValue value) { return new MonitorDocumentNfeFornecedor(value == null ? null : value.toJson()); }
 public boolean matchesVariant1() { return matchesVariant("api2/monitor-management.openapi.json", SCHEMA, VARIANT_1); }
 public JsonValue asVariant1() { JsonNode value = checkedVariant("api2/monitor-management.openapi.json", SCHEMA, VARIANT_1); return (value).isNull() || (value).isMissingNode() ? null : new JsonValue(value); }
}
