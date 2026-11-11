package com.webmania.sdk.model.api2emitterfiles;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/emitter-files.openapi.json; see contract-provenance.json. */
public final class NfsePdfPending extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("msg");
 public NfsePdfPending() { super(FIELDS); }
 public NfsePdfPending(JsonNode node) { super(node, FIELDS); }
 public String getMsg() { return stringValue(field("msg")); }
 public NfsePdfPending setMsg(String value) { put("msg", Json.scalar(value)); return this; }
}
