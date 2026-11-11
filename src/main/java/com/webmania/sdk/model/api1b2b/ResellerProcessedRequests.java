package com.webmania.sdk.model.api1b2b;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api1/b2b.openapi.json; see contract-provenance.json. */
public final class ResellerProcessedRequests extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("total_notas_processadas", "empresas");
 public ResellerProcessedRequests() { super(FIELDS); }
 public ResellerProcessedRequests(JsonNode node) { super(node, FIELDS); }
 public java.math.BigInteger getTotalNotasProcessadas() { return integerValue(field("total_notas_processadas")); }
 public ResellerProcessedRequests setTotalNotasProcessadas(java.math.BigInteger value) { put("total_notas_processadas", Json.scalar(value)); return this; }
 public java.util.List<ResellerCompanyProcessedRequests> getEmpresas() { return list(field("empresas"), v -> (v).isNull() || (v).isMissingNode() ? null : new ResellerCompanyProcessedRequests(v)); }
 public ResellerProcessedRequests setEmpresas(java.util.List<ResellerCompanyProcessedRequests> value) { put("empresas", array(value, v -> v == null ? null : v.toJson())); return this; }
}
