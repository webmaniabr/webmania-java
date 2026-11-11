package com.webmania.sdk.model.api2cteissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/cte-issuance.openapi.json; see contract-provenance.json. */
public final class EmitterIssueCtePayloadObservacoesFiscoItem extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("descricao", "identificacao");
 public EmitterIssueCtePayloadObservacoesFiscoItem() { super(FIELDS); }
 public EmitterIssueCtePayloadObservacoesFiscoItem(JsonNode node) { super(node, FIELDS); }
 public String getDescricao() { return stringValue(field("descricao")); }
 public EmitterIssueCtePayloadObservacoesFiscoItem setDescricao(String value) { put("descricao", Json.scalar(value)); return this; }
 public String getIdentificacao() { return stringValue(field("identificacao")); }
 public EmitterIssueCtePayloadObservacoesFiscoItem setIdentificacao(String value) { put("identificacao", Json.scalar(value)); return this; }
}
