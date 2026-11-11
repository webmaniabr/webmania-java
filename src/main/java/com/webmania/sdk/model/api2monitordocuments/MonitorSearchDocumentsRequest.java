package com.webmania.sdk.model.api2monitordocuments;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/monitor-documents.openapi.json; see contract-provenance.json. */
public final class MonitorSearchDocumentsRequest extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("page", "per_page", "body");
 public MonitorSearchDocumentsRequest() { super(FIELDS); }
 public MonitorSearchDocumentsRequest(JsonNode node) { super(node, FIELDS); }
 public java.math.BigInteger getPage() { return integerValue(field("page")); }
 public MonitorSearchDocumentsRequest setPage(java.math.BigInteger value) { put("page", Json.scalar(value)); return this; }
 public java.math.BigInteger getPerPage() { return integerValue(field("per_page")); }
 public MonitorSearchDocumentsRequest setPerPage(java.math.BigInteger value) { put("per_page", Json.scalar(value)); return this; }
 public MonitorSearchRequest getBody() { return (field("body")).isNull() || (field("body")).isMissingNode() ? null : new MonitorSearchRequest(field("body")); }
 public MonitorSearchDocumentsRequest setBody(MonitorSearchRequest value) { put("body", value == null ? null : value.toJson()); return this; }
}
