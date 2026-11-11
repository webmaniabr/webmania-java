package com.webmania.sdk.model.api2monitormanagement;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/monitor-management.openapi.json; see contract-provenance.json. */
public final class MonitorDocumentNfeTotaisIbsCbsCbs extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("valor");
 public MonitorDocumentNfeTotaisIbsCbsCbs() { super(FIELDS); }
 public MonitorDocumentNfeTotaisIbsCbsCbs(JsonNode node) { super(node, FIELDS); }
 public MonitorDocumentNfeTotaisIbsCbsCbsValor getValor() { return (field("valor")).isNull() || (field("valor")).isMissingNode() ? null : new MonitorDocumentNfeTotaisIbsCbsCbsValor(field("valor")); }
 public MonitorDocumentNfeTotaisIbsCbsCbs setValor(MonitorDocumentNfeTotaisIbsCbsCbsValor value) { put("valor", value == null ? null : value.toJson()); return this; }
}
