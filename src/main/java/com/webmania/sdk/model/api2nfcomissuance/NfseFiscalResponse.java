package com.webmania.sdk.model.api2nfcomissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/nfcom-issuance.openapi.json; see contract-provenance.json. */
public final class NfseFiscalResponse extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("ID", "uuid", "modelo", "status", "chave", "numero_lote", "serie_lote", "protocolo", "numero", "codigo_verificacao", "serie_rps", "numero_rps", "xml", "xml_cancelamento", "pdf_nfse", "pdf_nfse_status", "pdf_rps", "atualizado_em", "motivo", "quantidade_rps", "nfse_substituida", "info_nfse", "log");
 public NfseFiscalResponse() { super(FIELDS); }
 public NfseFiscalResponse(JsonNode node) { super(node, FIELDS); }
 public String getID() { return stringValue(field("ID")); }
 public NfseFiscalResponse setID(String value) { put("ID", Json.scalar(value)); return this; }
 public String getUuid() { return stringValue(field("uuid")); }
 public NfseFiscalResponse setUuid(String value) { put("uuid", Json.scalar(value)); return this; }
 public String getModelo() { return stringValue(field("modelo")); }
 public NfseFiscalResponse setModelo(String value) { put("modelo", Json.scalar(value)); return this; }
 public String getStatus() { return stringValue(field("status")); }
 public NfseFiscalResponse setStatus(String value) { put("status", Json.scalar(value)); return this; }
 public String getChave() { return stringValue(field("chave")); }
 public NfseFiscalResponse setChave(String value) { put("chave", Json.scalar(value)); return this; }
 public NfseFiscalResponseNumeroLote getNumeroLote() { return (field("numero_lote")).isNull() || (field("numero_lote")).isMissingNode() ? null : new NfseFiscalResponseNumeroLote(field("numero_lote")); }
 public NfseFiscalResponse setNumeroLote(NfseFiscalResponseNumeroLote value) { put("numero_lote", value == null ? null : value.toJson()); return this; }
 public NfseFiscalResponseSerieLote getSerieLote() { return (field("serie_lote")).isNull() || (field("serie_lote")).isMissingNode() ? null : new NfseFiscalResponseSerieLote(field("serie_lote")); }
 public NfseFiscalResponse setSerieLote(NfseFiscalResponseSerieLote value) { put("serie_lote", value == null ? null : value.toJson()); return this; }
 public String getProtocolo() { return stringValue(field("protocolo")); }
 public NfseFiscalResponse setProtocolo(String value) { put("protocolo", Json.scalar(value)); return this; }
 public String getNumero() { return stringValue(field("numero")); }
 public NfseFiscalResponse setNumero(String value) { put("numero", Json.scalar(value)); return this; }
 public String getCodigoVerificacao() { return stringValue(field("codigo_verificacao")); }
 public NfseFiscalResponse setCodigoVerificacao(String value) { put("codigo_verificacao", Json.scalar(value)); return this; }
 public NfseFiscalResponseSerieRps getSerieRps() { return (field("serie_rps")).isNull() || (field("serie_rps")).isMissingNode() ? null : new NfseFiscalResponseSerieRps(field("serie_rps")); }
 public NfseFiscalResponse setSerieRps(NfseFiscalResponseSerieRps value) { put("serie_rps", value == null ? null : value.toJson()); return this; }
 public NfseFiscalResponseNumeroRps getNumeroRps() { return (field("numero_rps")).isNull() || (field("numero_rps")).isMissingNode() ? null : new NfseFiscalResponseNumeroRps(field("numero_rps")); }
 public NfseFiscalResponse setNumeroRps(NfseFiscalResponseNumeroRps value) { put("numero_rps", value == null ? null : value.toJson()); return this; }
 public String getXml() { return stringValue(field("xml")); }
 public NfseFiscalResponse setXml(String value) { put("xml", Json.scalar(value)); return this; }
 public String getXmlCancelamento() { return stringValue(field("xml_cancelamento")); }
 public NfseFiscalResponse setXmlCancelamento(String value) { put("xml_cancelamento", Json.scalar(value)); return this; }
 public String getPdfNfse() { return stringValue(field("pdf_nfse")); }
 public NfseFiscalResponse setPdfNfse(String value) { put("pdf_nfse", Json.scalar(value)); return this; }
 public String getPdfNfseStatus() { return stringValue(field("pdf_nfse_status")); }
 public NfseFiscalResponse setPdfNfseStatus(String value) { put("pdf_nfse_status", Json.scalar(value)); return this; }
 public String getPdfRps() { return stringValue(field("pdf_rps")); }
 public NfseFiscalResponse setPdfRps(String value) { put("pdf_rps", Json.scalar(value)); return this; }
 public String getAtualizadoEm() { return stringValue(field("atualizado_em")); }
 public NfseFiscalResponse setAtualizadoEm(String value) { put("atualizado_em", Json.scalar(value)); return this; }
 public NfseFiscalResponseMotivo getMotivo() { return (field("motivo")).isNull() || (field("motivo")).isMissingNode() ? null : new NfseFiscalResponseMotivo(field("motivo")); }
 public NfseFiscalResponse setMotivo(NfseFiscalResponseMotivo value) { put("motivo", value == null ? null : value.toJson()); return this; }
 public NfseFiscalResponseQuantidadeRps getQuantidadeRps() { return (field("quantidade_rps")).isNull() || (field("quantidade_rps")).isMissingNode() ? null : new NfseFiscalResponseQuantidadeRps(field("quantidade_rps")); }
 public NfseFiscalResponse setQuantidadeRps(NfseFiscalResponseQuantidadeRps value) { put("quantidade_rps", value == null ? null : value.toJson()); return this; }
 public NfseFiscalResponseNfseSubstituida getNfseSubstituida() { return (field("nfse_substituida")).isNull() || (field("nfse_substituida")).isMissingNode() ? null : new NfseFiscalResponseNfseSubstituida(field("nfse_substituida")); }
 public NfseFiscalResponse setNfseSubstituida(NfseFiscalResponseNfseSubstituida value) { put("nfse_substituida", value == null ? null : value.toJson()); return this; }
 public java.util.List<NfseFiscalResponseInfoNfseItem> getInfoNfse() { return list(field("info_nfse"), v -> (v).isNull() || (v).isMissingNode() ? null : new NfseFiscalResponseInfoNfseItem(v)); }
 public NfseFiscalResponse setInfoNfse(java.util.List<NfseFiscalResponseInfoNfseItem> value) { put("info_nfse", array(value, v -> v == null ? null : v.toJson())); return this; }
 public NfseFiscalResponseLog getLog() { return (field("log")).isNull() || (field("log")).isMissingNode() ? null : new NfseFiscalResponseLog(field("log")); }
 public NfseFiscalResponse setLog(NfseFiscalResponseLog value) { put("log", value == null ? null : value.toJson()); return this; }
}
