package com.webmania.sdk.model.api2monitordocuments;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/monitor-documents.openapi.json; see contract-provenance.json. */
public final class MonitorListDocumentEventsResponse extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("data");
 public MonitorListDocumentEventsResponse() { super(FIELDS); }
 public MonitorListDocumentEventsResponse(JsonNode node) { super(node, FIELDS); }
 public java.util.List<MonitorEvent> getData() { return list(field("data"), v -> (v).isNull() || (v).isMissingNode() ? null : new MonitorEvent(v)); }
 public MonitorListDocumentEventsResponse setData(java.util.List<MonitorEvent> value) { put("data", array(value, v -> v == null ? null : v.toJson())); return this; }
}
