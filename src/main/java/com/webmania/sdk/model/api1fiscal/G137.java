package com.webmania.sdk.model.api1fiscal;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api1/fiscal.openapi.json; see contract-provenance.json. */
public final class G137 extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("uuid", "ambiente", "url_notificacao");
 public G137() { super(FIELDS); }
 public G137(JsonNode node) { super(node, FIELDS); }
 public String getUuid() { return stringValue(field("uuid")); }
 public G137 setUuid(String value) { put("uuid", Json.scalar(value)); return this; }
 public java.math.BigInteger getAmbiente() { return integerValue(field("ambiente")); }
 public G137 setAmbiente(java.math.BigInteger value) { put("ambiente", Json.scalar(value)); return this; }
 public String getUrlNotificacao() { return stringValue(field("url_notificacao")); }
 public G137 setUrlNotificacao(String value) { put("url_notificacao", Json.scalar(value)); return this; }
}
