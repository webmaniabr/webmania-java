package com.webmania.sdk.model.api2nfseissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/nfse-issuance.openapi.json; see contract-provenance.json. */
public final class EmitterIssueNfsePayloadRpsItemServicoValorServicoMoeda extends JsonValue {
 private static final JsonNode SCHEMA = Json.parse("{\"type\":[\"number\",\"string\"],\"description\":\"Valor do servi\\u00e7o prestado expresso em moeda estrangeira especificada em tipo_moeda. 0.00\",\"x-documented-size\":\"15v2\",\"x-documented-condition\":\"Valor do servi\\u00e7o prestado expresso em moeda estrangeira especificada em tipo_moeda. 0.00\"}");
 public EmitterIssueNfsePayloadRpsItemServicoValorServicoMoeda(JsonNode node) { super(node); }
 private static final JsonNode VARIANT_0 = Json.parse("{\"type\":\"number\",\"description\":\"Valor do servi\\u00e7o prestado expresso em moeda estrangeira especificada em tipo_moeda. 0.00\",\"x-documented-size\":\"15v2\",\"x-documented-condition\":\"Valor do servi\\u00e7o prestado expresso em moeda estrangeira especificada em tipo_moeda. 0.00\"}");
 public static EmitterIssueNfsePayloadRpsItemServicoValorServicoMoeda ofVariant0(java.math.BigDecimal value) { return new EmitterIssueNfsePayloadRpsItemServicoValorServicoMoeda(Json.scalar(value)); }
 public boolean matchesVariant0() { return matchesVariant("api2/nfse-issuance.openapi.json", SCHEMA, VARIANT_0); }
 public java.math.BigDecimal asVariant0() { JsonNode value = checkedVariant("api2/nfse-issuance.openapi.json", SCHEMA, VARIANT_0); return decimalValue(value); }
 private static final JsonNode VARIANT_1 = Json.parse("{\"type\":\"string\",\"description\":\"Valor do servi\\u00e7o prestado expresso em moeda estrangeira especificada em tipo_moeda. 0.00\",\"x-documented-size\":\"15v2\",\"x-documented-condition\":\"Valor do servi\\u00e7o prestado expresso em moeda estrangeira especificada em tipo_moeda. 0.00\"}");
 public static EmitterIssueNfsePayloadRpsItemServicoValorServicoMoeda ofVariant1(String value) { return new EmitterIssueNfsePayloadRpsItemServicoValorServicoMoeda(Json.scalar(value)); }
 public boolean matchesVariant1() { return matchesVariant("api2/nfse-issuance.openapi.json", SCHEMA, VARIANT_1); }
 public String asVariant1() { JsonNode value = checkedVariant("api2/nfse-issuance.openapi.json", SCHEMA, VARIANT_1); return stringValue(value); }
}
