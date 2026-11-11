package com.webmania.sdk.model.api2cteissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/cte-issuance.openapi.json; see contract-provenance.json. */
public final class EmitterCorrectCteRequest extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("body");
 public EmitterCorrectCteRequest() { super(FIELDS); }
 public EmitterCorrectCteRequest(JsonNode node) { super(node, FIELDS); }
 public EmitterCorrectCtePayload getBody() { return (field("body")).isNull() || (field("body")).isMissingNode() ? null : new EmitterCorrectCtePayload(field("body")); }
 public EmitterCorrectCteRequest setBody(EmitterCorrectCtePayload value) { put("body", value == null ? null : value.toJson()); return this; }
}
