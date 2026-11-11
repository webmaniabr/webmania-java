package com.webmania.sdk.model.api2monitormanagement;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/monitor-management.openapi.json; see contract-provenance.json. */
public final class MonitorDocumentCteOsImpostosIbsCbsTributacaoRegularIbsEstadual extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("aliquota_efetiva", "valor");
 public MonitorDocumentCteOsImpostosIbsCbsTributacaoRegularIbsEstadual() { super(FIELDS); }
 public MonitorDocumentCteOsImpostosIbsCbsTributacaoRegularIbsEstadual(JsonNode node) { super(node, FIELDS); }
 public java.math.BigDecimal getAliquotaEfetiva() { return decimalValue(field("aliquota_efetiva")); }
 public MonitorDocumentCteOsImpostosIbsCbsTributacaoRegularIbsEstadual setAliquotaEfetiva(java.math.BigDecimal value) { put("aliquota_efetiva", Json.scalar(value)); return this; }
 public java.math.BigDecimal getValor() { return decimalValue(field("valor")); }
 public MonitorDocumentCteOsImpostosIbsCbsTributacaoRegularIbsEstadual setValor(java.math.BigDecimal value) { put("valor", Json.scalar(value)); return this; }
}
