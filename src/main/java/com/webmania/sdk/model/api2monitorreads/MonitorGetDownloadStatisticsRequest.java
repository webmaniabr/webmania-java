package com.webmania.sdk.model.api2monitorreads;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/monitor-reads.openapi.json; see contract-provenance.json. */
public final class MonitorGetDownloadStatisticsRequest extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("ano", "mes");
 public MonitorGetDownloadStatisticsRequest() { super(FIELDS); }
 public MonitorGetDownloadStatisticsRequest(JsonNode node) { super(node, FIELDS); }
 public java.math.BigInteger getAno() { return integerValue(field("ano")); }
 public MonitorGetDownloadStatisticsRequest setAno(java.math.BigInteger value) { put("ano", Json.scalar(value)); return this; }
 public java.math.BigDecimal getMes() { return decimalValue(field("mes")); }
 public MonitorGetDownloadStatisticsRequest setMes(java.math.BigDecimal value) { put("mes", Json.scalar(value)); return this; }
}
