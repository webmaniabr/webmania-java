package com.webmania.sdk.model.api2nfcomissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/nfcom-issuance.openapi.json; see contract-provenance.json. */
public final class NfcomItemGroupClasseImposto extends JsonValue {
 private static final JsonNode SCHEMA = Json.parse("{\"anyOf\":[{\"type\":\"string\",\"pattern\":\"^REF\\\\d+$\",\"x-conditional-rules\":[\"A server-side conditional or current catalog constraint also applies; this draft does not replace it.\"]},{\"type\":\"null\"}],\"description\":\"Defini\\u00e7\\u00e3o autom\\u00e1tica de impostos , informe a refer\\u00eancia da classe de imposto cadastrado no painel Webmania\\u00ae Ex: REF000000000\",\"x-documented-condition\":\"Defini\\u00e7\\u00e3o autom\\u00e1tica de impostos , informe a refer\\u00eancia da classe de imposto cadastrado no painel Webmania\\u00ae Ex: REF000000000\",\"x-documented-size\":\"- - -\"}");
 public NfcomItemGroupClasseImposto(JsonNode node) { super(node); }
 private static final JsonNode VARIANT_0 = SCHEMA.path("anyOf").path(0);
 public static NfcomItemGroupClasseImposto ofVariant0(String value) { return new NfcomItemGroupClasseImposto(Json.scalar(value)); }
 public boolean matchesVariant0() { return matchesVariant("api2/nfcom-issuance.openapi.json", SCHEMA, VARIANT_0); }
 public String asVariant0() { JsonNode value = checkedVariant("api2/nfcom-issuance.openapi.json", SCHEMA, VARIANT_0); return stringValue(value); }
 private static final JsonNode VARIANT_1 = SCHEMA.path("anyOf").path(1);
 public static NfcomItemGroupClasseImposto ofVariant1(JsonValue value) { return new NfcomItemGroupClasseImposto(value == null ? null : value.toJson()); }
 public boolean matchesVariant1() { return matchesVariant("api2/nfcom-issuance.openapi.json", SCHEMA, VARIANT_1); }
 public JsonValue asVariant1() { JsonNode value = checkedVariant("api2/nfcom-issuance.openapi.json", SCHEMA, VARIANT_1); return (value).isNull() || (value).isMissingNode() ? null : new JsonValue(value); }
}
