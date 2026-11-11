package com.webmania.sdk.model.api2monitormanagement;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/monitor-management.openapi.json; see contract-provenance.json. */
public final class MonitorDocumentMdfePercursoItem extends JsonValue {
 private static final JsonNode SCHEMA = Json.parse("{\"anyOf\":[{\"type\":\"object\",\"properties\":{\"uf\":{\"type\":\"string\"},\"ordem\":{\"type\":\"number\"}},\"additionalProperties\":true},{\"type\":\"string\"}]}");
 public MonitorDocumentMdfePercursoItem(JsonNode node) { super(node); }
 private static final JsonNode VARIANT_0 = SCHEMA.path("anyOf").path(0);
 public static MonitorDocumentMdfePercursoItem ofVariant0(MonitorDocumentMdfePercursoItemVariant0 value) { return new MonitorDocumentMdfePercursoItem(value == null ? null : value.toJson()); }
 public boolean matchesVariant0() { return matchesVariant("api2/monitor-management.openapi.json", SCHEMA, VARIANT_0); }
 public MonitorDocumentMdfePercursoItemVariant0 asVariant0() { JsonNode value = checkedVariant("api2/monitor-management.openapi.json", SCHEMA, VARIANT_0); return (value).isNull() || (value).isMissingNode() ? null : new MonitorDocumentMdfePercursoItemVariant0(value); }
 private static final JsonNode VARIANT_1 = SCHEMA.path("anyOf").path(1);
 public static MonitorDocumentMdfePercursoItem ofVariant1(String value) { return new MonitorDocumentMdfePercursoItem(Json.scalar(value)); }
 public boolean matchesVariant1() { return matchesVariant("api2/monitor-management.openapi.json", SCHEMA, VARIANT_1); }
 public String asVariant1() { JsonNode value = checkedVariant("api2/monitor-management.openapi.json", SCHEMA, VARIANT_1); return stringValue(value); }
}
