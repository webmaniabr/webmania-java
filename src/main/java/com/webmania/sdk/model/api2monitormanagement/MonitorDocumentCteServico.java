package com.webmania.sdk.model.api2monitormanagement;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/monitor-management.openapi.json; see contract-provenance.json. */
public final class MonitorDocumentCteServico extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("descricao", "unidade_medida", "tipo", "valor_total", "documentos_originarios", "componentes_valor", "quantidade_carga", "modal", "tipo_servico", "informacoes_carga", "valor_recebido");
 public MonitorDocumentCteServico() { super(FIELDS); }
 public MonitorDocumentCteServico(JsonNode node) { super(node, FIELDS); }
 public String getDescricao() { return stringValue(field("descricao")); }
 public MonitorDocumentCteServico setDescricao(String value) { put("descricao", Json.scalar(value)); return this; }
 public String getUnidadeMedida() { return stringValue(field("unidade_medida")); }
 public MonitorDocumentCteServico setUnidadeMedida(String value) { put("unidade_medida", Json.scalar(value)); return this; }
 public java.math.BigDecimal getTipo() { return decimalValue(field("tipo")); }
 public MonitorDocumentCteServico setTipo(java.math.BigDecimal value) { put("tipo", Json.scalar(value)); return this; }
 public java.math.BigDecimal getValorTotal() { return decimalValue(field("valor_total")); }
 public MonitorDocumentCteServico setValorTotal(java.math.BigDecimal value) { put("valor_total", Json.scalar(value)); return this; }
 public java.util.List<MonitorDocumentCteServicoDocumentosOriginariosItem> getDocumentosOriginarios() { return list(field("documentos_originarios"), v -> (v).isNull() || (v).isMissingNode() ? null : new MonitorDocumentCteServicoDocumentosOriginariosItem(v)); }
 public MonitorDocumentCteServico setDocumentosOriginarios(java.util.List<MonitorDocumentCteServicoDocumentosOriginariosItem> value) { put("documentos_originarios", array(value, v -> v == null ? null : v.toJson())); return this; }
 public java.util.List<MonitorDocumentCteServicoComponentesValorItem> getComponentesValor() { return list(field("componentes_valor"), v -> (v).isNull() || (v).isMissingNode() ? null : new MonitorDocumentCteServicoComponentesValorItem(v)); }
 public MonitorDocumentCteServico setComponentesValor(java.util.List<MonitorDocumentCteServicoComponentesValorItem> value) { put("componentes_valor", array(value, v -> v == null ? null : v.toJson())); return this; }
 public java.math.BigDecimal getQuantidadeCarga() { return decimalValue(field("quantidade_carga")); }
 public MonitorDocumentCteServico setQuantidadeCarga(java.math.BigDecimal value) { put("quantidade_carga", Json.scalar(value)); return this; }
 public String getModal() { return stringValue(field("modal")); }
 public MonitorDocumentCteServico setModal(String value) { put("modal", Json.scalar(value)); return this; }
 public java.math.BigDecimal getTipoServico() { return decimalValue(field("tipo_servico")); }
 public MonitorDocumentCteServico setTipoServico(java.math.BigDecimal value) { put("tipo_servico", Json.scalar(value)); return this; }
 public MonitorDocumentCteServicoInformacoesCarga getInformacoesCarga() { return (field("informacoes_carga")).isNull() || (field("informacoes_carga")).isMissingNode() ? null : new MonitorDocumentCteServicoInformacoesCarga(field("informacoes_carga")); }
 public MonitorDocumentCteServico setInformacoesCarga(MonitorDocumentCteServicoInformacoesCarga value) { put("informacoes_carga", value == null ? null : value.toJson()); return this; }
 public java.math.BigDecimal getValorRecebido() { return decimalValue(field("valor_recebido")); }
 public MonitorDocumentCteServico setValorRecebido(java.math.BigDecimal value) { put("valor_recebido", Json.scalar(value)); return this; }
}
