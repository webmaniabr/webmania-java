package com.webmania.sdk.model.api2dceissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/dce-issuance.openapi.json; see contract-provenance.json. */
public final class EmitterIssueDcePayloadItensItem extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("descricao", "informacoes_adicionais", "ncm", "quantidade", "valor_unitario");
 public EmitterIssueDcePayloadItensItem() { super(FIELDS); }
 public EmitterIssueDcePayloadItensItem(JsonNode node) { super(node, FIELDS); }
 public String getDescricao() { return stringValue(field("descricao")); }
 public EmitterIssueDcePayloadItensItem setDescricao(String value) { put("descricao", Json.scalar(value)); return this; }
 public EmitterIssueDcePayloadItensItemInformacoesAdicionais getInformacoesAdicionais() { return (field("informacoes_adicionais")).isNull() || (field("informacoes_adicionais")).isMissingNode() ? null : new EmitterIssueDcePayloadItensItemInformacoesAdicionais(field("informacoes_adicionais")); }
 public EmitterIssueDcePayloadItensItem setInformacoesAdicionais(EmitterIssueDcePayloadItensItemInformacoesAdicionais value) { put("informacoes_adicionais", value == null ? null : value.toJson()); return this; }
 public String getNcm() { return stringValue(field("ncm")); }
 public EmitterIssueDcePayloadItensItem setNcm(String value) { put("ncm", Json.scalar(value)); return this; }
 public EmitterIssueDcePayloadItensItemQuantidade getQuantidade() { return (field("quantidade")).isNull() || (field("quantidade")).isMissingNode() ? null : new EmitterIssueDcePayloadItensItemQuantidade(field("quantidade")); }
 public EmitterIssueDcePayloadItensItem setQuantidade(EmitterIssueDcePayloadItensItemQuantidade value) { put("quantidade", value == null ? null : value.toJson()); return this; }
 public EmitterIssueDcePayloadItensItemValorUnitario getValorUnitario() { return (field("valor_unitario")).isNull() || (field("valor_unitario")).isMissingNode() ? null : new EmitterIssueDcePayloadItensItemValorUnitario(field("valor_unitario")); }
 public EmitterIssueDcePayloadItensItem setValorUnitario(EmitterIssueDcePayloadItensItemValorUnitario value) { put("valor_unitario", value == null ? null : value.toJson()); return this; }
}
