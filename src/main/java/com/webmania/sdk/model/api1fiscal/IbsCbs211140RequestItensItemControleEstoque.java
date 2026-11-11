package com.webmania.sdk.model.api1fiscal;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api1/fiscal.openapi.json; see contract-provenance.json. */
public final class IbsCbs211140RequestItensItemControleEstoque extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("quantidade_combustivel", "unidade_combustivel");
 public IbsCbs211140RequestItensItemControleEstoque() { super(FIELDS); }
 public IbsCbs211140RequestItensItemControleEstoque(JsonNode node) { super(node, FIELDS); }
 public IbsCbs211140RequestItensItemControleEstoqueQuantidadeCombustivel getQuantidadeCombustivel() { return (field("quantidade_combustivel")).isNull() || (field("quantidade_combustivel")).isMissingNode() ? null : new IbsCbs211140RequestItensItemControleEstoqueQuantidadeCombustivel(field("quantidade_combustivel")); }
 public IbsCbs211140RequestItensItemControleEstoque setQuantidadeCombustivel(IbsCbs211140RequestItensItemControleEstoqueQuantidadeCombustivel value) { put("quantidade_combustivel", value == null ? null : value.toJson()); return this; }
 public String getUnidadeCombustivel() { return stringValue(field("unidade_combustivel")); }
 public IbsCbs211140RequestItensItemControleEstoque setUnidadeCombustivel(String value) { put("unidade_combustivel", Json.scalar(value)); return this; }
}
