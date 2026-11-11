package com.webmania.sdk.model.api1b2b;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api1/b2b.openapi.json; see contract-provenance.json. */
public final class ResellerCompanies extends JsonValue {
 private static final JsonNode SCHEMA = Json.parse("{\"type\":\"array\",\"items\":{\"$ref\":\"#/components/schemas/ResellerCompany\"}}");
 public ResellerCompanies(JsonNode node) { super(node); }
 private static final JsonNode VARIANT_0 = Json.parse("{\"type\":\"array\",\"items\":{\"$ref\":\"#/components/schemas/ResellerCompany\"}}");
 public static ResellerCompanies ofVariant0(java.util.List<ResellerCompany> value) { return new ResellerCompanies(array(value, v -> v == null ? null : v.toJson())); }
 public boolean matchesVariant0() { return matchesVariant("api1/b2b.openapi.json", SCHEMA, VARIANT_0); }
 public java.util.List<ResellerCompany> asVariant0() { JsonNode value = checkedVariant("api1/b2b.openapi.json", SCHEMA, VARIANT_0); return list(value, v -> (v).isNull() || (v).isMissingNode() ? null : new ResellerCompany(v)); }
}
