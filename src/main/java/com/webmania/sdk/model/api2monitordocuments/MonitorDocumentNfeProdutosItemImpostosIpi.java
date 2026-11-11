package com.webmania.sdk.model.api2monitordocuments;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/monitor-documents.openapi.json; see contract-provenance.json. */
public final class MonitorDocumentNfeProdutosItemImpostosIpi extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("situacao_tributaria", "valor", "qtd_selo", "codigo_selo", "aliquota", "base_calculo", "ipi_aliquota", "ipi_valor", "ipi_bc", "codigo_enquadramento");
 public MonitorDocumentNfeProdutosItemImpostosIpi() { super(FIELDS); }
 public MonitorDocumentNfeProdutosItemImpostosIpi(JsonNode node) { super(node, FIELDS); }
 public String getSituacaoTributaria() { return stringValue(field("situacao_tributaria")); }
 public MonitorDocumentNfeProdutosItemImpostosIpi setSituacaoTributaria(String value) { put("situacao_tributaria", Json.scalar(value)); return this; }
 public java.math.BigDecimal getValor() { return decimalValue(field("valor")); }
 public MonitorDocumentNfeProdutosItemImpostosIpi setValor(java.math.BigDecimal value) { put("valor", Json.scalar(value)); return this; }
 public java.math.BigDecimal getQtdSelo() { return decimalValue(field("qtd_selo")); }
 public MonitorDocumentNfeProdutosItemImpostosIpi setQtdSelo(java.math.BigDecimal value) { put("qtd_selo", Json.scalar(value)); return this; }
 public String getCodigoSelo() { return stringValue(field("codigo_selo")); }
 public MonitorDocumentNfeProdutosItemImpostosIpi setCodigoSelo(String value) { put("codigo_selo", Json.scalar(value)); return this; }
 public java.math.BigDecimal getAliquota() { return decimalValue(field("aliquota")); }
 public MonitorDocumentNfeProdutosItemImpostosIpi setAliquota(java.math.BigDecimal value) { put("aliquota", Json.scalar(value)); return this; }
 public java.math.BigDecimal getBaseCalculo() { return decimalValue(field("base_calculo")); }
 public MonitorDocumentNfeProdutosItemImpostosIpi setBaseCalculo(java.math.BigDecimal value) { put("base_calculo", Json.scalar(value)); return this; }
 public java.math.BigDecimal getIpiAliquota() { return decimalValue(field("ipi_aliquota")); }
 public MonitorDocumentNfeProdutosItemImpostosIpi setIpiAliquota(java.math.BigDecimal value) { put("ipi_aliquota", Json.scalar(value)); return this; }
 public java.math.BigDecimal getIpiValor() { return decimalValue(field("ipi_valor")); }
 public MonitorDocumentNfeProdutosItemImpostosIpi setIpiValor(java.math.BigDecimal value) { put("ipi_valor", Json.scalar(value)); return this; }
 public java.math.BigDecimal getIpiBc() { return decimalValue(field("ipi_bc")); }
 public MonitorDocumentNfeProdutosItemImpostosIpi setIpiBc(java.math.BigDecimal value) { put("ipi_bc", Json.scalar(value)); return this; }
 public String getCodigoEnquadramento() { return stringValue(field("codigo_enquadramento")); }
 public MonitorDocumentNfeProdutosItemImpostosIpi setCodigoEnquadramento(String value) { put("codigo_enquadramento", Json.scalar(value)); return this; }
}
