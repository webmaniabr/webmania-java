package com.webmania.sdk.model.api2cteissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/cte-issuance.openapi.json; see contract-provenance.json. */
public final class EmitterIssueCtePayloadImpostosIbsCbs extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("compra_governamental", "estorno_credito", "indicador_doacao", "situacao_tributaria", "classificacao_tributaria", "situacao_tributaria_regular", "classificacao_tributaria_regular", "ibs_estadual", "ibs_municipal", "cbs", "credito_presumido");
 public EmitterIssueCtePayloadImpostosIbsCbs() { super(FIELDS); }
 public EmitterIssueCtePayloadImpostosIbsCbs(JsonNode node) { super(node, FIELDS); }
 public EmitterIssueCtePayloadImpostosIbsCbsCompraGovernamental getCompraGovernamental() { return (field("compra_governamental")).isNull() || (field("compra_governamental")).isMissingNode() ? null : new EmitterIssueCtePayloadImpostosIbsCbsCompraGovernamental(field("compra_governamental")); }
 public EmitterIssueCtePayloadImpostosIbsCbs setCompraGovernamental(EmitterIssueCtePayloadImpostosIbsCbsCompraGovernamental value) { put("compra_governamental", value == null ? null : value.toJson()); return this; }
 public EmitterIssueCtePayloadImpostosIbsCbsEstornoCredito getEstornoCredito() { return (field("estorno_credito")).isNull() || (field("estorno_credito")).isMissingNode() ? null : new EmitterIssueCtePayloadImpostosIbsCbsEstornoCredito(field("estorno_credito")); }
 public EmitterIssueCtePayloadImpostosIbsCbs setEstornoCredito(EmitterIssueCtePayloadImpostosIbsCbsEstornoCredito value) { put("estorno_credito", value == null ? null : value.toJson()); return this; }
 public EmitterIssueCtePayloadImpostosIbsCbsIndicadorDoacao getIndicadorDoacao() { return (field("indicador_doacao")).isNull() || (field("indicador_doacao")).isMissingNode() ? null : new EmitterIssueCtePayloadImpostosIbsCbsIndicadorDoacao(field("indicador_doacao")); }
 public EmitterIssueCtePayloadImpostosIbsCbs setIndicadorDoacao(EmitterIssueCtePayloadImpostosIbsCbsIndicadorDoacao value) { put("indicador_doacao", value == null ? null : value.toJson()); return this; }
 public String getSituacaoTributaria() { return stringValue(field("situacao_tributaria")); }
 public EmitterIssueCtePayloadImpostosIbsCbs setSituacaoTributaria(String value) { put("situacao_tributaria", Json.scalar(value)); return this; }
 public String getClassificacaoTributaria() { return stringValue(field("classificacao_tributaria")); }
 public EmitterIssueCtePayloadImpostosIbsCbs setClassificacaoTributaria(String value) { put("classificacao_tributaria", Json.scalar(value)); return this; }
 public String getSituacaoTributariaRegular() { return stringValue(field("situacao_tributaria_regular")); }
 public EmitterIssueCtePayloadImpostosIbsCbs setSituacaoTributariaRegular(String value) { put("situacao_tributaria_regular", Json.scalar(value)); return this; }
 public String getClassificacaoTributariaRegular() { return stringValue(field("classificacao_tributaria_regular")); }
 public EmitterIssueCtePayloadImpostosIbsCbs setClassificacaoTributariaRegular(String value) { put("classificacao_tributaria_regular", Json.scalar(value)); return this; }
 public EmitterIssueCtePayloadImpostosIbsCbsIbsEstadual getIbsEstadual() { return (field("ibs_estadual")).isNull() || (field("ibs_estadual")).isMissingNode() ? null : new EmitterIssueCtePayloadImpostosIbsCbsIbsEstadual(field("ibs_estadual")); }
 public EmitterIssueCtePayloadImpostosIbsCbs setIbsEstadual(EmitterIssueCtePayloadImpostosIbsCbsIbsEstadual value) { put("ibs_estadual", value == null ? null : value.toJson()); return this; }
 public EmitterIssueCtePayloadImpostosIbsCbsIbsMunicipal getIbsMunicipal() { return (field("ibs_municipal")).isNull() || (field("ibs_municipal")).isMissingNode() ? null : new EmitterIssueCtePayloadImpostosIbsCbsIbsMunicipal(field("ibs_municipal")); }
 public EmitterIssueCtePayloadImpostosIbsCbs setIbsMunicipal(EmitterIssueCtePayloadImpostosIbsCbsIbsMunicipal value) { put("ibs_municipal", value == null ? null : value.toJson()); return this; }
 public EmitterIssueCtePayloadImpostosIbsCbsCbs getCbs() { return (field("cbs")).isNull() || (field("cbs")).isMissingNode() ? null : new EmitterIssueCtePayloadImpostosIbsCbsCbs(field("cbs")); }
 public EmitterIssueCtePayloadImpostosIbsCbs setCbs(EmitterIssueCtePayloadImpostosIbsCbsCbs value) { put("cbs", value == null ? null : value.toJson()); return this; }
 public EmitterIssueCtePayloadImpostosIbsCbsCreditoPresumido getCreditoPresumido() { return (field("credito_presumido")).isNull() || (field("credito_presumido")).isMissingNode() ? null : new EmitterIssueCtePayloadImpostosIbsCbsCreditoPresumido(field("credito_presumido")); }
 public EmitterIssueCtePayloadImpostosIbsCbs setCreditoPresumido(EmitterIssueCtePayloadImpostosIbsCbsCreditoPresumido value) { put("credito_presumido", value == null ? null : value.toJson()); return this; }
}
