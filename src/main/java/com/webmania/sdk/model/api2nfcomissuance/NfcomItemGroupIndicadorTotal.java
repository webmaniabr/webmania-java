package com.webmania.sdk.model.api2nfcomissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/nfcom-issuance.openapi.json; see contract-provenance.json. */
public final class NfcomItemGroupIndicadorTotal extends JsonValue {
 private static final JsonNode SCHEMA = Json.parse("{\"type\":[\"integer\",\"string\"],\"pattern\":\"^-?\\\\d+$\",\"enum\":[\"0\",0,\"1\",1],\"description\":\"Indica se o item comp\\u00f5e o total da NFCom 0 - N\\u00e3o comp\\u00f5e o total 1 - Comp\\u00f5e o total\",\"x-documented-condition\":\"Indica se o item comp\\u00f5e o total da NFCom 0 - N\\u00e3o comp\\u00f5e o total 1 - Comp\\u00f5e o total\",\"x-documented-size\":\"1\"}");
 public NfcomItemGroupIndicadorTotal(JsonNode node) { super(node); }
 private static final JsonNode VARIANT_0 = Json.parse("{\"type\":\"integer\",\"pattern\":\"^-?\\\\d+$\",\"enum\":[\"0\",0,\"1\",1],\"description\":\"Indica se o item comp\\u00f5e o total da NFCom 0 - N\\u00e3o comp\\u00f5e o total 1 - Comp\\u00f5e o total\",\"x-documented-condition\":\"Indica se o item comp\\u00f5e o total da NFCom 0 - N\\u00e3o comp\\u00f5e o total 1 - Comp\\u00f5e o total\",\"x-documented-size\":\"1\"}");
 public static NfcomItemGroupIndicadorTotal ofVariant0(java.math.BigInteger value) { return new NfcomItemGroupIndicadorTotal(Json.scalar(value)); }
 public boolean matchesVariant0() { return matchesVariant("api2/nfcom-issuance.openapi.json", SCHEMA, VARIANT_0); }
 public java.math.BigInteger asVariant0() { JsonNode value = checkedVariant("api2/nfcom-issuance.openapi.json", SCHEMA, VARIANT_0); return integerValue(value); }
 private static final JsonNode VARIANT_1 = Json.parse("{\"type\":\"string\",\"pattern\":\"^-?\\\\d+$\",\"enum\":[\"0\",0,\"1\",1],\"description\":\"Indica se o item comp\\u00f5e o total da NFCom 0 - N\\u00e3o comp\\u00f5e o total 1 - Comp\\u00f5e o total\",\"x-documented-condition\":\"Indica se o item comp\\u00f5e o total da NFCom 0 - N\\u00e3o comp\\u00f5e o total 1 - Comp\\u00f5e o total\",\"x-documented-size\":\"1\"}");
 public static NfcomItemGroupIndicadorTotal ofVariant1(String value) { return new NfcomItemGroupIndicadorTotal(Json.scalar(value)); }
 public boolean matchesVariant1() { return matchesVariant("api2/nfcom-issuance.openapi.json", SCHEMA, VARIANT_1); }
 public String asVariant1() { JsonNode value = checkedVariant("api2/nfcom-issuance.openapi.json", SCHEMA, VARIANT_1); return stringValue(value); }
}
