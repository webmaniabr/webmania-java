package com.webmania.sdk.model.api1b2b;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api1/b2b.openapi.json; see contract-provenance.json. */
public final class B2bFunctionalError extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("error", "message", "success");
 public B2bFunctionalError() { super(FIELDS); }
 public B2bFunctionalError(JsonNode node) { super(node, FIELDS); }
 public JsonValue getError() { return (field("error")).isNull() || (field("error")).isMissingNode() ? null : new JsonValue(field("error")); }
 public B2bFunctionalError setError(JsonValue value) { put("error", value == null ? null : value.toJson()); return this; }
 public String getMessage() { return stringValue(field("message")); }
 public B2bFunctionalError setMessage(String value) { put("message", Json.scalar(value)); return this; }
 public Boolean getSuccess() { return booleanValue(field("success")); }
 public B2bFunctionalError setSuccess(Boolean value) { put("success", Json.scalar(value)); return this; }
}
