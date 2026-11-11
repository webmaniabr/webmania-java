package com.webmania.sdk.model.api2cteissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/cte-issuance.openapi.json; see contract-provenance.json. */
public final class EmitterIssueCtePayloadCargaFluxo extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("destino", "origem", "passagens", "rota");
 public EmitterIssueCtePayloadCargaFluxo() { super(FIELDS); }
 public EmitterIssueCtePayloadCargaFluxo(JsonNode node) { super(node, FIELDS); }
 public String getDestino() { return stringValue(field("destino")); }
 public EmitterIssueCtePayloadCargaFluxo setDestino(String value) { put("destino", Json.scalar(value)); return this; }
 public String getOrigem() { return stringValue(field("origem")); }
 public EmitterIssueCtePayloadCargaFluxo setOrigem(String value) { put("origem", Json.scalar(value)); return this; }
 public java.util.List<String> getPassagens() { return list(field("passagens"), v -> stringValue(v)); }
 public EmitterIssueCtePayloadCargaFluxo setPassagens(java.util.List<String> value) { put("passagens", array(value, v -> Json.scalar(v))); return this; }
 public String getRota() { return stringValue(field("rota")); }
 public EmitterIssueCtePayloadCargaFluxo setRota(String value) { put("rota", Json.scalar(value)); return this; }
}
