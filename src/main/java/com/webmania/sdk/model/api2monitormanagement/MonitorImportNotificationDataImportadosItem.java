package com.webmania.sdk.model.api2monitormanagement;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/monitor-management.openapi.json; see contract-provenance.json. */
public final class MonitorImportNotificationDataImportadosItem extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("arquivo", "uuid");
 public MonitorImportNotificationDataImportadosItem() { super(FIELDS); }
 public MonitorImportNotificationDataImportadosItem(JsonNode node) { super(node, FIELDS); }
 public String getArquivo() { return stringValue(field("arquivo")); }
 public MonitorImportNotificationDataImportadosItem setArquivo(String value) { put("arquivo", Json.scalar(value)); return this; }
 public String getUuid() { return stringValue(field("uuid")); }
 public MonitorImportNotificationDataImportadosItem setUuid(String value) { put("uuid", Json.scalar(value)); return this; }
}
