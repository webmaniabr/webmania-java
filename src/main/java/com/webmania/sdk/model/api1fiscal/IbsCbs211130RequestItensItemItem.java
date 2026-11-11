package com.webmania.sdk.model.api1fiscal;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api1/fiscal.openapi.json; see contract-provenance.json. */
public final class IbsCbs211130RequestItensItemItem extends JsonValue {
 private static final JsonNode SCHEMA = Json.parse("{\"anyOf\":[{\"type\":\"string\",\"pattern\":\"^[0-9]{1,3}$\"},{\"type\":\"integer\",\"minimum\":1,\"maximum\":999}]}");
 public IbsCbs211130RequestItensItemItem(JsonNode node) { super(node); }
 private static final JsonNode VARIANT_0 = SCHEMA.path("anyOf").path(0);
 public static IbsCbs211130RequestItensItemItem ofVariant0(String value) { return new IbsCbs211130RequestItensItemItem(Json.scalar(value)); }
 public boolean matchesVariant0() { return matchesVariant("api1/fiscal.openapi.json", SCHEMA, VARIANT_0); }
 public String asVariant0() { JsonNode value = checkedVariant("api1/fiscal.openapi.json", SCHEMA, VARIANT_0); return stringValue(value); }
 private static final JsonNode VARIANT_1 = SCHEMA.path("anyOf").path(1);
 public static IbsCbs211130RequestItensItemItem ofVariant1(java.math.BigInteger value) { return new IbsCbs211130RequestItensItemItem(Json.scalar(value)); }
 public boolean matchesVariant1() { return matchesVariant("api1/fiscal.openapi.json", SCHEMA, VARIANT_1); }
 public java.math.BigInteger asVariant1() { JsonNode value = checkedVariant("api1/fiscal.openapi.json", SCHEMA, VARIANT_1); return integerValue(value); }
}
