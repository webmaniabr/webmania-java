package com.webmania.sdk.model.api2monitordocuments;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/monitor-documents.openapi.json; see contract-provenance.json. */
public final class MonitorDocumentNfeTransporteVolumesItem extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("quantidade", "especie", "marca", "numeracao", "peso_liquido", "peso_bruto");
 public MonitorDocumentNfeTransporteVolumesItem() { super(FIELDS); }
 public MonitorDocumentNfeTransporteVolumesItem(JsonNode node) { super(node, FIELDS); }
 public java.math.BigDecimal getQuantidade() { return decimalValue(field("quantidade")); }
 public MonitorDocumentNfeTransporteVolumesItem setQuantidade(java.math.BigDecimal value) { put("quantidade", Json.scalar(value)); return this; }
 public String getEspecie() { return stringValue(field("especie")); }
 public MonitorDocumentNfeTransporteVolumesItem setEspecie(String value) { put("especie", Json.scalar(value)); return this; }
 public String getMarca() { return stringValue(field("marca")); }
 public MonitorDocumentNfeTransporteVolumesItem setMarca(String value) { put("marca", Json.scalar(value)); return this; }
 public String getNumeracao() { return stringValue(field("numeracao")); }
 public MonitorDocumentNfeTransporteVolumesItem setNumeracao(String value) { put("numeracao", Json.scalar(value)); return this; }
 public java.math.BigDecimal getPesoLiquido() { return decimalValue(field("peso_liquido")); }
 public MonitorDocumentNfeTransporteVolumesItem setPesoLiquido(java.math.BigDecimal value) { put("peso_liquido", Json.scalar(value)); return this; }
 public java.math.BigDecimal getPesoBruto() { return decimalValue(field("peso_bruto")); }
 public MonitorDocumentNfeTransporteVolumesItem setPesoBruto(java.math.BigDecimal value) { put("peso_bruto", Json.scalar(value)); return this; }
}
