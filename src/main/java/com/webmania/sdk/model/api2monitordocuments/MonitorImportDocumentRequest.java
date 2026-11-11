package com.webmania.sdk.model.api2monitordocuments;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/monitor-documents.openapi.json; see contract-provenance.json. */
public final class MonitorImportDocumentRequest extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("body");
 public MonitorImportDocumentRequest() { super(FIELDS); }
 public MonitorImportDocumentRequest(JsonNode node) { super(node, FIELDS); }
 public MonitorImportRequest getBody() { return (field("body")).isNull() || (field("body")).isMissingNode() ? null : new MonitorImportRequest(field("body")); }
 public MonitorImportDocumentRequest setBody(MonitorImportRequest value) { put("body", value == null ? null : value.toJson()); return this; }
}
