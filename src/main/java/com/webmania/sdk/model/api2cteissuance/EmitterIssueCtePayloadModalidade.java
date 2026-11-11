package com.webmania.sdk.model.api2cteissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/cte-issuance.openapi.json; see contract-provenance.json. */
public final class EmitterIssueCtePayloadModalidade extends JsonValue {
 private static final JsonNode SCHEMA = Json.parse("{\"type\":[\"number\",\"string\"],\"pattern\":\"^-?(?:\\\\d+\\\\.?\\\\d*|\\\\.\\\\d+)(?:[eE][+-]?\\\\d+)?$\",\"enum\":[\"1\",1,\"2\",2,\"3\",3,\"4\",4,\"5\",5,\"6\",6],\"description\":\"Modalidade de emiss\\u00e3o do documento 1 - Rodovi\\u00e1rio 2 - A\\u00e9reo 3 - Aquavi\\u00e1rio 4 - Ferrovi\\u00e1rio 5 - Dutovi\\u00e1rio 6 - Multimodal\",\"x-documented-condition\":\"Modalidade de emiss\\u00e3o do documento 1 - Rodovi\\u00e1rio 2 - A\\u00e9reo 3 - Aquavi\\u00e1rio 4 - Ferrovi\\u00e1rio 5 - Dutovi\\u00e1rio 6 - Multimodal\",\"x-documented-size\":\"1\"}");
 public EmitterIssueCtePayloadModalidade(JsonNode node) { super(node); }
 private static final JsonNode VARIANT_0 = Json.parse("{\"type\":\"number\",\"pattern\":\"^-?(?:\\\\d+\\\\.?\\\\d*|\\\\.\\\\d+)(?:[eE][+-]?\\\\d+)?$\",\"enum\":[\"1\",1,\"2\",2,\"3\",3,\"4\",4,\"5\",5,\"6\",6],\"description\":\"Modalidade de emiss\\u00e3o do documento 1 - Rodovi\\u00e1rio 2 - A\\u00e9reo 3 - Aquavi\\u00e1rio 4 - Ferrovi\\u00e1rio 5 - Dutovi\\u00e1rio 6 - Multimodal\",\"x-documented-condition\":\"Modalidade de emiss\\u00e3o do documento 1 - Rodovi\\u00e1rio 2 - A\\u00e9reo 3 - Aquavi\\u00e1rio 4 - Ferrovi\\u00e1rio 5 - Dutovi\\u00e1rio 6 - Multimodal\",\"x-documented-size\":\"1\"}");
 public static EmitterIssueCtePayloadModalidade ofVariant0(java.math.BigDecimal value) { return new EmitterIssueCtePayloadModalidade(Json.scalar(value)); }
 public boolean matchesVariant0() { return matchesVariant("api2/cte-issuance.openapi.json", SCHEMA, VARIANT_0); }
 public java.math.BigDecimal asVariant0() { JsonNode value = checkedVariant("api2/cte-issuance.openapi.json", SCHEMA, VARIANT_0); return decimalValue(value); }
 private static final JsonNode VARIANT_1 = Json.parse("{\"type\":\"string\",\"pattern\":\"^-?(?:\\\\d+\\\\.?\\\\d*|\\\\.\\\\d+)(?:[eE][+-]?\\\\d+)?$\",\"enum\":[\"1\",1,\"2\",2,\"3\",3,\"4\",4,\"5\",5,\"6\",6],\"description\":\"Modalidade de emiss\\u00e3o do documento 1 - Rodovi\\u00e1rio 2 - A\\u00e9reo 3 - Aquavi\\u00e1rio 4 - Ferrovi\\u00e1rio 5 - Dutovi\\u00e1rio 6 - Multimodal\",\"x-documented-condition\":\"Modalidade de emiss\\u00e3o do documento 1 - Rodovi\\u00e1rio 2 - A\\u00e9reo 3 - Aquavi\\u00e1rio 4 - Ferrovi\\u00e1rio 5 - Dutovi\\u00e1rio 6 - Multimodal\",\"x-documented-size\":\"1\"}");
 public static EmitterIssueCtePayloadModalidade ofVariant1(String value) { return new EmitterIssueCtePayloadModalidade(Json.scalar(value)); }
 public boolean matchesVariant1() { return matchesVariant("api2/cte-issuance.openapi.json", SCHEMA, VARIANT_1); }
 public String asVariant1() { JsonNode value = checkedVariant("api2/cte-issuance.openapi.json", SCHEMA, VARIANT_1); return stringValue(value); }
}
