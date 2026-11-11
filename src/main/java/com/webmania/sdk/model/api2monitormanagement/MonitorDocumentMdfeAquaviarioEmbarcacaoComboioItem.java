package com.webmania.sdk.model.api2monitormanagement;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/monitor-management.openapi.json; see contract-provenance.json. */
public final class MonitorDocumentMdfeAquaviarioEmbarcacaoComboioItem extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("codigo", "identificador_balsa");
 public MonitorDocumentMdfeAquaviarioEmbarcacaoComboioItem() { super(FIELDS); }
 public MonitorDocumentMdfeAquaviarioEmbarcacaoComboioItem(JsonNode node) { super(node, FIELDS); }
 public String getCodigo() { return stringValue(field("codigo")); }
 public MonitorDocumentMdfeAquaviarioEmbarcacaoComboioItem setCodigo(String value) { put("codigo", Json.scalar(value)); return this; }
 public String getIdentificadorBalsa() { return stringValue(field("identificador_balsa")); }
 public MonitorDocumentMdfeAquaviarioEmbarcacaoComboioItem setIdentificadorBalsa(String value) { put("identificador_balsa", Json.scalar(value)); return this; }
}
