package com.webmania.sdk.model.api1fiscal;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api1/fiscal.openapi.json; see contract-provenance.json. */
public final class NfeIssueAdjustmentRequest extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("body");
 public NfeIssueAdjustmentRequest() { super(FIELDS); }
 public NfeIssueAdjustmentRequest(JsonNode node) { super(node, FIELDS); }
 public NfeAdjustmentRequest getBody() { return (field("body")).isNull() || (field("body")).isMissingNode() ? null : new NfeAdjustmentRequest(field("body")); }
 public NfeIssueAdjustmentRequest setBody(NfeAdjustmentRequest value) { put("body", value == null ? null : value.toJson()); return this; }
}
