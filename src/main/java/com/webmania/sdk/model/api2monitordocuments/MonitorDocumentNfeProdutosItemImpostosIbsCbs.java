package com.webmania.sdk.model.api2monitordocuments;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/monitor-documents.openapi.json; see contract-provenance.json. */
public final class MonitorDocumentNfeProdutosItemImpostosIbsCbs extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("situacao_tributaria", "classificacao_tributaria", "indicador_doacao", "bc", "valor_ibs", "ibs_estadual", "ibs_municipal", "cbs", "situacao_tributaria_regular", "classificacao_tributaria_regular", "tributacao_regular", "compra_governamental", "tributacao_monofasica", "transferencia_credito", "ajuste_competencia", "credito_presumido", "credito_presumido_zfm", "estorno_credito");
 public MonitorDocumentNfeProdutosItemImpostosIbsCbs() { super(FIELDS); }
 public MonitorDocumentNfeProdutosItemImpostosIbsCbs(JsonNode node) { super(node, FIELDS); }
 public String getSituacaoTributaria() { return stringValue(field("situacao_tributaria")); }
 public MonitorDocumentNfeProdutosItemImpostosIbsCbs setSituacaoTributaria(String value) { put("situacao_tributaria", Json.scalar(value)); return this; }
 public String getClassificacaoTributaria() { return stringValue(field("classificacao_tributaria")); }
 public MonitorDocumentNfeProdutosItemImpostosIbsCbs setClassificacaoTributaria(String value) { put("classificacao_tributaria", Json.scalar(value)); return this; }
 public Boolean getIndicadorDoacao() { return booleanValue(field("indicador_doacao")); }
 public MonitorDocumentNfeProdutosItemImpostosIbsCbs setIndicadorDoacao(Boolean value) { put("indicador_doacao", Json.scalar(value)); return this; }
 public java.math.BigDecimal getBc() { return decimalValue(field("bc")); }
 public MonitorDocumentNfeProdutosItemImpostosIbsCbs setBc(java.math.BigDecimal value) { put("bc", Json.scalar(value)); return this; }
 public java.math.BigDecimal getValorIbs() { return decimalValue(field("valor_ibs")); }
 public MonitorDocumentNfeProdutosItemImpostosIbsCbs setValorIbs(java.math.BigDecimal value) { put("valor_ibs", Json.scalar(value)); return this; }
 public MonitorDocumentNfeProdutosItemImpostosIbsCbsIbsEstadual getIbsEstadual() { return (field("ibs_estadual")).isNull() || (field("ibs_estadual")).isMissingNode() ? null : new MonitorDocumentNfeProdutosItemImpostosIbsCbsIbsEstadual(field("ibs_estadual")); }
 public MonitorDocumentNfeProdutosItemImpostosIbsCbs setIbsEstadual(MonitorDocumentNfeProdutosItemImpostosIbsCbsIbsEstadual value) { put("ibs_estadual", value == null ? null : value.toJson()); return this; }
 public MonitorDocumentNfeProdutosItemImpostosIbsCbsIbsMunicipal getIbsMunicipal() { return (field("ibs_municipal")).isNull() || (field("ibs_municipal")).isMissingNode() ? null : new MonitorDocumentNfeProdutosItemImpostosIbsCbsIbsMunicipal(field("ibs_municipal")); }
 public MonitorDocumentNfeProdutosItemImpostosIbsCbs setIbsMunicipal(MonitorDocumentNfeProdutosItemImpostosIbsCbsIbsMunicipal value) { put("ibs_municipal", value == null ? null : value.toJson()); return this; }
 public MonitorDocumentNfeProdutosItemImpostosIbsCbsCbs getCbs() { return (field("cbs")).isNull() || (field("cbs")).isMissingNode() ? null : new MonitorDocumentNfeProdutosItemImpostosIbsCbsCbs(field("cbs")); }
 public MonitorDocumentNfeProdutosItemImpostosIbsCbs setCbs(MonitorDocumentNfeProdutosItemImpostosIbsCbsCbs value) { put("cbs", value == null ? null : value.toJson()); return this; }
 public String getSituacaoTributariaRegular() { return stringValue(field("situacao_tributaria_regular")); }
 public MonitorDocumentNfeProdutosItemImpostosIbsCbs setSituacaoTributariaRegular(String value) { put("situacao_tributaria_regular", Json.scalar(value)); return this; }
 public String getClassificacaoTributariaRegular() { return stringValue(field("classificacao_tributaria_regular")); }
 public MonitorDocumentNfeProdutosItemImpostosIbsCbs setClassificacaoTributariaRegular(String value) { put("classificacao_tributaria_regular", Json.scalar(value)); return this; }
 public MonitorDocumentNfeProdutosItemImpostosIbsCbsTributacaoRegular getTributacaoRegular() { return (field("tributacao_regular")).isNull() || (field("tributacao_regular")).isMissingNode() ? null : new MonitorDocumentNfeProdutosItemImpostosIbsCbsTributacaoRegular(field("tributacao_regular")); }
 public MonitorDocumentNfeProdutosItemImpostosIbsCbs setTributacaoRegular(MonitorDocumentNfeProdutosItemImpostosIbsCbsTributacaoRegular value) { put("tributacao_regular", value == null ? null : value.toJson()); return this; }
 public MonitorDocumentNfeProdutosItemImpostosIbsCbsCompraGovernamental getCompraGovernamental() { return (field("compra_governamental")).isNull() || (field("compra_governamental")).isMissingNode() ? null : new MonitorDocumentNfeProdutosItemImpostosIbsCbsCompraGovernamental(field("compra_governamental")); }
 public MonitorDocumentNfeProdutosItemImpostosIbsCbs setCompraGovernamental(MonitorDocumentNfeProdutosItemImpostosIbsCbsCompraGovernamental value) { put("compra_governamental", value == null ? null : value.toJson()); return this; }
 public MonitorDocumentNfeProdutosItemImpostosIbsCbsTributacaoMonofasica getTributacaoMonofasica() { return (field("tributacao_monofasica")).isNull() || (field("tributacao_monofasica")).isMissingNode() ? null : new MonitorDocumentNfeProdutosItemImpostosIbsCbsTributacaoMonofasica(field("tributacao_monofasica")); }
 public MonitorDocumentNfeProdutosItemImpostosIbsCbs setTributacaoMonofasica(MonitorDocumentNfeProdutosItemImpostosIbsCbsTributacaoMonofasica value) { put("tributacao_monofasica", value == null ? null : value.toJson()); return this; }
 public MonitorDocumentNfeProdutosItemImpostosIbsCbsTransferenciaCredito getTransferenciaCredito() { return (field("transferencia_credito")).isNull() || (field("transferencia_credito")).isMissingNode() ? null : new MonitorDocumentNfeProdutosItemImpostosIbsCbsTransferenciaCredito(field("transferencia_credito")); }
 public MonitorDocumentNfeProdutosItemImpostosIbsCbs setTransferenciaCredito(MonitorDocumentNfeProdutosItemImpostosIbsCbsTransferenciaCredito value) { put("transferencia_credito", value == null ? null : value.toJson()); return this; }
 public MonitorDocumentNfeProdutosItemImpostosIbsCbsAjusteCompetencia getAjusteCompetencia() { return (field("ajuste_competencia")).isNull() || (field("ajuste_competencia")).isMissingNode() ? null : new MonitorDocumentNfeProdutosItemImpostosIbsCbsAjusteCompetencia(field("ajuste_competencia")); }
 public MonitorDocumentNfeProdutosItemImpostosIbsCbs setAjusteCompetencia(MonitorDocumentNfeProdutosItemImpostosIbsCbsAjusteCompetencia value) { put("ajuste_competencia", value == null ? null : value.toJson()); return this; }
 public MonitorDocumentNfeProdutosItemImpostosIbsCbsCreditoPresumido getCreditoPresumido() { return (field("credito_presumido")).isNull() || (field("credito_presumido")).isMissingNode() ? null : new MonitorDocumentNfeProdutosItemImpostosIbsCbsCreditoPresumido(field("credito_presumido")); }
 public MonitorDocumentNfeProdutosItemImpostosIbsCbs setCreditoPresumido(MonitorDocumentNfeProdutosItemImpostosIbsCbsCreditoPresumido value) { put("credito_presumido", value == null ? null : value.toJson()); return this; }
 public MonitorDocumentNfeProdutosItemImpostosIbsCbsCreditoPresumidoZfm getCreditoPresumidoZfm() { return (field("credito_presumido_zfm")).isNull() || (field("credito_presumido_zfm")).isMissingNode() ? null : new MonitorDocumentNfeProdutosItemImpostosIbsCbsCreditoPresumidoZfm(field("credito_presumido_zfm")); }
 public MonitorDocumentNfeProdutosItemImpostosIbsCbs setCreditoPresumidoZfm(MonitorDocumentNfeProdutosItemImpostosIbsCbsCreditoPresumidoZfm value) { put("credito_presumido_zfm", value == null ? null : value.toJson()); return this; }
 public MonitorDocumentNfeProdutosItemImpostosIbsCbsEstornoCredito getEstornoCredito() { return (field("estorno_credito")).isNull() || (field("estorno_credito")).isMissingNode() ? null : new MonitorDocumentNfeProdutosItemImpostosIbsCbsEstornoCredito(field("estorno_credito")); }
 public MonitorDocumentNfeProdutosItemImpostosIbsCbs setEstornoCredito(MonitorDocumentNfeProdutosItemImpostosIbsCbsEstornoCredito value) { put("estorno_credito", value == null ? null : value.toJson()); return this; }
}
