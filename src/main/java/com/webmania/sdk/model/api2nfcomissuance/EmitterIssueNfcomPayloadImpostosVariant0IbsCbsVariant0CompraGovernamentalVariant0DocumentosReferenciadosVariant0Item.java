package com.webmania.sdk.model.api2nfcomissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/nfcom-issuance.openapi.json; see contract-provenance.json. */
public final class EmitterIssueNfcomPayloadImpostosVariant0IbsCbsVariant0CompraGovernamentalVariant0DocumentosReferenciadosVariant0Item extends JsonValue {
 private static final JsonNode SCHEMA = Json.parse("{\"type\":[\"string\",\"number\"],\"pattern\":\"^[0-9]{6}[A-Za-z0-9]{12}[0-9]{26}$\",\"x-conditional-rules\":[\"A server-side conditional or current catalog constraint also applies; this draft does not replace it.\"]}");
 public EmitterIssueNfcomPayloadImpostosVariant0IbsCbsVariant0CompraGovernamentalVariant0DocumentosReferenciadosVariant0Item(JsonNode node) { super(node); }
 private static final JsonNode VARIANT_0 = Json.parse("{\"type\":\"string\",\"pattern\":\"^[0-9]{6}[A-Za-z0-9]{12}[0-9]{26}$\",\"x-conditional-rules\":[\"A server-side conditional or current catalog constraint also applies; this draft does not replace it.\"]}");
 public static EmitterIssueNfcomPayloadImpostosVariant0IbsCbsVariant0CompraGovernamentalVariant0DocumentosReferenciadosVariant0Item ofVariant0(String value) { return new EmitterIssueNfcomPayloadImpostosVariant0IbsCbsVariant0CompraGovernamentalVariant0DocumentosReferenciadosVariant0Item(Json.scalar(value)); }
 public boolean matchesVariant0() { return matchesVariant("api2/nfcom-issuance.openapi.json", SCHEMA, VARIANT_0); }
 public String asVariant0() { JsonNode value = checkedVariant("api2/nfcom-issuance.openapi.json", SCHEMA, VARIANT_0); return stringValue(value); }
 private static final JsonNode VARIANT_1 = Json.parse("{\"type\":\"number\",\"pattern\":\"^[0-9]{6}[A-Za-z0-9]{12}[0-9]{26}$\",\"x-conditional-rules\":[\"A server-side conditional or current catalog constraint also applies; this draft does not replace it.\"]}");
 public static EmitterIssueNfcomPayloadImpostosVariant0IbsCbsVariant0CompraGovernamentalVariant0DocumentosReferenciadosVariant0Item ofVariant1(java.math.BigDecimal value) { return new EmitterIssueNfcomPayloadImpostosVariant0IbsCbsVariant0CompraGovernamentalVariant0DocumentosReferenciadosVariant0Item(Json.scalar(value)); }
 public boolean matchesVariant1() { return matchesVariant("api2/nfcom-issuance.openapi.json", SCHEMA, VARIANT_1); }
 public java.math.BigDecimal asVariant1() { JsonNode value = checkedVariant("api2/nfcom-issuance.openapi.json", SCHEMA, VARIANT_1); return decimalValue(value); }
}
