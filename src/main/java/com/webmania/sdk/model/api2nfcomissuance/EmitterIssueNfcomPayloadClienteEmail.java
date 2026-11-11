package com.webmania.sdk.model.api2nfcomissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/nfcom-issuance.openapi.json; see contract-provenance.json. */
public final class EmitterIssueNfcomPayloadClienteEmail extends JsonValue {
 private static final JsonNode SCHEMA = Json.parse("{\"anyOf\":[{\"anyOf\":[{\"type\":\"array\",\"items\":{\"type\":\"string\",\"format\":\"email\"}},{\"type\":\"null\"}],\"description\":\"Endere\\u00e7o de e-mail Pode ser string ou array de strings para m\\u00faltiplos e-mails\",\"x-documented-condition\":\"Endere\\u00e7o de e-mail Pode ser string ou array de strings para m\\u00faltiplos e-mails\",\"x-documented-size\":\"- - -\"},{\"type\":\"string\",\"format\":\"email\"}]}");
 public EmitterIssueNfcomPayloadClienteEmail(JsonNode node) { super(node); }
 private static final JsonNode VARIANT_0 = SCHEMA.path("anyOf").path(0);
 public static EmitterIssueNfcomPayloadClienteEmail ofVariant0(EmitterIssueNfcomPayloadClienteEmailVariant0 value) { return new EmitterIssueNfcomPayloadClienteEmail(value == null ? null : value.toJson()); }
 public boolean matchesVariant0() { return matchesVariant("api2/nfcom-issuance.openapi.json", SCHEMA, VARIANT_0); }
 public EmitterIssueNfcomPayloadClienteEmailVariant0 asVariant0() { JsonNode value = checkedVariant("api2/nfcom-issuance.openapi.json", SCHEMA, VARIANT_0); return (value).isNull() || (value).isMissingNode() ? null : new EmitterIssueNfcomPayloadClienteEmailVariant0(value); }
 private static final JsonNode VARIANT_1 = SCHEMA.path("anyOf").path(1);
 public static EmitterIssueNfcomPayloadClienteEmail ofVariant1(String value) { return new EmitterIssueNfcomPayloadClienteEmail(Json.scalar(value)); }
 public boolean matchesVariant1() { return matchesVariant("api2/nfcom-issuance.openapi.json", SCHEMA, VARIANT_1); }
 public String asVariant1() { JsonNode value = checkedVariant("api2/nfcom-issuance.openapi.json", SCHEMA, VARIANT_1); return stringValue(value); }
}
