package com.webmania.sdk.model.api2nfcomissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/nfcom-issuance.openapi.json; see contract-provenance.json. */
public final class EmitterIssueNfcomPayloadAssinanteVariant0TipoServico extends JsonValue {
 private static final JsonNode SCHEMA = Json.parse("{\"anyOf\":[{\"type\":[\"integer\",\"string\"],\"pattern\":\"^-?\\\\d+$\",\"minimum\":1,\"x-sdk-numeric-minimum\":\"1\",\"maximum\":6,\"x-sdk-numeric-maximum\":\"6\"},{\"type\":\"null\"}],\"description\":\"Tipo de utiliza\\u00e7\\u00e3o do servi\\u00e7o 1 - Telefonia 2 - Comunica\\u00e7\\u00e3o de dados 3 - TV por assinatura 4 - Provimento de internet (padr\\u00e3o) 5 - Multim\\u00eddia 6 - Outros\",\"x-documented-condition\":\"Tipo de utiliza\\u00e7\\u00e3o do servi\\u00e7o 1 - Telefonia 2 - Comunica\\u00e7\\u00e3o de dados 3 - TV por assinatura 4 - Provimento de internet (padr\\u00e3o) 5 - Multim\\u00eddia 6 - Outros\",\"x-documented-size\":\"1\"}");
 public EmitterIssueNfcomPayloadAssinanteVariant0TipoServico(JsonNode node) { super(node); }
 private static final JsonNode VARIANT_0 = SCHEMA.path("anyOf").path(0);
 public static EmitterIssueNfcomPayloadAssinanteVariant0TipoServico ofVariant0(EmitterIssueNfcomPayloadAssinanteVariant0TipoServicoVariant0 value) { return new EmitterIssueNfcomPayloadAssinanteVariant0TipoServico(value == null ? null : value.toJson()); }
 public boolean matchesVariant0() { return matchesVariant("api2/nfcom-issuance.openapi.json", SCHEMA, VARIANT_0); }
 public EmitterIssueNfcomPayloadAssinanteVariant0TipoServicoVariant0 asVariant0() { JsonNode value = checkedVariant("api2/nfcom-issuance.openapi.json", SCHEMA, VARIANT_0); return (value).isNull() || (value).isMissingNode() ? null : new EmitterIssueNfcomPayloadAssinanteVariant0TipoServicoVariant0(value); }
 private static final JsonNode VARIANT_1 = SCHEMA.path("anyOf").path(1);
 public static EmitterIssueNfcomPayloadAssinanteVariant0TipoServico ofVariant1(JsonValue value) { return new EmitterIssueNfcomPayloadAssinanteVariant0TipoServico(value == null ? null : value.toJson()); }
 public boolean matchesVariant1() { return matchesVariant("api2/nfcom-issuance.openapi.json", SCHEMA, VARIANT_1); }
 public JsonValue asVariant1() { JsonNode value = checkedVariant("api2/nfcom-issuance.openapi.json", SCHEMA, VARIANT_1); return (value).isNull() || (value).isMissingNode() ? null : new JsonValue(value); }
}
