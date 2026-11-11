package com.webmania.sdk.model.api2monitorreads;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/monitor-reads.openapi.json; see contract-provenance.json. */
public final class MonitorAddressCodigoMunicipio extends JsonValue {
 private static final JsonNode SCHEMA = Json.parse("{\"type\":[\"string\",\"integer\"],\"description\":\"IBGE municipality code. The public company guide documents an integer and company responses return integers; preserve string representations from compatible response variants without coercion.\"}");
 public MonitorAddressCodigoMunicipio(JsonNode node) { super(node); }
 private static final JsonNode VARIANT_0 = Json.parse("{\"type\":\"string\",\"description\":\"IBGE municipality code. The public company guide documents an integer and company responses return integers; preserve string representations from compatible response variants without coercion.\"}");
 public static MonitorAddressCodigoMunicipio ofVariant0(String value) { return new MonitorAddressCodigoMunicipio(Json.scalar(value)); }
 public boolean matchesVariant0() { return matchesVariant("api2/monitor-reads.openapi.json", SCHEMA, VARIANT_0); }
 public String asVariant0() { JsonNode value = checkedVariant("api2/monitor-reads.openapi.json", SCHEMA, VARIANT_0); return stringValue(value); }
 private static final JsonNode VARIANT_1 = Json.parse("{\"type\":\"integer\",\"description\":\"IBGE municipality code. The public company guide documents an integer and company responses return integers; preserve string representations from compatible response variants without coercion.\"}");
 public static MonitorAddressCodigoMunicipio ofVariant1(java.math.BigInteger value) { return new MonitorAddressCodigoMunicipio(Json.scalar(value)); }
 public boolean matchesVariant1() { return matchesVariant("api2/monitor-reads.openapi.json", SCHEMA, VARIANT_1); }
 public java.math.BigInteger asVariant1() { JsonNode value = checkedVariant("api2/monitor-reads.openapi.json", SCHEMA, VARIANT_1); return integerValue(value); }
}
