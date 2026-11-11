package com.webmania.sdk.model.api2nfcomissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/nfcom-issuance.openapi.json; see contract-provenance.json. */
public final class NfcomItemGroupImpostosIcmsVariant0CodigoCfop extends JsonValue {
 private static final JsonNode SCHEMA = Json.parse("{\"anyOf\":[{\"type\":\"string\",\"minLength\":4,\"maxLength\":4,\"pattern\":\"^[0-9]+$\",\"x-conditional-rules\":[\"A server-side conditional or current catalog constraint also applies; this draft does not replace it.\"]},{\"type\":\"null\"}],\"description\":\"C\\u00f3digo Fiscal de Opera\\u00e7\\u00f5es e Presta\\u00e7\\u00f5es Exemplos: 5307 - Presta\\u00e7\\u00e3o de servi\\u00e7o de comunica\\u00e7\\u00e3o (dentro do estado) 6307 - Presta\\u00e7\\u00e3o de servi\\u00e7o de comunica\\u00e7\\u00e3o (fora do estado)\",\"x-documented-condition\":\"C\\u00f3digo Fiscal de Opera\\u00e7\\u00f5es e Presta\\u00e7\\u00f5es Exemplos: 5307 - Presta\\u00e7\\u00e3o de servi\\u00e7o de comunica\\u00e7\\u00e3o (dentro do estado) 6307 - Presta\\u00e7\\u00e3o de servi\\u00e7o de comunica\\u00e7\\u00e3o (fora do estado)\",\"x-documented-size\":\"4\"}");
 public NfcomItemGroupImpostosIcmsVariant0CodigoCfop(JsonNode node) { super(node); }
 private static final JsonNode VARIANT_0 = SCHEMA.path("anyOf").path(0);
 public static NfcomItemGroupImpostosIcmsVariant0CodigoCfop ofVariant0(String value) { return new NfcomItemGroupImpostosIcmsVariant0CodigoCfop(Json.scalar(value)); }
 public boolean matchesVariant0() { return matchesVariant("api2/nfcom-issuance.openapi.json", SCHEMA, VARIANT_0); }
 public String asVariant0() { JsonNode value = checkedVariant("api2/nfcom-issuance.openapi.json", SCHEMA, VARIANT_0); return stringValue(value); }
 private static final JsonNode VARIANT_1 = SCHEMA.path("anyOf").path(1);
 public static NfcomItemGroupImpostosIcmsVariant0CodigoCfop ofVariant1(JsonValue value) { return new NfcomItemGroupImpostosIcmsVariant0CodigoCfop(value == null ? null : value.toJson()); }
 public boolean matchesVariant1() { return matchesVariant("api2/nfcom-issuance.openapi.json", SCHEMA, VARIANT_1); }
 public JsonValue asVariant1() { JsonNode value = checkedVariant("api2/nfcom-issuance.openapi.json", SCHEMA, VARIANT_1); return (value).isNull() || (value).isMissingNode() ? null : new JsonValue(value); }
}
