package com.webmania.sdk.model.api2monitordocuments;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/monitor-documents.openapi.json; see contract-provenance.json. */
public final class MonitorError extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("error", "message", "msg", "success");
 public MonitorError() { super(FIELDS); }
 public MonitorError(JsonNode node) { super(node, FIELDS); }
 public String getError() { return stringValue(field("error")); }
 public MonitorError setError(String value) { put("error", Json.scalar(value)); return this; }
 public String getMessage() { return stringValue(field("message")); }
 public MonitorError setMessage(String value) { put("message", Json.scalar(value)); return this; }
 public String getMsg() { return stringValue(field("msg")); }
 public MonitorError setMsg(String value) { put("msg", Json.scalar(value)); return this; }
 public Boolean getSuccess() { return booleanValue(field("success")); }
 public MonitorError setSuccess(Boolean value) { put("success", Json.scalar(value)); return this; }
}
