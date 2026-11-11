package com.webmania.sdk.model.api2monitormanagement;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/monitor-management.openapi.json; see contract-provenance.json. */
public final class MonitorDocumentMdfeDocs extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("xml", "pdf");
 public MonitorDocumentMdfeDocs() { super(FIELDS); }
 public MonitorDocumentMdfeDocs(JsonNode node) { super(node, FIELDS); }
 public MonitorDocumentMdfeDocsXml getXml() { return (field("xml")).isNull() || (field("xml")).isMissingNode() ? null : new MonitorDocumentMdfeDocsXml(field("xml")); }
 public MonitorDocumentMdfeDocs setXml(MonitorDocumentMdfeDocsXml value) { put("xml", value == null ? null : value.toJson()); return this; }
 public MonitorDocumentMdfeDocsPdf getPdf() { return (field("pdf")).isNull() || (field("pdf")).isMissingNode() ? null : new MonitorDocumentMdfeDocsPdf(field("pdf")); }
 public MonitorDocumentMdfeDocs setPdf(MonitorDocumentMdfeDocsPdf value) { put("pdf", value == null ? null : value.toJson()); return this; }
}
