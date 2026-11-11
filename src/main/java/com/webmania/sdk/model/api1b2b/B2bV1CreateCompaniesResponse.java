package com.webmania.sdk.model.api1b2b;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api1/b2b.openapi.json; see contract-provenance.json. */
public final class B2bV1CreateCompaniesResponse extends JsonValue {
 private static final JsonNode SCHEMA = Json.parse("{\"anyOf\":[{\"$ref\":\"#/components/schemas/ResellerCreatedCompanies\"},{\"$ref\":\"#/components/schemas/B2bFunctionalError\"}]}");
 public B2bV1CreateCompaniesResponse(JsonNode node) { super(node); }
 private static final JsonNode VARIANT_0 = SCHEMA.path("anyOf").path(0);
 public static B2bV1CreateCompaniesResponse ofVariant0(ResellerCreatedCompanies value) { return new B2bV1CreateCompaniesResponse(value == null ? null : value.toJson()); }
 public boolean matchesVariant0() { return matchesVariant("api1/b2b.openapi.json", SCHEMA, VARIANT_0); }
 public ResellerCreatedCompanies asVariant0() { JsonNode value = checkedVariant("api1/b2b.openapi.json", SCHEMA, VARIANT_0); return (value).isNull() || (value).isMissingNode() ? null : new ResellerCreatedCompanies(value); }
 private static final JsonNode VARIANT_1 = SCHEMA.path("anyOf").path(1);
 public static B2bV1CreateCompaniesResponse ofVariant1(B2bFunctionalError value) { return new B2bV1CreateCompaniesResponse(value == null ? null : value.toJson()); }
 public boolean matchesVariant1() { return matchesVariant("api1/b2b.openapi.json", SCHEMA, VARIANT_1); }
 public B2bFunctionalError asVariant1() { JsonNode value = checkedVariant("api1/b2b.openapi.json", SCHEMA, VARIANT_1); return (value).isNull() || (value).isMissingNode() ? null : new B2bFunctionalError(value); }
}
