package com.webmania.sdk.model.api2monitordocuments;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/monitor-documents.openapi.json; see contract-provenance.json. */
public final class MonitorDocumentNfseDocsXml extends JsonValue {
 private static final JsonNode SCHEMA = Json.parse("{\"anyOf\":[{\"type\":\"string\",\"description\":\"XML source text returned inline.\"},{\"type\":\"null\"}]}");
 public MonitorDocumentNfseDocsXml(JsonNode node) { super(node); }
 private static final JsonNode VARIANT_0 = SCHEMA.path("anyOf").path(0);
 public static MonitorDocumentNfseDocsXml ofVariant0(String value) { return new MonitorDocumentNfseDocsXml(Json.scalar(value)); }
 public boolean matchesVariant0() { return matchesVariant("api2/monitor-documents.openapi.json", SCHEMA, VARIANT_0); }
 public String asVariant0() { JsonNode value = checkedVariant("api2/monitor-documents.openapi.json", SCHEMA, VARIANT_0); return stringValue(value); }
 private static final JsonNode VARIANT_1 = SCHEMA.path("anyOf").path(1);
 public static MonitorDocumentNfseDocsXml ofVariant1(JsonValue value) { return new MonitorDocumentNfseDocsXml(value == null ? null : value.toJson()); }
 public boolean matchesVariant1() { return matchesVariant("api2/monitor-documents.openapi.json", SCHEMA, VARIANT_1); }
 public JsonValue asVariant1() { JsonNode value = checkedVariant("api2/monitor-documents.openapi.json", SCHEMA, VARIANT_1); return (value).isNull() || (value).isMissingNode() ? null : new JsonValue(value); }
}
