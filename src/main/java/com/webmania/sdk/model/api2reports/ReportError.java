package com.webmania.sdk.model.api2reports;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/reports.openapi.json; see contract-provenance.json. */
public final class ReportError extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("error");
 public ReportError() { super(FIELDS); }
 public ReportError(JsonNode node) { super(node, FIELDS); }
 public String getError() { return stringValue(field("error")); }
 public ReportError setError(String value) { put("error", Json.scalar(value)); return this; }
}
