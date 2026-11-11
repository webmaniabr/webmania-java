package com.webmania.sdk.model.api1fiscal;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api1/fiscal.openapi.json; see contract-provenance.json. */
public final class G127ControleEstoqueQuantidade extends JsonValue {
 private static final JsonNode SCHEMA = Json.parse("{\"anyOf\":[{\"type\":\"string\",\"pattern\":\"^-?[0-9]{1,11}(?:[.,][0-9]{1,4})?$\"},{\"type\":\"number\"}],\"x-sdk-scalar\":\"decimal-input\",\"x-sdk-preferred-representation\":\"string\",\"x-decimal-digits\":11,\"x-decimal-scale-maximum\":4,\"description\":\"Quantidade sem atendimento dos requisitos para convers\\u00e3o em isen\\u00e7\\u00e3o.\",\"x-documentation-type\":\"decimal\",\"x-documentation-size\":\"11v0-4\",\"x-documentation-requirements\":[]}");
 public G127ControleEstoqueQuantidade(JsonNode node) { super(node); }
 private static final JsonNode VARIANT_0 = SCHEMA.path("anyOf").path(0);
 public static G127ControleEstoqueQuantidade ofVariant0(String value) { return new G127ControleEstoqueQuantidade(Json.scalar(value)); }
 public boolean matchesVariant0() { return matchesVariant("api1/fiscal.openapi.json", SCHEMA, VARIANT_0); }
 public String asVariant0() { JsonNode value = checkedVariant("api1/fiscal.openapi.json", SCHEMA, VARIANT_0); return stringValue(value); }
 private static final JsonNode VARIANT_1 = SCHEMA.path("anyOf").path(1);
 public static G127ControleEstoqueQuantidade ofVariant1(java.math.BigDecimal value) { return new G127ControleEstoqueQuantidade(Json.scalar(value)); }
 public boolean matchesVariant1() { return matchesVariant("api1/fiscal.openapi.json", SCHEMA, VARIANT_1); }
 public java.math.BigDecimal asVariant1() { JsonNode value = checkedVariant("api1/fiscal.openapi.json", SCHEMA, VARIANT_1); return decimalValue(value); }
}
