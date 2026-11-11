package com.webmania.sdk.model.api2nfseissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/nfse-issuance.openapi.json; see contract-provenance.json. */
public final class NfseDocumentedGroup700 extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("uuid", "modelo", "status", "motivo", "numero_lote", "serie_lote", "quantidade_rps", "protocolo", "info_nfse", "log", "atualizado_em");
 public NfseDocumentedGroup700() { super(FIELDS); }
 public NfseDocumentedGroup700(JsonNode node) { super(node, FIELDS); }
 public String getUuid() { return stringValue(field("uuid")); }
 public NfseDocumentedGroup700 setUuid(String value) { put("uuid", Json.scalar(value)); return this; }
 public String getModelo() { return stringValue(field("modelo")); }
 public NfseDocumentedGroup700 setModelo(String value) { put("modelo", Json.scalar(value)); return this; }
 public String getStatus() { return stringValue(field("status")); }
 public NfseDocumentedGroup700 setStatus(String value) { put("status", Json.scalar(value)); return this; }
 public String getMotivo() { return stringValue(field("motivo")); }
 public NfseDocumentedGroup700 setMotivo(String value) { put("motivo", Json.scalar(value)); return this; }
 public String getNumeroLote() { return stringValue(field("numero_lote")); }
 public NfseDocumentedGroup700 setNumeroLote(String value) { put("numero_lote", Json.scalar(value)); return this; }
 public String getSerieLote() { return stringValue(field("serie_lote")); }
 public NfseDocumentedGroup700 setSerieLote(String value) { put("serie_lote", Json.scalar(value)); return this; }
 public String getQuantidadeRps() { return stringValue(field("quantidade_rps")); }
 public NfseDocumentedGroup700 setQuantidadeRps(String value) { put("quantidade_rps", Json.scalar(value)); return this; }
 public String getProtocolo() { return stringValue(field("protocolo")); }
 public NfseDocumentedGroup700 setProtocolo(String value) { put("protocolo", Json.scalar(value)); return this; }
 public java.util.List<JsonValue> getInfoNfse() { return list(field("info_nfse"), v -> (v).isNull() || (v).isMissingNode() ? null : new JsonValue(v)); }
 public NfseDocumentedGroup700 setInfoNfse(java.util.List<JsonValue> value) { put("info_nfse", array(value, v -> v == null ? null : v.toJson())); return this; }
 public NfseDocumentedGroup700Log getLog() { return (field("log")).isNull() || (field("log")).isMissingNode() ? null : new NfseDocumentedGroup700Log(field("log")); }
 public NfseDocumentedGroup700 setLog(NfseDocumentedGroup700Log value) { put("log", value == null ? null : value.toJson()); return this; }
 public String getAtualizadoEm() { return stringValue(field("atualizado_em")); }
 public NfseDocumentedGroup700 setAtualizadoEm(String value) { put("atualizado_em", Json.scalar(value)); return this; }
}
