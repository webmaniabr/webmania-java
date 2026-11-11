package com.webmania.sdk.model.api1fiscal;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api1/fiscal.openapi.json; see contract-provenance.json. */
public final class NfeIbsCbsEventCancelRequest extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("uuid", "ambiente", "url_notificacao");
 public NfeIbsCbsEventCancelRequest() { super(FIELDS); }
 public NfeIbsCbsEventCancelRequest(JsonNode node) { super(node, FIELDS); }
 public String getUuid() { return stringValue(field("uuid")); }
 public NfeIbsCbsEventCancelRequest setUuid(String value) { put("uuid", Json.scalar(value)); return this; }
 public Environment getAmbiente() { return (field("ambiente")).isNull() || (field("ambiente")).isMissingNode() ? null : new Environment(field("ambiente")); }
 public NfeIbsCbsEventCancelRequest setAmbiente(Environment value) { put("ambiente", value == null ? null : value.toJson()); return this; }
 public String getUrlNotificacao() { return stringValue(field("url_notificacao")); }
 public NfeIbsCbsEventCancelRequest setUrlNotificacao(String value) { put("url_notificacao", Json.scalar(value)); return this; }
}
