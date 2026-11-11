package com.webmania.sdk.model.api1fiscal;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api1/fiscal.openapi.json; see contract-provenance.json. */
public final class NfeCancelIbsCbsEventRequest extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("body");
 public NfeCancelIbsCbsEventRequest() { super(FIELDS); }
 public NfeCancelIbsCbsEventRequest(JsonNode node) { super(node, FIELDS); }
 public NfeIbsCbsEventCancelRequest getBody() { return (field("body")).isNull() || (field("body")).isMissingNode() ? null : new NfeIbsCbsEventCancelRequest(field("body")); }
 public NfeCancelIbsCbsEventRequest setBody(NfeIbsCbsEventCancelRequest value) { put("body", value == null ? null : value.toJson()); return this; }
}
