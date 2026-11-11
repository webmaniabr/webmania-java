package com.webmania.sdk.model.api2monitordocuments;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/monitor-documents.openapi.json; see contract-provenance.json. */
public final class MonitorGetImportStatusRequest extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("uuid");
 public MonitorGetImportStatusRequest() { super(FIELDS); }
 public MonitorGetImportStatusRequest(JsonNode node) { super(node, FIELDS); }
 public String getUuid() { return stringValue(field("uuid")); }
 public MonitorGetImportStatusRequest setUuid(String value) { put("uuid", Json.scalar(value)); return this; }
}
