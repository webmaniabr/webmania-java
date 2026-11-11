package com.webmania.sdk.model.api2mdfeissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/mdfe-issuance.openapi.json; see contract-provenance.json. */
public final class MdfeFreightPaymentGroup extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("cpf", "nome", "cnpj", "razao_social", "id_estrangeiro", "valor_contrato", "forma_pagamento", "operacao_alto_desempenho", "valor_adiantamento", "antecipar_adiantamento", "permissao_antecipacao_parcela", "componentes_pagamento_frete", "informacoes_bancarias", "informacoes_pagamento_prazo");
 public MdfeFreightPaymentGroup() { super(FIELDS); }
 public MdfeFreightPaymentGroup(JsonNode node) { super(node, FIELDS); }
 public String getCpf() { return stringValue(field("cpf")); }
 public MdfeFreightPaymentGroup setCpf(String value) { put("cpf", Json.scalar(value)); return this; }
 public String getNome() { return stringValue(field("nome")); }
 public MdfeFreightPaymentGroup setNome(String value) { put("nome", Json.scalar(value)); return this; }
 public String getCnpj() { return stringValue(field("cnpj")); }
 public MdfeFreightPaymentGroup setCnpj(String value) { put("cnpj", Json.scalar(value)); return this; }
 public String getRazaoSocial() { return stringValue(field("razao_social")); }
 public MdfeFreightPaymentGroup setRazaoSocial(String value) { put("razao_social", Json.scalar(value)); return this; }
 public String getIdEstrangeiro() { return stringValue(field("id_estrangeiro")); }
 public MdfeFreightPaymentGroup setIdEstrangeiro(String value) { put("id_estrangeiro", Json.scalar(value)); return this; }
 public String getValorContrato() { return stringValue(field("valor_contrato")); }
 public MdfeFreightPaymentGroup setValorContrato(String value) { put("valor_contrato", Json.scalar(value)); return this; }
 public MdfeFreightPaymentGroupFormaPagamento getFormaPagamento() { return (field("forma_pagamento")).isNull() || (field("forma_pagamento")).isMissingNode() ? null : new MdfeFreightPaymentGroupFormaPagamento(field("forma_pagamento")); }
 public MdfeFreightPaymentGroup setFormaPagamento(MdfeFreightPaymentGroupFormaPagamento value) { put("forma_pagamento", value == null ? null : value.toJson()); return this; }
 public Boolean getOperacaoAltoDesempenho() { return booleanValue(field("operacao_alto_desempenho")); }
 public MdfeFreightPaymentGroup setOperacaoAltoDesempenho(Boolean value) { put("operacao_alto_desempenho", Json.scalar(value)); return this; }
 public String getValorAdiantamento() { return stringValue(field("valor_adiantamento")); }
 public MdfeFreightPaymentGroup setValorAdiantamento(String value) { put("valor_adiantamento", Json.scalar(value)); return this; }
 public Boolean getAnteciparAdiantamento() { return booleanValue(field("antecipar_adiantamento")); }
 public MdfeFreightPaymentGroup setAnteciparAdiantamento(Boolean value) { put("antecipar_adiantamento", Json.scalar(value)); return this; }
 public MdfeFreightPaymentGroupPermissaoAntecipacaoParcela getPermissaoAntecipacaoParcela() { return (field("permissao_antecipacao_parcela")).isNull() || (field("permissao_antecipacao_parcela")).isMissingNode() ? null : new MdfeFreightPaymentGroupPermissaoAntecipacaoParcela(field("permissao_antecipacao_parcela")); }
 public MdfeFreightPaymentGroup setPermissaoAntecipacaoParcela(MdfeFreightPaymentGroupPermissaoAntecipacaoParcela value) { put("permissao_antecipacao_parcela", value == null ? null : value.toJson()); return this; }
 public java.util.List<MdfeFreightPaymentGroupComponentesPagamentoFreteItem> getComponentesPagamentoFrete() { return list(field("componentes_pagamento_frete"), v -> (v).isNull() || (v).isMissingNode() ? null : new MdfeFreightPaymentGroupComponentesPagamentoFreteItem(v)); }
 public MdfeFreightPaymentGroup setComponentesPagamentoFrete(java.util.List<MdfeFreightPaymentGroupComponentesPagamentoFreteItem> value) { put("componentes_pagamento_frete", array(value, v -> v == null ? null : v.toJson())); return this; }
 public MdfeFreightPaymentGroupInformacoesBancarias getInformacoesBancarias() { return (field("informacoes_bancarias")).isNull() || (field("informacoes_bancarias")).isMissingNode() ? null : new MdfeFreightPaymentGroupInformacoesBancarias(field("informacoes_bancarias")); }
 public MdfeFreightPaymentGroup setInformacoesBancarias(MdfeFreightPaymentGroupInformacoesBancarias value) { put("informacoes_bancarias", value == null ? null : value.toJson()); return this; }
 public java.util.List<MdfeFreightPaymentGroupInformacoesPagamentoPrazoItem> getInformacoesPagamentoPrazo() { return list(field("informacoes_pagamento_prazo"), v -> (v).isNull() || (v).isMissingNode() ? null : new MdfeFreightPaymentGroupInformacoesPagamentoPrazoItem(v)); }
 public MdfeFreightPaymentGroup setInformacoesPagamentoPrazo(java.util.List<MdfeFreightPaymentGroupInformacoesPagamentoPrazoItem> value) { put("informacoes_pagamento_prazo", array(value, v -> v == null ? null : v.toJson())); return this; }
}
