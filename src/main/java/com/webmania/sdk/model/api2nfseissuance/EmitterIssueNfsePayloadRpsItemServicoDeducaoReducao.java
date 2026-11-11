package com.webmania.sdk.model.api2nfseissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/nfse-issuance.openapi.json; see contract-provenance.json. */
public final class EmitterIssueNfsePayloadRpsItemServicoDeducaoReducao extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("documentos", "percentual", "valor");
 public EmitterIssueNfsePayloadRpsItemServicoDeducaoReducao() { super(FIELDS); }
 public EmitterIssueNfsePayloadRpsItemServicoDeducaoReducao(JsonNode node) { super(node, FIELDS); }
 public java.util.List<EmitterIssueNfsePayloadRpsItemServicoDeducaoReducaoDocumentosItem> getDocumentos() { return list(field("documentos"), v -> (v).isNull() || (v).isMissingNode() ? null : new EmitterIssueNfsePayloadRpsItemServicoDeducaoReducaoDocumentosItem(v)); }
 public EmitterIssueNfsePayloadRpsItemServicoDeducaoReducao setDocumentos(java.util.List<EmitterIssueNfsePayloadRpsItemServicoDeducaoReducaoDocumentosItem> value) { put("documentos", array(value, v -> v == null ? null : v.toJson())); return this; }
 public EmitterIssueNfsePayloadRpsItemServicoDeducaoReducaoPercentual getPercentual() { return (field("percentual")).isNull() || (field("percentual")).isMissingNode() ? null : new EmitterIssueNfsePayloadRpsItemServicoDeducaoReducaoPercentual(field("percentual")); }
 public EmitterIssueNfsePayloadRpsItemServicoDeducaoReducao setPercentual(EmitterIssueNfsePayloadRpsItemServicoDeducaoReducaoPercentual value) { put("percentual", value == null ? null : value.toJson()); return this; }
 public EmitterIssueNfsePayloadRpsItemServicoDeducaoReducaoValor getValor() { return (field("valor")).isNull() || (field("valor")).isMissingNode() ? null : new EmitterIssueNfsePayloadRpsItemServicoDeducaoReducaoValor(field("valor")); }
 public EmitterIssueNfsePayloadRpsItemServicoDeducaoReducao setValor(EmitterIssueNfsePayloadRpsItemServicoDeducaoReducaoValor value) { put("valor", value == null ? null : value.toJson()); return this; }
}
