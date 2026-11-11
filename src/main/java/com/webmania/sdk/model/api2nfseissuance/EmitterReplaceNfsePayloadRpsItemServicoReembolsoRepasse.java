package com.webmania.sdk.model.api2nfseissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/nfse-issuance.openapi.json; see contract-provenance.json. */
public final class EmitterReplaceNfsePayloadRpsItemServicoReembolsoRepasse extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("documentos");
 public EmitterReplaceNfsePayloadRpsItemServicoReembolsoRepasse() { super(FIELDS); }
 public EmitterReplaceNfsePayloadRpsItemServicoReembolsoRepasse(JsonNode node) { super(node, FIELDS); }
 public java.util.List<EmitterReplaceNfsePayloadRpsItemServicoReembolsoRepasseDocumentosItem> getDocumentos() { return list(field("documentos"), v -> (v).isNull() || (v).isMissingNode() ? null : new EmitterReplaceNfsePayloadRpsItemServicoReembolsoRepasseDocumentosItem(v)); }
 public EmitterReplaceNfsePayloadRpsItemServicoReembolsoRepasse setDocumentos(java.util.List<EmitterReplaceNfsePayloadRpsItemServicoReembolsoRepasseDocumentosItem> value) { put("documentos", array(value, v -> v == null ? null : v.toJson())); return this; }
}
