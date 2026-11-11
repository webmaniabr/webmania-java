package com.webmania.sdk.model.api1fiscal;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api1/fiscal.openapi.json; see contract-provenance.json. */
public final class NfeDeleteTaxClassesRequest extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("body");
 public NfeDeleteTaxClassesRequest() { super(FIELDS); }
 public NfeDeleteTaxClassesRequest(JsonNode node) { super(node, FIELDS); }
 public TaxClassDeleteRequest getBody() { return (field("body")).isNull() || (field("body")).isMissingNode() ? null : new TaxClassDeleteRequest(field("body")); }
 public NfeDeleteTaxClassesRequest setBody(TaxClassDeleteRequest value) { put("body", value == null ? null : value.toJson()); return this; }
}
