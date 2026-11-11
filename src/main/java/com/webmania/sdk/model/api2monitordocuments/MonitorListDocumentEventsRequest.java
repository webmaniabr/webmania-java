package com.webmania.sdk.model.api2monitordocuments;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/monitor-documents.openapi.json; see contract-provenance.json. */
public final class MonitorListDocumentEventsRequest extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("fd");
 public MonitorListDocumentEventsRequest() { super(FIELDS); }
 public MonitorListDocumentEventsRequest(JsonNode node) { super(node, FIELDS); }
 public String getFd() { return stringValue(field("fd")); }
 public MonitorListDocumentEventsRequest setFd(String value) { put("fd", Json.scalar(value)); return this; }
}
