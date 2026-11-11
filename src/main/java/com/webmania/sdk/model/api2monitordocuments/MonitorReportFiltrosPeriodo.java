package com.webmania.sdk.model.api2monitordocuments;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/monitor-documents.openapi.json; see contract-provenance.json. */
public final class MonitorReportFiltrosPeriodo extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("de", "ate");
 public MonitorReportFiltrosPeriodo() { super(FIELDS); }
 public MonitorReportFiltrosPeriodo(JsonNode node) { super(node, FIELDS); }
 public String getDe() { return stringValue(field("de")); }
 public MonitorReportFiltrosPeriodo setDe(String value) { put("de", Json.scalar(value)); return this; }
 public String getAte() { return stringValue(field("ate")); }
 public MonitorReportFiltrosPeriodo setAte(String value) { put("ate", Json.scalar(value)); return this; }
}
