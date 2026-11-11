package com.webmania.sdk.model.api1fiscal;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api1/fiscal.openapi.json; see contract-provenance.json. */
public final class G127ControleEstoque extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("quantidade", "unidade");
 public G127ControleEstoque() { super(FIELDS); }
 public G127ControleEstoque(JsonNode node) { super(node, FIELDS); }
 public G127ControleEstoqueQuantidade getQuantidade() { return (field("quantidade")).isNull() || (field("quantidade")).isMissingNode() ? null : new G127ControleEstoqueQuantidade(field("quantidade")); }
 public G127ControleEstoque setQuantidade(G127ControleEstoqueQuantidade value) { put("quantidade", value == null ? null : value.toJson()); return this; }
 public String getUnidade() { return stringValue(field("unidade")); }
 public G127ControleEstoque setUnidade(String value) { put("unidade", Json.scalar(value)); return this; }
}
