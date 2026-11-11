package com.webmania.sdk.model.api2nfcomissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/nfcom-issuance.openapi.json; see contract-provenance.json. */
public final class EmitterCancelNfcomRequest extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("body");
 public EmitterCancelNfcomRequest() { super(FIELDS); }
 public EmitterCancelNfcomRequest(JsonNode node) { super(node, FIELDS); }
 public EmitterCancelNfcomPayload getBody() { return (field("body")).isNull() || (field("body")).isMissingNode() ? null : new EmitterCancelNfcomPayload(field("body")); }
 public EmitterCancelNfcomRequest setBody(EmitterCancelNfcomPayload value) { put("body", value == null ? null : value.toJson()); return this; }
}
