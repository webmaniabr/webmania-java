package com.webmania.sdk.model.api1fiscal;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api1/fiscal.openapi.json; see contract-provenance.json. */
public final class NfeOrder extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("presenca", "intermediador", "cnpj_intermediador", "id_intermediador", "modalidade_frete", "frete", "desconto", "total", "despesas_acessorias", "despesas_aduaneiras", "informacoes_fisco", "informacoes_complementares", "observacoes_contribuinte", "pedido_compra", "contrato", "nota_empenho", "pagamento", "forma_pagamento", "desc_pagamento", "data_pagamento", "cnpj_transacional_pag", "uf_estabelecimento_pag", "tipo_integracao", "valor_pagamento", "cnpj_credenciadora", "bandeira", "autorizacao", "cnpj_beneficiario", "id_terminal_pag");
 public NfeOrder() { super(FIELDS); }
 public NfeOrder(JsonNode node) { super(node, FIELDS); }
 public java.math.BigInteger getPresenca() { return integerValue(field("presenca")); }
 public NfeOrder setPresenca(java.math.BigInteger value) { put("presenca", Json.scalar(value)); return this; }
 public java.math.BigInteger getIntermediador() { return integerValue(field("intermediador")); }
 public NfeOrder setIntermediador(java.math.BigInteger value) { put("intermediador", Json.scalar(value)); return this; }
 public String getCnpjIntermediador() { return stringValue(field("cnpj_intermediador")); }
 public NfeOrder setCnpjIntermediador(String value) { put("cnpj_intermediador", Json.scalar(value)); return this; }
 public String getIdIntermediador() { return stringValue(field("id_intermediador")); }
 public NfeOrder setIdIntermediador(String value) { put("id_intermediador", Json.scalar(value)); return this; }
 public java.math.BigInteger getModalidadeFrete() { return integerValue(field("modalidade_frete")); }
 public NfeOrder setModalidadeFrete(java.math.BigInteger value) { put("modalidade_frete", Json.scalar(value)); return this; }
 public NfeOrderFrete getFrete() { return (field("frete")).isNull() || (field("frete")).isMissingNode() ? null : new NfeOrderFrete(field("frete")); }
 public NfeOrder setFrete(NfeOrderFrete value) { put("frete", value == null ? null : value.toJson()); return this; }
 public NfeOrderDesconto getDesconto() { return (field("desconto")).isNull() || (field("desconto")).isMissingNode() ? null : new NfeOrderDesconto(field("desconto")); }
 public NfeOrder setDesconto(NfeOrderDesconto value) { put("desconto", value == null ? null : value.toJson()); return this; }
 public NfeOrderTotal getTotal() { return (field("total")).isNull() || (field("total")).isMissingNode() ? null : new NfeOrderTotal(field("total")); }
 public NfeOrder setTotal(NfeOrderTotal value) { put("total", value == null ? null : value.toJson()); return this; }
 public NfeOrderDespesasAcessorias getDespesasAcessorias() { return (field("despesas_acessorias")).isNull() || (field("despesas_acessorias")).isMissingNode() ? null : new NfeOrderDespesasAcessorias(field("despesas_acessorias")); }
 public NfeOrder setDespesasAcessorias(NfeOrderDespesasAcessorias value) { put("despesas_acessorias", value == null ? null : value.toJson()); return this; }
 public NfeOrderDespesasAduaneiras getDespesasAduaneiras() { return (field("despesas_aduaneiras")).isNull() || (field("despesas_aduaneiras")).isMissingNode() ? null : new NfeOrderDespesasAduaneiras(field("despesas_aduaneiras")); }
 public NfeOrder setDespesasAduaneiras(NfeOrderDespesasAduaneiras value) { put("despesas_aduaneiras", value == null ? null : value.toJson()); return this; }
 public String getInformacoesFisco() { return stringValue(field("informacoes_fisco")); }
 public NfeOrder setInformacoesFisco(String value) { put("informacoes_fisco", Json.scalar(value)); return this; }
 public String getInformacoesComplementares() { return stringValue(field("informacoes_complementares")); }
 public NfeOrder setInformacoesComplementares(String value) { put("informacoes_complementares", Json.scalar(value)); return this; }
 public java.util.List<NfeContributorObservation> getObservacoesContribuinte() { return list(field("observacoes_contribuinte"), v -> (v).isNull() || (v).isMissingNode() ? null : new NfeContributorObservation(v)); }
 public NfeOrder setObservacoesContribuinte(java.util.List<NfeContributorObservation> value) { put("observacoes_contribuinte", array(value, v -> v == null ? null : v.toJson())); return this; }
 public String getPedidoCompra() { return stringValue(field("pedido_compra")); }
 public NfeOrder setPedidoCompra(String value) { put("pedido_compra", Json.scalar(value)); return this; }
 public String getContrato() { return stringValue(field("contrato")); }
 public NfeOrder setContrato(String value) { put("contrato", Json.scalar(value)); return this; }
 public String getNotaEmpenho() { return stringValue(field("nota_empenho")); }
 public NfeOrder setNotaEmpenho(String value) { put("nota_empenho", Json.scalar(value)); return this; }
 public NfeOrderPagamento getPagamento() { return (field("pagamento")).isNull() || (field("pagamento")).isMissingNode() ? null : new NfeOrderPagamento(field("pagamento")); }
 public NfeOrder setPagamento(NfeOrderPagamento value) { put("pagamento", value == null ? null : value.toJson()); return this; }
 public NfeOrderFormaPagamento getFormaPagamento() { return (field("forma_pagamento")).isNull() || (field("forma_pagamento")).isMissingNode() ? null : new NfeOrderFormaPagamento(field("forma_pagamento")); }
 public NfeOrder setFormaPagamento(NfeOrderFormaPagamento value) { put("forma_pagamento", value == null ? null : value.toJson()); return this; }
 public NfeOrderDescPagamento getDescPagamento() { return (field("desc_pagamento")).isNull() || (field("desc_pagamento")).isMissingNode() ? null : new NfeOrderDescPagamento(field("desc_pagamento")); }
 public NfeOrder setDescPagamento(NfeOrderDescPagamento value) { put("desc_pagamento", value == null ? null : value.toJson()); return this; }
 public NfeOrderDataPagamento getDataPagamento() { return (field("data_pagamento")).isNull() || (field("data_pagamento")).isMissingNode() ? null : new NfeOrderDataPagamento(field("data_pagamento")); }
 public NfeOrder setDataPagamento(NfeOrderDataPagamento value) { put("data_pagamento", value == null ? null : value.toJson()); return this; }
 public NfeOrderCnpjTransacionalPag getCnpjTransacionalPag() { return (field("cnpj_transacional_pag")).isNull() || (field("cnpj_transacional_pag")).isMissingNode() ? null : new NfeOrderCnpjTransacionalPag(field("cnpj_transacional_pag")); }
 public NfeOrder setCnpjTransacionalPag(NfeOrderCnpjTransacionalPag value) { put("cnpj_transacional_pag", value == null ? null : value.toJson()); return this; }
 public NfeOrderUfEstabelecimentoPag getUfEstabelecimentoPag() { return (field("uf_estabelecimento_pag")).isNull() || (field("uf_estabelecimento_pag")).isMissingNode() ? null : new NfeOrderUfEstabelecimentoPag(field("uf_estabelecimento_pag")); }
 public NfeOrder setUfEstabelecimentoPag(NfeOrderUfEstabelecimentoPag value) { put("uf_estabelecimento_pag", value == null ? null : value.toJson()); return this; }
 public NfeOrderTipoIntegracao getTipoIntegracao() { return (field("tipo_integracao")).isNull() || (field("tipo_integracao")).isMissingNode() ? null : new NfeOrderTipoIntegracao(field("tipo_integracao")); }
 public NfeOrder setTipoIntegracao(NfeOrderTipoIntegracao value) { put("tipo_integracao", value == null ? null : value.toJson()); return this; }
 public NfeOrderValorPagamento getValorPagamento() { return (field("valor_pagamento")).isNull() || (field("valor_pagamento")).isMissingNode() ? null : new NfeOrderValorPagamento(field("valor_pagamento")); }
 public NfeOrder setValorPagamento(NfeOrderValorPagamento value) { put("valor_pagamento", value == null ? null : value.toJson()); return this; }
 public NfeOrderCnpjCredenciadora getCnpjCredenciadora() { return (field("cnpj_credenciadora")).isNull() || (field("cnpj_credenciadora")).isMissingNode() ? null : new NfeOrderCnpjCredenciadora(field("cnpj_credenciadora")); }
 public NfeOrder setCnpjCredenciadora(NfeOrderCnpjCredenciadora value) { put("cnpj_credenciadora", value == null ? null : value.toJson()); return this; }
 public NfeOrderBandeira getBandeira() { return (field("bandeira")).isNull() || (field("bandeira")).isMissingNode() ? null : new NfeOrderBandeira(field("bandeira")); }
 public NfeOrder setBandeira(NfeOrderBandeira value) { put("bandeira", value == null ? null : value.toJson()); return this; }
 public NfeOrderAutorizacao getAutorizacao() { return (field("autorizacao")).isNull() || (field("autorizacao")).isMissingNode() ? null : new NfeOrderAutorizacao(field("autorizacao")); }
 public NfeOrder setAutorizacao(NfeOrderAutorizacao value) { put("autorizacao", value == null ? null : value.toJson()); return this; }
 public NfeOrderCnpjBeneficiario getCnpjBeneficiario() { return (field("cnpj_beneficiario")).isNull() || (field("cnpj_beneficiario")).isMissingNode() ? null : new NfeOrderCnpjBeneficiario(field("cnpj_beneficiario")); }
 public NfeOrder setCnpjBeneficiario(NfeOrderCnpjBeneficiario value) { put("cnpj_beneficiario", value == null ? null : value.toJson()); return this; }
 public NfeOrderIdTerminalPag getIdTerminalPag() { return (field("id_terminal_pag")).isNull() || (field("id_terminal_pag")).isMissingNode() ? null : new NfeOrderIdTerminalPag(field("id_terminal_pag")); }
 public NfeOrder setIdTerminalPag(NfeOrderIdTerminalPag value) { put("id_terminal_pag", value == null ? null : value.toJson()); return this; }
}
