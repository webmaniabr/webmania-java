package com.webmania.sdk.model.api2monitormanagement;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/monitor-management.openapi.json; see contract-provenance.json. */
public final class MonitorDocumentPage extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("data", "meta");
 public MonitorDocumentPage() { super(FIELDS); }
 public MonitorDocumentPage(JsonNode node) { super(node, FIELDS); }
 public java.util.List<MonitorDocument> getData() { return list(field("data"), v -> (v).isNull() || (v).isMissingNode() ? null : new MonitorDocument(v)); }
 public MonitorDocumentPage setData(java.util.List<MonitorDocument> value) { put("data", array(value, v -> v == null ? null : v.toJson())); return this; }
 public MonitorDocumentPageMeta getMeta() { return (field("meta")).isNull() || (field("meta")).isMissingNode() ? null : new MonitorDocumentPageMeta(field("meta")); }
 public MonitorDocumentPage setMeta(MonitorDocumentPageMeta value) { put("meta", value == null ? null : value.toJson()); return this; }
}
