package com.webmania.sdk.model.api2monitordocuments;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/monitor-documents.openapi.json; see contract-provenance.json. */
public final class MonitorDocumentNfeProdutosItemImpostosIbsCbsEstornoCredito extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("valor_ibs", "valor_cbs");
 public MonitorDocumentNfeProdutosItemImpostosIbsCbsEstornoCredito() { super(FIELDS); }
 public MonitorDocumentNfeProdutosItemImpostosIbsCbsEstornoCredito(JsonNode node) { super(node, FIELDS); }
 public java.math.BigDecimal getValorIbs() { return decimalValue(field("valor_ibs")); }
 public MonitorDocumentNfeProdutosItemImpostosIbsCbsEstornoCredito setValorIbs(java.math.BigDecimal value) { put("valor_ibs", Json.scalar(value)); return this; }
 public java.math.BigDecimal getValorCbs() { return decimalValue(field("valor_cbs")); }
 public MonitorDocumentNfeProdutosItemImpostosIbsCbsEstornoCredito setValorCbs(java.math.BigDecimal value) { put("valor_cbs", Json.scalar(value)); return this; }
}
