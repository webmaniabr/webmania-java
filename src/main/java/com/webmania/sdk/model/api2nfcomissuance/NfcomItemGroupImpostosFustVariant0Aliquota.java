package com.webmania.sdk.model.api2nfcomissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/nfcom-issuance.openapi.json; see contract-provenance.json. */
public final class NfcomItemGroupImpostosFustVariant0Aliquota extends JsonValue {
 private static final JsonNode SCHEMA = Json.parse("{\"anyOf\":[{\"type\":[\"number\",\"string\"],\"pattern\":\"^-?(?:\\\\d+\\\\.?\\\\d*|\\\\.\\\\d+)(?:[eE][+-]?\\\\d+)?$\",\"minimum\":0,\"x-sdk-numeric-minimum\":\"0\",\"maximum\":100,\"x-sdk-numeric-maximum\":\"100\"},{\"type\":\"null\"}],\"description\":\"Al\\u00edquota FUST: 1.0% (fixo) FUNTTEL: 0.5% (fixo)\",\"x-documented-condition\":\"Al\\u00edquota FUST: 1.0% (fixo) FUNTTEL: 0.5% (fixo)\",\"x-documented-size\":\"5v2\"}");
 public NfcomItemGroupImpostosFustVariant0Aliquota(JsonNode node) { super(node); }
 private static final JsonNode VARIANT_0 = SCHEMA.path("anyOf").path(0);
 public static NfcomItemGroupImpostosFustVariant0Aliquota ofVariant0(NfcomItemGroupImpostosFustVariant0AliquotaVariant0 value) { return new NfcomItemGroupImpostosFustVariant0Aliquota(value == null ? null : value.toJson()); }
 public boolean matchesVariant0() { return matchesVariant("api2/nfcom-issuance.openapi.json", SCHEMA, VARIANT_0); }
 public NfcomItemGroupImpostosFustVariant0AliquotaVariant0 asVariant0() { JsonNode value = checkedVariant("api2/nfcom-issuance.openapi.json", SCHEMA, VARIANT_0); return (value).isNull() || (value).isMissingNode() ? null : new NfcomItemGroupImpostosFustVariant0AliquotaVariant0(value); }
 private static final JsonNode VARIANT_1 = SCHEMA.path("anyOf").path(1);
 public static NfcomItemGroupImpostosFustVariant0Aliquota ofVariant1(JsonValue value) { return new NfcomItemGroupImpostosFustVariant0Aliquota(value == null ? null : value.toJson()); }
 public boolean matchesVariant1() { return matchesVariant("api2/nfcom-issuance.openapi.json", SCHEMA, VARIANT_1); }
 public JsonValue asVariant1() { JsonNode value = checkedVariant("api2/nfcom-issuance.openapi.json", SCHEMA, VARIANT_1); return (value).isNull() || (value).isMissingNode() ? null : new JsonValue(value); }
}
