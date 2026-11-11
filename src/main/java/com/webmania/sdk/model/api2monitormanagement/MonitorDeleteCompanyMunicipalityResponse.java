package com.webmania.sdk.model.api2monitormanagement;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/monitor-management.openapi.json; see contract-provenance.json. */
public final class MonitorDeleteCompanyMunicipalityResponse extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("msg");
 public MonitorDeleteCompanyMunicipalityResponse() { super(FIELDS); }
 public MonitorDeleteCompanyMunicipalityResponse(JsonNode node) { super(node, FIELDS); }
 public String getMsg() { return stringValue(field("msg")); }
 public MonitorDeleteCompanyMunicipalityResponse setMsg(String value) { put("msg", Json.scalar(value)); return this; }
}
