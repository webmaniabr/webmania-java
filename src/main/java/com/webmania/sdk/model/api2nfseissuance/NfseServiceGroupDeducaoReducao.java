package com.webmania.sdk.model.api2nfseissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/nfse-issuance.openapi.json; see contract-provenance.json. */
public final class NfseServiceGroupDeducaoReducao extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("documentos", "percentual", "valor");
 public NfseServiceGroupDeducaoReducao() { super(FIELDS); }
 public NfseServiceGroupDeducaoReducao(JsonNode node) { super(node, FIELDS); }
 public java.util.List<NfseServiceGroupDeducaoReducaoDocumentosItem> getDocumentos() { return list(field("documentos"), v -> (v).isNull() || (v).isMissingNode() ? null : new NfseServiceGroupDeducaoReducaoDocumentosItem(v)); }
 public NfseServiceGroupDeducaoReducao setDocumentos(java.util.List<NfseServiceGroupDeducaoReducaoDocumentosItem> value) { put("documentos", array(value, v -> v == null ? null : v.toJson())); return this; }
 public NfseServiceGroupDeducaoReducaoPercentual getPercentual() { return (field("percentual")).isNull() || (field("percentual")).isMissingNode() ? null : new NfseServiceGroupDeducaoReducaoPercentual(field("percentual")); }
 public NfseServiceGroupDeducaoReducao setPercentual(NfseServiceGroupDeducaoReducaoPercentual value) { put("percentual", value == null ? null : value.toJson()); return this; }
 public NfseServiceGroupDeducaoReducaoValor getValor() { return (field("valor")).isNull() || (field("valor")).isMissingNode() ? null : new NfseServiceGroupDeducaoReducaoValor(field("valor")); }
 public NfseServiceGroupDeducaoReducao setValor(NfseServiceGroupDeducaoReducaoValor value) { put("valor", value == null ? null : value.toJson()); return this; }
}
