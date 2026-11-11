package com.webmania.sdk.model.api2mdfeissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/mdfe-issuance.openapi.json; see contract-provenance.json. */
public final class EmitterIssueMdfePayloadDescarregamentoItemDocumentosFiscaisItemEntregaParcial extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("quantidade_parcial", "quantidade_total");
 public EmitterIssueMdfePayloadDescarregamentoItemDocumentosFiscaisItemEntregaParcial() { super(FIELDS); }
 public EmitterIssueMdfePayloadDescarregamentoItemDocumentosFiscaisItemEntregaParcial(JsonNode node) { super(node, FIELDS); }
 public EmitterIssueMdfePayloadDescarregamentoItemDocumentosFiscaisItemEntregaParcialQuantidadeParcial getQuantidadeParcial() { return (field("quantidade_parcial")).isNull() || (field("quantidade_parcial")).isMissingNode() ? null : new EmitterIssueMdfePayloadDescarregamentoItemDocumentosFiscaisItemEntregaParcialQuantidadeParcial(field("quantidade_parcial")); }
 public EmitterIssueMdfePayloadDescarregamentoItemDocumentosFiscaisItemEntregaParcial setQuantidadeParcial(EmitterIssueMdfePayloadDescarregamentoItemDocumentosFiscaisItemEntregaParcialQuantidadeParcial value) { put("quantidade_parcial", value == null ? null : value.toJson()); return this; }
 public EmitterIssueMdfePayloadDescarregamentoItemDocumentosFiscaisItemEntregaParcialQuantidadeTotal getQuantidadeTotal() { return (field("quantidade_total")).isNull() || (field("quantidade_total")).isMissingNode() ? null : new EmitterIssueMdfePayloadDescarregamentoItemDocumentosFiscaisItemEntregaParcialQuantidadeTotal(field("quantidade_total")); }
 public EmitterIssueMdfePayloadDescarregamentoItemDocumentosFiscaisItemEntregaParcial setQuantidadeTotal(EmitterIssueMdfePayloadDescarregamentoItemDocumentosFiscaisItemEntregaParcialQuantidadeTotal value) { put("quantidade_total", value == null ? null : value.toJson()); return this; }
}
