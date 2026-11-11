package com.webmania.sdk.model.api2cteissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/cte-issuance.openapi.json; see contract-provenance.json. */
public final class CtePaymentEvents extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("uuid", "chave", "status", "eventos_pagamento", "total_eventos");
 public CtePaymentEvents() { super(FIELDS); }
 public CtePaymentEvents(JsonNode node) { super(node, FIELDS); }
 public String getUuid() { return stringValue(field("uuid")); }
 public CtePaymentEvents setUuid(String value) { put("uuid", Json.scalar(value)); return this; }
 public String getChave() { return stringValue(field("chave")); }
 public CtePaymentEvents setChave(String value) { put("chave", Json.scalar(value)); return this; }
 public String getStatus() { return stringValue(field("status")); }
 public CtePaymentEvents setStatus(String value) { put("status", Json.scalar(value)); return this; }
 public java.util.List<CtePaymentEventsEventosPagamentoItem> getEventosPagamento() { return list(field("eventos_pagamento"), v -> (v).isNull() || (v).isMissingNode() ? null : new CtePaymentEventsEventosPagamentoItem(v)); }
 public CtePaymentEvents setEventosPagamento(java.util.List<CtePaymentEventsEventosPagamentoItem> value) { put("eventos_pagamento", array(value, v -> v == null ? null : v.toJson())); return this; }
 public java.math.BigInteger getTotalEventos() { return integerValue(field("total_eventos")); }
 public CtePaymentEvents setTotalEventos(java.math.BigInteger value) { put("total_eventos", Json.scalar(value)); return this; }
}
