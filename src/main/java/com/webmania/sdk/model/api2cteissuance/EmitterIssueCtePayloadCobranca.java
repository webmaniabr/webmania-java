package com.webmania.sdk.model.api2cteissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/cte-issuance.openapi.json; see contract-provenance.json. */
public final class EmitterIssueCtePayloadCobranca extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("duplicatas", "fatura");
 public EmitterIssueCtePayloadCobranca() { super(FIELDS); }
 public EmitterIssueCtePayloadCobranca(JsonNode node) { super(node, FIELDS); }
 public java.util.List<EmitterIssueCtePayloadCobrancaDuplicatasItem> getDuplicatas() { return list(field("duplicatas"), v -> (v).isNull() || (v).isMissingNode() ? null : new EmitterIssueCtePayloadCobrancaDuplicatasItem(v)); }
 public EmitterIssueCtePayloadCobranca setDuplicatas(java.util.List<EmitterIssueCtePayloadCobrancaDuplicatasItem> value) { put("duplicatas", array(value, v -> v == null ? null : v.toJson())); return this; }
 public EmitterIssueCtePayloadCobrancaFatura getFatura() { return (field("fatura")).isNull() || (field("fatura")).isMissingNode() ? null : new EmitterIssueCtePayloadCobrancaFatura(field("fatura")); }
 public EmitterIssueCtePayloadCobranca setFatura(EmitterIssueCtePayloadCobrancaFatura value) { put("fatura", value == null ? null : value.toJson()); return this; }
}
