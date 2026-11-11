package com.webmania.sdk.model.api2monitordocuments;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/monitor-documents.openapi.json; see contract-provenance.json. */
public final class MonitorDownloadReportRequest extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("report");
 public MonitorDownloadReportRequest() { super(FIELDS); }
 public MonitorDownloadReportRequest(JsonNode node) { super(node, FIELDS); }
 public String getReport() { return stringValue(field("report")); }
 public MonitorDownloadReportRequest setReport(String value) { put("report", Json.scalar(value)); return this; }
}
