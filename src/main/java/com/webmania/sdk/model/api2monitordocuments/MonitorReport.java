package com.webmania.sdk.model.api2monitordocuments;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/monitor-documents.openapi.json; see contract-provenance.json. */
public final class MonitorReport extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("uuid", "relatorio", "modelo", "status", "processado", "total", "criado_em", "atualizado_em", "filtros", "url", "expira_em");
 public MonitorReport() { super(FIELDS); }
 public MonitorReport(JsonNode node) { super(node, FIELDS); }
 public String getUuid() { return stringValue(field("uuid")); }
 public MonitorReport setUuid(String value) { put("uuid", Json.scalar(value)); return this; }
 public String getRelatorio() { return stringValue(field("relatorio")); }
 public MonitorReport setRelatorio(String value) { put("relatorio", Json.scalar(value)); return this; }
 public String getModelo() { return stringValue(field("modelo")); }
 public MonitorReport setModelo(String value) { put("modelo", Json.scalar(value)); return this; }
 public String getStatus() { return stringValue(field("status")); }
 public MonitorReport setStatus(String value) { put("status", Json.scalar(value)); return this; }
 public java.math.BigInteger getProcessado() { return integerValue(field("processado")); }
 public MonitorReport setProcessado(java.math.BigInteger value) { put("processado", Json.scalar(value)); return this; }
 public java.math.BigInteger getTotal() { return integerValue(field("total")); }
 public MonitorReport setTotal(java.math.BigInteger value) { put("total", Json.scalar(value)); return this; }
 public String getCriadoEm() { return stringValue(field("criado_em")); }
 public MonitorReport setCriadoEm(String value) { put("criado_em", Json.scalar(value)); return this; }
 public String getAtualizadoEm() { return stringValue(field("atualizado_em")); }
 public MonitorReport setAtualizadoEm(String value) { put("atualizado_em", Json.scalar(value)); return this; }
 public MonitorReportFiltros getFiltros() { return (field("filtros")).isNull() || (field("filtros")).isMissingNode() ? null : new MonitorReportFiltros(field("filtros")); }
 public MonitorReport setFiltros(MonitorReportFiltros value) { put("filtros", value == null ? null : value.toJson()); return this; }
 public String getUrl() { return stringValue(field("url")); }
 public MonitorReport setUrl(String value) { put("url", Json.scalar(value)); return this; }
 public String getExpiraEm() { return stringValue(field("expira_em")); }
 public MonitorReport setExpiraEm(String value) { put("expira_em", Json.scalar(value)); return this; }
}
