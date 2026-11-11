package com.webmania.sdk.model.api2cteissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/cte-issuance.openapi.json; see contract-provenance.json. */
public final class EmitterGetCteRequest extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("identifier");
 public EmitterGetCteRequest() { super(FIELDS); }
 public EmitterGetCteRequest(JsonNode node) { super(node, FIELDS); }
 public String getIdentifier() { return stringValue(field("identifier")); }
 public EmitterGetCteRequest setIdentifier(String value) { put("identifier", Json.scalar(value)); return this; }
}
