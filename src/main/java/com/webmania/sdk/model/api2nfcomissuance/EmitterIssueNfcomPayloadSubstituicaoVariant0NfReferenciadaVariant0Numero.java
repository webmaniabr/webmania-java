package com.webmania.sdk.model.api2nfcomissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/nfcom-issuance.openapi.json; see contract-provenance.json. */
public final class EmitterIssueNfcomPayloadSubstituicaoVariant0NfReferenciadaVariant0Numero extends JsonValue {
 private static final JsonNode SCHEMA = Json.parse("{\"type\":[\"integer\",\"string\"],\"pattern\":\"^-?\\\\d+$\",\"minimum\":1,\"x-sdk-numeric-minimum\":\"1\",\"maximum\":999999999,\"x-sdk-numeric-maximum\":\"999999999\",\"x-conditional-rules\":[\"required_with:substituicao.nf_referenciada\"],\"description\":\"N\\u00famero da NF referenciada\",\"x-documented-condition\":\"N\\u00famero da NF referenciada\",\"x-documented-size\":\"1-9\"}");
 public EmitterIssueNfcomPayloadSubstituicaoVariant0NfReferenciadaVariant0Numero(JsonNode node) { super(node); }
 private static final JsonNode VARIANT_0 = Json.parse("{\"type\":\"integer\",\"pattern\":\"^-?\\\\d+$\",\"minimum\":1,\"x-sdk-numeric-minimum\":\"1\",\"maximum\":999999999,\"x-sdk-numeric-maximum\":\"999999999\",\"x-conditional-rules\":[\"required_with:substituicao.nf_referenciada\"],\"description\":\"N\\u00famero da NF referenciada\",\"x-documented-condition\":\"N\\u00famero da NF referenciada\",\"x-documented-size\":\"1-9\"}");
 public static EmitterIssueNfcomPayloadSubstituicaoVariant0NfReferenciadaVariant0Numero ofVariant0(java.math.BigInteger value) { return new EmitterIssueNfcomPayloadSubstituicaoVariant0NfReferenciadaVariant0Numero(Json.scalar(value)); }
 public boolean matchesVariant0() { return matchesVariant("api2/nfcom-issuance.openapi.json", SCHEMA, VARIANT_0); }
 public java.math.BigInteger asVariant0() { JsonNode value = checkedVariant("api2/nfcom-issuance.openapi.json", SCHEMA, VARIANT_0); return integerValue(value); }
 private static final JsonNode VARIANT_1 = Json.parse("{\"type\":\"string\",\"pattern\":\"^-?\\\\d+$\",\"minimum\":1,\"x-sdk-numeric-minimum\":\"1\",\"maximum\":999999999,\"x-sdk-numeric-maximum\":\"999999999\",\"x-conditional-rules\":[\"required_with:substituicao.nf_referenciada\"],\"description\":\"N\\u00famero da NF referenciada\",\"x-documented-condition\":\"N\\u00famero da NF referenciada\",\"x-documented-size\":\"1-9\"}");
 public static EmitterIssueNfcomPayloadSubstituicaoVariant0NfReferenciadaVariant0Numero ofVariant1(String value) { return new EmitterIssueNfcomPayloadSubstituicaoVariant0NfReferenciadaVariant0Numero(Json.scalar(value)); }
 public boolean matchesVariant1() { return matchesVariant("api2/nfcom-issuance.openapi.json", SCHEMA, VARIANT_1); }
 public String asVariant1() { JsonNode value = checkedVariant("api2/nfcom-issuance.openapi.json", SCHEMA, VARIANT_1); return stringValue(value); }
}
