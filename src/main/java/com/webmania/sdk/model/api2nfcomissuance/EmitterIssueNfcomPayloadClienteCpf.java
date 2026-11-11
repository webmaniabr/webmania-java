package com.webmania.sdk.model.api2nfcomissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/nfcom-issuance.openapi.json; see contract-provenance.json. */
public final class EmitterIssueNfcomPayloadClienteCpf extends JsonValue {
 private static final JsonNode SCHEMA = Json.parse("{\"anyOf\":[{\"type\":\"string\",\"minLength\":11,\"maxLength\":11,\"x-conditional-rules\":[\"required_without_all:cliente.cnpj,cliente.exterior\",\"Server cpf_cnpj validation and documented normalization apply; retain identifier strings.\"]},{\"type\":\"null\"}],\"description\":\"N\\u00famero de CPF Obrigat\\u00f3rio no caso de Pessoa F\\u00edsica\",\"x-documented-condition\":\"N\\u00famero de CPF Obrigat\\u00f3rio no caso de Pessoa F\\u00edsica\",\"x-documented-size\":\"11\"}");
 public EmitterIssueNfcomPayloadClienteCpf(JsonNode node) { super(node); }
 private static final JsonNode VARIANT_0 = SCHEMA.path("anyOf").path(0);
 public static EmitterIssueNfcomPayloadClienteCpf ofVariant0(String value) { return new EmitterIssueNfcomPayloadClienteCpf(Json.scalar(value)); }
 public boolean matchesVariant0() { return matchesVariant("api2/nfcom-issuance.openapi.json", SCHEMA, VARIANT_0); }
 public String asVariant0() { JsonNode value = checkedVariant("api2/nfcom-issuance.openapi.json", SCHEMA, VARIANT_0); return stringValue(value); }
 private static final JsonNode VARIANT_1 = SCHEMA.path("anyOf").path(1);
 public static EmitterIssueNfcomPayloadClienteCpf ofVariant1(JsonValue value) { return new EmitterIssueNfcomPayloadClienteCpf(value == null ? null : value.toJson()); }
 public boolean matchesVariant1() { return matchesVariant("api2/nfcom-issuance.openapi.json", SCHEMA, VARIANT_1); }
 public JsonValue asVariant1() { JsonNode value = checkedVariant("api2/nfcom-issuance.openapi.json", SCHEMA, VARIANT_1); return (value).isNull() || (value).isMissingNode() ? null : new JsonValue(value); }
}
