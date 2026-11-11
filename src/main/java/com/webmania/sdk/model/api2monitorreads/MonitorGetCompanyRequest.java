package com.webmania.sdk.model.api2monitorreads;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/monitor-reads.openapi.json; see contract-provenance.json. */
public final class MonitorGetCompanyRequest extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("company");
 public MonitorGetCompanyRequest() { super(FIELDS); }
 public MonitorGetCompanyRequest(JsonNode node) { super(node, FIELDS); }
 public String getCompany() { return stringValue(field("company")); }
 public MonitorGetCompanyRequest setCompany(String value) { put("company", Json.scalar(value)); return this; }
}
