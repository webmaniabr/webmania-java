package com.webmania.sdk.model.api2cteissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/cte-issuance.openapi.json; see contract-provenance.json. */
public final class EmitterIssueCtePayloadPagamentosVinculadosItemNPag extends JsonValue {
 private static final JsonNode SCHEMA = Json.parse("{\"type\":[\"integer\",\"string\"],\"pattern\":\"^-?\\\\d+$\",\"minimum\":1,\"x-sdk-numeric-minimum\":\"1\",\"maximum\":990,\"x-sdk-numeric-maximum\":\"990\",\"description\":\"N\\u00famero sequencial do pagamento dentro do CT-e (1 a 990). Deve ser \\u00fanico dentro do array.\",\"x-documented-condition\":\"N\\u00famero sequencial do pagamento dentro do CT-e (1 a 990). Deve ser \\u00fanico dentro do array.\",\"x-documented-size\":\"1-3\"}");
 public EmitterIssueCtePayloadPagamentosVinculadosItemNPag(JsonNode node) { super(node); }
 private static final JsonNode VARIANT_0 = Json.parse("{\"type\":\"integer\",\"pattern\":\"^-?\\\\d+$\",\"minimum\":1,\"x-sdk-numeric-minimum\":\"1\",\"maximum\":990,\"x-sdk-numeric-maximum\":\"990\",\"description\":\"N\\u00famero sequencial do pagamento dentro do CT-e (1 a 990). Deve ser \\u00fanico dentro do array.\",\"x-documented-condition\":\"N\\u00famero sequencial do pagamento dentro do CT-e (1 a 990). Deve ser \\u00fanico dentro do array.\",\"x-documented-size\":\"1-3\"}");
 public static EmitterIssueCtePayloadPagamentosVinculadosItemNPag ofVariant0(java.math.BigInteger value) { return new EmitterIssueCtePayloadPagamentosVinculadosItemNPag(Json.scalar(value)); }
 public boolean matchesVariant0() { return matchesVariant("api2/cte-issuance.openapi.json", SCHEMA, VARIANT_0); }
 public java.math.BigInteger asVariant0() { JsonNode value = checkedVariant("api2/cte-issuance.openapi.json", SCHEMA, VARIANT_0); return integerValue(value); }
 private static final JsonNode VARIANT_1 = Json.parse("{\"type\":\"string\",\"pattern\":\"^-?\\\\d+$\",\"minimum\":1,\"x-sdk-numeric-minimum\":\"1\",\"maximum\":990,\"x-sdk-numeric-maximum\":\"990\",\"description\":\"N\\u00famero sequencial do pagamento dentro do CT-e (1 a 990). Deve ser \\u00fanico dentro do array.\",\"x-documented-condition\":\"N\\u00famero sequencial do pagamento dentro do CT-e (1 a 990). Deve ser \\u00fanico dentro do array.\",\"x-documented-size\":\"1-3\"}");
 public static EmitterIssueCtePayloadPagamentosVinculadosItemNPag ofVariant1(String value) { return new EmitterIssueCtePayloadPagamentosVinculadosItemNPag(Json.scalar(value)); }
 public boolean matchesVariant1() { return matchesVariant("api2/cte-issuance.openapi.json", SCHEMA, VARIANT_1); }
 public String asVariant1() { JsonNode value = checkedVariant("api2/cte-issuance.openapi.json", SCHEMA, VARIANT_1); return stringValue(value); }
}
