package com.webmania.sdk.model.api2nfcomissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/nfcom-issuance.openapi.json; see contract-provenance.json. */
public final class EmitterIssueNfcomPayloadSubstituicaoVariant0NfReferenciadaVariant0Hash115 extends JsonValue {
 private static final JsonNode SCHEMA = Json.parse("{\"anyOf\":[{\"type\":\"string\"},{\"type\":\"null\"}],\"description\":\"Hash do conv\\u00eanio 115 (opcional)\",\"x-documented-condition\":\"Hash do conv\\u00eanio 115 (opcional)\",\"x-documented-size\":\"- - -\"}");
 public EmitterIssueNfcomPayloadSubstituicaoVariant0NfReferenciadaVariant0Hash115(JsonNode node) { super(node); }
 private static final JsonNode VARIANT_0 = SCHEMA.path("anyOf").path(0);
 public static EmitterIssueNfcomPayloadSubstituicaoVariant0NfReferenciadaVariant0Hash115 ofVariant0(String value) { return new EmitterIssueNfcomPayloadSubstituicaoVariant0NfReferenciadaVariant0Hash115(Json.scalar(value)); }
 public boolean matchesVariant0() { return matchesVariant("api2/nfcom-issuance.openapi.json", SCHEMA, VARIANT_0); }
 public String asVariant0() { JsonNode value = checkedVariant("api2/nfcom-issuance.openapi.json", SCHEMA, VARIANT_0); return stringValue(value); }
 private static final JsonNode VARIANT_1 = SCHEMA.path("anyOf").path(1);
 public static EmitterIssueNfcomPayloadSubstituicaoVariant0NfReferenciadaVariant0Hash115 ofVariant1(JsonValue value) { return new EmitterIssueNfcomPayloadSubstituicaoVariant0NfReferenciadaVariant0Hash115(value == null ? null : value.toJson()); }
 public boolean matchesVariant1() { return matchesVariant("api2/nfcom-issuance.openapi.json", SCHEMA, VARIANT_1); }
 public JsonValue asVariant1() { JsonNode value = checkedVariant("api2/nfcom-issuance.openapi.json", SCHEMA, VARIANT_1); return (value).isNull() || (value).isMissingNode() ? null : new JsonValue(value); }
}
