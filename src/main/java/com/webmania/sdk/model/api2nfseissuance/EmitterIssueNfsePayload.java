package com.webmania.sdk.model.api2nfseissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/nfse-issuance.openapi.json; see contract-provenance.json. */
public final class EmitterIssueNfsePayload extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("ID", "ambiente", "csv", "data_agendamento", "linha_csv", "origem", "rps", "sincrono", "url_notificacao");
 public EmitterIssueNfsePayload() { super(FIELDS); }
 public EmitterIssueNfsePayload(JsonNode node) { super(node, FIELDS); }
 public String getID() { return stringValue(field("ID")); }
 public EmitterIssueNfsePayload setID(String value) { put("ID", Json.scalar(value)); return this; }
 public JsonValue getAmbiente() { return (field("ambiente")).isNull() || (field("ambiente")).isMissingNode() ? null : new JsonValue(field("ambiente")); }
 public EmitterIssueNfsePayload setAmbiente(JsonValue value) { put("ambiente", value == null ? null : value.toJson()); return this; }
 public String getCsv() { return stringValue(field("csv")); }
 public EmitterIssueNfsePayload setCsv(String value) { put("csv", Json.scalar(value)); return this; }
 public String getDataAgendamento() { return stringValue(field("data_agendamento")); }
 public EmitterIssueNfsePayload setDataAgendamento(String value) { put("data_agendamento", Json.scalar(value)); return this; }
 public EmitterIssueNfsePayloadLinhaCsv getLinhaCsv() { return (field("linha_csv")).isNull() || (field("linha_csv")).isMissingNode() ? null : new EmitterIssueNfsePayloadLinhaCsv(field("linha_csv")); }
 public EmitterIssueNfsePayload setLinhaCsv(EmitterIssueNfsePayloadLinhaCsv value) { put("linha_csv", value == null ? null : value.toJson()); return this; }
 public String getOrigem() { return stringValue(field("origem")); }
 public EmitterIssueNfsePayload setOrigem(String value) { put("origem", Json.scalar(value)); return this; }
 public java.util.List<EmitterIssueNfsePayloadRpsItem> getRps() { return list(field("rps"), v -> (v).isNull() || (v).isMissingNode() ? null : new EmitterIssueNfsePayloadRpsItem(v)); }
 public EmitterIssueNfsePayload setRps(java.util.List<EmitterIssueNfsePayloadRpsItem> value) { put("rps", array(value, v -> v == null ? null : v.toJson())); return this; }
 public EmitterIssueNfsePayloadSincrono getSincrono() { return (field("sincrono")).isNull() || (field("sincrono")).isMissingNode() ? null : new EmitterIssueNfsePayloadSincrono(field("sincrono")); }
 public EmitterIssueNfsePayload setSincrono(EmitterIssueNfsePayloadSincrono value) { put("sincrono", value == null ? null : value.toJson()); return this; }
 public String getUrlNotificacao() { return stringValue(field("url_notificacao")); }
 public EmitterIssueNfsePayload setUrlNotificacao(String value) { put("url_notificacao", Json.scalar(value)); return this; }
}
