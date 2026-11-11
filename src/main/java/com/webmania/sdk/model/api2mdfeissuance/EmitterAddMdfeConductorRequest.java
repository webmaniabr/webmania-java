package com.webmania.sdk.model.api2mdfeissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/mdfe-issuance.openapi.json; see contract-provenance.json. */
public final class EmitterAddMdfeConductorRequest extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("body");
 public EmitterAddMdfeConductorRequest() { super(FIELDS); }
 public EmitterAddMdfeConductorRequest(JsonNode node) { super(node, FIELDS); }
 public EmitterAddMdfeConductorPayload getBody() { return (field("body")).isNull() || (field("body")).isMissingNode() ? null : new EmitterAddMdfeConductorPayload(field("body")); }
 public EmitterAddMdfeConductorRequest setBody(EmitterAddMdfeConductorPayload value) { put("body", value == null ? null : value.toJson()); return this; }
}
