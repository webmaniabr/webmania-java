package com.webmania.sdk.model.api1fiscal;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api1/fiscal.openapi.json; see contract-provenance.json. */
public final class NfeCreateIbsCbsEventRequest extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("body");
 public NfeCreateIbsCbsEventRequest() { super(FIELDS); }
 public NfeCreateIbsCbsEventRequest(JsonNode node) { super(node, FIELDS); }
 public NfeIbsCbsEventRequest getBody() { return (field("body")).isNull() || (field("body")).isMissingNode() ? null : new NfeIbsCbsEventRequest(field("body")); }
 public NfeCreateIbsCbsEventRequest setBody(NfeIbsCbsEventRequest value) { put("body", value == null ? null : value.toJson()); return this; }
}
