package com.webmania.sdk.model.api1fiscal;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api1/fiscal.openapi.json; see contract-provenance.json. */
public final class NfeIssueReturnRequest extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("body");
 public NfeIssueReturnRequest() { super(FIELDS); }
 public NfeIssueReturnRequest(JsonNode node) { super(node, FIELDS); }
 public NfeReturnRequest getBody() { return (field("body")).isNull() || (field("body")).isMissingNode() ? null : new NfeReturnRequest(field("body")); }
 public NfeIssueReturnRequest setBody(NfeReturnRequest value) { put("body", value == null ? null : value.toJson()); return this; }
}
