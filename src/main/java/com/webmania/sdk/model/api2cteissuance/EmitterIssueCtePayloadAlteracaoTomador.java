package com.webmania.sdk.model.api2cteissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/cte-issuance.openapi.json; see contract-provenance.json. */
public final class EmitterIssueCtePayloadAlteracaoTomador extends JsonValue {
 private static final JsonNode SCHEMA = Json.parse("{\"type\":[\"boolean\",\"integer\",\"string\"],\"enum\":[true,false,0,1,\"0\",\"1\"],\"description\":\"Indicador quando houver altera\\u00e7\\u00e3o no tomador no CT-e de substitui\\u00e7\\u00e3o.Atribu\\u00eddo automaticamente quando o CT-e referenciado for emitido em nossos servi\\u00e7os.\",\"x-documented-condition\":\"Indicador quando houver altera\\u00e7\\u00e3o no tomador no CT-e de substitui\\u00e7\\u00e3o.Atribu\\u00eddo automaticamente quando o CT-e referenciado for emitido em nossos servi\\u00e7os.\",\"x-documented-size\":\"1\"}");
 public EmitterIssueCtePayloadAlteracaoTomador(JsonNode node) { super(node); }
 private static final JsonNode VARIANT_0 = Json.parse("{\"type\":\"boolean\",\"enum\":[true,false,0,1,\"0\",\"1\"],\"description\":\"Indicador quando houver altera\\u00e7\\u00e3o no tomador no CT-e de substitui\\u00e7\\u00e3o.Atribu\\u00eddo automaticamente quando o CT-e referenciado for emitido em nossos servi\\u00e7os.\",\"x-documented-condition\":\"Indicador quando houver altera\\u00e7\\u00e3o no tomador no CT-e de substitui\\u00e7\\u00e3o.Atribu\\u00eddo automaticamente quando o CT-e referenciado for emitido em nossos servi\\u00e7os.\",\"x-documented-size\":\"1\"}");
 public static EmitterIssueCtePayloadAlteracaoTomador ofVariant0(Boolean value) { return new EmitterIssueCtePayloadAlteracaoTomador(Json.scalar(value)); }
 public boolean matchesVariant0() { return matchesVariant("api2/cte-issuance.openapi.json", SCHEMA, VARIANT_0); }
 public Boolean asVariant0() { JsonNode value = checkedVariant("api2/cte-issuance.openapi.json", SCHEMA, VARIANT_0); return booleanValue(value); }
 private static final JsonNode VARIANT_1 = Json.parse("{\"type\":\"integer\",\"enum\":[true,false,0,1,\"0\",\"1\"],\"description\":\"Indicador quando houver altera\\u00e7\\u00e3o no tomador no CT-e de substitui\\u00e7\\u00e3o.Atribu\\u00eddo automaticamente quando o CT-e referenciado for emitido em nossos servi\\u00e7os.\",\"x-documented-condition\":\"Indicador quando houver altera\\u00e7\\u00e3o no tomador no CT-e de substitui\\u00e7\\u00e3o.Atribu\\u00eddo automaticamente quando o CT-e referenciado for emitido em nossos servi\\u00e7os.\",\"x-documented-size\":\"1\"}");
 public static EmitterIssueCtePayloadAlteracaoTomador ofVariant1(java.math.BigInteger value) { return new EmitterIssueCtePayloadAlteracaoTomador(Json.scalar(value)); }
 public boolean matchesVariant1() { return matchesVariant("api2/cte-issuance.openapi.json", SCHEMA, VARIANT_1); }
 public java.math.BigInteger asVariant1() { JsonNode value = checkedVariant("api2/cte-issuance.openapi.json", SCHEMA, VARIANT_1); return integerValue(value); }
 private static final JsonNode VARIANT_2 = Json.parse("{\"type\":\"string\",\"enum\":[true,false,0,1,\"0\",\"1\"],\"description\":\"Indicador quando houver altera\\u00e7\\u00e3o no tomador no CT-e de substitui\\u00e7\\u00e3o.Atribu\\u00eddo automaticamente quando o CT-e referenciado for emitido em nossos servi\\u00e7os.\",\"x-documented-condition\":\"Indicador quando houver altera\\u00e7\\u00e3o no tomador no CT-e de substitui\\u00e7\\u00e3o.Atribu\\u00eddo automaticamente quando o CT-e referenciado for emitido em nossos servi\\u00e7os.\",\"x-documented-size\":\"1\"}");
 public static EmitterIssueCtePayloadAlteracaoTomador ofVariant2(String value) { return new EmitterIssueCtePayloadAlteracaoTomador(Json.scalar(value)); }
 public boolean matchesVariant2() { return matchesVariant("api2/cte-issuance.openapi.json", SCHEMA, VARIANT_2); }
 public String asVariant2() { JsonNode value = checkedVariant("api2/cte-issuance.openapi.json", SCHEMA, VARIANT_2); return stringValue(value); }
}
