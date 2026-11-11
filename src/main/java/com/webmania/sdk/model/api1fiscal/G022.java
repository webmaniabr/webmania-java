package com.webmania.sdk.model.api1fiscal;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api1/fiscal.openapi.json; see contract-provenance.json. */
public final class G022 extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("pagamento", "forma_pagamento", "desc_pagamento", "data_pagamento", "cnpj_transacional_pag", "uf_estabelecimento_pag", "tipo_integracao", "valor_pagamento", "cnpj_credenciadora", "bandeira", "autorizacao", "cnpj_beneficiario", "id_terminal_pag");
 public G022() { super(FIELDS); }
 public G022(JsonNode node) { super(node, FIELDS); }
 public G022Pagamento getPagamento() { return (field("pagamento")).isNull() || (field("pagamento")).isMissingNode() ? null : new G022Pagamento(field("pagamento")); }
 public G022 setPagamento(G022Pagamento value) { put("pagamento", value == null ? null : value.toJson()); return this; }
 public G022FormaPagamento getFormaPagamento() { return (field("forma_pagamento")).isNull() || (field("forma_pagamento")).isMissingNode() ? null : new G022FormaPagamento(field("forma_pagamento")); }
 public G022 setFormaPagamento(G022FormaPagamento value) { put("forma_pagamento", value == null ? null : value.toJson()); return this; }
 public G022DescPagamento getDescPagamento() { return (field("desc_pagamento")).isNull() || (field("desc_pagamento")).isMissingNode() ? null : new G022DescPagamento(field("desc_pagamento")); }
 public G022 setDescPagamento(G022DescPagamento value) { put("desc_pagamento", value == null ? null : value.toJson()); return this; }
 public G022DataPagamento getDataPagamento() { return (field("data_pagamento")).isNull() || (field("data_pagamento")).isMissingNode() ? null : new G022DataPagamento(field("data_pagamento")); }
 public G022 setDataPagamento(G022DataPagamento value) { put("data_pagamento", value == null ? null : value.toJson()); return this; }
 public G022CnpjTransacionalPag getCnpjTransacionalPag() { return (field("cnpj_transacional_pag")).isNull() || (field("cnpj_transacional_pag")).isMissingNode() ? null : new G022CnpjTransacionalPag(field("cnpj_transacional_pag")); }
 public G022 setCnpjTransacionalPag(G022CnpjTransacionalPag value) { put("cnpj_transacional_pag", value == null ? null : value.toJson()); return this; }
 public G022UfEstabelecimentoPag getUfEstabelecimentoPag() { return (field("uf_estabelecimento_pag")).isNull() || (field("uf_estabelecimento_pag")).isMissingNode() ? null : new G022UfEstabelecimentoPag(field("uf_estabelecimento_pag")); }
 public G022 setUfEstabelecimentoPag(G022UfEstabelecimentoPag value) { put("uf_estabelecimento_pag", value == null ? null : value.toJson()); return this; }
 public G022TipoIntegracao getTipoIntegracao() { return (field("tipo_integracao")).isNull() || (field("tipo_integracao")).isMissingNode() ? null : new G022TipoIntegracao(field("tipo_integracao")); }
 public G022 setTipoIntegracao(G022TipoIntegracao value) { put("tipo_integracao", value == null ? null : value.toJson()); return this; }
 public G022ValorPagamento getValorPagamento() { return (field("valor_pagamento")).isNull() || (field("valor_pagamento")).isMissingNode() ? null : new G022ValorPagamento(field("valor_pagamento")); }
 public G022 setValorPagamento(G022ValorPagamento value) { put("valor_pagamento", value == null ? null : value.toJson()); return this; }
 public G022CnpjCredenciadora getCnpjCredenciadora() { return (field("cnpj_credenciadora")).isNull() || (field("cnpj_credenciadora")).isMissingNode() ? null : new G022CnpjCredenciadora(field("cnpj_credenciadora")); }
 public G022 setCnpjCredenciadora(G022CnpjCredenciadora value) { put("cnpj_credenciadora", value == null ? null : value.toJson()); return this; }
 public G022Bandeira getBandeira() { return (field("bandeira")).isNull() || (field("bandeira")).isMissingNode() ? null : new G022Bandeira(field("bandeira")); }
 public G022 setBandeira(G022Bandeira value) { put("bandeira", value == null ? null : value.toJson()); return this; }
 public G022Autorizacao getAutorizacao() { return (field("autorizacao")).isNull() || (field("autorizacao")).isMissingNode() ? null : new G022Autorizacao(field("autorizacao")); }
 public G022 setAutorizacao(G022Autorizacao value) { put("autorizacao", value == null ? null : value.toJson()); return this; }
 public G022CnpjBeneficiario getCnpjBeneficiario() { return (field("cnpj_beneficiario")).isNull() || (field("cnpj_beneficiario")).isMissingNode() ? null : new G022CnpjBeneficiario(field("cnpj_beneficiario")); }
 public G022 setCnpjBeneficiario(G022CnpjBeneficiario value) { put("cnpj_beneficiario", value == null ? null : value.toJson()); return this; }
 public G022IdTerminalPag getIdTerminalPag() { return (field("id_terminal_pag")).isNull() || (field("id_terminal_pag")).isMissingNode() ? null : new G022IdTerminalPag(field("id_terminal_pag")); }
 public G022 setIdTerminalPag(G022IdTerminalPag value) { put("id_terminal_pag", value == null ? null : value.toJson()); return this; }
}
