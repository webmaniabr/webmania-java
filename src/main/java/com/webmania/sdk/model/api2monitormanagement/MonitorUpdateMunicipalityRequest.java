package com.webmania.sdk.model.api2monitormanagement;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/monitor-management.openapi.json; see contract-provenance.json. */
public final class MonitorUpdateMunicipalityRequest extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("login", "senha", "im");
 public MonitorUpdateMunicipalityRequest() { super(FIELDS); }
 public MonitorUpdateMunicipalityRequest(JsonNode node) { super(node, FIELDS); }
 public String getLogin() { return stringValue(field("login")); }
 public MonitorUpdateMunicipalityRequest setLogin(String value) { put("login", Json.scalar(value)); return this; }
 public String getSenha() { return stringValue(field("senha")); }
 public MonitorUpdateMunicipalityRequest setSenha(String value) { put("senha", Json.scalar(value)); return this; }
 public String getIm() { return stringValue(field("im")); }
 public MonitorUpdateMunicipalityRequest setIm(String value) { put("im", Json.scalar(value)); return this; }
}
