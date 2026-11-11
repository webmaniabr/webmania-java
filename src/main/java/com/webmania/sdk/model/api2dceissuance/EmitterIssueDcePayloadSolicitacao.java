package com.webmania.sdk.model.api2dceissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/dce-issuance.openapi.json; see contract-provenance.json. */
public final class EmitterIssueDcePayloadSolicitacao extends JsonValue {
 private static final JsonNode SCHEMA = Json.parse("{\"anyOf\":[{\"type\":\"string\",\"maxLength\":2000},{\"type\":\"null\"}],\"description\":\"Dados do pedido de emiss\\u00e3o preenchidos no aplicativo do Fisco, em formato JSON. Obrigat\\u00f3rio apenas quando o tipo de emissor da empresa estiver configurado como \\u2018Fisco\\u2019.\",\"x-documented-condition\":\"Dados do pedido de emiss\\u00e3o preenchidos no aplicativo do Fisco, em formato JSON. Obrigat\\u00f3rio apenas quando o tipo de emissor da empresa estiver configurado como \\u2018Fisco\\u2019.\",\"x-documented-size\":\"at\\u00e9 2000\"}");
 public EmitterIssueDcePayloadSolicitacao(JsonNode node) { super(node); }
 private static final JsonNode VARIANT_0 = SCHEMA.path("anyOf").path(0);
 public static EmitterIssueDcePayloadSolicitacao ofVariant0(String value) { return new EmitterIssueDcePayloadSolicitacao(Json.scalar(value)); }
 public boolean matchesVariant0() { return matchesVariant("api2/dce-issuance.openapi.json", SCHEMA, VARIANT_0); }
 public String asVariant0() { JsonNode value = checkedVariant("api2/dce-issuance.openapi.json", SCHEMA, VARIANT_0); return stringValue(value); }
 private static final JsonNode VARIANT_1 = SCHEMA.path("anyOf").path(1);
 public static EmitterIssueDcePayloadSolicitacao ofVariant1(JsonValue value) { return new EmitterIssueDcePayloadSolicitacao(value == null ? null : value.toJson()); }
 public boolean matchesVariant1() { return matchesVariant("api2/dce-issuance.openapi.json", SCHEMA, VARIANT_1); }
 public JsonValue asVariant1() { JsonNode value = checkedVariant("api2/dce-issuance.openapi.json", SCHEMA, VARIANT_1); return (value).isNull() || (value).isMissingNode() ? null : new JsonValue(value); }
}
