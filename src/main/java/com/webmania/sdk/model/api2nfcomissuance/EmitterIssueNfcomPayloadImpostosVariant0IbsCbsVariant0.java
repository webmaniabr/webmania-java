package com.webmania.sdk.model.api2nfcomissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/nfcom-issuance.openapi.json; see contract-provenance.json. */
public final class EmitterIssueNfcomPayloadImpostosVariant0IbsCbsVariant0 extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("classificacao_tributaria", "classificacao_tributaria_regular", "compra_governamental", "credito_presumido", "estorno_credito", "indicador_doacao", "situacao_tributaria", "situacao_tributaria_regular", "cbs", "ibs_estadual", "ibs_municipal");
 public EmitterIssueNfcomPayloadImpostosVariant0IbsCbsVariant0() { super(FIELDS); }
 public EmitterIssueNfcomPayloadImpostosVariant0IbsCbsVariant0(JsonNode node) { super(node, FIELDS); }
 public String getClassificacaoTributaria() { return stringValue(field("classificacao_tributaria")); }
 public EmitterIssueNfcomPayloadImpostosVariant0IbsCbsVariant0 setClassificacaoTributaria(String value) { put("classificacao_tributaria", Json.scalar(value)); return this; }
 public String getClassificacaoTributariaRegular() { return stringValue(field("classificacao_tributaria_regular")); }
 public EmitterIssueNfcomPayloadImpostosVariant0IbsCbsVariant0 setClassificacaoTributariaRegular(String value) { put("classificacao_tributaria_regular", Json.scalar(value)); return this; }
 public EmitterIssueNfcomPayloadImpostosVariant0IbsCbsVariant0CompraGovernamental getCompraGovernamental() { return (field("compra_governamental")).isNull() || (field("compra_governamental")).isMissingNode() ? null : new EmitterIssueNfcomPayloadImpostosVariant0IbsCbsVariant0CompraGovernamental(field("compra_governamental")); }
 public EmitterIssueNfcomPayloadImpostosVariant0IbsCbsVariant0 setCompraGovernamental(EmitterIssueNfcomPayloadImpostosVariant0IbsCbsVariant0CompraGovernamental value) { put("compra_governamental", value == null ? null : value.toJson()); return this; }
 public EmitterIssueNfcomPayloadImpostosVariant0IbsCbsVariant0CreditoPresumido getCreditoPresumido() { return (field("credito_presumido")).isNull() || (field("credito_presumido")).isMissingNode() ? null : new EmitterIssueNfcomPayloadImpostosVariant0IbsCbsVariant0CreditoPresumido(field("credito_presumido")); }
 public EmitterIssueNfcomPayloadImpostosVariant0IbsCbsVariant0 setCreditoPresumido(EmitterIssueNfcomPayloadImpostosVariant0IbsCbsVariant0CreditoPresumido value) { put("credito_presumido", value == null ? null : value.toJson()); return this; }
 public EmitterIssueNfcomPayloadImpostosVariant0IbsCbsVariant0EstornoCredito getEstornoCredito() { return (field("estorno_credito")).isNull() || (field("estorno_credito")).isMissingNode() ? null : new EmitterIssueNfcomPayloadImpostosVariant0IbsCbsVariant0EstornoCredito(field("estorno_credito")); }
 public EmitterIssueNfcomPayloadImpostosVariant0IbsCbsVariant0 setEstornoCredito(EmitterIssueNfcomPayloadImpostosVariant0IbsCbsVariant0EstornoCredito value) { put("estorno_credito", value == null ? null : value.toJson()); return this; }
 public EmitterIssueNfcomPayloadImpostosVariant0IbsCbsVariant0IndicadorDoacao getIndicadorDoacao() { return (field("indicador_doacao")).isNull() || (field("indicador_doacao")).isMissingNode() ? null : new EmitterIssueNfcomPayloadImpostosVariant0IbsCbsVariant0IndicadorDoacao(field("indicador_doacao")); }
 public EmitterIssueNfcomPayloadImpostosVariant0IbsCbsVariant0 setIndicadorDoacao(EmitterIssueNfcomPayloadImpostosVariant0IbsCbsVariant0IndicadorDoacao value) { put("indicador_doacao", value == null ? null : value.toJson()); return this; }
 public String getSituacaoTributaria() { return stringValue(field("situacao_tributaria")); }
 public EmitterIssueNfcomPayloadImpostosVariant0IbsCbsVariant0 setSituacaoTributaria(String value) { put("situacao_tributaria", Json.scalar(value)); return this; }
 public String getSituacaoTributariaRegular() { return stringValue(field("situacao_tributaria_regular")); }
 public EmitterIssueNfcomPayloadImpostosVariant0IbsCbsVariant0 setSituacaoTributariaRegular(String value) { put("situacao_tributaria_regular", Json.scalar(value)); return this; }
 public EmitterIssueNfcomPayloadImpostosVariant0IbsCbsVariant0Cbs getCbs() { return (field("cbs")).isNull() || (field("cbs")).isMissingNode() ? null : new EmitterIssueNfcomPayloadImpostosVariant0IbsCbsVariant0Cbs(field("cbs")); }
 public EmitterIssueNfcomPayloadImpostosVariant0IbsCbsVariant0 setCbs(EmitterIssueNfcomPayloadImpostosVariant0IbsCbsVariant0Cbs value) { put("cbs", value == null ? null : value.toJson()); return this; }
 public EmitterIssueNfcomPayloadImpostosVariant0IbsCbsVariant0IbsEstadual getIbsEstadual() { return (field("ibs_estadual")).isNull() || (field("ibs_estadual")).isMissingNode() ? null : new EmitterIssueNfcomPayloadImpostosVariant0IbsCbsVariant0IbsEstadual(field("ibs_estadual")); }
 public EmitterIssueNfcomPayloadImpostosVariant0IbsCbsVariant0 setIbsEstadual(EmitterIssueNfcomPayloadImpostosVariant0IbsCbsVariant0IbsEstadual value) { put("ibs_estadual", value == null ? null : value.toJson()); return this; }
 public EmitterIssueNfcomPayloadImpostosVariant0IbsCbsVariant0IbsMunicipal getIbsMunicipal() { return (field("ibs_municipal")).isNull() || (field("ibs_municipal")).isMissingNode() ? null : new EmitterIssueNfcomPayloadImpostosVariant0IbsCbsVariant0IbsMunicipal(field("ibs_municipal")); }
 public EmitterIssueNfcomPayloadImpostosVariant0IbsCbsVariant0 setIbsMunicipal(EmitterIssueNfcomPayloadImpostosVariant0IbsCbsVariant0IbsMunicipal value) { put("ibs_municipal", value == null ? null : value.toJson()); return this; }
}
