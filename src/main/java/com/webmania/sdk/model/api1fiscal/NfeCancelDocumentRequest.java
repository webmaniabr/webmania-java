package com.webmania.sdk.model.api1fiscal;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api1/fiscal.openapi.json; see contract-provenance.json. */
public final class NfeCancelDocumentRequest extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("body");
 public NfeCancelDocumentRequest() { super(FIELDS); }
 public NfeCancelDocumentRequest(JsonNode node) { super(node, FIELDS); }
 public NfeCancelRequest getBody() { return (field("body")).isNull() || (field("body")).isMissingNode() ? null : new NfeCancelRequest(field("body")); }
 public NfeCancelDocumentRequest setBody(NfeCancelRequest value) { put("body", value == null ? null : value.toJson()); return this; }
}
