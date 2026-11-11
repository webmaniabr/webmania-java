package com.webmania.sdk.model.api2cteissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/cte-issuance.openapi.json; see contract-provenance.json. */
public final class EmitterIssueCtePayloadCarga extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("caracteristicas", "fluxo", "produto_predominante", "quantidades", "seguro", "valor_averbacao", "valor_total");
 public EmitterIssueCtePayloadCarga() { super(FIELDS); }
 public EmitterIssueCtePayloadCarga(JsonNode node) { super(node, FIELDS); }
 public String getCaracteristicas() { return stringValue(field("caracteristicas")); }
 public EmitterIssueCtePayloadCarga setCaracteristicas(String value) { put("caracteristicas", Json.scalar(value)); return this; }
 public EmitterIssueCtePayloadCargaFluxo getFluxo() { return (field("fluxo")).isNull() || (field("fluxo")).isMissingNode() ? null : new EmitterIssueCtePayloadCargaFluxo(field("fluxo")); }
 public EmitterIssueCtePayloadCarga setFluxo(EmitterIssueCtePayloadCargaFluxo value) { put("fluxo", value == null ? null : value.toJson()); return this; }
 public String getProdutoPredominante() { return stringValue(field("produto_predominante")); }
 public EmitterIssueCtePayloadCarga setProdutoPredominante(String value) { put("produto_predominante", Json.scalar(value)); return this; }
 public java.util.List<EmitterIssueCtePayloadCargaQuantidadesItem> getQuantidades() { return list(field("quantidades"), v -> (v).isNull() || (v).isMissingNode() ? null : new EmitterIssueCtePayloadCargaQuantidadesItem(v)); }
 public EmitterIssueCtePayloadCarga setQuantidades(java.util.List<EmitterIssueCtePayloadCargaQuantidadesItem> value) { put("quantidades", array(value, v -> v == null ? null : v.toJson())); return this; }
 public EmitterIssueCtePayloadCargaSeguro getSeguro() { return (field("seguro")).isNull() || (field("seguro")).isMissingNode() ? null : new EmitterIssueCtePayloadCargaSeguro(field("seguro")); }
 public EmitterIssueCtePayloadCarga setSeguro(EmitterIssueCtePayloadCargaSeguro value) { put("seguro", value == null ? null : value.toJson()); return this; }
 public EmitterIssueCtePayloadCargaValorAverbacao getValorAverbacao() { return (field("valor_averbacao")).isNull() || (field("valor_averbacao")).isMissingNode() ? null : new EmitterIssueCtePayloadCargaValorAverbacao(field("valor_averbacao")); }
 public EmitterIssueCtePayloadCarga setValorAverbacao(EmitterIssueCtePayloadCargaValorAverbacao value) { put("valor_averbacao", value == null ? null : value.toJson()); return this; }
 public EmitterIssueCtePayloadCargaValorTotal getValorTotal() { return (field("valor_total")).isNull() || (field("valor_total")).isMissingNode() ? null : new EmitterIssueCtePayloadCargaValorTotal(field("valor_total")); }
 public EmitterIssueCtePayloadCarga setValorTotal(EmitterIssueCtePayloadCargaValorTotal value) { put("valor_total", value == null ? null : value.toJson()); return this; }
}
