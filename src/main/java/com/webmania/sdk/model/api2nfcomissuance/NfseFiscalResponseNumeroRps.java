package com.webmania.sdk.model.api2nfcomissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/nfcom-issuance.openapi.json; see contract-provenance.json. */
public final class NfseFiscalResponseNumeroRps extends JsonValue {
 private static final JsonNode SCHEMA = Json.parse("{\"type\":[\"string\",\"number\"]}");
 public NfseFiscalResponseNumeroRps(JsonNode node) { super(node); }
 private static final JsonNode VARIANT_0 = Json.parse("{\"type\":\"string\"}");
 public static NfseFiscalResponseNumeroRps ofVariant0(String value) { return new NfseFiscalResponseNumeroRps(Json.scalar(value)); }
 public boolean matchesVariant0() { return matchesVariant("api2/nfcom-issuance.openapi.json", SCHEMA, VARIANT_0); }
 public String asVariant0() { JsonNode value = checkedVariant("api2/nfcom-issuance.openapi.json", SCHEMA, VARIANT_0); return stringValue(value); }
 private static final JsonNode VARIANT_1 = Json.parse("{\"type\":\"number\"}");
 public static NfseFiscalResponseNumeroRps ofVariant1(java.math.BigDecimal value) { return new NfseFiscalResponseNumeroRps(Json.scalar(value)); }
 public boolean matchesVariant1() { return matchesVariant("api2/nfcom-issuance.openapi.json", SCHEMA, VARIANT_1); }
 public java.math.BigDecimal asVariant1() { JsonNode value = checkedVariant("api2/nfcom-issuance.openapi.json", SCHEMA, VARIANT_1); return decimalValue(value); }
}
