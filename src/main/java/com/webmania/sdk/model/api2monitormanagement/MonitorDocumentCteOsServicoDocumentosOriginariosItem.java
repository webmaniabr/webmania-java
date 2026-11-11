package com.webmania.sdk.model.api2monitormanagement;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/monitor-management.openapi.json; see contract-provenance.json. */
public final class MonitorDocumentCteOsServicoDocumentosOriginariosItem extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("tipo", "chave", "serie", "numero", "data_emissao");
 public MonitorDocumentCteOsServicoDocumentosOriginariosItem() { super(FIELDS); }
 public MonitorDocumentCteOsServicoDocumentosOriginariosItem(JsonNode node) { super(node, FIELDS); }
 public String getTipo() { return stringValue(field("tipo")); }
 public MonitorDocumentCteOsServicoDocumentosOriginariosItem setTipo(String value) { put("tipo", Json.scalar(value)); return this; }
 public String getChave() { return stringValue(field("chave")); }
 public MonitorDocumentCteOsServicoDocumentosOriginariosItem setChave(String value) { put("chave", Json.scalar(value)); return this; }
 public String getSerie() { return stringValue(field("serie")); }
 public MonitorDocumentCteOsServicoDocumentosOriginariosItem setSerie(String value) { put("serie", Json.scalar(value)); return this; }
 public String getNumero() { return stringValue(field("numero")); }
 public MonitorDocumentCteOsServicoDocumentosOriginariosItem setNumero(String value) { put("numero", Json.scalar(value)); return this; }
 public String getDataEmissao() { return stringValue(field("data_emissao")); }
 public MonitorDocumentCteOsServicoDocumentosOriginariosItem setDataEmissao(String value) { put("data_emissao", Json.scalar(value)); return this; }
}
