package com.webmania.sdk.model.api2nfcomissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/nfcom-issuance.openapi.json; see contract-provenance.json. */
public final class NfcomFiscalResponseLog extends JsonValue {
 private static final JsonNode SCHEMA = Json.parse("{\"anyOf\":[{\"anyOf\":[{\"type\":\"object\",\"properties\":{},\"additionalProperties\":true},{\"type\":\"array\",\"items\":{}}],\"description\":\"Provider-specific raw fiscal log; preserve structure and additional fields. Never include unredacted credential values in an exception.\"},{\"type\":\"null\"}]}");
 public NfcomFiscalResponseLog(JsonNode node) { super(node); }
 private static final JsonNode VARIANT_0 = SCHEMA.path("anyOf").path(0);
 public static NfcomFiscalResponseLog ofVariant0(NfcomFiscalResponseLogVariant0 value) { return new NfcomFiscalResponseLog(value == null ? null : value.toJson()); }
 public boolean matchesVariant0() { return matchesVariant("api2/nfcom-issuance.openapi.json", SCHEMA, VARIANT_0); }
 public NfcomFiscalResponseLogVariant0 asVariant0() { JsonNode value = checkedVariant("api2/nfcom-issuance.openapi.json", SCHEMA, VARIANT_0); return (value).isNull() || (value).isMissingNode() ? null : new NfcomFiscalResponseLogVariant0(value); }
 private static final JsonNode VARIANT_1 = SCHEMA.path("anyOf").path(1);
 public static NfcomFiscalResponseLog ofVariant1(JsonValue value) { return new NfcomFiscalResponseLog(value == null ? null : value.toJson()); }
 public boolean matchesVariant1() { return matchesVariant("api2/nfcom-issuance.openapi.json", SCHEMA, VARIANT_1); }
 public JsonValue asVariant1() { JsonNode value = checkedVariant("api2/nfcom-issuance.openapi.json", SCHEMA, VARIANT_1); return (value).isNull() || (value).isMissingNode() ? null : new JsonValue(value); }
}
