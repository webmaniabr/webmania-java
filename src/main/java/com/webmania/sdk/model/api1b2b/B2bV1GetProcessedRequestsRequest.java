package com.webmania.sdk.model.api1b2b;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api1/b2b.openapi.json; see contract-provenance.json. */
public final class B2bV1GetProcessedRequestsRequest extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("mes", "ano");
 public B2bV1GetProcessedRequestsRequest() { super(FIELDS); }
 public B2bV1GetProcessedRequestsRequest(JsonNode node) { super(node, FIELDS); }
 public String getMes() { return stringValue(field("mes")); }
 public B2bV1GetProcessedRequestsRequest setMes(String value) { put("mes", Json.scalar(value)); return this; }
 public String getAno() { return stringValue(field("ano")); }
 public B2bV1GetProcessedRequestsRequest setAno(String value) { put("ano", Json.scalar(value)); return this; }
}
