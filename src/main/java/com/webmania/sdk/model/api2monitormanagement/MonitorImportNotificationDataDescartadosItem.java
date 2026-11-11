package com.webmania.sdk.model.api2monitormanagement;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/monitor-management.openapi.json; see contract-provenance.json. */
public final class MonitorImportNotificationDataDescartadosItem extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("arquivo", "motivo");
 public MonitorImportNotificationDataDescartadosItem() { super(FIELDS); }
 public MonitorImportNotificationDataDescartadosItem(JsonNode node) { super(node, FIELDS); }
 public String getArquivo() { return stringValue(field("arquivo")); }
 public MonitorImportNotificationDataDescartadosItem setArquivo(String value) { put("arquivo", Json.scalar(value)); return this; }
 public String getMotivo() { return stringValue(field("motivo")); }
 public MonitorImportNotificationDataDescartadosItem setMotivo(String value) { put("motivo", Json.scalar(value)); return this; }
}
