package com.webmania.sdk.model.api1files;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api1/files.openapi.json; see contract-provenance.json. */
public final class FiscalDownloadReportRequest extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("uuid");
 public FiscalDownloadReportRequest() { super(FIELDS); }
 public FiscalDownloadReportRequest(JsonNode node) { super(node, FIELDS); }
 public Uuid getUuid() { return (field("uuid")).isNull() || (field("uuid")).isMissingNode() ? null : new Uuid(field("uuid")); }
 public FiscalDownloadReportRequest setUuid(Uuid value) { put("uuid", value == null ? null : value.toJson()); return this; }
}
