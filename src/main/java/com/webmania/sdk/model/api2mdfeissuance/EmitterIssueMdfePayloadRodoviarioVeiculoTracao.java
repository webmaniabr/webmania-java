package com.webmania.sdk.model.api2mdfeissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/mdfe-issuance.openapi.json; see contract-provenance.json. */
public final class EmitterIssueMdfePayloadRodoviarioVeiculoTracao extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("capacidade_kg", "capacidade_m3", "codigo_interno", "placa", "proprietario", "renavam", "tara", "tipo_carroceria", "tipo_rodado", "uf_licenciamento");
 public EmitterIssueMdfePayloadRodoviarioVeiculoTracao() { super(FIELDS); }
 public EmitterIssueMdfePayloadRodoviarioVeiculoTracao(JsonNode node) { super(node, FIELDS); }
 public String getCapacidadeKg() { return stringValue(field("capacidade_kg")); }
 public EmitterIssueMdfePayloadRodoviarioVeiculoTracao setCapacidadeKg(String value) { put("capacidade_kg", Json.scalar(value)); return this; }
 public String getCapacidadeM3() { return stringValue(field("capacidade_m3")); }
 public EmitterIssueMdfePayloadRodoviarioVeiculoTracao setCapacidadeM3(String value) { put("capacidade_m3", Json.scalar(value)); return this; }
 public String getCodigoInterno() { return stringValue(field("codigo_interno")); }
 public EmitterIssueMdfePayloadRodoviarioVeiculoTracao setCodigoInterno(String value) { put("codigo_interno", Json.scalar(value)); return this; }
 public String getPlaca() { return stringValue(field("placa")); }
 public EmitterIssueMdfePayloadRodoviarioVeiculoTracao setPlaca(String value) { put("placa", Json.scalar(value)); return this; }
 public EmitterIssueMdfePayloadRodoviarioVeiculoTracaoProprietario getProprietario() { return (field("proprietario")).isNull() || (field("proprietario")).isMissingNode() ? null : new EmitterIssueMdfePayloadRodoviarioVeiculoTracaoProprietario(field("proprietario")); }
 public EmitterIssueMdfePayloadRodoviarioVeiculoTracao setProprietario(EmitterIssueMdfePayloadRodoviarioVeiculoTracaoProprietario value) { put("proprietario", value == null ? null : value.toJson()); return this; }
 public String getRenavam() { return stringValue(field("renavam")); }
 public EmitterIssueMdfePayloadRodoviarioVeiculoTracao setRenavam(String value) { put("renavam", Json.scalar(value)); return this; }
 public String getTara() { return stringValue(field("tara")); }
 public EmitterIssueMdfePayloadRodoviarioVeiculoTracao setTara(String value) { put("tara", Json.scalar(value)); return this; }
 public JsonValue getTipoCarroceria() { return (field("tipo_carroceria")).isNull() || (field("tipo_carroceria")).isMissingNode() ? null : new JsonValue(field("tipo_carroceria")); }
 public EmitterIssueMdfePayloadRodoviarioVeiculoTracao setTipoCarroceria(JsonValue value) { put("tipo_carroceria", value == null ? null : value.toJson()); return this; }
 public JsonValue getTipoRodado() { return (field("tipo_rodado")).isNull() || (field("tipo_rodado")).isMissingNode() ? null : new JsonValue(field("tipo_rodado")); }
 public EmitterIssueMdfePayloadRodoviarioVeiculoTracao setTipoRodado(JsonValue value) { put("tipo_rodado", value == null ? null : value.toJson()); return this; }
 public String getUfLicenciamento() { return stringValue(field("uf_licenciamento")); }
 public EmitterIssueMdfePayloadRodoviarioVeiculoTracao setUfLicenciamento(String value) { put("uf_licenciamento", Json.scalar(value)); return this; }
}
