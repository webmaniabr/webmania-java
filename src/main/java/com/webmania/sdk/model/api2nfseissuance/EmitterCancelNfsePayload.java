package com.webmania.sdk.model.api2nfseissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/nfse-issuance.openapi.json; see contract-provenance.json. */
public final class EmitterCancelNfsePayload extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("codigo_verificacao", "justificativa", "motivo", "uuid");
 public EmitterCancelNfsePayload() { super(FIELDS); }
 public EmitterCancelNfsePayload(JsonNode node) { super(node, FIELDS); }
 public String getCodigoVerificacao() { return stringValue(field("codigo_verificacao")); }
 public EmitterCancelNfsePayload setCodigoVerificacao(String value) { put("codigo_verificacao", Json.scalar(value)); return this; }
 public String getJustificativa() { return stringValue(field("justificativa")); }
 public EmitterCancelNfsePayload setJustificativa(String value) { put("justificativa", Json.scalar(value)); return this; }
 public JsonValue getMotivo() { return (field("motivo")).isNull() || (field("motivo")).isMissingNode() ? null : new JsonValue(field("motivo")); }
 public EmitterCancelNfsePayload setMotivo(JsonValue value) { put("motivo", value == null ? null : value.toJson()); return this; }
 public String getUuid() { return stringValue(field("uuid")); }
 public EmitterCancelNfsePayload setUuid(String value) { put("uuid", Json.scalar(value)); return this; }
}
