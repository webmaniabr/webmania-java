package com.webmania.sdk.model.api2cteissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/cte-issuance.openapi.json; see contract-provenance.json. */
public final class EmitterIssueCtePayloadImpostosIcmsPartilhaValorIcmsUfRemetente extends JsonValue {
 private static final JsonNode SCHEMA = Json.parse("{\"type\":[\"number\",\"string\"],\"description\":\"Al\\u00edquota de ICMS interestadual\",\"x-documented-size\":\"3v2\",\"x-documented-condition\":\"Al\\u00edquota de ICMS interestadual\"}");
 public EmitterIssueCtePayloadImpostosIcmsPartilhaValorIcmsUfRemetente(JsonNode node) { super(node); }
 private static final JsonNode VARIANT_0 = Json.parse("{\"type\":\"number\",\"description\":\"Al\\u00edquota de ICMS interestadual\",\"x-documented-size\":\"3v2\",\"x-documented-condition\":\"Al\\u00edquota de ICMS interestadual\"}");
 public static EmitterIssueCtePayloadImpostosIcmsPartilhaValorIcmsUfRemetente ofVariant0(java.math.BigDecimal value) { return new EmitterIssueCtePayloadImpostosIcmsPartilhaValorIcmsUfRemetente(Json.scalar(value)); }
 public boolean matchesVariant0() { return matchesVariant("api2/cte-issuance.openapi.json", SCHEMA, VARIANT_0); }
 public java.math.BigDecimal asVariant0() { JsonNode value = checkedVariant("api2/cte-issuance.openapi.json", SCHEMA, VARIANT_0); return decimalValue(value); }
 private static final JsonNode VARIANT_1 = Json.parse("{\"type\":\"string\",\"description\":\"Al\\u00edquota de ICMS interestadual\",\"x-documented-size\":\"3v2\",\"x-documented-condition\":\"Al\\u00edquota de ICMS interestadual\"}");
 public static EmitterIssueCtePayloadImpostosIcmsPartilhaValorIcmsUfRemetente ofVariant1(String value) { return new EmitterIssueCtePayloadImpostosIcmsPartilhaValorIcmsUfRemetente(Json.scalar(value)); }
 public boolean matchesVariant1() { return matchesVariant("api2/cte-issuance.openapi.json", SCHEMA, VARIANT_1); }
 public String asVariant1() { JsonNode value = checkedVariant("api2/cte-issuance.openapi.json", SCHEMA, VARIANT_1); return stringValue(value); }
}
