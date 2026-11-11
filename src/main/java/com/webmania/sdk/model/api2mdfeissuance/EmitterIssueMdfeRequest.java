package com.webmania.sdk.model.api2mdfeissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/mdfe-issuance.openapi.json; see contract-provenance.json. */
public final class EmitterIssueMdfeRequest extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("body");
 public EmitterIssueMdfeRequest() { super(FIELDS); }
 public EmitterIssueMdfeRequest(JsonNode node) { super(node, FIELDS); }
 public EmitterIssueMdfePayload getBody() { return (field("body")).isNull() || (field("body")).isMissingNode() ? null : new EmitterIssueMdfePayload(field("body")); }
 public EmitterIssueMdfeRequest setBody(EmitterIssueMdfePayload value) { put("body", value == null ? null : value.toJson()); return this; }
}
