package com.webmania.sdk.model.api2emitterreads;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/emitter-reads.openapi.json; see contract-provenance.json. */
public final class EmitterFunctionalError extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("error", "message", "status", "configured");
 public EmitterFunctionalError() { super(FIELDS); }
 public EmitterFunctionalError(JsonNode node) { super(node, FIELDS); }
 public String getError() { return stringValue(field("error")); }
 public EmitterFunctionalError setError(String value) { put("error", Json.scalar(value)); return this; }
 public String getMessage() { return stringValue(field("message")); }
 public EmitterFunctionalError setMessage(String value) { put("message", Json.scalar(value)); return this; }
 public Boolean getStatus() { return booleanValue(field("status")); }
 public EmitterFunctionalError setStatus(Boolean value) { put("status", Json.scalar(value)); return this; }
 public Boolean getConfigured() { return booleanValue(field("configured")); }
 public EmitterFunctionalError setConfigured(Boolean value) { put("configured", Json.scalar(value)); return this; }
}
