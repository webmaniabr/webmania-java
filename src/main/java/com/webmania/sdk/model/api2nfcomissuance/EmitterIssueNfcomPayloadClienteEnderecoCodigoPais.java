package com.webmania.sdk.model.api2nfcomissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/nfcom-issuance.openapi.json; see contract-provenance.json. */
public final class EmitterIssueNfcomPayloadClienteEnderecoCodigoPais extends JsonValue {
 private static final JsonNode SCHEMA = Json.parse("{\"anyOf\":[{\"type\":\"string\",\"minLength\":4,\"maxLength\":4,\"pattern\":\"^[0-9]+$\",\"x-conditional-rules\":[\"A server-side conditional or current catalog constraint also applies; this draft does not replace it.\"]},{\"type\":\"null\"}],\"description\":\"C\\u00f3digo do pa\\u00eds (BACEN) Default: 1058 (Brasil)\",\"x-documented-condition\":\"C\\u00f3digo do pa\\u00eds (BACEN) Default: 1058 (Brasil)\",\"x-documented-size\":\"1-4\"}");
 public EmitterIssueNfcomPayloadClienteEnderecoCodigoPais(JsonNode node) { super(node); }
 private static final JsonNode VARIANT_0 = SCHEMA.path("anyOf").path(0);
 public static EmitterIssueNfcomPayloadClienteEnderecoCodigoPais ofVariant0(String value) { return new EmitterIssueNfcomPayloadClienteEnderecoCodigoPais(Json.scalar(value)); }
 public boolean matchesVariant0() { return matchesVariant("api2/nfcom-issuance.openapi.json", SCHEMA, VARIANT_0); }
 public String asVariant0() { JsonNode value = checkedVariant("api2/nfcom-issuance.openapi.json", SCHEMA, VARIANT_0); return stringValue(value); }
 private static final JsonNode VARIANT_1 = SCHEMA.path("anyOf").path(1);
 public static EmitterIssueNfcomPayloadClienteEnderecoCodigoPais ofVariant1(JsonValue value) { return new EmitterIssueNfcomPayloadClienteEnderecoCodigoPais(value == null ? null : value.toJson()); }
 public boolean matchesVariant1() { return matchesVariant("api2/nfcom-issuance.openapi.json", SCHEMA, VARIANT_1); }
 public JsonValue asVariant1() { JsonNode value = checkedVariant("api2/nfcom-issuance.openapi.json", SCHEMA, VARIANT_1); return (value).isNull() || (value).isMissingNode() ? null : new JsonValue(value); }
}
