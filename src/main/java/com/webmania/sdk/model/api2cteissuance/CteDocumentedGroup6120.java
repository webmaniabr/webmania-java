package com.webmania.sdk.model.api2cteissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/cte-issuance.openapi.json; see contract-provenance.json. */
public final class CteDocumentedGroup6120 extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("uuid", "protocolo", "protocolo_vinculacao", "sequencia");
 public CteDocumentedGroup6120() { super(FIELDS); }
 public CteDocumentedGroup6120(JsonNode node) { super(node, FIELDS); }
 public String getUuid() { return stringValue(field("uuid")); }
 public CteDocumentedGroup6120 setUuid(String value) { put("uuid", Json.scalar(value)); return this; }
 public String getProtocolo() { return stringValue(field("protocolo")); }
 public CteDocumentedGroup6120 setProtocolo(String value) { put("protocolo", Json.scalar(value)); return this; }
 public String getProtocoloVinculacao() { return stringValue(field("protocolo_vinculacao")); }
 public CteDocumentedGroup6120 setProtocoloVinculacao(String value) { put("protocolo_vinculacao", Json.scalar(value)); return this; }
 public CteDocumentedGroup6120Sequencia getSequencia() { return (field("sequencia")).isNull() || (field("sequencia")).isMissingNode() ? null : new CteDocumentedGroup6120Sequencia(field("sequencia")); }
 public CteDocumentedGroup6120 setSequencia(CteDocumentedGroup6120Sequencia value) { put("sequencia", value == null ? null : value.toJson()); return this; }
}
