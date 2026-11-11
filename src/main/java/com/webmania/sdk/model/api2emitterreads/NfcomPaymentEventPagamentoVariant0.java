package com.webmania.sdk.model.api2emitterreads;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/emitter-reads.openapi.json; see contract-provenance.json. */
public final class NfcomPaymentEventPagamentoVariant0 extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("nPag", "idTransacao", "tpMeioPgto", "CNPJReceb", "CNPJBasePSP");
 public NfcomPaymentEventPagamentoVariant0() { super(FIELDS); }
 public NfcomPaymentEventPagamentoVariant0(JsonNode node) { super(node, FIELDS); }
 public NfcomPaymentEventPagamentoVariant0NPag getNPag() { return (field("nPag")).isNull() || (field("nPag")).isMissingNode() ? null : new NfcomPaymentEventPagamentoVariant0NPag(field("nPag")); }
 public NfcomPaymentEventPagamentoVariant0 setNPag(NfcomPaymentEventPagamentoVariant0NPag value) { put("nPag", value == null ? null : value.toJson()); return this; }
 public NfcomPaymentEventPagamentoVariant0IdTransacao getIdTransacao() { return (field("idTransacao")).isNull() || (field("idTransacao")).isMissingNode() ? null : new NfcomPaymentEventPagamentoVariant0IdTransacao(field("idTransacao")); }
 public NfcomPaymentEventPagamentoVariant0 setIdTransacao(NfcomPaymentEventPagamentoVariant0IdTransacao value) { put("idTransacao", value == null ? null : value.toJson()); return this; }
 public NfcomPaymentEventPagamentoVariant0TpMeioPgto getTpMeioPgto() { return (field("tpMeioPgto")).isNull() || (field("tpMeioPgto")).isMissingNode() ? null : new NfcomPaymentEventPagamentoVariant0TpMeioPgto(field("tpMeioPgto")); }
 public NfcomPaymentEventPagamentoVariant0 setTpMeioPgto(NfcomPaymentEventPagamentoVariant0TpMeioPgto value) { put("tpMeioPgto", value == null ? null : value.toJson()); return this; }
 public NfcomPaymentEventPagamentoVariant0CNPJReceb getCNPJReceb() { return (field("CNPJReceb")).isNull() || (field("CNPJReceb")).isMissingNode() ? null : new NfcomPaymentEventPagamentoVariant0CNPJReceb(field("CNPJReceb")); }
 public NfcomPaymentEventPagamentoVariant0 setCNPJReceb(NfcomPaymentEventPagamentoVariant0CNPJReceb value) { put("CNPJReceb", value == null ? null : value.toJson()); return this; }
 public NfcomPaymentEventPagamentoVariant0CNPJBasePSP getCNPJBasePSP() { return (field("CNPJBasePSP")).isNull() || (field("CNPJBasePSP")).isMissingNode() ? null : new NfcomPaymentEventPagamentoVariant0CNPJBasePSP(field("CNPJBasePSP")); }
 public NfcomPaymentEventPagamentoVariant0 setCNPJBasePSP(NfcomPaymentEventPagamentoVariant0CNPJBasePSP value) { put("CNPJBasePSP", value == null ? null : value.toJson()); return this; }
}
