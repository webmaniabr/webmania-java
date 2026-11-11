package com.webmania.sdk.model.api2monitordocuments;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/monitor-documents.openapi.json; see contract-provenance.json. */
public final class MonitorListReportsRequest extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("status", "page", "per_page");
 public MonitorListReportsRequest() { super(FIELDS); }
 public MonitorListReportsRequest(JsonNode node) { super(node, FIELDS); }
 public String getStatus() { return stringValue(field("status")); }
 public MonitorListReportsRequest setStatus(String value) { put("status", Json.scalar(value)); return this; }
 public java.math.BigInteger getPage() { return integerValue(field("page")); }
 public MonitorListReportsRequest setPage(java.math.BigInteger value) { put("page", Json.scalar(value)); return this; }
 public java.math.BigInteger getPerPage() { return integerValue(field("per_page")); }
 public MonitorListReportsRequest setPerPage(java.math.BigInteger value) { put("per_page", Json.scalar(value)); return this; }
}
