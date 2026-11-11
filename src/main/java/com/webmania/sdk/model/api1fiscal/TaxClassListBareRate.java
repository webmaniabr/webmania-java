package com.webmania.sdk.model.api1fiscal;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api1/fiscal.openapi.json; see contract-provenance.json. */
public final class TaxClassListBareRate extends JsonValue {
 private static final JsonNode SCHEMA = Json.parse("{\"description\":\"A per-UF rate stored without its UF: a decimal number or text, or an empty text for an inert value.\",\"anyOf\":[{\"type\":\"string\",\"pattern\":\"^-?[0-9]{1,3}(?:[.,][0-9]{1,4})?$\"},{\"type\":\"number\"},{\"type\":\"string\",\"maxLength\":0}]}");
 public TaxClassListBareRate(JsonNode node) { super(node); }
 private static final JsonNode VARIANT_0 = SCHEMA.path("anyOf").path(0);
 public static TaxClassListBareRate ofVariant0(String value) { return new TaxClassListBareRate(Json.scalar(value)); }
 public boolean matchesVariant0() { return matchesVariant("api1/fiscal.openapi.json", SCHEMA, VARIANT_0); }
 public String asVariant0() { JsonNode value = checkedVariant("api1/fiscal.openapi.json", SCHEMA, VARIANT_0); return stringValue(value); }
 private static final JsonNode VARIANT_1 = SCHEMA.path("anyOf").path(1);
 public static TaxClassListBareRate ofVariant1(java.math.BigDecimal value) { return new TaxClassListBareRate(Json.scalar(value)); }
 public boolean matchesVariant1() { return matchesVariant("api1/fiscal.openapi.json", SCHEMA, VARIANT_1); }
 public java.math.BigDecimal asVariant1() { JsonNode value = checkedVariant("api1/fiscal.openapi.json", SCHEMA, VARIANT_1); return decimalValue(value); }
 private static final JsonNode VARIANT_2 = SCHEMA.path("anyOf").path(2);
 public static TaxClassListBareRate ofVariant2(String value) { return new TaxClassListBareRate(Json.scalar(value)); }
 public boolean matchesVariant2() { return matchesVariant("api1/fiscal.openapi.json", SCHEMA, VARIANT_2); }
 public String asVariant2() { JsonNode value = checkedVariant("api1/fiscal.openapi.json", SCHEMA, VARIANT_2); return stringValue(value); }
}
