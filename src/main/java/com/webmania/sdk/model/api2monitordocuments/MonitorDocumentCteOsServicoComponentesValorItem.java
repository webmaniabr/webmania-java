package com.webmania.sdk.model.api2monitordocuments;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/monitor-documents.openapi.json; see contract-provenance.json. */
public final class MonitorDocumentCteOsServicoComponentesValorItem extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("nome", "valor");
 public MonitorDocumentCteOsServicoComponentesValorItem() { super(FIELDS); }
 public MonitorDocumentCteOsServicoComponentesValorItem(JsonNode node) { super(node, FIELDS); }
 public String getNome() { return stringValue(field("nome")); }
 public MonitorDocumentCteOsServicoComponentesValorItem setNome(String value) { put("nome", Json.scalar(value)); return this; }
 public java.math.BigDecimal getValor() { return decimalValue(field("valor")); }
 public MonitorDocumentCteOsServicoComponentesValorItem setValor(java.math.BigDecimal value) { put("valor", Json.scalar(value)); return this; }
}
