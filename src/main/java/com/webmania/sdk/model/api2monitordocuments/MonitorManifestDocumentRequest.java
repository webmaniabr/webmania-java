package com.webmania.sdk.model.api2monitordocuments;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/monitor-documents.openapi.json; see contract-provenance.json. */
public final class MonitorManifestDocumentRequest extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("fd", "body");
 public MonitorManifestDocumentRequest() { super(FIELDS); }
 public MonitorManifestDocumentRequest(JsonNode node) { super(node, FIELDS); }
 public String getFd() { return stringValue(field("fd")); }
 public MonitorManifestDocumentRequest setFd(String value) { put("fd", Json.scalar(value)); return this; }
 public MonitorManifestationRequest getBody() { return (field("body")).isNull() || (field("body")).isMissingNode() ? null : new MonitorManifestationRequest(field("body")); }
 public MonitorManifestDocumentRequest setBody(MonitorManifestationRequest value) { put("body", value == null ? null : value.toJson()); return this; }
}
