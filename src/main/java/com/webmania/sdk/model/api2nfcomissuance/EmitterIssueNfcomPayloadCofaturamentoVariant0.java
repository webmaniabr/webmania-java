package com.webmania.sdk.model.api2nfcomissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/nfcom-issuance.openapi.json; see contract-provenance.json. */
public final class EmitterIssueNfcomPayloadCofaturamentoVariant0 extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("chave_nfcom_local", "nf_referenciada");
 public EmitterIssueNfcomPayloadCofaturamentoVariant0() { super(FIELDS); }
 public EmitterIssueNfcomPayloadCofaturamentoVariant0(JsonNode node) { super(node, FIELDS); }
 public EmitterIssueNfcomPayloadCofaturamentoVariant0ChaveNfcomLocal getChaveNfcomLocal() { return (field("chave_nfcom_local")).isNull() || (field("chave_nfcom_local")).isMissingNode() ? null : new EmitterIssueNfcomPayloadCofaturamentoVariant0ChaveNfcomLocal(field("chave_nfcom_local")); }
 public EmitterIssueNfcomPayloadCofaturamentoVariant0 setChaveNfcomLocal(EmitterIssueNfcomPayloadCofaturamentoVariant0ChaveNfcomLocal value) { put("chave_nfcom_local", value == null ? null : value.toJson()); return this; }
 public EmitterIssueNfcomPayloadCofaturamentoVariant0NfReferenciada getNfReferenciada() { return (field("nf_referenciada")).isNull() || (field("nf_referenciada")).isMissingNode() ? null : new EmitterIssueNfcomPayloadCofaturamentoVariant0NfReferenciada(field("nf_referenciada")); }
 public EmitterIssueNfcomPayloadCofaturamentoVariant0 setNfReferenciada(EmitterIssueNfcomPayloadCofaturamentoVariant0NfReferenciada value) { put("nf_referenciada", value == null ? null : value.toJson()); return this; }
}
