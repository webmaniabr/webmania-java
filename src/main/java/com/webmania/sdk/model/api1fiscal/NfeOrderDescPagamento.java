package com.webmania.sdk.model.api1fiscal;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api1/fiscal.openapi.json; see contract-provenance.json. */
public final class NfeOrderDescPagamento extends JsonValue {
 private static final JsonNode SCHEMA = Json.parse("{\"anyOf\":[{\"type\":\"string\",\"description\":\"*Obrigat\\u00f3rio para 99 - Outros | Descri\\u00e7\\u00e3o do Meio de pagamento\"},{\"type\":\"array\",\"items\":{\"type\":\"string\",\"description\":\"*Obrigat\\u00f3rio para 99 - Outros | Descri\\u00e7\\u00e3o do Meio de pagamento\"},\"minItems\":1}]}");
 public NfeOrderDescPagamento(JsonNode node) { super(node); }
 private static final JsonNode VARIANT_0 = SCHEMA.path("anyOf").path(0);
 public static NfeOrderDescPagamento ofVariant0(String value) { return new NfeOrderDescPagamento(Json.scalar(value)); }
 public boolean matchesVariant0() { return matchesVariant("api1/fiscal.openapi.json", SCHEMA, VARIANT_0); }
 public String asVariant0() { JsonNode value = checkedVariant("api1/fiscal.openapi.json", SCHEMA, VARIANT_0); return stringValue(value); }
 private static final JsonNode VARIANT_1 = SCHEMA.path("anyOf").path(1);
 public static NfeOrderDescPagamento ofVariant1(java.util.List<String> value) { return new NfeOrderDescPagamento(array(value, v -> Json.scalar(v))); }
 public boolean matchesVariant1() { return matchesVariant("api1/fiscal.openapi.json", SCHEMA, VARIANT_1); }
 public java.util.List<String> asVariant1() { JsonNode value = checkedVariant("api1/fiscal.openapi.json", SCHEMA, VARIANT_1); return list(value, v -> stringValue(v)); }
}
