package com.webmania.sdk.model.api2monitormanagement;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/monitor-management.openapi.json; see contract-provenance.json. */
public final class MonitorUpdateCompanyParameters extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("company", "body");
 public MonitorUpdateCompanyParameters() { super(FIELDS); }
 public MonitorUpdateCompanyParameters(JsonNode node) { super(node, FIELDS); }
 public String getCompany() { return stringValue(field("company")); }
 public MonitorUpdateCompanyParameters setCompany(String value) { put("company", Json.scalar(value)); return this; }
 public MonitorUpdateCompanyRequest getBody() { return (field("body")).isNull() || (field("body")).isMissingNode() ? null : new MonitorUpdateCompanyRequest(field("body")); }
 public MonitorUpdateCompanyParameters setBody(MonitorUpdateCompanyRequest value) { put("body", value == null ? null : value.toJson()); return this; }
}
