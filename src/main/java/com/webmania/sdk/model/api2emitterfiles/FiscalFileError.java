package com.webmania.sdk.model.api2emitterfiles;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/emitter-files.openapi.json; see contract-provenance.json. */
public final class FiscalFileError extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("error", "message", "msg");
 public FiscalFileError() { super(FIELDS); }
 public FiscalFileError(JsonNode node) { super(node, FIELDS); }
 public JsonValue getError() { return (field("error")).isNull() || (field("error")).isMissingNode() ? null : new JsonValue(field("error")); }
 public FiscalFileError setError(JsonValue value) { put("error", value == null ? null : value.toJson()); return this; }
 public String getMessage() { return stringValue(field("message")); }
 public FiscalFileError setMessage(String value) { put("message", Json.scalar(value)); return this; }
 public String getMsg() { return stringValue(field("msg")); }
 public FiscalFileError setMsg(String value) { put("msg", Json.scalar(value)); return this; }
}
