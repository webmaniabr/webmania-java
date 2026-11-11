package com.webmania.sdk.model.api2cteissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/cte-issuance.openapi.json; see contract-provenance.json. */
public final class EmitterIssueCtePayloadAquaviario extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("adicional_frete", "balsas", "containers", "direcao", "identificacao_navio", "irin_navio", "numero_viagem", "tipo_navegacao", "valor_prestacao");
 public EmitterIssueCtePayloadAquaviario() { super(FIELDS); }
 public EmitterIssueCtePayloadAquaviario(JsonNode node) { super(node, FIELDS); }
 public EmitterIssueCtePayloadAquaviarioAdicionalFrete getAdicionalFrete() { return (field("adicional_frete")).isNull() || (field("adicional_frete")).isMissingNode() ? null : new EmitterIssueCtePayloadAquaviarioAdicionalFrete(field("adicional_frete")); }
 public EmitterIssueCtePayloadAquaviario setAdicionalFrete(EmitterIssueCtePayloadAquaviarioAdicionalFrete value) { put("adicional_frete", value == null ? null : value.toJson()); return this; }
 public java.util.List<String> getBalsas() { return list(field("balsas"), v -> stringValue(v)); }
 public EmitterIssueCtePayloadAquaviario setBalsas(java.util.List<String> value) { put("balsas", array(value, v -> Json.scalar(v))); return this; }
 public java.util.List<EmitterIssueCtePayloadAquaviarioContainersItem> getContainers() { return list(field("containers"), v -> (v).isNull() || (v).isMissingNode() ? null : new EmitterIssueCtePayloadAquaviarioContainersItem(v)); }
 public EmitterIssueCtePayloadAquaviario setContainers(java.util.List<EmitterIssueCtePayloadAquaviarioContainersItem> value) { put("containers", array(value, v -> v == null ? null : v.toJson())); return this; }
 public String getDirecao() { return stringValue(field("direcao")); }
 public EmitterIssueCtePayloadAquaviario setDirecao(String value) { put("direcao", Json.scalar(value)); return this; }
 public String getIdentificacaoNavio() { return stringValue(field("identificacao_navio")); }
 public EmitterIssueCtePayloadAquaviario setIdentificacaoNavio(String value) { put("identificacao_navio", Json.scalar(value)); return this; }
 public String getIrinNavio() { return stringValue(field("irin_navio")); }
 public EmitterIssueCtePayloadAquaviario setIrinNavio(String value) { put("irin_navio", Json.scalar(value)); return this; }
 public String getNumeroViagem() { return stringValue(field("numero_viagem")); }
 public EmitterIssueCtePayloadAquaviario setNumeroViagem(String value) { put("numero_viagem", Json.scalar(value)); return this; }
 public String getTipoNavegacao() { return stringValue(field("tipo_navegacao")); }
 public EmitterIssueCtePayloadAquaviario setTipoNavegacao(String value) { put("tipo_navegacao", Json.scalar(value)); return this; }
 public EmitterIssueCtePayloadAquaviarioValorPrestacao getValorPrestacao() { return (field("valor_prestacao")).isNull() || (field("valor_prestacao")).isMissingNode() ? null : new EmitterIssueCtePayloadAquaviarioValorPrestacao(field("valor_prestacao")); }
 public EmitterIssueCtePayloadAquaviario setValorPrestacao(EmitterIssueCtePayloadAquaviarioValorPrestacao value) { put("valor_prestacao", value == null ? null : value.toJson()); return this; }
}
