package com.webmania.sdk.model.api1fiscal;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api1/fiscal.openapi.json; see contract-provenance.json. */
public final class NfeReturnRequest extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("chave", "uuid", "natureza_operacao", "ambiente", "classe_imposto", "codigo_cfop", "produtos", "quantidade", "volume", "informacoes_fisco", "informacoes_complementares", "url_notificacao", "ver_aplic");
 public NfeReturnRequest() { super(FIELDS); }
 public NfeReturnRequest(JsonNode node) { super(node, FIELDS); }
 public AccessKey getChave() { return (field("chave")).isNull() || (field("chave")).isMissingNode() ? null : new AccessKey(field("chave")); }
 public NfeReturnRequest setChave(AccessKey value) { put("chave", value == null ? null : value.toJson()); return this; }
 public Uuid getUuid() { return (field("uuid")).isNull() || (field("uuid")).isMissingNode() ? null : new Uuid(field("uuid")); }
 public NfeReturnRequest setUuid(Uuid value) { put("uuid", value == null ? null : value.toJson()); return this; }
 public String getNaturezaOperacao() { return stringValue(field("natureza_operacao")); }
 public NfeReturnRequest setNaturezaOperacao(String value) { put("natureza_operacao", Json.scalar(value)); return this; }
 public Environment getAmbiente() { return (field("ambiente")).isNull() || (field("ambiente")).isMissingNode() ? null : new Environment(field("ambiente")); }
 public NfeReturnRequest setAmbiente(Environment value) { put("ambiente", value == null ? null : value.toJson()); return this; }
 public String getClasseImposto() { return stringValue(field("classe_imposto")); }
 public NfeReturnRequest setClasseImposto(String value) { put("classe_imposto", Json.scalar(value)); return this; }
 public String getCodigoCfop() { return stringValue(field("codigo_cfop")); }
 public NfeReturnRequest setCodigoCfop(String value) { put("codigo_cfop", Json.scalar(value)); return this; }
 public java.util.List<java.math.BigInteger> getProdutos() { return list(field("produtos"), v -> integerValue(v)); }
 public NfeReturnRequest setProdutos(java.util.List<java.math.BigInteger> value) { put("produtos", array(value, v -> Json.scalar(v))); return this; }
 public java.util.List<NfeReturnRequestQuantidadeItem> getQuantidade() { return list(field("quantidade"), v -> (v).isNull() || (v).isMissingNode() ? null : new NfeReturnRequestQuantidadeItem(v)); }
 public NfeReturnRequest setQuantidade(java.util.List<NfeReturnRequestQuantidadeItem> value) { put("quantidade", array(value, v -> v == null ? null : v.toJson())); return this; }
 public String getVolume() { return stringValue(field("volume")); }
 public NfeReturnRequest setVolume(String value) { put("volume", Json.scalar(value)); return this; }
 public String getInformacoesFisco() { return stringValue(field("informacoes_fisco")); }
 public NfeReturnRequest setInformacoesFisco(String value) { put("informacoes_fisco", Json.scalar(value)); return this; }
 public String getInformacoesComplementares() { return stringValue(field("informacoes_complementares")); }
 public NfeReturnRequest setInformacoesComplementares(String value) { put("informacoes_complementares", Json.scalar(value)); return this; }
 public String getUrlNotificacao() { return stringValue(field("url_notificacao")); }
 public NfeReturnRequest setUrlNotificacao(String value) { put("url_notificacao", Json.scalar(value)); return this; }
 public String getVerAplic() { return stringValue(field("ver_aplic")); }
 public NfeReturnRequest setVerAplic(String value) { put("ver_aplic", Json.scalar(value)); return this; }
}
