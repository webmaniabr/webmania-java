package com.webmania.sdk.model.api2nfseissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/nfse-issuance.openapi.json; see contract-provenance.json. */
public final class NfcomPaymentEventNSeqEvento extends JsonValue {
 private static final JsonNode SCHEMA = Json.parse("{\"anyOf\":[{\"type\":[\"integer\",\"string\"]},{\"type\":\"null\"}]}");
 public NfcomPaymentEventNSeqEvento(JsonNode node) { super(node); }
 private static final JsonNode VARIANT_0 = SCHEMA.path("anyOf").path(0);
 public static NfcomPaymentEventNSeqEvento ofVariant0(NfcomPaymentEventNSeqEventoVariant0 value) { return new NfcomPaymentEventNSeqEvento(value == null ? null : value.toJson()); }
 public boolean matchesVariant0() { return matchesVariant("api2/nfse-issuance.openapi.json", SCHEMA, VARIANT_0); }
 public NfcomPaymentEventNSeqEventoVariant0 asVariant0() { JsonNode value = checkedVariant("api2/nfse-issuance.openapi.json", SCHEMA, VARIANT_0); return (value).isNull() || (value).isMissingNode() ? null : new NfcomPaymentEventNSeqEventoVariant0(value); }
 private static final JsonNode VARIANT_1 = SCHEMA.path("anyOf").path(1);
 public static NfcomPaymentEventNSeqEvento ofVariant1(JsonValue value) { return new NfcomPaymentEventNSeqEvento(value == null ? null : value.toJson()); }
 public boolean matchesVariant1() { return matchesVariant("api2/nfse-issuance.openapi.json", SCHEMA, VARIANT_1); }
 public JsonValue asVariant1() { JsonNode value = checkedVariant("api2/nfse-issuance.openapi.json", SCHEMA, VARIANT_1); return (value).isNull() || (value).isMissingNode() ? null : new JsonValue(value); }
}
