package com.webmania.sdk.model.api2nfseissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/nfse-issuance.openapi.json; see contract-provenance.json. */
public final class NfseDocumentedGroup829 extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("uuid", "modelo", "status", "motivo", "numero", "codigo_verificacao", "serie_rps", "numero_rps", "xml", "pdf_nfse", "pdf_nfse_status", "pdf_rps", "log", "atualizado_em");
 public NfseDocumentedGroup829() { super(FIELDS); }
 public NfseDocumentedGroup829(JsonNode node) { super(node, FIELDS); }
 public String getUuid() { return stringValue(field("uuid")); }
 public NfseDocumentedGroup829 setUuid(String value) { put("uuid", Json.scalar(value)); return this; }
 public String getModelo() { return stringValue(field("modelo")); }
 public NfseDocumentedGroup829 setModelo(String value) { put("modelo", Json.scalar(value)); return this; }
 public String getStatus() { return stringValue(field("status")); }
 public NfseDocumentedGroup829 setStatus(String value) { put("status", Json.scalar(value)); return this; }
 public String getMotivo() { return stringValue(field("motivo")); }
 public NfseDocumentedGroup829 setMotivo(String value) { put("motivo", Json.scalar(value)); return this; }
 public String getNumero() { return stringValue(field("numero")); }
 public NfseDocumentedGroup829 setNumero(String value) { put("numero", Json.scalar(value)); return this; }
 public String getCodigoVerificacao() { return stringValue(field("codigo_verificacao")); }
 public NfseDocumentedGroup829 setCodigoVerificacao(String value) { put("codigo_verificacao", Json.scalar(value)); return this; }
 public String getSerieRps() { return stringValue(field("serie_rps")); }
 public NfseDocumentedGroup829 setSerieRps(String value) { put("serie_rps", Json.scalar(value)); return this; }
 public String getNumeroRps() { return stringValue(field("numero_rps")); }
 public NfseDocumentedGroup829 setNumeroRps(String value) { put("numero_rps", Json.scalar(value)); return this; }
 public String getXml() { return stringValue(field("xml")); }
 public NfseDocumentedGroup829 setXml(String value) { put("xml", Json.scalar(value)); return this; }
 public String getPdfNfse() { return stringValue(field("pdf_nfse")); }
 public NfseDocumentedGroup829 setPdfNfse(String value) { put("pdf_nfse", Json.scalar(value)); return this; }
 public String getPdfNfseStatus() { return stringValue(field("pdf_nfse_status")); }
 public NfseDocumentedGroup829 setPdfNfseStatus(String value) { put("pdf_nfse_status", Json.scalar(value)); return this; }
 public String getPdfRps() { return stringValue(field("pdf_rps")); }
 public NfseDocumentedGroup829 setPdfRps(String value) { put("pdf_rps", Json.scalar(value)); return this; }
 public NfseDocumentedGroup829Log getLog() { return (field("log")).isNull() || (field("log")).isMissingNode() ? null : new NfseDocumentedGroup829Log(field("log")); }
 public NfseDocumentedGroup829 setLog(NfseDocumentedGroup829Log value) { put("log", value == null ? null : value.toJson()); return this; }
 public String getAtualizadoEm() { return stringValue(field("atualizado_em")); }
 public NfseDocumentedGroup829 setAtualizadoEm(String value) { put("atualizado_em", Json.scalar(value)); return this; }
}
