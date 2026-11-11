package com.webmania.sdk.model.api2mdfeissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/mdfe-issuance.openapi.json; see contract-provenance.json. */
public final class EmitterIssueMdfePayloadDescarregamentoItemDocumentosFiscaisItemUnidadeTransporteItem extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("identificacao", "lacres", "tipo", "unidade_carga", "quantidade_rateada");
 public EmitterIssueMdfePayloadDescarregamentoItemDocumentosFiscaisItemUnidadeTransporteItem() { super(FIELDS); }
 public EmitterIssueMdfePayloadDescarregamentoItemDocumentosFiscaisItemUnidadeTransporteItem(JsonNode node) { super(node, FIELDS); }
 public String getIdentificacao() { return stringValue(field("identificacao")); }
 public EmitterIssueMdfePayloadDescarregamentoItemDocumentosFiscaisItemUnidadeTransporteItem setIdentificacao(String value) { put("identificacao", Json.scalar(value)); return this; }
 public java.util.List<String> getLacres() { return list(field("lacres"), v -> stringValue(v)); }
 public EmitterIssueMdfePayloadDescarregamentoItemDocumentosFiscaisItemUnidadeTransporteItem setLacres(java.util.List<String> value) { put("lacres", array(value, v -> Json.scalar(v))); return this; }
 public JsonValue getTipo() { return (field("tipo")).isNull() || (field("tipo")).isMissingNode() ? null : new JsonValue(field("tipo")); }
 public EmitterIssueMdfePayloadDescarregamentoItemDocumentosFiscaisItemUnidadeTransporteItem setTipo(JsonValue value) { put("tipo", value == null ? null : value.toJson()); return this; }
 public java.util.List<EmitterIssueMdfePayloadDescarregamentoItemDocumentosFiscaisItemUnidadeTransporteItemUnidadeCargaItem> getUnidadeCarga() { return list(field("unidade_carga"), v -> (v).isNull() || (v).isMissingNode() ? null : new EmitterIssueMdfePayloadDescarregamentoItemDocumentosFiscaisItemUnidadeTransporteItemUnidadeCargaItem(v)); }
 public EmitterIssueMdfePayloadDescarregamentoItemDocumentosFiscaisItemUnidadeTransporteItem setUnidadeCarga(java.util.List<EmitterIssueMdfePayloadDescarregamentoItemDocumentosFiscaisItemUnidadeTransporteItemUnidadeCargaItem> value) { put("unidade_carga", array(value, v -> v == null ? null : v.toJson())); return this; }
 public String getQuantidadeRateada() { return stringValue(field("quantidade_rateada")); }
 public EmitterIssueMdfePayloadDescarregamentoItemDocumentosFiscaisItemUnidadeTransporteItem setQuantidadeRateada(String value) { put("quantidade_rateada", Json.scalar(value)); return this; }
}
