package com.webmania.sdk.model.api2monitordocuments;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/monitor-documents.openapi.json; see contract-provenance.json. */
public final class MonitorDocumentNfeTransporteVeiculo extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("placa", "uf");
 public MonitorDocumentNfeTransporteVeiculo() { super(FIELDS); }
 public MonitorDocumentNfeTransporteVeiculo(JsonNode node) { super(node, FIELDS); }
 public String getPlaca() { return stringValue(field("placa")); }
 public MonitorDocumentNfeTransporteVeiculo setPlaca(String value) { put("placa", Json.scalar(value)); return this; }
 public String getUf() { return stringValue(field("uf")); }
 public MonitorDocumentNfeTransporteVeiculo setUf(String value) { put("uf", Json.scalar(value)); return this; }
}
