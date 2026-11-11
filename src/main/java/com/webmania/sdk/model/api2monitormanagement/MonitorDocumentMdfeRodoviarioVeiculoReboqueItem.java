package com.webmania.sdk.model.api2monitormanagement;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/monitor-management.openapi.json; see contract-provenance.json. */
public final class MonitorDocumentMdfeRodoviarioVeiculoReboqueItem extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("codigo_interno", "placa", "renavam", "tara", "capacidade_kg", "capacidade_m3", "tipo_carroceria", "uf_licenciamento", "proprietario");
 public MonitorDocumentMdfeRodoviarioVeiculoReboqueItem() { super(FIELDS); }
 public MonitorDocumentMdfeRodoviarioVeiculoReboqueItem(JsonNode node) { super(node, FIELDS); }
 public String getCodigoInterno() { return stringValue(field("codigo_interno")); }
 public MonitorDocumentMdfeRodoviarioVeiculoReboqueItem setCodigoInterno(String value) { put("codigo_interno", Json.scalar(value)); return this; }
 public String getPlaca() { return stringValue(field("placa")); }
 public MonitorDocumentMdfeRodoviarioVeiculoReboqueItem setPlaca(String value) { put("placa", Json.scalar(value)); return this; }
 public String getRenavam() { return stringValue(field("renavam")); }
 public MonitorDocumentMdfeRodoviarioVeiculoReboqueItem setRenavam(String value) { put("renavam", Json.scalar(value)); return this; }
 public String getTara() { return stringValue(field("tara")); }
 public MonitorDocumentMdfeRodoviarioVeiculoReboqueItem setTara(String value) { put("tara", Json.scalar(value)); return this; }
 public String getCapacidadeKg() { return stringValue(field("capacidade_kg")); }
 public MonitorDocumentMdfeRodoviarioVeiculoReboqueItem setCapacidadeKg(String value) { put("capacidade_kg", Json.scalar(value)); return this; }
 public String getCapacidadeM3() { return stringValue(field("capacidade_m3")); }
 public MonitorDocumentMdfeRodoviarioVeiculoReboqueItem setCapacidadeM3(String value) { put("capacidade_m3", Json.scalar(value)); return this; }
 public String getTipoCarroceria() { return stringValue(field("tipo_carroceria")); }
 public MonitorDocumentMdfeRodoviarioVeiculoReboqueItem setTipoCarroceria(String value) { put("tipo_carroceria", Json.scalar(value)); return this; }
 public String getUfLicenciamento() { return stringValue(field("uf_licenciamento")); }
 public MonitorDocumentMdfeRodoviarioVeiculoReboqueItem setUfLicenciamento(String value) { put("uf_licenciamento", Json.scalar(value)); return this; }
 public MonitorDocumentMdfeRodoviarioVeiculoReboqueItemProprietario getProprietario() { return (field("proprietario")).isNull() || (field("proprietario")).isMissingNode() ? null : new MonitorDocumentMdfeRodoviarioVeiculoReboqueItemProprietario(field("proprietario")); }
 public MonitorDocumentMdfeRodoviarioVeiculoReboqueItem setProprietario(MonitorDocumentMdfeRodoviarioVeiculoReboqueItemProprietario value) { put("proprietario", value == null ? null : value.toJson()); return this; }
}
