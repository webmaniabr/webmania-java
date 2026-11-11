package com.webmania.sdk.model.api1fiscal;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api1/fiscal.openapi.json; see contract-provenance.json. */
public final class G003 extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("ID", "operacao", "natureza_operacao", "modelo", "finalidade", "ambiente", "tipo_credito", "tipo_debito", "url_notificacao", "cliente", "produtos", "pedido", "transporte", "fatura", "parcelas", "exportacao", "agropecuario", "compra_governamental", "inscricao_suframa", "codigo_indicador_operacao");
 public G003() { super(FIELDS); }
 public G003(JsonNode node) { super(node, FIELDS); }
 public String getID() { return stringValue(field("ID")); }
 public G003 setID(String value) { put("ID", Json.scalar(value)); return this; }
 public java.math.BigInteger getOperacao() { return integerValue(field("operacao")); }
 public G003 setOperacao(java.math.BigInteger value) { put("operacao", Json.scalar(value)); return this; }
 public String getNaturezaOperacao() { return stringValue(field("natureza_operacao")); }
 public G003 setNaturezaOperacao(String value) { put("natureza_operacao", Json.scalar(value)); return this; }
 public String getModelo() { return stringValue(field("modelo")); }
 public G003 setModelo(String value) { put("modelo", Json.scalar(value)); return this; }
 public java.math.BigInteger getFinalidade() { return integerValue(field("finalidade")); }
 public G003 setFinalidade(java.math.BigInteger value) { put("finalidade", Json.scalar(value)); return this; }
 public java.math.BigInteger getAmbiente() { return integerValue(field("ambiente")); }
 public G003 setAmbiente(java.math.BigInteger value) { put("ambiente", Json.scalar(value)); return this; }
 public java.math.BigInteger getTipoCredito() { return integerValue(field("tipo_credito")); }
 public G003 setTipoCredito(java.math.BigInteger value) { put("tipo_credito", Json.scalar(value)); return this; }
 public java.math.BigInteger getTipoDebito() { return integerValue(field("tipo_debito")); }
 public G003 setTipoDebito(java.math.BigInteger value) { put("tipo_debito", Json.scalar(value)); return this; }
 public String getUrlNotificacao() { return stringValue(field("url_notificacao")); }
 public G003 setUrlNotificacao(String value) { put("url_notificacao", Json.scalar(value)); return this; }
 public NfeCustomer getCliente() { return (field("cliente")).isNull() || (field("cliente")).isMissingNode() ? null : new NfeCustomer(field("cliente")); }
 public G003 setCliente(NfeCustomer value) { put("cliente", value == null ? null : value.toJson()); return this; }
 public java.util.List<NfeProduct> getProdutos() { return list(field("produtos"), v -> (v).isNull() || (v).isMissingNode() ? null : new NfeProduct(v)); }
 public G003 setProdutos(java.util.List<NfeProduct> value) { put("produtos", array(value, v -> v == null ? null : v.toJson())); return this; }
 public NfeOrder getPedido() { return (field("pedido")).isNull() || (field("pedido")).isMissingNode() ? null : new NfeOrder(field("pedido")); }
 public G003 setPedido(NfeOrder value) { put("pedido", value == null ? null : value.toJson()); return this; }
 public NfeTransport getTransporte() { return (field("transporte")).isNull() || (field("transporte")).isMissingNode() ? null : new NfeTransport(field("transporte")); }
 public G003 setTransporte(NfeTransport value) { put("transporte", value == null ? null : value.toJson()); return this; }
 public G028 getFatura() { return (field("fatura")).isNull() || (field("fatura")).isMissingNode() ? null : new G028(field("fatura")); }
 public G003 setFatura(G028 value) { put("fatura", value == null ? null : value.toJson()); return this; }
 public java.util.List<G029> getParcelas() { return list(field("parcelas"), v -> (v).isNull() || (v).isMissingNode() ? null : new G029(v)); }
 public G003 setParcelas(java.util.List<G029> value) { put("parcelas", array(value, v -> v == null ? null : v.toJson())); return this; }
 public G030 getExportacao() { return (field("exportacao")).isNull() || (field("exportacao")).isMissingNode() ? null : new G030(field("exportacao")); }
 public G003 setExportacao(G030 value) { put("exportacao", value == null ? null : value.toJson()); return this; }
 public G031 getAgropecuario() { return (field("agropecuario")).isNull() || (field("agropecuario")).isMissingNode() ? null : new G031(field("agropecuario")); }
 public G003 setAgropecuario(G031 value) { put("agropecuario", value == null ? null : value.toJson()); return this; }
 public G034 getCompraGovernamental() { return (field("compra_governamental")).isNull() || (field("compra_governamental")).isMissingNode() ? null : new G034(field("compra_governamental")); }
 public G003 setCompraGovernamental(G034 value) { put("compra_governamental", value == null ? null : value.toJson()); return this; }
 public String getInscricaoSuframa() { return stringValue(field("inscricao_suframa")); }
 public G003 setInscricaoSuframa(String value) { put("inscricao_suframa", Json.scalar(value)); return this; }
 public String getCodigoIndicadorOperacao() { return stringValue(field("codigo_indicador_operacao")); }
 public G003 setCodigoIndicadorOperacao(String value) { put("codigo_indicador_operacao", Json.scalar(value)); return this; }
}
