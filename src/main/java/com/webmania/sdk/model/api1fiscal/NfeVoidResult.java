package com.webmania.sdk.model.api1fiscal;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api1/fiscal.openapi.json; see contract-provenance.json. */
public final class NfeVoidResult extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("xml", "log");
 public NfeVoidResult() { super(FIELDS); }
 public NfeVoidResult(JsonNode node) { super(node, FIELDS); }
 public String getXml() { return stringValue(field("xml")); }
 public NfeVoidResult setXml(String value) { put("xml", Json.scalar(value)); return this; }
 public NfeVoidResultLog getLog() { return (field("log")).isNull() || (field("log")).isMissingNode() ? null : new NfeVoidResultLog(field("log")); }
 public NfeVoidResult setLog(NfeVoidResultLog value) { put("log", value == null ? null : value.toJson()); return this; }
}
