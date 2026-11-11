package com.webmania.sdk.model.api1fiscal;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api1/fiscal.openapi.json; see contract-provenance.json. */
public final class NfeIcmsMajoracao extends JsonValue {
 private static final JsonNode SCHEMA = Json.parse("{\"anyOf\":[{\"type\":\"string\",\"pattern\":\"^-?[0-9]{1,13}(?:[.,][0-9]{1,2})?$\"},{\"type\":\"number\"}],\"x-sdk-scalar\":\"decimal-input\",\"x-sdk-preferred-representation\":\"string\",\"x-decimal-digits\":13,\"x-decimal-scale-maximum\":2,\"description\":\"A majora\\u00e7\\u00e3o \\u00e9 a eleva\\u00e7\\u00e3o do valor da presta\\u00e7\\u00e3o tribut\\u00e1ria, opera-se por meio da manipula\\u00e7\\u00e3o da base de c\\u00e1lculo. | 0.00\",\"x-documentation-type\":\"string\",\"x-documentation-size\":\"13v2\",\"x-documentation-requirements\":[{\"column\":\"NF-e / NFC-e\",\"markers\":[\"opcional\",\"svg_optional\"]}],\"x-documentation-variants\":[{\"anyOf\":[{\"type\":\"string\",\"pattern\":\"^-?[0-9]{1,13}(?:[.,][0-9]{1,2})?$\"},{\"type\":\"number\"}],\"x-sdk-scalar\":\"decimal-input\",\"x-sdk-preferred-representation\":\"string\",\"x-decimal-digits\":13,\"x-decimal-scale-maximum\":2,\"description\":\"A majora\\u00e7\\u00e3o \\u00e9 a eleva\\u00e7\\u00e3o do valor da presta\\u00e7\\u00e3o tribut\\u00e1ria, opera-se por meio da manipula\\u00e7\\u00e3o da base de c\\u00e1lculo. | 0.00\",\"x-documentation-type\":\"string\",\"x-documentation-size\":\"13v2\",\"x-documentation-requirements\":[{\"column\":\"NF-e / NFC-e\",\"markers\":[\"opcional\",\"svg_optional\"]}]},{\"anyOf\":[{\"type\":\"string\",\"pattern\":\"^-?[0-9]{1,13}(?:[.,][0-9]{1,2})?$\"},{\"type\":\"number\"}],\"x-sdk-scalar\":\"decimal-input\",\"x-sdk-preferred-representation\":\"string\",\"x-decimal-digits\":13,\"x-decimal-scale-maximum\":2,\"description\":\"A majora\\u00e7\\u00e3o \\u00e9 a eleva\\u00e7\\u00e3o do valor da presta\\u00e7\\u00e3o tribut\\u00e1ria, opera-se por meio da manipula\\u00e7\\u00e3o da base de c\\u00e1lculo. | 0.00\",\"x-documentation-type\":\"string\",\"x-documentation-size\":\"13v2\",\"x-documentation-requirements\":[{\"column\":\"NF-e / NFC-e\",\"markers\":[\"opcional\",\"svg_optional\"]}]}]}");
 public NfeIcmsMajoracao(JsonNode node) { super(node); }
 private static final JsonNode VARIANT_0 = SCHEMA.path("anyOf").path(0);
 public static NfeIcmsMajoracao ofVariant0(String value) { return new NfeIcmsMajoracao(Json.scalar(value)); }
 public boolean matchesVariant0() { return matchesVariant("api1/fiscal.openapi.json", SCHEMA, VARIANT_0); }
 public String asVariant0() { JsonNode value = checkedVariant("api1/fiscal.openapi.json", SCHEMA, VARIANT_0); return stringValue(value); }
 private static final JsonNode VARIANT_1 = SCHEMA.path("anyOf").path(1);
 public static NfeIcmsMajoracao ofVariant1(java.math.BigDecimal value) { return new NfeIcmsMajoracao(Json.scalar(value)); }
 public boolean matchesVariant1() { return matchesVariant("api1/fiscal.openapi.json", SCHEMA, VARIANT_1); }
 public java.math.BigDecimal asVariant1() { JsonNode value = checkedVariant("api1/fiscal.openapi.json", SCHEMA, VARIANT_1); return decimalValue(value); }
}
