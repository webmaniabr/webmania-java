package com.webmania.sdk.model.api2emitterreads;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/emitter-reads.openapi.json; see contract-provenance.json. */
public final class EmitterGetNfcomPaymentEventsRequest extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("identifier");
 public EmitterGetNfcomPaymentEventsRequest() { super(FIELDS); }
 public EmitterGetNfcomPaymentEventsRequest(JsonNode node) { super(node, FIELDS); }
 public String getIdentifier() { return stringValue(field("identifier")); }
 public EmitterGetNfcomPaymentEventsRequest setIdentifier(String value) { put("identifier", Json.scalar(value)); return this; }
}
