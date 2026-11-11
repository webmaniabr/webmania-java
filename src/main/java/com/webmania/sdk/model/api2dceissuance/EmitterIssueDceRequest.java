package com.webmania.sdk.model.api2dceissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/dce-issuance.openapi.json; see contract-provenance.json. */
public final class EmitterIssueDceRequest extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("body");
 public EmitterIssueDceRequest() { super(FIELDS); }
 public EmitterIssueDceRequest(JsonNode node) { super(node, FIELDS); }
 public EmitterIssueDcePayload getBody() { return (field("body")).isNull() || (field("body")).isMissingNode() ? null : new EmitterIssueDcePayload(field("body")); }
 public EmitterIssueDceRequest setBody(EmitterIssueDcePayload value) { put("body", value == null ? null : value.toJson()); return this; }
}
