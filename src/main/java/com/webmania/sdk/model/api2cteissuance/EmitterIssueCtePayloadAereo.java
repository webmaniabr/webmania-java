package com.webmania.sdk.model.api2cteissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/cte-issuance.openapi.json; see contract-provenance.json. */
public final class EmitterIssueCtePayloadAereo extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("natureza_carga", "numero_minuta", "numero_oca", "previsao_entrega", "produtos_perigosos", "tarifa");
 public EmitterIssueCtePayloadAereo() { super(FIELDS); }
 public EmitterIssueCtePayloadAereo(JsonNode node) { super(node, FIELDS); }
 public EmitterIssueCtePayloadAereoNaturezaCarga getNaturezaCarga() { return (field("natureza_carga")).isNull() || (field("natureza_carga")).isMissingNode() ? null : new EmitterIssueCtePayloadAereoNaturezaCarga(field("natureza_carga")); }
 public EmitterIssueCtePayloadAereo setNaturezaCarga(EmitterIssueCtePayloadAereoNaturezaCarga value) { put("natureza_carga", value == null ? null : value.toJson()); return this; }
 public String getNumeroMinuta() { return stringValue(field("numero_minuta")); }
 public EmitterIssueCtePayloadAereo setNumeroMinuta(String value) { put("numero_minuta", Json.scalar(value)); return this; }
 public String getNumeroOca() { return stringValue(field("numero_oca")); }
 public EmitterIssueCtePayloadAereo setNumeroOca(String value) { put("numero_oca", Json.scalar(value)); return this; }
 public String getPrevisaoEntrega() { return stringValue(field("previsao_entrega")); }
 public EmitterIssueCtePayloadAereo setPrevisaoEntrega(String value) { put("previsao_entrega", Json.scalar(value)); return this; }
 public java.util.List<EmitterIssueCtePayloadAereoProdutosPerigososItem> getProdutosPerigosos() { return list(field("produtos_perigosos"), v -> (v).isNull() || (v).isMissingNode() ? null : new EmitterIssueCtePayloadAereoProdutosPerigososItem(v)); }
 public EmitterIssueCtePayloadAereo setProdutosPerigosos(java.util.List<EmitterIssueCtePayloadAereoProdutosPerigososItem> value) { put("produtos_perigosos", array(value, v -> v == null ? null : v.toJson())); return this; }
 public EmitterIssueCtePayloadAereoTarifa getTarifa() { return (field("tarifa")).isNull() || (field("tarifa")).isMissingNode() ? null : new EmitterIssueCtePayloadAereoTarifa(field("tarifa")); }
 public EmitterIssueCtePayloadAereo setTarifa(EmitterIssueCtePayloadAereoTarifa value) { put("tarifa", value == null ? null : value.toJson()); return this; }
}
