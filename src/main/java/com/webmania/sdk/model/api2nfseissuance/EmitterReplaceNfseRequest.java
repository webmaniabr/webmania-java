package com.webmania.sdk.model.api2nfseissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/nfse-issuance.openapi.json; see contract-provenance.json. */
public final class EmitterReplaceNfseRequest extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("body");
 public EmitterReplaceNfseRequest() { super(FIELDS); }
 public EmitterReplaceNfseRequest(JsonNode node) { super(node, FIELDS); }
 public EmitterReplaceNfsePayload getBody() { return (field("body")).isNull() || (field("body")).isMissingNode() ? null : new EmitterReplaceNfsePayload(field("body")); }
 public EmitterReplaceNfseRequest setBody(EmitterReplaceNfsePayload value) { put("body", value == null ? null : value.toJson()); return this; }
}
