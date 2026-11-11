package com.webmania.sdk.model.api1fiscal;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api1/fiscal.openapi.json; see contract-provenance.json. */
public final class IbsCbs112140Request extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("chave", "ambiente", "cod_evento", "evento", "url_notificacao", "nSeqEvento", "itens", "informacoes_evento");
 public IbsCbs112140Request() { super(FIELDS); }
 public IbsCbs112140Request(JsonNode node) { super(node, FIELDS); }
 public AccessKey getChave() { return (field("chave")).isNull() || (field("chave")).isMissingNode() ? null : new AccessKey(field("chave")); }
 public IbsCbs112140Request setChave(AccessKey value) { put("chave", value == null ? null : value.toJson()); return this; }
 public Environment getAmbiente() { return (field("ambiente")).isNull() || (field("ambiente")).isMissingNode() ? null : new Environment(field("ambiente")); }
 public IbsCbs112140Request setAmbiente(Environment value) { put("ambiente", value == null ? null : value.toJson()); return this; }
 public String getCodEvento() { return stringValue(field("cod_evento")); }
 public IbsCbs112140Request setCodEvento(String value) { put("cod_evento", Json.scalar(value)); return this; }
 public java.math.BigInteger getEvento() { return integerValue(field("evento")); }
 public IbsCbs112140Request setEvento(java.math.BigInteger value) { put("evento", Json.scalar(value)); return this; }
 public String getUrlNotificacao() { return stringValue(field("url_notificacao")); }
 public IbsCbs112140Request setUrlNotificacao(String value) { put("url_notificacao", Json.scalar(value)); return this; }
 public java.math.BigInteger getNSeqEvento() { return integerValue(field("nSeqEvento")); }
 public IbsCbs112140Request setNSeqEvento(java.math.BigInteger value) { put("nSeqEvento", Json.scalar(value)); return this; }
 public java.util.List<IbsCbs112140RequestItensItem> getItens() { return list(field("itens"), v -> (v).isNull() || (v).isMissingNode() ? null : new IbsCbs112140RequestItensItem(v)); }
 public IbsCbs112140Request setItens(java.util.List<IbsCbs112140RequestItensItem> value) { put("itens", array(value, v -> v == null ? null : v.toJson())); return this; }
 public IbsCbs112140Details getInformacoesEvento() { return (field("informacoes_evento")).isNull() || (field("informacoes_evento")).isMissingNode() ? null : new IbsCbs112140Details(field("informacoes_evento")); }
 public IbsCbs112140Request setInformacoesEvento(IbsCbs112140Details value) { put("informacoes_evento", value == null ? null : value.toJson()); return this; }
}
