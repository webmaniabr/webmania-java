package com.webmania.sdk.model.api2monitormanagement;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/monitor-management.openapi.json; see contract-provenance.json. */
public final class MonitorDocumentNfseImpostosIbsCbsIbsEstadual extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("valor", "aliquota", "aliquota_efetiva", "aliquota_diferimento");
 public MonitorDocumentNfseImpostosIbsCbsIbsEstadual() { super(FIELDS); }
 public MonitorDocumentNfseImpostosIbsCbsIbsEstadual(JsonNode node) { super(node, FIELDS); }
 public java.math.BigDecimal getValor() { return decimalValue(field("valor")); }
 public MonitorDocumentNfseImpostosIbsCbsIbsEstadual setValor(java.math.BigDecimal value) { put("valor", Json.scalar(value)); return this; }
 public java.math.BigDecimal getAliquota() { return decimalValue(field("aliquota")); }
 public MonitorDocumentNfseImpostosIbsCbsIbsEstadual setAliquota(java.math.BigDecimal value) { put("aliquota", Json.scalar(value)); return this; }
 public java.math.BigDecimal getAliquotaEfetiva() { return decimalValue(field("aliquota_efetiva")); }
 public MonitorDocumentNfseImpostosIbsCbsIbsEstadual setAliquotaEfetiva(java.math.BigDecimal value) { put("aliquota_efetiva", Json.scalar(value)); return this; }
 public java.math.BigDecimal getAliquotaDiferimento() { return decimalValue(field("aliquota_diferimento")); }
 public MonitorDocumentNfseImpostosIbsCbsIbsEstadual setAliquotaDiferimento(java.math.BigDecimal value) { put("aliquota_diferimento", Json.scalar(value)); return this; }
}
