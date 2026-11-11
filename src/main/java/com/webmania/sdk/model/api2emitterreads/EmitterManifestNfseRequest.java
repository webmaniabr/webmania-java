package com.webmania.sdk.model.api2emitterreads;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/emitter-reads.openapi.json; see contract-provenance.json. */
public final class EmitterManifestNfseRequest extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("body");
 public EmitterManifestNfseRequest() { super(FIELDS); }
 public EmitterManifestNfseRequest(JsonNode node) { super(node, FIELDS); }
 public NfseManifestationRequest getBody() { return (field("body")).isNull() || (field("body")).isMissingNode() ? null : new NfseManifestationRequest(field("body")); }
 public EmitterManifestNfseRequest setBody(NfseManifestationRequest value) { put("body", value == null ? null : value.toJson()); return this; }
}
