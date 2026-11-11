package com.webmania.sdk.model.api2monitormanagement;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/monitor-management.openapi.json; see contract-provenance.json. */
public final class MonitorDeleteCompanyMunicipalityRequest extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("company", "download");
 public MonitorDeleteCompanyMunicipalityRequest() { super(FIELDS); }
 public MonitorDeleteCompanyMunicipalityRequest(JsonNode node) { super(node, FIELDS); }
 public String getCompany() { return stringValue(field("company")); }
 public MonitorDeleteCompanyMunicipalityRequest setCompany(String value) { put("company", Json.scalar(value)); return this; }
 public String getDownload() { return stringValue(field("download")); }
 public MonitorDeleteCompanyMunicipalityRequest setDownload(String value) { put("download", Json.scalar(value)); return this; }
}
