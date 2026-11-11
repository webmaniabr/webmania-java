package com.webmania.sdk.model.api2monitormanagement;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/monitor-management.openapi.json; see contract-provenance.json. */
public final class MonitorDocumentMdfeRodoviarioVeiculoTracao extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("codigo_interno", "placa", "renavam", "tara", "capacidade_kg", "capacidade_m3", "tipo_rodado", "tipo_carroceria", "uf_licenciamento", "proprietario");
 public MonitorDocumentMdfeRodoviarioVeiculoTracao() { super(FIELDS); }
 public MonitorDocumentMdfeRodoviarioVeiculoTracao(JsonNode node) { super(node, FIELDS); }
 public String getCodigoInterno() { return stringValue(field("codigo_interno")); }
 public MonitorDocumentMdfeRodoviarioVeiculoTracao setCodigoInterno(String value) { put("codigo_interno", Json.scalar(value)); return this; }
 public String getPlaca() { return stringValue(field("placa")); }
 public MonitorDocumentMdfeRodoviarioVeiculoTracao setPlaca(String value) { put("placa", Json.scalar(value)); return this; }
 public String getRenavam() { return stringValue(field("renavam")); }
 public MonitorDocumentMdfeRodoviarioVeiculoTracao setRenavam(String value) { put("renavam", Json.scalar(value)); return this; }
 public String getTara() { return stringValue(field("tara")); }
 public MonitorDocumentMdfeRodoviarioVeiculoTracao setTara(String value) { put("tara", Json.scalar(value)); return this; }
 public String getCapacidadeKg() { return stringValue(field("capacidade_kg")); }
 public MonitorDocumentMdfeRodoviarioVeiculoTracao setCapacidadeKg(String value) { put("capacidade_kg", Json.scalar(value)); return this; }
 public String getCapacidadeM3() { return stringValue(field("capacidade_m3")); }
 public MonitorDocumentMdfeRodoviarioVeiculoTracao setCapacidadeM3(String value) { put("capacidade_m3", Json.scalar(value)); return this; }
 public String getTipoRodado() { return stringValue(field("tipo_rodado")); }
 public MonitorDocumentMdfeRodoviarioVeiculoTracao setTipoRodado(String value) { put("tipo_rodado", Json.scalar(value)); return this; }
 public String getTipoCarroceria() { return stringValue(field("tipo_carroceria")); }
 public MonitorDocumentMdfeRodoviarioVeiculoTracao setTipoCarroceria(String value) { put("tipo_carroceria", Json.scalar(value)); return this; }
 public String getUfLicenciamento() { return stringValue(field("uf_licenciamento")); }
 public MonitorDocumentMdfeRodoviarioVeiculoTracao setUfLicenciamento(String value) { put("uf_licenciamento", Json.scalar(value)); return this; }
 public MonitorDocumentMdfeRodoviarioVeiculoTracaoProprietario getProprietario() { return (field("proprietario")).isNull() || (field("proprietario")).isMissingNode() ? null : new MonitorDocumentMdfeRodoviarioVeiculoTracaoProprietario(field("proprietario")); }
 public MonitorDocumentMdfeRodoviarioVeiculoTracao setProprietario(MonitorDocumentMdfeRodoviarioVeiculoTracaoProprietario value) { put("proprietario", value == null ? null : value.toJson()); return this; }
}
