package com.webmania.sdk.model.api2nfcomissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/nfcom-issuance.openapi.json; see contract-provenance.json. */
public final class NfcomDocumentedGroup2382 extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("chave", "justificativa");
 public NfcomDocumentedGroup2382() { super(FIELDS); }
 public NfcomDocumentedGroup2382(JsonNode node) { super(node, FIELDS); }
 public String getChave() { return stringValue(field("chave")); }
 public NfcomDocumentedGroup2382 setChave(String value) { put("chave", Json.scalar(value)); return this; }
 public String getJustificativa() { return stringValue(field("justificativa")); }
 public NfcomDocumentedGroup2382 setJustificativa(String value) { put("justificativa", Json.scalar(value)); return this; }
}
