package com.webmania.sdk.model.api2monitordocuments;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/monitor-documents.openapi.json; see contract-provenance.json. */
public final class MonitorDocumentMdfeCarregamentoItemDocumentosItem extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("tipo", "chave");
 public MonitorDocumentMdfeCarregamentoItemDocumentosItem() { super(FIELDS); }
 public MonitorDocumentMdfeCarregamentoItemDocumentosItem(JsonNode node) { super(node, FIELDS); }
 public String getTipo() { return stringValue(field("tipo")); }
 public MonitorDocumentMdfeCarregamentoItemDocumentosItem setTipo(String value) { put("tipo", Json.scalar(value)); return this; }
 public String getChave() { return stringValue(field("chave")); }
 public MonitorDocumentMdfeCarregamentoItemDocumentosItem setChave(String value) { put("chave", Json.scalar(value)); return this; }
}
