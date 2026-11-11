package com.webmania.sdk.model.api1files;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api1/files.openapi.json; see contract-provenance.json. */
public final class Api1Error extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("error", "message", "code", "status", "log");
 public Api1Error() { super(FIELDS); }
 public Api1Error(JsonNode node) { super(node, FIELDS); }
 public Api1ErrorError getError() { return (field("error")).isNull() || (field("error")).isMissingNode() ? null : new Api1ErrorError(field("error")); }
 public Api1Error setError(Api1ErrorError value) { put("error", value == null ? null : value.toJson()); return this; }
 public String getMessage() { return stringValue(field("message")); }
 public Api1Error setMessage(String value) { put("message", Json.scalar(value)); return this; }
 public Api1ErrorCode getCode() { return (field("code")).isNull() || (field("code")).isMissingNode() ? null : new Api1ErrorCode(field("code")); }
 public Api1Error setCode(Api1ErrorCode value) { put("code", value == null ? null : value.toJson()); return this; }
 public String getStatus() { return stringValue(field("status")); }
 public Api1Error setStatus(String value) { put("status", Json.scalar(value)); return this; }
 public Api1ErrorLog getLog() { return (field("log")).isNull() || (field("log")).isMissingNode() ? null : new Api1ErrorLog(field("log")); }
 public Api1Error setLog(Api1ErrorLog value) { put("log", value == null ? null : value.toJson()); return this; }
}
