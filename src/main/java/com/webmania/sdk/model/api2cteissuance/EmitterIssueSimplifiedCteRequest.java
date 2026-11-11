package com.webmania.sdk.model.api2cteissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/cte-issuance.openapi.json; see contract-provenance.json. */
public final class EmitterIssueSimplifiedCteRequest extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("body");
 public EmitterIssueSimplifiedCteRequest() { super(FIELDS); }
 public EmitterIssueSimplifiedCteRequest(JsonNode node) { super(node, FIELDS); }
 public EmitterIssueSimplifiedCtePayload getBody() { return (field("body")).isNull() || (field("body")).isMissingNode() ? null : new EmitterIssueSimplifiedCtePayload(field("body")); }
 public EmitterIssueSimplifiedCteRequest setBody(EmitterIssueSimplifiedCtePayload value) { put("body", value == null ? null : value.toJson()); return this; }
}
