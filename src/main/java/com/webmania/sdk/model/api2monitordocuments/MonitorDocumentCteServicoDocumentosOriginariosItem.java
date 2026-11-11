package com.webmania.sdk.model.api2monitordocuments;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/monitor-documents.openapi.json; see contract-provenance.json. */
public final class MonitorDocumentCteServicoDocumentosOriginariosItem extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("tipo", "chave", "serie", "numero", "data_emissao");
 public MonitorDocumentCteServicoDocumentosOriginariosItem() { super(FIELDS); }
 public MonitorDocumentCteServicoDocumentosOriginariosItem(JsonNode node) { super(node, FIELDS); }
 public String getTipo() { return stringValue(field("tipo")); }
 public MonitorDocumentCteServicoDocumentosOriginariosItem setTipo(String value) { put("tipo", Json.scalar(value)); return this; }
 public String getChave() { return stringValue(field("chave")); }
 public MonitorDocumentCteServicoDocumentosOriginariosItem setChave(String value) { put("chave", Json.scalar(value)); return this; }
 public String getSerie() { return stringValue(field("serie")); }
 public MonitorDocumentCteServicoDocumentosOriginariosItem setSerie(String value) { put("serie", Json.scalar(value)); return this; }
 public String getNumero() { return stringValue(field("numero")); }
 public MonitorDocumentCteServicoDocumentosOriginariosItem setNumero(String value) { put("numero", Json.scalar(value)); return this; }
 public String getDataEmissao() { return stringValue(field("data_emissao")); }
 public MonitorDocumentCteServicoDocumentosOriginariosItem setDataEmissao(String value) { put("data_emissao", Json.scalar(value)); return this; }
}
