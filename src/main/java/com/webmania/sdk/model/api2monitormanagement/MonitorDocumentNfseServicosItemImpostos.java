package com.webmania.sdk.model.api2monitormanagement;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/monitor-management.openapi.json; see contract-provenance.json. */
public final class MonitorDocumentNfseServicosItemImpostos extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("tributacao_iss", "tributacao_descricao", "iss_retido", "bc", "iss_aliquota", "iss_valor", "pis_aliquota", "pis_valor", "cofins_aliquota", "cofins_valor", "inss_aliquota", "inss_valor", "ir_aliquota", "ir_valor", "csll_aliquota", "csll_valor", "cp_aliquota", "cp_valor", "ibs_cbs");
 public MonitorDocumentNfseServicosItemImpostos() { super(FIELDS); }
 public MonitorDocumentNfseServicosItemImpostos(JsonNode node) { super(node, FIELDS); }
 public String getTributacaoIss() { return stringValue(field("tributacao_iss")); }
 public MonitorDocumentNfseServicosItemImpostos setTributacaoIss(String value) { put("tributacao_iss", Json.scalar(value)); return this; }
 public String getTributacaoDescricao() { return stringValue(field("tributacao_descricao")); }
 public MonitorDocumentNfseServicosItemImpostos setTributacaoDescricao(String value) { put("tributacao_descricao", Json.scalar(value)); return this; }
 public java.math.BigDecimal getIssRetido() { return decimalValue(field("iss_retido")); }
 public MonitorDocumentNfseServicosItemImpostos setIssRetido(java.math.BigDecimal value) { put("iss_retido", Json.scalar(value)); return this; }
 public java.math.BigDecimal getBc() { return decimalValue(field("bc")); }
 public MonitorDocumentNfseServicosItemImpostos setBc(java.math.BigDecimal value) { put("bc", Json.scalar(value)); return this; }
 public java.math.BigDecimal getIssAliquota() { return decimalValue(field("iss_aliquota")); }
 public MonitorDocumentNfseServicosItemImpostos setIssAliquota(java.math.BigDecimal value) { put("iss_aliquota", Json.scalar(value)); return this; }
 public java.math.BigDecimal getIssValor() { return decimalValue(field("iss_valor")); }
 public MonitorDocumentNfseServicosItemImpostos setIssValor(java.math.BigDecimal value) { put("iss_valor", Json.scalar(value)); return this; }
 public java.math.BigDecimal getPisAliquota() { return decimalValue(field("pis_aliquota")); }
 public MonitorDocumentNfseServicosItemImpostos setPisAliquota(java.math.BigDecimal value) { put("pis_aliquota", Json.scalar(value)); return this; }
 public java.math.BigDecimal getPisValor() { return decimalValue(field("pis_valor")); }
 public MonitorDocumentNfseServicosItemImpostos setPisValor(java.math.BigDecimal value) { put("pis_valor", Json.scalar(value)); return this; }
 public java.math.BigDecimal getCofinsAliquota() { return decimalValue(field("cofins_aliquota")); }
 public MonitorDocumentNfseServicosItemImpostos setCofinsAliquota(java.math.BigDecimal value) { put("cofins_aliquota", Json.scalar(value)); return this; }
 public java.math.BigDecimal getCofinsValor() { return decimalValue(field("cofins_valor")); }
 public MonitorDocumentNfseServicosItemImpostos setCofinsValor(java.math.BigDecimal value) { put("cofins_valor", Json.scalar(value)); return this; }
 public java.math.BigDecimal getInssAliquota() { return decimalValue(field("inss_aliquota")); }
 public MonitorDocumentNfseServicosItemImpostos setInssAliquota(java.math.BigDecimal value) { put("inss_aliquota", Json.scalar(value)); return this; }
 public java.math.BigDecimal getInssValor() { return decimalValue(field("inss_valor")); }
 public MonitorDocumentNfseServicosItemImpostos setInssValor(java.math.BigDecimal value) { put("inss_valor", Json.scalar(value)); return this; }
 public java.math.BigDecimal getIrAliquota() { return decimalValue(field("ir_aliquota")); }
 public MonitorDocumentNfseServicosItemImpostos setIrAliquota(java.math.BigDecimal value) { put("ir_aliquota", Json.scalar(value)); return this; }
 public java.math.BigDecimal getIrValor() { return decimalValue(field("ir_valor")); }
 public MonitorDocumentNfseServicosItemImpostos setIrValor(java.math.BigDecimal value) { put("ir_valor", Json.scalar(value)); return this; }
 public java.math.BigDecimal getCsllAliquota() { return decimalValue(field("csll_aliquota")); }
 public MonitorDocumentNfseServicosItemImpostos setCsllAliquota(java.math.BigDecimal value) { put("csll_aliquota", Json.scalar(value)); return this; }
 public java.math.BigDecimal getCsllValor() { return decimalValue(field("csll_valor")); }
 public MonitorDocumentNfseServicosItemImpostos setCsllValor(java.math.BigDecimal value) { put("csll_valor", Json.scalar(value)); return this; }
 public java.math.BigDecimal getCpAliquota() { return decimalValue(field("cp_aliquota")); }
 public MonitorDocumentNfseServicosItemImpostos setCpAliquota(java.math.BigDecimal value) { put("cp_aliquota", Json.scalar(value)); return this; }
 public java.math.BigDecimal getCpValor() { return decimalValue(field("cp_valor")); }
 public MonitorDocumentNfseServicosItemImpostos setCpValor(java.math.BigDecimal value) { put("cp_valor", Json.scalar(value)); return this; }
 public MonitorDocumentNfseServicosItemImpostosIbsCbs getIbsCbs() { return (field("ibs_cbs")).isNull() || (field("ibs_cbs")).isMissingNode() ? null : new MonitorDocumentNfseServicosItemImpostosIbsCbs(field("ibs_cbs")); }
 public MonitorDocumentNfseServicosItemImpostos setIbsCbs(MonitorDocumentNfseServicosItemImpostosIbsCbs value) { put("ibs_cbs", value == null ? null : value.toJson()); return this; }
}
