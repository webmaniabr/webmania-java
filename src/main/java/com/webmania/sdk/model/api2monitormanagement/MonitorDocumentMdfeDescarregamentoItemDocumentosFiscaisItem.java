package com.webmania.sdk.model.api2monitormanagement;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/monitor-management.openapi.json; see contract-provenance.json. */
public final class MonitorDocumentMdfeDescarregamentoItemDocumentosFiscaisItem extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("chave");
 public MonitorDocumentMdfeDescarregamentoItemDocumentosFiscaisItem() { super(FIELDS); }
 public MonitorDocumentMdfeDescarregamentoItemDocumentosFiscaisItem(JsonNode node) { super(node, FIELDS); }
 public String getChave() { return stringValue(field("chave")); }
 public MonitorDocumentMdfeDescarregamentoItemDocumentosFiscaisItem setChave(String value) { put("chave", Json.scalar(value)); return this; }
}
