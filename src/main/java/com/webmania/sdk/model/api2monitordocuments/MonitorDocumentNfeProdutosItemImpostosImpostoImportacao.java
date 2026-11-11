package com.webmania.sdk.model.api2monitordocuments;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/monitor-documents.openapi.json; see contract-provenance.json. */
public final class MonitorDocumentNfeProdutosItemImpostosImpostoImportacao extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("ii_bc", "despesas_aduaneiras", "ii_valor", "iof_valor");
 public MonitorDocumentNfeProdutosItemImpostosImpostoImportacao() { super(FIELDS); }
 public MonitorDocumentNfeProdutosItemImpostosImpostoImportacao(JsonNode node) { super(node, FIELDS); }
 public java.math.BigDecimal getIiBc() { return decimalValue(field("ii_bc")); }
 public MonitorDocumentNfeProdutosItemImpostosImpostoImportacao setIiBc(java.math.BigDecimal value) { put("ii_bc", Json.scalar(value)); return this; }
 public java.math.BigDecimal getDespesasAduaneiras() { return decimalValue(field("despesas_aduaneiras")); }
 public MonitorDocumentNfeProdutosItemImpostosImpostoImportacao setDespesasAduaneiras(java.math.BigDecimal value) { put("despesas_aduaneiras", Json.scalar(value)); return this; }
 public java.math.BigDecimal getIiValor() { return decimalValue(field("ii_valor")); }
 public MonitorDocumentNfeProdutosItemImpostosImpostoImportacao setIiValor(java.math.BigDecimal value) { put("ii_valor", Json.scalar(value)); return this; }
 public java.math.BigDecimal getIofValor() { return decimalValue(field("iof_valor")); }
 public MonitorDocumentNfeProdutosItemImpostosImpostoImportacao setIofValor(java.math.BigDecimal value) { put("iof_valor", Json.scalar(value)); return this; }
}
