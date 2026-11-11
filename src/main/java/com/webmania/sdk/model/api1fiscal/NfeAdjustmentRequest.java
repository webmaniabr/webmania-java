package com.webmania.sdk.model.api1fiscal;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api1/fiscal.openapi.json; see contract-provenance.json. */
public final class NfeAdjustmentRequest extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("operacao", "natureza_operacao", "codigo_cfop", "valor_icms", "valor_icms_st", "ambiente", "cliente", "situacao_tributaria", "informacoes_fisco", "informacoes_complementares");
 public NfeAdjustmentRequest() { super(FIELDS); }
 public NfeAdjustmentRequest(JsonNode node) { super(node, FIELDS); }
 public java.math.BigInteger getOperacao() { return integerValue(field("operacao")); }
 public NfeAdjustmentRequest setOperacao(java.math.BigInteger value) { put("operacao", Json.scalar(value)); return this; }
 public String getNaturezaOperacao() { return stringValue(field("natureza_operacao")); }
 public NfeAdjustmentRequest setNaturezaOperacao(String value) { put("natureza_operacao", Json.scalar(value)); return this; }
 public String getCodigoCfop() { return stringValue(field("codigo_cfop")); }
 public NfeAdjustmentRequest setCodigoCfop(String value) { put("codigo_cfop", Json.scalar(value)); return this; }
 public NfeAdjustmentRequestValorIcms getValorIcms() { return (field("valor_icms")).isNull() || (field("valor_icms")).isMissingNode() ? null : new NfeAdjustmentRequestValorIcms(field("valor_icms")); }
 public NfeAdjustmentRequest setValorIcms(NfeAdjustmentRequestValorIcms value) { put("valor_icms", value == null ? null : value.toJson()); return this; }
 public NfeAdjustmentRequestValorIcmsSt getValorIcmsSt() { return (field("valor_icms_st")).isNull() || (field("valor_icms_st")).isMissingNode() ? null : new NfeAdjustmentRequestValorIcmsSt(field("valor_icms_st")); }
 public NfeAdjustmentRequest setValorIcmsSt(NfeAdjustmentRequestValorIcmsSt value) { put("valor_icms_st", value == null ? null : value.toJson()); return this; }
 public Environment getAmbiente() { return (field("ambiente")).isNull() || (field("ambiente")).isMissingNode() ? null : new Environment(field("ambiente")); }
 public NfeAdjustmentRequest setAmbiente(Environment value) { put("ambiente", value == null ? null : value.toJson()); return this; }
 public NfeCustomer getCliente() { return (field("cliente")).isNull() || (field("cliente")).isMissingNode() ? null : new NfeCustomer(field("cliente")); }
 public NfeAdjustmentRequest setCliente(NfeCustomer value) { put("cliente", value == null ? null : value.toJson()); return this; }
 public String getSituacaoTributaria() { return stringValue(field("situacao_tributaria")); }
 public NfeAdjustmentRequest setSituacaoTributaria(String value) { put("situacao_tributaria", Json.scalar(value)); return this; }
 public String getInformacoesFisco() { return stringValue(field("informacoes_fisco")); }
 public NfeAdjustmentRequest setInformacoesFisco(String value) { put("informacoes_fisco", Json.scalar(value)); return this; }
 public String getInformacoesComplementares() { return stringValue(field("informacoes_complementares")); }
 public NfeAdjustmentRequest setInformacoesComplementares(String value) { put("informacoes_complementares", Json.scalar(value)); return this; }
}
