package com.webmania.sdk.model.api2monitordocuments;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/monitor-documents.openapi.json; see contract-provenance.json. */
public final class MonitorDocumentNfseImpostosIbsCbs extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("bc", "cbs", "valor_ibs", "ibs_estadual", "ibs_municipal", "finalidade_nfse", "situacao_tributaria", "localidade_incidencia", "cod_indicador_operacao", "indicador_destinatario", "classificacao_tributaria", "valor_calculo_reembolso_repasse");
 public MonitorDocumentNfseImpostosIbsCbs() { super(FIELDS); }
 public MonitorDocumentNfseImpostosIbsCbs(JsonNode node) { super(node, FIELDS); }
 public java.math.BigDecimal getBc() { return decimalValue(field("bc")); }
 public MonitorDocumentNfseImpostosIbsCbs setBc(java.math.BigDecimal value) { put("bc", Json.scalar(value)); return this; }
 public MonitorDocumentNfseImpostosIbsCbsCbs getCbs() { return (field("cbs")).isNull() || (field("cbs")).isMissingNode() ? null : new MonitorDocumentNfseImpostosIbsCbsCbs(field("cbs")); }
 public MonitorDocumentNfseImpostosIbsCbs setCbs(MonitorDocumentNfseImpostosIbsCbsCbs value) { put("cbs", value == null ? null : value.toJson()); return this; }
 public java.math.BigDecimal getValorIbs() { return decimalValue(field("valor_ibs")); }
 public MonitorDocumentNfseImpostosIbsCbs setValorIbs(java.math.BigDecimal value) { put("valor_ibs", Json.scalar(value)); return this; }
 public MonitorDocumentNfseImpostosIbsCbsIbsEstadual getIbsEstadual() { return (field("ibs_estadual")).isNull() || (field("ibs_estadual")).isMissingNode() ? null : new MonitorDocumentNfseImpostosIbsCbsIbsEstadual(field("ibs_estadual")); }
 public MonitorDocumentNfseImpostosIbsCbs setIbsEstadual(MonitorDocumentNfseImpostosIbsCbsIbsEstadual value) { put("ibs_estadual", value == null ? null : value.toJson()); return this; }
 public MonitorDocumentNfseImpostosIbsCbsIbsMunicipal getIbsMunicipal() { return (field("ibs_municipal")).isNull() || (field("ibs_municipal")).isMissingNode() ? null : new MonitorDocumentNfseImpostosIbsCbsIbsMunicipal(field("ibs_municipal")); }
 public MonitorDocumentNfseImpostosIbsCbs setIbsMunicipal(MonitorDocumentNfseImpostosIbsCbsIbsMunicipal value) { put("ibs_municipal", value == null ? null : value.toJson()); return this; }
 public java.math.BigDecimal getFinalidadeNfse() { return decimalValue(field("finalidade_nfse")); }
 public MonitorDocumentNfseImpostosIbsCbs setFinalidadeNfse(java.math.BigDecimal value) { put("finalidade_nfse", Json.scalar(value)); return this; }
 public String getSituacaoTributaria() { return stringValue(field("situacao_tributaria")); }
 public MonitorDocumentNfseImpostosIbsCbs setSituacaoTributaria(String value) { put("situacao_tributaria", Json.scalar(value)); return this; }
 public MonitorDocumentNfseImpostosIbsCbsLocalidadeIncidencia getLocalidadeIncidencia() { return (field("localidade_incidencia")).isNull() || (field("localidade_incidencia")).isMissingNode() ? null : new MonitorDocumentNfseImpostosIbsCbsLocalidadeIncidencia(field("localidade_incidencia")); }
 public MonitorDocumentNfseImpostosIbsCbs setLocalidadeIncidencia(MonitorDocumentNfseImpostosIbsCbsLocalidadeIncidencia value) { put("localidade_incidencia", value == null ? null : value.toJson()); return this; }
 public String getCodIndicadorOperacao() { return stringValue(field("cod_indicador_operacao")); }
 public MonitorDocumentNfseImpostosIbsCbs setCodIndicadorOperacao(String value) { put("cod_indicador_operacao", Json.scalar(value)); return this; }
 public java.math.BigDecimal getIndicadorDestinatario() { return decimalValue(field("indicador_destinatario")); }
 public MonitorDocumentNfseImpostosIbsCbs setIndicadorDestinatario(java.math.BigDecimal value) { put("indicador_destinatario", Json.scalar(value)); return this; }
 public String getClassificacaoTributaria() { return stringValue(field("classificacao_tributaria")); }
 public MonitorDocumentNfseImpostosIbsCbs setClassificacaoTributaria(String value) { put("classificacao_tributaria", Json.scalar(value)); return this; }
 public java.math.BigDecimal getValorCalculoReembolsoRepasse() { return decimalValue(field("valor_calculo_reembolso_repasse")); }
 public MonitorDocumentNfseImpostosIbsCbs setValorCalculoReembolsoRepasse(java.math.BigDecimal value) { put("valor_calculo_reembolso_repasse", Json.scalar(value)); return this; }
}
