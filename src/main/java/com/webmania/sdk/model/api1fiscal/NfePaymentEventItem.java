package com.webmania.sdk.model.api1fiscal;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api1/fiscal.openapi.json; see contract-provenance.json. */
public final class NfePaymentEventItem extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("indicador_pagamento", "forma_pagamento", "desc_pagamento", "valor_pagamento", "data_pagamento", "cnpj_transacional_pag", "uf_pagamento", "cnpj_instituicao_financeira", "bandeira", "autorizacao", "cnpj_beneficiario", "uf_beneficiario");
 public NfePaymentEventItem() { super(FIELDS); }
 public NfePaymentEventItem(JsonNode node) { super(node, FIELDS); }
 public java.math.BigInteger getIndicadorPagamento() { return integerValue(field("indicador_pagamento")); }
 public NfePaymentEventItem setIndicadorPagamento(java.math.BigInteger value) { put("indicador_pagamento", Json.scalar(value)); return this; }
 public String getFormaPagamento() { return stringValue(field("forma_pagamento")); }
 public NfePaymentEventItem setFormaPagamento(String value) { put("forma_pagamento", Json.scalar(value)); return this; }
 public String getDescPagamento() { return stringValue(field("desc_pagamento")); }
 public NfePaymentEventItem setDescPagamento(String value) { put("desc_pagamento", Json.scalar(value)); return this; }
 public NfePaymentEventItemValorPagamento getValorPagamento() { return (field("valor_pagamento")).isNull() || (field("valor_pagamento")).isMissingNode() ? null : new NfePaymentEventItemValorPagamento(field("valor_pagamento")); }
 public NfePaymentEventItem setValorPagamento(NfePaymentEventItemValorPagamento value) { put("valor_pagamento", value == null ? null : value.toJson()); return this; }
 public String getDataPagamento() { return stringValue(field("data_pagamento")); }
 public NfePaymentEventItem setDataPagamento(String value) { put("data_pagamento", Json.scalar(value)); return this; }
 public String getCnpjTransacionalPag() { return stringValue(field("cnpj_transacional_pag")); }
 public NfePaymentEventItem setCnpjTransacionalPag(String value) { put("cnpj_transacional_pag", Json.scalar(value)); return this; }
 public String getUfPagamento() { return stringValue(field("uf_pagamento")); }
 public NfePaymentEventItem setUfPagamento(String value) { put("uf_pagamento", Json.scalar(value)); return this; }
 public String getCnpjInstituicaoFinanceira() { return stringValue(field("cnpj_instituicao_financeira")); }
 public NfePaymentEventItem setCnpjInstituicaoFinanceira(String value) { put("cnpj_instituicao_financeira", Json.scalar(value)); return this; }
 public String getBandeira() { return stringValue(field("bandeira")); }
 public NfePaymentEventItem setBandeira(String value) { put("bandeira", Json.scalar(value)); return this; }
 public String getAutorizacao() { return stringValue(field("autorizacao")); }
 public NfePaymentEventItem setAutorizacao(String value) { put("autorizacao", Json.scalar(value)); return this; }
 public String getCnpjBeneficiario() { return stringValue(field("cnpj_beneficiario")); }
 public NfePaymentEventItem setCnpjBeneficiario(String value) { put("cnpj_beneficiario", Json.scalar(value)); return this; }
 public String getUfBeneficiario() { return stringValue(field("uf_beneficiario")); }
 public NfePaymentEventItem setUfBeneficiario(String value) { put("uf_beneficiario", Json.scalar(value)); return this; }
}
