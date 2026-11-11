package com.webmania.sdk.model.api1b2b;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api1/b2b.openapi.json; see contract-provenance.json. */
public final class ResellerCompanyUnidadeEmpresa extends JsonValue {
 private static final JsonNode SCHEMA = Json.parse("{\"type\":[\"integer\",\"string\",\"null\"]}");
 public ResellerCompanyUnidadeEmpresa(JsonNode node) { super(node); }
 private static final JsonNode VARIANT_0 = Json.parse("{\"type\":\"integer\"}");
 public static ResellerCompanyUnidadeEmpresa ofVariant0(java.math.BigInteger value) { return new ResellerCompanyUnidadeEmpresa(Json.scalar(value)); }
 public boolean matchesVariant0() { return matchesVariant("api1/b2b.openapi.json", SCHEMA, VARIANT_0); }
 public java.math.BigInteger asVariant0() { JsonNode value = checkedVariant("api1/b2b.openapi.json", SCHEMA, VARIANT_0); return integerValue(value); }
 private static final JsonNode VARIANT_1 = Json.parse("{\"type\":\"string\"}");
 public static ResellerCompanyUnidadeEmpresa ofVariant1(String value) { return new ResellerCompanyUnidadeEmpresa(Json.scalar(value)); }
 public boolean matchesVariant1() { return matchesVariant("api1/b2b.openapi.json", SCHEMA, VARIANT_1); }
 public String asVariant1() { JsonNode value = checkedVariant("api1/b2b.openapi.json", SCHEMA, VARIANT_1); return stringValue(value); }
 private static final JsonNode VARIANT_2 = Json.parse("{\"type\":\"null\"}");
 public static ResellerCompanyUnidadeEmpresa ofVariant2(JsonValue value) { return new ResellerCompanyUnidadeEmpresa(value == null ? null : value.toJson()); }
 public boolean matchesVariant2() { return matchesVariant("api1/b2b.openapi.json", SCHEMA, VARIANT_2); }
 public JsonValue asVariant2() { JsonNode value = checkedVariant("api1/b2b.openapi.json", SCHEMA, VARIANT_2); return (value).isNull() || (value).isMissingNode() ? null : new JsonValue(value); }
}
