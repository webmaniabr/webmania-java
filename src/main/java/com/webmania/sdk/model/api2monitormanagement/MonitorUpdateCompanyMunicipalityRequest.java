package com.webmania.sdk.model.api2monitormanagement;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/monitor-management.openapi.json; see contract-provenance.json. */
public final class MonitorUpdateCompanyMunicipalityRequest extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("company", "download", "body");
 public MonitorUpdateCompanyMunicipalityRequest() { super(FIELDS); }
 public MonitorUpdateCompanyMunicipalityRequest(JsonNode node) { super(node, FIELDS); }
 public String getCompany() { return stringValue(field("company")); }
 public MonitorUpdateCompanyMunicipalityRequest setCompany(String value) { put("company", Json.scalar(value)); return this; }
 public String getDownload() { return stringValue(field("download")); }
 public MonitorUpdateCompanyMunicipalityRequest setDownload(String value) { put("download", Json.scalar(value)); return this; }
 public MonitorUpdateMunicipalityRequest getBody() { return (field("body")).isNull() || (field("body")).isMissingNode() ? null : new MonitorUpdateMunicipalityRequest(field("body")); }
 public MonitorUpdateCompanyMunicipalityRequest setBody(MonitorUpdateMunicipalityRequest value) { put("body", value == null ? null : value.toJson()); return this; }
}
