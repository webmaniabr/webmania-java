package com.webmania.sdk.model.api1fiscal;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api1/fiscal.openapi.json; see contract-provenance.json. */
public final class NfeCancelResultLog extends JsonValue {
 private static final JsonNode SCHEMA = Json.parse("{\"anyOf\":[{\"$ref\":\"#/components/schemas/SefazLog\"},{\"type\":\"string\"},{\"type\":\"array\",\"items\":{\"$ref\":\"#/components/schemas/SefazLog\"}},{\"type\":\"null\"}]}");
 public NfeCancelResultLog(JsonNode node) { super(node); }
 private static final JsonNode VARIANT_0 = SCHEMA.path("anyOf").path(0);
 public static NfeCancelResultLog ofVariant0(SefazLog value) { return new NfeCancelResultLog(value == null ? null : value.toJson()); }
 public boolean matchesVariant0() { return matchesVariant("api1/fiscal.openapi.json", SCHEMA, VARIANT_0); }
 public SefazLog asVariant0() { JsonNode value = checkedVariant("api1/fiscal.openapi.json", SCHEMA, VARIANT_0); return (value).isNull() || (value).isMissingNode() ? null : new SefazLog(value); }
 private static final JsonNode VARIANT_1 = SCHEMA.path("anyOf").path(1);
 public static NfeCancelResultLog ofVariant1(String value) { return new NfeCancelResultLog(Json.scalar(value)); }
 public boolean matchesVariant1() { return matchesVariant("api1/fiscal.openapi.json", SCHEMA, VARIANT_1); }
 public String asVariant1() { JsonNode value = checkedVariant("api1/fiscal.openapi.json", SCHEMA, VARIANT_1); return stringValue(value); }
 private static final JsonNode VARIANT_2 = SCHEMA.path("anyOf").path(2);
 public static NfeCancelResultLog ofVariant2(java.util.List<SefazLog> value) { return new NfeCancelResultLog(array(value, v -> v == null ? null : v.toJson())); }
 public boolean matchesVariant2() { return matchesVariant("api1/fiscal.openapi.json", SCHEMA, VARIANT_2); }
 public java.util.List<SefazLog> asVariant2() { JsonNode value = checkedVariant("api1/fiscal.openapi.json", SCHEMA, VARIANT_2); return list(value, v -> (v).isNull() || (v).isMissingNode() ? null : new SefazLog(v)); }
 private static final JsonNode VARIANT_3 = SCHEMA.path("anyOf").path(3);
 public static NfeCancelResultLog ofVariant3(JsonValue value) { return new NfeCancelResultLog(value == null ? null : value.toJson()); }
 public boolean matchesVariant3() { return matchesVariant("api1/fiscal.openapi.json", SCHEMA, VARIANT_3); }
 public JsonValue asVariant3() { JsonNode value = checkedVariant("api1/fiscal.openapi.json", SCHEMA, VARIANT_3); return (value).isNull() || (value).isMissingNode() ? null : new JsonValue(value); }
}
