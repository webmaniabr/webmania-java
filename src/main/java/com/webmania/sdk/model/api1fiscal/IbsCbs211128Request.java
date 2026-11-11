package com.webmania.sdk.model.api1fiscal;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api1/fiscal.openapi.json; see contract-provenance.json. */
public final class IbsCbs211128Request extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("chave", "ambiente", "cod_evento", "evento", "url_notificacao", "nSeqEvento", "indicador_aceitacao", "informacoes_evento");
 public IbsCbs211128Request() { super(FIELDS); }
 public IbsCbs211128Request(JsonNode node) { super(node, FIELDS); }
 public AccessKey getChave() { return (field("chave")).isNull() || (field("chave")).isMissingNode() ? null : new AccessKey(field("chave")); }
 public IbsCbs211128Request setChave(AccessKey value) { put("chave", value == null ? null : value.toJson()); return this; }
 public Environment getAmbiente() { return (field("ambiente")).isNull() || (field("ambiente")).isMissingNode() ? null : new Environment(field("ambiente")); }
 public IbsCbs211128Request setAmbiente(Environment value) { put("ambiente", value == null ? null : value.toJson()); return this; }
 public String getCodEvento() { return stringValue(field("cod_evento")); }
 public IbsCbs211128Request setCodEvento(String value) { put("cod_evento", Json.scalar(value)); return this; }
 public java.math.BigInteger getEvento() { return integerValue(field("evento")); }
 public IbsCbs211128Request setEvento(java.math.BigInteger value) { put("evento", Json.scalar(value)); return this; }
 public String getUrlNotificacao() { return stringValue(field("url_notificacao")); }
 public IbsCbs211128Request setUrlNotificacao(String value) { put("url_notificacao", Json.scalar(value)); return this; }
 public java.math.BigInteger getNSeqEvento() { return integerValue(field("nSeqEvento")); }
 public IbsCbs211128Request setNSeqEvento(java.math.BigInteger value) { put("nSeqEvento", Json.scalar(value)); return this; }
 public IbsCbs211128RequestIndicadorAceitacao getIndicadorAceitacao() { return (field("indicador_aceitacao")).isNull() || (field("indicador_aceitacao")).isMissingNode() ? null : new IbsCbs211128RequestIndicadorAceitacao(field("indicador_aceitacao")); }
 public IbsCbs211128Request setIndicadorAceitacao(IbsCbs211128RequestIndicadorAceitacao value) { put("indicador_aceitacao", value == null ? null : value.toJson()); return this; }
 public IbsCbs211128Details getInformacoesEvento() { return (field("informacoes_evento")).isNull() || (field("informacoes_evento")).isMissingNode() ? null : new IbsCbs211128Details(field("informacoes_evento")); }
 public IbsCbs211128Request setInformacoesEvento(IbsCbs211128Details value) { put("informacoes_evento", value == null ? null : value.toJson()); return this; }
}
