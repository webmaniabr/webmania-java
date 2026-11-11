package com.webmania.sdk.model.api2monitordocuments;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/monitor-documents.openapi.json; see contract-provenance.json. */
public final class MonitorDocumentNfeTotaisIssqn extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("valor_servicos", "iss_bc", "iss_valor", "pis_valor", "cofins_valor", "data_competencia", "deducao", "outras_retencoes", "desconto_incondicionado", "desconto_condicionado", "iss_retido_valor", "regime_especial_tributacao");
 public MonitorDocumentNfeTotaisIssqn() { super(FIELDS); }
 public MonitorDocumentNfeTotaisIssqn(JsonNode node) { super(node, FIELDS); }
 public java.math.BigDecimal getValorServicos() { return decimalValue(field("valor_servicos")); }
 public MonitorDocumentNfeTotaisIssqn setValorServicos(java.math.BigDecimal value) { put("valor_servicos", Json.scalar(value)); return this; }
 public java.math.BigDecimal getIssBc() { return decimalValue(field("iss_bc")); }
 public MonitorDocumentNfeTotaisIssqn setIssBc(java.math.BigDecimal value) { put("iss_bc", Json.scalar(value)); return this; }
 public java.math.BigDecimal getIssValor() { return decimalValue(field("iss_valor")); }
 public MonitorDocumentNfeTotaisIssqn setIssValor(java.math.BigDecimal value) { put("iss_valor", Json.scalar(value)); return this; }
 public java.math.BigDecimal getPisValor() { return decimalValue(field("pis_valor")); }
 public MonitorDocumentNfeTotaisIssqn setPisValor(java.math.BigDecimal value) { put("pis_valor", Json.scalar(value)); return this; }
 public java.math.BigDecimal getCofinsValor() { return decimalValue(field("cofins_valor")); }
 public MonitorDocumentNfeTotaisIssqn setCofinsValor(java.math.BigDecimal value) { put("cofins_valor", Json.scalar(value)); return this; }
 public String getDataCompetencia() { return stringValue(field("data_competencia")); }
 public MonitorDocumentNfeTotaisIssqn setDataCompetencia(String value) { put("data_competencia", Json.scalar(value)); return this; }
 public java.math.BigDecimal getDeducao() { return decimalValue(field("deducao")); }
 public MonitorDocumentNfeTotaisIssqn setDeducao(java.math.BigDecimal value) { put("deducao", Json.scalar(value)); return this; }
 public java.math.BigDecimal getOutrasRetencoes() { return decimalValue(field("outras_retencoes")); }
 public MonitorDocumentNfeTotaisIssqn setOutrasRetencoes(java.math.BigDecimal value) { put("outras_retencoes", Json.scalar(value)); return this; }
 public java.math.BigDecimal getDescontoIncondicionado() { return decimalValue(field("desconto_incondicionado")); }
 public MonitorDocumentNfeTotaisIssqn setDescontoIncondicionado(java.math.BigDecimal value) { put("desconto_incondicionado", Json.scalar(value)); return this; }
 public java.math.BigDecimal getDescontoCondicionado() { return decimalValue(field("desconto_condicionado")); }
 public MonitorDocumentNfeTotaisIssqn setDescontoCondicionado(java.math.BigDecimal value) { put("desconto_condicionado", Json.scalar(value)); return this; }
 public java.math.BigDecimal getIssRetidoValor() { return decimalValue(field("iss_retido_valor")); }
 public MonitorDocumentNfeTotaisIssqn setIssRetidoValor(java.math.BigDecimal value) { put("iss_retido_valor", Json.scalar(value)); return this; }
 public String getRegimeEspecialTributacao() { return stringValue(field("regime_especial_tributacao")); }
 public MonitorDocumentNfeTotaisIssqn setRegimeEspecialTributacao(String value) { put("regime_especial_tributacao", Json.scalar(value)); return this; }
}
