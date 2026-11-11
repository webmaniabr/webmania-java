package com.webmania.sdk.model.api2nfcomissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/nfcom-issuance.openapi.json; see contract-provenance.json. */
public final class EmitterIssueNfcomPayloadClienteCnpj extends JsonValue {
 private static final JsonNode SCHEMA = Json.parse("{\"anyOf\":[{\"type\":\"string\",\"minLength\":14,\"maxLength\":14,\"x-conditional-rules\":[\"required_without_all:cliente.cpf,cliente.exterior\",\"Server cpf_cnpj validation and documented normalization apply; retain identifier strings.\"]},{\"type\":\"null\"}],\"description\":\"CNPJ Obrigat\\u00f3rio no caso de Pessoa Jur\\u00eddica\",\"x-documented-condition\":\"CNPJ Obrigat\\u00f3rio no caso de Pessoa Jur\\u00eddica\",\"x-documented-size\":\"14\"}");
 public EmitterIssueNfcomPayloadClienteCnpj(JsonNode node) { super(node); }
 private static final JsonNode VARIANT_0 = SCHEMA.path("anyOf").path(0);
 public static EmitterIssueNfcomPayloadClienteCnpj ofVariant0(String value) { return new EmitterIssueNfcomPayloadClienteCnpj(Json.scalar(value)); }
 public boolean matchesVariant0() { return matchesVariant("api2/nfcom-issuance.openapi.json", SCHEMA, VARIANT_0); }
 public String asVariant0() { JsonNode value = checkedVariant("api2/nfcom-issuance.openapi.json", SCHEMA, VARIANT_0); return stringValue(value); }
 private static final JsonNode VARIANT_1 = SCHEMA.path("anyOf").path(1);
 public static EmitterIssueNfcomPayloadClienteCnpj ofVariant1(JsonValue value) { return new EmitterIssueNfcomPayloadClienteCnpj(value == null ? null : value.toJson()); }
 public boolean matchesVariant1() { return matchesVariant("api2/nfcom-issuance.openapi.json", SCHEMA, VARIANT_1); }
 public JsonValue asVariant1() { JsonNode value = checkedVariant("api2/nfcom-issuance.openapi.json", SCHEMA, VARIANT_1); return (value).isNull() || (value).isMissingNode() ? null : new JsonValue(value); }
}
