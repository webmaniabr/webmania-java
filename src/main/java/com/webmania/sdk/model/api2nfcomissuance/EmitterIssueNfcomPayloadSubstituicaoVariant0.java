package com.webmania.sdk.model.api2nfcomissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/nfcom-issuance.openapi.json; see contract-provenance.json. */
public final class EmitterIssueNfcomPayloadSubstituicaoVariant0 extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("chave_nfcom_substituida", "motivo", "nf_referenciada");
 public EmitterIssueNfcomPayloadSubstituicaoVariant0() { super(FIELDS); }
 public EmitterIssueNfcomPayloadSubstituicaoVariant0(JsonNode node) { super(node, FIELDS); }
 public EmitterIssueNfcomPayloadSubstituicaoVariant0ChaveNfcomSubstituida getChaveNfcomSubstituida() { return (field("chave_nfcom_substituida")).isNull() || (field("chave_nfcom_substituida")).isMissingNode() ? null : new EmitterIssueNfcomPayloadSubstituicaoVariant0ChaveNfcomSubstituida(field("chave_nfcom_substituida")); }
 public EmitterIssueNfcomPayloadSubstituicaoVariant0 setChaveNfcomSubstituida(EmitterIssueNfcomPayloadSubstituicaoVariant0ChaveNfcomSubstituida value) { put("chave_nfcom_substituida", value == null ? null : value.toJson()); return this; }
 public String getMotivo() { return stringValue(field("motivo")); }
 public EmitterIssueNfcomPayloadSubstituicaoVariant0 setMotivo(String value) { put("motivo", Json.scalar(value)); return this; }
 public EmitterIssueNfcomPayloadSubstituicaoVariant0NfReferenciada getNfReferenciada() { return (field("nf_referenciada")).isNull() || (field("nf_referenciada")).isMissingNode() ? null : new EmitterIssueNfcomPayloadSubstituicaoVariant0NfReferenciada(field("nf_referenciada")); }
 public EmitterIssueNfcomPayloadSubstituicaoVariant0 setNfReferenciada(EmitterIssueNfcomPayloadSubstituicaoVariant0NfReferenciada value) { put("nf_referenciada", value == null ? null : value.toJson()); return this; }
}
