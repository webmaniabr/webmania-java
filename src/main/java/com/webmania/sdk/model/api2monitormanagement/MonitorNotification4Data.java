package com.webmania.sdk.model.api2monitormanagement;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/monitor-management.openapi.json; see contract-provenance.json. */
public final class MonitorNotification4Data extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("uuid", "tipo_download", "municipio", "uf", "codigo_ibge", "login", "im", "erro", "data_erro");
 public MonitorNotification4Data() { super(FIELDS); }
 public MonitorNotification4Data(JsonNode node) { super(node, FIELDS); }
 public String getUuid() { return stringValue(field("uuid")); }
 public MonitorNotification4Data setUuid(String value) { put("uuid", Json.scalar(value)); return this; }
 public java.math.BigInteger getTipoDownload() { return integerValue(field("tipo_download")); }
 public MonitorNotification4Data setTipoDownload(java.math.BigInteger value) { put("tipo_download", Json.scalar(value)); return this; }
 public String getMunicipio() { return stringValue(field("municipio")); }
 public MonitorNotification4Data setMunicipio(String value) { put("municipio", Json.scalar(value)); return this; }
 public String getUf() { return stringValue(field("uf")); }
 public MonitorNotification4Data setUf(String value) { put("uf", Json.scalar(value)); return this; }
 public String getCodigoIbge() { return stringValue(field("codigo_ibge")); }
 public MonitorNotification4Data setCodigoIbge(String value) { put("codigo_ibge", Json.scalar(value)); return this; }
 public String getLogin() { return stringValue(field("login")); }
 public MonitorNotification4Data setLogin(String value) { put("login", Json.scalar(value)); return this; }
 public String getIm() { return stringValue(field("im")); }
 public MonitorNotification4Data setIm(String value) { put("im", Json.scalar(value)); return this; }
 public String getErro() { return stringValue(field("erro")); }
 public MonitorNotification4Data setErro(String value) { put("erro", Json.scalar(value)); return this; }
 public String getDataErro() { return stringValue(field("data_erro")); }
 public MonitorNotification4Data setDataErro(String value) { put("data_erro", Json.scalar(value)); return this; }
}
