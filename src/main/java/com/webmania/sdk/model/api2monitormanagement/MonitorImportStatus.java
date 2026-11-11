package com.webmania.sdk.model.api2monitormanagement;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/monitor-management.openapi.json; see contract-provenance.json. */
public final class MonitorImportStatus extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("uuid", "empresa_uuid", "status", "processado", "total", "importados", "descartados", "erro");
 public MonitorImportStatus() { super(FIELDS); }
 public MonitorImportStatus(JsonNode node) { super(node, FIELDS); }
 public String getUuid() { return stringValue(field("uuid")); }
 public MonitorImportStatus setUuid(String value) { put("uuid", Json.scalar(value)); return this; }
 public String getEmpresaUuid() { return stringValue(field("empresa_uuid")); }
 public MonitorImportStatus setEmpresaUuid(String value) { put("empresa_uuid", Json.scalar(value)); return this; }
 public String getStatus() { return stringValue(field("status")); }
 public MonitorImportStatus setStatus(String value) { put("status", Json.scalar(value)); return this; }
 public java.math.BigInteger getProcessado() { return integerValue(field("processado")); }
 public MonitorImportStatus setProcessado(java.math.BigInteger value) { put("processado", Json.scalar(value)); return this; }
 public java.math.BigInteger getTotal() { return integerValue(field("total")); }
 public MonitorImportStatus setTotal(java.math.BigInteger value) { put("total", Json.scalar(value)); return this; }
 public java.util.List<MonitorImportStatusImportadosItem> getImportados() { return list(field("importados"), v -> (v).isNull() || (v).isMissingNode() ? null : new MonitorImportStatusImportadosItem(v)); }
 public MonitorImportStatus setImportados(java.util.List<MonitorImportStatusImportadosItem> value) { put("importados", array(value, v -> v == null ? null : v.toJson())); return this; }
 public java.util.List<MonitorImportStatusDescartadosItem> getDescartados() { return list(field("descartados"), v -> (v).isNull() || (v).isMissingNode() ? null : new MonitorImportStatusDescartadosItem(v)); }
 public MonitorImportStatus setDescartados(java.util.List<MonitorImportStatusDescartadosItem> value) { put("descartados", array(value, v -> v == null ? null : v.toJson())); return this; }
 public String getErro() { return stringValue(field("erro")); }
 public MonitorImportStatus setErro(String value) { put("erro", Json.scalar(value)); return this; }
}
