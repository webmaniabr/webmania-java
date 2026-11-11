package com.webmania.sdk.model.api1fiscal;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api1/fiscal.openapi.json; see contract-provenance.json. */
public final class NfeComplementRequest extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("chave", "uuid", "operacao", "natureza_operacao", "ambiente", "cliente", "produtos", "impostos", "agropecuario", "documento_adicao", "informacoes_fisco", "informacoes_complementares");
 public NfeComplementRequest() { super(FIELDS); }
 public NfeComplementRequest(JsonNode node) { super(node, FIELDS); }
 public AccessKey getChave() { return (field("chave")).isNull() || (field("chave")).isMissingNode() ? null : new AccessKey(field("chave")); }
 public NfeComplementRequest setChave(AccessKey value) { put("chave", value == null ? null : value.toJson()); return this; }
 public Uuid getUuid() { return (field("uuid")).isNull() || (field("uuid")).isMissingNode() ? null : new Uuid(field("uuid")); }
 public NfeComplementRequest setUuid(Uuid value) { put("uuid", value == null ? null : value.toJson()); return this; }
 public java.math.BigInteger getOperacao() { return integerValue(field("operacao")); }
 public NfeComplementRequest setOperacao(java.math.BigInteger value) { put("operacao", Json.scalar(value)); return this; }
 public String getNaturezaOperacao() { return stringValue(field("natureza_operacao")); }
 public NfeComplementRequest setNaturezaOperacao(String value) { put("natureza_operacao", Json.scalar(value)); return this; }
 public Environment getAmbiente() { return (field("ambiente")).isNull() || (field("ambiente")).isMissingNode() ? null : new Environment(field("ambiente")); }
 public NfeComplementRequest setAmbiente(Environment value) { put("ambiente", value == null ? null : value.toJson()); return this; }
 public NfeCustomer getCliente() { return (field("cliente")).isNull() || (field("cliente")).isMissingNode() ? null : new NfeCustomer(field("cliente")); }
 public NfeComplementRequest setCliente(NfeCustomer value) { put("cliente", value == null ? null : value.toJson()); return this; }
 public java.util.List<NfeComplementProduct> getProdutos() { return list(field("produtos"), v -> (v).isNull() || (v).isMissingNode() ? null : new NfeComplementProduct(v)); }
 public NfeComplementRequest setProdutos(java.util.List<NfeComplementProduct> value) { put("produtos", array(value, v -> v == null ? null : v.toJson())); return this; }
 public NfeComplementTaxes getImpostos() { return (field("impostos")).isNull() || (field("impostos")).isMissingNode() ? null : new NfeComplementTaxes(field("impostos")); }
 public NfeComplementRequest setImpostos(NfeComplementTaxes value) { put("impostos", value == null ? null : value.toJson()); return this; }
 public G031 getAgropecuario() { return (field("agropecuario")).isNull() || (field("agropecuario")).isMissingNode() ? null : new G031(field("agropecuario")); }
 public NfeComplementRequest setAgropecuario(G031 value) { put("agropecuario", value == null ? null : value.toJson()); return this; }
 public G119 getDocumentoAdicao() { return (field("documento_adicao")).isNull() || (field("documento_adicao")).isMissingNode() ? null : new G119(field("documento_adicao")); }
 public NfeComplementRequest setDocumentoAdicao(G119 value) { put("documento_adicao", value == null ? null : value.toJson()); return this; }
 public String getInformacoesFisco() { return stringValue(field("informacoes_fisco")); }
 public NfeComplementRequest setInformacoesFisco(String value) { put("informacoes_fisco", Json.scalar(value)); return this; }
 public String getInformacoesComplementares() { return stringValue(field("informacoes_complementares")); }
 public NfeComplementRequest setInformacoesComplementares(String value) { put("informacoes_complementares", Json.scalar(value)); return this; }
}
