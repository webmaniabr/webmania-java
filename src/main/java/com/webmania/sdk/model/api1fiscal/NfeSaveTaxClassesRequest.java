package com.webmania.sdk.model.api1fiscal;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api1/fiscal.openapi.json; see contract-provenance.json. */
public final class NfeSaveTaxClassesRequest extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("body");
 public NfeSaveTaxClassesRequest() { super(FIELDS); }
 public NfeSaveTaxClassesRequest(JsonNode node) { super(node, FIELDS); }
 public FiscalTaxClassRequest getBody() { return (field("body")).isNull() || (field("body")).isMissingNode() ? null : new FiscalTaxClassRequest(field("body")); }
 public NfeSaveTaxClassesRequest setBody(FiscalTaxClassRequest value) { put("body", value == null ? null : value.toJson()); return this; }
}
