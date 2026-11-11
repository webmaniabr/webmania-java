package com.webmania.sdk.model.api1fiscal;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api1/fiscal.openapi.json; see contract-provenance.json. */
public final class NfeIcmsAliquotaFcp extends JsonValue {
 private static final JsonNode SCHEMA = Json.parse("{\"anyOf\":[{\"type\":\"string\",\"pattern\":\"^-?[0-9]{1,3}(?:[.,][0-9]{1,2})?$\"},{\"type\":\"number\"}],\"x-sdk-scalar\":\"decimal-input\",\"x-sdk-preferred-representation\":\"string\",\"x-decimal-digits\":3,\"x-decimal-scale-maximum\":2,\"description\":\"Al\\u00edquota do FCP (opcional) | (dynamic documentation value; see operation limitations)\",\"x-documentation-type\":\"string\",\"x-documentation-size\":\"3v2\",\"x-documentation-requirements\":[{\"column\":\"NF-e / NFC-e\",\"markers\":[\"opcional\",\"svg_optional\"]},{\"column\":\"Descri\\u00e7\\u00e3o\",\"markers\":[\"opcional\"]}],\"x-documentation-variants\":[{\"anyOf\":[{\"type\":\"string\",\"pattern\":\"^-?[0-9]{1,3}(?:[.,][0-9]{1,2})?$\"},{\"type\":\"number\"}],\"x-sdk-scalar\":\"decimal-input\",\"x-sdk-preferred-representation\":\"string\",\"x-decimal-digits\":3,\"x-decimal-scale-maximum\":2,\"description\":\"Al\\u00edquota do FCP (opcional) | (dynamic documentation value; see operation limitations)\",\"x-documentation-type\":\"string\",\"x-documentation-size\":\"3v2\",\"x-documentation-requirements\":[{\"column\":\"NF-e / NFC-e\",\"markers\":[\"opcional\",\"svg_optional\"]},{\"column\":\"Descri\\u00e7\\u00e3o\",\"markers\":[\"opcional\"]}]},{\"anyOf\":[{\"type\":\"string\",\"pattern\":\"^-?[0-9]{1,3}(?:[.,][0-9]{1,2})?$\"},{\"type\":\"number\"}],\"x-sdk-scalar\":\"decimal-input\",\"x-sdk-preferred-representation\":\"string\",\"x-decimal-digits\":3,\"x-decimal-scale-maximum\":2,\"description\":\"Al\\u00edquota do FCP (opcional) | (dynamic documentation value; see operation limitations)\",\"x-documentation-type\":\"string\",\"x-documentation-size\":\"3v2\",\"x-documentation-requirements\":[{\"column\":\"NF-e / NFC-e\",\"markers\":[\"opcional\",\"svg_optional\"]},{\"column\":\"Descri\\u00e7\\u00e3o\",\"markers\":[\"opcional\"]}]}]}");
 public NfeIcmsAliquotaFcp(JsonNode node) { super(node); }
 private static final JsonNode VARIANT_0 = SCHEMA.path("anyOf").path(0);
 public static NfeIcmsAliquotaFcp ofVariant0(String value) { return new NfeIcmsAliquotaFcp(Json.scalar(value)); }
 public boolean matchesVariant0() { return matchesVariant("api1/fiscal.openapi.json", SCHEMA, VARIANT_0); }
 public String asVariant0() { JsonNode value = checkedVariant("api1/fiscal.openapi.json", SCHEMA, VARIANT_0); return stringValue(value); }
 private static final JsonNode VARIANT_1 = SCHEMA.path("anyOf").path(1);
 public static NfeIcmsAliquotaFcp ofVariant1(java.math.BigDecimal value) { return new NfeIcmsAliquotaFcp(Json.scalar(value)); }
 public boolean matchesVariant1() { return matchesVariant("api1/fiscal.openapi.json", SCHEMA, VARIANT_1); }
 public java.math.BigDecimal asVariant1() { JsonNode value = checkedVariant("api1/fiscal.openapi.json", SCHEMA, VARIANT_1); return decimalValue(value); }
}
