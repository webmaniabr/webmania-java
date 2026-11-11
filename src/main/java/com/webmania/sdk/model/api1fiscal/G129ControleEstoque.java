package com.webmania.sdk.model.api1fiscal;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api1/fiscal.openapi.json; see contract-provenance.json. */
public final class G129ControleEstoque extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("quantidade_nao_fornecida", "unidade_nao_fornecida");
 public G129ControleEstoque() { super(FIELDS); }
 public G129ControleEstoque(JsonNode node) { super(node, FIELDS); }
 public G129ControleEstoqueQuantidadeNaoFornecida getQuantidadeNaoFornecida() { return (field("quantidade_nao_fornecida")).isNull() || (field("quantidade_nao_fornecida")).isMissingNode() ? null : new G129ControleEstoqueQuantidadeNaoFornecida(field("quantidade_nao_fornecida")); }
 public G129ControleEstoque setQuantidadeNaoFornecida(G129ControleEstoqueQuantidadeNaoFornecida value) { put("quantidade_nao_fornecida", value == null ? null : value.toJson()); return this; }
 public String getUnidadeNaoFornecida() { return stringValue(field("unidade_nao_fornecida")); }
 public G129ControleEstoque setUnidadeNaoFornecida(String value) { put("unidade_nao_fornecida", Json.scalar(value)); return this; }
}
