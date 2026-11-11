package com.webmania.sdk.model.api2nfseissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/nfse-issuance.openapi.json; see contract-provenance.json. */
public final class EmitterIssueNfsePayloadRpsItemServicoPagamentoParceladoAntecipado extends JsonValue {
 private static final JsonNode SCHEMA = Json.parse("{\"type\":[\"number\",\"string\"],\"description\":\"Indicador de pagamento parcelado/antecipado (RTC) 1 - Sim 2 - N\\u00e3o\",\"x-documented-size\":\"1\",\"x-documented-condition\":\"Indicador de pagamento parcelado/antecipado (RTC) 1 - Sim 2 - N\\u00e3o\"}");
 public EmitterIssueNfsePayloadRpsItemServicoPagamentoParceladoAntecipado(JsonNode node) { super(node); }
 private static final JsonNode VARIANT_0 = Json.parse("{\"type\":\"number\",\"description\":\"Indicador de pagamento parcelado/antecipado (RTC) 1 - Sim 2 - N\\u00e3o\",\"x-documented-size\":\"1\",\"x-documented-condition\":\"Indicador de pagamento parcelado/antecipado (RTC) 1 - Sim 2 - N\\u00e3o\"}");
 public static EmitterIssueNfsePayloadRpsItemServicoPagamentoParceladoAntecipado ofVariant0(java.math.BigDecimal value) { return new EmitterIssueNfsePayloadRpsItemServicoPagamentoParceladoAntecipado(Json.scalar(value)); }
 public boolean matchesVariant0() { return matchesVariant("api2/nfse-issuance.openapi.json", SCHEMA, VARIANT_0); }
 public java.math.BigDecimal asVariant0() { JsonNode value = checkedVariant("api2/nfse-issuance.openapi.json", SCHEMA, VARIANT_0); return decimalValue(value); }
 private static final JsonNode VARIANT_1 = Json.parse("{\"type\":\"string\",\"description\":\"Indicador de pagamento parcelado/antecipado (RTC) 1 - Sim 2 - N\\u00e3o\",\"x-documented-size\":\"1\",\"x-documented-condition\":\"Indicador de pagamento parcelado/antecipado (RTC) 1 - Sim 2 - N\\u00e3o\"}");
 public static EmitterIssueNfsePayloadRpsItemServicoPagamentoParceladoAntecipado ofVariant1(String value) { return new EmitterIssueNfsePayloadRpsItemServicoPagamentoParceladoAntecipado(Json.scalar(value)); }
 public boolean matchesVariant1() { return matchesVariant("api2/nfse-issuance.openapi.json", SCHEMA, VARIANT_1); }
 public String asVariant1() { JsonNode value = checkedVariant("api2/nfse-issuance.openapi.json", SCHEMA, VARIANT_1); return stringValue(value); }
}
