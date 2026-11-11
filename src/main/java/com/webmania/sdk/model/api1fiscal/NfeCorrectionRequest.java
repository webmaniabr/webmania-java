package com.webmania.sdk.model.api1fiscal;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api1/fiscal.openapi.json; see contract-provenance.json. */
public final class NfeCorrectionRequest extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("chave", "uuid", "correcao", "ambiente", "evento", "url_notificacao");
 public NfeCorrectionRequest() { super(FIELDS); }
 public NfeCorrectionRequest(JsonNode node) { super(node, FIELDS); }
 public AccessKey getChave() { return (field("chave")).isNull() || (field("chave")).isMissingNode() ? null : new AccessKey(field("chave")); }
 public NfeCorrectionRequest setChave(AccessKey value) { put("chave", value == null ? null : value.toJson()); return this; }
 public Uuid getUuid() { return (field("uuid")).isNull() || (field("uuid")).isMissingNode() ? null : new Uuid(field("uuid")); }
 public NfeCorrectionRequest setUuid(Uuid value) { put("uuid", value == null ? null : value.toJson()); return this; }
 public String getCorrecao() { return stringValue(field("correcao")); }
 public NfeCorrectionRequest setCorrecao(String value) { put("correcao", Json.scalar(value)); return this; }
 public Environment getAmbiente() { return (field("ambiente")).isNull() || (field("ambiente")).isMissingNode() ? null : new Environment(field("ambiente")); }
 public NfeCorrectionRequest setAmbiente(Environment value) { put("ambiente", value == null ? null : value.toJson()); return this; }
 public java.math.BigInteger getEvento() { return integerValue(field("evento")); }
 public NfeCorrectionRequest setEvento(java.math.BigInteger value) { put("evento", Json.scalar(value)); return this; }
 public String getUrlNotificacao() { return stringValue(field("url_notificacao")); }
 public NfeCorrectionRequest setUrlNotificacao(String value) { put("url_notificacao", Json.scalar(value)); return this; }
}
