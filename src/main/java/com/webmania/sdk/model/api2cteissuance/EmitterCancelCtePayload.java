package com.webmania.sdk.model.api2cteissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/cte-issuance.openapi.json; see contract-provenance.json. */
public final class EmitterCancelCtePayload extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("chave", "justificativa", "uuid");
 public EmitterCancelCtePayload() { super(FIELDS); }
 public EmitterCancelCtePayload(JsonNode node) { super(node, FIELDS); }
 public String getChave() { return stringValue(field("chave")); }
 public EmitterCancelCtePayload setChave(String value) { put("chave", Json.scalar(value)); return this; }
 public String getJustificativa() { return stringValue(field("justificativa")); }
 public EmitterCancelCtePayload setJustificativa(String value) { put("justificativa", Json.scalar(value)); return this; }
 public String getUuid() { return stringValue(field("uuid")); }
 public EmitterCancelCtePayload setUuid(String value) { put("uuid", Json.scalar(value)); return this; }
}
