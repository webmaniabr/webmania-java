package com.webmania.sdk.model.api2monitordocuments;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/monitor-documents.openapi.json; see contract-provenance.json. */
public final class MonitorDocumentNfeParcelasItemNumero extends JsonValue {
 private static final JsonNode SCHEMA = Json.parse("{\"anyOf\":[{\"type\":\"string\"},{\"type\":\"number\"}]}");
 public MonitorDocumentNfeParcelasItemNumero(JsonNode node) { super(node); }
 private static final JsonNode VARIANT_0 = SCHEMA.path("anyOf").path(0);
 public static MonitorDocumentNfeParcelasItemNumero ofVariant0(String value) { return new MonitorDocumentNfeParcelasItemNumero(Json.scalar(value)); }
 public boolean matchesVariant0() { return matchesVariant("api2/monitor-documents.openapi.json", SCHEMA, VARIANT_0); }
 public String asVariant0() { JsonNode value = checkedVariant("api2/monitor-documents.openapi.json", SCHEMA, VARIANT_0); return stringValue(value); }
 private static final JsonNode VARIANT_1 = SCHEMA.path("anyOf").path(1);
 public static MonitorDocumentNfeParcelasItemNumero ofVariant1(java.math.BigDecimal value) { return new MonitorDocumentNfeParcelasItemNumero(Json.scalar(value)); }
 public boolean matchesVariant1() { return matchesVariant("api2/monitor-documents.openapi.json", SCHEMA, VARIANT_1); }
 public java.math.BigDecimal asVariant1() { JsonNode value = checkedVariant("api2/monitor-documents.openapi.json", SCHEMA, VARIANT_1); return decimalValue(value); }
}
