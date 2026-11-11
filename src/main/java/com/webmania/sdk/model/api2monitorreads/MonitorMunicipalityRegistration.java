package com.webmania.sdk.model.api2monitorreads;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/monitor-reads.openapi.json; see contract-provenance.json. */
public final class MonitorMunicipalityRegistration extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("uuid", "tipo_download", "municipio", "uf", "codigo_ibge", "login", "im");
 public MonitorMunicipalityRegistration() { super(FIELDS); }
 public MonitorMunicipalityRegistration(JsonNode node) { super(node, FIELDS); }
 public String getUuid() { return stringValue(field("uuid")); }
 public MonitorMunicipalityRegistration setUuid(String value) { put("uuid", Json.scalar(value)); return this; }
 public java.math.BigInteger getTipoDownload() { return integerValue(field("tipo_download")); }
 public MonitorMunicipalityRegistration setTipoDownload(java.math.BigInteger value) { put("tipo_download", Json.scalar(value)); return this; }
 public String getMunicipio() { return stringValue(field("municipio")); }
 public MonitorMunicipalityRegistration setMunicipio(String value) { put("municipio", Json.scalar(value)); return this; }
 public String getUf() { return stringValue(field("uf")); }
 public MonitorMunicipalityRegistration setUf(String value) { put("uf", Json.scalar(value)); return this; }
 public String getCodigoIbge() { return stringValue(field("codigo_ibge")); }
 public MonitorMunicipalityRegistration setCodigoIbge(String value) { put("codigo_ibge", Json.scalar(value)); return this; }
 public String getLogin() { return stringValue(field("login")); }
 public MonitorMunicipalityRegistration setLogin(String value) { put("login", Json.scalar(value)); return this; }
 public String getIm() { return stringValue(field("im")); }
 public MonitorMunicipalityRegistration setIm(String value) { put("im", Json.scalar(value)); return this; }
}
