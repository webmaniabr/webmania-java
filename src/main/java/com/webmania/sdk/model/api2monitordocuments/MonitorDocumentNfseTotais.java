package com.webmania.sdk.model.api2monitordocuments;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/monitor-documents.openapi.json; see contract-provenance.json. */
public final class MonitorDocumentNfseTotais extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("valor", "desconto_incondicionado", "desconto_condicionado", "iss_valor", "pis_valor", "cofins_valor", "inss_valor", "ir_valor", "csll_valor", "cp_valor");
 public MonitorDocumentNfseTotais() { super(FIELDS); }
 public MonitorDocumentNfseTotais(JsonNode node) { super(node, FIELDS); }
 public java.math.BigDecimal getValor() { return decimalValue(field("valor")); }
 public MonitorDocumentNfseTotais setValor(java.math.BigDecimal value) { put("valor", Json.scalar(value)); return this; }
 public java.math.BigDecimal getDescontoIncondicionado() { return decimalValue(field("desconto_incondicionado")); }
 public MonitorDocumentNfseTotais setDescontoIncondicionado(java.math.BigDecimal value) { put("desconto_incondicionado", Json.scalar(value)); return this; }
 public java.math.BigDecimal getDescontoCondicionado() { return decimalValue(field("desconto_condicionado")); }
 public MonitorDocumentNfseTotais setDescontoCondicionado(java.math.BigDecimal value) { put("desconto_condicionado", Json.scalar(value)); return this; }
 public java.math.BigDecimal getIssValor() { return decimalValue(field("iss_valor")); }
 public MonitorDocumentNfseTotais setIssValor(java.math.BigDecimal value) { put("iss_valor", Json.scalar(value)); return this; }
 public java.math.BigDecimal getPisValor() { return decimalValue(field("pis_valor")); }
 public MonitorDocumentNfseTotais setPisValor(java.math.BigDecimal value) { put("pis_valor", Json.scalar(value)); return this; }
 public java.math.BigDecimal getCofinsValor() { return decimalValue(field("cofins_valor")); }
 public MonitorDocumentNfseTotais setCofinsValor(java.math.BigDecimal value) { put("cofins_valor", Json.scalar(value)); return this; }
 public java.math.BigDecimal getInssValor() { return decimalValue(field("inss_valor")); }
 public MonitorDocumentNfseTotais setInssValor(java.math.BigDecimal value) { put("inss_valor", Json.scalar(value)); return this; }
 public java.math.BigDecimal getIrValor() { return decimalValue(field("ir_valor")); }
 public MonitorDocumentNfseTotais setIrValor(java.math.BigDecimal value) { put("ir_valor", Json.scalar(value)); return this; }
 public java.math.BigDecimal getCsllValor() { return decimalValue(field("csll_valor")); }
 public MonitorDocumentNfseTotais setCsllValor(java.math.BigDecimal value) { put("csll_valor", Json.scalar(value)); return this; }
 public java.math.BigDecimal getCpValor() { return decimalValue(field("cp_valor")); }
 public MonitorDocumentNfseTotais setCpValor(java.math.BigDecimal value) { put("cp_valor", Json.scalar(value)); return this; }
}
