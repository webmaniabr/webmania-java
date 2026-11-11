package com.webmania.sdk.model.api2dceissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/dce-issuance.openapi.json; see contract-provenance.json. */
public final class EmitterGetDceRequest extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("identifier");
 public EmitterGetDceRequest() { super(FIELDS); }
 public EmitterGetDceRequest(JsonNode node) { super(node, FIELDS); }
 public String getIdentifier() { return stringValue(field("identifier")); }
 public EmitterGetDceRequest setIdentifier(String value) { put("identifier", Json.scalar(value)); return this; }
}
