package com.webmania.sdk.model.api2nfcomissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/nfcom-issuance.openapi.json; see contract-provenance.json. */
public final class EmitterIssueNfcomPayloadClienteRazaoSocial extends JsonValue {
 private static final JsonNode SCHEMA = Json.parse("{\"anyOf\":[{\"type\":\"string\",\"minLength\":2,\"maxLength\":60,\"x-conditional-rules\":[\"required_without:cliente.nome_completo\"]},{\"type\":\"null\"}],\"description\":\"Raz\\u00e3o Social (Pessoa Jur\\u00eddica) Obrigat\\u00f3rio quando informado CNPJ N\\u00e3o utilize para CPF: nesse caso use nome_completo.\",\"x-documented-condition\":\"Raz\\u00e3o Social (Pessoa Jur\\u00eddica) Obrigat\\u00f3rio quando informado CNPJ N\\u00e3o utilize para CPF: nesse caso use nome_completo.\",\"x-documented-size\":\"2-60\"}");
 public EmitterIssueNfcomPayloadClienteRazaoSocial(JsonNode node) { super(node); }
 private static final JsonNode VARIANT_0 = SCHEMA.path("anyOf").path(0);
 public static EmitterIssueNfcomPayloadClienteRazaoSocial ofVariant0(String value) { return new EmitterIssueNfcomPayloadClienteRazaoSocial(Json.scalar(value)); }
 public boolean matchesVariant0() { return matchesVariant("api2/nfcom-issuance.openapi.json", SCHEMA, VARIANT_0); }
 public String asVariant0() { JsonNode value = checkedVariant("api2/nfcom-issuance.openapi.json", SCHEMA, VARIANT_0); return stringValue(value); }
 private static final JsonNode VARIANT_1 = SCHEMA.path("anyOf").path(1);
 public static EmitterIssueNfcomPayloadClienteRazaoSocial ofVariant1(JsonValue value) { return new EmitterIssueNfcomPayloadClienteRazaoSocial(value == null ? null : value.toJson()); }
 public boolean matchesVariant1() { return matchesVariant("api2/nfcom-issuance.openapi.json", SCHEMA, VARIANT_1); }
 public JsonValue asVariant1() { JsonNode value = checkedVariant("api2/nfcom-issuance.openapi.json", SCHEMA, VARIANT_1); return (value).isNull() || (value).isMissingNode() ? null : new JsonValue(value); }
}
