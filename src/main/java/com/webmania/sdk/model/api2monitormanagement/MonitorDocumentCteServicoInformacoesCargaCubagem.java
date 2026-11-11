package com.webmania.sdk.model.api2monitormanagement;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/monitor-management.openapi.json; see contract-provenance.json. */
public final class MonitorDocumentCteServicoInformacoesCargaCubagem extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("quantidade", "unidade");
 public MonitorDocumentCteServicoInformacoesCargaCubagem() { super(FIELDS); }
 public MonitorDocumentCteServicoInformacoesCargaCubagem(JsonNode node) { super(node, FIELDS); }
 public java.math.BigDecimal getQuantidade() { return decimalValue(field("quantidade")); }
 public MonitorDocumentCteServicoInformacoesCargaCubagem setQuantidade(java.math.BigDecimal value) { put("quantidade", Json.scalar(value)); return this; }
 public String getUnidade() { return stringValue(field("unidade")); }
 public MonitorDocumentCteServicoInformacoesCargaCubagem setUnidade(String value) { put("unidade", Json.scalar(value)); return this; }
}
