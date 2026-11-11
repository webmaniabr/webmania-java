package com.webmania.sdk.model.api2nfcomissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/nfcom-issuance.openapi.json; see contract-provenance.json. */
public final class EmitterIssueNfcomRequest extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("body");
 public EmitterIssueNfcomRequest() { super(FIELDS); }
 public EmitterIssueNfcomRequest(JsonNode node) { super(node, FIELDS); }
 public EmitterIssueNfcomPayload getBody() { return (field("body")).isNull() || (field("body")).isMissingNode() ? null : new EmitterIssueNfcomPayload(field("body")); }
 public EmitterIssueNfcomRequest setBody(EmitterIssueNfcomPayload value) { put("body", value == null ? null : value.toJson()); return this; }
}
