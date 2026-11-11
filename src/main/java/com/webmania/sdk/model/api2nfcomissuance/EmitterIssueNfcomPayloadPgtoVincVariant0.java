package com.webmania.sdk.model.api2nfcomissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/nfcom-issuance.openapi.json; see contract-provenance.json. */
public final class EmitterIssueNfcomPayloadPgtoVincVariant0 extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("pagamentos");
 public EmitterIssueNfcomPayloadPgtoVincVariant0() { super(FIELDS); }
 public EmitterIssueNfcomPayloadPgtoVincVariant0(JsonNode node) { super(node, FIELDS); }
 public java.util.List<EmitterIssueNfcomPayloadPgtoVincVariant0PagamentosItem> getPagamentos() { return list(field("pagamentos"), v -> (v).isNull() || (v).isMissingNode() ? null : new EmitterIssueNfcomPayloadPgtoVincVariant0PagamentosItem(v)); }
 public EmitterIssueNfcomPayloadPgtoVincVariant0 setPagamentos(java.util.List<EmitterIssueNfcomPayloadPgtoVincVariant0PagamentosItem> value) { put("pagamentos", array(value, v -> v == null ? null : v.toJson())); return this; }
}
