package com.webmania.sdk.model.api2nfcomissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/nfcom-issuance.openapi.json; see contract-provenance.json. */
public final class EmitterIssueNfcomPayloadAutorizarDownload extends JsonValue {
 private static final JsonNode SCHEMA = Json.parse("{\"anyOf\":[{\"type\":\"array\",\"items\":{\"type\":\"string\",\"x-conditional-rules\":[\"A server-side conditional or current catalog constraint also applies; this draft does not replace it.\"]},\"maxItems\":10},{\"type\":\"null\"}],\"description\":\"CPF/CNPJ autorizados a baixar o XML Array com at\\u00e9 10 CPFs/CNPJs\",\"x-documented-condition\":\"CPF/CNPJ autorizados a baixar o XML Array com at\\u00e9 10 CPFs/CNPJs\",\"x-documented-size\":\"- - -\"}");
 public EmitterIssueNfcomPayloadAutorizarDownload(JsonNode node) { super(node); }
 private static final JsonNode VARIANT_0 = SCHEMA.path("anyOf").path(0);
 public static EmitterIssueNfcomPayloadAutorizarDownload ofVariant0(java.util.List<String> value) { return new EmitterIssueNfcomPayloadAutorizarDownload(array(value, v -> Json.scalar(v))); }
 public boolean matchesVariant0() { return matchesVariant("api2/nfcom-issuance.openapi.json", SCHEMA, VARIANT_0); }
 public java.util.List<String> asVariant0() { JsonNode value = checkedVariant("api2/nfcom-issuance.openapi.json", SCHEMA, VARIANT_0); return list(value, v -> stringValue(v)); }
 private static final JsonNode VARIANT_1 = SCHEMA.path("anyOf").path(1);
 public static EmitterIssueNfcomPayloadAutorizarDownload ofVariant1(JsonValue value) { return new EmitterIssueNfcomPayloadAutorizarDownload(value == null ? null : value.toJson()); }
 public boolean matchesVariant1() { return matchesVariant("api2/nfcom-issuance.openapi.json", SCHEMA, VARIANT_1); }
 public JsonValue asVariant1() { JsonNode value = checkedVariant("api2/nfcom-issuance.openapi.json", SCHEMA, VARIANT_1); return (value).isNull() || (value).isMissingNode() ? null : new JsonValue(value); }
}
