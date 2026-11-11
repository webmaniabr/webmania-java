package com.webmania.sdk.model.api2cteissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/cte-issuance.openapi.json; see contract-provenance.json. */
public final class EmitterIssueCtePayloadContribuicaoTomador extends JsonValue {
 private static final JsonNode SCHEMA = Json.parse("{\"type\":[\"number\",\"string\"],\"pattern\":\"^-?(?:\\\\d+\\\\.?\\\\d*|\\\\.\\\\d+)(?:[eE][+-]?\\\\d+)?$\",\"enum\":[\"1\",1,\"2\",2,\"9\",9],\"description\":\"Tipo de contribuinte para o tomador na presta\\u00e7\\u00e3o do servi\\u00e7o 1 - Contribuinte ICMS 2 - Contribuinte isento de inscri\\u00e7\\u00e3o 9 - N\\u00e3o Contribuinte\",\"x-documented-condition\":\"Tipo de contribuinte para o tomador na presta\\u00e7\\u00e3o do servi\\u00e7o 1 - Contribuinte ICMS 2 - Contribuinte isento de inscri\\u00e7\\u00e3o 9 - N\\u00e3o Contribuinte\",\"x-documented-size\":\"1\"}");
 public EmitterIssueCtePayloadContribuicaoTomador(JsonNode node) { super(node); }
 private static final JsonNode VARIANT_0 = Json.parse("{\"type\":\"number\",\"pattern\":\"^-?(?:\\\\d+\\\\.?\\\\d*|\\\\.\\\\d+)(?:[eE][+-]?\\\\d+)?$\",\"enum\":[\"1\",1,\"2\",2,\"9\",9],\"description\":\"Tipo de contribuinte para o tomador na presta\\u00e7\\u00e3o do servi\\u00e7o 1 - Contribuinte ICMS 2 - Contribuinte isento de inscri\\u00e7\\u00e3o 9 - N\\u00e3o Contribuinte\",\"x-documented-condition\":\"Tipo de contribuinte para o tomador na presta\\u00e7\\u00e3o do servi\\u00e7o 1 - Contribuinte ICMS 2 - Contribuinte isento de inscri\\u00e7\\u00e3o 9 - N\\u00e3o Contribuinte\",\"x-documented-size\":\"1\"}");
 public static EmitterIssueCtePayloadContribuicaoTomador ofVariant0(java.math.BigDecimal value) { return new EmitterIssueCtePayloadContribuicaoTomador(Json.scalar(value)); }
 public boolean matchesVariant0() { return matchesVariant("api2/cte-issuance.openapi.json", SCHEMA, VARIANT_0); }
 public java.math.BigDecimal asVariant0() { JsonNode value = checkedVariant("api2/cte-issuance.openapi.json", SCHEMA, VARIANT_0); return decimalValue(value); }
 private static final JsonNode VARIANT_1 = Json.parse("{\"type\":\"string\",\"pattern\":\"^-?(?:\\\\d+\\\\.?\\\\d*|\\\\.\\\\d+)(?:[eE][+-]?\\\\d+)?$\",\"enum\":[\"1\",1,\"2\",2,\"9\",9],\"description\":\"Tipo de contribuinte para o tomador na presta\\u00e7\\u00e3o do servi\\u00e7o 1 - Contribuinte ICMS 2 - Contribuinte isento de inscri\\u00e7\\u00e3o 9 - N\\u00e3o Contribuinte\",\"x-documented-condition\":\"Tipo de contribuinte para o tomador na presta\\u00e7\\u00e3o do servi\\u00e7o 1 - Contribuinte ICMS 2 - Contribuinte isento de inscri\\u00e7\\u00e3o 9 - N\\u00e3o Contribuinte\",\"x-documented-size\":\"1\"}");
 public static EmitterIssueCtePayloadContribuicaoTomador ofVariant1(String value) { return new EmitterIssueCtePayloadContribuicaoTomador(Json.scalar(value)); }
 public boolean matchesVariant1() { return matchesVariant("api2/cte-issuance.openapi.json", SCHEMA, VARIANT_1); }
 public String asVariant1() { JsonNode value = checkedVariant("api2/cte-issuance.openapi.json", SCHEMA, VARIANT_1); return stringValue(value); }
}
