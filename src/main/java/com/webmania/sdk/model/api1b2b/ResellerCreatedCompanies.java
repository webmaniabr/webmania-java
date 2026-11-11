package com.webmania.sdk.model.api1b2b;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api1/b2b.openapi.json; see contract-provenance.json. */
public final class ResellerCreatedCompanies extends JsonValue {
 private static final JsonNode SCHEMA = Json.parse("{\"type\":\"array\",\"items\":{\"$ref\":\"#/components/schemas/ResellerCreatedCompany\"},\"minItems\":1,\"maxItems\":100}");
 public ResellerCreatedCompanies(JsonNode node) { super(node); }
 private static final JsonNode VARIANT_0 = Json.parse("{\"type\":\"array\",\"items\":{\"$ref\":\"#/components/schemas/ResellerCreatedCompany\"},\"minItems\":1,\"maxItems\":100}");
 public static ResellerCreatedCompanies ofVariant0(java.util.List<ResellerCreatedCompany> value) { return new ResellerCreatedCompanies(array(value, v -> v == null ? null : v.toJson())); }
 public boolean matchesVariant0() { return matchesVariant("api1/b2b.openapi.json", SCHEMA, VARIANT_0); }
 public java.util.List<ResellerCreatedCompany> asVariant0() { JsonNode value = checkedVariant("api1/b2b.openapi.json", SCHEMA, VARIANT_0); return list(value, v -> (v).isNull() || (v).isMissingNode() ? null : new ResellerCreatedCompany(v)); }
}
