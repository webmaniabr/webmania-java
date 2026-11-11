package com.webmania.sdk.model.api2monitordocuments;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/monitor-documents.openapi.json; see contract-provenance.json. */
public final class MonitorDocumentCteOsImpostosIbsCbsCreditoPresumido extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("classificacao", "aliquota_ibs", "valor_ibs", "valor_ibs_condicionado_suspensao", "aliquota_cbs", "valor_cbs", "valor_cbs_condicionado_suspensao");
 public MonitorDocumentCteOsImpostosIbsCbsCreditoPresumido() { super(FIELDS); }
 public MonitorDocumentCteOsImpostosIbsCbsCreditoPresumido(JsonNode node) { super(node, FIELDS); }
 public String getClassificacao() { return stringValue(field("classificacao")); }
 public MonitorDocumentCteOsImpostosIbsCbsCreditoPresumido setClassificacao(String value) { put("classificacao", Json.scalar(value)); return this; }
 public java.math.BigDecimal getAliquotaIbs() { return decimalValue(field("aliquota_ibs")); }
 public MonitorDocumentCteOsImpostosIbsCbsCreditoPresumido setAliquotaIbs(java.math.BigDecimal value) { put("aliquota_ibs", Json.scalar(value)); return this; }
 public java.math.BigDecimal getValorIbs() { return decimalValue(field("valor_ibs")); }
 public MonitorDocumentCteOsImpostosIbsCbsCreditoPresumido setValorIbs(java.math.BigDecimal value) { put("valor_ibs", Json.scalar(value)); return this; }
 public java.math.BigDecimal getValorIbsCondicionadoSuspensao() { return decimalValue(field("valor_ibs_condicionado_suspensao")); }
 public MonitorDocumentCteOsImpostosIbsCbsCreditoPresumido setValorIbsCondicionadoSuspensao(java.math.BigDecimal value) { put("valor_ibs_condicionado_suspensao", Json.scalar(value)); return this; }
 public java.math.BigDecimal getAliquotaCbs() { return decimalValue(field("aliquota_cbs")); }
 public MonitorDocumentCteOsImpostosIbsCbsCreditoPresumido setAliquotaCbs(java.math.BigDecimal value) { put("aliquota_cbs", Json.scalar(value)); return this; }
 public java.math.BigDecimal getValorCbs() { return decimalValue(field("valor_cbs")); }
 public MonitorDocumentCteOsImpostosIbsCbsCreditoPresumido setValorCbs(java.math.BigDecimal value) { put("valor_cbs", Json.scalar(value)); return this; }
 public java.math.BigDecimal getValorCbsCondicionadoSuspensao() { return decimalValue(field("valor_cbs_condicionado_suspensao")); }
 public MonitorDocumentCteOsImpostosIbsCbsCreditoPresumido setValorCbsCondicionadoSuspensao(java.math.BigDecimal value) { put("valor_cbs_condicionado_suspensao", Json.scalar(value)); return this; }
}
