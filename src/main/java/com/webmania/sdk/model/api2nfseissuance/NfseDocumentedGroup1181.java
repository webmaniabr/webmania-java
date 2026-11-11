package com.webmania.sdk.model.api2nfseissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/nfse-issuance.openapi.json; see contract-provenance.json. */
public final class NfseDocumentedGroup1181 extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("uuid", "modelo", "status", "motivo", "numero", "codigo_verificacao", "serie_rps", "numero_rps", "xml", "pdf_nfse", "pdf_nfse_status", "pdf_rps", "log");
 public NfseDocumentedGroup1181() { super(FIELDS); }
 public NfseDocumentedGroup1181(JsonNode node) { super(node, FIELDS); }
 public String getUuid() { return stringValue(field("uuid")); }
 public NfseDocumentedGroup1181 setUuid(String value) { put("uuid", Json.scalar(value)); return this; }
 public String getModelo() { return stringValue(field("modelo")); }
 public NfseDocumentedGroup1181 setModelo(String value) { put("modelo", Json.scalar(value)); return this; }
 public String getStatus() { return stringValue(field("status")); }
 public NfseDocumentedGroup1181 setStatus(String value) { put("status", Json.scalar(value)); return this; }
 public String getMotivo() { return stringValue(field("motivo")); }
 public NfseDocumentedGroup1181 setMotivo(String value) { put("motivo", Json.scalar(value)); return this; }
 public String getNumero() { return stringValue(field("numero")); }
 public NfseDocumentedGroup1181 setNumero(String value) { put("numero", Json.scalar(value)); return this; }
 public String getCodigoVerificacao() { return stringValue(field("codigo_verificacao")); }
 public NfseDocumentedGroup1181 setCodigoVerificacao(String value) { put("codigo_verificacao", Json.scalar(value)); return this; }
 public String getSerieRps() { return stringValue(field("serie_rps")); }
 public NfseDocumentedGroup1181 setSerieRps(String value) { put("serie_rps", Json.scalar(value)); return this; }
 public String getNumeroRps() { return stringValue(field("numero_rps")); }
 public NfseDocumentedGroup1181 setNumeroRps(String value) { put("numero_rps", Json.scalar(value)); return this; }
 public String getXml() { return stringValue(field("xml")); }
 public NfseDocumentedGroup1181 setXml(String value) { put("xml", Json.scalar(value)); return this; }
 public String getPdfNfse() { return stringValue(field("pdf_nfse")); }
 public NfseDocumentedGroup1181 setPdfNfse(String value) { put("pdf_nfse", Json.scalar(value)); return this; }
 public String getPdfNfseStatus() { return stringValue(field("pdf_nfse_status")); }
 public NfseDocumentedGroup1181 setPdfNfseStatus(String value) { put("pdf_nfse_status", Json.scalar(value)); return this; }
 public String getPdfRps() { return stringValue(field("pdf_rps")); }
 public NfseDocumentedGroup1181 setPdfRps(String value) { put("pdf_rps", Json.scalar(value)); return this; }
 public NfseDocumentedGroup1181Log getLog() { return (field("log")).isNull() || (field("log")).isMissingNode() ? null : new NfseDocumentedGroup1181Log(field("log")); }
 public NfseDocumentedGroup1181 setLog(NfseDocumentedGroup1181Log value) { put("log", value == null ? null : value.toJson()); return this; }
}
