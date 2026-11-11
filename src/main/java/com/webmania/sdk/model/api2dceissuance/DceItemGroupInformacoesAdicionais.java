package com.webmania.sdk.model.api2dceissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/dce-issuance.openapi.json; see contract-provenance.json. */
public final class DceItemGroupInformacoesAdicionais extends JsonValue {
 private static final JsonNode SCHEMA = Json.parse("{\"anyOf\":[{\"type\":\"string\",\"minLength\":1,\"maxLength\":500},{\"type\":\"null\"}],\"description\":\"Informa\\u00e7\\u00f5es complementares do item (ex: lote, validade).\",\"x-documented-condition\":\"Informa\\u00e7\\u00f5es complementares do item (ex: lote, validade).\",\"x-documented-size\":\"1-500\"}");
 public DceItemGroupInformacoesAdicionais(JsonNode node) { super(node); }
 private static final JsonNode VARIANT_0 = SCHEMA.path("anyOf").path(0);
 public static DceItemGroupInformacoesAdicionais ofVariant0(String value) { return new DceItemGroupInformacoesAdicionais(Json.scalar(value)); }
 public boolean matchesVariant0() { return matchesVariant("api2/dce-issuance.openapi.json", SCHEMA, VARIANT_0); }
 public String asVariant0() { JsonNode value = checkedVariant("api2/dce-issuance.openapi.json", SCHEMA, VARIANT_0); return stringValue(value); }
 private static final JsonNode VARIANT_1 = SCHEMA.path("anyOf").path(1);
 public static DceItemGroupInformacoesAdicionais ofVariant1(JsonValue value) { return new DceItemGroupInformacoesAdicionais(value == null ? null : value.toJson()); }
 public boolean matchesVariant1() { return matchesVariant("api2/dce-issuance.openapi.json", SCHEMA, VARIANT_1); }
 public JsonValue asVariant1() { JsonNode value = checkedVariant("api2/dce-issuance.openapi.json", SCHEMA, VARIANT_1); return (value).isNull() || (value).isMissingNode() ? null : new JsonValue(value); }
}
