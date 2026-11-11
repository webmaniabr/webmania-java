package com.webmania.sdk.model.api2nfcomissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/nfcom-issuance.openapi.json; see contract-provenance.json. */
public final class NfcomDocumentedGroup2114 extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("substituicao", "substituicao.chave_nfcom_substituida", "substituicao.motivo", "substituicao.nf_referenciada.*");
 public NfcomDocumentedGroup2114() { super(FIELDS); }
 public NfcomDocumentedGroup2114(JsonNode node) { super(node, FIELDS); }
 public NfcomDocumentedGroup2114Substituicao getSubstituicao() { return (field("substituicao")).isNull() || (field("substituicao")).isMissingNode() ? null : new NfcomDocumentedGroup2114Substituicao(field("substituicao")); }
 public NfcomDocumentedGroup2114 setSubstituicao(NfcomDocumentedGroup2114Substituicao value) { put("substituicao", value == null ? null : value.toJson()); return this; }
 public String getSubstituicaoChaveNfcomSubstituida() { return stringValue(field("substituicao.chave_nfcom_substituida")); }
 public NfcomDocumentedGroup2114 setSubstituicaoChaveNfcomSubstituida(String value) { put("substituicao.chave_nfcom_substituida", Json.scalar(value)); return this; }
 public String getSubstituicaoMotivo() { return stringValue(field("substituicao.motivo")); }
 public NfcomDocumentedGroup2114 setSubstituicaoMotivo(String value) { put("substituicao.motivo", Json.scalar(value)); return this; }
 public NfcomDocumentedGroup2114SubstituicaoNfReferenciada getSubstituicaoNfReferenciada() { return (field("substituicao.nf_referenciada.*")).isNull() || (field("substituicao.nf_referenciada.*")).isMissingNode() ? null : new NfcomDocumentedGroup2114SubstituicaoNfReferenciada(field("substituicao.nf_referenciada.*")); }
 public NfcomDocumentedGroup2114 setSubstituicaoNfReferenciada(NfcomDocumentedGroup2114SubstituicaoNfReferenciada value) { put("substituicao.nf_referenciada.*", value == null ? null : value.toJson()); return this; }
}
