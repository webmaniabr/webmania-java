package com.webmania.sdk.model.api2monitorreads;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/monitor-reads.openapi.json; see contract-provenance.json. */
public final class MonitorListCompaniesRequest extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("page", "per_page", "pesquisa");
 public MonitorListCompaniesRequest() { super(FIELDS); }
 public MonitorListCompaniesRequest(JsonNode node) { super(node, FIELDS); }
 public java.math.BigInteger getPage() { return integerValue(field("page")); }
 public MonitorListCompaniesRequest setPage(java.math.BigInteger value) { put("page", Json.scalar(value)); return this; }
 public java.math.BigInteger getPerPage() { return integerValue(field("per_page")); }
 public MonitorListCompaniesRequest setPerPage(java.math.BigInteger value) { put("per_page", Json.scalar(value)); return this; }
 public String getPesquisa() { return stringValue(field("pesquisa")); }
 public MonitorListCompaniesRequest setPesquisa(String value) { put("pesquisa", Json.scalar(value)); return this; }
}
