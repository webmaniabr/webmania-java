package com.webmania.sdk.model.api2cteissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/cte-issuance.openapi.json; see contract-provenance.json. */
public final class EmitterLinkCtePaymentPayload extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("chave", "pagamento", "protocolo", "sequencia", "uuid");
 public EmitterLinkCtePaymentPayload() { super(FIELDS); }
 public EmitterLinkCtePaymentPayload(JsonNode node) { super(node, FIELDS); }
 public String getChave() { return stringValue(field("chave")); }
 public EmitterLinkCtePaymentPayload setChave(String value) { put("chave", Json.scalar(value)); return this; }
 public EmitterLinkCtePaymentPayloadPagamento getPagamento() { return (field("pagamento")).isNull() || (field("pagamento")).isMissingNode() ? null : new EmitterLinkCtePaymentPayloadPagamento(field("pagamento")); }
 public EmitterLinkCtePaymentPayload setPagamento(EmitterLinkCtePaymentPayloadPagamento value) { put("pagamento", value == null ? null : value.toJson()); return this; }
 public EmitterLinkCtePaymentPayloadProtocolo getProtocolo() { return (field("protocolo")).isNull() || (field("protocolo")).isMissingNode() ? null : new EmitterLinkCtePaymentPayloadProtocolo(field("protocolo")); }
 public EmitterLinkCtePaymentPayload setProtocolo(EmitterLinkCtePaymentPayloadProtocolo value) { put("protocolo", value == null ? null : value.toJson()); return this; }
 public EmitterLinkCtePaymentPayloadSequencia getSequencia() { return (field("sequencia")).isNull() || (field("sequencia")).isMissingNode() ? null : new EmitterLinkCtePaymentPayloadSequencia(field("sequencia")); }
 public EmitterLinkCtePaymentPayload setSequencia(EmitterLinkCtePaymentPayloadSequencia value) { put("sequencia", value == null ? null : value.toJson()); return this; }
 public String getUuid() { return stringValue(field("uuid")); }
 public EmitterLinkCtePaymentPayload setUuid(String value) { put("uuid", Json.scalar(value)); return this; }
}
