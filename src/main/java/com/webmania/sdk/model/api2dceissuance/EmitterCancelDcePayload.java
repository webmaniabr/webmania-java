package com.webmania.sdk.model.api2dceissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/dce-issuance.openapi.json; see contract-provenance.json. */
public final class EmitterCancelDcePayload extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("chave", "justificativa", "uuid");
 public EmitterCancelDcePayload() { super(FIELDS); }
 public EmitterCancelDcePayload(JsonNode node) { super(node, FIELDS); }
 public String getChave() { return stringValue(field("chave")); }
 public EmitterCancelDcePayload setChave(String value) { put("chave", Json.scalar(value)); return this; }
 public String getJustificativa() { return stringValue(field("justificativa")); }
 public EmitterCancelDcePayload setJustificativa(String value) { put("justificativa", Json.scalar(value)); return this; }
 public String getUuid() { return stringValue(field("uuid")); }
 public EmitterCancelDcePayload setUuid(String value) { put("uuid", Json.scalar(value)); return this; }
}
