package com.webmania.sdk.model.api2cteissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/cte-issuance.openapi.json; see contract-provenance.json. */
public final class CteDocumentedGroup5835 extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("uuid", "sequencia");
 public CteDocumentedGroup5835() { super(FIELDS); }
 public CteDocumentedGroup5835(JsonNode node) { super(node, FIELDS); }
 public String getUuid() { return stringValue(field("uuid")); }
 public CteDocumentedGroup5835 setUuid(String value) { put("uuid", Json.scalar(value)); return this; }
 public String getSequencia() { return stringValue(field("sequencia")); }
 public CteDocumentedGroup5835 setSequencia(String value) { put("sequencia", Json.scalar(value)); return this; }
}
