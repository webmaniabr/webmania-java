package com.webmania.sdk.model.api1fiscal;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api1/fiscal.openapi.json; see contract-provenance.json. */
public final class NfeOrderBandeira extends JsonValue {
 private static final JsonNode SCHEMA = Json.parse("{\"anyOf\":[{\"type\":\"string\",\"description\":\"*Obrigat\\u00f3rio para pagamento via Cart\\u00e3o de Cr\\u00e9dito ou D\\u00e9bito e PIX para Pagamento Integrado (TEF): | Bandeira da operadora do cart\\u00e3o de cr\\u00e9dito e/ou d\\u00e9bito | 01 - Visa | 02 - Mastercard | 03 - American Express | 04 - Sorocred | 05 - Diners Club | 06 - Elo | 07 - Hipercard | 08 - Aura | 09 - Cabal | 10 - Alelo | 11 - Banes Card | 12 - CalCard | 13 - Credz | 14 - Discover | 15 - GoodCard | 16 - GreenCard | 17 - Hiper | 18 - JCB | 19 - Mais | 20 - MaxVan | 21 - Policard | 22 - RedeCompras | 23 - Sodexo | 24 - ValeCard | 25 - Verocheque | 26 - VR | 27 - Ticket | 99 - Outros\"},{\"type\":\"array\",\"items\":{\"type\":\"string\",\"description\":\"*Obrigat\\u00f3rio para pagamento via Cart\\u00e3o de Cr\\u00e9dito ou D\\u00e9bito e PIX para Pagamento Integrado (TEF): | Bandeira da operadora do cart\\u00e3o de cr\\u00e9dito e/ou d\\u00e9bito | 01 - Visa | 02 - Mastercard | 03 - American Express | 04 - Sorocred | 05 - Diners Club | 06 - Elo | 07 - Hipercard | 08 - Aura | 09 - Cabal | 10 - Alelo | 11 - Banes Card | 12 - CalCard | 13 - Credz | 14 - Discover | 15 - GoodCard | 16 - GreenCard | 17 - Hiper | 18 - JCB | 19 - Mais | 20 - MaxVan | 21 - Policard | 22 - RedeCompras | 23 - Sodexo | 24 - ValeCard | 25 - Verocheque | 26 - VR | 27 - Ticket | 99 - Outros\"},\"minItems\":1}]}");
 public NfeOrderBandeira(JsonNode node) { super(node); }
 private static final JsonNode VARIANT_0 = SCHEMA.path("anyOf").path(0);
 public static NfeOrderBandeira ofVariant0(String value) { return new NfeOrderBandeira(Json.scalar(value)); }
 public boolean matchesVariant0() { return matchesVariant("api1/fiscal.openapi.json", SCHEMA, VARIANT_0); }
 public String asVariant0() { JsonNode value = checkedVariant("api1/fiscal.openapi.json", SCHEMA, VARIANT_0); return stringValue(value); }
 private static final JsonNode VARIANT_1 = SCHEMA.path("anyOf").path(1);
 public static NfeOrderBandeira ofVariant1(java.util.List<String> value) { return new NfeOrderBandeira(array(value, v -> Json.scalar(v))); }
 public boolean matchesVariant1() { return matchesVariant("api1/fiscal.openapi.json", SCHEMA, VARIANT_1); }
 public java.util.List<String> asVariant1() { JsonNode value = checkedVariant("api1/fiscal.openapi.json", SCHEMA, VARIANT_1); return list(value, v -> stringValue(v)); }
}
