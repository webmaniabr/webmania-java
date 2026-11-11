package com.webmania.sdk.model.api2dceissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/dce-issuance.openapi.json; see contract-provenance.json. */
public final class EmitterIssueDcePayloadAmbiente extends JsonValue {
 private static final JsonNode SCHEMA = Json.parse("{\"type\":[\"number\",\"string\"],\"pattern\":\"^-?(?:\\\\d+\\\\.?\\\\d*|\\\\.\\\\d+)(?:[eE][+-]?\\\\d+)?$\",\"enum\":[\"1\",1,\"2\",2],\"description\":\"Ambiente da emiss\\u00e3o. 1 = Produ\\u00e7\\u00e3o 2 = Homologa\\u00e7\\u00e3o\",\"x-documented-condition\":\"Ambiente da emiss\\u00e3o. 1 = Produ\\u00e7\\u00e3o 2 = Homologa\\u00e7\\u00e3o\",\"x-documented-size\":\"1\"}");
 public EmitterIssueDcePayloadAmbiente(JsonNode node) { super(node); }
 private static final JsonNode VARIANT_0 = Json.parse("{\"type\":\"number\",\"pattern\":\"^-?(?:\\\\d+\\\\.?\\\\d*|\\\\.\\\\d+)(?:[eE][+-]?\\\\d+)?$\",\"enum\":[\"1\",1,\"2\",2],\"description\":\"Ambiente da emiss\\u00e3o. 1 = Produ\\u00e7\\u00e3o 2 = Homologa\\u00e7\\u00e3o\",\"x-documented-condition\":\"Ambiente da emiss\\u00e3o. 1 = Produ\\u00e7\\u00e3o 2 = Homologa\\u00e7\\u00e3o\",\"x-documented-size\":\"1\"}");
 public static EmitterIssueDcePayloadAmbiente ofVariant0(java.math.BigDecimal value) { return new EmitterIssueDcePayloadAmbiente(Json.scalar(value)); }
 public boolean matchesVariant0() { return matchesVariant("api2/dce-issuance.openapi.json", SCHEMA, VARIANT_0); }
 public java.math.BigDecimal asVariant0() { JsonNode value = checkedVariant("api2/dce-issuance.openapi.json", SCHEMA, VARIANT_0); return decimalValue(value); }
 private static final JsonNode VARIANT_1 = Json.parse("{\"type\":\"string\",\"pattern\":\"^-?(?:\\\\d+\\\\.?\\\\d*|\\\\.\\\\d+)(?:[eE][+-]?\\\\d+)?$\",\"enum\":[\"1\",1,\"2\",2],\"description\":\"Ambiente da emiss\\u00e3o. 1 = Produ\\u00e7\\u00e3o 2 = Homologa\\u00e7\\u00e3o\",\"x-documented-condition\":\"Ambiente da emiss\\u00e3o. 1 = Produ\\u00e7\\u00e3o 2 = Homologa\\u00e7\\u00e3o\",\"x-documented-size\":\"1\"}");
 public static EmitterIssueDcePayloadAmbiente ofVariant1(String value) { return new EmitterIssueDcePayloadAmbiente(Json.scalar(value)); }
 public boolean matchesVariant1() { return matchesVariant("api2/dce-issuance.openapi.json", SCHEMA, VARIANT_1); }
 public String asVariant1() { JsonNode value = checkedVariant("api2/dce-issuance.openapi.json", SCHEMA, VARIANT_1); return stringValue(value); }
}
