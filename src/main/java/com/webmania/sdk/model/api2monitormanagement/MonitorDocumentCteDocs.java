package com.webmania.sdk.model.api2monitormanagement;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/monitor-management.openapi.json; see contract-provenance.json. */
public final class MonitorDocumentCteDocs extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("xml", "pdf");
 public MonitorDocumentCteDocs() { super(FIELDS); }
 public MonitorDocumentCteDocs(JsonNode node) { super(node, FIELDS); }
 public MonitorDocumentCteDocsXml getXml() { return (field("xml")).isNull() || (field("xml")).isMissingNode() ? null : new MonitorDocumentCteDocsXml(field("xml")); }
 public MonitorDocumentCteDocs setXml(MonitorDocumentCteDocsXml value) { put("xml", value == null ? null : value.toJson()); return this; }
 public MonitorDocumentCteDocsPdf getPdf() { return (field("pdf")).isNull() || (field("pdf")).isMissingNode() ? null : new MonitorDocumentCteDocsPdf(field("pdf")); }
 public MonitorDocumentCteDocs setPdf(MonitorDocumentCteDocsPdf value) { put("pdf", value == null ? null : value.toJson()); return this; }
}
