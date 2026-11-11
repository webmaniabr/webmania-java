package com.webmania.sdk.model.api1fiscal;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api1/fiscal.openapi.json; see contract-provenance.json. */
public final class G021 extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("presenca", "intermediador", "cnpj_intermediador", "id_intermediador", "modalidade_frete", "frete", "desconto", "total", "despesas_acessorias", "despesas_aduaneiras", "informacoes_fisco", "informacoes_complementares", "observacoes_contribuinte", "pedido_compra", "contrato", "nota_empenho");
 public G021() { super(FIELDS); }
 public G021(JsonNode node) { super(node, FIELDS); }
 public java.math.BigInteger getPresenca() { return integerValue(field("presenca")); }
 public G021 setPresenca(java.math.BigInteger value) { put("presenca", Json.scalar(value)); return this; }
 public java.math.BigInteger getIntermediador() { return integerValue(field("intermediador")); }
 public G021 setIntermediador(java.math.BigInteger value) { put("intermediador", Json.scalar(value)); return this; }
 public String getCnpjIntermediador() { return stringValue(field("cnpj_intermediador")); }
 public G021 setCnpjIntermediador(String value) { put("cnpj_intermediador", Json.scalar(value)); return this; }
 public String getIdIntermediador() { return stringValue(field("id_intermediador")); }
 public G021 setIdIntermediador(String value) { put("id_intermediador", Json.scalar(value)); return this; }
 public java.math.BigInteger getModalidadeFrete() { return integerValue(field("modalidade_frete")); }
 public G021 setModalidadeFrete(java.math.BigInteger value) { put("modalidade_frete", Json.scalar(value)); return this; }
 public G021Frete getFrete() { return (field("frete")).isNull() || (field("frete")).isMissingNode() ? null : new G021Frete(field("frete")); }
 public G021 setFrete(G021Frete value) { put("frete", value == null ? null : value.toJson()); return this; }
 public G021Desconto getDesconto() { return (field("desconto")).isNull() || (field("desconto")).isMissingNode() ? null : new G021Desconto(field("desconto")); }
 public G021 setDesconto(G021Desconto value) { put("desconto", value == null ? null : value.toJson()); return this; }
 public G021Total getTotal() { return (field("total")).isNull() || (field("total")).isMissingNode() ? null : new G021Total(field("total")); }
 public G021 setTotal(G021Total value) { put("total", value == null ? null : value.toJson()); return this; }
 public G021DespesasAcessorias getDespesasAcessorias() { return (field("despesas_acessorias")).isNull() || (field("despesas_acessorias")).isMissingNode() ? null : new G021DespesasAcessorias(field("despesas_acessorias")); }
 public G021 setDespesasAcessorias(G021DespesasAcessorias value) { put("despesas_acessorias", value == null ? null : value.toJson()); return this; }
 public G021DespesasAduaneiras getDespesasAduaneiras() { return (field("despesas_aduaneiras")).isNull() || (field("despesas_aduaneiras")).isMissingNode() ? null : new G021DespesasAduaneiras(field("despesas_aduaneiras")); }
 public G021 setDespesasAduaneiras(G021DespesasAduaneiras value) { put("despesas_aduaneiras", value == null ? null : value.toJson()); return this; }
 public String getInformacoesFisco() { return stringValue(field("informacoes_fisco")); }
 public G021 setInformacoesFisco(String value) { put("informacoes_fisco", Json.scalar(value)); return this; }
 public String getInformacoesComplementares() { return stringValue(field("informacoes_complementares")); }
 public G021 setInformacoesComplementares(String value) { put("informacoes_complementares", Json.scalar(value)); return this; }
 public java.util.List<NfeContributorObservation> getObservacoesContribuinte() { return list(field("observacoes_contribuinte"), v -> (v).isNull() || (v).isMissingNode() ? null : new NfeContributorObservation(v)); }
 public G021 setObservacoesContribuinte(java.util.List<NfeContributorObservation> value) { put("observacoes_contribuinte", array(value, v -> v == null ? null : v.toJson())); return this; }
 public String getPedidoCompra() { return stringValue(field("pedido_compra")); }
 public G021 setPedidoCompra(String value) { put("pedido_compra", Json.scalar(value)); return this; }
 public String getContrato() { return stringValue(field("contrato")); }
 public G021 setContrato(String value) { put("contrato", Json.scalar(value)); return this; }
 public String getNotaEmpenho() { return stringValue(field("nota_empenho")); }
 public G021 setNotaEmpenho(String value) { put("nota_empenho", Json.scalar(value)); return this; }
}
