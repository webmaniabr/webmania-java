package com.webmania.sdk.model.api2nfseissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/nfse-issuance.openapi.json; see contract-provenance.json. */
public final class EmitterIssueNfsePayloadRpsItemCondicaoPagamentoParcelasItem extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("data_vencimento", "parcela", "valor");
 public EmitterIssueNfsePayloadRpsItemCondicaoPagamentoParcelasItem() { super(FIELDS); }
 public EmitterIssueNfsePayloadRpsItemCondicaoPagamentoParcelasItem(JsonNode node) { super(node, FIELDS); }
 public String getDataVencimento() { return stringValue(field("data_vencimento")); }
 public EmitterIssueNfsePayloadRpsItemCondicaoPagamentoParcelasItem setDataVencimento(String value) { put("data_vencimento", Json.scalar(value)); return this; }
 public EmitterIssueNfsePayloadRpsItemCondicaoPagamentoParcelasItemParcela getParcela() { return (field("parcela")).isNull() || (field("parcela")).isMissingNode() ? null : new EmitterIssueNfsePayloadRpsItemCondicaoPagamentoParcelasItemParcela(field("parcela")); }
 public EmitterIssueNfsePayloadRpsItemCondicaoPagamentoParcelasItem setParcela(EmitterIssueNfsePayloadRpsItemCondicaoPagamentoParcelasItemParcela value) { put("parcela", value == null ? null : value.toJson()); return this; }
 public EmitterIssueNfsePayloadRpsItemCondicaoPagamentoParcelasItemValor getValor() { return (field("valor")).isNull() || (field("valor")).isMissingNode() ? null : new EmitterIssueNfsePayloadRpsItemCondicaoPagamentoParcelasItemValor(field("valor")); }
 public EmitterIssueNfsePayloadRpsItemCondicaoPagamentoParcelasItem setValor(EmitterIssueNfsePayloadRpsItemCondicaoPagamentoParcelasItemValor value) { put("valor", value == null ? null : value.toJson()); return this; }
}
