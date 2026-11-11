package com.webmania.sdk.model.api2nfseissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/nfse-issuance.openapi.json; see contract-provenance.json. */
public final class EmitterIssueNfsePayloadRpsItemServicoTributacaoIss extends JsonValue {
 private static final JsonNode SCHEMA = Json.parse("{\"type\":[\"number\",\"string\"],\"description\":\"Tributa\\u00e7\\u00e3o do ISSQN sobre o servi\\u00e7o prestado 1 - Opera\\u00e7\\u00e3o tribut\\u00e1vel 2 - Imunidade 4 - N\\u00e3o Incid\\u00eancia\",\"x-documented-size\":\"1\",\"x-documented-condition\":\"Tributa\\u00e7\\u00e3o do ISSQN sobre o servi\\u00e7o prestado 1 - Opera\\u00e7\\u00e3o tribut\\u00e1vel 2 - Imunidade 4 - N\\u00e3o Incid\\u00eancia\"}");
 public EmitterIssueNfsePayloadRpsItemServicoTributacaoIss(JsonNode node) { super(node); }
 private static final JsonNode VARIANT_0 = Json.parse("{\"type\":\"number\",\"description\":\"Tributa\\u00e7\\u00e3o do ISSQN sobre o servi\\u00e7o prestado 1 - Opera\\u00e7\\u00e3o tribut\\u00e1vel 2 - Imunidade 4 - N\\u00e3o Incid\\u00eancia\",\"x-documented-size\":\"1\",\"x-documented-condition\":\"Tributa\\u00e7\\u00e3o do ISSQN sobre o servi\\u00e7o prestado 1 - Opera\\u00e7\\u00e3o tribut\\u00e1vel 2 - Imunidade 4 - N\\u00e3o Incid\\u00eancia\"}");
 public static EmitterIssueNfsePayloadRpsItemServicoTributacaoIss ofVariant0(java.math.BigDecimal value) { return new EmitterIssueNfsePayloadRpsItemServicoTributacaoIss(Json.scalar(value)); }
 public boolean matchesVariant0() { return matchesVariant("api2/nfse-issuance.openapi.json", SCHEMA, VARIANT_0); }
 public java.math.BigDecimal asVariant0() { JsonNode value = checkedVariant("api2/nfse-issuance.openapi.json", SCHEMA, VARIANT_0); return decimalValue(value); }
 private static final JsonNode VARIANT_1 = Json.parse("{\"type\":\"string\",\"description\":\"Tributa\\u00e7\\u00e3o do ISSQN sobre o servi\\u00e7o prestado 1 - Opera\\u00e7\\u00e3o tribut\\u00e1vel 2 - Imunidade 4 - N\\u00e3o Incid\\u00eancia\",\"x-documented-size\":\"1\",\"x-documented-condition\":\"Tributa\\u00e7\\u00e3o do ISSQN sobre o servi\\u00e7o prestado 1 - Opera\\u00e7\\u00e3o tribut\\u00e1vel 2 - Imunidade 4 - N\\u00e3o Incid\\u00eancia\"}");
 public static EmitterIssueNfsePayloadRpsItemServicoTributacaoIss ofVariant1(String value) { return new EmitterIssueNfsePayloadRpsItemServicoTributacaoIss(Json.scalar(value)); }
 public boolean matchesVariant1() { return matchesVariant("api2/nfse-issuance.openapi.json", SCHEMA, VARIANT_1); }
 public String asVariant1() { JsonNode value = checkedVariant("api2/nfse-issuance.openapi.json", SCHEMA, VARIANT_1); return stringValue(value); }
}
