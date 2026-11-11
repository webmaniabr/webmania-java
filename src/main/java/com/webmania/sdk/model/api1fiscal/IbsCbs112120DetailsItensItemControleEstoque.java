package com.webmania.sdk.model.api1fiscal;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api1/fiscal.openapi.json; see contract-provenance.json. */
public final class IbsCbs112120DetailsItensItemControleEstoque extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("quantidade", "unidade");
 public IbsCbs112120DetailsItensItemControleEstoque() { super(FIELDS); }
 public IbsCbs112120DetailsItensItemControleEstoque(JsonNode node) { super(node, FIELDS); }
 public IbsCbs112120DetailsItensItemControleEstoqueQuantidade getQuantidade() { return (field("quantidade")).isNull() || (field("quantidade")).isMissingNode() ? null : new IbsCbs112120DetailsItensItemControleEstoqueQuantidade(field("quantidade")); }
 public IbsCbs112120DetailsItensItemControleEstoque setQuantidade(IbsCbs112120DetailsItensItemControleEstoqueQuantidade value) { put("quantidade", value == null ? null : value.toJson()); return this; }
 public String getUnidade() { return stringValue(field("unidade")); }
 public IbsCbs112120DetailsItensItemControleEstoque setUnidade(String value) { put("unidade", Json.scalar(value)); return this; }
}
