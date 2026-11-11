package com.webmania.sdk.model.api1fiscal;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api1/fiscal.openapi.json; see contract-provenance.json. */
public final class NfeIssueComplementRequest extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("body");
 public NfeIssueComplementRequest() { super(FIELDS); }
 public NfeIssueComplementRequest(JsonNode node) { super(node, FIELDS); }
 public NfeComplementRequest getBody() { return (field("body")).isNull() || (field("body")).isMissingNode() ? null : new NfeComplementRequest(field("body")); }
 public NfeIssueComplementRequest setBody(NfeComplementRequest value) { put("body", value == null ? null : value.toJson()); return this; }
}
