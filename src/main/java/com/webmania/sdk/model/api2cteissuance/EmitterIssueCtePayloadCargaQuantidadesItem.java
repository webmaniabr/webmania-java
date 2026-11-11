package com.webmania.sdk.model.api2cteissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/cte-issuance.openapi.json; see contract-provenance.json. */
public final class EmitterIssueCtePayloadCargaQuantidadesItem extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("quantidade", "tipo_medida", "unidade_medida");
 public EmitterIssueCtePayloadCargaQuantidadesItem() { super(FIELDS); }
 public EmitterIssueCtePayloadCargaQuantidadesItem(JsonNode node) { super(node, FIELDS); }
 public EmitterIssueCtePayloadCargaQuantidadesItemQuantidade getQuantidade() { return (field("quantidade")).isNull() || (field("quantidade")).isMissingNode() ? null : new EmitterIssueCtePayloadCargaQuantidadesItemQuantidade(field("quantidade")); }
 public EmitterIssueCtePayloadCargaQuantidadesItem setQuantidade(EmitterIssueCtePayloadCargaQuantidadesItemQuantidade value) { put("quantidade", value == null ? null : value.toJson()); return this; }
 public String getTipoMedida() { return stringValue(field("tipo_medida")); }
 public EmitterIssueCtePayloadCargaQuantidadesItem setTipoMedida(String value) { put("tipo_medida", Json.scalar(value)); return this; }
 public String getUnidadeMedida() { return stringValue(field("unidade_medida")); }
 public EmitterIssueCtePayloadCargaQuantidadesItem setUnidadeMedida(String value) { put("unidade_medida", Json.scalar(value)); return this; }
}
