package com.webmania.sdk.model.api2dceissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/dce-issuance.openapi.json; see contract-provenance.json. */
public final class DceDocumentedGroup1106 extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("uuid", "chave", "justificativa");
 public DceDocumentedGroup1106() { super(FIELDS); }
 public DceDocumentedGroup1106(JsonNode node) { super(node, FIELDS); }
 public String getUuid() { return stringValue(field("uuid")); }
 public DceDocumentedGroup1106 setUuid(String value) { put("uuid", Json.scalar(value)); return this; }
 public String getChave() { return stringValue(field("chave")); }
 public DceDocumentedGroup1106 setChave(String value) { put("chave", Json.scalar(value)); return this; }
 public String getJustificativa() { return stringValue(field("justificativa")); }
 public DceDocumentedGroup1106 setJustificativa(String value) { put("justificativa", Json.scalar(value)); return this; }
}
