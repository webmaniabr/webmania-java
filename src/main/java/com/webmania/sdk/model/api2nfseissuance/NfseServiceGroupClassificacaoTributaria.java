package com.webmania.sdk.model.api2nfseissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/nfse-issuance.openapi.json; see contract-provenance.json. */
public final class NfseServiceGroupClassificacaoTributaria extends JsonValue {
 private static final JsonNode SCHEMA = Json.parse("{\"type\":[\"string\",\"number\"],\"pattern\":\"^[A-Za-z0-9]{1,6}$\",\"x-conditional-rules\":[\"A server-side conditional or current catalog constraint also applies; this draft does not replace it.\"]}");
 public NfseServiceGroupClassificacaoTributaria(JsonNode node) { super(node); }
 private static final JsonNode VARIANT_0 = Json.parse("{\"type\":\"string\",\"pattern\":\"^[A-Za-z0-9]{1,6}$\",\"x-conditional-rules\":[\"A server-side conditional or current catalog constraint also applies; this draft does not replace it.\"]}");
 public static NfseServiceGroupClassificacaoTributaria ofVariant0(String value) { return new NfseServiceGroupClassificacaoTributaria(Json.scalar(value)); }
 public boolean matchesVariant0() { return matchesVariant("api2/nfse-issuance.openapi.json", SCHEMA, VARIANT_0); }
 public String asVariant0() { JsonNode value = checkedVariant("api2/nfse-issuance.openapi.json", SCHEMA, VARIANT_0); return stringValue(value); }
 private static final JsonNode VARIANT_1 = Json.parse("{\"type\":\"number\",\"pattern\":\"^[A-Za-z0-9]{1,6}$\",\"x-conditional-rules\":[\"A server-side conditional or current catalog constraint also applies; this draft does not replace it.\"]}");
 public static NfseServiceGroupClassificacaoTributaria ofVariant1(java.math.BigDecimal value) { return new NfseServiceGroupClassificacaoTributaria(Json.scalar(value)); }
 public boolean matchesVariant1() { return matchesVariant("api2/nfse-issuance.openapi.json", SCHEMA, VARIANT_1); }
 public java.math.BigDecimal asVariant1() { JsonNode value = checkedVariant("api2/nfse-issuance.openapi.json", SCHEMA, VARIANT_1); return decimalValue(value); }
}
