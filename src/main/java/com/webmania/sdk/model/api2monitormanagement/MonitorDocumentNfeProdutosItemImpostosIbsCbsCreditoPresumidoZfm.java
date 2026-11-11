package com.webmania.sdk.model.api2monitormanagement;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/monitor-management.openapi.json; see contract-provenance.json. */
public final class MonitorDocumentNfeProdutosItemImpostosIbsCbsCreditoPresumidoZfm extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("competencia_apuracao", "classificacao", "valor_ibs");
 public MonitorDocumentNfeProdutosItemImpostosIbsCbsCreditoPresumidoZfm() { super(FIELDS); }
 public MonitorDocumentNfeProdutosItemImpostosIbsCbsCreditoPresumidoZfm(JsonNode node) { super(node, FIELDS); }
 public String getCompetenciaApuracao() { return stringValue(field("competencia_apuracao")); }
 public MonitorDocumentNfeProdutosItemImpostosIbsCbsCreditoPresumidoZfm setCompetenciaApuracao(String value) { put("competencia_apuracao", Json.scalar(value)); return this; }
 public String getClassificacao() { return stringValue(field("classificacao")); }
 public MonitorDocumentNfeProdutosItemImpostosIbsCbsCreditoPresumidoZfm setClassificacao(String value) { put("classificacao", Json.scalar(value)); return this; }
 public java.math.BigDecimal getValorIbs() { return decimalValue(field("valor_ibs")); }
 public MonitorDocumentNfeProdutosItemImpostosIbsCbsCreditoPresumidoZfm setValorIbs(java.math.BigDecimal value) { put("valor_ibs", Json.scalar(value)); return this; }
}
