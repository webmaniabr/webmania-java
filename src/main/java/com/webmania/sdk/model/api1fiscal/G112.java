package com.webmania.sdk.model.api1fiscal;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api1/fiscal.openapi.json; see contract-provenance.json. */
public final class G112 extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("operacao", "natureza_operacao", "codigo_cfop", "valor_icms", "valor_icms_st", "ambiente", "cliente", "situacao_tributaria", "informacoes_fisco", "informacoes_complementares");
 public G112() { super(FIELDS); }
 public G112(JsonNode node) { super(node, FIELDS); }
 public java.math.BigInteger getOperacao() { return integerValue(field("operacao")); }
 public G112 setOperacao(java.math.BigInteger value) { put("operacao", Json.scalar(value)); return this; }
 public String getNaturezaOperacao() { return stringValue(field("natureza_operacao")); }
 public G112 setNaturezaOperacao(String value) { put("natureza_operacao", Json.scalar(value)); return this; }
 public String getCodigoCfop() { return stringValue(field("codigo_cfop")); }
 public G112 setCodigoCfop(String value) { put("codigo_cfop", Json.scalar(value)); return this; }
 public G112ValorIcms getValorIcms() { return (field("valor_icms")).isNull() || (field("valor_icms")).isMissingNode() ? null : new G112ValorIcms(field("valor_icms")); }
 public G112 setValorIcms(G112ValorIcms value) { put("valor_icms", value == null ? null : value.toJson()); return this; }
 public G112ValorIcmsSt getValorIcmsSt() { return (field("valor_icms_st")).isNull() || (field("valor_icms_st")).isMissingNode() ? null : new G112ValorIcmsSt(field("valor_icms_st")); }
 public G112 setValorIcmsSt(G112ValorIcmsSt value) { put("valor_icms_st", value == null ? null : value.toJson()); return this; }
 public java.math.BigInteger getAmbiente() { return integerValue(field("ambiente")); }
 public G112 setAmbiente(java.math.BigInteger value) { put("ambiente", Json.scalar(value)); return this; }
 public NfeCustomer getCliente() { return (field("cliente")).isNull() || (field("cliente")).isMissingNode() ? null : new NfeCustomer(field("cliente")); }
 public G112 setCliente(NfeCustomer value) { put("cliente", value == null ? null : value.toJson()); return this; }
 public String getSituacaoTributaria() { return stringValue(field("situacao_tributaria")); }
 public G112 setSituacaoTributaria(String value) { put("situacao_tributaria", Json.scalar(value)); return this; }
 public String getInformacoesFisco() { return stringValue(field("informacoes_fisco")); }
 public G112 setInformacoesFisco(String value) { put("informacoes_fisco", Json.scalar(value)); return this; }
 public String getInformacoesComplementares() { return stringValue(field("informacoes_complementares")); }
 public G112 setInformacoesComplementares(String value) { put("informacoes_complementares", Json.scalar(value)); return this; }
}
