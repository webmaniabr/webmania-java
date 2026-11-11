package com.webmania.sdk.model.api2nfcomissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/nfcom-issuance.openapi.json; see contract-provenance.json. */
public final class EmitterIssueNfcomPayloadPgtoVinc extends JsonValue {
 private static final JsonNode SCHEMA = Json.parse("{\"anyOf\":[{\"type\":\"object\",\"properties\":{\"pagamentos\":{\"type\":\"array\",\"items\":{\"type\":\"object\",\"properties\":{\"cnpj_base_psp\":{\"type\":\"string\",\"minLength\":8,\"maxLength\":8,\"pattern\":\"^[A-Za-z0-9]{8}$\",\"x-conditional-rules\":[\"A server-side conditional or current catalog constraint also applies; this draft does not replace it.\"]},\"cnpj_receb\":{\"type\":\"string\",\"minLength\":14,\"maxLength\":14,\"pattern\":\"^[A-Za-z0-9]{12}[0-9]{2}$\",\"x-conditional-rules\":[\"A server-side conditional or current catalog constraint also applies; this draft does not replace it.\"]},\"id_transacao\":{\"type\":\"string\",\"minLength\":2,\"maxLength\":35},\"n_pag\":{\"type\":[\"integer\",\"string\"],\"pattern\":\"^-?\\\\d+$\",\"minimum\":1,\"x-sdk-numeric-minimum\":\"1\",\"maximum\":990,\"x-sdk-numeric-maximum\":\"990\"},\"tp_meio_pgto\":{\"type\":\"string\",\"x-conditional-rules\":[\"A server-side conditional or current catalog constraint also applies; this draft does not replace it.\"]}},\"additionalProperties\":true,\"required\":[\"cnpj_base_psp\",\"cnpj_receb\",\"id_transacao\",\"n_pag\",\"tp_meio_pgto\"]},\"minItems\":1,\"maxItems\":99,\"x-conditional-rules\":[\"required_with:pgto_vinc\"]}},\"additionalProperties\":true},{\"type\":\"null\"}]}");
 public EmitterIssueNfcomPayloadPgtoVinc(JsonNode node) { super(node); }
 private static final JsonNode VARIANT_0 = SCHEMA.path("anyOf").path(0);
 public static EmitterIssueNfcomPayloadPgtoVinc ofVariant0(EmitterIssueNfcomPayloadPgtoVincVariant0 value) { return new EmitterIssueNfcomPayloadPgtoVinc(value == null ? null : value.toJson()); }
 public boolean matchesVariant0() { return matchesVariant("api2/nfcom-issuance.openapi.json", SCHEMA, VARIANT_0); }
 public EmitterIssueNfcomPayloadPgtoVincVariant0 asVariant0() { JsonNode value = checkedVariant("api2/nfcom-issuance.openapi.json", SCHEMA, VARIANT_0); return (value).isNull() || (value).isMissingNode() ? null : new EmitterIssueNfcomPayloadPgtoVincVariant0(value); }
 private static final JsonNode VARIANT_1 = SCHEMA.path("anyOf").path(1);
 public static EmitterIssueNfcomPayloadPgtoVinc ofVariant1(JsonValue value) { return new EmitterIssueNfcomPayloadPgtoVinc(value == null ? null : value.toJson()); }
 public boolean matchesVariant1() { return matchesVariant("api2/nfcom-issuance.openapi.json", SCHEMA, VARIANT_1); }
 public JsonValue asVariant1() { JsonNode value = checkedVariant("api2/nfcom-issuance.openapi.json", SCHEMA, VARIANT_1); return (value).isNull() || (value).isMissingNode() ? null : new JsonValue(value); }
}
