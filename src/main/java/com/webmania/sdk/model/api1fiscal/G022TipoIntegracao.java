package com.webmania.sdk.model.api1fiscal;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api1/fiscal.openapi.json; see contract-provenance.json. */
public final class G022TipoIntegracao extends JsonValue {
 private static final JsonNode SCHEMA = Json.parse("{\"anyOf\":[{\"type\":\"integer\",\"description\":\"Tipo de integra\\u00e7\\u00e3o para pagamento | 1 - Pagamento integrado com o sistema de automa\\u00e7\\u00e3o da empresa (Ex: equipamento TEF, Com\\u00e9rcio eletr\\u00f4nico, POS Integrado) | 2 - Pagamento n\\u00e3o integrado com o sistema de automa\\u00e7\\u00e3o da empresa (Ex: equipamento POS Simples) | Padr\\u00e3o: 2\"},{\"type\":\"array\",\"items\":{\"type\":\"integer\",\"description\":\"Tipo de integra\\u00e7\\u00e3o para pagamento | 1 - Pagamento integrado com o sistema de automa\\u00e7\\u00e3o da empresa (Ex: equipamento TEF, Com\\u00e9rcio eletr\\u00f4nico, POS Integrado) | 2 - Pagamento n\\u00e3o integrado com o sistema de automa\\u00e7\\u00e3o da empresa (Ex: equipamento POS Simples) | Padr\\u00e3o: 2\"},\"minItems\":1}]}");
 public G022TipoIntegracao(JsonNode node) { super(node); }
 private static final JsonNode VARIANT_0 = SCHEMA.path("anyOf").path(0);
 public static G022TipoIntegracao ofVariant0(java.math.BigInteger value) { return new G022TipoIntegracao(Json.scalar(value)); }
 public boolean matchesVariant0() { return matchesVariant("api1/fiscal.openapi.json", SCHEMA, VARIANT_0); }
 public java.math.BigInteger asVariant0() { JsonNode value = checkedVariant("api1/fiscal.openapi.json", SCHEMA, VARIANT_0); return integerValue(value); }
 private static final JsonNode VARIANT_1 = SCHEMA.path("anyOf").path(1);
 public static G022TipoIntegracao ofVariant1(java.util.List<java.math.BigInteger> value) { return new G022TipoIntegracao(array(value, v -> Json.scalar(v))); }
 public boolean matchesVariant1() { return matchesVariant("api1/fiscal.openapi.json", SCHEMA, VARIANT_1); }
 public java.util.List<java.math.BigInteger> asVariant1() { JsonNode value = checkedVariant("api1/fiscal.openapi.json", SCHEMA, VARIANT_1); return list(value, v -> integerValue(v)); }
}
