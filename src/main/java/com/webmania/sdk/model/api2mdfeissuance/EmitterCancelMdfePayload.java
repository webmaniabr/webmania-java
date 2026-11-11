package com.webmania.sdk.model.api2mdfeissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/mdfe-issuance.openapi.json; see contract-provenance.json. */
public final class EmitterCancelMdfePayload extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("chave", "justificativa", "uuid");
 public EmitterCancelMdfePayload() { super(FIELDS); }
 public EmitterCancelMdfePayload(JsonNode node) { super(node, FIELDS); }
 public String getChave() { return stringValue(field("chave")); }
 public EmitterCancelMdfePayload setChave(String value) { put("chave", Json.scalar(value)); return this; }
 public String getJustificativa() { return stringValue(field("justificativa")); }
 public EmitterCancelMdfePayload setJustificativa(String value) { put("justificativa", Json.scalar(value)); return this; }
 public String getUuid() { return stringValue(field("uuid")); }
 public EmitterCancelMdfePayload setUuid(String value) { put("uuid", Json.scalar(value)); return this; }
}
