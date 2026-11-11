package com.webmania.sdk.model.api1fiscal;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api1/fiscal.openapi.json; see contract-provenance.json. */
public final class G113 extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("chave", "uuid", "operacao", "natureza_operacao", "ambiente", "cliente", "produtos", "impostos", "agropecuario", "documento_adicao", "informacoes_fisco", "informacoes_complementares");
 public G113() { super(FIELDS); }
 public G113(JsonNode node) { super(node, FIELDS); }
 public String getChave() { return stringValue(field("chave")); }
 public G113 setChave(String value) { put("chave", Json.scalar(value)); return this; }
 public String getUuid() { return stringValue(field("uuid")); }
 public G113 setUuid(String value) { put("uuid", Json.scalar(value)); return this; }
 public java.math.BigInteger getOperacao() { return integerValue(field("operacao")); }
 public G113 setOperacao(java.math.BigInteger value) { put("operacao", Json.scalar(value)); return this; }
 public String getNaturezaOperacao() { return stringValue(field("natureza_operacao")); }
 public G113 setNaturezaOperacao(String value) { put("natureza_operacao", Json.scalar(value)); return this; }
 public java.math.BigInteger getAmbiente() { return integerValue(field("ambiente")); }
 public G113 setAmbiente(java.math.BigInteger value) { put("ambiente", Json.scalar(value)); return this; }
 public NfeCustomer getCliente() { return (field("cliente")).isNull() || (field("cliente")).isMissingNode() ? null : new NfeCustomer(field("cliente")); }
 public G113 setCliente(NfeCustomer value) { put("cliente", value == null ? null : value.toJson()); return this; }
 public java.util.List<NfeComplementProduct> getProdutos() { return list(field("produtos"), v -> (v).isNull() || (v).isMissingNode() ? null : new NfeComplementProduct(v)); }
 public G113 setProdutos(java.util.List<NfeComplementProduct> value) { put("produtos", array(value, v -> v == null ? null : v.toJson())); return this; }
 public NfeComplementTaxes getImpostos() { return (field("impostos")).isNull() || (field("impostos")).isMissingNode() ? null : new NfeComplementTaxes(field("impostos")); }
 public G113 setImpostos(NfeComplementTaxes value) { put("impostos", value == null ? null : value.toJson()); return this; }
 public G031 getAgropecuario() { return (field("agropecuario")).isNull() || (field("agropecuario")).isMissingNode() ? null : new G031(field("agropecuario")); }
 public G113 setAgropecuario(G031 value) { put("agropecuario", value == null ? null : value.toJson()); return this; }
 public G119 getDocumentoAdicao() { return (field("documento_adicao")).isNull() || (field("documento_adicao")).isMissingNode() ? null : new G119(field("documento_adicao")); }
 public G113 setDocumentoAdicao(G119 value) { put("documento_adicao", value == null ? null : value.toJson()); return this; }
 public String getInformacoesFisco() { return stringValue(field("informacoes_fisco")); }
 public G113 setInformacoesFisco(String value) { put("informacoes_fisco", Json.scalar(value)); return this; }
 public String getInformacoesComplementares() { return stringValue(field("informacoes_complementares")); }
 public G113 setInformacoesComplementares(String value) { put("informacoes_complementares", Json.scalar(value)); return this; }
}
