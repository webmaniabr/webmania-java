package com.webmania.sdk.model.api2monitormanagement;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/monitor-management.openapi.json; see contract-provenance.json. */
public final class MonitorDocumentCteServicoInformacoesCarga extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("valor_total", "produto_predominante", "outras_caracteristicas", "cubagem");
 public MonitorDocumentCteServicoInformacoesCarga() { super(FIELDS); }
 public MonitorDocumentCteServicoInformacoesCarga(JsonNode node) { super(node, FIELDS); }
 public java.math.BigDecimal getValorTotal() { return decimalValue(field("valor_total")); }
 public MonitorDocumentCteServicoInformacoesCarga setValorTotal(java.math.BigDecimal value) { put("valor_total", Json.scalar(value)); return this; }
 public String getProdutoPredominante() { return stringValue(field("produto_predominante")); }
 public MonitorDocumentCteServicoInformacoesCarga setProdutoPredominante(String value) { put("produto_predominante", Json.scalar(value)); return this; }
 public String getOutrasCaracteristicas() { return stringValue(field("outras_caracteristicas")); }
 public MonitorDocumentCteServicoInformacoesCarga setOutrasCaracteristicas(String value) { put("outras_caracteristicas", Json.scalar(value)); return this; }
 public MonitorDocumentCteServicoInformacoesCargaCubagem getCubagem() { return (field("cubagem")).isNull() || (field("cubagem")).isMissingNode() ? null : new MonitorDocumentCteServicoInformacoesCargaCubagem(field("cubagem")); }
 public MonitorDocumentCteServicoInformacoesCarga setCubagem(MonitorDocumentCteServicoInformacoesCargaCubagem value) { put("cubagem", value == null ? null : value.toJson()); return this; }
}
