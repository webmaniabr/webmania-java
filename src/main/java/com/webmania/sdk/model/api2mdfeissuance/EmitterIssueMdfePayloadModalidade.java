package com.webmania.sdk.model.api2mdfeissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/mdfe-issuance.openapi.json; see contract-provenance.json. */
public final class EmitterIssueMdfePayloadModalidade extends JsonValue {
 private static final JsonNode SCHEMA = Json.parse("{\"type\":[\"number\",\"string\"],\"pattern\":\"^-?(?:\\\\d+\\\\.?\\\\d*|\\\\.\\\\d+)(?:[eE][+-]?\\\\d+)?$\",\"enum\":[\"1\",\"2\",\"3\",\"4\",1,2,3,4],\"x-conditional-rules\":[\"A server-side conditional or current catalog constraint also applies; this draft does not replace it.\"],\"description\":\"Modalidade de transporte 1 - Rodovi\\u00e1rio 2 - A\\u00e9reo 3 - Aquavi\\u00e1rio 4 - Ferrovi\\u00e1rio\",\"x-documented-condition\":\"Modalidade de transporte 1 - Rodovi\\u00e1rio 2 - A\\u00e9reo 3 - Aquavi\\u00e1rio 4 - Ferrovi\\u00e1rio\",\"x-documented-size\":\"1\"}");
 public EmitterIssueMdfePayloadModalidade(JsonNode node) { super(node); }
 private static final JsonNode VARIANT_0 = Json.parse("{\"type\":\"number\",\"pattern\":\"^-?(?:\\\\d+\\\\.?\\\\d*|\\\\.\\\\d+)(?:[eE][+-]?\\\\d+)?$\",\"enum\":[\"1\",\"2\",\"3\",\"4\",1,2,3,4],\"x-conditional-rules\":[\"A server-side conditional or current catalog constraint also applies; this draft does not replace it.\"],\"description\":\"Modalidade de transporte 1 - Rodovi\\u00e1rio 2 - A\\u00e9reo 3 - Aquavi\\u00e1rio 4 - Ferrovi\\u00e1rio\",\"x-documented-condition\":\"Modalidade de transporte 1 - Rodovi\\u00e1rio 2 - A\\u00e9reo 3 - Aquavi\\u00e1rio 4 - Ferrovi\\u00e1rio\",\"x-documented-size\":\"1\"}");
 public static EmitterIssueMdfePayloadModalidade ofVariant0(java.math.BigDecimal value) { return new EmitterIssueMdfePayloadModalidade(Json.scalar(value)); }
 public boolean matchesVariant0() { return matchesVariant("api2/mdfe-issuance.openapi.json", SCHEMA, VARIANT_0); }
 public java.math.BigDecimal asVariant0() { JsonNode value = checkedVariant("api2/mdfe-issuance.openapi.json", SCHEMA, VARIANT_0); return decimalValue(value); }
 private static final JsonNode VARIANT_1 = Json.parse("{\"type\":\"string\",\"pattern\":\"^-?(?:\\\\d+\\\\.?\\\\d*|\\\\.\\\\d+)(?:[eE][+-]?\\\\d+)?$\",\"enum\":[\"1\",\"2\",\"3\",\"4\",1,2,3,4],\"x-conditional-rules\":[\"A server-side conditional or current catalog constraint also applies; this draft does not replace it.\"],\"description\":\"Modalidade de transporte 1 - Rodovi\\u00e1rio 2 - A\\u00e9reo 3 - Aquavi\\u00e1rio 4 - Ferrovi\\u00e1rio\",\"x-documented-condition\":\"Modalidade de transporte 1 - Rodovi\\u00e1rio 2 - A\\u00e9reo 3 - Aquavi\\u00e1rio 4 - Ferrovi\\u00e1rio\",\"x-documented-size\":\"1\"}");
 public static EmitterIssueMdfePayloadModalidade ofVariant1(String value) { return new EmitterIssueMdfePayloadModalidade(Json.scalar(value)); }
 public boolean matchesVariant1() { return matchesVariant("api2/mdfe-issuance.openapi.json", SCHEMA, VARIANT_1); }
 public String asVariant1() { JsonNode value = checkedVariant("api2/mdfe-issuance.openapi.json", SCHEMA, VARIANT_1); return stringValue(value); }
}
