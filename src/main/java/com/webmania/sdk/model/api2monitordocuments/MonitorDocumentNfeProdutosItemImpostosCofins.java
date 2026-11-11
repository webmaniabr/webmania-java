package com.webmania.sdk.model.api2monitordocuments;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/monitor-documents.openapi.json; see contract-provenance.json. */
public final class MonitorDocumentNfeProdutosItemImpostosCofins extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("cofins_bc", "situacao_tributaria", "valor", "cofins_valor", "aliquota", "base_calculo", "cofins_aliquota", "cofins_aliquota_valor", "cofins_quantidade_bc");
 public MonitorDocumentNfeProdutosItemImpostosCofins() { super(FIELDS); }
 public MonitorDocumentNfeProdutosItemImpostosCofins(JsonNode node) { super(node, FIELDS); }
 public java.math.BigDecimal getCofinsBc() { return decimalValue(field("cofins_bc")); }
 public MonitorDocumentNfeProdutosItemImpostosCofins setCofinsBc(java.math.BigDecimal value) { put("cofins_bc", Json.scalar(value)); return this; }
 public String getSituacaoTributaria() { return stringValue(field("situacao_tributaria")); }
 public MonitorDocumentNfeProdutosItemImpostosCofins setSituacaoTributaria(String value) { put("situacao_tributaria", Json.scalar(value)); return this; }
 public java.math.BigDecimal getValor() { return decimalValue(field("valor")); }
 public MonitorDocumentNfeProdutosItemImpostosCofins setValor(java.math.BigDecimal value) { put("valor", Json.scalar(value)); return this; }
 public java.math.BigDecimal getCofinsValor() { return decimalValue(field("cofins_valor")); }
 public MonitorDocumentNfeProdutosItemImpostosCofins setCofinsValor(java.math.BigDecimal value) { put("cofins_valor", Json.scalar(value)); return this; }
 public java.math.BigDecimal getAliquota() { return decimalValue(field("aliquota")); }
 public MonitorDocumentNfeProdutosItemImpostosCofins setAliquota(java.math.BigDecimal value) { put("aliquota", Json.scalar(value)); return this; }
 public java.math.BigDecimal getBaseCalculo() { return decimalValue(field("base_calculo")); }
 public MonitorDocumentNfeProdutosItemImpostosCofins setBaseCalculo(java.math.BigDecimal value) { put("base_calculo", Json.scalar(value)); return this; }
 public java.math.BigDecimal getCofinsAliquota() { return decimalValue(field("cofins_aliquota")); }
 public MonitorDocumentNfeProdutosItemImpostosCofins setCofinsAliquota(java.math.BigDecimal value) { put("cofins_aliquota", Json.scalar(value)); return this; }
 public java.math.BigDecimal getCofinsAliquotaValor() { return decimalValue(field("cofins_aliquota_valor")); }
 public MonitorDocumentNfeProdutosItemImpostosCofins setCofinsAliquotaValor(java.math.BigDecimal value) { put("cofins_aliquota_valor", Json.scalar(value)); return this; }
 public java.math.BigDecimal getCofinsQuantidadeBc() { return decimalValue(field("cofins_quantidade_bc")); }
 public MonitorDocumentNfeProdutosItemImpostosCofins setCofinsQuantidadeBc(java.math.BigDecimal value) { put("cofins_quantidade_bc", Json.scalar(value)); return this; }
}
