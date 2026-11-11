package com.webmania.sdk.model.api2cteissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/cte-issuance.openapi.json; see contract-provenance.json. */
public final class EmitterIssueCtePayloadAereoProdutosPerigososItem extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("descricao_volumes", "numero_onu", "quantidade_total", "unidade_medida");
 public EmitterIssueCtePayloadAereoProdutosPerigososItem() { super(FIELDS); }
 public EmitterIssueCtePayloadAereoProdutosPerigososItem(JsonNode node) { super(node, FIELDS); }
 public String getDescricaoVolumes() { return stringValue(field("descricao_volumes")); }
 public EmitterIssueCtePayloadAereoProdutosPerigososItem setDescricaoVolumes(String value) { put("descricao_volumes", Json.scalar(value)); return this; }
 public String getNumeroOnu() { return stringValue(field("numero_onu")); }
 public EmitterIssueCtePayloadAereoProdutosPerigososItem setNumeroOnu(String value) { put("numero_onu", Json.scalar(value)); return this; }
 public EmitterIssueCtePayloadAereoProdutosPerigososItemQuantidadeTotal getQuantidadeTotal() { return (field("quantidade_total")).isNull() || (field("quantidade_total")).isMissingNode() ? null : new EmitterIssueCtePayloadAereoProdutosPerigososItemQuantidadeTotal(field("quantidade_total")); }
 public EmitterIssueCtePayloadAereoProdutosPerigososItem setQuantidadeTotal(EmitterIssueCtePayloadAereoProdutosPerigososItemQuantidadeTotal value) { put("quantidade_total", value == null ? null : value.toJson()); return this; }
 public String getUnidadeMedida() { return stringValue(field("unidade_medida")); }
 public EmitterIssueCtePayloadAereoProdutosPerigososItem setUnidadeMedida(String value) { put("unidade_medida", Json.scalar(value)); return this; }
}
