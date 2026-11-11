package com.webmania.sdk.model.api1fiscal;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api1/fiscal.openapi.json; see contract-provenance.json. */
public final class G123 extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("chave", "uuid", "correcao", "ambiente", "evento", "url_notificacao");
 public G123() { super(FIELDS); }
 public G123(JsonNode node) { super(node, FIELDS); }
 public String getChave() { return stringValue(field("chave")); }
 public G123 setChave(String value) { put("chave", Json.scalar(value)); return this; }
 public String getUuid() { return stringValue(field("uuid")); }
 public G123 setUuid(String value) { put("uuid", Json.scalar(value)); return this; }
 public String getCorrecao() { return stringValue(field("correcao")); }
 public G123 setCorrecao(String value) { put("correcao", Json.scalar(value)); return this; }
 public java.math.BigInteger getAmbiente() { return integerValue(field("ambiente")); }
 public G123 setAmbiente(java.math.BigInteger value) { put("ambiente", Json.scalar(value)); return this; }
 public java.math.BigInteger getEvento() { return integerValue(field("evento")); }
 public G123 setEvento(java.math.BigInteger value) { put("evento", Json.scalar(value)); return this; }
 public String getUrlNotificacao() { return stringValue(field("url_notificacao")); }
 public G123 setUrlNotificacao(String value) { put("url_notificacao", Json.scalar(value)); return this; }
}
