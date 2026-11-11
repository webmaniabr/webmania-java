package com.webmania.sdk.model.api2cteissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/cte-issuance.openapi.json; see contract-provenance.json. */
public final class EmitterIssueCtePayloadFerroviario extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("cte_origem", "ferrovias", "fluxo", "responsavel_emissao", "responsavel_faturamento", "tipo_trafego", "valor_frete");
 public EmitterIssueCtePayloadFerroviario() { super(FIELDS); }
 public EmitterIssueCtePayloadFerroviario(JsonNode node) { super(node, FIELDS); }
 public String getCteOrigem() { return stringValue(field("cte_origem")); }
 public EmitterIssueCtePayloadFerroviario setCteOrigem(String value) { put("cte_origem", Json.scalar(value)); return this; }
 public java.util.List<EmitterIssueCtePayloadFerroviarioFerroviasItem> getFerrovias() { return list(field("ferrovias"), v -> (v).isNull() || (v).isMissingNode() ? null : new EmitterIssueCtePayloadFerroviarioFerroviasItem(v)); }
 public EmitterIssueCtePayloadFerroviario setFerrovias(java.util.List<EmitterIssueCtePayloadFerroviarioFerroviasItem> value) { put("ferrovias", array(value, v -> v == null ? null : v.toJson())); return this; }
 public String getFluxo() { return stringValue(field("fluxo")); }
 public EmitterIssueCtePayloadFerroviario setFluxo(String value) { put("fluxo", Json.scalar(value)); return this; }
 public String getResponsavelEmissao() { return stringValue(field("responsavel_emissao")); }
 public EmitterIssueCtePayloadFerroviario setResponsavelEmissao(String value) { put("responsavel_emissao", Json.scalar(value)); return this; }
 public String getResponsavelFaturamento() { return stringValue(field("responsavel_faturamento")); }
 public EmitterIssueCtePayloadFerroviario setResponsavelFaturamento(String value) { put("responsavel_faturamento", Json.scalar(value)); return this; }
 public String getTipoTrafego() { return stringValue(field("tipo_trafego")); }
 public EmitterIssueCtePayloadFerroviario setTipoTrafego(String value) { put("tipo_trafego", Json.scalar(value)); return this; }
 public EmitterIssueCtePayloadFerroviarioValorFrete getValorFrete() { return (field("valor_frete")).isNull() || (field("valor_frete")).isMissingNode() ? null : new EmitterIssueCtePayloadFerroviarioValorFrete(field("valor_frete")); }
 public EmitterIssueCtePayloadFerroviario setValorFrete(EmitterIssueCtePayloadFerroviarioValorFrete value) { put("valor_frete", value == null ? null : value.toJson()); return this; }
}
