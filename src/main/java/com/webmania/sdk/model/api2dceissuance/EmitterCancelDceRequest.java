package com.webmania.sdk.model.api2dceissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/dce-issuance.openapi.json; see contract-provenance.json. */
public final class EmitterCancelDceRequest extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("body");
 public EmitterCancelDceRequest() { super(FIELDS); }
 public EmitterCancelDceRequest(JsonNode node) { super(node, FIELDS); }
 public EmitterCancelDcePayload getBody() { return (field("body")).isNull() || (field("body")).isMissingNode() ? null : new EmitterCancelDcePayload(field("body")); }
 public EmitterCancelDceRequest setBody(EmitterCancelDcePayload value) { put("body", value == null ? null : value.toJson()); return this; }
}
