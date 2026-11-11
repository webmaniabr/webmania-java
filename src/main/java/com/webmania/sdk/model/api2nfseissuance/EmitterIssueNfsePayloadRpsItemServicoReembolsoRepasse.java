package com.webmania.sdk.model.api2nfseissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/nfse-issuance.openapi.json; see contract-provenance.json. */
public final class EmitterIssueNfsePayloadRpsItemServicoReembolsoRepasse extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("documentos");
 public EmitterIssueNfsePayloadRpsItemServicoReembolsoRepasse() { super(FIELDS); }
 public EmitterIssueNfsePayloadRpsItemServicoReembolsoRepasse(JsonNode node) { super(node, FIELDS); }
 public java.util.List<EmitterIssueNfsePayloadRpsItemServicoReembolsoRepasseDocumentosItem> getDocumentos() { return list(field("documentos"), v -> (v).isNull() || (v).isMissingNode() ? null : new EmitterIssueNfsePayloadRpsItemServicoReembolsoRepasseDocumentosItem(v)); }
 public EmitterIssueNfsePayloadRpsItemServicoReembolsoRepasse setDocumentos(java.util.List<EmitterIssueNfsePayloadRpsItemServicoReembolsoRepasseDocumentosItem> value) { put("documentos", array(value, v -> v == null ? null : v.toJson())); return this; }
}
