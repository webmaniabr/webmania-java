package com.webmania.sdk.model.api2monitordocuments;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/monitor-documents.openapi.json; see contract-provenance.json. */
public final class MonitorGetDocumentRequest extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("fd", "atualizar_status");
 public MonitorGetDocumentRequest() { super(FIELDS); }
 public MonitorGetDocumentRequest(JsonNode node) { super(node, FIELDS); }
 public String getFd() { return stringValue(field("fd")); }
 public MonitorGetDocumentRequest setFd(String value) { put("fd", Json.scalar(value)); return this; }
 public MonitorGetDocumentRequestAtualizarStatus getAtualizarStatus() { return (field("atualizar_status")).isNull() || (field("atualizar_status")).isMissingNode() ? null : new MonitorGetDocumentRequestAtualizarStatus(field("atualizar_status")); }
 public MonitorGetDocumentRequest setAtualizarStatus(MonitorGetDocumentRequestAtualizarStatus value) { put("atualizar_status", value == null ? null : value.toJson()); return this; }
}
