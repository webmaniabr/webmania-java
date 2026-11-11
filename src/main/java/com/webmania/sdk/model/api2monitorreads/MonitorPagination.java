package com.webmania.sdk.model.api2monitorreads;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/monitor-reads.openapi.json; see contract-provenance.json. */
public final class MonitorPagination extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("current_page", "last_page", "per_page", "total");
 public MonitorPagination() { super(FIELDS); }
 public MonitorPagination(JsonNode node) { super(node, FIELDS); }
 public java.math.BigInteger getCurrentPage() { return integerValue(field("current_page")); }
 public MonitorPagination setCurrentPage(java.math.BigInteger value) { put("current_page", Json.scalar(value)); return this; }
 public java.math.BigInteger getLastPage() { return integerValue(field("last_page")); }
 public MonitorPagination setLastPage(java.math.BigInteger value) { put("last_page", Json.scalar(value)); return this; }
 public java.math.BigInteger getPerPage() { return integerValue(field("per_page")); }
 public MonitorPagination setPerPage(java.math.BigInteger value) { put("per_page", Json.scalar(value)); return this; }
 public java.math.BigInteger getTotal() { return integerValue(field("total")); }
 public MonitorPagination setTotal(java.math.BigInteger value) { put("total", Json.scalar(value)); return this; }
}
