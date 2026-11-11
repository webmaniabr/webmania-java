package com.webmania.sdk.model.api2nfseissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/nfse-issuance.openapi.json; see contract-provenance.json. */
public final class EmitterReplaceNfsePayload extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("ambiente", "chave", "codigo_verificacao", "justificativa", "motivo", "origem", "rps");
 public EmitterReplaceNfsePayload() { super(FIELDS); }
 public EmitterReplaceNfsePayload(JsonNode node) { super(node, FIELDS); }
 public JsonValue getAmbiente() { return (field("ambiente")).isNull() || (field("ambiente")).isMissingNode() ? null : new JsonValue(field("ambiente")); }
 public EmitterReplaceNfsePayload setAmbiente(JsonValue value) { put("ambiente", value == null ? null : value.toJson()); return this; }
 public String getChave() { return stringValue(field("chave")); }
 public EmitterReplaceNfsePayload setChave(String value) { put("chave", Json.scalar(value)); return this; }
 public String getCodigoVerificacao() { return stringValue(field("codigo_verificacao")); }
 public EmitterReplaceNfsePayload setCodigoVerificacao(String value) { put("codigo_verificacao", Json.scalar(value)); return this; }
 public String getJustificativa() { return stringValue(field("justificativa")); }
 public EmitterReplaceNfsePayload setJustificativa(String value) { put("justificativa", Json.scalar(value)); return this; }
 public JsonValue getMotivo() { return (field("motivo")).isNull() || (field("motivo")).isMissingNode() ? null : new JsonValue(field("motivo")); }
 public EmitterReplaceNfsePayload setMotivo(JsonValue value) { put("motivo", value == null ? null : value.toJson()); return this; }
 public String getOrigem() { return stringValue(field("origem")); }
 public EmitterReplaceNfsePayload setOrigem(String value) { put("origem", Json.scalar(value)); return this; }
 public java.util.List<EmitterReplaceNfsePayloadRpsItem> getRps() { return list(field("rps"), v -> (v).isNull() || (v).isMissingNode() ? null : new EmitterReplaceNfsePayloadRpsItem(v)); }
 public EmitterReplaceNfsePayload setRps(java.util.List<EmitterReplaceNfsePayloadRpsItem> value) { put("rps", array(value, v -> v == null ? null : v.toJson())); return this; }
}
