package com.webmania.sdk.model.api1fiscal;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api1/fiscal.openapi.json; see contract-provenance.json. */
public final class NfeCancelPaymentEventRequest extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("body");
 public NfeCancelPaymentEventRequest() { super(FIELDS); }
 public NfeCancelPaymentEventRequest(JsonNode node) { super(node, FIELDS); }
 public NfePaymentEventCancelRequest getBody() { return (field("body")).isNull() || (field("body")).isMissingNode() ? null : new NfePaymentEventCancelRequest(field("body")); }
 public NfeCancelPaymentEventRequest setBody(NfePaymentEventCancelRequest value) { put("body", value == null ? null : value.toJson()); return this; }
}
