package com.webmania.sdk.model.api2nfcomissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/nfcom-issuance.openapi.json; see contract-provenance.json. */
public final class NfcomItemGroupImpostosFust extends JsonValue {
 private static final JsonNode SCHEMA = Json.parse("{\"anyOf\":[{\"type\":\"object\",\"properties\":{\"aliquota\":{\"anyOf\":[{\"type\":[\"number\",\"string\"],\"pattern\":\"^-?(?:\\\\d+\\\\.?\\\\d*|\\\\.\\\\d+)(?:[eE][+-]?\\\\d+)?$\",\"minimum\":0,\"x-sdk-numeric-minimum\":\"0\",\"maximum\":100,\"x-sdk-numeric-maximum\":\"100\"},{\"type\":\"null\"}],\"description\":\"Al\\u00edquota FUST: 1.0% (fixo) FUNTTEL: 0.5% (fixo)\",\"x-documented-condition\":\"Al\\u00edquota FUST: 1.0% (fixo) FUNTTEL: 0.5% (fixo)\",\"x-documented-size\":\"5v2\"},\"valor\":{\"anyOf\":[{\"type\":[\"number\",\"string\"],\"pattern\":\"^-?(?:\\\\d+\\\\.?\\\\d*|\\\\.\\\\d+)(?:[eE][+-]?\\\\d+)?$\",\"minimum\":0,\"x-sdk-numeric-minimum\":\"0\",\"maximum\":99999999999.99,\"x-sdk-numeric-maximum\":\"99999999999.99\"},{\"type\":\"null\"}],\"description\":\"Valor do tributo\",\"x-documented-condition\":\"Valor do tributo\",\"x-documented-size\":\"15v2\"},\"valor_base_calculo\":{\"anyOf\":[{\"type\":[\"number\",\"string\"],\"pattern\":\"^-?(?:\\\\d+\\\\.?\\\\d*|\\\\.\\\\d+)(?:[eE][+-]?\\\\d+)?$\",\"minimum\":0,\"x-sdk-numeric-minimum\":\"0\",\"maximum\":99999999999.99,\"x-sdk-numeric-maximum\":\"99999999999.99\"},{\"type\":\"null\"}],\"description\":\"Valor da base de c\\u00e1lculo\",\"x-documented-condition\":\"Valor da base de c\\u00e1lculo\",\"x-documented-size\":\"15v2\"}},\"additionalProperties\":true},{\"type\":\"null\"}]}");
 public NfcomItemGroupImpostosFust(JsonNode node) { super(node); }
 private static final JsonNode VARIANT_0 = SCHEMA.path("anyOf").path(0);
 public static NfcomItemGroupImpostosFust ofVariant0(NfcomItemGroupImpostosFustVariant0 value) { return new NfcomItemGroupImpostosFust(value == null ? null : value.toJson()); }
 public boolean matchesVariant0() { return matchesVariant("api2/nfcom-issuance.openapi.json", SCHEMA, VARIANT_0); }
 public NfcomItemGroupImpostosFustVariant0 asVariant0() { JsonNode value = checkedVariant("api2/nfcom-issuance.openapi.json", SCHEMA, VARIANT_0); return (value).isNull() || (value).isMissingNode() ? null : new NfcomItemGroupImpostosFustVariant0(value); }
 private static final JsonNode VARIANT_1 = SCHEMA.path("anyOf").path(1);
 public static NfcomItemGroupImpostosFust ofVariant1(JsonValue value) { return new NfcomItemGroupImpostosFust(value == null ? null : value.toJson()); }
 public boolean matchesVariant1() { return matchesVariant("api2/nfcom-issuance.openapi.json", SCHEMA, VARIANT_1); }
 public JsonValue asVariant1() { JsonNode value = checkedVariant("api2/nfcom-issuance.openapi.json", SCHEMA, VARIANT_1); return (value).isNull() || (value).isMissingNode() ? null : new JsonValue(value); }
}
