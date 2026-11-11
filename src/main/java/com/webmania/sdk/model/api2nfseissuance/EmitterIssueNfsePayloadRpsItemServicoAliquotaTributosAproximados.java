package com.webmania.sdk.model.api2nfseissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/nfse-issuance.openapi.json; see contract-provenance.json. */
public final class EmitterIssueNfsePayloadRpsItemServicoAliquotaTributosAproximados extends JsonValue {
 private static final JsonNode SCHEMA = Json.parse("{\"type\":[\"number\",\"string\"],\"description\":\"Al\\u00edquota dos tributos aproximados para Simples Nacional.\",\"x-documented-size\":\"0-100\",\"x-documented-condition\":\"Al\\u00edquota dos tributos aproximados para Simples Nacional.\"}");
 public EmitterIssueNfsePayloadRpsItemServicoAliquotaTributosAproximados(JsonNode node) { super(node); }
 private static final JsonNode VARIANT_0 = Json.parse("{\"type\":\"number\",\"description\":\"Al\\u00edquota dos tributos aproximados para Simples Nacional.\",\"x-documented-size\":\"0-100\",\"x-documented-condition\":\"Al\\u00edquota dos tributos aproximados para Simples Nacional.\"}");
 public static EmitterIssueNfsePayloadRpsItemServicoAliquotaTributosAproximados ofVariant0(java.math.BigDecimal value) { return new EmitterIssueNfsePayloadRpsItemServicoAliquotaTributosAproximados(Json.scalar(value)); }
 public boolean matchesVariant0() { return matchesVariant("api2/nfse-issuance.openapi.json", SCHEMA, VARIANT_0); }
 public java.math.BigDecimal asVariant0() { JsonNode value = checkedVariant("api2/nfse-issuance.openapi.json", SCHEMA, VARIANT_0); return decimalValue(value); }
 private static final JsonNode VARIANT_1 = Json.parse("{\"type\":\"string\",\"description\":\"Al\\u00edquota dos tributos aproximados para Simples Nacional.\",\"x-documented-size\":\"0-100\",\"x-documented-condition\":\"Al\\u00edquota dos tributos aproximados para Simples Nacional.\"}");
 public static EmitterIssueNfsePayloadRpsItemServicoAliquotaTributosAproximados ofVariant1(String value) { return new EmitterIssueNfsePayloadRpsItemServicoAliquotaTributosAproximados(Json.scalar(value)); }
 public boolean matchesVariant1() { return matchesVariant("api2/nfse-issuance.openapi.json", SCHEMA, VARIANT_1); }
 public String asVariant1() { JsonNode value = checkedVariant("api2/nfse-issuance.openapi.json", SCHEMA, VARIANT_1); return stringValue(value); }
}
