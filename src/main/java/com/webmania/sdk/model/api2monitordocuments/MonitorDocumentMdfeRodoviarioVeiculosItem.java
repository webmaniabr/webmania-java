package com.webmania.sdk.model.api2monitordocuments;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/monitor-documents.openapi.json; see contract-provenance.json. */
public final class MonitorDocumentMdfeRodoviarioVeiculosItem extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("tara", "uf", "capacidade_kg", "codigo_interno", "placa", "tipo_rodado", "condutor", "capacidade_m3", "tipo_carroceria", "renavam");
 public MonitorDocumentMdfeRodoviarioVeiculosItem() { super(FIELDS); }
 public MonitorDocumentMdfeRodoviarioVeiculosItem(JsonNode node) { super(node, FIELDS); }
 public java.math.BigDecimal getTara() { return decimalValue(field("tara")); }
 public MonitorDocumentMdfeRodoviarioVeiculosItem setTara(java.math.BigDecimal value) { put("tara", Json.scalar(value)); return this; }
 public String getUf() { return stringValue(field("uf")); }
 public MonitorDocumentMdfeRodoviarioVeiculosItem setUf(String value) { put("uf", Json.scalar(value)); return this; }
 public java.math.BigDecimal getCapacidadeKg() { return decimalValue(field("capacidade_kg")); }
 public MonitorDocumentMdfeRodoviarioVeiculosItem setCapacidadeKg(java.math.BigDecimal value) { put("capacidade_kg", Json.scalar(value)); return this; }
 public String getCodigoInterno() { return stringValue(field("codigo_interno")); }
 public MonitorDocumentMdfeRodoviarioVeiculosItem setCodigoInterno(String value) { put("codigo_interno", Json.scalar(value)); return this; }
 public String getPlaca() { return stringValue(field("placa")); }
 public MonitorDocumentMdfeRodoviarioVeiculosItem setPlaca(String value) { put("placa", Json.scalar(value)); return this; }
 public String getTipoRodado() { return stringValue(field("tipo_rodado")); }
 public MonitorDocumentMdfeRodoviarioVeiculosItem setTipoRodado(String value) { put("tipo_rodado", Json.scalar(value)); return this; }
 public MonitorDocumentMdfeRodoviarioVeiculosItemCondutor getCondutor() { return (field("condutor")).isNull() || (field("condutor")).isMissingNode() ? null : new MonitorDocumentMdfeRodoviarioVeiculosItemCondutor(field("condutor")); }
 public MonitorDocumentMdfeRodoviarioVeiculosItem setCondutor(MonitorDocumentMdfeRodoviarioVeiculosItemCondutor value) { put("condutor", value == null ? null : value.toJson()); return this; }
 public java.math.BigDecimal getCapacidadeM3() { return decimalValue(field("capacidade_m3")); }
 public MonitorDocumentMdfeRodoviarioVeiculosItem setCapacidadeM3(java.math.BigDecimal value) { put("capacidade_m3", Json.scalar(value)); return this; }
 public String getTipoCarroceria() { return stringValue(field("tipo_carroceria")); }
 public MonitorDocumentMdfeRodoviarioVeiculosItem setTipoCarroceria(String value) { put("tipo_carroceria", Json.scalar(value)); return this; }
 public String getRenavam() { return stringValue(field("renavam")); }
 public MonitorDocumentMdfeRodoviarioVeiculosItem setRenavam(String value) { put("renavam", Json.scalar(value)); return this; }
}
