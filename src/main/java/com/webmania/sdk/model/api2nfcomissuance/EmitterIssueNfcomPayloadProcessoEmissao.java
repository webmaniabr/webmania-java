package com.webmania.sdk.model.api2nfcomissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/nfcom-issuance.openapi.json; see contract-provenance.json. */
public final class EmitterIssueNfcomPayloadProcessoEmissao extends JsonValue {
 private static final JsonNode SCHEMA = Json.parse("{\"anyOf\":[{\"type\":[\"integer\",\"string\"],\"pattern\":\"^-?\\\\d+$\",\"enum\":[\"0\",0,\"3\",3]},{\"type\":\"null\"}],\"description\":\"Processo de emiss\\u00e3o 0 - Aplica\\u00e7\\u00e3o do contribuinte (padr\\u00e3o) 3 - Aplica\\u00e7\\u00e3o do fisco\",\"x-documented-condition\":\"Processo de emiss\\u00e3o 0 - Aplica\\u00e7\\u00e3o do contribuinte (padr\\u00e3o) 3 - Aplica\\u00e7\\u00e3o do fisco\",\"x-documented-size\":\"1\"}");
 public EmitterIssueNfcomPayloadProcessoEmissao(JsonNode node) { super(node); }
 private static final JsonNode VARIANT_0 = SCHEMA.path("anyOf").path(0);
 public static EmitterIssueNfcomPayloadProcessoEmissao ofVariant0(EmitterIssueNfcomPayloadProcessoEmissaoVariant0 value) { return new EmitterIssueNfcomPayloadProcessoEmissao(value == null ? null : value.toJson()); }
 public boolean matchesVariant0() { return matchesVariant("api2/nfcom-issuance.openapi.json", SCHEMA, VARIANT_0); }
 public EmitterIssueNfcomPayloadProcessoEmissaoVariant0 asVariant0() { JsonNode value = checkedVariant("api2/nfcom-issuance.openapi.json", SCHEMA, VARIANT_0); return (value).isNull() || (value).isMissingNode() ? null : new EmitterIssueNfcomPayloadProcessoEmissaoVariant0(value); }
 private static final JsonNode VARIANT_1 = SCHEMA.path("anyOf").path(1);
 public static EmitterIssueNfcomPayloadProcessoEmissao ofVariant1(JsonValue value) { return new EmitterIssueNfcomPayloadProcessoEmissao(value == null ? null : value.toJson()); }
 public boolean matchesVariant1() { return matchesVariant("api2/nfcom-issuance.openapi.json", SCHEMA, VARIANT_1); }
 public JsonValue asVariant1() { JsonNode value = checkedVariant("api2/nfcom-issuance.openapi.json", SCHEMA, VARIANT_1); return (value).isNull() || (value).isMissingNode() ? null : new JsonValue(value); }
}
