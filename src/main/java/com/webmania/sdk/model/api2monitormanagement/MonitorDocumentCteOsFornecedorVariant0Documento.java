package com.webmania.sdk.model.api2monitormanagement;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/monitor-management.openapi.json; see contract-provenance.json. */
public final class MonitorDocumentCteOsFornecedorVariant0Documento extends JsonValue {
 private static final JsonNode SCHEMA = Json.parse("{\"anyOf\":[{\"type\":\"string\"},{\"type\":\"null\"}]}");
 public MonitorDocumentCteOsFornecedorVariant0Documento(JsonNode node) { super(node); }
 private static final JsonNode VARIANT_0 = SCHEMA.path("anyOf").path(0);
 public static MonitorDocumentCteOsFornecedorVariant0Documento ofVariant0(String value) { return new MonitorDocumentCteOsFornecedorVariant0Documento(Json.scalar(value)); }
 public boolean matchesVariant0() { return matchesVariant("api2/monitor-management.openapi.json", SCHEMA, VARIANT_0); }
 public String asVariant0() { JsonNode value = checkedVariant("api2/monitor-management.openapi.json", SCHEMA, VARIANT_0); return stringValue(value); }
 private static final JsonNode VARIANT_1 = SCHEMA.path("anyOf").path(1);
 public static MonitorDocumentCteOsFornecedorVariant0Documento ofVariant1(JsonValue value) { return new MonitorDocumentCteOsFornecedorVariant0Documento(value == null ? null : value.toJson()); }
 public boolean matchesVariant1() { return matchesVariant("api2/monitor-management.openapi.json", SCHEMA, VARIANT_1); }
 public JsonValue asVariant1() { JsonNode value = checkedVariant("api2/monitor-management.openapi.json", SCHEMA, VARIANT_1); return (value).isNull() || (value).isMissingNode() ? null : new JsonValue(value); }
}
