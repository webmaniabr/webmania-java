package com.webmania.sdk.model.api2monitordocuments;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/monitor-documents.openapi.json; see contract-provenance.json. */
public final class MonitorSearchRequestFiltrosModeloFinalidadeVariant1Item extends JsonValue {
 private static final JsonNode SCHEMA = Json.parse("{\"type\":[\"integer\",\"string\"],\"enum\":[0,1,2,3,4,\"0\",\"1\",\"2\",\"3\",\"4\"]}");
 public MonitorSearchRequestFiltrosModeloFinalidadeVariant1Item(JsonNode node) { super(node); }
 private static final JsonNode VARIANT_0 = Json.parse("{\"type\":\"integer\",\"enum\":[0,1,2,3,4,\"0\",\"1\",\"2\",\"3\",\"4\"]}");
 public static MonitorSearchRequestFiltrosModeloFinalidadeVariant1Item ofVariant0(java.math.BigInteger value) { return new MonitorSearchRequestFiltrosModeloFinalidadeVariant1Item(Json.scalar(value)); }
 public boolean matchesVariant0() { return matchesVariant("api2/monitor-documents.openapi.json", SCHEMA, VARIANT_0); }
 public java.math.BigInteger asVariant0() { JsonNode value = checkedVariant("api2/monitor-documents.openapi.json", SCHEMA, VARIANT_0); return integerValue(value); }
 private static final JsonNode VARIANT_1 = Json.parse("{\"type\":\"string\",\"enum\":[0,1,2,3,4,\"0\",\"1\",\"2\",\"3\",\"4\"]}");
 public static MonitorSearchRequestFiltrosModeloFinalidadeVariant1Item ofVariant1(String value) { return new MonitorSearchRequestFiltrosModeloFinalidadeVariant1Item(Json.scalar(value)); }
 public boolean matchesVariant1() { return matchesVariant("api2/monitor-documents.openapi.json", SCHEMA, VARIANT_1); }
 public String asVariant1() { JsonNode value = checkedVariant("api2/monitor-documents.openapi.json", SCHEMA, VARIANT_1); return stringValue(value); }
}
