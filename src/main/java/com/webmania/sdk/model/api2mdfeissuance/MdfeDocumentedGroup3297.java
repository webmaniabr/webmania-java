package com.webmania.sdk.model.api2mdfeissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/mdfe-issuance.openapi.json; see contract-provenance.json. */
public final class MdfeDocumentedGroup3297 extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("uuid", "justificativa");
 public MdfeDocumentedGroup3297() { super(FIELDS); }
 public MdfeDocumentedGroup3297(JsonNode node) { super(node, FIELDS); }
 public String getUuid() { return stringValue(field("uuid")); }
 public MdfeDocumentedGroup3297 setUuid(String value) { put("uuid", Json.scalar(value)); return this; }
 public String getJustificativa() { return stringValue(field("justificativa")); }
 public MdfeDocumentedGroup3297 setJustificativa(String value) { put("justificativa", Json.scalar(value)); return this; }
}
