package com.webmania.sdk.model.api2cteissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/cte-issuance.openapi.json; see contract-provenance.json. */
public final class EmitterIssueCtePayloadAquaviarioContainersItem extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("documentos", "identificacao", "lacres");
 public EmitterIssueCtePayloadAquaviarioContainersItem() { super(FIELDS); }
 public EmitterIssueCtePayloadAquaviarioContainersItem(JsonNode node) { super(node, FIELDS); }
 public java.util.List<EmitterIssueCtePayloadAquaviarioContainersItemDocumentosItem> getDocumentos() { return list(field("documentos"), v -> (v).isNull() || (v).isMissingNode() ? null : new EmitterIssueCtePayloadAquaviarioContainersItemDocumentosItem(v)); }
 public EmitterIssueCtePayloadAquaviarioContainersItem setDocumentos(java.util.List<EmitterIssueCtePayloadAquaviarioContainersItemDocumentosItem> value) { put("documentos", array(value, v -> v == null ? null : v.toJson())); return this; }
 public String getIdentificacao() { return stringValue(field("identificacao")); }
 public EmitterIssueCtePayloadAquaviarioContainersItem setIdentificacao(String value) { put("identificacao", Json.scalar(value)); return this; }
 public java.util.List<String> getLacres() { return list(field("lacres"), v -> stringValue(v)); }
 public EmitterIssueCtePayloadAquaviarioContainersItem setLacres(java.util.List<String> value) { put("lacres", array(value, v -> Json.scalar(v))); return this; }
}
