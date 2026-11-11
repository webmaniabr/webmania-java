package com.webmania.sdk.model.api2nfseissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/nfse-issuance.openapi.json; see contract-provenance.json. */
public final class NfseServiceGroupReembolsoRepasse extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("documentos");
 public NfseServiceGroupReembolsoRepasse() { super(FIELDS); }
 public NfseServiceGroupReembolsoRepasse(JsonNode node) { super(node, FIELDS); }
 public java.util.List<NfseServiceGroupReembolsoRepasseDocumentosItem> getDocumentos() { return list(field("documentos"), v -> (v).isNull() || (v).isMissingNode() ? null : new NfseServiceGroupReembolsoRepasseDocumentosItem(v)); }
 public NfseServiceGroupReembolsoRepasse setDocumentos(java.util.List<NfseServiceGroupReembolsoRepasseDocumentosItem> value) { put("documentos", array(value, v -> v == null ? null : v.toJson())); return this; }
}
