package com.webmania.sdk.model.api2cteissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/cte-issuance.openapi.json; see contract-provenance.json. */
public final class EmitterIssueCtePayloadDocumentosAnterioresItem extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("documentos", "emissor");
 public EmitterIssueCtePayloadDocumentosAnterioresItem() { super(FIELDS); }
 public EmitterIssueCtePayloadDocumentosAnterioresItem(JsonNode node) { super(node, FIELDS); }
 public java.util.List<EmitterIssueCtePayloadDocumentosAnterioresItemDocumentosItem> getDocumentos() { return list(field("documentos"), v -> (v).isNull() || (v).isMissingNode() ? null : new EmitterIssueCtePayloadDocumentosAnterioresItemDocumentosItem(v)); }
 public EmitterIssueCtePayloadDocumentosAnterioresItem setDocumentos(java.util.List<EmitterIssueCtePayloadDocumentosAnterioresItemDocumentosItem> value) { put("documentos", array(value, v -> v == null ? null : v.toJson())); return this; }
 public EmitterIssueCtePayloadDocumentosAnterioresItemEmissor getEmissor() { return (field("emissor")).isNull() || (field("emissor")).isMissingNode() ? null : new EmitterIssueCtePayloadDocumentosAnterioresItemEmissor(field("emissor")); }
 public EmitterIssueCtePayloadDocumentosAnterioresItem setEmissor(EmitterIssueCtePayloadDocumentosAnterioresItemEmissor value) { put("emissor", value == null ? null : value.toJson()); return this; }
}
