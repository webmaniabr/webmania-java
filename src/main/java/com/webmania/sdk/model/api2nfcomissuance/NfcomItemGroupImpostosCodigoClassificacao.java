package com.webmania.sdk.model.api2nfcomissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/nfcom-issuance.openapi.json; see contract-provenance.json. */
public final class NfcomItemGroupImpostosCodigoClassificacao extends JsonValue {
 private static final JsonNode SCHEMA = Json.parse("{\"anyOf\":[{\"type\":\"string\"},{\"type\":\"null\"}],\"description\":\"C\\u00f3digo de classifica\\u00e7\\u00e3o do item Obrigat\\u00f3rio informar aqui ou no item quando n\\u00e3o usar classe_imposto. Consulte a tabela de classifica\\u00e7\\u00f5es .\",\"x-documented-condition\":\"C\\u00f3digo de classifica\\u00e7\\u00e3o do item Obrigat\\u00f3rio informar aqui ou no item quando n\\u00e3o usar classe_imposto. Consulte a tabela de classifica\\u00e7\\u00f5es .\",\"x-documented-size\":\"6-7\"}");
 public NfcomItemGroupImpostosCodigoClassificacao(JsonNode node) { super(node); }
 private static final JsonNode VARIANT_0 = SCHEMA.path("anyOf").path(0);
 public static NfcomItemGroupImpostosCodigoClassificacao ofVariant0(String value) { return new NfcomItemGroupImpostosCodigoClassificacao(Json.scalar(value)); }
 public boolean matchesVariant0() { return matchesVariant("api2/nfcom-issuance.openapi.json", SCHEMA, VARIANT_0); }
 public String asVariant0() { JsonNode value = checkedVariant("api2/nfcom-issuance.openapi.json", SCHEMA, VARIANT_0); return stringValue(value); }
 private static final JsonNode VARIANT_1 = SCHEMA.path("anyOf").path(1);
 public static NfcomItemGroupImpostosCodigoClassificacao ofVariant1(JsonValue value) { return new NfcomItemGroupImpostosCodigoClassificacao(value == null ? null : value.toJson()); }
 public boolean matchesVariant1() { return matchesVariant("api2/nfcom-issuance.openapi.json", SCHEMA, VARIANT_1); }
 public JsonValue asVariant1() { JsonNode value = checkedVariant("api2/nfcom-issuance.openapi.json", SCHEMA, VARIANT_1); return (value).isNull() || (value).isMissingNode() ? null : new JsonValue(value); }
}
