package com.webmania.sdk.model.api2monitormanagement;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/monitor-management.openapi.json; see contract-provenance.json. */
public final class MonitorEventMdfe extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("protocolo", "data_emissao", "modalidade", "chave");
 public MonitorEventMdfe() { super(FIELDS); }
 public MonitorEventMdfe(JsonNode node) { super(node, FIELDS); }
 public String getProtocolo() { return stringValue(field("protocolo")); }
 public MonitorEventMdfe setProtocolo(String value) { put("protocolo", Json.scalar(value)); return this; }
 public String getDataEmissao() { return stringValue(field("data_emissao")); }
 public MonitorEventMdfe setDataEmissao(String value) { put("data_emissao", Json.scalar(value)); return this; }
 public java.math.BigDecimal getModalidade() { return decimalValue(field("modalidade")); }
 public MonitorEventMdfe setModalidade(java.math.BigDecimal value) { put("modalidade", Json.scalar(value)); return this; }
 public String getChave() { return stringValue(field("chave")); }
 public MonitorEventMdfe setChave(String value) { put("chave", Json.scalar(value)); return this; }
}
