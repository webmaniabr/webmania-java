package com.webmania.sdk.model.api2monitordocuments;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/monitor-documents.openapi.json; see contract-provenance.json. */
public final class MonitorDocumentNfseImpostos extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("tributacao_iss", "tributacao_descricao", "iss_retido", "bc", "iss_aliquota", "iss_valor", "pis_aliquota", "pis_valor", "cofins_aliquota", "cofins_valor", "inss_aliquota", "inss_valor", "ir_aliquota", "ir_valor", "csll_aliquota", "csll_valor", "cp_aliquota", "cp_valor", "ibs_cbs");
 public MonitorDocumentNfseImpostos() { super(FIELDS); }
 public MonitorDocumentNfseImpostos(JsonNode node) { super(node, FIELDS); }
 public java.math.BigDecimal getTributacaoIss() { return decimalValue(field("tributacao_iss")); }
 public MonitorDocumentNfseImpostos setTributacaoIss(java.math.BigDecimal value) { put("tributacao_iss", Json.scalar(value)); return this; }
 public String getTributacaoDescricao() { return stringValue(field("tributacao_descricao")); }
 public MonitorDocumentNfseImpostos setTributacaoDescricao(String value) { put("tributacao_descricao", Json.scalar(value)); return this; }
 public java.math.BigDecimal getIssRetido() { return decimalValue(field("iss_retido")); }
 public MonitorDocumentNfseImpostos setIssRetido(java.math.BigDecimal value) { put("iss_retido", Json.scalar(value)); return this; }
 public java.math.BigDecimal getBc() { return decimalValue(field("bc")); }
 public MonitorDocumentNfseImpostos setBc(java.math.BigDecimal value) { put("bc", Json.scalar(value)); return this; }
 public java.math.BigDecimal getIssAliquota() { return decimalValue(field("iss_aliquota")); }
 public MonitorDocumentNfseImpostos setIssAliquota(java.math.BigDecimal value) { put("iss_aliquota", Json.scalar(value)); return this; }
 public java.math.BigDecimal getIssValor() { return decimalValue(field("iss_valor")); }
 public MonitorDocumentNfseImpostos setIssValor(java.math.BigDecimal value) { put("iss_valor", Json.scalar(value)); return this; }
 public java.math.BigDecimal getPisAliquota() { return decimalValue(field("pis_aliquota")); }
 public MonitorDocumentNfseImpostos setPisAliquota(java.math.BigDecimal value) { put("pis_aliquota", Json.scalar(value)); return this; }
 public java.math.BigDecimal getPisValor() { return decimalValue(field("pis_valor")); }
 public MonitorDocumentNfseImpostos setPisValor(java.math.BigDecimal value) { put("pis_valor", Json.scalar(value)); return this; }
 public java.math.BigDecimal getCofinsAliquota() { return decimalValue(field("cofins_aliquota")); }
 public MonitorDocumentNfseImpostos setCofinsAliquota(java.math.BigDecimal value) { put("cofins_aliquota", Json.scalar(value)); return this; }
 public java.math.BigDecimal getCofinsValor() { return decimalValue(field("cofins_valor")); }
 public MonitorDocumentNfseImpostos setCofinsValor(java.math.BigDecimal value) { put("cofins_valor", Json.scalar(value)); return this; }
 public java.math.BigDecimal getInssAliquota() { return decimalValue(field("inss_aliquota")); }
 public MonitorDocumentNfseImpostos setInssAliquota(java.math.BigDecimal value) { put("inss_aliquota", Json.scalar(value)); return this; }
 public java.math.BigDecimal getInssValor() { return decimalValue(field("inss_valor")); }
 public MonitorDocumentNfseImpostos setInssValor(java.math.BigDecimal value) { put("inss_valor", Json.scalar(value)); return this; }
 public java.math.BigDecimal getIrAliquota() { return decimalValue(field("ir_aliquota")); }
 public MonitorDocumentNfseImpostos setIrAliquota(java.math.BigDecimal value) { put("ir_aliquota", Json.scalar(value)); return this; }
 public java.math.BigDecimal getIrValor() { return decimalValue(field("ir_valor")); }
 public MonitorDocumentNfseImpostos setIrValor(java.math.BigDecimal value) { put("ir_valor", Json.scalar(value)); return this; }
 public java.math.BigDecimal getCsllAliquota() { return decimalValue(field("csll_aliquota")); }
 public MonitorDocumentNfseImpostos setCsllAliquota(java.math.BigDecimal value) { put("csll_aliquota", Json.scalar(value)); return this; }
 public java.math.BigDecimal getCsllValor() { return decimalValue(field("csll_valor")); }
 public MonitorDocumentNfseImpostos setCsllValor(java.math.BigDecimal value) { put("csll_valor", Json.scalar(value)); return this; }
 public java.math.BigDecimal getCpAliquota() { return decimalValue(field("cp_aliquota")); }
 public MonitorDocumentNfseImpostos setCpAliquota(java.math.BigDecimal value) { put("cp_aliquota", Json.scalar(value)); return this; }
 public java.math.BigDecimal getCpValor() { return decimalValue(field("cp_valor")); }
 public MonitorDocumentNfseImpostos setCpValor(java.math.BigDecimal value) { put("cp_valor", Json.scalar(value)); return this; }
 public MonitorDocumentNfseImpostosIbsCbs getIbsCbs() { return (field("ibs_cbs")).isNull() || (field("ibs_cbs")).isMissingNode() ? null : new MonitorDocumentNfseImpostosIbsCbs(field("ibs_cbs")); }
 public MonitorDocumentNfseImpostos setIbsCbs(MonitorDocumentNfseImpostosIbsCbs value) { put("ibs_cbs", value == null ? null : value.toJson()); return this; }
}
