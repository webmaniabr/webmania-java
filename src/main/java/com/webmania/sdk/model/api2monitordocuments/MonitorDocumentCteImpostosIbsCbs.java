package com.webmania.sdk.model.api2monitordocuments;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/monitor-documents.openapi.json; see contract-provenance.json. */
public final class MonitorDocumentCteImpostosIbsCbs extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("situacao_tributaria", "classificacao_tributaria", "indicador_doacao", "bc", "valor_ibs", "ibs_estadual", "ibs_municipal", "cbs", "situacao_tributaria_regular", "classificacao_tributaria_regular", "tributacao_regular", "compra_governamental", "credito_presumido", "estorno_credito");
 public MonitorDocumentCteImpostosIbsCbs() { super(FIELDS); }
 public MonitorDocumentCteImpostosIbsCbs(JsonNode node) { super(node, FIELDS); }
 public String getSituacaoTributaria() { return stringValue(field("situacao_tributaria")); }
 public MonitorDocumentCteImpostosIbsCbs setSituacaoTributaria(String value) { put("situacao_tributaria", Json.scalar(value)); return this; }
 public String getClassificacaoTributaria() { return stringValue(field("classificacao_tributaria")); }
 public MonitorDocumentCteImpostosIbsCbs setClassificacaoTributaria(String value) { put("classificacao_tributaria", Json.scalar(value)); return this; }
 public Boolean getIndicadorDoacao() { return booleanValue(field("indicador_doacao")); }
 public MonitorDocumentCteImpostosIbsCbs setIndicadorDoacao(Boolean value) { put("indicador_doacao", Json.scalar(value)); return this; }
 public java.math.BigDecimal getBc() { return decimalValue(field("bc")); }
 public MonitorDocumentCteImpostosIbsCbs setBc(java.math.BigDecimal value) { put("bc", Json.scalar(value)); return this; }
 public java.math.BigDecimal getValorIbs() { return decimalValue(field("valor_ibs")); }
 public MonitorDocumentCteImpostosIbsCbs setValorIbs(java.math.BigDecimal value) { put("valor_ibs", Json.scalar(value)); return this; }
 public MonitorDocumentCteImpostosIbsCbsIbsEstadual getIbsEstadual() { return (field("ibs_estadual")).isNull() || (field("ibs_estadual")).isMissingNode() ? null : new MonitorDocumentCteImpostosIbsCbsIbsEstadual(field("ibs_estadual")); }
 public MonitorDocumentCteImpostosIbsCbs setIbsEstadual(MonitorDocumentCteImpostosIbsCbsIbsEstadual value) { put("ibs_estadual", value == null ? null : value.toJson()); return this; }
 public MonitorDocumentCteImpostosIbsCbsIbsMunicipal getIbsMunicipal() { return (field("ibs_municipal")).isNull() || (field("ibs_municipal")).isMissingNode() ? null : new MonitorDocumentCteImpostosIbsCbsIbsMunicipal(field("ibs_municipal")); }
 public MonitorDocumentCteImpostosIbsCbs setIbsMunicipal(MonitorDocumentCteImpostosIbsCbsIbsMunicipal value) { put("ibs_municipal", value == null ? null : value.toJson()); return this; }
 public MonitorDocumentCteImpostosIbsCbsCbs getCbs() { return (field("cbs")).isNull() || (field("cbs")).isMissingNode() ? null : new MonitorDocumentCteImpostosIbsCbsCbs(field("cbs")); }
 public MonitorDocumentCteImpostosIbsCbs setCbs(MonitorDocumentCteImpostosIbsCbsCbs value) { put("cbs", value == null ? null : value.toJson()); return this; }
 public String getSituacaoTributariaRegular() { return stringValue(field("situacao_tributaria_regular")); }
 public MonitorDocumentCteImpostosIbsCbs setSituacaoTributariaRegular(String value) { put("situacao_tributaria_regular", Json.scalar(value)); return this; }
 public String getClassificacaoTributariaRegular() { return stringValue(field("classificacao_tributaria_regular")); }
 public MonitorDocumentCteImpostosIbsCbs setClassificacaoTributariaRegular(String value) { put("classificacao_tributaria_regular", Json.scalar(value)); return this; }
 public MonitorDocumentCteImpostosIbsCbsTributacaoRegular getTributacaoRegular() { return (field("tributacao_regular")).isNull() || (field("tributacao_regular")).isMissingNode() ? null : new MonitorDocumentCteImpostosIbsCbsTributacaoRegular(field("tributacao_regular")); }
 public MonitorDocumentCteImpostosIbsCbs setTributacaoRegular(MonitorDocumentCteImpostosIbsCbsTributacaoRegular value) { put("tributacao_regular", value == null ? null : value.toJson()); return this; }
 public MonitorDocumentCteImpostosIbsCbsCompraGovernamental getCompraGovernamental() { return (field("compra_governamental")).isNull() || (field("compra_governamental")).isMissingNode() ? null : new MonitorDocumentCteImpostosIbsCbsCompraGovernamental(field("compra_governamental")); }
 public MonitorDocumentCteImpostosIbsCbs setCompraGovernamental(MonitorDocumentCteImpostosIbsCbsCompraGovernamental value) { put("compra_governamental", value == null ? null : value.toJson()); return this; }
 public MonitorDocumentCteImpostosIbsCbsCreditoPresumido getCreditoPresumido() { return (field("credito_presumido")).isNull() || (field("credito_presumido")).isMissingNode() ? null : new MonitorDocumentCteImpostosIbsCbsCreditoPresumido(field("credito_presumido")); }
 public MonitorDocumentCteImpostosIbsCbs setCreditoPresumido(MonitorDocumentCteImpostosIbsCbsCreditoPresumido value) { put("credito_presumido", value == null ? null : value.toJson()); return this; }
 public MonitorDocumentCteImpostosIbsCbsEstornoCredito getEstornoCredito() { return (field("estorno_credito")).isNull() || (field("estorno_credito")).isMissingNode() ? null : new MonitorDocumentCteImpostosIbsCbsEstornoCredito(field("estorno_credito")); }
 public MonitorDocumentCteImpostosIbsCbs setEstornoCredito(MonitorDocumentCteImpostosIbsCbsEstornoCredito value) { put("estorno_credito", value == null ? null : value.toJson()); return this; }
}
