package com.webmania.sdk.model.api2monitormanagement;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/monitor-management.openapi.json; see contract-provenance.json. */
public final class MonitorCreateMunicipalityRequest extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("codigo_ibge", "login", "senha", "im", "tipo_download");
 public MonitorCreateMunicipalityRequest() { super(FIELDS); }
 public MonitorCreateMunicipalityRequest(JsonNode node) { super(node, FIELDS); }
 public String getCodigoIbge() { return stringValue(field("codigo_ibge")); }
 public MonitorCreateMunicipalityRequest setCodigoIbge(String value) { put("codigo_ibge", Json.scalar(value)); return this; }
 public String getLogin() { return stringValue(field("login")); }
 public MonitorCreateMunicipalityRequest setLogin(String value) { put("login", Json.scalar(value)); return this; }
 public String getSenha() { return stringValue(field("senha")); }
 public MonitorCreateMunicipalityRequest setSenha(String value) { put("senha", Json.scalar(value)); return this; }
 public String getIm() { return stringValue(field("im")); }
 public MonitorCreateMunicipalityRequest setIm(String value) { put("im", Json.scalar(value)); return this; }
 public MonitorCreateMunicipalityRequestTipoDownload getTipoDownload() { return (field("tipo_download")).isNull() || (field("tipo_download")).isMissingNode() ? null : new MonitorCreateMunicipalityRequestTipoDownload(field("tipo_download")); }
 public MonitorCreateMunicipalityRequest setTipoDownload(MonitorCreateMunicipalityRequestTipoDownload value) { put("tipo_download", value == null ? null : value.toJson()); return this; }
}
