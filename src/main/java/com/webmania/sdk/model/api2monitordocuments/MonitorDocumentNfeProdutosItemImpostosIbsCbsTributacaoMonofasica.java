package com.webmania.sdk.model.api2monitordocuments;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/monitor-documents.openapi.json; see contract-provenance.json. */
public final class MonitorDocumentNfeProdutosItemImpostosIbsCbsTributacaoMonofasica extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("quantidade_bc", "aliquota_ibs", "aliquota_cbs", "valor_ibs", "valor_cbs", "quantidade_bc_retencao", "aliquota_ibs_retencao", "aliquota_cbs_retencao", "valor_ibs_retencao", "valor_cbs_retencao", "quantidade_bc_retido", "aliquota_ibs_retido", "aliquota_cbs_retido", "valor_ibs_retido", "valor_cbs_retido", "aliquota_diferimento_ibs", "aliquota_diferimento_cbs", "valor_diferimento_ibs", "valor_diferimento_cbs", "valor_total_ibs", "valor_total_cbs");
 public MonitorDocumentNfeProdutosItemImpostosIbsCbsTributacaoMonofasica() { super(FIELDS); }
 public MonitorDocumentNfeProdutosItemImpostosIbsCbsTributacaoMonofasica(JsonNode node) { super(node, FIELDS); }
 public java.math.BigDecimal getQuantidadeBc() { return decimalValue(field("quantidade_bc")); }
 public MonitorDocumentNfeProdutosItemImpostosIbsCbsTributacaoMonofasica setQuantidadeBc(java.math.BigDecimal value) { put("quantidade_bc", Json.scalar(value)); return this; }
 public java.math.BigDecimal getAliquotaIbs() { return decimalValue(field("aliquota_ibs")); }
 public MonitorDocumentNfeProdutosItemImpostosIbsCbsTributacaoMonofasica setAliquotaIbs(java.math.BigDecimal value) { put("aliquota_ibs", Json.scalar(value)); return this; }
 public java.math.BigDecimal getAliquotaCbs() { return decimalValue(field("aliquota_cbs")); }
 public MonitorDocumentNfeProdutosItemImpostosIbsCbsTributacaoMonofasica setAliquotaCbs(java.math.BigDecimal value) { put("aliquota_cbs", Json.scalar(value)); return this; }
 public java.math.BigDecimal getValorIbs() { return decimalValue(field("valor_ibs")); }
 public MonitorDocumentNfeProdutosItemImpostosIbsCbsTributacaoMonofasica setValorIbs(java.math.BigDecimal value) { put("valor_ibs", Json.scalar(value)); return this; }
 public java.math.BigDecimal getValorCbs() { return decimalValue(field("valor_cbs")); }
 public MonitorDocumentNfeProdutosItemImpostosIbsCbsTributacaoMonofasica setValorCbs(java.math.BigDecimal value) { put("valor_cbs", Json.scalar(value)); return this; }
 public java.math.BigDecimal getQuantidadeBcRetencao() { return decimalValue(field("quantidade_bc_retencao")); }
 public MonitorDocumentNfeProdutosItemImpostosIbsCbsTributacaoMonofasica setQuantidadeBcRetencao(java.math.BigDecimal value) { put("quantidade_bc_retencao", Json.scalar(value)); return this; }
 public java.math.BigDecimal getAliquotaIbsRetencao() { return decimalValue(field("aliquota_ibs_retencao")); }
 public MonitorDocumentNfeProdutosItemImpostosIbsCbsTributacaoMonofasica setAliquotaIbsRetencao(java.math.BigDecimal value) { put("aliquota_ibs_retencao", Json.scalar(value)); return this; }
 public java.math.BigDecimal getAliquotaCbsRetencao() { return decimalValue(field("aliquota_cbs_retencao")); }
 public MonitorDocumentNfeProdutosItemImpostosIbsCbsTributacaoMonofasica setAliquotaCbsRetencao(java.math.BigDecimal value) { put("aliquota_cbs_retencao", Json.scalar(value)); return this; }
 public java.math.BigDecimal getValorIbsRetencao() { return decimalValue(field("valor_ibs_retencao")); }
 public MonitorDocumentNfeProdutosItemImpostosIbsCbsTributacaoMonofasica setValorIbsRetencao(java.math.BigDecimal value) { put("valor_ibs_retencao", Json.scalar(value)); return this; }
 public java.math.BigDecimal getValorCbsRetencao() { return decimalValue(field("valor_cbs_retencao")); }
 public MonitorDocumentNfeProdutosItemImpostosIbsCbsTributacaoMonofasica setValorCbsRetencao(java.math.BigDecimal value) { put("valor_cbs_retencao", Json.scalar(value)); return this; }
 public java.math.BigDecimal getQuantidadeBcRetido() { return decimalValue(field("quantidade_bc_retido")); }
 public MonitorDocumentNfeProdutosItemImpostosIbsCbsTributacaoMonofasica setQuantidadeBcRetido(java.math.BigDecimal value) { put("quantidade_bc_retido", Json.scalar(value)); return this; }
 public java.math.BigDecimal getAliquotaIbsRetido() { return decimalValue(field("aliquota_ibs_retido")); }
 public MonitorDocumentNfeProdutosItemImpostosIbsCbsTributacaoMonofasica setAliquotaIbsRetido(java.math.BigDecimal value) { put("aliquota_ibs_retido", Json.scalar(value)); return this; }
 public java.math.BigDecimal getAliquotaCbsRetido() { return decimalValue(field("aliquota_cbs_retido")); }
 public MonitorDocumentNfeProdutosItemImpostosIbsCbsTributacaoMonofasica setAliquotaCbsRetido(java.math.BigDecimal value) { put("aliquota_cbs_retido", Json.scalar(value)); return this; }
 public java.math.BigDecimal getValorIbsRetido() { return decimalValue(field("valor_ibs_retido")); }
 public MonitorDocumentNfeProdutosItemImpostosIbsCbsTributacaoMonofasica setValorIbsRetido(java.math.BigDecimal value) { put("valor_ibs_retido", Json.scalar(value)); return this; }
 public java.math.BigDecimal getValorCbsRetido() { return decimalValue(field("valor_cbs_retido")); }
 public MonitorDocumentNfeProdutosItemImpostosIbsCbsTributacaoMonofasica setValorCbsRetido(java.math.BigDecimal value) { put("valor_cbs_retido", Json.scalar(value)); return this; }
 public java.math.BigDecimal getAliquotaDiferimentoIbs() { return decimalValue(field("aliquota_diferimento_ibs")); }
 public MonitorDocumentNfeProdutosItemImpostosIbsCbsTributacaoMonofasica setAliquotaDiferimentoIbs(java.math.BigDecimal value) { put("aliquota_diferimento_ibs", Json.scalar(value)); return this; }
 public java.math.BigDecimal getAliquotaDiferimentoCbs() { return decimalValue(field("aliquota_diferimento_cbs")); }
 public MonitorDocumentNfeProdutosItemImpostosIbsCbsTributacaoMonofasica setAliquotaDiferimentoCbs(java.math.BigDecimal value) { put("aliquota_diferimento_cbs", Json.scalar(value)); return this; }
 public java.math.BigDecimal getValorDiferimentoIbs() { return decimalValue(field("valor_diferimento_ibs")); }
 public MonitorDocumentNfeProdutosItemImpostosIbsCbsTributacaoMonofasica setValorDiferimentoIbs(java.math.BigDecimal value) { put("valor_diferimento_ibs", Json.scalar(value)); return this; }
 public java.math.BigDecimal getValorDiferimentoCbs() { return decimalValue(field("valor_diferimento_cbs")); }
 public MonitorDocumentNfeProdutosItemImpostosIbsCbsTributacaoMonofasica setValorDiferimentoCbs(java.math.BigDecimal value) { put("valor_diferimento_cbs", Json.scalar(value)); return this; }
 public java.math.BigDecimal getValorTotalIbs() { return decimalValue(field("valor_total_ibs")); }
 public MonitorDocumentNfeProdutosItemImpostosIbsCbsTributacaoMonofasica setValorTotalIbs(java.math.BigDecimal value) { put("valor_total_ibs", Json.scalar(value)); return this; }
 public java.math.BigDecimal getValorTotalCbs() { return decimalValue(field("valor_total_cbs")); }
 public MonitorDocumentNfeProdutosItemImpostosIbsCbsTributacaoMonofasica setValorTotalCbs(java.math.BigDecimal value) { put("valor_total_cbs", Json.scalar(value)); return this; }
}
