package com.webmania.sdk.model.api2monitormanagement;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/monitor-management.openapi.json; see contract-provenance.json. */
public final class MonitorDocumentCteOsImpostosIbsCbs extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("situacao_tributaria", "classificacao_tributaria", "indicador_doacao", "bc", "valor_ibs", "ibs_estadual", "ibs_municipal", "cbs", "situacao_tributaria_regular", "classificacao_tributaria_regular", "tributacao_regular", "compra_governamental", "credito_presumido", "estorno_credito");
 public MonitorDocumentCteOsImpostosIbsCbs() { super(FIELDS); }
 public MonitorDocumentCteOsImpostosIbsCbs(JsonNode node) { super(node, FIELDS); }
 public String getSituacaoTributaria() { return stringValue(field("situacao_tributaria")); }
 public MonitorDocumentCteOsImpostosIbsCbs setSituacaoTributaria(String value) { put("situacao_tributaria", Json.scalar(value)); return this; }
 public String getClassificacaoTributaria() { return stringValue(field("classificacao_tributaria")); }
 public MonitorDocumentCteOsImpostosIbsCbs setClassificacaoTributaria(String value) { put("classificacao_tributaria", Json.scalar(value)); return this; }
 public Boolean getIndicadorDoacao() { return booleanValue(field("indicador_doacao")); }
 public MonitorDocumentCteOsImpostosIbsCbs setIndicadorDoacao(Boolean value) { put("indicador_doacao", Json.scalar(value)); return this; }
 public java.math.BigDecimal getBc() { return decimalValue(field("bc")); }
 public MonitorDocumentCteOsImpostosIbsCbs setBc(java.math.BigDecimal value) { put("bc", Json.scalar(value)); return this; }
 public java.math.BigDecimal getValorIbs() { return decimalValue(field("valor_ibs")); }
 public MonitorDocumentCteOsImpostosIbsCbs setValorIbs(java.math.BigDecimal value) { put("valor_ibs", Json.scalar(value)); return this; }
 public MonitorDocumentCteOsImpostosIbsCbsIbsEstadual getIbsEstadual() { return (field("ibs_estadual")).isNull() || (field("ibs_estadual")).isMissingNode() ? null : new MonitorDocumentCteOsImpostosIbsCbsIbsEstadual(field("ibs_estadual")); }
 public MonitorDocumentCteOsImpostosIbsCbs setIbsEstadual(MonitorDocumentCteOsImpostosIbsCbsIbsEstadual value) { put("ibs_estadual", value == null ? null : value.toJson()); return this; }
 public MonitorDocumentCteOsImpostosIbsCbsIbsMunicipal getIbsMunicipal() { return (field("ibs_municipal")).isNull() || (field("ibs_municipal")).isMissingNode() ? null : new MonitorDocumentCteOsImpostosIbsCbsIbsMunicipal(field("ibs_municipal")); }
 public MonitorDocumentCteOsImpostosIbsCbs setIbsMunicipal(MonitorDocumentCteOsImpostosIbsCbsIbsMunicipal value) { put("ibs_municipal", value == null ? null : value.toJson()); return this; }
 public MonitorDocumentCteOsImpostosIbsCbsCbs getCbs() { return (field("cbs")).isNull() || (field("cbs")).isMissingNode() ? null : new MonitorDocumentCteOsImpostosIbsCbsCbs(field("cbs")); }
 public MonitorDocumentCteOsImpostosIbsCbs setCbs(MonitorDocumentCteOsImpostosIbsCbsCbs value) { put("cbs", value == null ? null : value.toJson()); return this; }
 public String getSituacaoTributariaRegular() { return stringValue(field("situacao_tributaria_regular")); }
 public MonitorDocumentCteOsImpostosIbsCbs setSituacaoTributariaRegular(String value) { put("situacao_tributaria_regular", Json.scalar(value)); return this; }
 public String getClassificacaoTributariaRegular() { return stringValue(field("classificacao_tributaria_regular")); }
 public MonitorDocumentCteOsImpostosIbsCbs setClassificacaoTributariaRegular(String value) { put("classificacao_tributaria_regular", Json.scalar(value)); return this; }
 public MonitorDocumentCteOsImpostosIbsCbsTributacaoRegular getTributacaoRegular() { return (field("tributacao_regular")).isNull() || (field("tributacao_regular")).isMissingNode() ? null : new MonitorDocumentCteOsImpostosIbsCbsTributacaoRegular(field("tributacao_regular")); }
 public MonitorDocumentCteOsImpostosIbsCbs setTributacaoRegular(MonitorDocumentCteOsImpostosIbsCbsTributacaoRegular value) { put("tributacao_regular", value == null ? null : value.toJson()); return this; }
 public MonitorDocumentCteOsImpostosIbsCbsCompraGovernamental getCompraGovernamental() { return (field("compra_governamental")).isNull() || (field("compra_governamental")).isMissingNode() ? null : new MonitorDocumentCteOsImpostosIbsCbsCompraGovernamental(field("compra_governamental")); }
 public MonitorDocumentCteOsImpostosIbsCbs setCompraGovernamental(MonitorDocumentCteOsImpostosIbsCbsCompraGovernamental value) { put("compra_governamental", value == null ? null : value.toJson()); return this; }
 public MonitorDocumentCteOsImpostosIbsCbsCreditoPresumido getCreditoPresumido() { return (field("credito_presumido")).isNull() || (field("credito_presumido")).isMissingNode() ? null : new MonitorDocumentCteOsImpostosIbsCbsCreditoPresumido(field("credito_presumido")); }
 public MonitorDocumentCteOsImpostosIbsCbs setCreditoPresumido(MonitorDocumentCteOsImpostosIbsCbsCreditoPresumido value) { put("credito_presumido", value == null ? null : value.toJson()); return this; }
 public MonitorDocumentCteOsImpostosIbsCbsEstornoCredito getEstornoCredito() { return (field("estorno_credito")).isNull() || (field("estorno_credito")).isMissingNode() ? null : new MonitorDocumentCteOsImpostosIbsCbsEstornoCredito(field("estorno_credito")); }
 public MonitorDocumentCteOsImpostosIbsCbs setEstornoCredito(MonitorDocumentCteOsImpostosIbsCbsEstornoCredito value) { put("estorno_credito", value == null ? null : value.toJson()); return this; }
}
