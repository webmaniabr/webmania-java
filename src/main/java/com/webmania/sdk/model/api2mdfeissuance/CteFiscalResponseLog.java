package com.webmania.sdk.model.api2mdfeissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/mdfe-issuance.openapi.json; see contract-provenance.json. */
public final class CteFiscalResponseLog extends JsonValue {
 private static final JsonNode SCHEMA = Json.parse("{\"anyOf\":[{\"type\":\"object\",\"properties\":{},\"additionalProperties\":true},{\"type\":\"array\",\"items\":{}},{\"type\":\"null\"}],\"description\":\"Provider-specific structured fiscal log. Preserve its fields and precision; never put raw credentials into an exception.\"}");
 public CteFiscalResponseLog(JsonNode node) { super(node); }
 private static final JsonNode VARIANT_0 = SCHEMA.path("anyOf").path(0);
 public static CteFiscalResponseLog ofVariant0(CteFiscalResponseLogVariant0 value) { return new CteFiscalResponseLog(value == null ? null : value.toJson()); }
 public boolean matchesVariant0() { return matchesVariant("api2/mdfe-issuance.openapi.json", SCHEMA, VARIANT_0); }
 public CteFiscalResponseLogVariant0 asVariant0() { JsonNode value = checkedVariant("api2/mdfe-issuance.openapi.json", SCHEMA, VARIANT_0); return (value).isNull() || (value).isMissingNode() ? null : new CteFiscalResponseLogVariant0(value); }
 private static final JsonNode VARIANT_1 = SCHEMA.path("anyOf").path(1);
 public static CteFiscalResponseLog ofVariant1(java.util.List<JsonValue> value) { return new CteFiscalResponseLog(array(value, v -> v == null ? null : v.toJson())); }
 public boolean matchesVariant1() { return matchesVariant("api2/mdfe-issuance.openapi.json", SCHEMA, VARIANT_1); }
 public java.util.List<JsonValue> asVariant1() { JsonNode value = checkedVariant("api2/mdfe-issuance.openapi.json", SCHEMA, VARIANT_1); return list(value, v -> (v).isNull() || (v).isMissingNode() ? null : new JsonValue(v)); }
 private static final JsonNode VARIANT_2 = SCHEMA.path("anyOf").path(2);
 public static CteFiscalResponseLog ofVariant2(JsonValue value) { return new CteFiscalResponseLog(value == null ? null : value.toJson()); }
 public boolean matchesVariant2() { return matchesVariant("api2/mdfe-issuance.openapi.json", SCHEMA, VARIANT_2); }
 public JsonValue asVariant2() { JsonNode value = checkedVariant("api2/mdfe-issuance.openapi.json", SCHEMA, VARIANT_2); return (value).isNull() || (value).isMissingNode() ? null : new JsonValue(value); }
}
