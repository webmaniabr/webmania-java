package com.webmania.sdk.model.api2monitormanagement;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/monitor-management.openapi.json; see contract-provenance.json. */
public final class MonitorReportPage extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("data", "meta");
 public MonitorReportPage() { super(FIELDS); }
 public MonitorReportPage(JsonNode node) { super(node, FIELDS); }
 public java.util.List<MonitorReport> getData() { return list(field("data"), v -> (v).isNull() || (v).isMissingNode() ? null : new MonitorReport(v)); }
 public MonitorReportPage setData(java.util.List<MonitorReport> value) { put("data", array(value, v -> v == null ? null : v.toJson())); return this; }
 public MonitorPagination getMeta() { return (field("meta")).isNull() || (field("meta")).isMissingNode() ? null : new MonitorPagination(field("meta")); }
 public MonitorReportPage setMeta(MonitorPagination value) { put("meta", value == null ? null : value.toJson()); return this; }
}
