package com.webmania.sdk.model.api2nfseissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/nfse-issuance.openapi.json; see contract-provenance.json. */
public final class EmitterIssueNfsePayloadRpsItemServicoDeducaoReducaoDocumentosItemValorDeducao extends JsonValue {
 private static final JsonNode SCHEMA = Json.parse("{\"type\":[\"string\",\"number\"],\"pattern\":\"^\\\\d+(\\\\.\\\\d{1,2})?$\",\"x-conditional-rules\":[\"A server-side conditional or current catalog constraint also applies; this draft does not replace it.\"],\"description\":\"Valor utilizado na dedu\\u00e7\\u00e3o/redu\\u00e7\\u00e3o do servi\\u00e7o Deve ser \\u2264 valor_dedutivel\",\"x-documented-condition\":\"Valor utilizado na dedu\\u00e7\\u00e3o/redu\\u00e7\\u00e3o do servi\\u00e7o Deve ser \\u2264 valor_dedutivel\",\"x-documented-size\":\"15v2\"}");
 public EmitterIssueNfsePayloadRpsItemServicoDeducaoReducaoDocumentosItemValorDeducao(JsonNode node) { super(node); }
 private static final JsonNode VARIANT_0 = Json.parse("{\"type\":\"string\",\"pattern\":\"^\\\\d+(\\\\.\\\\d{1,2})?$\",\"x-conditional-rules\":[\"A server-side conditional or current catalog constraint also applies; this draft does not replace it.\"],\"description\":\"Valor utilizado na dedu\\u00e7\\u00e3o/redu\\u00e7\\u00e3o do servi\\u00e7o Deve ser \\u2264 valor_dedutivel\",\"x-documented-condition\":\"Valor utilizado na dedu\\u00e7\\u00e3o/redu\\u00e7\\u00e3o do servi\\u00e7o Deve ser \\u2264 valor_dedutivel\",\"x-documented-size\":\"15v2\"}");
 public static EmitterIssueNfsePayloadRpsItemServicoDeducaoReducaoDocumentosItemValorDeducao ofVariant0(String value) { return new EmitterIssueNfsePayloadRpsItemServicoDeducaoReducaoDocumentosItemValorDeducao(Json.scalar(value)); }
 public boolean matchesVariant0() { return matchesVariant("api2/nfse-issuance.openapi.json", SCHEMA, VARIANT_0); }
 public String asVariant0() { JsonNode value = checkedVariant("api2/nfse-issuance.openapi.json", SCHEMA, VARIANT_0); return stringValue(value); }
 private static final JsonNode VARIANT_1 = Json.parse("{\"type\":\"number\",\"pattern\":\"^\\\\d+(\\\\.\\\\d{1,2})?$\",\"x-conditional-rules\":[\"A server-side conditional or current catalog constraint also applies; this draft does not replace it.\"],\"description\":\"Valor utilizado na dedu\\u00e7\\u00e3o/redu\\u00e7\\u00e3o do servi\\u00e7o Deve ser \\u2264 valor_dedutivel\",\"x-documented-condition\":\"Valor utilizado na dedu\\u00e7\\u00e3o/redu\\u00e7\\u00e3o do servi\\u00e7o Deve ser \\u2264 valor_dedutivel\",\"x-documented-size\":\"15v2\"}");
 public static EmitterIssueNfsePayloadRpsItemServicoDeducaoReducaoDocumentosItemValorDeducao ofVariant1(java.math.BigDecimal value) { return new EmitterIssueNfsePayloadRpsItemServicoDeducaoReducaoDocumentosItemValorDeducao(Json.scalar(value)); }
 public boolean matchesVariant1() { return matchesVariant("api2/nfse-issuance.openapi.json", SCHEMA, VARIANT_1); }
 public java.math.BigDecimal asVariant1() { JsonNode value = checkedVariant("api2/nfse-issuance.openapi.json", SCHEMA, VARIANT_1); return decimalValue(value); }
}
