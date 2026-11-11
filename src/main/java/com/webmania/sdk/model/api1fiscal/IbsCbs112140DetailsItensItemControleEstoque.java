package com.webmania.sdk.model.api1fiscal;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api1/fiscal.openapi.json; see contract-provenance.json. */
public final class IbsCbs112140DetailsItensItemControleEstoque extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("quantidade_nao_fornecida", "unidade_nao_fornecida");
 public IbsCbs112140DetailsItensItemControleEstoque() { super(FIELDS); }
 public IbsCbs112140DetailsItensItemControleEstoque(JsonNode node) { super(node, FIELDS); }
 public IbsCbs112140DetailsItensItemControleEstoqueQuantidadeNaoFornecida getQuantidadeNaoFornecida() { return (field("quantidade_nao_fornecida")).isNull() || (field("quantidade_nao_fornecida")).isMissingNode() ? null : new IbsCbs112140DetailsItensItemControleEstoqueQuantidadeNaoFornecida(field("quantidade_nao_fornecida")); }
 public IbsCbs112140DetailsItensItemControleEstoque setQuantidadeNaoFornecida(IbsCbs112140DetailsItensItemControleEstoqueQuantidadeNaoFornecida value) { put("quantidade_nao_fornecida", value == null ? null : value.toJson()); return this; }
 public String getUnidadeNaoFornecida() { return stringValue(field("unidade_nao_fornecida")); }
 public IbsCbs112140DetailsItensItemControleEstoque setUnidadeNaoFornecida(String value) { put("unidade_nao_fornecida", Json.scalar(value)); return this; }
}
