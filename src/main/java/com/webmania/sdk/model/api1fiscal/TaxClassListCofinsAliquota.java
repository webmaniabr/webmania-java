package com.webmania.sdk.model.api1fiscal;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api1/fiscal.openapi.json; see contract-provenance.json. */
public final class TaxClassListCofinsAliquota extends JsonValue {
 private static final JsonNode SCHEMA = Json.parse("{\"anyOf\":[{\"type\":\"string\",\"pattern\":\"^-?[0-9]{1,3}(?:[.,][0-9]{1,4})?$\"},{\"type\":\"number\"},{\"type\":\"null\"}],\"x-sdk-scalar\":\"decimal-input\",\"x-sdk-preferred-representation\":\"string\",\"x-decimal-digits\":3,\"x-decimal-scale-maximum\":4,\"description\":\"Public numeric input accepts decimal text or JSON number. Prefer text to preserve exact digits; SDKs must not silently coerce decimal text to binary floating point. Numeric wire input retains the runtime precision supplied by its caller. In tax-class list responses null means that no rate is stored for the scenario.\"}");
 public TaxClassListCofinsAliquota(JsonNode node) { super(node); }
 private static final JsonNode VARIANT_0 = SCHEMA.path("anyOf").path(0);
 public static TaxClassListCofinsAliquota ofVariant0(String value) { return new TaxClassListCofinsAliquota(Json.scalar(value)); }
 public boolean matchesVariant0() { return matchesVariant("api1/fiscal.openapi.json", SCHEMA, VARIANT_0); }
 public String asVariant0() { JsonNode value = checkedVariant("api1/fiscal.openapi.json", SCHEMA, VARIANT_0); return stringValue(value); }
 private static final JsonNode VARIANT_1 = SCHEMA.path("anyOf").path(1);
 public static TaxClassListCofinsAliquota ofVariant1(java.math.BigDecimal value) { return new TaxClassListCofinsAliquota(Json.scalar(value)); }
 public boolean matchesVariant1() { return matchesVariant("api1/fiscal.openapi.json", SCHEMA, VARIANT_1); }
 public java.math.BigDecimal asVariant1() { JsonNode value = checkedVariant("api1/fiscal.openapi.json", SCHEMA, VARIANT_1); return decimalValue(value); }
 private static final JsonNode VARIANT_2 = SCHEMA.path("anyOf").path(2);
 public static TaxClassListCofinsAliquota ofVariant2(JsonValue value) { return new TaxClassListCofinsAliquota(value == null ? null : value.toJson()); }
 public boolean matchesVariant2() { return matchesVariant("api1/fiscal.openapi.json", SCHEMA, VARIANT_2); }
 public JsonValue asVariant2() { JsonNode value = checkedVariant("api1/fiscal.openapi.json", SCHEMA, VARIANT_2); return (value).isNull() || (value).isMissingNode() ? null : new JsonValue(value); }
}
