package com.webmania.sdk.model.api1fiscal;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api1/fiscal.openapi.json; see contract-provenance.json. */
public final class IbsCbs112120RequestItensItemControleEstoque extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("quantidade", "unidade");
 public IbsCbs112120RequestItensItemControleEstoque() { super(FIELDS); }
 public IbsCbs112120RequestItensItemControleEstoque(JsonNode node) { super(node, FIELDS); }
 public IbsCbs112120RequestItensItemControleEstoqueQuantidade getQuantidade() { return (field("quantidade")).isNull() || (field("quantidade")).isMissingNode() ? null : new IbsCbs112120RequestItensItemControleEstoqueQuantidade(field("quantidade")); }
 public IbsCbs112120RequestItensItemControleEstoque setQuantidade(IbsCbs112120RequestItensItemControleEstoqueQuantidade value) { put("quantidade", value == null ? null : value.toJson()); return this; }
 public String getUnidade() { return stringValue(field("unidade")); }
 public IbsCbs112120RequestItensItemControleEstoque setUnidade(String value) { put("unidade", Json.scalar(value)); return this; }
}
