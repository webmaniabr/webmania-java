package com.webmania.sdk.model.api2monitormanagement;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/monitor-management.openapi.json; see contract-provenance.json. */
public final class MonitorCreateCompanyMunicipalityRequest extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("company", "body");
 public MonitorCreateCompanyMunicipalityRequest() { super(FIELDS); }
 public MonitorCreateCompanyMunicipalityRequest(JsonNode node) { super(node, FIELDS); }
 public String getCompany() { return stringValue(field("company")); }
 public MonitorCreateCompanyMunicipalityRequest setCompany(String value) { put("company", Json.scalar(value)); return this; }
 public MonitorCreateMunicipalityRequest getBody() { return (field("body")).isNull() || (field("body")).isMissingNode() ? null : new MonitorCreateMunicipalityRequest(field("body")); }
 public MonitorCreateCompanyMunicipalityRequest setBody(MonitorCreateMunicipalityRequest value) { put("body", value == null ? null : value.toJson()); return this; }
}
