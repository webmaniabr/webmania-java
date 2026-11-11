package com.webmania.sdk.model.api1fiscal;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api1/fiscal.openapi.json; see contract-provenance.json. */
public final class NfeQueryDocumentRequest extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("body");
 public NfeQueryDocumentRequest() { super(FIELDS); }
 public NfeQueryDocumentRequest(JsonNode node) { super(node, FIELDS); }
 public NfeLookupRequest getBody() { return (field("body")).isNull() || (field("body")).isMissingNode() ? null : new NfeLookupRequest(field("body")); }
 public NfeQueryDocumentRequest setBody(NfeLookupRequest value) { put("body", value == null ? null : value.toJson()); return this; }
}
