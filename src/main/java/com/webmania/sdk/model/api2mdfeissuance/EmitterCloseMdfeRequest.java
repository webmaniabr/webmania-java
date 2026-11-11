package com.webmania.sdk.model.api2mdfeissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/mdfe-issuance.openapi.json; see contract-provenance.json. */
public final class EmitterCloseMdfeRequest extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("body");
 public EmitterCloseMdfeRequest() { super(FIELDS); }
 public EmitterCloseMdfeRequest(JsonNode node) { super(node, FIELDS); }
 public EmitterCloseMdfePayload getBody() { return (field("body")).isNull() || (field("body")).isMissingNode() ? null : new EmitterCloseMdfePayload(field("body")); }
 public EmitterCloseMdfeRequest setBody(EmitterCloseMdfePayload value) { put("body", value == null ? null : value.toJson()); return this; }
}
