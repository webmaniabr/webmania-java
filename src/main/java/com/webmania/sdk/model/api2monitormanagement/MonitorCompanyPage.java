package com.webmania.sdk.model.api2monitormanagement;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/monitor-management.openapi.json; see contract-provenance.json. */
public final class MonitorCompanyPage extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("data", "meta");
 public MonitorCompanyPage() { super(FIELDS); }
 public MonitorCompanyPage(JsonNode node) { super(node, FIELDS); }
 public java.util.List<MonitorCompany> getData() { return list(field("data"), v -> (v).isNull() || (v).isMissingNode() ? null : new MonitorCompany(v)); }
 public MonitorCompanyPage setData(java.util.List<MonitorCompany> value) { put("data", array(value, v -> v == null ? null : v.toJson())); return this; }
 public MonitorPagination getMeta() { return (field("meta")).isNull() || (field("meta")).isMissingNode() ? null : new MonitorPagination(field("meta")); }
 public MonitorCompanyPage setMeta(MonitorPagination value) { put("meta", value == null ? null : value.toJson()); return this; }
}
