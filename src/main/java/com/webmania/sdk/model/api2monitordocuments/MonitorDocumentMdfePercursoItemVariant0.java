package com.webmania.sdk.model.api2monitordocuments;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/monitor-documents.openapi.json; see contract-provenance.json. */
public final class MonitorDocumentMdfePercursoItemVariant0 extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("uf", "ordem");
 public MonitorDocumentMdfePercursoItemVariant0() { super(FIELDS); }
 public MonitorDocumentMdfePercursoItemVariant0(JsonNode node) { super(node, FIELDS); }
 public String getUf() { return stringValue(field("uf")); }
 public MonitorDocumentMdfePercursoItemVariant0 setUf(String value) { put("uf", Json.scalar(value)); return this; }
 public java.math.BigDecimal getOrdem() { return decimalValue(field("ordem")); }
 public MonitorDocumentMdfePercursoItemVariant0 setOrdem(java.math.BigDecimal value) { put("ordem", Json.scalar(value)); return this; }
}
