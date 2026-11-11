package com.webmania.sdk.model.api1fiscal;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api1/fiscal.openapi.json; see contract-provenance.json. */
public final class NfeComplementProductSubtotalTributavel extends JsonValue {
 private static final JsonNode SCHEMA = Json.parse("{\"anyOf\":[{\"type\":\"string\",\"pattern\":\"^-?[0-9]{1,11}(?:[.,][0-9]{1,10})?$\"},{\"type\":\"number\"}],\"x-sdk-scalar\":\"decimal-input\",\"x-sdk-preferred-representation\":\"string\",\"x-decimal-digits\":11,\"x-decimal-scale-maximum\":10,\"description\":\"Pre\\u00e7o unit\\u00e1rio tribut\\u00e1vel do produto | 0.00 (valor integral sem descontos)\",\"x-documentation-type\":\"string\",\"x-documentation-size\":\"11v10\",\"x-documentation-requirements\":[{\"column\":\"NF-e\",\"markers\":[\"opcional\",\"svg_optional\"]}],\"x-documentation-variants\":[{\"anyOf\":[{\"type\":\"string\",\"pattern\":\"^-?[0-9]{1,11}(?:[.,][0-9]{1,10})?$\"},{\"type\":\"number\"}],\"x-sdk-scalar\":\"decimal-input\",\"x-sdk-preferred-representation\":\"string\",\"x-decimal-digits\":11,\"x-decimal-scale-maximum\":10,\"description\":\"Pre\\u00e7o unit\\u00e1rio tribut\\u00e1vel do produto | 0.00 (valor integral sem descontos)\",\"x-documentation-type\":\"string\",\"x-documentation-size\":\"11v10\",\"x-documentation-requirements\":[{\"column\":\"NF-e / NFC-e\",\"markers\":[\"opcional\",\"svg_optional\"]}]},{\"anyOf\":[{\"type\":\"string\",\"pattern\":\"^-?[0-9]{1,11}(?:[.,][0-9]{1,10})?$\"},{\"type\":\"number\"}],\"x-sdk-scalar\":\"decimal-input\",\"x-sdk-preferred-representation\":\"string\",\"x-decimal-digits\":11,\"x-decimal-scale-maximum\":10,\"description\":\"Pre\\u00e7o unit\\u00e1rio tribut\\u00e1vel do produto | 0.00 (valor integral sem descontos)\",\"x-documentation-type\":\"string\",\"x-documentation-size\":\"11v10\",\"x-documentation-requirements\":[{\"column\":\"NF-e\",\"markers\":[\"opcional\",\"svg_optional\"]}]}]}");
 public NfeComplementProductSubtotalTributavel(JsonNode node) { super(node); }
 private static final JsonNode VARIANT_0 = SCHEMA.path("anyOf").path(0);
 public static NfeComplementProductSubtotalTributavel ofVariant0(String value) { return new NfeComplementProductSubtotalTributavel(Json.scalar(value)); }
 public boolean matchesVariant0() { return matchesVariant("api1/fiscal.openapi.json", SCHEMA, VARIANT_0); }
 public String asVariant0() { JsonNode value = checkedVariant("api1/fiscal.openapi.json", SCHEMA, VARIANT_0); return stringValue(value); }
 private static final JsonNode VARIANT_1 = SCHEMA.path("anyOf").path(1);
 public static NfeComplementProductSubtotalTributavel ofVariant1(java.math.BigDecimal value) { return new NfeComplementProductSubtotalTributavel(Json.scalar(value)); }
 public boolean matchesVariant1() { return matchesVariant("api1/fiscal.openapi.json", SCHEMA, VARIANT_1); }
 public java.math.BigDecimal asVariant1() { JsonNode value = checkedVariant("api1/fiscal.openapi.json", SCHEMA, VARIANT_1); return decimalValue(value); }
}
