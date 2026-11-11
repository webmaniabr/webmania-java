package com.webmania.sdk.model.api2emitterreads;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/emitter-reads.openapi.json; see contract-provenance.json. */
public final class NfcomPaymentEventPagamentoVariant0TpMeioPgto extends JsonValue {
 private static final JsonNode SCHEMA = Json.parse("{\"type\":[\"string\",\"number\",\"boolean\",\"null\"]}");
 public NfcomPaymentEventPagamentoVariant0TpMeioPgto(JsonNode node) { super(node); }
 private static final JsonNode VARIANT_0 = Json.parse("{\"type\":\"string\"}");
 public static NfcomPaymentEventPagamentoVariant0TpMeioPgto ofVariant0(String value) { return new NfcomPaymentEventPagamentoVariant0TpMeioPgto(Json.scalar(value)); }
 public boolean matchesVariant0() { return matchesVariant("api2/emitter-reads.openapi.json", SCHEMA, VARIANT_0); }
 public String asVariant0() { JsonNode value = checkedVariant("api2/emitter-reads.openapi.json", SCHEMA, VARIANT_0); return stringValue(value); }
 private static final JsonNode VARIANT_1 = Json.parse("{\"type\":\"number\"}");
 public static NfcomPaymentEventPagamentoVariant0TpMeioPgto ofVariant1(java.math.BigDecimal value) { return new NfcomPaymentEventPagamentoVariant0TpMeioPgto(Json.scalar(value)); }
 public boolean matchesVariant1() { return matchesVariant("api2/emitter-reads.openapi.json", SCHEMA, VARIANT_1); }
 public java.math.BigDecimal asVariant1() { JsonNode value = checkedVariant("api2/emitter-reads.openapi.json", SCHEMA, VARIANT_1); return decimalValue(value); }
 private static final JsonNode VARIANT_2 = Json.parse("{\"type\":\"boolean\"}");
 public static NfcomPaymentEventPagamentoVariant0TpMeioPgto ofVariant2(Boolean value) { return new NfcomPaymentEventPagamentoVariant0TpMeioPgto(Json.scalar(value)); }
 public boolean matchesVariant2() { return matchesVariant("api2/emitter-reads.openapi.json", SCHEMA, VARIANT_2); }
 public Boolean asVariant2() { JsonNode value = checkedVariant("api2/emitter-reads.openapi.json", SCHEMA, VARIANT_2); return booleanValue(value); }
 private static final JsonNode VARIANT_3 = Json.parse("{\"type\":\"null\"}");
 public static NfcomPaymentEventPagamentoVariant0TpMeioPgto ofVariant3(JsonValue value) { return new NfcomPaymentEventPagamentoVariant0TpMeioPgto(value == null ? null : value.toJson()); }
 public boolean matchesVariant3() { return matchesVariant("api2/emitter-reads.openapi.json", SCHEMA, VARIANT_3); }
 public JsonValue asVariant3() { JsonNode value = checkedVariant("api2/emitter-reads.openapi.json", SCHEMA, VARIANT_3); return (value).isNull() || (value).isMissingNode() ? null : new JsonValue(value); }
}
