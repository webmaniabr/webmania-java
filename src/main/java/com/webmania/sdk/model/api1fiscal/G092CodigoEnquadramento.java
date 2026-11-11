package com.webmania.sdk.model.api1fiscal;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api1/fiscal.openapi.json; see contract-provenance.json. */
public final class G092CodigoEnquadramento extends JsonValue {
 private static final JsonNode SCHEMA = Json.parse("{\"description\":\"C\\u00f3digo de enquadramento | Padr\\u00e3o: 999 | Public IPI example also supplies digit text. Preserve its original representation and leading zeros; the table integer label and textual example differ.\",\"x-documentation-type\":\"integer\",\"x-documentation-size\":\"1-3\",\"x-documentation-requirements\":[{\"column\":\"NF-e / NFC-e\",\"markers\":[\"obrigatorio\",\"svg_required\"]}],\"anyOf\":[{\"type\":\"integer\",\"minimum\":0,\"maximum\":999},{\"type\":\"string\",\"pattern\":\"^[0-9]{1,3}$\"}]}");
 public G092CodigoEnquadramento(JsonNode node) { super(node); }
 private static final JsonNode VARIANT_0 = SCHEMA.path("anyOf").path(0);
 public static G092CodigoEnquadramento ofVariant0(java.math.BigInteger value) { return new G092CodigoEnquadramento(Json.scalar(value)); }
 public boolean matchesVariant0() { return matchesVariant("api1/fiscal.openapi.json", SCHEMA, VARIANT_0); }
 public java.math.BigInteger asVariant0() { JsonNode value = checkedVariant("api1/fiscal.openapi.json", SCHEMA, VARIANT_0); return integerValue(value); }
 private static final JsonNode VARIANT_1 = SCHEMA.path("anyOf").path(1);
 public static G092CodigoEnquadramento ofVariant1(String value) { return new G092CodigoEnquadramento(Json.scalar(value)); }
 public boolean matchesVariant1() { return matchesVariant("api1/fiscal.openapi.json", SCHEMA, VARIANT_1); }
 public String asVariant1() { JsonNode value = checkedVariant("api1/fiscal.openapi.json", SCHEMA, VARIANT_1); return stringValue(value); }
}
