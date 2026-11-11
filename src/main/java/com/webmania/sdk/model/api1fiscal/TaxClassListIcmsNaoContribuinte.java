package com.webmania.sdk.model.api1fiscal;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api1/fiscal.openapi.json; see contract-provenance.json. */
public final class TaxClassListIcmsNaoContribuinte extends JsonValue {
 private static final JsonNode SCHEMA = Json.parse("{\"description\":\"Informar como true caso o cen\\u00e1rio seja espec\\u00edfico para Pessoa Jur\\u00eddica n\\u00e3o contribuinte do ICMS ou Consumidor final. Na listagem de classes de imposto, uma classe gravada pode trazer o indicador como o texto \\\"1\\\" (verdadeiro) ou \\\"0\\\" (falso).\",\"anyOf\":[{\"type\":\"boolean\"},{\"type\":\"string\",\"enum\":[\"0\",\"1\"]}]}");
 public TaxClassListIcmsNaoContribuinte(JsonNode node) { super(node); }
 private static final JsonNode VARIANT_0 = SCHEMA.path("anyOf").path(0);
 public static TaxClassListIcmsNaoContribuinte ofVariant0(Boolean value) { return new TaxClassListIcmsNaoContribuinte(Json.scalar(value)); }
 public boolean matchesVariant0() { return matchesVariant("api1/fiscal.openapi.json", SCHEMA, VARIANT_0); }
 public Boolean asVariant0() { JsonNode value = checkedVariant("api1/fiscal.openapi.json", SCHEMA, VARIANT_0); return booleanValue(value); }
 private static final JsonNode VARIANT_1 = SCHEMA.path("anyOf").path(1);
 public static TaxClassListIcmsNaoContribuinte ofVariant1(String value) { return new TaxClassListIcmsNaoContribuinte(Json.scalar(value)); }
 public boolean matchesVariant1() { return matchesVariant("api1/fiscal.openapi.json", SCHEMA, VARIANT_1); }
 public String asVariant1() { JsonNode value = checkedVariant("api1/fiscal.openapi.json", SCHEMA, VARIANT_1); return stringValue(value); }
}
