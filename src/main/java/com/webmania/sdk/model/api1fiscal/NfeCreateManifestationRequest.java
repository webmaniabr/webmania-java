package com.webmania.sdk.model.api1fiscal;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api1/fiscal.openapi.json; see contract-provenance.json. */
public final class NfeCreateManifestationRequest extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("body");
 public NfeCreateManifestationRequest() { super(FIELDS); }
 public NfeCreateManifestationRequest(JsonNode node) { super(node, FIELDS); }
 public NfeManifestationRequest getBody() { return (field("body")).isNull() || (field("body")).isMissingNode() ? null : new NfeManifestationRequest(field("body")); }
 public NfeCreateManifestationRequest setBody(NfeManifestationRequest value) { put("body", value == null ? null : value.toJson()); return this; }
}
