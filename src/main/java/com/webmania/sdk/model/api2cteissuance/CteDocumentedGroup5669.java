package com.webmania.sdk.model.api2cteissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/cte-issuance.openapi.json; see contract-provenance.json. */
public final class CteDocumentedGroup5669 extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("uuid", "justificativa");
 public CteDocumentedGroup5669() { super(FIELDS); }
 public CteDocumentedGroup5669(JsonNode node) { super(node, FIELDS); }
 public String getUuid() { return stringValue(field("uuid")); }
 public CteDocumentedGroup5669 setUuid(String value) { put("uuid", Json.scalar(value)); return this; }
 public String getJustificativa() { return stringValue(field("justificativa")); }
 public CteDocumentedGroup5669 setJustificativa(String value) { put("justificativa", Json.scalar(value)); return this; }
}
