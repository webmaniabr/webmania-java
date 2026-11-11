package com.webmania.sdk.model.api2nfcomissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/nfcom-issuance.openapi.json; see contract-provenance.json. */
public final class EmitterError extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("error", "message", "status", "configured");
 public EmitterError() { super(FIELDS); }
 public EmitterError(JsonNode node) { super(node, FIELDS); }
 public String getError() { return stringValue(field("error")); }
 public EmitterError setError(String value) { put("error", Json.scalar(value)); return this; }
 public String getMessage() { return stringValue(field("message")); }
 public EmitterError setMessage(String value) { put("message", Json.scalar(value)); return this; }
 public Boolean getStatus() { return booleanValue(field("status")); }
 public EmitterError setStatus(Boolean value) { put("status", Json.scalar(value)); return this; }
 public Boolean getConfigured() { return booleanValue(field("configured")); }
 public EmitterError setConfigured(Boolean value) { put("configured", Json.scalar(value)); return this; }
}
