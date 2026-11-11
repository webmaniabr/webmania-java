package com.webmania.sdk.model.api2mdfeissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/mdfe-issuance.openapi.json; see contract-provenance.json. */
public final class EmitterIssueMdfePayloadDescarregamentoItemDocumentosFiscaisItem extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("chave", "codigo_barra", "entrega_parcial", "indicador_reentrega", "periculosidade", "unidade_transporte");
 public EmitterIssueMdfePayloadDescarregamentoItemDocumentosFiscaisItem() { super(FIELDS); }
 public EmitterIssueMdfePayloadDescarregamentoItemDocumentosFiscaisItem(JsonNode node) { super(node, FIELDS); }
 public String getChave() { return stringValue(field("chave")); }
 public EmitterIssueMdfePayloadDescarregamentoItemDocumentosFiscaisItem setChave(String value) { put("chave", Json.scalar(value)); return this; }
 public String getCodigoBarra() { return stringValue(field("codigo_barra")); }
 public EmitterIssueMdfePayloadDescarregamentoItemDocumentosFiscaisItem setCodigoBarra(String value) { put("codigo_barra", Json.scalar(value)); return this; }
 public EmitterIssueMdfePayloadDescarregamentoItemDocumentosFiscaisItemEntregaParcial getEntregaParcial() { return (field("entrega_parcial")).isNull() || (field("entrega_parcial")).isMissingNode() ? null : new EmitterIssueMdfePayloadDescarregamentoItemDocumentosFiscaisItemEntregaParcial(field("entrega_parcial")); }
 public EmitterIssueMdfePayloadDescarregamentoItemDocumentosFiscaisItem setEntregaParcial(EmitterIssueMdfePayloadDescarregamentoItemDocumentosFiscaisItemEntregaParcial value) { put("entrega_parcial", value == null ? null : value.toJson()); return this; }
 public JsonValue getIndicadorReentrega() { return (field("indicador_reentrega")).isNull() || (field("indicador_reentrega")).isMissingNode() ? null : new JsonValue(field("indicador_reentrega")); }
 public EmitterIssueMdfePayloadDescarregamentoItemDocumentosFiscaisItem setIndicadorReentrega(JsonValue value) { put("indicador_reentrega", value == null ? null : value.toJson()); return this; }
 public java.util.List<EmitterIssueMdfePayloadDescarregamentoItemDocumentosFiscaisItemPericulosidadeItem> getPericulosidade() { return list(field("periculosidade"), v -> (v).isNull() || (v).isMissingNode() ? null : new EmitterIssueMdfePayloadDescarregamentoItemDocumentosFiscaisItemPericulosidadeItem(v)); }
 public EmitterIssueMdfePayloadDescarregamentoItemDocumentosFiscaisItem setPericulosidade(java.util.List<EmitterIssueMdfePayloadDescarregamentoItemDocumentosFiscaisItemPericulosidadeItem> value) { put("periculosidade", array(value, v -> v == null ? null : v.toJson())); return this; }
 public java.util.List<EmitterIssueMdfePayloadDescarregamentoItemDocumentosFiscaisItemUnidadeTransporteItem> getUnidadeTransporte() { return list(field("unidade_transporte"), v -> (v).isNull() || (v).isMissingNode() ? null : new EmitterIssueMdfePayloadDescarregamentoItemDocumentosFiscaisItemUnidadeTransporteItem(v)); }
 public EmitterIssueMdfePayloadDescarregamentoItemDocumentosFiscaisItem setUnidadeTransporte(java.util.List<EmitterIssueMdfePayloadDescarregamentoItemDocumentosFiscaisItemUnidadeTransporteItem> value) { put("unidade_transporte", array(value, v -> v == null ? null : v.toJson())); return this; }
}
