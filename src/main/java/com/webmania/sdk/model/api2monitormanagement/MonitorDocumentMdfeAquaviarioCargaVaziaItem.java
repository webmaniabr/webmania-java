package com.webmania.sdk.model.api2monitormanagement;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/monitor-management.openapi.json; see contract-provenance.json. */
public final class MonitorDocumentMdfeAquaviarioCargaVaziaItem extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("identificador", "tipo_unidade");
 public MonitorDocumentMdfeAquaviarioCargaVaziaItem() { super(FIELDS); }
 public MonitorDocumentMdfeAquaviarioCargaVaziaItem(JsonNode node) { super(node, FIELDS); }
 public String getIdentificador() { return stringValue(field("identificador")); }
 public MonitorDocumentMdfeAquaviarioCargaVaziaItem setIdentificador(String value) { put("identificador", Json.scalar(value)); return this; }
 public java.math.BigDecimal getTipoUnidade() { return decimalValue(field("tipo_unidade")); }
 public MonitorDocumentMdfeAquaviarioCargaVaziaItem setTipoUnidade(java.math.BigDecimal value) { put("tipo_unidade", Json.scalar(value)); return this; }
}
