package com.webmania.sdk.model.api2monitormanagement;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/monitor-management.openapi.json; see contract-provenance.json. */
public final class MonitorDocumentCteOsServicoInformacoesCargaCubagem extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("quantidade", "unidade");
 public MonitorDocumentCteOsServicoInformacoesCargaCubagem() { super(FIELDS); }
 public MonitorDocumentCteOsServicoInformacoesCargaCubagem(JsonNode node) { super(node, FIELDS); }
 public java.math.BigDecimal getQuantidade() { return decimalValue(field("quantidade")); }
 public MonitorDocumentCteOsServicoInformacoesCargaCubagem setQuantidade(java.math.BigDecimal value) { put("quantidade", Json.scalar(value)); return this; }
 public String getUnidade() { return stringValue(field("unidade")); }
 public MonitorDocumentCteOsServicoInformacoesCargaCubagem setUnidade(String value) { put("unidade", Json.scalar(value)); return this; }
}
