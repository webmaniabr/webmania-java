package com.webmania.sdk.model.api2monitormanagement;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/monitor-management.openapi.json; see contract-provenance.json. */
public final class MonitorImportNotificationData extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("uuid", "empresa_uuid", "status", "processado", "total", "importados", "descartados", "erro");
 public MonitorImportNotificationData() { super(FIELDS); }
 public MonitorImportNotificationData(JsonNode node) { super(node, FIELDS); }
 public String getUuid() { return stringValue(field("uuid")); }
 public MonitorImportNotificationData setUuid(String value) { put("uuid", Json.scalar(value)); return this; }
 public MonitorImportNotificationDataEmpresaUuid getEmpresaUuid() { return (field("empresa_uuid")).isNull() || (field("empresa_uuid")).isMissingNode() ? null : new MonitorImportNotificationDataEmpresaUuid(field("empresa_uuid")); }
 public MonitorImportNotificationData setEmpresaUuid(MonitorImportNotificationDataEmpresaUuid value) { put("empresa_uuid", value == null ? null : value.toJson()); return this; }
 public MonitorImportNotificationDataStatus getStatus() { return (field("status")).isNull() || (field("status")).isMissingNode() ? null : new MonitorImportNotificationDataStatus(field("status")); }
 public MonitorImportNotificationData setStatus(MonitorImportNotificationDataStatus value) { put("status", value == null ? null : value.toJson()); return this; }
 public MonitorImportNotificationDataProcessado getProcessado() { return (field("processado")).isNull() || (field("processado")).isMissingNode() ? null : new MonitorImportNotificationDataProcessado(field("processado")); }
 public MonitorImportNotificationData setProcessado(MonitorImportNotificationDataProcessado value) { put("processado", value == null ? null : value.toJson()); return this; }
 public MonitorImportNotificationDataTotal getTotal() { return (field("total")).isNull() || (field("total")).isMissingNode() ? null : new MonitorImportNotificationDataTotal(field("total")); }
 public MonitorImportNotificationData setTotal(MonitorImportNotificationDataTotal value) { put("total", value == null ? null : value.toJson()); return this; }
 public java.util.List<MonitorImportNotificationDataImportadosItem> getImportados() { return list(field("importados"), v -> (v).isNull() || (v).isMissingNode() ? null : new MonitorImportNotificationDataImportadosItem(v)); }
 public MonitorImportNotificationData setImportados(java.util.List<MonitorImportNotificationDataImportadosItem> value) { put("importados", array(value, v -> v == null ? null : v.toJson())); return this; }
 public java.util.List<MonitorImportNotificationDataDescartadosItem> getDescartados() { return list(field("descartados"), v -> (v).isNull() || (v).isMissingNode() ? null : new MonitorImportNotificationDataDescartadosItem(v)); }
 public MonitorImportNotificationData setDescartados(java.util.List<MonitorImportNotificationDataDescartadosItem> value) { put("descartados", array(value, v -> v == null ? null : v.toJson())); return this; }
 public MonitorImportNotificationDataErro getErro() { return (field("erro")).isNull() || (field("erro")).isMissingNode() ? null : new MonitorImportNotificationDataErro(field("erro")); }
 public MonitorImportNotificationData setErro(MonitorImportNotificationDataErro value) { put("erro", value == null ? null : value.toJson()); return this; }
}
