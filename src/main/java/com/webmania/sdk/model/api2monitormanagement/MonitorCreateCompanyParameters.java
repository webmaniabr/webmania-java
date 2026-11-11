package com.webmania.sdk.model.api2monitormanagement;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/monitor-management.openapi.json; see contract-provenance.json. */
public final class MonitorCreateCompanyParameters extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("body");
 public MonitorCreateCompanyParameters() { super(FIELDS); }
 public MonitorCreateCompanyParameters(JsonNode node) { super(node, FIELDS); }
 public MonitorCreateCompanyRequest getBody() { return (field("body")).isNull() || (field("body")).isMissingNode() ? null : new MonitorCreateCompanyRequest(field("body")); }
 public MonitorCreateCompanyParameters setBody(MonitorCreateCompanyRequest value) { put("body", value == null ? null : value.toJson()); return this; }
}
