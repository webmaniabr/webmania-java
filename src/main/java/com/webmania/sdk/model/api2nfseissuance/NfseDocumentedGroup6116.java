package com.webmania.sdk.model.api2nfseissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/nfse-issuance.openapi.json; see contract-provenance.json. */
public final class NfseDocumentedGroup6116 extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("ambiente", "codigo_verificacao", "motivo", "rps");
 public NfseDocumentedGroup6116() { super(FIELDS); }
 public NfseDocumentedGroup6116(JsonNode node) { super(node, FIELDS); }
 public NfseDocumentedGroup6116Ambiente getAmbiente() { return (field("ambiente")).isNull() || (field("ambiente")).isMissingNode() ? null : new NfseDocumentedGroup6116Ambiente(field("ambiente")); }
 public NfseDocumentedGroup6116 setAmbiente(NfseDocumentedGroup6116Ambiente value) { put("ambiente", value == null ? null : value.toJson()); return this; }
 public String getCodigoVerificacao() { return stringValue(field("codigo_verificacao")); }
 public NfseDocumentedGroup6116 setCodigoVerificacao(String value) { put("codigo_verificacao", Json.scalar(value)); return this; }
 public NfseDocumentedGroup6116Motivo getMotivo() { return (field("motivo")).isNull() || (field("motivo")).isMissingNode() ? null : new NfseDocumentedGroup6116Motivo(field("motivo")); }
 public NfseDocumentedGroup6116 setMotivo(NfseDocumentedGroup6116Motivo value) { put("motivo", value == null ? null : value.toJson()); return this; }
 public NfseDocumentedGroup6116Rps getRps() { return (field("rps")).isNull() || (field("rps")).isMissingNode() ? null : new NfseDocumentedGroup6116Rps(field("rps")); }
 public NfseDocumentedGroup6116 setRps(NfseDocumentedGroup6116Rps value) { put("rps", value == null ? null : value.toJson()); return this; }
}
