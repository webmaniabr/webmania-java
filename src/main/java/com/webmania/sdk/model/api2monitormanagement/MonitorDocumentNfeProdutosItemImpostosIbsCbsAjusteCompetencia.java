package com.webmania.sdk.model.api2monitormanagement;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/monitor-management.openapi.json; see contract-provenance.json. */
public final class MonitorDocumentNfeProdutosItemImpostosIbsCbsAjusteCompetencia extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("competencia_apuracao", "valor_ibs", "valor_cbs");
 public MonitorDocumentNfeProdutosItemImpostosIbsCbsAjusteCompetencia() { super(FIELDS); }
 public MonitorDocumentNfeProdutosItemImpostosIbsCbsAjusteCompetencia(JsonNode node) { super(node, FIELDS); }
 public String getCompetenciaApuracao() { return stringValue(field("competencia_apuracao")); }
 public MonitorDocumentNfeProdutosItemImpostosIbsCbsAjusteCompetencia setCompetenciaApuracao(String value) { put("competencia_apuracao", Json.scalar(value)); return this; }
 public java.math.BigDecimal getValorIbs() { return decimalValue(field("valor_ibs")); }
 public MonitorDocumentNfeProdutosItemImpostosIbsCbsAjusteCompetencia setValorIbs(java.math.BigDecimal value) { put("valor_ibs", Json.scalar(value)); return this; }
 public java.math.BigDecimal getValorCbs() { return decimalValue(field("valor_cbs")); }
 public MonitorDocumentNfeProdutosItemImpostosIbsCbsAjusteCompetencia setValorCbs(java.math.BigDecimal value) { put("valor_cbs", Json.scalar(value)); return this; }
}
