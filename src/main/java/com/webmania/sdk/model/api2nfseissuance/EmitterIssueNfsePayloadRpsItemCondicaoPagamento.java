package com.webmania.sdk.model.api2nfseissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/nfse-issuance.openapi.json; see contract-provenance.json. */
public final class EmitterIssueNfsePayloadRpsItemCondicaoPagamento extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("condicao", "parcelas", "qtd_parcela");
 public EmitterIssueNfsePayloadRpsItemCondicaoPagamento() { super(FIELDS); }
 public EmitterIssueNfsePayloadRpsItemCondicaoPagamento(JsonNode node) { super(node, FIELDS); }
 public String getCondicao() { return stringValue(field("condicao")); }
 public EmitterIssueNfsePayloadRpsItemCondicaoPagamento setCondicao(String value) { put("condicao", Json.scalar(value)); return this; }
 public java.util.List<EmitterIssueNfsePayloadRpsItemCondicaoPagamentoParcelasItem> getParcelas() { return list(field("parcelas"), v -> (v).isNull() || (v).isMissingNode() ? null : new EmitterIssueNfsePayloadRpsItemCondicaoPagamentoParcelasItem(v)); }
 public EmitterIssueNfsePayloadRpsItemCondicaoPagamento setParcelas(java.util.List<EmitterIssueNfsePayloadRpsItemCondicaoPagamentoParcelasItem> value) { put("parcelas", array(value, v -> v == null ? null : v.toJson())); return this; }
 public EmitterIssueNfsePayloadRpsItemCondicaoPagamentoQtdParcela getQtdParcela() { return (field("qtd_parcela")).isNull() || (field("qtd_parcela")).isMissingNode() ? null : new EmitterIssueNfsePayloadRpsItemCondicaoPagamentoQtdParcela(field("qtd_parcela")); }
 public EmitterIssueNfsePayloadRpsItemCondicaoPagamento setQtdParcela(EmitterIssueNfsePayloadRpsItemCondicaoPagamentoQtdParcela value) { put("qtd_parcela", value == null ? null : value.toJson()); return this; }
}
