package com.webmania.sdk.model.api1fiscal;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api1/fiscal.openapi.json; see contract-provenance.json. */
public final class IbsCbs112110Request extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("chave", "ambiente", "cod_evento", "evento", "url_notificacao", "nSeqEvento", "indicador_quitacao", "informacoes_evento");
 public IbsCbs112110Request() { super(FIELDS); }
 public IbsCbs112110Request(JsonNode node) { super(node, FIELDS); }
 public AccessKey getChave() { return (field("chave")).isNull() || (field("chave")).isMissingNode() ? null : new AccessKey(field("chave")); }
 public IbsCbs112110Request setChave(AccessKey value) { put("chave", value == null ? null : value.toJson()); return this; }
 public Environment getAmbiente() { return (field("ambiente")).isNull() || (field("ambiente")).isMissingNode() ? null : new Environment(field("ambiente")); }
 public IbsCbs112110Request setAmbiente(Environment value) { put("ambiente", value == null ? null : value.toJson()); return this; }
 public String getCodEvento() { return stringValue(field("cod_evento")); }
 public IbsCbs112110Request setCodEvento(String value) { put("cod_evento", Json.scalar(value)); return this; }
 public java.math.BigInteger getEvento() { return integerValue(field("evento")); }
 public IbsCbs112110Request setEvento(java.math.BigInteger value) { put("evento", Json.scalar(value)); return this; }
 public String getUrlNotificacao() { return stringValue(field("url_notificacao")); }
 public IbsCbs112110Request setUrlNotificacao(String value) { put("url_notificacao", Json.scalar(value)); return this; }
 public java.math.BigInteger getNSeqEvento() { return integerValue(field("nSeqEvento")); }
 public IbsCbs112110Request setNSeqEvento(java.math.BigInteger value) { put("nSeqEvento", Json.scalar(value)); return this; }
 public IbsCbs112110RequestIndicadorQuitacao getIndicadorQuitacao() { return (field("indicador_quitacao")).isNull() || (field("indicador_quitacao")).isMissingNode() ? null : new IbsCbs112110RequestIndicadorQuitacao(field("indicador_quitacao")); }
 public IbsCbs112110Request setIndicadorQuitacao(IbsCbs112110RequestIndicadorQuitacao value) { put("indicador_quitacao", value == null ? null : value.toJson()); return this; }
 public IbsCbs112110Details getInformacoesEvento() { return (field("informacoes_evento")).isNull() || (field("informacoes_evento")).isMissingNode() ? null : new IbsCbs112110Details(field("informacoes_evento")); }
 public IbsCbs112110Request setInformacoesEvento(IbsCbs112110Details value) { put("informacoes_evento", value == null ? null : value.toJson()); return this; }
}
