package com.webmania.sdk.model.api2nfcomissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/nfcom-issuance.openapi.json; see contract-provenance.json. */
public final class EmitterIssueNfcomPayloadFaturamentoCentralizado extends JsonValue {
 private static final JsonNode SCHEMA = Json.parse("{\"anyOf\":[{\"type\":\"object\",\"properties\":{\"cnpj\":{\"type\":\"string\",\"minLength\":14,\"maxLength\":14,\"x-conditional-rules\":[\"required_with:faturamento_centralizado\",\"Server cpf_cnpj validation and documented normalization apply; retain identifier strings.\"]},\"codigo_uf\":{\"type\":\"string\",\"minLength\":2,\"maxLength\":2,\"enum\":[\"11\",\"12\",\"13\",\"14\",\"15\",\"16\",\"17\",\"21\",\"22\",\"23\",\"24\",\"25\",\"26\",\"27\",\"28\",\"29\",\"31\",\"32\",\"33\",\"35\",\"41\",\"42\",\"43\",\"50\",\"51\",\"52\",\"53\"],\"x-conditional-rules\":[\"required_with:faturamento_centralizado\"]}},\"additionalProperties\":true},{\"type\":\"null\"}]}");
 public EmitterIssueNfcomPayloadFaturamentoCentralizado(JsonNode node) { super(node); }
 private static final JsonNode VARIANT_0 = SCHEMA.path("anyOf").path(0);
 public static EmitterIssueNfcomPayloadFaturamentoCentralizado ofVariant0(EmitterIssueNfcomPayloadFaturamentoCentralizadoVariant0 value) { return new EmitterIssueNfcomPayloadFaturamentoCentralizado(value == null ? null : value.toJson()); }
 public boolean matchesVariant0() { return matchesVariant("api2/nfcom-issuance.openapi.json", SCHEMA, VARIANT_0); }
 public EmitterIssueNfcomPayloadFaturamentoCentralizadoVariant0 asVariant0() { JsonNode value = checkedVariant("api2/nfcom-issuance.openapi.json", SCHEMA, VARIANT_0); return (value).isNull() || (value).isMissingNode() ? null : new EmitterIssueNfcomPayloadFaturamentoCentralizadoVariant0(value); }
 private static final JsonNode VARIANT_1 = SCHEMA.path("anyOf").path(1);
 public static EmitterIssueNfcomPayloadFaturamentoCentralizado ofVariant1(JsonValue value) { return new EmitterIssueNfcomPayloadFaturamentoCentralizado(value == null ? null : value.toJson()); }
 public boolean matchesVariant1() { return matchesVariant("api2/nfcom-issuance.openapi.json", SCHEMA, VARIANT_1); }
 public JsonValue asVariant1() { JsonNode value = checkedVariant("api2/nfcom-issuance.openapi.json", SCHEMA, VARIANT_1); return (value).isNull() || (value).isMissingNode() ? null : new JsonValue(value); }
}
