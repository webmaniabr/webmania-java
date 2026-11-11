package com.webmania.sdk.model.api2cteissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/cte-issuance.openapi.json; see contract-provenance.json. */
public final class EmitterCancelCteDeliveryRequest extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("body");
 public EmitterCancelCteDeliveryRequest() { super(FIELDS); }
 public EmitterCancelCteDeliveryRequest(JsonNode node) { super(node, FIELDS); }
 public EmitterCancelCteDeliveryPayload getBody() { return (field("body")).isNull() || (field("body")).isMissingNode() ? null : new EmitterCancelCteDeliveryPayload(field("body")); }
 public EmitterCancelCteDeliveryRequest setBody(EmitterCancelCteDeliveryPayload value) { put("body", value == null ? null : value.toJson()); return this; }
}
