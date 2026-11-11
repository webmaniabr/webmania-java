package com.webmania.sdk.model.api1fiscal;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api1/fiscal.openapi.json; see contract-provenance.json. */
public final class G135ControleEstoque extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("quantidade_combustivel", "unidade_combustivel");
 public G135ControleEstoque() { super(FIELDS); }
 public G135ControleEstoque(JsonNode node) { super(node, FIELDS); }
 public G135ControleEstoqueQuantidadeCombustivel getQuantidadeCombustivel() { return (field("quantidade_combustivel")).isNull() || (field("quantidade_combustivel")).isMissingNode() ? null : new G135ControleEstoqueQuantidadeCombustivel(field("quantidade_combustivel")); }
 public G135ControleEstoque setQuantidadeCombustivel(G135ControleEstoqueQuantidadeCombustivel value) { put("quantidade_combustivel", value == null ? null : value.toJson()); return this; }
 public String getUnidadeCombustivel() { return stringValue(field("unidade_combustivel")); }
 public G135ControleEstoque setUnidadeCombustivel(String value) { put("unidade_combustivel", Json.scalar(value)); return this; }
}
