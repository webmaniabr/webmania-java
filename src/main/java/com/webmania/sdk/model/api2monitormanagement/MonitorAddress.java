package com.webmania.sdk.model.api2monitormanagement;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/monitor-management.openapi.json; see contract-provenance.json. */
public final class MonitorAddress extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("cep", "municipio", "estado", "codigo_municipio");
 public MonitorAddress() { super(FIELDS); }
 public MonitorAddress(JsonNode node) { super(node, FIELDS); }
 public String getCep() { return stringValue(field("cep")); }
 public MonitorAddress setCep(String value) { put("cep", Json.scalar(value)); return this; }
 public String getMunicipio() { return stringValue(field("municipio")); }
 public MonitorAddress setMunicipio(String value) { put("municipio", Json.scalar(value)); return this; }
 public String getEstado() { return stringValue(field("estado")); }
 public MonitorAddress setEstado(String value) { put("estado", Json.scalar(value)); return this; }
 public MonitorAddressCodigoMunicipio getCodigoMunicipio() { return (field("codigo_municipio")).isNull() || (field("codigo_municipio")).isMissingNode() ? null : new MonitorAddressCodigoMunicipio(field("codigo_municipio")); }
 public MonitorAddress setCodigoMunicipio(MonitorAddressCodigoMunicipio value) { put("codigo_municipio", value == null ? null : value.toJson()); return this; }
}
