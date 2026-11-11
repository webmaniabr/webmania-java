package com.webmania.sdk.model.api2monitordocuments;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/monitor-documents.openapi.json; see contract-provenance.json. */
public final class MonitorDocumentCteOsServicoInformacoesCarga extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("valor_total", "produto_predominante", "outras_caracteristicas", "cubagem");
 public MonitorDocumentCteOsServicoInformacoesCarga() { super(FIELDS); }
 public MonitorDocumentCteOsServicoInformacoesCarga(JsonNode node) { super(node, FIELDS); }
 public java.math.BigDecimal getValorTotal() { return decimalValue(field("valor_total")); }
 public MonitorDocumentCteOsServicoInformacoesCarga setValorTotal(java.math.BigDecimal value) { put("valor_total", Json.scalar(value)); return this; }
 public String getProdutoPredominante() { return stringValue(field("produto_predominante")); }
 public MonitorDocumentCteOsServicoInformacoesCarga setProdutoPredominante(String value) { put("produto_predominante", Json.scalar(value)); return this; }
 public String getOutrasCaracteristicas() { return stringValue(field("outras_caracteristicas")); }
 public MonitorDocumentCteOsServicoInformacoesCarga setOutrasCaracteristicas(String value) { put("outras_caracteristicas", Json.scalar(value)); return this; }
 public MonitorDocumentCteOsServicoInformacoesCargaCubagem getCubagem() { return (field("cubagem")).isNull() || (field("cubagem")).isMissingNode() ? null : new MonitorDocumentCteOsServicoInformacoesCargaCubagem(field("cubagem")); }
 public MonitorDocumentCteOsServicoInformacoesCarga setCubagem(MonitorDocumentCteOsServicoInformacoesCargaCubagem value) { put("cubagem", value == null ? null : value.toJson()); return this; }
}
