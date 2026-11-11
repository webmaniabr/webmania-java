package com.webmania.sdk.model.api2nfseissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/nfse-issuance.openapi.json; see contract-provenance.json. */
public final class NfseServiceGroupReembolsoRepasseDocumentosItemValor extends JsonValue {
 private static final JsonNode SCHEMA = Json.parse("{\"type\":[\"number\",\"string\"],\"pattern\":\"^-?(?:\\\\d+\\\\.?\\\\d*|\\\\.\\\\d+)(?:[eE][+-]?\\\\d+)?$\",\"minimum\":0,\"x-sdk-numeric-minimum\":\"0\",\"description\":\"Valor total reembolsado ou repassado.\",\"x-documented-condition\":\"Valor total reembolsado ou repassado.\",\"x-documented-size\":\"15v2\"}");
 public NfseServiceGroupReembolsoRepasseDocumentosItemValor(JsonNode node) { super(node); }
 private static final JsonNode VARIANT_0 = Json.parse("{\"type\":\"number\",\"pattern\":\"^-?(?:\\\\d+\\\\.?\\\\d*|\\\\.\\\\d+)(?:[eE][+-]?\\\\d+)?$\",\"minimum\":0,\"x-sdk-numeric-minimum\":\"0\",\"description\":\"Valor total reembolsado ou repassado.\",\"x-documented-condition\":\"Valor total reembolsado ou repassado.\",\"x-documented-size\":\"15v2\"}");
 public static NfseServiceGroupReembolsoRepasseDocumentosItemValor ofVariant0(java.math.BigDecimal value) { return new NfseServiceGroupReembolsoRepasseDocumentosItemValor(Json.scalar(value)); }
 public boolean matchesVariant0() { return matchesVariant("api2/nfse-issuance.openapi.json", SCHEMA, VARIANT_0); }
 public java.math.BigDecimal asVariant0() { JsonNode value = checkedVariant("api2/nfse-issuance.openapi.json", SCHEMA, VARIANT_0); return decimalValue(value); }
 private static final JsonNode VARIANT_1 = Json.parse("{\"type\":\"string\",\"pattern\":\"^-?(?:\\\\d+\\\\.?\\\\d*|\\\\.\\\\d+)(?:[eE][+-]?\\\\d+)?$\",\"minimum\":0,\"x-sdk-numeric-minimum\":\"0\",\"description\":\"Valor total reembolsado ou repassado.\",\"x-documented-condition\":\"Valor total reembolsado ou repassado.\",\"x-documented-size\":\"15v2\"}");
 public static NfseServiceGroupReembolsoRepasseDocumentosItemValor ofVariant1(String value) { return new NfseServiceGroupReembolsoRepasseDocumentosItemValor(Json.scalar(value)); }
 public boolean matchesVariant1() { return matchesVariant("api2/nfse-issuance.openapi.json", SCHEMA, VARIANT_1); }
 public String asVariant1() { JsonNode value = checkedVariant("api2/nfse-issuance.openapi.json", SCHEMA, VARIANT_1); return stringValue(value); }
}
