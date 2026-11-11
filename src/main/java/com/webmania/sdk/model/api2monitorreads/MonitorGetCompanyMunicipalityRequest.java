package com.webmania.sdk.model.api2monitorreads;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/monitor-reads.openapi.json; see contract-provenance.json. */
public final class MonitorGetCompanyMunicipalityRequest extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("company", "download");
 public MonitorGetCompanyMunicipalityRequest() { super(FIELDS); }
 public MonitorGetCompanyMunicipalityRequest(JsonNode node) { super(node, FIELDS); }
 public String getCompany() { return stringValue(field("company")); }
 public MonitorGetCompanyMunicipalityRequest setCompany(String value) { put("company", Json.scalar(value)); return this; }
 public String getDownload() { return stringValue(field("download")); }
 public MonitorGetCompanyMunicipalityRequest setDownload(String value) { put("download", Json.scalar(value)); return this; }
}
