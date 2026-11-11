package com.webmania.sdk.model.api2mdfeissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/mdfe-issuance.openapi.json; see contract-provenance.json. */
public final class EmitterIssueMdfePayloadProdutoPredominante extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("gtin", "lotacao", "ncm", "nome", "tipo_carga");
 public EmitterIssueMdfePayloadProdutoPredominante() { super(FIELDS); }
 public EmitterIssueMdfePayloadProdutoPredominante(JsonNode node) { super(node, FIELDS); }
 public String getGtin() { return stringValue(field("gtin")); }
 public EmitterIssueMdfePayloadProdutoPredominante setGtin(String value) { put("gtin", Json.scalar(value)); return this; }
 public EmitterIssueMdfePayloadProdutoPredominanteLotacao getLotacao() { return (field("lotacao")).isNull() || (field("lotacao")).isMissingNode() ? null : new EmitterIssueMdfePayloadProdutoPredominanteLotacao(field("lotacao")); }
 public EmitterIssueMdfePayloadProdutoPredominante setLotacao(EmitterIssueMdfePayloadProdutoPredominanteLotacao value) { put("lotacao", value == null ? null : value.toJson()); return this; }
 public String getNcm() { return stringValue(field("ncm")); }
 public EmitterIssueMdfePayloadProdutoPredominante setNcm(String value) { put("ncm", Json.scalar(value)); return this; }
 public String getNome() { return stringValue(field("nome")); }
 public EmitterIssueMdfePayloadProdutoPredominante setNome(String value) { put("nome", Json.scalar(value)); return this; }
 public JsonValue getTipoCarga() { return (field("tipo_carga")).isNull() || (field("tipo_carga")).isMissingNode() ? null : new JsonValue(field("tipo_carga")); }
 public EmitterIssueMdfePayloadProdutoPredominante setTipoCarga(JsonValue value) { put("tipo_carga", value == null ? null : value.toJson()); return this; }
}
