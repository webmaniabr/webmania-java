package com.webmania.sdk.model.api2monitormanagement;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/monitor-management.openapi.json; see contract-provenance.json. */
public final class MonitorDocumentCteOsServico extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("descricao", "unidade_medida", "tipo", "valor_total", "documentos_originarios", "componentes_valor", "quantidade_carga", "modal", "tipo_servico", "informacoes_carga", "valor_recebido");
 public MonitorDocumentCteOsServico() { super(FIELDS); }
 public MonitorDocumentCteOsServico(JsonNode node) { super(node, FIELDS); }
 public String getDescricao() { return stringValue(field("descricao")); }
 public MonitorDocumentCteOsServico setDescricao(String value) { put("descricao", Json.scalar(value)); return this; }
 public String getUnidadeMedida() { return stringValue(field("unidade_medida")); }
 public MonitorDocumentCteOsServico setUnidadeMedida(String value) { put("unidade_medida", Json.scalar(value)); return this; }
 public java.math.BigDecimal getTipo() { return decimalValue(field("tipo")); }
 public MonitorDocumentCteOsServico setTipo(java.math.BigDecimal value) { put("tipo", Json.scalar(value)); return this; }
 public java.math.BigDecimal getValorTotal() { return decimalValue(field("valor_total")); }
 public MonitorDocumentCteOsServico setValorTotal(java.math.BigDecimal value) { put("valor_total", Json.scalar(value)); return this; }
 public java.util.List<MonitorDocumentCteOsServicoDocumentosOriginariosItem> getDocumentosOriginarios() { return list(field("documentos_originarios"), v -> (v).isNull() || (v).isMissingNode() ? null : new MonitorDocumentCteOsServicoDocumentosOriginariosItem(v)); }
 public MonitorDocumentCteOsServico setDocumentosOriginarios(java.util.List<MonitorDocumentCteOsServicoDocumentosOriginariosItem> value) { put("documentos_originarios", array(value, v -> v == null ? null : v.toJson())); return this; }
 public java.util.List<MonitorDocumentCteOsServicoComponentesValorItem> getComponentesValor() { return list(field("componentes_valor"), v -> (v).isNull() || (v).isMissingNode() ? null : new MonitorDocumentCteOsServicoComponentesValorItem(v)); }
 public MonitorDocumentCteOsServico setComponentesValor(java.util.List<MonitorDocumentCteOsServicoComponentesValorItem> value) { put("componentes_valor", array(value, v -> v == null ? null : v.toJson())); return this; }
 public java.math.BigDecimal getQuantidadeCarga() { return decimalValue(field("quantidade_carga")); }
 public MonitorDocumentCteOsServico setQuantidadeCarga(java.math.BigDecimal value) { put("quantidade_carga", Json.scalar(value)); return this; }
 public String getModal() { return stringValue(field("modal")); }
 public MonitorDocumentCteOsServico setModal(String value) { put("modal", Json.scalar(value)); return this; }
 public java.math.BigDecimal getTipoServico() { return decimalValue(field("tipo_servico")); }
 public MonitorDocumentCteOsServico setTipoServico(java.math.BigDecimal value) { put("tipo_servico", Json.scalar(value)); return this; }
 public MonitorDocumentCteOsServicoInformacoesCarga getInformacoesCarga() { return (field("informacoes_carga")).isNull() || (field("informacoes_carga")).isMissingNode() ? null : new MonitorDocumentCteOsServicoInformacoesCarga(field("informacoes_carga")); }
 public MonitorDocumentCteOsServico setInformacoesCarga(MonitorDocumentCteOsServicoInformacoesCarga value) { put("informacoes_carga", value == null ? null : value.toJson()); return this; }
 public java.math.BigDecimal getValorRecebido() { return decimalValue(field("valor_recebido")); }
 public MonitorDocumentCteOsServico setValorRecebido(java.math.BigDecimal value) { put("valor_recebido", Json.scalar(value)); return this; }
}
