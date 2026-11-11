package com.webmania.sdk.model.api2cteissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/cte-issuance.openapi.json; see contract-provenance.json. */
public final class EmitterCancelCteRequest extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("body");
 public EmitterCancelCteRequest() { super(FIELDS); }
 public EmitterCancelCteRequest(JsonNode node) { super(node, FIELDS); }
 public EmitterCancelCtePayload getBody() { return (field("body")).isNull() || (field("body")).isMissingNode() ? null : new EmitterCancelCtePayload(field("body")); }
 public EmitterCancelCteRequest setBody(EmitterCancelCtePayload value) { put("body", value == null ? null : value.toJson()); return this; }
}
