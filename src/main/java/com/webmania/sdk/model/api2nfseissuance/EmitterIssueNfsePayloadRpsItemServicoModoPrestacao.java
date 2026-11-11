package com.webmania.sdk.model.api2nfseissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/nfse-issuance.openapi.json; see contract-provenance.json. */
public final class EmitterIssueNfsePayloadRpsItemServicoModoPrestacao extends JsonValue {
 private static final JsonNode SCHEMA = Json.parse("{\"type\":[\"number\",\"string\"],\"description\":\"Modo de presta\\u00e7\\u00e3o. 0 - Desconhecido (tipo n\\u00e3o informado na nota de origem) 1 - Transfronteiri\\u00e7o 2 - Consumo no Brasil 3 - Movimento Tempor\\u00e1rio de Pessoas F\\u00edsicas 4 - Consumo no Exterior\",\"x-documented-size\":\"1\",\"x-documented-condition\":\"Modo de presta\\u00e7\\u00e3o. 0 - Desconhecido (tipo n\\u00e3o informado na nota de origem) 1 - Transfronteiri\\u00e7o 2 - Consumo no Brasil 3 - Movimento Tempor\\u00e1rio de Pessoas F\\u00edsicas 4 - Consumo no Exterior\"}");
 public EmitterIssueNfsePayloadRpsItemServicoModoPrestacao(JsonNode node) { super(node); }
 private static final JsonNode VARIANT_0 = Json.parse("{\"type\":\"number\",\"description\":\"Modo de presta\\u00e7\\u00e3o. 0 - Desconhecido (tipo n\\u00e3o informado na nota de origem) 1 - Transfronteiri\\u00e7o 2 - Consumo no Brasil 3 - Movimento Tempor\\u00e1rio de Pessoas F\\u00edsicas 4 - Consumo no Exterior\",\"x-documented-size\":\"1\",\"x-documented-condition\":\"Modo de presta\\u00e7\\u00e3o. 0 - Desconhecido (tipo n\\u00e3o informado na nota de origem) 1 - Transfronteiri\\u00e7o 2 - Consumo no Brasil 3 - Movimento Tempor\\u00e1rio de Pessoas F\\u00edsicas 4 - Consumo no Exterior\"}");
 public static EmitterIssueNfsePayloadRpsItemServicoModoPrestacao ofVariant0(java.math.BigDecimal value) { return new EmitterIssueNfsePayloadRpsItemServicoModoPrestacao(Json.scalar(value)); }
 public boolean matchesVariant0() { return matchesVariant("api2/nfse-issuance.openapi.json", SCHEMA, VARIANT_0); }
 public java.math.BigDecimal asVariant0() { JsonNode value = checkedVariant("api2/nfse-issuance.openapi.json", SCHEMA, VARIANT_0); return decimalValue(value); }
 private static final JsonNode VARIANT_1 = Json.parse("{\"type\":\"string\",\"description\":\"Modo de presta\\u00e7\\u00e3o. 0 - Desconhecido (tipo n\\u00e3o informado na nota de origem) 1 - Transfronteiri\\u00e7o 2 - Consumo no Brasil 3 - Movimento Tempor\\u00e1rio de Pessoas F\\u00edsicas 4 - Consumo no Exterior\",\"x-documented-size\":\"1\",\"x-documented-condition\":\"Modo de presta\\u00e7\\u00e3o. 0 - Desconhecido (tipo n\\u00e3o informado na nota de origem) 1 - Transfronteiri\\u00e7o 2 - Consumo no Brasil 3 - Movimento Tempor\\u00e1rio de Pessoas F\\u00edsicas 4 - Consumo no Exterior\"}");
 public static EmitterIssueNfsePayloadRpsItemServicoModoPrestacao ofVariant1(String value) { return new EmitterIssueNfsePayloadRpsItemServicoModoPrestacao(Json.scalar(value)); }
 public boolean matchesVariant1() { return matchesVariant("api2/nfse-issuance.openapi.json", SCHEMA, VARIANT_1); }
 public String asVariant1() { JsonNode value = checkedVariant("api2/nfse-issuance.openapi.json", SCHEMA, VARIANT_1); return stringValue(value); }
}
