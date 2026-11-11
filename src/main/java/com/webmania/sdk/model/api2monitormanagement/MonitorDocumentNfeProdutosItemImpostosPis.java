package com.webmania.sdk.model.api2monitormanagement;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/monitor-management.openapi.json; see contract-provenance.json. */
public final class MonitorDocumentNfeProdutosItemImpostosPis extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("pis_aliquota", "pis_bc", "situacao_tributaria", "valor", "pis_quantidade_bc", "pis_valor", "aliquota", "base_calculo", "pis_aliquota_valor");
 public MonitorDocumentNfeProdutosItemImpostosPis() { super(FIELDS); }
 public MonitorDocumentNfeProdutosItemImpostosPis(JsonNode node) { super(node, FIELDS); }
 public java.math.BigDecimal getPisAliquota() { return decimalValue(field("pis_aliquota")); }
 public MonitorDocumentNfeProdutosItemImpostosPis setPisAliquota(java.math.BigDecimal value) { put("pis_aliquota", Json.scalar(value)); return this; }
 public java.math.BigDecimal getPisBc() { return decimalValue(field("pis_bc")); }
 public MonitorDocumentNfeProdutosItemImpostosPis setPisBc(java.math.BigDecimal value) { put("pis_bc", Json.scalar(value)); return this; }
 public String getSituacaoTributaria() { return stringValue(field("situacao_tributaria")); }
 public MonitorDocumentNfeProdutosItemImpostosPis setSituacaoTributaria(String value) { put("situacao_tributaria", Json.scalar(value)); return this; }
 public java.math.BigDecimal getValor() { return decimalValue(field("valor")); }
 public MonitorDocumentNfeProdutosItemImpostosPis setValor(java.math.BigDecimal value) { put("valor", Json.scalar(value)); return this; }
 public java.math.BigDecimal getPisQuantidadeBc() { return decimalValue(field("pis_quantidade_bc")); }
 public MonitorDocumentNfeProdutosItemImpostosPis setPisQuantidadeBc(java.math.BigDecimal value) { put("pis_quantidade_bc", Json.scalar(value)); return this; }
 public java.math.BigDecimal getPisValor() { return decimalValue(field("pis_valor")); }
 public MonitorDocumentNfeProdutosItemImpostosPis setPisValor(java.math.BigDecimal value) { put("pis_valor", Json.scalar(value)); return this; }
 public java.math.BigDecimal getAliquota() { return decimalValue(field("aliquota")); }
 public MonitorDocumentNfeProdutosItemImpostosPis setAliquota(java.math.BigDecimal value) { put("aliquota", Json.scalar(value)); return this; }
 public java.math.BigDecimal getBaseCalculo() { return decimalValue(field("base_calculo")); }
 public MonitorDocumentNfeProdutosItemImpostosPis setBaseCalculo(java.math.BigDecimal value) { put("base_calculo", Json.scalar(value)); return this; }
 public java.math.BigDecimal getPisAliquotaValor() { return decimalValue(field("pis_aliquota_valor")); }
 public MonitorDocumentNfeProdutosItemImpostosPis setPisAliquotaValor(java.math.BigDecimal value) { put("pis_aliquota_valor", Json.scalar(value)); return this; }
}
