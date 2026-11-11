package com.webmania.sdk.model.api2mdfeissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/mdfe-issuance.openapi.json; see contract-provenance.json. */
public final class EmitterIssueMdfePayloadDescarregamentoItemDocumentosFiscaisItemUnidadeTransporteItemUnidadeCargaItem extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("id_carga", "lacres", "tipo_carga", "tipo", "identificacao", "quantidade_rateada");
 public EmitterIssueMdfePayloadDescarregamentoItemDocumentosFiscaisItemUnidadeTransporteItemUnidadeCargaItem() { super(FIELDS); }
 public EmitterIssueMdfePayloadDescarregamentoItemDocumentosFiscaisItemUnidadeTransporteItemUnidadeCargaItem(JsonNode node) { super(node, FIELDS); }
 public String getIdCarga() { return stringValue(field("id_carga")); }
 public EmitterIssueMdfePayloadDescarregamentoItemDocumentosFiscaisItemUnidadeTransporteItemUnidadeCargaItem setIdCarga(String value) { put("id_carga", Json.scalar(value)); return this; }
 public java.util.List<String> getLacres() { return list(field("lacres"), v -> stringValue(v)); }
 public EmitterIssueMdfePayloadDescarregamentoItemDocumentosFiscaisItemUnidadeTransporteItemUnidadeCargaItem setLacres(java.util.List<String> value) { put("lacres", array(value, v -> Json.scalar(v))); return this; }
 public JsonValue getTipoCarga() { return (field("tipo_carga")).isNull() || (field("tipo_carga")).isMissingNode() ? null : new JsonValue(field("tipo_carga")); }
 public EmitterIssueMdfePayloadDescarregamentoItemDocumentosFiscaisItemUnidadeTransporteItemUnidadeCargaItem setTipoCarga(JsonValue value) { put("tipo_carga", value == null ? null : value.toJson()); return this; }
 public EmitterIssueMdfePayloadDescarregamentoItemDocumentosFiscaisItemUnidadeTransporteItemUnidadeCargaItemTipo getTipo() { return (field("tipo")).isNull() || (field("tipo")).isMissingNode() ? null : new EmitterIssueMdfePayloadDescarregamentoItemDocumentosFiscaisItemUnidadeTransporteItemUnidadeCargaItemTipo(field("tipo")); }
 public EmitterIssueMdfePayloadDescarregamentoItemDocumentosFiscaisItemUnidadeTransporteItemUnidadeCargaItem setTipo(EmitterIssueMdfePayloadDescarregamentoItemDocumentosFiscaisItemUnidadeTransporteItemUnidadeCargaItemTipo value) { put("tipo", value == null ? null : value.toJson()); return this; }
 public String getIdentificacao() { return stringValue(field("identificacao")); }
 public EmitterIssueMdfePayloadDescarregamentoItemDocumentosFiscaisItemUnidadeTransporteItemUnidadeCargaItem setIdentificacao(String value) { put("identificacao", Json.scalar(value)); return this; }
 public String getQuantidadeRateada() { return stringValue(field("quantidade_rateada")); }
 public EmitterIssueMdfePayloadDescarregamentoItemDocumentosFiscaisItemUnidadeTransporteItemUnidadeCargaItem setQuantidadeRateada(String value) { put("quantidade_rateada", Json.scalar(value)); return this; }
}
