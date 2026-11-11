package com.webmania.sdk.model.api2nfcomissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/nfcom-issuance.openapi.json; see contract-provenance.json. */
public final class EmitterCancelNfcomPayload extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("chave", "justificativa");
 public EmitterCancelNfcomPayload() { super(FIELDS); }
 public EmitterCancelNfcomPayload(JsonNode node) { super(node, FIELDS); }
 public String getChave() { return stringValue(field("chave")); }
 public EmitterCancelNfcomPayload setChave(String value) { put("chave", Json.scalar(value)); return this; }
 public String getJustificativa() { return stringValue(field("justificativa")); }
 public EmitterCancelNfcomPayload setJustificativa(String value) { put("justificativa", Json.scalar(value)); return this; }
}
