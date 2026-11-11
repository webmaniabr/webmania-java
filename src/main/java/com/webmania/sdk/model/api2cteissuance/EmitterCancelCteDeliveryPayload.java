package com.webmania.sdk.model.api2cteissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/cte-issuance.openapi.json; see contract-provenance.json. */
public final class EmitterCancelCteDeliveryPayload extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("chave", "protocolo", "sequencia", "uuid");
 public EmitterCancelCteDeliveryPayload() { super(FIELDS); }
 public EmitterCancelCteDeliveryPayload(JsonNode node) { super(node, FIELDS); }
 public String getChave() { return stringValue(field("chave")); }
 public EmitterCancelCteDeliveryPayload setChave(String value) { put("chave", Json.scalar(value)); return this; }
 public String getProtocolo() { return stringValue(field("protocolo")); }
 public EmitterCancelCteDeliveryPayload setProtocolo(String value) { put("protocolo", Json.scalar(value)); return this; }
 public String getSequencia() { return stringValue(field("sequencia")); }
 public EmitterCancelCteDeliveryPayload setSequencia(String value) { put("sequencia", Json.scalar(value)); return this; }
 public String getUuid() { return stringValue(field("uuid")); }
 public EmitterCancelCteDeliveryPayload setUuid(String value) { put("uuid", Json.scalar(value)); return this; }
}
