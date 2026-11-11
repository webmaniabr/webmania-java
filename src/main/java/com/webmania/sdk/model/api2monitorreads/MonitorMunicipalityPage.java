package com.webmania.sdk.model.api2monitorreads;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/monitor-reads.openapi.json; see contract-provenance.json. */
public final class MonitorMunicipalityPage extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("data", "meta");
 public MonitorMunicipalityPage() { super(FIELDS); }
 public MonitorMunicipalityPage(JsonNode node) { super(node, FIELDS); }
 public java.util.List<MonitorMunicipalityRegistration> getData() { return list(field("data"), v -> (v).isNull() || (v).isMissingNode() ? null : new MonitorMunicipalityRegistration(v)); }
 public MonitorMunicipalityPage setData(java.util.List<MonitorMunicipalityRegistration> value) { put("data", array(value, v -> v == null ? null : v.toJson())); return this; }
 public MonitorPagination getMeta() { return (field("meta")).isNull() || (field("meta")).isMissingNode() ? null : new MonitorPagination(field("meta")); }
 public MonitorMunicipalityPage setMeta(MonitorPagination value) { put("meta", value == null ? null : value.toJson()); return this; }
}
