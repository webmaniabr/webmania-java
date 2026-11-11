package com.webmania.sdk.model.api2monitormanagement;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/monitor-management.openapi.json; see contract-provenance.json. */
public final class MonitorDocumentNfeTotais extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("valor_desconto", "ii_valor", "valor_seguro", "fcp_st_retido_valor", "cofins_valor", "icms_bc", "ipi_devolvido_valor", "fcp_st_valor", "valor_produtos", "valor_outras_despesas", "icms_valor_desonerado", "valor_frete", "icms_st_valor", "valor_total_nfe", "pis_valor", "icms_valor", "ipi_valor", "fcp_valor", "icms_st_bc");
 public MonitorDocumentNfeTotais() { super(FIELDS); }
 public MonitorDocumentNfeTotais(JsonNode node) { super(node, FIELDS); }
 public java.math.BigDecimal getValorDesconto() { return decimalValue(field("valor_desconto")); }
 public MonitorDocumentNfeTotais setValorDesconto(java.math.BigDecimal value) { put("valor_desconto", Json.scalar(value)); return this; }
 public java.math.BigDecimal getIiValor() { return decimalValue(field("ii_valor")); }
 public MonitorDocumentNfeTotais setIiValor(java.math.BigDecimal value) { put("ii_valor", Json.scalar(value)); return this; }
 public java.math.BigDecimal getValorSeguro() { return decimalValue(field("valor_seguro")); }
 public MonitorDocumentNfeTotais setValorSeguro(java.math.BigDecimal value) { put("valor_seguro", Json.scalar(value)); return this; }
 public java.math.BigDecimal getFcpStRetidoValor() { return decimalValue(field("fcp_st_retido_valor")); }
 public MonitorDocumentNfeTotais setFcpStRetidoValor(java.math.BigDecimal value) { put("fcp_st_retido_valor", Json.scalar(value)); return this; }
 public java.math.BigDecimal getCofinsValor() { return decimalValue(field("cofins_valor")); }
 public MonitorDocumentNfeTotais setCofinsValor(java.math.BigDecimal value) { put("cofins_valor", Json.scalar(value)); return this; }
 public java.math.BigDecimal getIcmsBc() { return decimalValue(field("icms_bc")); }
 public MonitorDocumentNfeTotais setIcmsBc(java.math.BigDecimal value) { put("icms_bc", Json.scalar(value)); return this; }
 public java.math.BigDecimal getIpiDevolvidoValor() { return decimalValue(field("ipi_devolvido_valor")); }
 public MonitorDocumentNfeTotais setIpiDevolvidoValor(java.math.BigDecimal value) { put("ipi_devolvido_valor", Json.scalar(value)); return this; }
 public java.math.BigDecimal getFcpStValor() { return decimalValue(field("fcp_st_valor")); }
 public MonitorDocumentNfeTotais setFcpStValor(java.math.BigDecimal value) { put("fcp_st_valor", Json.scalar(value)); return this; }
 public java.math.BigDecimal getValorProdutos() { return decimalValue(field("valor_produtos")); }
 public MonitorDocumentNfeTotais setValorProdutos(java.math.BigDecimal value) { put("valor_produtos", Json.scalar(value)); return this; }
 public java.math.BigDecimal getValorOutrasDespesas() { return decimalValue(field("valor_outras_despesas")); }
 public MonitorDocumentNfeTotais setValorOutrasDespesas(java.math.BigDecimal value) { put("valor_outras_despesas", Json.scalar(value)); return this; }
 public java.math.BigDecimal getIcmsValorDesonerado() { return decimalValue(field("icms_valor_desonerado")); }
 public MonitorDocumentNfeTotais setIcmsValorDesonerado(java.math.BigDecimal value) { put("icms_valor_desonerado", Json.scalar(value)); return this; }
 public java.math.BigDecimal getValorFrete() { return decimalValue(field("valor_frete")); }
 public MonitorDocumentNfeTotais setValorFrete(java.math.BigDecimal value) { put("valor_frete", Json.scalar(value)); return this; }
 public java.math.BigDecimal getIcmsStValor() { return decimalValue(field("icms_st_valor")); }
 public MonitorDocumentNfeTotais setIcmsStValor(java.math.BigDecimal value) { put("icms_st_valor", Json.scalar(value)); return this; }
 public java.math.BigDecimal getValorTotalNfe() { return decimalValue(field("valor_total_nfe")); }
 public MonitorDocumentNfeTotais setValorTotalNfe(java.math.BigDecimal value) { put("valor_total_nfe", Json.scalar(value)); return this; }
 public java.math.BigDecimal getPisValor() { return decimalValue(field("pis_valor")); }
 public MonitorDocumentNfeTotais setPisValor(java.math.BigDecimal value) { put("pis_valor", Json.scalar(value)); return this; }
 public java.math.BigDecimal getIcmsValor() { return decimalValue(field("icms_valor")); }
 public MonitorDocumentNfeTotais setIcmsValor(java.math.BigDecimal value) { put("icms_valor", Json.scalar(value)); return this; }
 public java.math.BigDecimal getIpiValor() { return decimalValue(field("ipi_valor")); }
 public MonitorDocumentNfeTotais setIpiValor(java.math.BigDecimal value) { put("ipi_valor", Json.scalar(value)); return this; }
 public java.math.BigDecimal getFcpValor() { return decimalValue(field("fcp_valor")); }
 public MonitorDocumentNfeTotais setFcpValor(java.math.BigDecimal value) { put("fcp_valor", Json.scalar(value)); return this; }
 public java.math.BigDecimal getIcmsStBc() { return decimalValue(field("icms_st_bc")); }
 public MonitorDocumentNfeTotais setIcmsStBc(java.math.BigDecimal value) { put("icms_st_bc", Json.scalar(value)); return this; }
}
