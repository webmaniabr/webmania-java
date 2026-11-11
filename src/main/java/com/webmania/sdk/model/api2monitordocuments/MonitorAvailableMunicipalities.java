package com.webmania.sdk.model.api2monitordocuments;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/monitor-documents.openapi.json; see contract-provenance.json. */
public final class MonitorAvailableMunicipalities extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("data");
 public MonitorAvailableMunicipalities() { super(FIELDS); }
 public MonitorAvailableMunicipalities(JsonNode node) { super(node, FIELDS); }
 public java.util.List<MonitorAvailableMunicipality> getData() { return list(field("data"), v -> (v).isNull() || (v).isMissingNode() ? null : new MonitorAvailableMunicipality(v)); }
 public MonitorAvailableMunicipalities setData(java.util.List<MonitorAvailableMunicipality> value) { put("data", array(value, v -> v == null ? null : v.toJson())); return this; }
}
