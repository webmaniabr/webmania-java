package com.webmania.sdk.model.api2cteissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/cte-issuance.openapi.json; see contract-provenance.json. */
public final class EmitterIssueCtePayloadDocumentosAnterioresItemDocumentosItem extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("chave", "data_emissao", "numero", "serie", "tipo");
 public EmitterIssueCtePayloadDocumentosAnterioresItemDocumentosItem() { super(FIELDS); }
 public EmitterIssueCtePayloadDocumentosAnterioresItemDocumentosItem(JsonNode node) { super(node, FIELDS); }
 public String getChave() { return stringValue(field("chave")); }
 public EmitterIssueCtePayloadDocumentosAnterioresItemDocumentosItem setChave(String value) { put("chave", Json.scalar(value)); return this; }
 public String getDataEmissao() { return stringValue(field("data_emissao")); }
 public EmitterIssueCtePayloadDocumentosAnterioresItemDocumentosItem setDataEmissao(String value) { put("data_emissao", Json.scalar(value)); return this; }
 public String getNumero() { return stringValue(field("numero")); }
 public EmitterIssueCtePayloadDocumentosAnterioresItemDocumentosItem setNumero(String value) { put("numero", Json.scalar(value)); return this; }
 public String getSerie() { return stringValue(field("serie")); }
 public EmitterIssueCtePayloadDocumentosAnterioresItemDocumentosItem setSerie(String value) { put("serie", Json.scalar(value)); return this; }
 public EmitterIssueCtePayloadDocumentosAnterioresItemDocumentosItemTipo getTipo() { return (field("tipo")).isNull() || (field("tipo")).isMissingNode() ? null : new EmitterIssueCtePayloadDocumentosAnterioresItemDocumentosItemTipo(field("tipo")); }
 public EmitterIssueCtePayloadDocumentosAnterioresItemDocumentosItem setTipo(EmitterIssueCtePayloadDocumentosAnterioresItemDocumentosItemTipo value) { put("tipo", value == null ? null : value.toJson()); return this; }
}
