package com.webmania.sdk.model.api1fiscal;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api1/fiscal.openapi.json; see contract-provenance.json. */
public final class FiscalReportRequest extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("data_inicio", "data_final", "numero_inicio", "numero_final", "modelo", "relatorio", "separar_pdf", "status", "ordem", "url_notificacao", "email");
 public FiscalReportRequest() { super(FIELDS); }
 public FiscalReportRequest(JsonNode node) { super(node, FIELDS); }
 public String getDataInicio() { return stringValue(field("data_inicio")); }
 public FiscalReportRequest setDataInicio(String value) { put("data_inicio", Json.scalar(value)); return this; }
 public String getDataFinal() { return stringValue(field("data_final")); }
 public FiscalReportRequest setDataFinal(String value) { put("data_final", Json.scalar(value)); return this; }
 public String getNumeroInicio() { return stringValue(field("numero_inicio")); }
 public FiscalReportRequest setNumeroInicio(String value) { put("numero_inicio", Json.scalar(value)); return this; }
 public String getNumeroFinal() { return stringValue(field("numero_final")); }
 public FiscalReportRequest setNumeroFinal(String value) { put("numero_final", Json.scalar(value)); return this; }
 public String getModelo() { return stringValue(field("modelo")); }
 public FiscalReportRequest setModelo(String value) { put("modelo", Json.scalar(value)); return this; }
 public String getRelatorio() { return stringValue(field("relatorio")); }
 public FiscalReportRequest setRelatorio(String value) { put("relatorio", Json.scalar(value)); return this; }
 public java.math.BigInteger getSepararPdf() { return integerValue(field("separar_pdf")); }
 public FiscalReportRequest setSepararPdf(java.math.BigInteger value) { put("separar_pdf", Json.scalar(value)); return this; }
 public String getStatus() { return stringValue(field("status")); }
 public FiscalReportRequest setStatus(String value) { put("status", Json.scalar(value)); return this; }
 public String getOrdem() { return stringValue(field("ordem")); }
 public FiscalReportRequest setOrdem(String value) { put("ordem", Json.scalar(value)); return this; }
 public String getUrlNotificacao() { return stringValue(field("url_notificacao")); }
 public FiscalReportRequest setUrlNotificacao(String value) { put("url_notificacao", Json.scalar(value)); return this; }
 public String getEmail() { return stringValue(field("email")); }
 public FiscalReportRequest setEmail(String value) { put("email", Json.scalar(value)); return this; }
}
