package com.webmania.sdk.model.api2cteissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/cte-issuance.openapi.json; see contract-provenance.json. */
public final class EmitterIssueCtePayloadDocumentosFiscaisItemUnidadesCargaItem extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("identificacao", "lacres", "quantidade_rateada", "tipo");
 public EmitterIssueCtePayloadDocumentosFiscaisItemUnidadesCargaItem() { super(FIELDS); }
 public EmitterIssueCtePayloadDocumentosFiscaisItemUnidadesCargaItem(JsonNode node) { super(node, FIELDS); }
 public String getIdentificacao() { return stringValue(field("identificacao")); }
 public EmitterIssueCtePayloadDocumentosFiscaisItemUnidadesCargaItem setIdentificacao(String value) { put("identificacao", Json.scalar(value)); return this; }
 public java.util.List<String> getLacres() { return list(field("lacres"), v -> stringValue(v)); }
 public EmitterIssueCtePayloadDocumentosFiscaisItemUnidadesCargaItem setLacres(java.util.List<String> value) { put("lacres", array(value, v -> Json.scalar(v))); return this; }
 public EmitterIssueCtePayloadDocumentosFiscaisItemUnidadesCargaItemQuantidadeRateada getQuantidadeRateada() { return (field("quantidade_rateada")).isNull() || (field("quantidade_rateada")).isMissingNode() ? null : new EmitterIssueCtePayloadDocumentosFiscaisItemUnidadesCargaItemQuantidadeRateada(field("quantidade_rateada")); }
 public EmitterIssueCtePayloadDocumentosFiscaisItemUnidadesCargaItem setQuantidadeRateada(EmitterIssueCtePayloadDocumentosFiscaisItemUnidadesCargaItemQuantidadeRateada value) { put("quantidade_rateada", value == null ? null : value.toJson()); return this; }
 public String getTipo() { return stringValue(field("tipo")); }
 public EmitterIssueCtePayloadDocumentosFiscaisItemUnidadesCargaItem setTipo(String value) { put("tipo", Json.scalar(value)); return this; }
}
