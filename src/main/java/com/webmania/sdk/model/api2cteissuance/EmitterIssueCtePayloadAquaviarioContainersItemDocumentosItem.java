package com.webmania.sdk.model.api2cteissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/cte-issuance.openapi.json; see contract-provenance.json. */
public final class EmitterIssueCtePayloadAquaviarioContainersItemDocumentosItem extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("chave", "medida_rateada", "numero", "serie");
 public EmitterIssueCtePayloadAquaviarioContainersItemDocumentosItem() { super(FIELDS); }
 public EmitterIssueCtePayloadAquaviarioContainersItemDocumentosItem(JsonNode node) { super(node, FIELDS); }
 public String getChave() { return stringValue(field("chave")); }
 public EmitterIssueCtePayloadAquaviarioContainersItemDocumentosItem setChave(String value) { put("chave", Json.scalar(value)); return this; }
 public EmitterIssueCtePayloadAquaviarioContainersItemDocumentosItemMedidaRateada getMedidaRateada() { return (field("medida_rateada")).isNull() || (field("medida_rateada")).isMissingNode() ? null : new EmitterIssueCtePayloadAquaviarioContainersItemDocumentosItemMedidaRateada(field("medida_rateada")); }
 public EmitterIssueCtePayloadAquaviarioContainersItemDocumentosItem setMedidaRateada(EmitterIssueCtePayloadAquaviarioContainersItemDocumentosItemMedidaRateada value) { put("medida_rateada", value == null ? null : value.toJson()); return this; }
 public String getNumero() { return stringValue(field("numero")); }
 public EmitterIssueCtePayloadAquaviarioContainersItemDocumentosItem setNumero(String value) { put("numero", Json.scalar(value)); return this; }
 public String getSerie() { return stringValue(field("serie")); }
 public EmitterIssueCtePayloadAquaviarioContainersItemDocumentosItem setSerie(String value) { put("serie", Json.scalar(value)); return this; }
}
