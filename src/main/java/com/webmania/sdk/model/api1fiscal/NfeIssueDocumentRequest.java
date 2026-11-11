package com.webmania.sdk.model.api1fiscal;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api1/fiscal.openapi.json; see contract-provenance.json. */
public final class NfeIssueDocumentRequest extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("body");
 public NfeIssueDocumentRequest() { super(FIELDS); }
 public NfeIssueDocumentRequest(JsonNode node) { super(node, FIELDS); }
 public NfeIssueRequest getBody() { return (field("body")).isNull() || (field("body")).isMissingNode() ? null : new NfeIssueRequest(field("body")); }
 public NfeIssueDocumentRequest setBody(NfeIssueRequest value) { put("body", value == null ? null : value.toJson()); return this; }
}
