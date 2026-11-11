package com.webmania.sdk.model.api2nfseissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/nfse-issuance.openapi.json; see contract-provenance.json. */
public final class NfseDocumentedGroup6216 extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("ambiente", "manifestador", "evento", "motivo_rejeicao", "justificativa_rejeicao");
 public NfseDocumentedGroup6216() { super(FIELDS); }
 public NfseDocumentedGroup6216(JsonNode node) { super(node, FIELDS); }
 public NfseDocumentedGroup6216Ambiente getAmbiente() { return (field("ambiente")).isNull() || (field("ambiente")).isMissingNode() ? null : new NfseDocumentedGroup6216Ambiente(field("ambiente")); }
 public NfseDocumentedGroup6216 setAmbiente(NfseDocumentedGroup6216Ambiente value) { put("ambiente", value == null ? null : value.toJson()); return this; }
 public NfseDocumentedGroup6216Manifestador getManifestador() { return (field("manifestador")).isNull() || (field("manifestador")).isMissingNode() ? null : new NfseDocumentedGroup6216Manifestador(field("manifestador")); }
 public NfseDocumentedGroup6216 setManifestador(NfseDocumentedGroup6216Manifestador value) { put("manifestador", value == null ? null : value.toJson()); return this; }
 public NfseDocumentedGroup6216Evento getEvento() { return (field("evento")).isNull() || (field("evento")).isMissingNode() ? null : new NfseDocumentedGroup6216Evento(field("evento")); }
 public NfseDocumentedGroup6216 setEvento(NfseDocumentedGroup6216Evento value) { put("evento", value == null ? null : value.toJson()); return this; }
 public NfseDocumentedGroup6216MotivoRejeicao getMotivoRejeicao() { return (field("motivo_rejeicao")).isNull() || (field("motivo_rejeicao")).isMissingNode() ? null : new NfseDocumentedGroup6216MotivoRejeicao(field("motivo_rejeicao")); }
 public NfseDocumentedGroup6216 setMotivoRejeicao(NfseDocumentedGroup6216MotivoRejeicao value) { put("motivo_rejeicao", value == null ? null : value.toJson()); return this; }
 public String getJustificativaRejeicao() { return stringValue(field("justificativa_rejeicao")); }
 public NfseDocumentedGroup6216 setJustificativaRejeicao(String value) { put("justificativa_rejeicao", Json.scalar(value)); return this; }
}
