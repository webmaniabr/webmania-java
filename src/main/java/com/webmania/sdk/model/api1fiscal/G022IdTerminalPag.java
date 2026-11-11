package com.webmania.sdk.model.api1fiscal;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api1/fiscal.openapi.json; see contract-provenance.json. */
public final class G022IdTerminalPag extends JsonValue {
 private static final JsonNode SCHEMA = Json.parse("{\"anyOf\":[{\"type\":\"string\",\"description\":\"*Obrigat\\u00f3rio para pagamento via Cart\\u00e3o de Cr\\u00e9dito ou D\\u00e9bito e PIX para Pagamento Integrado (TEF): | Identificador do terminal em que foi realizado o pagamento\"},{\"type\":\"array\",\"items\":{\"type\":\"string\",\"description\":\"*Obrigat\\u00f3rio para pagamento via Cart\\u00e3o de Cr\\u00e9dito ou D\\u00e9bito e PIX para Pagamento Integrado (TEF): | Identificador do terminal em que foi realizado o pagamento\"},\"minItems\":1}]}");
 public G022IdTerminalPag(JsonNode node) { super(node); }
 private static final JsonNode VARIANT_0 = SCHEMA.path("anyOf").path(0);
 public static G022IdTerminalPag ofVariant0(String value) { return new G022IdTerminalPag(Json.scalar(value)); }
 public boolean matchesVariant0() { return matchesVariant("api1/fiscal.openapi.json", SCHEMA, VARIANT_0); }
 public String asVariant0() { JsonNode value = checkedVariant("api1/fiscal.openapi.json", SCHEMA, VARIANT_0); return stringValue(value); }
 private static final JsonNode VARIANT_1 = SCHEMA.path("anyOf").path(1);
 public static G022IdTerminalPag ofVariant1(java.util.List<String> value) { return new G022IdTerminalPag(array(value, v -> Json.scalar(v))); }
 public boolean matchesVariant1() { return matchesVariant("api1/fiscal.openapi.json", SCHEMA, VARIANT_1); }
 public java.util.List<String> asVariant1() { JsonNode value = checkedVariant("api1/fiscal.openapi.json", SCHEMA, VARIANT_1); return list(value, v -> stringValue(v)); }
}
