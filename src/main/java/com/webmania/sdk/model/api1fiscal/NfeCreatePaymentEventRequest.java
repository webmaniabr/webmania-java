package com.webmania.sdk.model.api1fiscal;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api1/fiscal.openapi.json; see contract-provenance.json. */
public final class NfeCreatePaymentEventRequest extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("body");
 public NfeCreatePaymentEventRequest() { super(FIELDS); }
 public NfeCreatePaymentEventRequest(JsonNode node) { super(node, FIELDS); }
 public NfePaymentEventRequest getBody() { return (field("body")).isNull() || (field("body")).isMissingNode() ? null : new NfePaymentEventRequest(field("body")); }
 public NfeCreatePaymentEventRequest setBody(NfePaymentEventRequest value) { put("body", value == null ? null : value.toJson()); return this; }
}
