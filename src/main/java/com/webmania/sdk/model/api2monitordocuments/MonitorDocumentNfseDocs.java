package com.webmania.sdk.model.api2monitordocuments;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/monitor-documents.openapi.json; see contract-provenance.json. */
public final class MonitorDocumentNfseDocs extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("xml", "pdf");
 public MonitorDocumentNfseDocs() { super(FIELDS); }
 public MonitorDocumentNfseDocs(JsonNode node) { super(node, FIELDS); }
 public MonitorDocumentNfseDocsXml getXml() { return (field("xml")).isNull() || (field("xml")).isMissingNode() ? null : new MonitorDocumentNfseDocsXml(field("xml")); }
 public MonitorDocumentNfseDocs setXml(MonitorDocumentNfseDocsXml value) { put("xml", value == null ? null : value.toJson()); return this; }
 public MonitorDocumentNfseDocsPdf getPdf() { return (field("pdf")).isNull() || (field("pdf")).isMissingNode() ? null : new MonitorDocumentNfseDocsPdf(field("pdf")); }
 public MonitorDocumentNfseDocs setPdf(MonitorDocumentNfseDocsPdf value) { put("pdf", value == null ? null : value.toJson()); return this; }
}
