package com.webmania.sdk.model.api2monitordocuments;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/monitor-documents.openapi.json; see contract-provenance.json. */
public final class MonitorDocumentNfeDocs extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("xml", "pdf");
 public MonitorDocumentNfeDocs() { super(FIELDS); }
 public MonitorDocumentNfeDocs(JsonNode node) { super(node, FIELDS); }
 public MonitorDocumentNfeDocsXml getXml() { return (field("xml")).isNull() || (field("xml")).isMissingNode() ? null : new MonitorDocumentNfeDocsXml(field("xml")); }
 public MonitorDocumentNfeDocs setXml(MonitorDocumentNfeDocsXml value) { put("xml", value == null ? null : value.toJson()); return this; }
 public MonitorDocumentNfeDocsPdf getPdf() { return (field("pdf")).isNull() || (field("pdf")).isMissingNode() ? null : new MonitorDocumentNfeDocsPdf(field("pdf")); }
 public MonitorDocumentNfeDocs setPdf(MonitorDocumentNfeDocsPdf value) { put("pdf", value == null ? null : value.toJson()); return this; }
}
