package com.webmania.sdk.model.api1fiscal;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api1/fiscal.openapi.json; see contract-provenance.json. */
public final class FiscalCreateOrPollReportRequest extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("body");
 public FiscalCreateOrPollReportRequest() { super(FIELDS); }
 public FiscalCreateOrPollReportRequest(JsonNode node) { super(node, FIELDS); }
 public FiscalReportRequest getBody() { return (field("body")).isNull() || (field("body")).isMissingNode() ? null : new FiscalReportRequest(field("body")); }
 public FiscalCreateOrPollReportRequest setBody(FiscalReportRequest value) { put("body", value == null ? null : value.toJson()); return this; }
}
