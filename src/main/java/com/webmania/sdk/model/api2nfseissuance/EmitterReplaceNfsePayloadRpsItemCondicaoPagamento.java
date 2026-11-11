package com.webmania.sdk.model.api2nfseissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/nfse-issuance.openapi.json; see contract-provenance.json. */
public final class EmitterReplaceNfsePayloadRpsItemCondicaoPagamento extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("condicao", "parcelas", "qtd_parcela");
 public EmitterReplaceNfsePayloadRpsItemCondicaoPagamento() { super(FIELDS); }
 public EmitterReplaceNfsePayloadRpsItemCondicaoPagamento(JsonNode node) { super(node, FIELDS); }
 public String getCondicao() { return stringValue(field("condicao")); }
 public EmitterReplaceNfsePayloadRpsItemCondicaoPagamento setCondicao(String value) { put("condicao", Json.scalar(value)); return this; }
 public java.util.List<EmitterReplaceNfsePayloadRpsItemCondicaoPagamentoParcelasItem> getParcelas() { return list(field("parcelas"), v -> (v).isNull() || (v).isMissingNode() ? null : new EmitterReplaceNfsePayloadRpsItemCondicaoPagamentoParcelasItem(v)); }
 public EmitterReplaceNfsePayloadRpsItemCondicaoPagamento setParcelas(java.util.List<EmitterReplaceNfsePayloadRpsItemCondicaoPagamentoParcelasItem> value) { put("parcelas", array(value, v -> v == null ? null : v.toJson())); return this; }
 public EmitterReplaceNfsePayloadRpsItemCondicaoPagamentoQtdParcela getQtdParcela() { return (field("qtd_parcela")).isNull() || (field("qtd_parcela")).isMissingNode() ? null : new EmitterReplaceNfsePayloadRpsItemCondicaoPagamentoQtdParcela(field("qtd_parcela")); }
 public EmitterReplaceNfsePayloadRpsItemCondicaoPagamento setQtdParcela(EmitterReplaceNfsePayloadRpsItemCondicaoPagamentoQtdParcela value) { put("qtd_parcela", value == null ? null : value.toJson()); return this; }
}
