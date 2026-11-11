package com.webmania.sdk.model.api2monitormanagement;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/monitor-management.openapi.json; see contract-provenance.json. */
public final class MonitorDownloadStatisticsEmpresasItem extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("empresa_uuid", "total_downloads");
 public MonitorDownloadStatisticsEmpresasItem() { super(FIELDS); }
 public MonitorDownloadStatisticsEmpresasItem(JsonNode node) { super(node, FIELDS); }
 public String getEmpresaUuid() { return stringValue(field("empresa_uuid")); }
 public MonitorDownloadStatisticsEmpresasItem setEmpresaUuid(String value) { put("empresa_uuid", Json.scalar(value)); return this; }
 public java.math.BigInteger getTotalDownloads() { return integerValue(field("total_downloads")); }
 public MonitorDownloadStatisticsEmpresasItem setTotalDownloads(java.math.BigInteger value) { put("total_downloads", Json.scalar(value)); return this; }
}
