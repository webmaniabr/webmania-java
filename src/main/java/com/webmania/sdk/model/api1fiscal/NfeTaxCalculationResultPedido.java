package com.webmania.sdk.model.api1fiscal;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api1/fiscal.openapi.json; see contract-provenance.json. */
public final class NfeTaxCalculationResultPedido extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("produtos", "frete", "desconto", "despesas_acessorias", "seguro", "total");
 public NfeTaxCalculationResultPedido() { super(FIELDS); }
 public NfeTaxCalculationResultPedido(JsonNode node) { super(node, FIELDS); }
 public NfeTaxCalculationResultPedidoProdutos getProdutos() { return (field("produtos")).isNull() || (field("produtos")).isMissingNode() ? null : new NfeTaxCalculationResultPedidoProdutos(field("produtos")); }
 public NfeTaxCalculationResultPedido setProdutos(NfeTaxCalculationResultPedidoProdutos value) { put("produtos", value == null ? null : value.toJson()); return this; }
 public NfeTaxCalculationResultPedidoFrete getFrete() { return (field("frete")).isNull() || (field("frete")).isMissingNode() ? null : new NfeTaxCalculationResultPedidoFrete(field("frete")); }
 public NfeTaxCalculationResultPedido setFrete(NfeTaxCalculationResultPedidoFrete value) { put("frete", value == null ? null : value.toJson()); return this; }
 public NfeTaxCalculationResultPedidoDesconto getDesconto() { return (field("desconto")).isNull() || (field("desconto")).isMissingNode() ? null : new NfeTaxCalculationResultPedidoDesconto(field("desconto")); }
 public NfeTaxCalculationResultPedido setDesconto(NfeTaxCalculationResultPedidoDesconto value) { put("desconto", value == null ? null : value.toJson()); return this; }
 public NfeTaxCalculationResultPedidoDespesasAcessorias getDespesasAcessorias() { return (field("despesas_acessorias")).isNull() || (field("despesas_acessorias")).isMissingNode() ? null : new NfeTaxCalculationResultPedidoDespesasAcessorias(field("despesas_acessorias")); }
 public NfeTaxCalculationResultPedido setDespesasAcessorias(NfeTaxCalculationResultPedidoDespesasAcessorias value) { put("despesas_acessorias", value == null ? null : value.toJson()); return this; }
 public NfeTaxCalculationResultPedidoSeguro getSeguro() { return (field("seguro")).isNull() || (field("seguro")).isMissingNode() ? null : new NfeTaxCalculationResultPedidoSeguro(field("seguro")); }
 public NfeTaxCalculationResultPedido setSeguro(NfeTaxCalculationResultPedidoSeguro value) { put("seguro", value == null ? null : value.toJson()); return this; }
 public NfeTaxCalculationResultPedidoTotal getTotal() { return (field("total")).isNull() || (field("total")).isMissingNode() ? null : new NfeTaxCalculationResultPedidoTotal(field("total")); }
 public NfeTaxCalculationResultPedido setTotal(NfeTaxCalculationResultPedidoTotal value) { put("total", value == null ? null : value.toJson()); return this; }
}
