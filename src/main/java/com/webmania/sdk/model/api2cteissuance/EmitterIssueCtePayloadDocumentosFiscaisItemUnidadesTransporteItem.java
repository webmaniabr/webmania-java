package com.webmania.sdk.model.api2cteissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/cte-issuance.openapi.json; see contract-provenance.json. */
public final class EmitterIssueCtePayloadDocumentosFiscaisItemUnidadesTransporteItem extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("identificacao", "lacres", "quantidade_rateada", "tipo", "unidades_carga");
 public EmitterIssueCtePayloadDocumentosFiscaisItemUnidadesTransporteItem() { super(FIELDS); }
 public EmitterIssueCtePayloadDocumentosFiscaisItemUnidadesTransporteItem(JsonNode node) { super(node, FIELDS); }
 public String getIdentificacao() { return stringValue(field("identificacao")); }
 public EmitterIssueCtePayloadDocumentosFiscaisItemUnidadesTransporteItem setIdentificacao(String value) { put("identificacao", Json.scalar(value)); return this; }
 public java.util.List<String> getLacres() { return list(field("lacres"), v -> stringValue(v)); }
 public EmitterIssueCtePayloadDocumentosFiscaisItemUnidadesTransporteItem setLacres(java.util.List<String> value) { put("lacres", array(value, v -> Json.scalar(v))); return this; }
 public EmitterIssueCtePayloadDocumentosFiscaisItemUnidadesTransporteItemQuantidadeRateada getQuantidadeRateada() { return (field("quantidade_rateada")).isNull() || (field("quantidade_rateada")).isMissingNode() ? null : new EmitterIssueCtePayloadDocumentosFiscaisItemUnidadesTransporteItemQuantidadeRateada(field("quantidade_rateada")); }
 public EmitterIssueCtePayloadDocumentosFiscaisItemUnidadesTransporteItem setQuantidadeRateada(EmitterIssueCtePayloadDocumentosFiscaisItemUnidadesTransporteItemQuantidadeRateada value) { put("quantidade_rateada", value == null ? null : value.toJson()); return this; }
 public String getTipo() { return stringValue(field("tipo")); }
 public EmitterIssueCtePayloadDocumentosFiscaisItemUnidadesTransporteItem setTipo(String value) { put("tipo", Json.scalar(value)); return this; }
 public java.util.List<EmitterIssueCtePayloadDocumentosFiscaisItemUnidadesTransporteItemUnidadesCargaItem> getUnidadesCarga() { return list(field("unidades_carga"), v -> (v).isNull() || (v).isMissingNode() ? null : new EmitterIssueCtePayloadDocumentosFiscaisItemUnidadesTransporteItemUnidadesCargaItem(v)); }
 public EmitterIssueCtePayloadDocumentosFiscaisItemUnidadesTransporteItem setUnidadesCarga(java.util.List<EmitterIssueCtePayloadDocumentosFiscaisItemUnidadesTransporteItemUnidadesCargaItem> value) { put("unidades_carga", array(value, v -> v == null ? null : v.toJson())); return this; }
}
