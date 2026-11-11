package com.webmania.sdk.model.api2monitormanagement;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/monitor-management.openapi.json; see contract-provenance.json. */
public final class MonitorDocumentNfeProdutosItem extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("cfop", "valor_unitario", "origem", "cest", "unidade_tributavel", "impostos", "nome", "quantidade_tributavel", "descricao", "quantidade", "subtotal_tributavel", "valor_total", "outras_despesas", "seguro", "unidade", "desconto", "total", "gtin_tributavel", "gtin", "subtotal", "frete", "ncm", "item", "codigo");
 public MonitorDocumentNfeProdutosItem() { super(FIELDS); }
 public MonitorDocumentNfeProdutosItem(JsonNode node) { super(node, FIELDS); }
 public String getCfop() { return stringValue(field("cfop")); }
 public MonitorDocumentNfeProdutosItem setCfop(String value) { put("cfop", Json.scalar(value)); return this; }
 public java.math.BigDecimal getValorUnitario() { return decimalValue(field("valor_unitario")); }
 public MonitorDocumentNfeProdutosItem setValorUnitario(java.math.BigDecimal value) { put("valor_unitario", Json.scalar(value)); return this; }
 public String getOrigem() { return stringValue(field("origem")); }
 public MonitorDocumentNfeProdutosItem setOrigem(String value) { put("origem", Json.scalar(value)); return this; }
 public String getCest() { return stringValue(field("cest")); }
 public MonitorDocumentNfeProdutosItem setCest(String value) { put("cest", Json.scalar(value)); return this; }
 public String getUnidadeTributavel() { return stringValue(field("unidade_tributavel")); }
 public MonitorDocumentNfeProdutosItem setUnidadeTributavel(String value) { put("unidade_tributavel", Json.scalar(value)); return this; }
 public MonitorDocumentNfeProdutosItemImpostos getImpostos() { return (field("impostos")).isNull() || (field("impostos")).isMissingNode() ? null : new MonitorDocumentNfeProdutosItemImpostos(field("impostos")); }
 public MonitorDocumentNfeProdutosItem setImpostos(MonitorDocumentNfeProdutosItemImpostos value) { put("impostos", value == null ? null : value.toJson()); return this; }
 public String getNome() { return stringValue(field("nome")); }
 public MonitorDocumentNfeProdutosItem setNome(String value) { put("nome", Json.scalar(value)); return this; }
 public java.math.BigDecimal getQuantidadeTributavel() { return decimalValue(field("quantidade_tributavel")); }
 public MonitorDocumentNfeProdutosItem setQuantidadeTributavel(java.math.BigDecimal value) { put("quantidade_tributavel", Json.scalar(value)); return this; }
 public String getDescricao() { return stringValue(field("descricao")); }
 public MonitorDocumentNfeProdutosItem setDescricao(String value) { put("descricao", Json.scalar(value)); return this; }
 public java.math.BigDecimal getQuantidade() { return decimalValue(field("quantidade")); }
 public MonitorDocumentNfeProdutosItem setQuantidade(java.math.BigDecimal value) { put("quantidade", Json.scalar(value)); return this; }
 public java.math.BigDecimal getSubtotalTributavel() { return decimalValue(field("subtotal_tributavel")); }
 public MonitorDocumentNfeProdutosItem setSubtotalTributavel(java.math.BigDecimal value) { put("subtotal_tributavel", Json.scalar(value)); return this; }
 public java.math.BigDecimal getValorTotal() { return decimalValue(field("valor_total")); }
 public MonitorDocumentNfeProdutosItem setValorTotal(java.math.BigDecimal value) { put("valor_total", Json.scalar(value)); return this; }
 public java.math.BigDecimal getOutrasDespesas() { return decimalValue(field("outras_despesas")); }
 public MonitorDocumentNfeProdutosItem setOutrasDespesas(java.math.BigDecimal value) { put("outras_despesas", Json.scalar(value)); return this; }
 public java.math.BigDecimal getSeguro() { return decimalValue(field("seguro")); }
 public MonitorDocumentNfeProdutosItem setSeguro(java.math.BigDecimal value) { put("seguro", Json.scalar(value)); return this; }
 public String getUnidade() { return stringValue(field("unidade")); }
 public MonitorDocumentNfeProdutosItem setUnidade(String value) { put("unidade", Json.scalar(value)); return this; }
 public java.math.BigDecimal getDesconto() { return decimalValue(field("desconto")); }
 public MonitorDocumentNfeProdutosItem setDesconto(java.math.BigDecimal value) { put("desconto", Json.scalar(value)); return this; }
 public java.math.BigDecimal getTotal() { return decimalValue(field("total")); }
 public MonitorDocumentNfeProdutosItem setTotal(java.math.BigDecimal value) { put("total", Json.scalar(value)); return this; }
 public String getGtinTributavel() { return stringValue(field("gtin_tributavel")); }
 public MonitorDocumentNfeProdutosItem setGtinTributavel(String value) { put("gtin_tributavel", Json.scalar(value)); return this; }
 public String getGtin() { return stringValue(field("gtin")); }
 public MonitorDocumentNfeProdutosItem setGtin(String value) { put("gtin", Json.scalar(value)); return this; }
 public java.math.BigDecimal getSubtotal() { return decimalValue(field("subtotal")); }
 public MonitorDocumentNfeProdutosItem setSubtotal(java.math.BigDecimal value) { put("subtotal", Json.scalar(value)); return this; }
 public java.math.BigDecimal getFrete() { return decimalValue(field("frete")); }
 public MonitorDocumentNfeProdutosItem setFrete(java.math.BigDecimal value) { put("frete", Json.scalar(value)); return this; }
 public String getNcm() { return stringValue(field("ncm")); }
 public MonitorDocumentNfeProdutosItem setNcm(String value) { put("ncm", Json.scalar(value)); return this; }
 public String getItem() { return stringValue(field("item")); }
 public MonitorDocumentNfeProdutosItem setItem(String value) { put("item", Json.scalar(value)); return this; }
 public String getCodigo() { return stringValue(field("codigo")); }
 public MonitorDocumentNfeProdutosItem setCodigo(String value) { put("codigo", Json.scalar(value)); return this; }
}
