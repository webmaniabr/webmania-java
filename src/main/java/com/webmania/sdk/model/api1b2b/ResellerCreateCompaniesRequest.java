package com.webmania.sdk.model.api1b2b;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api1/b2b.openapi.json; see contract-provenance.json. */
public final class ResellerCreateCompaniesRequest extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("quantidade");
 public ResellerCreateCompaniesRequest() { super(FIELDS); }
 public ResellerCreateCompaniesRequest(JsonNode node) { super(node, FIELDS); }
 public java.math.BigInteger getQuantidade() { return integerValue(field("quantidade")); }
 public ResellerCreateCompaniesRequest setQuantidade(java.math.BigInteger value) { put("quantidade", Json.scalar(value)); return this; }
}
