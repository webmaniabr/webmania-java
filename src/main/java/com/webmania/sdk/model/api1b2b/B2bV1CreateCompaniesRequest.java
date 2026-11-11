package com.webmania.sdk.model.api1b2b;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api1/b2b.openapi.json; see contract-provenance.json. */
public final class B2bV1CreateCompaniesRequest extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("body");
 public B2bV1CreateCompaniesRequest() { super(FIELDS); }
 public B2bV1CreateCompaniesRequest(JsonNode node) { super(node, FIELDS); }
 public ResellerCreateCompaniesRequest getBody() { return (field("body")).isNull() || (field("body")).isMissingNode() ? null : new ResellerCreateCompaniesRequest(field("body")); }
 public B2bV1CreateCompaniesRequest setBody(ResellerCreateCompaniesRequest value) { put("body", value == null ? null : value.toJson()); return this; }
}
