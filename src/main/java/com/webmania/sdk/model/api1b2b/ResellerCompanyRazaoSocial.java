package com.webmania.sdk.model.api1b2b;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api1/b2b.openapi.json; see contract-provenance.json. */
public final class ResellerCompanyRazaoSocial extends JsonValue {
 private static final JsonNode SCHEMA = Json.parse("{\"type\":[\"string\",\"null\"]}");
 public ResellerCompanyRazaoSocial(JsonNode node) { super(node); }
 private static final JsonNode VARIANT_0 = Json.parse("{\"type\":\"string\"}");
 public static ResellerCompanyRazaoSocial ofVariant0(String value) { return new ResellerCompanyRazaoSocial(Json.scalar(value)); }
 public boolean matchesVariant0() { return matchesVariant("api1/b2b.openapi.json", SCHEMA, VARIANT_0); }
 public String asVariant0() { JsonNode value = checkedVariant("api1/b2b.openapi.json", SCHEMA, VARIANT_0); return stringValue(value); }
 private static final JsonNode VARIANT_1 = Json.parse("{\"type\":\"null\"}");
 public static ResellerCompanyRazaoSocial ofVariant1(JsonValue value) { return new ResellerCompanyRazaoSocial(value == null ? null : value.toJson()); }
 public boolean matchesVariant1() { return matchesVariant("api1/b2b.openapi.json", SCHEMA, VARIANT_1); }
 public JsonValue asVariant1() { JsonNode value = checkedVariant("api1/b2b.openapi.json", SCHEMA, VARIANT_1); return (value).isNull() || (value).isMissingNode() ? null : new JsonValue(value); }
}
