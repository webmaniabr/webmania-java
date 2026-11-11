package com.webmania.sdk.model.api2monitormanagement;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/monitor-management.openapi.json; see contract-provenance.json. */
public final class MonitorImportStatusDescartadosItem extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("arquivo", "motivo");
 public MonitorImportStatusDescartadosItem() { super(FIELDS); }
 public MonitorImportStatusDescartadosItem(JsonNode node) { super(node, FIELDS); }
 public String getArquivo() { return stringValue(field("arquivo")); }
 public MonitorImportStatusDescartadosItem setArquivo(String value) { put("arquivo", Json.scalar(value)); return this; }
 public String getMotivo() { return stringValue(field("motivo")); }
 public MonitorImportStatusDescartadosItem setMotivo(String value) { put("motivo", Json.scalar(value)); return this; }
}
