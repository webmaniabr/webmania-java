package com.webmania.sdk.model.api1fiscal;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api1/fiscal.openapi.json; see contract-provenance.json. */
public final class NfeOrderCnpjCredenciadora extends JsonValue {
 private static final JsonNode SCHEMA = Json.parse("{\"anyOf\":[{\"type\":\"string\",\"description\":\"*Obrigat\\u00f3rio para pagamento via Cart\\u00e3o de Cr\\u00e9dito ou D\\u00e9bito e PIX para Pagamento Integrado (TEF): | CNPJ da institui\\u00e7\\u00e3o de pagamento | CNPJ da institui\\u00e7\\u00e3o de pagamento, adquirente ou subadquirente. Caso o pagamento seja processado pelo intermediador da transa\\u00e7\\u00e3o, informar o CNPJ do intermediador.\",\"pattern\":\"^(?:[0-9A-Za-z]{14}|[0-9A-Za-z]{2}\\\\.[0-9A-Za-z]{3}\\\\.[0-9A-Za-z]{3}/[0-9A-Za-z]{4}-[0-9]{2})$\",\"x-sdk-scalar\":\"identifier-string\"},{\"type\":\"array\",\"items\":{\"type\":\"string\",\"description\":\"*Obrigat\\u00f3rio para pagamento via Cart\\u00e3o de Cr\\u00e9dito ou D\\u00e9bito e PIX para Pagamento Integrado (TEF): | CNPJ da institui\\u00e7\\u00e3o de pagamento | CNPJ da institui\\u00e7\\u00e3o de pagamento, adquirente ou subadquirente. Caso o pagamento seja processado pelo intermediador da transa\\u00e7\\u00e3o, informar o CNPJ do intermediador.\",\"pattern\":\"^(?:[0-9A-Za-z]{14}|[0-9A-Za-z]{2}\\\\.[0-9A-Za-z]{3}\\\\.[0-9A-Za-z]{3}/[0-9A-Za-z]{4}-[0-9]{2})$\",\"x-sdk-scalar\":\"identifier-string\"},\"minItems\":1}]}");
 public NfeOrderCnpjCredenciadora(JsonNode node) { super(node); }
 private static final JsonNode VARIANT_0 = SCHEMA.path("anyOf").path(0);
 public static NfeOrderCnpjCredenciadora ofVariant0(String value) { return new NfeOrderCnpjCredenciadora(Json.scalar(value)); }
 public boolean matchesVariant0() { return matchesVariant("api1/fiscal.openapi.json", SCHEMA, VARIANT_0); }
 public String asVariant0() { JsonNode value = checkedVariant("api1/fiscal.openapi.json", SCHEMA, VARIANT_0); return stringValue(value); }
 private static final JsonNode VARIANT_1 = SCHEMA.path("anyOf").path(1);
 public static NfeOrderCnpjCredenciadora ofVariant1(java.util.List<String> value) { return new NfeOrderCnpjCredenciadora(array(value, v -> Json.scalar(v))); }
 public boolean matchesVariant1() { return matchesVariant("api1/fiscal.openapi.json", SCHEMA, VARIANT_1); }
 public java.util.List<String> asVariant1() { JsonNode value = checkedVariant("api1/fiscal.openapi.json", SCHEMA, VARIANT_1); return list(value, v -> stringValue(v)); }
}
