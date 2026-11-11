package com.webmania.sdk.model.api2nfseissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/nfse-issuance.openapi.json; see contract-provenance.json. */
public final class EmitterReplaceNfsePayloadRpsItemServicoImpostosInss extends JsonValue {
 private static final JsonNode SCHEMA = Json.parse("{\"type\":[\"string\",\"number\"],\"pattern\":\"^\\\\d+(\\\\.\\\\d{1,2})?$\",\"x-conditional-rules\":[\"lt:100\",\"A server-side conditional or current catalog constraint also applies; this draft does not replace it.\"]}");
 public EmitterReplaceNfsePayloadRpsItemServicoImpostosInss(JsonNode node) { super(node); }
 private static final JsonNode VARIANT_0 = Json.parse("{\"type\":\"string\",\"pattern\":\"^\\\\d+(\\\\.\\\\d{1,2})?$\",\"x-conditional-rules\":[\"lt:100\",\"A server-side conditional or current catalog constraint also applies; this draft does not replace it.\"]}");
 public static EmitterReplaceNfsePayloadRpsItemServicoImpostosInss ofVariant0(String value) { return new EmitterReplaceNfsePayloadRpsItemServicoImpostosInss(Json.scalar(value)); }
 public boolean matchesVariant0() { return matchesVariant("api2/nfse-issuance.openapi.json", SCHEMA, VARIANT_0); }
 public String asVariant0() { JsonNode value = checkedVariant("api2/nfse-issuance.openapi.json", SCHEMA, VARIANT_0); return stringValue(value); }
 private static final JsonNode VARIANT_1 = Json.parse("{\"type\":\"number\",\"pattern\":\"^\\\\d+(\\\\.\\\\d{1,2})?$\",\"x-conditional-rules\":[\"lt:100\",\"A server-side conditional or current catalog constraint also applies; this draft does not replace it.\"]}");
 public static EmitterReplaceNfsePayloadRpsItemServicoImpostosInss ofVariant1(java.math.BigDecimal value) { return new EmitterReplaceNfsePayloadRpsItemServicoImpostosInss(Json.scalar(value)); }
 public boolean matchesVariant1() { return matchesVariant("api2/nfse-issuance.openapi.json", SCHEMA, VARIANT_1); }
 public java.math.BigDecimal asVariant1() { JsonNode value = checkedVariant("api2/nfse-issuance.openapi.json", SCHEMA, VARIANT_1); return decimalValue(value); }
}
