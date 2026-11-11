package com.webmania.sdk.model.api2cteissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/cte-issuance.openapi.json; see contract-provenance.json. */
public final class EmitterLinkCtePaymentPayloadPagamentoNPag extends JsonValue {
 private static final JsonNode SCHEMA = Json.parse("{\"type\":[\"integer\",\"string\"],\"pattern\":\"^-?\\\\d+$\",\"minimum\":1,\"x-sdk-numeric-minimum\":\"1\",\"maximum\":990,\"x-sdk-numeric-maximum\":\"990\"}");
 public EmitterLinkCtePaymentPayloadPagamentoNPag(JsonNode node) { super(node); }
 private static final JsonNode VARIANT_0 = Json.parse("{\"type\":\"integer\",\"pattern\":\"^-?\\\\d+$\",\"minimum\":1,\"x-sdk-numeric-minimum\":\"1\",\"maximum\":990,\"x-sdk-numeric-maximum\":\"990\"}");
 public static EmitterLinkCtePaymentPayloadPagamentoNPag ofVariant0(java.math.BigInteger value) { return new EmitterLinkCtePaymentPayloadPagamentoNPag(Json.scalar(value)); }
 public boolean matchesVariant0() { return matchesVariant("api2/cte-issuance.openapi.json", SCHEMA, VARIANT_0); }
 public java.math.BigInteger asVariant0() { JsonNode value = checkedVariant("api2/cte-issuance.openapi.json", SCHEMA, VARIANT_0); return integerValue(value); }
 private static final JsonNode VARIANT_1 = Json.parse("{\"type\":\"string\",\"pattern\":\"^-?\\\\d+$\",\"minimum\":1,\"x-sdk-numeric-minimum\":\"1\",\"maximum\":990,\"x-sdk-numeric-maximum\":\"990\"}");
 public static EmitterLinkCtePaymentPayloadPagamentoNPag ofVariant1(String value) { return new EmitterLinkCtePaymentPayloadPagamentoNPag(Json.scalar(value)); }
 public boolean matchesVariant1() { return matchesVariant("api2/cte-issuance.openapi.json", SCHEMA, VARIANT_1); }
 public String asVariant1() { JsonNode value = checkedVariant("api2/cte-issuance.openapi.json", SCHEMA, VARIANT_1); return stringValue(value); }
}
