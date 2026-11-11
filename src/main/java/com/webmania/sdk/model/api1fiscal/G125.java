package com.webmania.sdk.model.api1fiscal;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api1/fiscal.openapi.json; see contract-provenance.json. */
public final class G125 extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("chave", "ambiente", "cod_evento", "evento", "url_notificacao");
 public G125() { super(FIELDS); }
 public G125(JsonNode node) { super(node, FIELDS); }
 public String getChave() { return stringValue(field("chave")); }
 public G125 setChave(String value) { put("chave", Json.scalar(value)); return this; }
 public java.math.BigInteger getAmbiente() { return integerValue(field("ambiente")); }
 public G125 setAmbiente(java.math.BigInteger value) { put("ambiente", Json.scalar(value)); return this; }
 public String getCodEvento() { return stringValue(field("cod_evento")); }
 public G125 setCodEvento(String value) { put("cod_evento", Json.scalar(value)); return this; }
 public java.math.BigInteger getEvento() { return integerValue(field("evento")); }
 public G125 setEvento(java.math.BigInteger value) { put("evento", Json.scalar(value)); return this; }
 public String getUrlNotificacao() { return stringValue(field("url_notificacao")); }
 public G125 setUrlNotificacao(String value) { put("url_notificacao", Json.scalar(value)); return this; }
}
