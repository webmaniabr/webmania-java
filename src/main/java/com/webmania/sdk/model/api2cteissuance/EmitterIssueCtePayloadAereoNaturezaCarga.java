package com.webmania.sdk.model.api2cteissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/cte-issuance.openapi.json; see contract-provenance.json. */
public final class EmitterIssueCtePayloadAereoNaturezaCarga extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("dimensoes", "informacoes_manuseio");
 public EmitterIssueCtePayloadAereoNaturezaCarga() { super(FIELDS); }
 public EmitterIssueCtePayloadAereoNaturezaCarga(JsonNode node) { super(node, FIELDS); }
 public String getDimensoes() { return stringValue(field("dimensoes")); }
 public EmitterIssueCtePayloadAereoNaturezaCarga setDimensoes(String value) { put("dimensoes", Json.scalar(value)); return this; }
 public java.util.List<String> getInformacoesManuseio() { return list(field("informacoes_manuseio"), v -> stringValue(v)); }
 public EmitterIssueCtePayloadAereoNaturezaCarga setInformacoesManuseio(java.util.List<String> value) { put("informacoes_manuseio", array(value, v -> Json.scalar(v))); return this; }
}
