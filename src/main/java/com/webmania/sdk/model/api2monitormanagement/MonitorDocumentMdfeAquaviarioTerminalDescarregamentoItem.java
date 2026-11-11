package com.webmania.sdk.model.api2monitormanagement;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/monitor-management.openapi.json; see contract-provenance.json. */
public final class MonitorDocumentMdfeAquaviarioTerminalDescarregamentoItem extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("codigo", "nome");
 public MonitorDocumentMdfeAquaviarioTerminalDescarregamentoItem() { super(FIELDS); }
 public MonitorDocumentMdfeAquaviarioTerminalDescarregamentoItem(JsonNode node) { super(node, FIELDS); }
 public String getCodigo() { return stringValue(field("codigo")); }
 public MonitorDocumentMdfeAquaviarioTerminalDescarregamentoItem setCodigo(String value) { put("codigo", Json.scalar(value)); return this; }
 public String getNome() { return stringValue(field("nome")); }
 public MonitorDocumentMdfeAquaviarioTerminalDescarregamentoItem setNome(String value) { put("nome", Json.scalar(value)); return this; }
}
