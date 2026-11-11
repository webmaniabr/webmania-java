package com.webmania.sdk.model.api2cteissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/cte-issuance.openapi.json; see contract-provenance.json. */
public final class EmitterConfirmCteDeliveryRequest extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("body");
 public EmitterConfirmCteDeliveryRequest() { super(FIELDS); }
 public EmitterConfirmCteDeliveryRequest(JsonNode node) { super(node, FIELDS); }
 public EmitterConfirmCteDeliveryPayload getBody() { return (field("body")).isNull() || (field("body")).isMissingNode() ? null : new EmitterConfirmCteDeliveryPayload(field("body")); }
 public EmitterConfirmCteDeliveryRequest setBody(EmitterConfirmCteDeliveryPayload value) { put("body", value == null ? null : value.toJson()); return this; }
}
