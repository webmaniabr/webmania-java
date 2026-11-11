package com.webmania.sdk.model.api2monitordocuments;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/monitor-documents.openapi.json; see contract-provenance.json. */
public final class MonitorImportStatusImportadosItem extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("arquivo", "uuid");
 public MonitorImportStatusImportadosItem() { super(FIELDS); }
 public MonitorImportStatusImportadosItem(JsonNode node) { super(node, FIELDS); }
 public String getArquivo() { return stringValue(field("arquivo")); }
 public MonitorImportStatusImportadosItem setArquivo(String value) { put("arquivo", Json.scalar(value)); return this; }
 public String getUuid() { return stringValue(field("uuid")); }
 public MonitorImportStatusImportadosItem setUuid(String value) { put("uuid", Json.scalar(value)); return this; }
}
