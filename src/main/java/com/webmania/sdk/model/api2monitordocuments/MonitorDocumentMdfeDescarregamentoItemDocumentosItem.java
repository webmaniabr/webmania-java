package com.webmania.sdk.model.api2monitordocuments;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/monitor-documents.openapi.json; see contract-provenance.json. */
public final class MonitorDocumentMdfeDescarregamentoItemDocumentosItem extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("tipo", "chave");
 public MonitorDocumentMdfeDescarregamentoItemDocumentosItem() { super(FIELDS); }
 public MonitorDocumentMdfeDescarregamentoItemDocumentosItem(JsonNode node) { super(node, FIELDS); }
 public String getTipo() { return stringValue(field("tipo")); }
 public MonitorDocumentMdfeDescarregamentoItemDocumentosItem setTipo(String value) { put("tipo", Json.scalar(value)); return this; }
 public String getChave() { return stringValue(field("chave")); }
 public MonitorDocumentMdfeDescarregamentoItemDocumentosItem setChave(String value) { put("chave", Json.scalar(value)); return this; }
}
