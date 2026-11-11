package com.webmania.sdk.model.api1fiscal;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api1/fiscal.openapi.json; see contract-provenance.json. */
public final class FiscalReportResult extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("uuid", "status", "data_inicio", "data_final", "numero_inicio", "numero_final", "modelo", "relatorio", "total", "processado", "url", "expira", "reason");
 public FiscalReportResult() { super(FIELDS); }
 public FiscalReportResult(JsonNode node) { super(node, FIELDS); }
 public Uuid getUuid() { return (field("uuid")).isNull() || (field("uuid")).isMissingNode() ? null : new Uuid(field("uuid")); }
 public FiscalReportResult setUuid(Uuid value) { put("uuid", value == null ? null : value.toJson()); return this; }
 public String getStatus() { return stringValue(field("status")); }
 public FiscalReportResult setStatus(String value) { put("status", Json.scalar(value)); return this; }
 public String getDataInicio() { return stringValue(field("data_inicio")); }
 public FiscalReportResult setDataInicio(String value) { put("data_inicio", Json.scalar(value)); return this; }
 public String getDataFinal() { return stringValue(field("data_final")); }
 public FiscalReportResult setDataFinal(String value) { put("data_final", Json.scalar(value)); return this; }
 public FiscalReportResultNumeroInicio getNumeroInicio() { return (field("numero_inicio")).isNull() || (field("numero_inicio")).isMissingNode() ? null : new FiscalReportResultNumeroInicio(field("numero_inicio")); }
 public FiscalReportResult setNumeroInicio(FiscalReportResultNumeroInicio value) { put("numero_inicio", value == null ? null : value.toJson()); return this; }
 public FiscalReportResultNumeroFinal getNumeroFinal() { return (field("numero_final")).isNull() || (field("numero_final")).isMissingNode() ? null : new FiscalReportResultNumeroFinal(field("numero_final")); }
 public FiscalReportResult setNumeroFinal(FiscalReportResultNumeroFinal value) { put("numero_final", value == null ? null : value.toJson()); return this; }
 public String getModelo() { return stringValue(field("modelo")); }
 public FiscalReportResult setModelo(String value) { put("modelo", Json.scalar(value)); return this; }
 public String getRelatorio() { return stringValue(field("relatorio")); }
 public FiscalReportResult setRelatorio(String value) { put("relatorio", Json.scalar(value)); return this; }
 public java.math.BigInteger getTotal() { return integerValue(field("total")); }
 public FiscalReportResult setTotal(java.math.BigInteger value) { put("total", Json.scalar(value)); return this; }
 public java.math.BigInteger getProcessado() { return integerValue(field("processado")); }
 public FiscalReportResult setProcessado(java.math.BigInteger value) { put("processado", Json.scalar(value)); return this; }
 public String getUrl() { return stringValue(field("url")); }
 public FiscalReportResult setUrl(String value) { put("url", Json.scalar(value)); return this; }
 public String getExpira() { return stringValue(field("expira")); }
 public FiscalReportResult setExpira(String value) { put("expira", Json.scalar(value)); return this; }
 public String getReason() { return stringValue(field("reason")); }
 public FiscalReportResult setReason(String value) { put("reason", Json.scalar(value)); return this; }
}
