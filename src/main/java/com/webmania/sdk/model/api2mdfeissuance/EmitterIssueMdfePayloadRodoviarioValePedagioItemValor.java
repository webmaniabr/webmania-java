package com.webmania.sdk.model.api2mdfeissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/mdfe-issuance.openapi.json; see contract-provenance.json. */
public final class EmitterIssueMdfePayloadRodoviarioValePedagioItemValor extends JsonValue {
 private static final JsonNode SCHEMA = Json.parse("{\"type\":[\"number\",\"string\"],\"pattern\":\"^-?(?:\\\\d+\\\\.?\\\\d*|\\\\.\\\\d+)(?:[eE][+-]?\\\\d+)?$\",\"description\":\"Valor do Vale Ped\\u00e1gio\",\"x-documented-condition\":\"Valor do Vale Ped\\u00e1gio\",\"x-documented-size\":\"13v2\"}");
 public EmitterIssueMdfePayloadRodoviarioValePedagioItemValor(JsonNode node) { super(node); }
 private static final JsonNode VARIANT_0 = Json.parse("{\"type\":\"number\",\"pattern\":\"^-?(?:\\\\d+\\\\.?\\\\d*|\\\\.\\\\d+)(?:[eE][+-]?\\\\d+)?$\",\"description\":\"Valor do Vale Ped\\u00e1gio\",\"x-documented-condition\":\"Valor do Vale Ped\\u00e1gio\",\"x-documented-size\":\"13v2\"}");
 public static EmitterIssueMdfePayloadRodoviarioValePedagioItemValor ofVariant0(java.math.BigDecimal value) { return new EmitterIssueMdfePayloadRodoviarioValePedagioItemValor(Json.scalar(value)); }
 public boolean matchesVariant0() { return matchesVariant("api2/mdfe-issuance.openapi.json", SCHEMA, VARIANT_0); }
 public java.math.BigDecimal asVariant0() { JsonNode value = checkedVariant("api2/mdfe-issuance.openapi.json", SCHEMA, VARIANT_0); return decimalValue(value); }
 private static final JsonNode VARIANT_1 = Json.parse("{\"type\":\"string\",\"pattern\":\"^-?(?:\\\\d+\\\\.?\\\\d*|\\\\.\\\\d+)(?:[eE][+-]?\\\\d+)?$\",\"description\":\"Valor do Vale Ped\\u00e1gio\",\"x-documented-condition\":\"Valor do Vale Ped\\u00e1gio\",\"x-documented-size\":\"13v2\"}");
 public static EmitterIssueMdfePayloadRodoviarioValePedagioItemValor ofVariant1(String value) { return new EmitterIssueMdfePayloadRodoviarioValePedagioItemValor(Json.scalar(value)); }
 public boolean matchesVariant1() { return matchesVariant("api2/mdfe-issuance.openapi.json", SCHEMA, VARIANT_1); }
 public String asVariant1() { JsonNode value = checkedVariant("api2/mdfe-issuance.openapi.json", SCHEMA, VARIANT_1); return stringValue(value); }
}
