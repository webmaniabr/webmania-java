package com.webmania.sdk.model.api2nfseissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/nfse-issuance.openapi.json; see contract-provenance.json. */
public final class NfseServiceGroupImpostosIss extends JsonValue {
 private static final JsonNode SCHEMA = Json.parse("{\"type\":[\"string\",\"number\"],\"pattern\":\"^\\\\d+(\\\\.\\\\d{1,4})?$\",\"x-conditional-rules\":[\"lt:100\",\"A server-side conditional or current catalog constraint also applies; this draft does not replace it.\"],\"description\":\"Al\\u00edquota do ISS Obs.: N\\u00e3o enviar para munic\\u00edpios do Padr\\u00e3o Nacional (modelo padrao_nacional). 0.00\",\"x-documented-condition\":\"Al\\u00edquota do ISS Obs.: N\\u00e3o enviar para munic\\u00edpios do Padr\\u00e3o Nacional (modelo padrao_nacional). 0.00\",\"x-documented-size\":\"3v2\"}");
 public NfseServiceGroupImpostosIss(JsonNode node) { super(node); }
 private static final JsonNode VARIANT_0 = Json.parse("{\"type\":\"string\",\"pattern\":\"^\\\\d+(\\\\.\\\\d{1,4})?$\",\"x-conditional-rules\":[\"lt:100\",\"A server-side conditional or current catalog constraint also applies; this draft does not replace it.\"],\"description\":\"Al\\u00edquota do ISS Obs.: N\\u00e3o enviar para munic\\u00edpios do Padr\\u00e3o Nacional (modelo padrao_nacional). 0.00\",\"x-documented-condition\":\"Al\\u00edquota do ISS Obs.: N\\u00e3o enviar para munic\\u00edpios do Padr\\u00e3o Nacional (modelo padrao_nacional). 0.00\",\"x-documented-size\":\"3v2\"}");
 public static NfseServiceGroupImpostosIss ofVariant0(String value) { return new NfseServiceGroupImpostosIss(Json.scalar(value)); }
 public boolean matchesVariant0() { return matchesVariant("api2/nfse-issuance.openapi.json", SCHEMA, VARIANT_0); }
 public String asVariant0() { JsonNode value = checkedVariant("api2/nfse-issuance.openapi.json", SCHEMA, VARIANT_0); return stringValue(value); }
 private static final JsonNode VARIANT_1 = Json.parse("{\"type\":\"number\",\"pattern\":\"^\\\\d+(\\\\.\\\\d{1,4})?$\",\"x-conditional-rules\":[\"lt:100\",\"A server-side conditional or current catalog constraint also applies; this draft does not replace it.\"],\"description\":\"Al\\u00edquota do ISS Obs.: N\\u00e3o enviar para munic\\u00edpios do Padr\\u00e3o Nacional (modelo padrao_nacional). 0.00\",\"x-documented-condition\":\"Al\\u00edquota do ISS Obs.: N\\u00e3o enviar para munic\\u00edpios do Padr\\u00e3o Nacional (modelo padrao_nacional). 0.00\",\"x-documented-size\":\"3v2\"}");
 public static NfseServiceGroupImpostosIss ofVariant1(java.math.BigDecimal value) { return new NfseServiceGroupImpostosIss(Json.scalar(value)); }
 public boolean matchesVariant1() { return matchesVariant("api2/nfse-issuance.openapi.json", SCHEMA, VARIANT_1); }
 public java.math.BigDecimal asVariant1() { JsonNode value = checkedVariant("api2/nfse-issuance.openapi.json", SCHEMA, VARIANT_1); return decimalValue(value); }
}
