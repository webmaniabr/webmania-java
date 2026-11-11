package com.webmania.sdk.model.api2monitormanagement;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/monitor-management.openapi.json; see contract-provenance.json. */
public final class MonitorDocumentCteImpostosIbsCbsCompraGovernamentalIbsMunicipal extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("aliquota", "valor");
 public MonitorDocumentCteImpostosIbsCbsCompraGovernamentalIbsMunicipal() { super(FIELDS); }
 public MonitorDocumentCteImpostosIbsCbsCompraGovernamentalIbsMunicipal(JsonNode node) { super(node, FIELDS); }
 public java.math.BigDecimal getAliquota() { return decimalValue(field("aliquota")); }
 public MonitorDocumentCteImpostosIbsCbsCompraGovernamentalIbsMunicipal setAliquota(java.math.BigDecimal value) { put("aliquota", Json.scalar(value)); return this; }
 public java.math.BigDecimal getValor() { return decimalValue(field("valor")); }
 public MonitorDocumentCteImpostosIbsCbsCompraGovernamentalIbsMunicipal setValor(java.math.BigDecimal value) { put("valor", Json.scalar(value)); return this; }
}
