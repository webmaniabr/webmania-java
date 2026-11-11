package com.webmania.sdk.model.api1fiscal;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api1/fiscal.openapi.json; see contract-provenance.json. */
public final class NfePaymentEventCancelRequest extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("uuid", "url_notificacao");
 public NfePaymentEventCancelRequest() { super(FIELDS); }
 public NfePaymentEventCancelRequest(JsonNode node) { super(node, FIELDS); }
 public String getUuid() { return stringValue(field("uuid")); }
 public NfePaymentEventCancelRequest setUuid(String value) { put("uuid", Json.scalar(value)); return this; }
 public String getUrlNotificacao() { return stringValue(field("url_notificacao")); }
 public NfePaymentEventCancelRequest setUrlNotificacao(String value) { put("url_notificacao", Json.scalar(value)); return this; }
}
