package com.webmania.sdk.model.api2dceissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/dce-issuance.openapi.json; see contract-provenance.json. */
public final class EmitterIssueDcePayloadObservacoes extends JsonValue {
 private static final JsonNode SCHEMA = Json.parse("{\"anyOf\":[{\"type\":\"array\",\"items\":{\"type\":\"object\",\"additionalProperties\":true,\"properties\":{\"campo\":{\"type\":\"string\",\"minLength\":1,\"maxLength\":20,\"x-conditional-rules\":[\"required_with:observacoes\"],\"description\":\"Identifica\\u00e7\\u00e3o do campo. Exemplo: PEDIDO, ROTA, REFERENCIA.\",\"x-documented-condition\":\"Identifica\\u00e7\\u00e3o do campo. Exemplo: PEDIDO, ROTA, REFERENCIA.\",\"x-documented-size\":\"1-20\"},\"texto\":{\"type\":\"string\",\"minLength\":1,\"maxLength\":60,\"x-conditional-rules\":[\"required_with:observacoes\"],\"description\":\"Conte\\u00fado da observa\\u00e7\\u00e3o.\",\"x-documented-condition\":\"Conte\\u00fado da observa\\u00e7\\u00e3o.\",\"x-documented-size\":\"1-60\"}}},\"minItems\":1,\"maxItems\":10},{\"type\":\"null\"}],\"description\":\"Lista de observa\\u00e7\\u00f5es estruturadas (campo/texto). Ver estrutura do item.\",\"x-documented-condition\":\"Lista de observa\\u00e7\\u00f5es estruturadas (campo/texto). Ver estrutura do item.\",\"x-documented-size\":\"1-10\"}");
 public EmitterIssueDcePayloadObservacoes(JsonNode node) { super(node); }
 private static final JsonNode VARIANT_0 = SCHEMA.path("anyOf").path(0);
 public static EmitterIssueDcePayloadObservacoes ofVariant0(java.util.List<EmitterIssueDcePayloadObservacoesVariant0Item> value) { return new EmitterIssueDcePayloadObservacoes(array(value, v -> v == null ? null : v.toJson())); }
 public boolean matchesVariant0() { return matchesVariant("api2/dce-issuance.openapi.json", SCHEMA, VARIANT_0); }
 public java.util.List<EmitterIssueDcePayloadObservacoesVariant0Item> asVariant0() { JsonNode value = checkedVariant("api2/dce-issuance.openapi.json", SCHEMA, VARIANT_0); return list(value, v -> (v).isNull() || (v).isMissingNode() ? null : new EmitterIssueDcePayloadObservacoesVariant0Item(v)); }
 private static final JsonNode VARIANT_1 = SCHEMA.path("anyOf").path(1);
 public static EmitterIssueDcePayloadObservacoes ofVariant1(JsonValue value) { return new EmitterIssueDcePayloadObservacoes(value == null ? null : value.toJson()); }
 public boolean matchesVariant1() { return matchesVariant("api2/dce-issuance.openapi.json", SCHEMA, VARIANT_1); }
 public JsonValue asVariant1() { JsonNode value = checkedVariant("api2/dce-issuance.openapi.json", SCHEMA, VARIANT_1); return (value).isNull() || (value).isMissingNode() ? null : new JsonValue(value); }
}
