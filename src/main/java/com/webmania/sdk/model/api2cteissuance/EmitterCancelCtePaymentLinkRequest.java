package com.webmania.sdk.model.api2cteissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/cte-issuance.openapi.json; see contract-provenance.json. */
public final class EmitterCancelCtePaymentLinkRequest extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("body");
 public EmitterCancelCtePaymentLinkRequest() { super(FIELDS); }
 public EmitterCancelCtePaymentLinkRequest(JsonNode node) { super(node, FIELDS); }
 public EmitterCancelCtePaymentLinkPayload getBody() { return (field("body")).isNull() || (field("body")).isMissingNode() ? null : new EmitterCancelCtePaymentLinkPayload(field("body")); }
 public EmitterCancelCtePaymentLinkRequest setBody(EmitterCancelCtePaymentLinkPayload value) { put("body", value == null ? null : value.toJson()); return this; }
}
