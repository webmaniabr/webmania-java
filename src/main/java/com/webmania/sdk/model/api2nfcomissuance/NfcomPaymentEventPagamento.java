package com.webmania.sdk.model.api2nfcomissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/nfcom-issuance.openapi.json; see contract-provenance.json. */
public final class NfcomPaymentEventPagamento extends JsonValue {
 private static final JsonNode SCHEMA = Json.parse("{\"anyOf\":[{\"type\":\"object\",\"properties\":{\"nPag\":{\"type\":[\"string\",\"number\",\"boolean\",\"null\"]},\"idTransacao\":{\"type\":[\"string\",\"number\",\"boolean\",\"null\"]},\"tpMeioPgto\":{\"type\":[\"string\",\"number\",\"boolean\",\"null\"]},\"CNPJReceb\":{\"type\":[\"string\",\"number\",\"boolean\",\"null\"]},\"CNPJBasePSP\":{\"type\":[\"string\",\"number\",\"boolean\",\"null\"]}},\"additionalProperties\":true},{\"type\":\"null\"}]}");
 public NfcomPaymentEventPagamento(JsonNode node) { super(node); }
 private static final JsonNode VARIANT_0 = SCHEMA.path("anyOf").path(0);
 public static NfcomPaymentEventPagamento ofVariant0(NfcomPaymentEventPagamentoVariant0 value) { return new NfcomPaymentEventPagamento(value == null ? null : value.toJson()); }
 public boolean matchesVariant0() { return matchesVariant("api2/nfcom-issuance.openapi.json", SCHEMA, VARIANT_0); }
 public NfcomPaymentEventPagamentoVariant0 asVariant0() { JsonNode value = checkedVariant("api2/nfcom-issuance.openapi.json", SCHEMA, VARIANT_0); return (value).isNull() || (value).isMissingNode() ? null : new NfcomPaymentEventPagamentoVariant0(value); }
 private static final JsonNode VARIANT_1 = SCHEMA.path("anyOf").path(1);
 public static NfcomPaymentEventPagamento ofVariant1(JsonValue value) { return new NfcomPaymentEventPagamento(value == null ? null : value.toJson()); }
 public boolean matchesVariant1() { return matchesVariant("api2/nfcom-issuance.openapi.json", SCHEMA, VARIANT_1); }
 public JsonValue asVariant1() { JsonNode value = checkedVariant("api2/nfcom-issuance.openapi.json", SCHEMA, VARIANT_1); return (value).isNull() || (value).isMissingNode() ? null : new JsonValue(value); }
}
