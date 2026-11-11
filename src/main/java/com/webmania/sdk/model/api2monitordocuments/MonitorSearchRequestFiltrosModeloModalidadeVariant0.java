package com.webmania.sdk.model.api2monitordocuments;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/monitor-documents.openapi.json; see contract-provenance.json. */
public final class MonitorSearchRequestFiltrosModeloModalidadeVariant0 extends JsonValue {
 private static final JsonNode SCHEMA = Json.parse("{\"type\":[\"integer\",\"string\"],\"enum\":[1,2,3,4,5,6,\"1\",\"2\",\"3\",\"4\",\"5\",\"6\"]}");
 public MonitorSearchRequestFiltrosModeloModalidadeVariant0(JsonNode node) { super(node); }
 private static final JsonNode VARIANT_0 = Json.parse("{\"type\":\"integer\",\"enum\":[1,2,3,4,5,6,\"1\",\"2\",\"3\",\"4\",\"5\",\"6\"]}");
 public static MonitorSearchRequestFiltrosModeloModalidadeVariant0 ofVariant0(java.math.BigInteger value) { return new MonitorSearchRequestFiltrosModeloModalidadeVariant0(Json.scalar(value)); }
 public boolean matchesVariant0() { return matchesVariant("api2/monitor-documents.openapi.json", SCHEMA, VARIANT_0); }
 public java.math.BigInteger asVariant0() { JsonNode value = checkedVariant("api2/monitor-documents.openapi.json", SCHEMA, VARIANT_0); return integerValue(value); }
 private static final JsonNode VARIANT_1 = Json.parse("{\"type\":\"string\",\"enum\":[1,2,3,4,5,6,\"1\",\"2\",\"3\",\"4\",\"5\",\"6\"]}");
 public static MonitorSearchRequestFiltrosModeloModalidadeVariant0 ofVariant1(String value) { return new MonitorSearchRequestFiltrosModeloModalidadeVariant0(Json.scalar(value)); }
 public boolean matchesVariant1() { return matchesVariant("api2/monitor-documents.openapi.json", SCHEMA, VARIANT_1); }
 public String asVariant1() { JsonNode value = checkedVariant("api2/monitor-documents.openapi.json", SCHEMA, VARIANT_1); return stringValue(value); }
}
