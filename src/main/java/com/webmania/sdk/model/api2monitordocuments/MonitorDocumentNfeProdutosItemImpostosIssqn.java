package com.webmania.sdk.model.api2monitordocuments;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/monitor-documents.openapi.json; see contract-provenance.json. */
public final class MonitorDocumentNfeProdutosItemImpostosIssqn extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("iss_bc", "iss_aliquota", "iss_valor", "municipio_fato_gerador", "item_servico", "deducao", "retencoes", "desconto_incondicionado", "desconto_condicionado", "iss_retido_valor", "exigibilidade", "codigo_servico", "municipio_incidencia", "pais", "processo", "incentivo_fiscal");
 public MonitorDocumentNfeProdutosItemImpostosIssqn() { super(FIELDS); }
 public MonitorDocumentNfeProdutosItemImpostosIssqn(JsonNode node) { super(node, FIELDS); }
 public java.math.BigDecimal getIssBc() { return decimalValue(field("iss_bc")); }
 public MonitorDocumentNfeProdutosItemImpostosIssqn setIssBc(java.math.BigDecimal value) { put("iss_bc", Json.scalar(value)); return this; }
 public java.math.BigDecimal getIssAliquota() { return decimalValue(field("iss_aliquota")); }
 public MonitorDocumentNfeProdutosItemImpostosIssqn setIssAliquota(java.math.BigDecimal value) { put("iss_aliquota", Json.scalar(value)); return this; }
 public java.math.BigDecimal getIssValor() { return decimalValue(field("iss_valor")); }
 public MonitorDocumentNfeProdutosItemImpostosIssqn setIssValor(java.math.BigDecimal value) { put("iss_valor", Json.scalar(value)); return this; }
 public String getMunicipioFatoGerador() { return stringValue(field("municipio_fato_gerador")); }
 public MonitorDocumentNfeProdutosItemImpostosIssqn setMunicipioFatoGerador(String value) { put("municipio_fato_gerador", Json.scalar(value)); return this; }
 public String getItemServico() { return stringValue(field("item_servico")); }
 public MonitorDocumentNfeProdutosItemImpostosIssqn setItemServico(String value) { put("item_servico", Json.scalar(value)); return this; }
 public java.math.BigDecimal getDeducao() { return decimalValue(field("deducao")); }
 public MonitorDocumentNfeProdutosItemImpostosIssqn setDeducao(java.math.BigDecimal value) { put("deducao", Json.scalar(value)); return this; }
 public java.math.BigDecimal getRetencoes() { return decimalValue(field("retencoes")); }
 public MonitorDocumentNfeProdutosItemImpostosIssqn setRetencoes(java.math.BigDecimal value) { put("retencoes", Json.scalar(value)); return this; }
 public java.math.BigDecimal getDescontoIncondicionado() { return decimalValue(field("desconto_incondicionado")); }
 public MonitorDocumentNfeProdutosItemImpostosIssqn setDescontoIncondicionado(java.math.BigDecimal value) { put("desconto_incondicionado", Json.scalar(value)); return this; }
 public java.math.BigDecimal getDescontoCondicionado() { return decimalValue(field("desconto_condicionado")); }
 public MonitorDocumentNfeProdutosItemImpostosIssqn setDescontoCondicionado(java.math.BigDecimal value) { put("desconto_condicionado", Json.scalar(value)); return this; }
 public java.math.BigDecimal getIssRetidoValor() { return decimalValue(field("iss_retido_valor")); }
 public MonitorDocumentNfeProdutosItemImpostosIssqn setIssRetidoValor(java.math.BigDecimal value) { put("iss_retido_valor", Json.scalar(value)); return this; }
 public String getExigibilidade() { return stringValue(field("exigibilidade")); }
 public MonitorDocumentNfeProdutosItemImpostosIssqn setExigibilidade(String value) { put("exigibilidade", Json.scalar(value)); return this; }
 public String getCodigoServico() { return stringValue(field("codigo_servico")); }
 public MonitorDocumentNfeProdutosItemImpostosIssqn setCodigoServico(String value) { put("codigo_servico", Json.scalar(value)); return this; }
 public String getMunicipioIncidencia() { return stringValue(field("municipio_incidencia")); }
 public MonitorDocumentNfeProdutosItemImpostosIssqn setMunicipioIncidencia(String value) { put("municipio_incidencia", Json.scalar(value)); return this; }
 public String getPais() { return stringValue(field("pais")); }
 public MonitorDocumentNfeProdutosItemImpostosIssqn setPais(String value) { put("pais", Json.scalar(value)); return this; }
 public String getProcesso() { return stringValue(field("processo")); }
 public MonitorDocumentNfeProdutosItemImpostosIssqn setProcesso(String value) { put("processo", Json.scalar(value)); return this; }
 public String getIncentivoFiscal() { return stringValue(field("incentivo_fiscal")); }
 public MonitorDocumentNfeProdutosItemImpostosIssqn setIncentivoFiscal(String value) { put("incentivo_fiscal", Json.scalar(value)); return this; }
}
