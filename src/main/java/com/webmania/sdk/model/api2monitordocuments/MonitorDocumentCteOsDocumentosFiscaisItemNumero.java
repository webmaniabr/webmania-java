package com.webmania.sdk.model.api2monitordocuments;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/monitor-documents.openapi.json; see contract-provenance.json. */
public final class MonitorDocumentCteOsDocumentosFiscaisItemNumero extends JsonValue {
 private static final JsonNode SCHEMA = Json.parse("{\"type\":[\"string\",\"number\"]}");
 public MonitorDocumentCteOsDocumentosFiscaisItemNumero(JsonNode node) { super(node); }
 private static final JsonNode VARIANT_0 = Json.parse("{\"type\":\"string\"}");
 public static MonitorDocumentCteOsDocumentosFiscaisItemNumero ofVariant0(String value) { return new MonitorDocumentCteOsDocumentosFiscaisItemNumero(Json.scalar(value)); }
 public boolean matchesVariant0() { return matchesVariant("api2/monitor-documents.openapi.json", SCHEMA, VARIANT_0); }
 public String asVariant0() { JsonNode value = checkedVariant("api2/monitor-documents.openapi.json", SCHEMA, VARIANT_0); return stringValue(value); }
 private static final JsonNode VARIANT_1 = Json.parse("{\"type\":\"number\"}");
 public static MonitorDocumentCteOsDocumentosFiscaisItemNumero ofVariant1(java.math.BigDecimal value) { return new MonitorDocumentCteOsDocumentosFiscaisItemNumero(Json.scalar(value)); }
 public boolean matchesVariant1() { return matchesVariant("api2/monitor-documents.openapi.json", SCHEMA, VARIANT_1); }
 public java.math.BigDecimal asVariant1() { JsonNode value = checkedVariant("api2/monitor-documents.openapi.json", SCHEMA, VARIANT_1); return decimalValue(value); }
}
