package com.webmania.sdk.model.api2monitormanagement;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/monitor-management.openapi.json; see contract-provenance.json. */
public final class MonitorDocumentMdfeRodoviarioLacresItem extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("numero");
 public MonitorDocumentMdfeRodoviarioLacresItem() { super(FIELDS); }
 public MonitorDocumentMdfeRodoviarioLacresItem(JsonNode node) { super(node, FIELDS); }
 public String getNumero() { return stringValue(field("numero")); }
 public MonitorDocumentMdfeRodoviarioLacresItem setNumero(String value) { put("numero", Json.scalar(value)); return this; }
}
