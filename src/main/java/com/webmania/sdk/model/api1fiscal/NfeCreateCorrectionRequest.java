package com.webmania.sdk.model.api1fiscal;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api1/fiscal.openapi.json; see contract-provenance.json. */
public final class NfeCreateCorrectionRequest extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("body");
 public NfeCreateCorrectionRequest() { super(FIELDS); }
 public NfeCreateCorrectionRequest(JsonNode node) { super(node, FIELDS); }
 public NfeCorrectionRequest getBody() { return (field("body")).isNull() || (field("body")).isMissingNode() ? null : new NfeCorrectionRequest(field("body")); }
 public NfeCreateCorrectionRequest setBody(NfeCorrectionRequest value) { put("body", value == null ? null : value.toJson()); return this; }
}
