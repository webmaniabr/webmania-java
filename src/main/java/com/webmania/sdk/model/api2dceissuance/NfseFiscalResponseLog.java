package com.webmania.sdk.model.api2dceissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/dce-issuance.openapi.json; see contract-provenance.json. */
public final class NfseFiscalResponseLog extends JsonValue {
 private static final JsonNode SCHEMA = Json.parse("{\"anyOf\":[{\"type\":\"object\",\"properties\":{},\"additionalProperties\":true},{\"type\":\"array\",\"items\":{}}],\"description\":\"Provider-specific raw fiscal log; preserve structure and additional fields. Never include unredacted credential values in an exception.\"}");
 public NfseFiscalResponseLog(JsonNode node) { super(node); }
 private static final JsonNode VARIANT_0 = SCHEMA.path("anyOf").path(0);
 public static NfseFiscalResponseLog ofVariant0(NfseFiscalResponseLogVariant0 value) { return new NfseFiscalResponseLog(value == null ? null : value.toJson()); }
 public boolean matchesVariant0() { return matchesVariant("api2/dce-issuance.openapi.json", SCHEMA, VARIANT_0); }
 public NfseFiscalResponseLogVariant0 asVariant0() { JsonNode value = checkedVariant("api2/dce-issuance.openapi.json", SCHEMA, VARIANT_0); return (value).isNull() || (value).isMissingNode() ? null : new NfseFiscalResponseLogVariant0(value); }
 private static final JsonNode VARIANT_1 = SCHEMA.path("anyOf").path(1);
 public static NfseFiscalResponseLog ofVariant1(java.util.List<JsonValue> value) { return new NfseFiscalResponseLog(array(value, v -> v == null ? null : v.toJson())); }
 public boolean matchesVariant1() { return matchesVariant("api2/dce-issuance.openapi.json", SCHEMA, VARIANT_1); }
 public java.util.List<JsonValue> asVariant1() { JsonNode value = checkedVariant("api2/dce-issuance.openapi.json", SCHEMA, VARIANT_1); return list(value, v -> (v).isNull() || (v).isMissingNode() ? null : new JsonValue(v)); }
}
