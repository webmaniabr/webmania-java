package com.webmania.sdk.model.api2nfcomissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/nfcom-issuance.openapi.json; see contract-provenance.json. */
public final class EmitterIssueNfcomPayloadTipoFaturamento extends JsonValue {
 private static final JsonNode SCHEMA = Json.parse("{\"anyOf\":[{\"type\":[\"integer\",\"string\"],\"pattern\":\"^-?\\\\d+$\",\"enum\":[\"0\",0,\"1\",1,\"2\",2]},{\"type\":\"null\"}],\"description\":\"Tipo de faturamento 0 - Faturamento Normal (padr\\u00e3o) 1 - Faturamento centralizado 2 - Cofaturamento Importante: Para tipo_faturamento 0 ou 1, o contrato do assinante \\u00e9 obrigat\\u00f3rio\",\"x-documented-condition\":\"Tipo de faturamento 0 - Faturamento Normal (padr\\u00e3o) 1 - Faturamento centralizado 2 - Cofaturamento Importante: Para tipo_faturamento 0 ou 1, o contrato do assinante \\u00e9 obrigat\\u00f3rio\",\"x-documented-size\":\"1\"}");
 public EmitterIssueNfcomPayloadTipoFaturamento(JsonNode node) { super(node); }
 private static final JsonNode VARIANT_0 = SCHEMA.path("anyOf").path(0);
 public static EmitterIssueNfcomPayloadTipoFaturamento ofVariant0(EmitterIssueNfcomPayloadTipoFaturamentoVariant0 value) { return new EmitterIssueNfcomPayloadTipoFaturamento(value == null ? null : value.toJson()); }
 public boolean matchesVariant0() { return matchesVariant("api2/nfcom-issuance.openapi.json", SCHEMA, VARIANT_0); }
 public EmitterIssueNfcomPayloadTipoFaturamentoVariant0 asVariant0() { JsonNode value = checkedVariant("api2/nfcom-issuance.openapi.json", SCHEMA, VARIANT_0); return (value).isNull() || (value).isMissingNode() ? null : new EmitterIssueNfcomPayloadTipoFaturamentoVariant0(value); }
 private static final JsonNode VARIANT_1 = SCHEMA.path("anyOf").path(1);
 public static EmitterIssueNfcomPayloadTipoFaturamento ofVariant1(JsonValue value) { return new EmitterIssueNfcomPayloadTipoFaturamento(value == null ? null : value.toJson()); }
 public boolean matchesVariant1() { return matchesVariant("api2/nfcom-issuance.openapi.json", SCHEMA, VARIANT_1); }
 public JsonValue asVariant1() { JsonNode value = checkedVariant("api2/nfcom-issuance.openapi.json", SCHEMA, VARIANT_1); return (value).isNull() || (value).isMissingNode() ? null : new JsonValue(value); }
}
