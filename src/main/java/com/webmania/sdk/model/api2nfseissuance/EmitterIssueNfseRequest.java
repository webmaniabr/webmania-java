package com.webmania.sdk.model.api2nfseissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/nfse-issuance.openapi.json; see contract-provenance.json. */
public final class EmitterIssueNfseRequest extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("body");
 public EmitterIssueNfseRequest() { super(FIELDS); }
 public EmitterIssueNfseRequest(JsonNode node) { super(node, FIELDS); }
 public EmitterIssueNfsePayload getBody() { return (field("body")).isNull() || (field("body")).isMissingNode() ? null : new EmitterIssueNfsePayload(field("body")); }
 public EmitterIssueNfseRequest setBody(EmitterIssueNfsePayload value) { put("body", value == null ? null : value.toJson()); return this; }
}
