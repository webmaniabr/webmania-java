package com.webmania.sdk.model.api2cteissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/cte-issuance.openapi.json; see contract-provenance.json. */
public final class EmitterIssueCteRequest extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("body");
 public EmitterIssueCteRequest() { super(FIELDS); }
 public EmitterIssueCteRequest(JsonNode node) { super(node, FIELDS); }
 public EmitterIssueCtePayload getBody() { return (field("body")).isNull() || (field("body")).isMissingNode() ? null : new EmitterIssueCtePayload(field("body")); }
 public EmitterIssueCteRequest setBody(EmitterIssueCtePayload value) { put("body", value == null ? null : value.toJson()); return this; }
}
