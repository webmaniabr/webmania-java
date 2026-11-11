package com.webmania.sdk.model.api1fiscal;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api1/fiscal.openapi.json; see contract-provenance.json. */
public final class Nfce65IssueRequest extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("ID", "operacao", "natureza_operacao", "modelo", "finalidade", "ambiente", "tipo_credito", "tipo_debito", "url_notificacao", "cliente", "produtos", "pedido", "transporte", "fatura", "parcelas", "exportacao", "agropecuario", "compra_governamental", "inscricao_suframa", "codigo_indicador_operacao", "data_emissao", "data_entrada_saida", "data_previsao_entrega", "data_servico", "nfe_referenciada", "cte_referenciada", "ecf_referenciada", "nf_rural_referenciada", "calculo_impostos", "previa_danfe", "assincrono", "responsavel_tecnico", "duplicatas");
 public Nfce65IssueRequest() { super(FIELDS); }
 public Nfce65IssueRequest(JsonNode node) { super(node, FIELDS); }
 public String getID() { return stringValue(field("ID")); }
 public Nfce65IssueRequest setID(String value) { put("ID", Json.scalar(value)); return this; }
 public java.math.BigInteger getOperacao() { return integerValue(field("operacao")); }
 public Nfce65IssueRequest setOperacao(java.math.BigInteger value) { put("operacao", Json.scalar(value)); return this; }
 public String getNaturezaOperacao() { return stringValue(field("natureza_operacao")); }
 public Nfce65IssueRequest setNaturezaOperacao(String value) { put("natureza_operacao", Json.scalar(value)); return this; }
 public JsonValue getModelo() { return (field("modelo")).isNull() || (field("modelo")).isMissingNode() ? null : new JsonValue(field("modelo")); }
 public Nfce65IssueRequest setModelo(JsonValue value) { put("modelo", value == null ? null : value.toJson()); return this; }
 public java.math.BigInteger getFinalidade() { return integerValue(field("finalidade")); }
 public Nfce65IssueRequest setFinalidade(java.math.BigInteger value) { put("finalidade", Json.scalar(value)); return this; }
 public Environment getAmbiente() { return (field("ambiente")).isNull() || (field("ambiente")).isMissingNode() ? null : new Environment(field("ambiente")); }
 public Nfce65IssueRequest setAmbiente(Environment value) { put("ambiente", value == null ? null : value.toJson()); return this; }
 public java.math.BigInteger getTipoCredito() { return integerValue(field("tipo_credito")); }
 public Nfce65IssueRequest setTipoCredito(java.math.BigInteger value) { put("tipo_credito", Json.scalar(value)); return this; }
 public java.math.BigInteger getTipoDebito() { return integerValue(field("tipo_debito")); }
 public Nfce65IssueRequest setTipoDebito(java.math.BigInteger value) { put("tipo_debito", Json.scalar(value)); return this; }
 public String getUrlNotificacao() { return stringValue(field("url_notificacao")); }
 public Nfce65IssueRequest setUrlNotificacao(String value) { put("url_notificacao", Json.scalar(value)); return this; }
 public NfeCustomer getCliente() { return (field("cliente")).isNull() || (field("cliente")).isMissingNode() ? null : new NfeCustomer(field("cliente")); }
 public Nfce65IssueRequest setCliente(NfeCustomer value) { put("cliente", value == null ? null : value.toJson()); return this; }
 public java.util.List<NfeProduct> getProdutos() { return list(field("produtos"), v -> (v).isNull() || (v).isMissingNode() ? null : new NfeProduct(v)); }
 public Nfce65IssueRequest setProdutos(java.util.List<NfeProduct> value) { put("produtos", array(value, v -> v == null ? null : v.toJson())); return this; }
 public NfeOrder getPedido() { return (field("pedido")).isNull() || (field("pedido")).isMissingNode() ? null : new NfeOrder(field("pedido")); }
 public Nfce65IssueRequest setPedido(NfeOrder value) { put("pedido", value == null ? null : value.toJson()); return this; }
 public NfeTransport getTransporte() { return (field("transporte")).isNull() || (field("transporte")).isMissingNode() ? null : new NfeTransport(field("transporte")); }
 public Nfce65IssueRequest setTransporte(NfeTransport value) { put("transporte", value == null ? null : value.toJson()); return this; }
 public G028 getFatura() { return (field("fatura")).isNull() || (field("fatura")).isMissingNode() ? null : new G028(field("fatura")); }
 public Nfce65IssueRequest setFatura(G028 value) { put("fatura", value == null ? null : value.toJson()); return this; }
 public java.util.List<G029> getParcelas() { return list(field("parcelas"), v -> (v).isNull() || (v).isMissingNode() ? null : new G029(v)); }
 public Nfce65IssueRequest setParcelas(java.util.List<G029> value) { put("parcelas", array(value, v -> v == null ? null : v.toJson())); return this; }
 public G030 getExportacao() { return (field("exportacao")).isNull() || (field("exportacao")).isMissingNode() ? null : new G030(field("exportacao")); }
 public Nfce65IssueRequest setExportacao(G030 value) { put("exportacao", value == null ? null : value.toJson()); return this; }
 public G031 getAgropecuario() { return (field("agropecuario")).isNull() || (field("agropecuario")).isMissingNode() ? null : new G031(field("agropecuario")); }
 public Nfce65IssueRequest setAgropecuario(G031 value) { put("agropecuario", value == null ? null : value.toJson()); return this; }
 public G034 getCompraGovernamental() { return (field("compra_governamental")).isNull() || (field("compra_governamental")).isMissingNode() ? null : new G034(field("compra_governamental")); }
 public Nfce65IssueRequest setCompraGovernamental(G034 value) { put("compra_governamental", value == null ? null : value.toJson()); return this; }
 public String getInscricaoSuframa() { return stringValue(field("inscricao_suframa")); }
 public Nfce65IssueRequest setInscricaoSuframa(String value) { put("inscricao_suframa", Json.scalar(value)); return this; }
 public String getCodigoIndicadorOperacao() { return stringValue(field("codigo_indicador_operacao")); }
 public Nfce65IssueRequest setCodigoIndicadorOperacao(String value) { put("codigo_indicador_operacao", Json.scalar(value)); return this; }
 public String getDataEmissao() { return stringValue(field("data_emissao")); }
 public Nfce65IssueRequest setDataEmissao(String value) { put("data_emissao", Json.scalar(value)); return this; }
 public String getDataEntradaSaida() { return stringValue(field("data_entrada_saida")); }
 public Nfce65IssueRequest setDataEntradaSaida(String value) { put("data_entrada_saida", Json.scalar(value)); return this; }
 public String getDataPrevisaoEntrega() { return stringValue(field("data_previsao_entrega")); }
 public Nfce65IssueRequest setDataPrevisaoEntrega(String value) { put("data_previsao_entrega", Json.scalar(value)); return this; }
 public String getDataServico() { return stringValue(field("data_servico")); }
 public Nfce65IssueRequest setDataServico(String value) { put("data_servico", Json.scalar(value)); return this; }
 public Nfce65IssueRequestNfeReferenciada getNfeReferenciada() { return (field("nfe_referenciada")).isNull() || (field("nfe_referenciada")).isMissingNode() ? null : new Nfce65IssueRequestNfeReferenciada(field("nfe_referenciada")); }
 public Nfce65IssueRequest setNfeReferenciada(Nfce65IssueRequestNfeReferenciada value) { put("nfe_referenciada", value == null ? null : value.toJson()); return this; }
 public Nfce65IssueRequestCteReferenciada getCteReferenciada() { return (field("cte_referenciada")).isNull() || (field("cte_referenciada")).isMissingNode() ? null : new Nfce65IssueRequestCteReferenciada(field("cte_referenciada")); }
 public Nfce65IssueRequest setCteReferenciada(Nfce65IssueRequestCteReferenciada value) { put("cte_referenciada", value == null ? null : value.toJson()); return this; }
 public Nfce65IssueRequestEcfReferenciada getEcfReferenciada() { return (field("ecf_referenciada")).isNull() || (field("ecf_referenciada")).isMissingNode() ? null : new Nfce65IssueRequestEcfReferenciada(field("ecf_referenciada")); }
 public Nfce65IssueRequest setEcfReferenciada(Nfce65IssueRequestEcfReferenciada value) { put("ecf_referenciada", value == null ? null : value.toJson()); return this; }
 public Nfce65IssueRequestNfRuralReferenciada getNfRuralReferenciada() { return (field("nf_rural_referenciada")).isNull() || (field("nf_rural_referenciada")).isMissingNode() ? null : new Nfce65IssueRequestNfRuralReferenciada(field("nf_rural_referenciada")); }
 public Nfce65IssueRequest setNfRuralReferenciada(Nfce65IssueRequestNfRuralReferenciada value) { put("nf_rural_referenciada", value == null ? null : value.toJson()); return this; }
 public Boolean getCalculoImpostos() { return booleanValue(field("calculo_impostos")); }
 public Nfce65IssueRequest setCalculoImpostos(Boolean value) { put("calculo_impostos", Json.scalar(value)); return this; }
 public Boolean getPreviaDanfe() { return booleanValue(field("previa_danfe")); }
 public Nfce65IssueRequest setPreviaDanfe(Boolean value) { put("previa_danfe", Json.scalar(value)); return this; }
 public Boolean getAssincrono() { return booleanValue(field("assincrono")); }
 public Nfce65IssueRequest setAssincrono(Boolean value) { put("assincrono", Json.scalar(value)); return this; }
 public G068 getResponsavelTecnico() { return (field("responsavel_tecnico")).isNull() || (field("responsavel_tecnico")).isMissingNode() ? null : new G068(field("responsavel_tecnico")); }
 public Nfce65IssueRequest setResponsavelTecnico(G068 value) { put("responsavel_tecnico", value == null ? null : value.toJson()); return this; }
 public java.util.List<G029> getDuplicatas() { return list(field("duplicatas"), v -> (v).isNull() || (v).isMissingNode() ? null : new G029(v)); }
 public Nfce65IssueRequest setDuplicatas(java.util.List<G029> value) { put("duplicatas", array(value, v -> v == null ? null : v.toJson())); return this; }
}
