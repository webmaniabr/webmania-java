package com.webmania.sdk.model.api2nfcomissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/nfcom-issuance.openapi.json; see contract-provenance.json. */
public final class EmitterIssueNfcomPayloadMunicipioFatoGerador extends JsonValue {
 private static final JsonNode SCHEMA = Json.parse("{\"anyOf\":[{\"type\":\"string\",\"minLength\":7,\"maxLength\":7},{\"type\":\"null\"}],\"description\":\"C\\u00f3digo IBGE do munic\\u00edpio de ocorr\\u00eancia do fato gerador Default: usa c\\u00f3digo do munic\\u00edpio do cliente se n\\u00e3o informado\",\"x-documented-condition\":\"C\\u00f3digo IBGE do munic\\u00edpio de ocorr\\u00eancia do fato gerador Default: usa c\\u00f3digo do munic\\u00edpio do cliente se n\\u00e3o informado\",\"x-documented-size\":\"7\"}");
 public EmitterIssueNfcomPayloadMunicipioFatoGerador(JsonNode node) { super(node); }
 private static final JsonNode VARIANT_0 = SCHEMA.path("anyOf").path(0);
 public static EmitterIssueNfcomPayloadMunicipioFatoGerador ofVariant0(String value) { return new EmitterIssueNfcomPayloadMunicipioFatoGerador(Json.scalar(value)); }
 public boolean matchesVariant0() { return matchesVariant("api2/nfcom-issuance.openapi.json", SCHEMA, VARIANT_0); }
 public String asVariant0() { JsonNode value = checkedVariant("api2/nfcom-issuance.openapi.json", SCHEMA, VARIANT_0); return stringValue(value); }
 private static final JsonNode VARIANT_1 = SCHEMA.path("anyOf").path(1);
 public static EmitterIssueNfcomPayloadMunicipioFatoGerador ofVariant1(JsonValue value) { return new EmitterIssueNfcomPayloadMunicipioFatoGerador(value == null ? null : value.toJson()); }
 public boolean matchesVariant1() { return matchesVariant("api2/nfcom-issuance.openapi.json", SCHEMA, VARIANT_1); }
 public JsonValue asVariant1() { JsonNode value = checkedVariant("api2/nfcom-issuance.openapi.json", SCHEMA, VARIANT_1); return (value).isNull() || (value).isMissingNode() ? null : new JsonValue(value); }
}
