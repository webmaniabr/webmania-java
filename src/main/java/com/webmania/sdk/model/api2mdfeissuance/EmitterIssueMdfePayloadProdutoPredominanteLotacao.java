package com.webmania.sdk.model.api2mdfeissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/mdfe-issuance.openapi.json; see contract-provenance.json. */
public final class EmitterIssueMdfePayloadProdutoPredominanteLotacao extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("carregamento", "descarregamento");
 public EmitterIssueMdfePayloadProdutoPredominanteLotacao() { super(FIELDS); }
 public EmitterIssueMdfePayloadProdutoPredominanteLotacao(JsonNode node) { super(node, FIELDS); }
 public EmitterIssueMdfePayloadProdutoPredominanteLotacaoCarregamento getCarregamento() { return (field("carregamento")).isNull() || (field("carregamento")).isMissingNode() ? null : new EmitterIssueMdfePayloadProdutoPredominanteLotacaoCarregamento(field("carregamento")); }
 public EmitterIssueMdfePayloadProdutoPredominanteLotacao setCarregamento(EmitterIssueMdfePayloadProdutoPredominanteLotacaoCarregamento value) { put("carregamento", value == null ? null : value.toJson()); return this; }
 public EmitterIssueMdfePayloadProdutoPredominanteLotacaoDescarregamento getDescarregamento() { return (field("descarregamento")).isNull() || (field("descarregamento")).isMissingNode() ? null : new EmitterIssueMdfePayloadProdutoPredominanteLotacaoDescarregamento(field("descarregamento")); }
 public EmitterIssueMdfePayloadProdutoPredominanteLotacao setDescarregamento(EmitterIssueMdfePayloadProdutoPredominanteLotacaoDescarregamento value) { put("descarregamento", value == null ? null : value.toJson()); return this; }
}
