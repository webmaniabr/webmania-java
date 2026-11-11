package com.webmania.sdk.model.api2monitordocuments;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/monitor-documents.openapi.json; see contract-provenance.json. */
public final class MonitorDocumentNfeProtocolo extends JsonValue {
 private static final JsonNode SCHEMA = Json.parse("{\"anyOf\":[{\"type\":\"string\"},{\"type\":\"object\",\"properties\":{\"motivo\":{\"type\":\"string\"},\"status\":{\"type\":\"string\"},\"data_recebimento\":{\"type\":\"string\"},\"numero_protocolo\":{\"type\":\"string\"}},\"additionalProperties\":true}]}");
 public MonitorDocumentNfeProtocolo(JsonNode node) { super(node); }
 private static final JsonNode VARIANT_0 = SCHEMA.path("anyOf").path(0);
 public static MonitorDocumentNfeProtocolo ofVariant0(String value) { return new MonitorDocumentNfeProtocolo(Json.scalar(value)); }
 public boolean matchesVariant0() { return matchesVariant("api2/monitor-documents.openapi.json", SCHEMA, VARIANT_0); }
 public String asVariant0() { JsonNode value = checkedVariant("api2/monitor-documents.openapi.json", SCHEMA, VARIANT_0); return stringValue(value); }
 private static final JsonNode VARIANT_1 = SCHEMA.path("anyOf").path(1);
 public static MonitorDocumentNfeProtocolo ofVariant1(MonitorDocumentNfeProtocoloVariant1 value) { return new MonitorDocumentNfeProtocolo(value == null ? null : value.toJson()); }
 public boolean matchesVariant1() { return matchesVariant("api2/monitor-documents.openapi.json", SCHEMA, VARIANT_1); }
 public MonitorDocumentNfeProtocoloVariant1 asVariant1() { JsonNode value = checkedVariant("api2/monitor-documents.openapi.json", SCHEMA, VARIANT_1); return (value).isNull() || (value).isMissingNode() ? null : new MonitorDocumentNfeProtocoloVariant1(value); }
}
