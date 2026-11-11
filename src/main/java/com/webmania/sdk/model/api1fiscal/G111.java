package com.webmania.sdk.model.api1fiscal;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api1/fiscal.openapi.json; see contract-provenance.json. */
public final class G111 extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("chave", "uuid", "natureza_operacao", "ambiente", "classe_imposto", "codigo_cfop", "produtos", "quantidade", "volume", "informacoes_fisco", "informacoes_complementares", "url_notificacao");
 public G111() { super(FIELDS); }
 public G111(JsonNode node) { super(node, FIELDS); }
 public String getChave() { return stringValue(field("chave")); }
 public G111 setChave(String value) { put("chave", Json.scalar(value)); return this; }
 public String getUuid() { return stringValue(field("uuid")); }
 public G111 setUuid(String value) { put("uuid", Json.scalar(value)); return this; }
 public String getNaturezaOperacao() { return stringValue(field("natureza_operacao")); }
 public G111 setNaturezaOperacao(String value) { put("natureza_operacao", Json.scalar(value)); return this; }
 public java.math.BigInteger getAmbiente() { return integerValue(field("ambiente")); }
 public G111 setAmbiente(java.math.BigInteger value) { put("ambiente", Json.scalar(value)); return this; }
 public String getClasseImposto() { return stringValue(field("classe_imposto")); }
 public G111 setClasseImposto(String value) { put("classe_imposto", Json.scalar(value)); return this; }
 public String getCodigoCfop() { return stringValue(field("codigo_cfop")); }
 public G111 setCodigoCfop(String value) { put("codigo_cfop", Json.scalar(value)); return this; }
 public java.util.List<java.math.BigInteger> getProdutos() { return list(field("produtos"), v -> integerValue(v)); }
 public G111 setProdutos(java.util.List<java.math.BigInteger> value) { put("produtos", array(value, v -> Json.scalar(v))); return this; }
 public java.util.List<G111QuantidadeItem> getQuantidade() { return list(field("quantidade"), v -> (v).isNull() || (v).isMissingNode() ? null : new G111QuantidadeItem(v)); }
 public G111 setQuantidade(java.util.List<G111QuantidadeItem> value) { put("quantidade", array(value, v -> v == null ? null : v.toJson())); return this; }
 public String getVolume() { return stringValue(field("volume")); }
 public G111 setVolume(String value) { put("volume", Json.scalar(value)); return this; }
 public String getInformacoesFisco() { return stringValue(field("informacoes_fisco")); }
 public G111 setInformacoesFisco(String value) { put("informacoes_fisco", Json.scalar(value)); return this; }
 public String getInformacoesComplementares() { return stringValue(field("informacoes_complementares")); }
 public G111 setInformacoesComplementares(String value) { put("informacoes_complementares", Json.scalar(value)); return this; }
 public String getUrlNotificacao() { return stringValue(field("url_notificacao")); }
 public G111 setUrlNotificacao(String value) { put("url_notificacao", Json.scalar(value)); return this; }
}
