package com.webmania.sdk.model.api1fiscal;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api1/fiscal.openapi.json; see contract-provenance.json. */
public final class IbsCbs112120Request extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("chave", "ambiente", "cod_evento", "evento", "url_notificacao", "nSeqEvento", "itens", "informacoes_evento");
 public IbsCbs112120Request() { super(FIELDS); }
 public IbsCbs112120Request(JsonNode node) { super(node, FIELDS); }
 public AccessKey getChave() { return (field("chave")).isNull() || (field("chave")).isMissingNode() ? null : new AccessKey(field("chave")); }
 public IbsCbs112120Request setChave(AccessKey value) { put("chave", value == null ? null : value.toJson()); return this; }
 public Environment getAmbiente() { return (field("ambiente")).isNull() || (field("ambiente")).isMissingNode() ? null : new Environment(field("ambiente")); }
 public IbsCbs112120Request setAmbiente(Environment value) { put("ambiente", value == null ? null : value.toJson()); return this; }
 public String getCodEvento() { return stringValue(field("cod_evento")); }
 public IbsCbs112120Request setCodEvento(String value) { put("cod_evento", Json.scalar(value)); return this; }
 public java.math.BigInteger getEvento() { return integerValue(field("evento")); }
 public IbsCbs112120Request setEvento(java.math.BigInteger value) { put("evento", Json.scalar(value)); return this; }
 public String getUrlNotificacao() { return stringValue(field("url_notificacao")); }
 public IbsCbs112120Request setUrlNotificacao(String value) { put("url_notificacao", Json.scalar(value)); return this; }
 public java.math.BigInteger getNSeqEvento() { return integerValue(field("nSeqEvento")); }
 public IbsCbs112120Request setNSeqEvento(java.math.BigInteger value) { put("nSeqEvento", Json.scalar(value)); return this; }
 public java.util.List<IbsCbs112120RequestItensItem> getItens() { return list(field("itens"), v -> (v).isNull() || (v).isMissingNode() ? null : new IbsCbs112120RequestItensItem(v)); }
 public IbsCbs112120Request setItens(java.util.List<IbsCbs112120RequestItensItem> value) { put("itens", array(value, v -> v == null ? null : v.toJson())); return this; }
 public IbsCbs112120Details getInformacoesEvento() { return (field("informacoes_evento")).isNull() || (field("informacoes_evento")).isMissingNode() ? null : new IbsCbs112120Details(field("informacoes_evento")); }
 public IbsCbs112120Request setInformacoesEvento(IbsCbs112120Details value) { put("informacoes_evento", value == null ? null : value.toJson()); return this; }
}
