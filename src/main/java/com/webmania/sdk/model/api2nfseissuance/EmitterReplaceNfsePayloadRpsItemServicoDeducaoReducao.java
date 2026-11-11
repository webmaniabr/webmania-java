package com.webmania.sdk.model.api2nfseissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/nfse-issuance.openapi.json; see contract-provenance.json. */
public final class EmitterReplaceNfsePayloadRpsItemServicoDeducaoReducao extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("documentos", "percentual", "valor");
 public EmitterReplaceNfsePayloadRpsItemServicoDeducaoReducao() { super(FIELDS); }
 public EmitterReplaceNfsePayloadRpsItemServicoDeducaoReducao(JsonNode node) { super(node, FIELDS); }
 public java.util.List<EmitterReplaceNfsePayloadRpsItemServicoDeducaoReducaoDocumentosItem> getDocumentos() { return list(field("documentos"), v -> (v).isNull() || (v).isMissingNode() ? null : new EmitterReplaceNfsePayloadRpsItemServicoDeducaoReducaoDocumentosItem(v)); }
 public EmitterReplaceNfsePayloadRpsItemServicoDeducaoReducao setDocumentos(java.util.List<EmitterReplaceNfsePayloadRpsItemServicoDeducaoReducaoDocumentosItem> value) { put("documentos", array(value, v -> v == null ? null : v.toJson())); return this; }
 public EmitterReplaceNfsePayloadRpsItemServicoDeducaoReducaoPercentual getPercentual() { return (field("percentual")).isNull() || (field("percentual")).isMissingNode() ? null : new EmitterReplaceNfsePayloadRpsItemServicoDeducaoReducaoPercentual(field("percentual")); }
 public EmitterReplaceNfsePayloadRpsItemServicoDeducaoReducao setPercentual(EmitterReplaceNfsePayloadRpsItemServicoDeducaoReducaoPercentual value) { put("percentual", value == null ? null : value.toJson()); return this; }
 public EmitterReplaceNfsePayloadRpsItemServicoDeducaoReducaoValor getValor() { return (field("valor")).isNull() || (field("valor")).isMissingNode() ? null : new EmitterReplaceNfsePayloadRpsItemServicoDeducaoReducaoValor(field("valor")); }
 public EmitterReplaceNfsePayloadRpsItemServicoDeducaoReducao setValor(EmitterReplaceNfsePayloadRpsItemServicoDeducaoReducaoValor value) { put("valor", value == null ? null : value.toJson()); return this; }
}
