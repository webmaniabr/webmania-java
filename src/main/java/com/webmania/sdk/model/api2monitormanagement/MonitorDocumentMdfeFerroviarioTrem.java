package com.webmania.sdk.model.api2monitormanagement;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/monitor-management.openapi.json; see contract-provenance.json. */
public final class MonitorDocumentMdfeFerroviarioTrem extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("prefixo", "data_liberacao", "origem", "destino");
 public MonitorDocumentMdfeFerroviarioTrem() { super(FIELDS); }
 public MonitorDocumentMdfeFerroviarioTrem(JsonNode node) { super(node, FIELDS); }
 public String getPrefixo() { return stringValue(field("prefixo")); }
 public MonitorDocumentMdfeFerroviarioTrem setPrefixo(String value) { put("prefixo", Json.scalar(value)); return this; }
 public String getDataLiberacao() { return stringValue(field("data_liberacao")); }
 public MonitorDocumentMdfeFerroviarioTrem setDataLiberacao(String value) { put("data_liberacao", Json.scalar(value)); return this; }
 public String getOrigem() { return stringValue(field("origem")); }
 public MonitorDocumentMdfeFerroviarioTrem setOrigem(String value) { put("origem", Json.scalar(value)); return this; }
 public String getDestino() { return stringValue(field("destino")); }
 public MonitorDocumentMdfeFerroviarioTrem setDestino(String value) { put("destino", Json.scalar(value)); return this; }
}
