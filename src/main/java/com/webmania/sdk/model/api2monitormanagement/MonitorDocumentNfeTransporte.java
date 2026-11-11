package com.webmania.sdk.model.api2monitormanagement;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/monitor-management.openapi.json; see contract-provenance.json. */
public final class MonitorDocumentNfeTransporte extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("peso_liquido", "volume", "veiculo", "especie", "numeracao", "peso_bruto", "retirada", "marca", "entrega", "volumes", "transportadora", "modalidade_frete");
 public MonitorDocumentNfeTransporte() { super(FIELDS); }
 public MonitorDocumentNfeTransporte(JsonNode node) { super(node, FIELDS); }
 public java.math.BigDecimal getPesoLiquido() { return decimalValue(field("peso_liquido")); }
 public MonitorDocumentNfeTransporte setPesoLiquido(java.math.BigDecimal value) { put("peso_liquido", Json.scalar(value)); return this; }
 public String getVolume() { return stringValue(field("volume")); }
 public MonitorDocumentNfeTransporte setVolume(String value) { put("volume", Json.scalar(value)); return this; }
 public MonitorDocumentNfeTransporteVeiculo getVeiculo() { return (field("veiculo")).isNull() || (field("veiculo")).isMissingNode() ? null : new MonitorDocumentNfeTransporteVeiculo(field("veiculo")); }
 public MonitorDocumentNfeTransporte setVeiculo(MonitorDocumentNfeTransporteVeiculo value) { put("veiculo", value == null ? null : value.toJson()); return this; }
 public String getEspecie() { return stringValue(field("especie")); }
 public MonitorDocumentNfeTransporte setEspecie(String value) { put("especie", Json.scalar(value)); return this; }
 public String getNumeracao() { return stringValue(field("numeracao")); }
 public MonitorDocumentNfeTransporte setNumeracao(String value) { put("numeracao", Json.scalar(value)); return this; }
 public java.math.BigDecimal getPesoBruto() { return decimalValue(field("peso_bruto")); }
 public MonitorDocumentNfeTransporte setPesoBruto(java.math.BigDecimal value) { put("peso_bruto", Json.scalar(value)); return this; }
 public MonitorDocumentNfeTransporteRetirada getRetirada() { return (field("retirada")).isNull() || (field("retirada")).isMissingNode() ? null : new MonitorDocumentNfeTransporteRetirada(field("retirada")); }
 public MonitorDocumentNfeTransporte setRetirada(MonitorDocumentNfeTransporteRetirada value) { put("retirada", value == null ? null : value.toJson()); return this; }
 public String getMarca() { return stringValue(field("marca")); }
 public MonitorDocumentNfeTransporte setMarca(String value) { put("marca", Json.scalar(value)); return this; }
 public MonitorDocumentNfeTransporteEntrega getEntrega() { return (field("entrega")).isNull() || (field("entrega")).isMissingNode() ? null : new MonitorDocumentNfeTransporteEntrega(field("entrega")); }
 public MonitorDocumentNfeTransporte setEntrega(MonitorDocumentNfeTransporteEntrega value) { put("entrega", value == null ? null : value.toJson()); return this; }
 public java.util.List<MonitorDocumentNfeTransporteVolumesItem> getVolumes() { return list(field("volumes"), v -> (v).isNull() || (v).isMissingNode() ? null : new MonitorDocumentNfeTransporteVolumesItem(v)); }
 public MonitorDocumentNfeTransporte setVolumes(java.util.List<MonitorDocumentNfeTransporteVolumesItem> value) { put("volumes", array(value, v -> v == null ? null : v.toJson())); return this; }
 public MonitorDocumentNfeTransporteTransportadora getTransportadora() { return (field("transportadora")).isNull() || (field("transportadora")).isMissingNode() ? null : new MonitorDocumentNfeTransporteTransportadora(field("transportadora")); }
 public MonitorDocumentNfeTransporte setTransportadora(MonitorDocumentNfeTransporteTransportadora value) { put("transportadora", value == null ? null : value.toJson()); return this; }
 public java.math.BigDecimal getModalidadeFrete() { return decimalValue(field("modalidade_frete")); }
 public MonitorDocumentNfeTransporte setModalidadeFrete(java.math.BigDecimal value) { put("modalidade_frete", Json.scalar(value)); return this; }
}
