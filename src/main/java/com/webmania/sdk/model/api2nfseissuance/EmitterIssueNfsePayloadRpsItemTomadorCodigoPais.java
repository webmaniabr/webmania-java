package com.webmania.sdk.model.api2nfseissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/nfse-issuance.openapi.json; see contract-provenance.json. */
public final class EmitterIssueNfsePayloadRpsItemTomadorCodigoPais extends JsonValue {
 private static final JsonNode SCHEMA = Json.parse("{\"anyOf\":[{\"type\":\"string\",\"minLength\":4,\"maxLength\":4},{\"type\":\"null\"}],\"description\":\"C\\u00f3digo do Pa\\u00eds (padr\\u00e3o BACEN) Ex: Estados Unidos = 2496 Visualizar tabela do BACEN\",\"x-documented-condition\":\"C\\u00f3digo do Pa\\u00eds (padr\\u00e3o BACEN) Ex: Estados Unidos = 2496 Visualizar tabela do BACEN\",\"x-documented-size\":\"4\"}");
 public EmitterIssueNfsePayloadRpsItemTomadorCodigoPais(JsonNode node) { super(node); }
 private static final JsonNode VARIANT_0 = SCHEMA.path("anyOf").path(0);
 public static EmitterIssueNfsePayloadRpsItemTomadorCodigoPais ofVariant0(String value) { return new EmitterIssueNfsePayloadRpsItemTomadorCodigoPais(Json.scalar(value)); }
 public boolean matchesVariant0() { return matchesVariant("api2/nfse-issuance.openapi.json", SCHEMA, VARIANT_0); }
 public String asVariant0() { JsonNode value = checkedVariant("api2/nfse-issuance.openapi.json", SCHEMA, VARIANT_0); return stringValue(value); }
 private static final JsonNode VARIANT_1 = SCHEMA.path("anyOf").path(1);
 public static EmitterIssueNfsePayloadRpsItemTomadorCodigoPais ofVariant1(JsonValue value) { return new EmitterIssueNfsePayloadRpsItemTomadorCodigoPais(value == null ? null : value.toJson()); }
 public boolean matchesVariant1() { return matchesVariant("api2/nfse-issuance.openapi.json", SCHEMA, VARIANT_1); }
 public JsonValue asVariant1() { JsonNode value = checkedVariant("api2/nfse-issuance.openapi.json", SCHEMA, VARIANT_1); return (value).isNull() || (value).isMissingNode() ? null : new JsonValue(value); }
}
