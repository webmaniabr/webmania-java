package com.webmania.sdk.model.api2nfcomissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/nfcom-issuance.openapi.json; see contract-provenance.json. */
public final class EmitterIssueNfcomPayloadImpostosVariant0IbsCbsVariant0CompraGovernamentalVariant0DocumentosReferenciados extends JsonValue {
 private static final JsonNode SCHEMA = Json.parse("{\"anyOf\":[{\"type\":\"array\",\"items\":{\"type\":[\"string\",\"number\"],\"pattern\":\"^[0-9]{6}[A-Za-z0-9]{12}[0-9]{26}$\",\"x-conditional-rules\":[\"A server-side conditional or current catalog constraint also applies; this draft does not replace it.\"]}},{\"type\":\"null\"}]}");
 public EmitterIssueNfcomPayloadImpostosVariant0IbsCbsVariant0CompraGovernamentalVariant0DocumentosReferenciados(JsonNode node) { super(node); }
 private static final JsonNode VARIANT_0 = SCHEMA.path("anyOf").path(0);
 public static EmitterIssueNfcomPayloadImpostosVariant0IbsCbsVariant0CompraGovernamentalVariant0DocumentosReferenciados ofVariant0(java.util.List<EmitterIssueNfcomPayloadImpostosVariant0IbsCbsVariant0CompraGovernamentalVariant0DocumentosReferenciadosVariant0Item> value) { return new EmitterIssueNfcomPayloadImpostosVariant0IbsCbsVariant0CompraGovernamentalVariant0DocumentosReferenciados(array(value, v -> v == null ? null : v.toJson())); }
 public boolean matchesVariant0() { return matchesVariant("api2/nfcom-issuance.openapi.json", SCHEMA, VARIANT_0); }
 public java.util.List<EmitterIssueNfcomPayloadImpostosVariant0IbsCbsVariant0CompraGovernamentalVariant0DocumentosReferenciadosVariant0Item> asVariant0() { JsonNode value = checkedVariant("api2/nfcom-issuance.openapi.json", SCHEMA, VARIANT_0); return list(value, v -> (v).isNull() || (v).isMissingNode() ? null : new EmitterIssueNfcomPayloadImpostosVariant0IbsCbsVariant0CompraGovernamentalVariant0DocumentosReferenciadosVariant0Item(v)); }
 private static final JsonNode VARIANT_1 = SCHEMA.path("anyOf").path(1);
 public static EmitterIssueNfcomPayloadImpostosVariant0IbsCbsVariant0CompraGovernamentalVariant0DocumentosReferenciados ofVariant1(JsonValue value) { return new EmitterIssueNfcomPayloadImpostosVariant0IbsCbsVariant0CompraGovernamentalVariant0DocumentosReferenciados(value == null ? null : value.toJson()); }
 public boolean matchesVariant1() { return matchesVariant("api2/nfcom-issuance.openapi.json", SCHEMA, VARIANT_1); }
 public JsonValue asVariant1() { JsonNode value = checkedVariant("api2/nfcom-issuance.openapi.json", SCHEMA, VARIANT_1); return (value).isNull() || (value).isMissingNode() ? null : new JsonValue(value); }
}
