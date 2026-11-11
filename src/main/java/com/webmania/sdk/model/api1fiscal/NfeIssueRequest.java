package com.webmania.sdk.model.api1fiscal;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api1/fiscal.openapi.json; see contract-provenance.json. */
public final class NfeIssueRequest extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("ID", "operacao", "natureza_operacao", "modelo", "finalidade", "ambiente", "tipo_credito", "tipo_debito", "url_notificacao", "cliente", "produtos", "pedido", "transporte", "fatura", "parcelas", "exportacao", "agropecuario", "compra_governamental", "inscricao_suframa", "codigo_indicador_operacao", "data_emissao", "data_entrada_saida", "data_previsao_entrega", "data_servico", "nfe_referenciada", "cte_referenciada", "ecf_referenciada", "nf_rural_referenciada", "calculo_impostos", "previa_danfe", "assincrono", "responsavel_tecnico", "duplicatas");
 public NfeIssueRequest() { super(FIELDS); }
 public NfeIssueRequest(JsonNode node) { super(node, FIELDS); }
 public String getID() { return stringValue(field("ID")); }
 public NfeIssueRequest setID(String value) { put("ID", Json.scalar(value)); return this; }
 public java.math.BigInteger getOperacao() { return integerValue(field("operacao")); }
 public NfeIssueRequest setOperacao(java.math.BigInteger value) { put("operacao", Json.scalar(value)); return this; }
 public String getNaturezaOperacao() { return stringValue(field("natureza_operacao")); }
 public NfeIssueRequest setNaturezaOperacao(String value) { put("natureza_operacao", Json.scalar(value)); return this; }
 public NfeIssueRequestModelo getModelo() { return (field("modelo")).isNull() || (field("modelo")).isMissingNode() ? null : new NfeIssueRequestModelo(field("modelo")); }
 public NfeIssueRequest setModelo(NfeIssueRequestModelo value) { put("modelo", value == null ? null : value.toJson()); return this; }
 public java.math.BigInteger getFinalidade() { return integerValue(field("finalidade")); }
 public NfeIssueRequest setFinalidade(java.math.BigInteger value) { put("finalidade", Json.scalar(value)); return this; }
 public Environment getAmbiente() { return (field("ambiente")).isNull() || (field("ambiente")).isMissingNode() ? null : new Environment(field("ambiente")); }
 public NfeIssueRequest setAmbiente(Environment value) { put("ambiente", value == null ? null : value.toJson()); return this; }
 public java.math.BigInteger getTipoCredito() { return integerValue(field("tipo_credito")); }
 public NfeIssueRequest setTipoCredito(java.math.BigInteger value) { put("tipo_credito", Json.scalar(value)); return this; }
 public java.math.BigInteger getTipoDebito() { return integerValue(field("tipo_debito")); }
 public NfeIssueRequest setTipoDebito(java.math.BigInteger value) { put("tipo_debito", Json.scalar(value)); return this; }
 public String getUrlNotificacao() { return stringValue(field("url_notificacao")); }
 public NfeIssueRequest setUrlNotificacao(String value) { put("url_notificacao", Json.scalar(value)); return this; }
 public NfeCustomer getCliente() { return (field("cliente")).isNull() || (field("cliente")).isMissingNode() ? null : new NfeCustomer(field("cliente")); }
 public NfeIssueRequest setCliente(NfeCustomer value) { put("cliente", value == null ? null : value.toJson()); return this; }
 public java.util.List<NfeProduct> getProdutos() { return list(field("produtos"), v -> (v).isNull() || (v).isMissingNode() ? null : new NfeProduct(v)); }
 public NfeIssueRequest setProdutos(java.util.List<NfeProduct> value) { put("produtos", array(value, v -> v == null ? null : v.toJson())); return this; }
 public NfeOrder getPedido() { return (field("pedido")).isNull() || (field("pedido")).isMissingNode() ? null : new NfeOrder(field("pedido")); }
 public NfeIssueRequest setPedido(NfeOrder value) { put("pedido", value == null ? null : value.toJson()); return this; }
 public NfeTransport getTransporte() { return (field("transporte")).isNull() || (field("transporte")).isMissingNode() ? null : new NfeTransport(field("transporte")); }
 public NfeIssueRequest setTransporte(NfeTransport value) { put("transporte", value == null ? null : value.toJson()); return this; }
 public G028 getFatura() { return (field("fatura")).isNull() || (field("fatura")).isMissingNode() ? null : new G028(field("fatura")); }
 public NfeIssueRequest setFatura(G028 value) { put("fatura", value == null ? null : value.toJson()); return this; }
 public java.util.List<G029> getParcelas() { return list(field("parcelas"), v -> (v).isNull() || (v).isMissingNode() ? null : new G029(v)); }
 public NfeIssueRequest setParcelas(java.util.List<G029> value) { put("parcelas", array(value, v -> v == null ? null : v.toJson())); return this; }
 public G030 getExportacao() { return (field("exportacao")).isNull() || (field("exportacao")).isMissingNode() ? null : new G030(field("exportacao")); }
 public NfeIssueRequest setExportacao(G030 value) { put("exportacao", value == null ? null : value.toJson()); return this; }
 public G031 getAgropecuario() { return (field("agropecuario")).isNull() || (field("agropecuario")).isMissingNode() ? null : new G031(field("agropecuario")); }
 public NfeIssueRequest setAgropecuario(G031 value) { put("agropecuario", value == null ? null : value.toJson()); return this; }
 public G034 getCompraGovernamental() { return (field("compra_governamental")).isNull() || (field("compra_governamental")).isMissingNode() ? null : new G034(field("compra_governamental")); }
 public NfeIssueRequest setCompraGovernamental(G034 value) { put("compra_governamental", value == null ? null : value.toJson()); return this; }
 public String getInscricaoSuframa() { return stringValue(field("inscricao_suframa")); }
 public NfeIssueRequest setInscricaoSuframa(String value) { put("inscricao_suframa", Json.scalar(value)); return this; }
 public String getCodigoIndicadorOperacao() { return stringValue(field("codigo_indicador_operacao")); }
 public NfeIssueRequest setCodigoIndicadorOperacao(String value) { put("codigo_indicador_operacao", Json.scalar(value)); return this; }
 public String getDataEmissao() { return stringValue(field("data_emissao")); }
 public NfeIssueRequest setDataEmissao(String value) { put("data_emissao", Json.scalar(value)); return this; }
 public String getDataEntradaSaida() { return stringValue(field("data_entrada_saida")); }
 public NfeIssueRequest setDataEntradaSaida(String value) { put("data_entrada_saida", Json.scalar(value)); return this; }
 public String getDataPrevisaoEntrega() { return stringValue(field("data_previsao_entrega")); }
 public NfeIssueRequest setDataPrevisaoEntrega(String value) { put("data_previsao_entrega", Json.scalar(value)); return this; }
 public String getDataServico() { return stringValue(field("data_servico")); }
 public NfeIssueRequest setDataServico(String value) { put("data_servico", Json.scalar(value)); return this; }
 public NfeIssueRequestNfeReferenciada getNfeReferenciada() { return (field("nfe_referenciada")).isNull() || (field("nfe_referenciada")).isMissingNode() ? null : new NfeIssueRequestNfeReferenciada(field("nfe_referenciada")); }
 public NfeIssueRequest setNfeReferenciada(NfeIssueRequestNfeReferenciada value) { put("nfe_referenciada", value == null ? null : value.toJson()); return this; }
 public NfeIssueRequestCteReferenciada getCteReferenciada() { return (field("cte_referenciada")).isNull() || (field("cte_referenciada")).isMissingNode() ? null : new NfeIssueRequestCteReferenciada(field("cte_referenciada")); }
 public NfeIssueRequest setCteReferenciada(NfeIssueRequestCteReferenciada value) { put("cte_referenciada", value == null ? null : value.toJson()); return this; }
 public NfeIssueRequestEcfReferenciada getEcfReferenciada() { return (field("ecf_referenciada")).isNull() || (field("ecf_referenciada")).isMissingNode() ? null : new NfeIssueRequestEcfReferenciada(field("ecf_referenciada")); }
 public NfeIssueRequest setEcfReferenciada(NfeIssueRequestEcfReferenciada value) { put("ecf_referenciada", value == null ? null : value.toJson()); return this; }
 public NfeIssueRequestNfRuralReferenciada getNfRuralReferenciada() { return (field("nf_rural_referenciada")).isNull() || (field("nf_rural_referenciada")).isMissingNode() ? null : new NfeIssueRequestNfRuralReferenciada(field("nf_rural_referenciada")); }
 public NfeIssueRequest setNfRuralReferenciada(NfeIssueRequestNfRuralReferenciada value) { put("nf_rural_referenciada", value == null ? null : value.toJson()); return this; }
 public Boolean getCalculoImpostos() { return booleanValue(field("calculo_impostos")); }
 public NfeIssueRequest setCalculoImpostos(Boolean value) { put("calculo_impostos", Json.scalar(value)); return this; }
 public Boolean getPreviaDanfe() { return booleanValue(field("previa_danfe")); }
 public NfeIssueRequest setPreviaDanfe(Boolean value) { put("previa_danfe", Json.scalar(value)); return this; }
 public Boolean getAssincrono() { return booleanValue(field("assincrono")); }
 public NfeIssueRequest setAssincrono(Boolean value) { put("assincrono", Json.scalar(value)); return this; }
 public G068 getResponsavelTecnico() { return (field("responsavel_tecnico")).isNull() || (field("responsavel_tecnico")).isMissingNode() ? null : new G068(field("responsavel_tecnico")); }
 public NfeIssueRequest setResponsavelTecnico(G068 value) { put("responsavel_tecnico", value == null ? null : value.toJson()); return this; }
 public java.util.List<G029> getDuplicatas() { return list(field("duplicatas"), v -> (v).isNull() || (v).isMissingNode() ? null : new G029(v)); }
 public NfeIssueRequest setDuplicatas(java.util.List<G029> value) { put("duplicatas", array(value, v -> v == null ? null : v.toJson())); return this; }
}
