package com.webmania.sdk.model.api2nfcomissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/nfcom-issuance.openapi.json; see contract-provenance.json. */
public final class NfseManifestationRequest extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("ambiente", "chave", "manifestador", "evento", "motivo_rejeicao", "justificativa_rejeicao");
 public NfseManifestationRequest() { super(FIELDS); }
 public NfseManifestationRequest(JsonNode node) { super(node, FIELDS); }
 public NfseManifestationRequestAmbiente getAmbiente() { return (field("ambiente")).isNull() || (field("ambiente")).isMissingNode() ? null : new NfseManifestationRequestAmbiente(field("ambiente")); }
 public NfseManifestationRequest setAmbiente(NfseManifestationRequestAmbiente value) { put("ambiente", value == null ? null : value.toJson()); return this; }
 public String getChave() { return stringValue(field("chave")); }
 public NfseManifestationRequest setChave(String value) { put("chave", Json.scalar(value)); return this; }
 public NfseManifestationRequestManifestador getManifestador() { return (field("manifestador")).isNull() || (field("manifestador")).isMissingNode() ? null : new NfseManifestationRequestManifestador(field("manifestador")); }
 public NfseManifestationRequest setManifestador(NfseManifestationRequestManifestador value) { put("manifestador", value == null ? null : value.toJson()); return this; }
 public NfseManifestationRequestEvento getEvento() { return (field("evento")).isNull() || (field("evento")).isMissingNode() ? null : new NfseManifestationRequestEvento(field("evento")); }
 public NfseManifestationRequest setEvento(NfseManifestationRequestEvento value) { put("evento", value == null ? null : value.toJson()); return this; }
 public NfseManifestationRequestMotivoRejeicao getMotivoRejeicao() { return (field("motivo_rejeicao")).isNull() || (field("motivo_rejeicao")).isMissingNode() ? null : new NfseManifestationRequestMotivoRejeicao(field("motivo_rejeicao")); }
 public NfseManifestationRequest setMotivoRejeicao(NfseManifestationRequestMotivoRejeicao value) { put("motivo_rejeicao", value == null ? null : value.toJson()); return this; }
 public String getJustificativaRejeicao() { return stringValue(field("justificativa_rejeicao")); }
 public NfseManifestationRequest setJustificativaRejeicao(String value) { put("justificativa_rejeicao", Json.scalar(value)); return this; }
}
