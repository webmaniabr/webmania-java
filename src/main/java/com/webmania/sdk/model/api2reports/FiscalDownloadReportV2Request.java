package com.webmania.sdk.model.api2reports;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/reports.openapi.json; see contract-provenance.json. */
public final class FiscalDownloadReportV2Request extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("uuid");
 public FiscalDownloadReportV2Request() { super(FIELDS); }
 public FiscalDownloadReportV2Request(JsonNode node) { super(node, FIELDS); }
 public ReportUuid getUuid() { return (field("uuid")).isNull() || (field("uuid")).isMissingNode() ? null : new ReportUuid(field("uuid")); }
 public FiscalDownloadReportV2Request setUuid(ReportUuid value) { put("uuid", value == null ? null : value.toJson()); return this; }
}
