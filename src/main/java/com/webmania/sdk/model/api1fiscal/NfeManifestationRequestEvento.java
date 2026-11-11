package com.webmania.sdk.model.api1fiscal;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api1/fiscal.openapi.json; see contract-provenance.json. */
public final class NfeManifestationRequestEvento extends JsonValue {
 private static final JsonNode SCHEMA = Json.parse("{\"anyOf\":[{\"type\":\"string\",\"enum\":[\"210200\",\"210210\",\"210220\",\"210240\"],\"description\":\"Six-digit manifestation code. The documentation size cell says 5, while all documented codes and the API require six; six is modeled.\"},{\"type\":\"integer\",\"enum\":[210200,210210,210220,210240]}]}");
 public NfeManifestationRequestEvento(JsonNode node) { super(node); }
 private static final JsonNode VARIANT_0 = SCHEMA.path("anyOf").path(0);
 public static NfeManifestationRequestEvento ofVariant0(String value) { return new NfeManifestationRequestEvento(Json.scalar(value)); }
 public boolean matchesVariant0() { return matchesVariant("api1/fiscal.openapi.json", SCHEMA, VARIANT_0); }
 public String asVariant0() { JsonNode value = checkedVariant("api1/fiscal.openapi.json", SCHEMA, VARIANT_0); return stringValue(value); }
 private static final JsonNode VARIANT_1 = SCHEMA.path("anyOf").path(1);
 public static NfeManifestationRequestEvento ofVariant1(java.math.BigInteger value) { return new NfeManifestationRequestEvento(Json.scalar(value)); }
 public boolean matchesVariant1() { return matchesVariant("api1/fiscal.openapi.json", SCHEMA, VARIANT_1); }
 public java.math.BigInteger asVariant1() { JsonNode value = checkedVariant("api1/fiscal.openapi.json", SCHEMA, VARIANT_1); return integerValue(value); }
}
