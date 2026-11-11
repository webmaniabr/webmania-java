package com.webmania.sdk.model.api2monitormanagement;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/monitor-management.openapi.json; see contract-provenance.json. */
public final class MonitorDocumentNfeParcelasItem extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("valor", "numero", "vencimento");
 public MonitorDocumentNfeParcelasItem() { super(FIELDS); }
 public MonitorDocumentNfeParcelasItem(JsonNode node) { super(node, FIELDS); }
 public java.math.BigDecimal getValor() { return decimalValue(field("valor")); }
 public MonitorDocumentNfeParcelasItem setValor(java.math.BigDecimal value) { put("valor", Json.scalar(value)); return this; }
 public MonitorDocumentNfeParcelasItemNumero getNumero() { return (field("numero")).isNull() || (field("numero")).isMissingNode() ? null : new MonitorDocumentNfeParcelasItemNumero(field("numero")); }
 public MonitorDocumentNfeParcelasItem setNumero(MonitorDocumentNfeParcelasItemNumero value) { put("numero", value == null ? null : value.toJson()); return this; }
 public String getVencimento() { return stringValue(field("vencimento")); }
 public MonitorDocumentNfeParcelasItem setVencimento(String value) { put("vencimento", Json.scalar(value)); return this; }
}
