package com.webmania.sdk.model.api2monitormanagement;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/monitor-management.openapi.json; see contract-provenance.json. */
public final class MonitorDocumentCteOsDocs extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("xml", "pdf");
 public MonitorDocumentCteOsDocs() { super(FIELDS); }
 public MonitorDocumentCteOsDocs(JsonNode node) { super(node, FIELDS); }
 public MonitorDocumentCteOsDocsXml getXml() { return (field("xml")).isNull() || (field("xml")).isMissingNode() ? null : new MonitorDocumentCteOsDocsXml(field("xml")); }
 public MonitorDocumentCteOsDocs setXml(MonitorDocumentCteOsDocsXml value) { put("xml", value == null ? null : value.toJson()); return this; }
 public MonitorDocumentCteOsDocsPdf getPdf() { return (field("pdf")).isNull() || (field("pdf")).isMissingNode() ? null : new MonitorDocumentCteOsDocsPdf(field("pdf")); }
 public MonitorDocumentCteOsDocs setPdf(MonitorDocumentCteOsDocsPdf value) { put("pdf", value == null ? null : value.toJson()); return this; }
}
