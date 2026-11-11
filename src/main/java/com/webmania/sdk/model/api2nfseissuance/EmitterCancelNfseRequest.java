package com.webmania.sdk.model.api2nfseissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/nfse-issuance.openapi.json; see contract-provenance.json. */
public final class EmitterCancelNfseRequest extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("body");
 public EmitterCancelNfseRequest() { super(FIELDS); }
 public EmitterCancelNfseRequest(JsonNode node) { super(node, FIELDS); }
 public EmitterCancelNfsePayload getBody() { return (field("body")).isNull() || (field("body")).isMissingNode() ? null : new EmitterCancelNfsePayload(field("body")); }
 public EmitterCancelNfseRequest setBody(EmitterCancelNfsePayload value) { put("body", value == null ? null : value.toJson()); return this; }
}
