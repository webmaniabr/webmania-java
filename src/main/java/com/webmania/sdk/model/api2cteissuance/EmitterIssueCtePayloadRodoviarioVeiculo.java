package com.webmania.sdk.model.api2cteissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/cte-issuance.openapi.json; see contract-provenance.json. */
public final class EmitterIssueCtePayloadRodoviarioVeiculo extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("placa", "proprietario", "renavam", "uf_licenciamento");
 public EmitterIssueCtePayloadRodoviarioVeiculo() { super(FIELDS); }
 public EmitterIssueCtePayloadRodoviarioVeiculo(JsonNode node) { super(node, FIELDS); }
 public String getPlaca() { return stringValue(field("placa")); }
 public EmitterIssueCtePayloadRodoviarioVeiculo setPlaca(String value) { put("placa", Json.scalar(value)); return this; }
 public EmitterIssueCtePayloadRodoviarioVeiculoProprietario getProprietario() { return (field("proprietario")).isNull() || (field("proprietario")).isMissingNode() ? null : new EmitterIssueCtePayloadRodoviarioVeiculoProprietario(field("proprietario")); }
 public EmitterIssueCtePayloadRodoviarioVeiculo setProprietario(EmitterIssueCtePayloadRodoviarioVeiculoProprietario value) { put("proprietario", value == null ? null : value.toJson()); return this; }
 public String getRenavam() { return stringValue(field("renavam")); }
 public EmitterIssueCtePayloadRodoviarioVeiculo setRenavam(String value) { put("renavam", Json.scalar(value)); return this; }
 public String getUfLicenciamento() { return stringValue(field("uf_licenciamento")); }
 public EmitterIssueCtePayloadRodoviarioVeiculo setUfLicenciamento(String value) { put("uf_licenciamento", Json.scalar(value)); return this; }
}
