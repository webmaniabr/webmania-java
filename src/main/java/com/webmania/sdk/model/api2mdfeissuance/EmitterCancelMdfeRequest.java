package com.webmania.sdk.model.api2mdfeissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/mdfe-issuance.openapi.json; see contract-provenance.json. */
public final class EmitterCancelMdfeRequest extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("body");
 public EmitterCancelMdfeRequest() { super(FIELDS); }
 public EmitterCancelMdfeRequest(JsonNode node) { super(node, FIELDS); }
 public EmitterCancelMdfePayload getBody() { return (field("body")).isNull() || (field("body")).isMissingNode() ? null : new EmitterCancelMdfePayload(field("body")); }
 public EmitterCancelMdfeRequest setBody(EmitterCancelMdfePayload value) { put("body", value == null ? null : value.toJson()); return this; }
}
