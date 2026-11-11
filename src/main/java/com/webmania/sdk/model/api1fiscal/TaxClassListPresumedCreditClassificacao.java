package com.webmania.sdk.model.api1fiscal;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api1/fiscal.openapi.json; see contract-provenance.json. */
public final class TaxClassListPresumedCreditClassificacao extends JsonValue {
 private static final JsonNode SCHEMA = Json.parse("{\"anyOf\":[{\"type\":\"string\"},{\"type\":\"null\"}],\"description\":\"C\\u00f3digo de classifica\\u00e7\\u00e3o do cr\\u00e9dito presumido Na listagem de classes de imposto, o c\\u00f3digo vem como gravado (por exemplo \\\"3\\\" ou \\\"10\\\") e \\u00e9 nulo quando o cen\\u00e1rio admite cr\\u00e9dito presumido, mas nenhum foi informado.\"}");
 public TaxClassListPresumedCreditClassificacao(JsonNode node) { super(node); }
 private static final JsonNode VARIANT_0 = SCHEMA.path("anyOf").path(0);
 public static TaxClassListPresumedCreditClassificacao ofVariant0(String value) { return new TaxClassListPresumedCreditClassificacao(Json.scalar(value)); }
 public boolean matchesVariant0() { return matchesVariant("api1/fiscal.openapi.json", SCHEMA, VARIANT_0); }
 public String asVariant0() { JsonNode value = checkedVariant("api1/fiscal.openapi.json", SCHEMA, VARIANT_0); return stringValue(value); }
 private static final JsonNode VARIANT_1 = SCHEMA.path("anyOf").path(1);
 public static TaxClassListPresumedCreditClassificacao ofVariant1(JsonValue value) { return new TaxClassListPresumedCreditClassificacao(value == null ? null : value.toJson()); }
 public boolean matchesVariant1() { return matchesVariant("api1/fiscal.openapi.json", SCHEMA, VARIANT_1); }
 public JsonValue asVariant1() { JsonNode value = checkedVariant("api1/fiscal.openapi.json", SCHEMA, VARIANT_1); return (value).isNull() || (value).isMissingNode() ? null : new JsonValue(value); }
}
