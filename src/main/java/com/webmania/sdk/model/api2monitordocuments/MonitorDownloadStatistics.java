package com.webmania.sdk.model.api2monitordocuments;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/monitor-documents.openapi.json; see contract-provenance.json. */
public final class MonitorDownloadStatistics extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("total_downloads", "empresas");
 public MonitorDownloadStatistics() { super(FIELDS); }
 public MonitorDownloadStatistics(JsonNode node) { super(node, FIELDS); }
 public java.math.BigInteger getTotalDownloads() { return integerValue(field("total_downloads")); }
 public MonitorDownloadStatistics setTotalDownloads(java.math.BigInteger value) { put("total_downloads", Json.scalar(value)); return this; }
 public java.util.List<MonitorDownloadStatisticsEmpresasItem> getEmpresas() { return list(field("empresas"), v -> (v).isNull() || (v).isMissingNode() ? null : new MonitorDownloadStatisticsEmpresasItem(v)); }
 public MonitorDownloadStatistics setEmpresas(java.util.List<MonitorDownloadStatisticsEmpresasItem> value) { put("empresas", array(value, v -> v == null ? null : v.toJson())); return this; }
}
