package com.webmania.sdk.model.api2monitormanagement;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/monitor-management.openapi.json; see contract-provenance.json. */
public final class MonitorDocumentCteOsImpostosIbsCbsCompraGovernamentalCbs extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("aliquota", "valor");
 public MonitorDocumentCteOsImpostosIbsCbsCompraGovernamentalCbs() { super(FIELDS); }
 public MonitorDocumentCteOsImpostosIbsCbsCompraGovernamentalCbs(JsonNode node) { super(node, FIELDS); }
 public java.math.BigDecimal getAliquota() { return decimalValue(field("aliquota")); }
 public MonitorDocumentCteOsImpostosIbsCbsCompraGovernamentalCbs setAliquota(java.math.BigDecimal value) { put("aliquota", Json.scalar(value)); return this; }
 public java.math.BigDecimal getValor() { return decimalValue(field("valor")); }
 public MonitorDocumentCteOsImpostosIbsCbsCompraGovernamentalCbs setValor(java.math.BigDecimal value) { put("valor", Json.scalar(value)); return this; }
}
