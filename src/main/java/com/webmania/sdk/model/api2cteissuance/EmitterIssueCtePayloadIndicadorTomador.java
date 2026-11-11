package com.webmania.sdk.model.api2cteissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/cte-issuance.openapi.json; see contract-provenance.json. */
public final class EmitterIssueCtePayloadIndicadorTomador extends JsonValue {
 private static final JsonNode SCHEMA = Json.parse("{\"type\":[\"number\",\"string\"],\"pattern\":\"^-?(?:\\\\d+\\\\.?\\\\d*|\\\\.\\\\d+)(?:[eE][+-]?\\\\d+)?$\",\"enum\":[\"0\",0,\"1\",1,\"2\",2,\"3\",3,\"4\",4],\"description\":\"Papel do tomador no CTe 0 - Remetente 1 - Expedidor 2 - Recebedor 3 - Destinat\\u00e1rio 4 - Outros\",\"x-documented-condition\":\"Papel do tomador no CTe 0 - Remetente 1 - Expedidor 2 - Recebedor 3 - Destinat\\u00e1rio 4 - Outros\",\"x-documented-size\":\"1\"}");
 public EmitterIssueCtePayloadIndicadorTomador(JsonNode node) { super(node); }
 private static final JsonNode VARIANT_0 = Json.parse("{\"type\":\"number\",\"pattern\":\"^-?(?:\\\\d+\\\\.?\\\\d*|\\\\.\\\\d+)(?:[eE][+-]?\\\\d+)?$\",\"enum\":[\"0\",0,\"1\",1,\"2\",2,\"3\",3,\"4\",4],\"description\":\"Papel do tomador no CTe 0 - Remetente 1 - Expedidor 2 - Recebedor 3 - Destinat\\u00e1rio 4 - Outros\",\"x-documented-condition\":\"Papel do tomador no CTe 0 - Remetente 1 - Expedidor 2 - Recebedor 3 - Destinat\\u00e1rio 4 - Outros\",\"x-documented-size\":\"1\"}");
 public static EmitterIssueCtePayloadIndicadorTomador ofVariant0(java.math.BigDecimal value) { return new EmitterIssueCtePayloadIndicadorTomador(Json.scalar(value)); }
 public boolean matchesVariant0() { return matchesVariant("api2/cte-issuance.openapi.json", SCHEMA, VARIANT_0); }
 public java.math.BigDecimal asVariant0() { JsonNode value = checkedVariant("api2/cte-issuance.openapi.json", SCHEMA, VARIANT_0); return decimalValue(value); }
 private static final JsonNode VARIANT_1 = Json.parse("{\"type\":\"string\",\"pattern\":\"^-?(?:\\\\d+\\\\.?\\\\d*|\\\\.\\\\d+)(?:[eE][+-]?\\\\d+)?$\",\"enum\":[\"0\",0,\"1\",1,\"2\",2,\"3\",3,\"4\",4],\"description\":\"Papel do tomador no CTe 0 - Remetente 1 - Expedidor 2 - Recebedor 3 - Destinat\\u00e1rio 4 - Outros\",\"x-documented-condition\":\"Papel do tomador no CTe 0 - Remetente 1 - Expedidor 2 - Recebedor 3 - Destinat\\u00e1rio 4 - Outros\",\"x-documented-size\":\"1\"}");
 public static EmitterIssueCtePayloadIndicadorTomador ofVariant1(String value) { return new EmitterIssueCtePayloadIndicadorTomador(Json.scalar(value)); }
 public boolean matchesVariant1() { return matchesVariant("api2/cte-issuance.openapi.json", SCHEMA, VARIANT_1); }
 public String asVariant1() { JsonNode value = checkedVariant("api2/cte-issuance.openapi.json", SCHEMA, VARIANT_1); return stringValue(value); }
}
