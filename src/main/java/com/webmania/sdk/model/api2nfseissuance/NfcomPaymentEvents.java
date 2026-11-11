package com.webmania.sdk.model.api2nfseissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/nfse-issuance.openapi.json; see contract-provenance.json. */
public final class NfcomPaymentEvents extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("uuid", "chave", "status", "eventos_pagamento", "total_eventos");
 public NfcomPaymentEvents() { super(FIELDS); }
 public NfcomPaymentEvents(JsonNode node) { super(node, FIELDS); }
 public String getUuid() { return stringValue(field("uuid")); }
 public NfcomPaymentEvents setUuid(String value) { put("uuid", Json.scalar(value)); return this; }
 public NfcomPaymentEventsChave getChave() { return (field("chave")).isNull() || (field("chave")).isMissingNode() ? null : new NfcomPaymentEventsChave(field("chave")); }
 public NfcomPaymentEvents setChave(NfcomPaymentEventsChave value) { put("chave", value == null ? null : value.toJson()); return this; }
 public String getStatus() { return stringValue(field("status")); }
 public NfcomPaymentEvents setStatus(String value) { put("status", Json.scalar(value)); return this; }
 public java.util.List<NfcomPaymentEvent> getEventosPagamento() { return list(field("eventos_pagamento"), v -> (v).isNull() || (v).isMissingNode() ? null : new NfcomPaymentEvent(v)); }
 public NfcomPaymentEvents setEventosPagamento(java.util.List<NfcomPaymentEvent> value) { put("eventos_pagamento", array(value, v -> v == null ? null : v.toJson())); return this; }
 public java.math.BigInteger getTotalEventos() { return integerValue(field("total_eventos")); }
 public NfcomPaymentEvents setTotalEventos(java.math.BigInteger value) { put("total_eventos", Json.scalar(value)); return this; }
}
