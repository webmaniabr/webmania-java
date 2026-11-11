package com.webmania.sdk.model.api1fiscal;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api1/fiscal.openapi.json; see contract-provenance.json. */
public final class NfeVoidNumberingRequest extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("body");
 public NfeVoidNumberingRequest() { super(FIELDS); }
 public NfeVoidNumberingRequest(JsonNode node) { super(node, FIELDS); }
 public NfeVoidRequest getBody() { return (field("body")).isNull() || (field("body")).isMissingNode() ? null : new NfeVoidRequest(field("body")); }
 public NfeVoidNumberingRequest setBody(NfeVoidRequest value) { put("body", value == null ? null : value.toJson()); return this; }
}
