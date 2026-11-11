package com.webmania.sdk.model.api1fiscal;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api1/fiscal.openapi.json; see contract-provenance.json. */
public final class Nfce65IssueRequestNfRuralReferenciada extends JsonValue {
 private static final JsonNode SCHEMA = Json.parse("{\"anyOf\":[{\"$ref\":\"#/components/schemas/G007\"},{\"type\":\"array\",\"items\":{\"$ref\":\"#/components/schemas/G007\"},\"minItems\":1}]}");
 public Nfce65IssueRequestNfRuralReferenciada(JsonNode node) { super(node); }
 private static final JsonNode VARIANT_0 = SCHEMA.path("anyOf").path(0);
 public static Nfce65IssueRequestNfRuralReferenciada ofVariant0(G007 value) { return new Nfce65IssueRequestNfRuralReferenciada(value == null ? null : value.toJson()); }
 public boolean matchesVariant0() { return matchesVariant("api1/fiscal.openapi.json", SCHEMA, VARIANT_0); }
 public G007 asVariant0() { JsonNode value = checkedVariant("api1/fiscal.openapi.json", SCHEMA, VARIANT_0); return (value).isNull() || (value).isMissingNode() ? null : new G007(value); }
 private static final JsonNode VARIANT_1 = SCHEMA.path("anyOf").path(1);
 public static Nfce65IssueRequestNfRuralReferenciada ofVariant1(java.util.List<G007> value) { return new Nfce65IssueRequestNfRuralReferenciada(array(value, v -> v == null ? null : v.toJson())); }
 public boolean matchesVariant1() { return matchesVariant("api1/fiscal.openapi.json", SCHEMA, VARIANT_1); }
 public java.util.List<G007> asVariant1() { JsonNode value = checkedVariant("api1/fiscal.openapi.json", SCHEMA, VARIANT_1); return list(value, v -> (v).isNull() || (v).isMissingNode() ? null : new G007(v)); }
}
