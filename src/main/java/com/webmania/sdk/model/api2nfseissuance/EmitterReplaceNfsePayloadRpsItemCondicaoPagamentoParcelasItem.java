package com.webmania.sdk.model.api2nfseissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/nfse-issuance.openapi.json; see contract-provenance.json. */
public final class EmitterReplaceNfsePayloadRpsItemCondicaoPagamentoParcelasItem extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("data_vencimento", "parcela", "valor");
 public EmitterReplaceNfsePayloadRpsItemCondicaoPagamentoParcelasItem() { super(FIELDS); }
 public EmitterReplaceNfsePayloadRpsItemCondicaoPagamentoParcelasItem(JsonNode node) { super(node, FIELDS); }
 public String getDataVencimento() { return stringValue(field("data_vencimento")); }
 public EmitterReplaceNfsePayloadRpsItemCondicaoPagamentoParcelasItem setDataVencimento(String value) { put("data_vencimento", Json.scalar(value)); return this; }
 public EmitterReplaceNfsePayloadRpsItemCondicaoPagamentoParcelasItemParcela getParcela() { return (field("parcela")).isNull() || (field("parcela")).isMissingNode() ? null : new EmitterReplaceNfsePayloadRpsItemCondicaoPagamentoParcelasItemParcela(field("parcela")); }
 public EmitterReplaceNfsePayloadRpsItemCondicaoPagamentoParcelasItem setParcela(EmitterReplaceNfsePayloadRpsItemCondicaoPagamentoParcelasItemParcela value) { put("parcela", value == null ? null : value.toJson()); return this; }
 public EmitterReplaceNfsePayloadRpsItemCondicaoPagamentoParcelasItemValor getValor() { return (field("valor")).isNull() || (field("valor")).isMissingNode() ? null : new EmitterReplaceNfsePayloadRpsItemCondicaoPagamentoParcelasItemValor(field("valor")); }
 public EmitterReplaceNfsePayloadRpsItemCondicaoPagamentoParcelasItem setValor(EmitterReplaceNfsePayloadRpsItemCondicaoPagamentoParcelasItemValor value) { put("valor", value == null ? null : value.toJson()); return this; }
}
