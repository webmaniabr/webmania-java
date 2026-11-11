package com.webmania.sdk.model.api2nfseissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/nfse-issuance.openapi.json; see contract-provenance.json. */
public final class EmitterIssueNfsePayloadRpsItemServicoItensItem extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("descricao", "quantidade", "valor_unitario", "item_tributavel");
 public EmitterIssueNfsePayloadRpsItemServicoItensItem() { super(FIELDS); }
 public EmitterIssueNfsePayloadRpsItemServicoItensItem(JsonNode node) { super(node, FIELDS); }
 public String getDescricao() { return stringValue(field("descricao")); }
 public EmitterIssueNfsePayloadRpsItemServicoItensItem setDescricao(String value) { put("descricao", Json.scalar(value)); return this; }
 public String getQuantidade() { return stringValue(field("quantidade")); }
 public EmitterIssueNfsePayloadRpsItemServicoItensItem setQuantidade(String value) { put("quantidade", Json.scalar(value)); return this; }
 public String getValorUnitario() { return stringValue(field("valor_unitario")); }
 public EmitterIssueNfsePayloadRpsItemServicoItensItem setValorUnitario(String value) { put("valor_unitario", Json.scalar(value)); return this; }
 public String getItemTributavel() { return stringValue(field("item_tributavel")); }
 public EmitterIssueNfsePayloadRpsItemServicoItensItem setItemTributavel(String value) { put("item_tributavel", Json.scalar(value)); return this; }
}
