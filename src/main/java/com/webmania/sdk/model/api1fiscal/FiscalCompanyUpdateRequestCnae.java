package com.webmania.sdk.model.api1fiscal;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api1/fiscal.openapi.json; see contract-provenance.json. */
public final class FiscalCompanyUpdateRequestCnae extends JsonValue {
 private static final JsonNode SCHEMA = Json.parse("{\"anyOf\":[{\"type\":\"string\"},{\"type\":\"array\",\"items\":{\"type\":\"string\"}},{\"type\":\"null\"}]}");
 public FiscalCompanyUpdateRequestCnae(JsonNode node) { super(node); }
 private static final JsonNode VARIANT_0 = SCHEMA.path("anyOf").path(0);
 public static FiscalCompanyUpdateRequestCnae ofVariant0(String value) { return new FiscalCompanyUpdateRequestCnae(Json.scalar(value)); }
 public boolean matchesVariant0() { return matchesVariant("api1/fiscal.openapi.json", SCHEMA, VARIANT_0); }
 public String asVariant0() { JsonNode value = checkedVariant("api1/fiscal.openapi.json", SCHEMA, VARIANT_0); return stringValue(value); }
 private static final JsonNode VARIANT_1 = SCHEMA.path("anyOf").path(1);
 public static FiscalCompanyUpdateRequestCnae ofVariant1(java.util.List<String> value) { return new FiscalCompanyUpdateRequestCnae(array(value, v -> Json.scalar(v))); }
 public boolean matchesVariant1() { return matchesVariant("api1/fiscal.openapi.json", SCHEMA, VARIANT_1); }
 public java.util.List<String> asVariant1() { JsonNode value = checkedVariant("api1/fiscal.openapi.json", SCHEMA, VARIANT_1); return list(value, v -> stringValue(v)); }
 private static final JsonNode VARIANT_2 = SCHEMA.path("anyOf").path(2);
 public static FiscalCompanyUpdateRequestCnae ofVariant2(JsonValue value) { return new FiscalCompanyUpdateRequestCnae(value == null ? null : value.toJson()); }
 public boolean matchesVariant2() { return matchesVariant("api1/fiscal.openapi.json", SCHEMA, VARIANT_2); }
 public JsonValue asVariant2() { JsonNode value = checkedVariant("api1/fiscal.openapi.json", SCHEMA, VARIANT_2); return (value).isNull() || (value).isMissingNode() ? null : new JsonValue(value); }
}
