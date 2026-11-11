package com.webmania.sdk.model.api2nfcomissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/nfcom-issuance.openapi.json; see contract-provenance.json. */
public final class EmitterIssueNfcomPayloadClienteEmailVariant0 extends JsonValue {
 private static final JsonNode SCHEMA = Json.parse("{\"anyOf\":[{\"type\":\"array\",\"items\":{\"type\":\"string\",\"format\":\"email\"}},{\"type\":\"null\"}],\"description\":\"Endere\\u00e7o de e-mail Pode ser string ou array de strings para m\\u00faltiplos e-mails\",\"x-documented-condition\":\"Endere\\u00e7o de e-mail Pode ser string ou array de strings para m\\u00faltiplos e-mails\",\"x-documented-size\":\"- - -\"}");
 public EmitterIssueNfcomPayloadClienteEmailVariant0(JsonNode node) { super(node); }
 private static final JsonNode VARIANT_0 = SCHEMA.path("anyOf").path(0);
 public static EmitterIssueNfcomPayloadClienteEmailVariant0 ofVariant0(java.util.List<String> value) { return new EmitterIssueNfcomPayloadClienteEmailVariant0(array(value, v -> Json.scalar(v))); }
 public boolean matchesVariant0() { return matchesVariant("api2/nfcom-issuance.openapi.json", SCHEMA, VARIANT_0); }
 public java.util.List<String> asVariant0() { JsonNode value = checkedVariant("api2/nfcom-issuance.openapi.json", SCHEMA, VARIANT_0); return list(value, v -> stringValue(v)); }
 private static final JsonNode VARIANT_1 = SCHEMA.path("anyOf").path(1);
 public static EmitterIssueNfcomPayloadClienteEmailVariant0 ofVariant1(JsonValue value) { return new EmitterIssueNfcomPayloadClienteEmailVariant0(value == null ? null : value.toJson()); }
 public boolean matchesVariant1() { return matchesVariant("api2/nfcom-issuance.openapi.json", SCHEMA, VARIANT_1); }
 public JsonValue asVariant1() { JsonNode value = checkedVariant("api2/nfcom-issuance.openapi.json", SCHEMA, VARIANT_1); return (value).isNull() || (value).isMissingNode() ? null : new JsonValue(value); }
}
