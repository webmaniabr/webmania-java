package com.webmania.sdk.model.api2monitordocuments;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/monitor-documents.openapi.json; see contract-provenance.json. */
public final class MonitorDocumentNfseServicosItemImpostosIbsCbs extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("bc", "cbs", "valor_ibs", "ibs_estadual", "ibs_municipal", "finalidade_nfse", "situacao_tributaria", "localidade_incidencia", "cod_indicador_operacao", "indicador_destinatario", "classificacao_tributaria", "valor_calculo_reembolso_repasse");
 public MonitorDocumentNfseServicosItemImpostosIbsCbs() { super(FIELDS); }
 public MonitorDocumentNfseServicosItemImpostosIbsCbs(JsonNode node) { super(node, FIELDS); }
 public java.math.BigDecimal getBc() { return decimalValue(field("bc")); }
 public MonitorDocumentNfseServicosItemImpostosIbsCbs setBc(java.math.BigDecimal value) { put("bc", Json.scalar(value)); return this; }
 public MonitorDocumentNfseServicosItemImpostosIbsCbsCbs getCbs() { return (field("cbs")).isNull() || (field("cbs")).isMissingNode() ? null : new MonitorDocumentNfseServicosItemImpostosIbsCbsCbs(field("cbs")); }
 public MonitorDocumentNfseServicosItemImpostosIbsCbs setCbs(MonitorDocumentNfseServicosItemImpostosIbsCbsCbs value) { put("cbs", value == null ? null : value.toJson()); return this; }
 public java.math.BigDecimal getValorIbs() { return decimalValue(field("valor_ibs")); }
 public MonitorDocumentNfseServicosItemImpostosIbsCbs setValorIbs(java.math.BigDecimal value) { put("valor_ibs", Json.scalar(value)); return this; }
 public MonitorDocumentNfseServicosItemImpostosIbsCbsIbsEstadual getIbsEstadual() { return (field("ibs_estadual")).isNull() || (field("ibs_estadual")).isMissingNode() ? null : new MonitorDocumentNfseServicosItemImpostosIbsCbsIbsEstadual(field("ibs_estadual")); }
 public MonitorDocumentNfseServicosItemImpostosIbsCbs setIbsEstadual(MonitorDocumentNfseServicosItemImpostosIbsCbsIbsEstadual value) { put("ibs_estadual", value == null ? null : value.toJson()); return this; }
 public MonitorDocumentNfseServicosItemImpostosIbsCbsIbsMunicipal getIbsMunicipal() { return (field("ibs_municipal")).isNull() || (field("ibs_municipal")).isMissingNode() ? null : new MonitorDocumentNfseServicosItemImpostosIbsCbsIbsMunicipal(field("ibs_municipal")); }
 public MonitorDocumentNfseServicosItemImpostosIbsCbs setIbsMunicipal(MonitorDocumentNfseServicosItemImpostosIbsCbsIbsMunicipal value) { put("ibs_municipal", value == null ? null : value.toJson()); return this; }
 public java.math.BigDecimal getFinalidadeNfse() { return decimalValue(field("finalidade_nfse")); }
 public MonitorDocumentNfseServicosItemImpostosIbsCbs setFinalidadeNfse(java.math.BigDecimal value) { put("finalidade_nfse", Json.scalar(value)); return this; }
 public String getSituacaoTributaria() { return stringValue(field("situacao_tributaria")); }
 public MonitorDocumentNfseServicosItemImpostosIbsCbs setSituacaoTributaria(String value) { put("situacao_tributaria", Json.scalar(value)); return this; }
 public MonitorDocumentNfseServicosItemImpostosIbsCbsLocalidadeIncidencia getLocalidadeIncidencia() { return (field("localidade_incidencia")).isNull() || (field("localidade_incidencia")).isMissingNode() ? null : new MonitorDocumentNfseServicosItemImpostosIbsCbsLocalidadeIncidencia(field("localidade_incidencia")); }
 public MonitorDocumentNfseServicosItemImpostosIbsCbs setLocalidadeIncidencia(MonitorDocumentNfseServicosItemImpostosIbsCbsLocalidadeIncidencia value) { put("localidade_incidencia", value == null ? null : value.toJson()); return this; }
 public String getCodIndicadorOperacao() { return stringValue(field("cod_indicador_operacao")); }
 public MonitorDocumentNfseServicosItemImpostosIbsCbs setCodIndicadorOperacao(String value) { put("cod_indicador_operacao", Json.scalar(value)); return this; }
 public java.math.BigDecimal getIndicadorDestinatario() { return decimalValue(field("indicador_destinatario")); }
 public MonitorDocumentNfseServicosItemImpostosIbsCbs setIndicadorDestinatario(java.math.BigDecimal value) { put("indicador_destinatario", Json.scalar(value)); return this; }
 public String getClassificacaoTributaria() { return stringValue(field("classificacao_tributaria")); }
 public MonitorDocumentNfseServicosItemImpostosIbsCbs setClassificacaoTributaria(String value) { put("classificacao_tributaria", Json.scalar(value)); return this; }
 public java.math.BigDecimal getValorCalculoReembolsoRepasse() { return decimalValue(field("valor_calculo_reembolso_repasse")); }
 public MonitorDocumentNfseServicosItemImpostosIbsCbs setValorCalculoReembolsoRepasse(java.math.BigDecimal value) { put("valor_calculo_reembolso_repasse", Json.scalar(value)); return this; }
}
