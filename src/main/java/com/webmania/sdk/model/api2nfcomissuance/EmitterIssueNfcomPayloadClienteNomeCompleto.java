package com.webmania.sdk.model.api2nfcomissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/nfcom-issuance.openapi.json; see contract-provenance.json. */
public final class EmitterIssueNfcomPayloadClienteNomeCompleto extends JsonValue {
 private static final JsonNode SCHEMA = Json.parse("{\"anyOf\":[{\"type\":\"string\",\"minLength\":2,\"maxLength\":60,\"x-conditional-rules\":[\"required_without:cliente.razao_social\"]},{\"type\":\"null\"}],\"description\":\"Nome completo (Pessoa F\\u00edsica) Obrigat\\u00f3rio quando informado CPF N\\u00e3o utilize para CNPJ: nesse caso use razao_social.\",\"x-documented-condition\":\"Nome completo (Pessoa F\\u00edsica) Obrigat\\u00f3rio quando informado CPF N\\u00e3o utilize para CNPJ: nesse caso use razao_social.\",\"x-documented-size\":\"2-60\"}");
 public EmitterIssueNfcomPayloadClienteNomeCompleto(JsonNode node) { super(node); }
 private static final JsonNode VARIANT_0 = SCHEMA.path("anyOf").path(0);
 public static EmitterIssueNfcomPayloadClienteNomeCompleto ofVariant0(String value) { return new EmitterIssueNfcomPayloadClienteNomeCompleto(Json.scalar(value)); }
 public boolean matchesVariant0() { return matchesVariant("api2/nfcom-issuance.openapi.json", SCHEMA, VARIANT_0); }
 public String asVariant0() { JsonNode value = checkedVariant("api2/nfcom-issuance.openapi.json", SCHEMA, VARIANT_0); return stringValue(value); }
 private static final JsonNode VARIANT_1 = SCHEMA.path("anyOf").path(1);
 public static EmitterIssueNfcomPayloadClienteNomeCompleto ofVariant1(JsonValue value) { return new EmitterIssueNfcomPayloadClienteNomeCompleto(value == null ? null : value.toJson()); }
 public boolean matchesVariant1() { return matchesVariant("api2/nfcom-issuance.openapi.json", SCHEMA, VARIANT_1); }
 public JsonValue asVariant1() { JsonNode value = checkedVariant("api2/nfcom-issuance.openapi.json", SCHEMA, VARIANT_1); return (value).isNull() || (value).isMissingNode() ? null : new JsonValue(value); }
}
