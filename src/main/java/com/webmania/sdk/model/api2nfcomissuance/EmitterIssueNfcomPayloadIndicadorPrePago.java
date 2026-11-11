package com.webmania.sdk.model.api2nfcomissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/nfcom-issuance.openapi.json; see contract-provenance.json. */
public final class EmitterIssueNfcomPayloadIndicadorPrePago extends JsonValue {
 private static final JsonNode SCHEMA = Json.parse("{\"anyOf\":[{\"type\":[\"integer\",\"string\"],\"pattern\":\"^-?\\\\d+$\",\"enum\":[\"1\",1]},{\"type\":\"null\"}],\"description\":\"Indica se o servi\\u00e7o \\u00e9 pr\\u00e9-pago 0 - N\\u00e3o (padr\\u00e3o) 1 - Servi\\u00e7o pr\\u00e9-pago\",\"x-documented-condition\":\"Indica se o servi\\u00e7o \\u00e9 pr\\u00e9-pago 0 - N\\u00e3o (padr\\u00e3o) 1 - Servi\\u00e7o pr\\u00e9-pago\",\"x-documented-size\":\"1\"}");
 public EmitterIssueNfcomPayloadIndicadorPrePago(JsonNode node) { super(node); }
 private static final JsonNode VARIANT_0 = SCHEMA.path("anyOf").path(0);
 public static EmitterIssueNfcomPayloadIndicadorPrePago ofVariant0(EmitterIssueNfcomPayloadIndicadorPrePagoVariant0 value) { return new EmitterIssueNfcomPayloadIndicadorPrePago(value == null ? null : value.toJson()); }
 public boolean matchesVariant0() { return matchesVariant("api2/nfcom-issuance.openapi.json", SCHEMA, VARIANT_0); }
 public EmitterIssueNfcomPayloadIndicadorPrePagoVariant0 asVariant0() { JsonNode value = checkedVariant("api2/nfcom-issuance.openapi.json", SCHEMA, VARIANT_0); return (value).isNull() || (value).isMissingNode() ? null : new EmitterIssueNfcomPayloadIndicadorPrePagoVariant0(value); }
 private static final JsonNode VARIANT_1 = SCHEMA.path("anyOf").path(1);
 public static EmitterIssueNfcomPayloadIndicadorPrePago ofVariant1(JsonValue value) { return new EmitterIssueNfcomPayloadIndicadorPrePago(value == null ? null : value.toJson()); }
 public boolean matchesVariant1() { return matchesVariant("api2/nfcom-issuance.openapi.json", SCHEMA, VARIANT_1); }
 public JsonValue asVariant1() { JsonNode value = checkedVariant("api2/nfcom-issuance.openapi.json", SCHEMA, VARIANT_1); return (value).isNull() || (value).isMissingNode() ? null : new JsonValue(value); }
}
