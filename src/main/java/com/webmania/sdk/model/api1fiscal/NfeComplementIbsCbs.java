package com.webmania.sdk.model.api1fiscal;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api1/fiscal.openapi.json; see contract-provenance.json. */
public final class NfeComplementIbsCbs extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("situacao_tributaria", "classificacao_tributaria", "situacao_tributaria_regular", "classificacao_tributaria_regular", "ibs_estadual", "ibs_municipal", "cbs", "tributacao_monofasica", "credito_presumido", "transferencia_credito", "ajuste_competencia", "estorno_credito", "base_calculo");
 public NfeComplementIbsCbs() { super(FIELDS); }
 public NfeComplementIbsCbs(JsonNode node) { super(node, FIELDS); }
 public String getSituacaoTributaria() { return stringValue(field("situacao_tributaria")); }
 public NfeComplementIbsCbs setSituacaoTributaria(String value) { put("situacao_tributaria", Json.scalar(value)); return this; }
 public String getClassificacaoTributaria() { return stringValue(field("classificacao_tributaria")); }
 public NfeComplementIbsCbs setClassificacaoTributaria(String value) { put("classificacao_tributaria", Json.scalar(value)); return this; }
 public String getSituacaoTributariaRegular() { return stringValue(field("situacao_tributaria_regular")); }
 public NfeComplementIbsCbs setSituacaoTributariaRegular(String value) { put("situacao_tributaria_regular", Json.scalar(value)); return this; }
 public String getClassificacaoTributariaRegular() { return stringValue(field("classificacao_tributaria_regular")); }
 public NfeComplementIbsCbs setClassificacaoTributariaRegular(String value) { put("classificacao_tributaria_regular", Json.scalar(value)); return this; }
 public G101 getIbsEstadual() { return (field("ibs_estadual")).isNull() || (field("ibs_estadual")).isMissingNode() ? null : new G101(field("ibs_estadual")); }
 public NfeComplementIbsCbs setIbsEstadual(G101 value) { put("ibs_estadual", value == null ? null : value.toJson()); return this; }
 public G102 getIbsMunicipal() { return (field("ibs_municipal")).isNull() || (field("ibs_municipal")).isMissingNode() ? null : new G102(field("ibs_municipal")); }
 public NfeComplementIbsCbs setIbsMunicipal(G102 value) { put("ibs_municipal", value == null ? null : value.toJson()); return this; }
 public G103 getCbs() { return (field("cbs")).isNull() || (field("cbs")).isMissingNode() ? null : new G103(field("cbs")); }
 public NfeComplementIbsCbs setCbs(G103 value) { put("cbs", value == null ? null : value.toJson()); return this; }
 public G105 getTributacaoMonofasica() { return (field("tributacao_monofasica")).isNull() || (field("tributacao_monofasica")).isMissingNode() ? null : new G105(field("tributacao_monofasica")); }
 public NfeComplementIbsCbs setTributacaoMonofasica(G105 value) { put("tributacao_monofasica", value == null ? null : value.toJson()); return this; }
 public G106 getCreditoPresumido() { return (field("credito_presumido")).isNull() || (field("credito_presumido")).isMissingNode() ? null : new G106(field("credito_presumido")); }
 public NfeComplementIbsCbs setCreditoPresumido(G106 value) { put("credito_presumido", value == null ? null : value.toJson()); return this; }
 public G108 getTransferenciaCredito() { return (field("transferencia_credito")).isNull() || (field("transferencia_credito")).isMissingNode() ? null : new G108(field("transferencia_credito")); }
 public NfeComplementIbsCbs setTransferenciaCredito(G108 value) { put("transferencia_credito", value == null ? null : value.toJson()); return this; }
 public G109 getAjusteCompetencia() { return (field("ajuste_competencia")).isNull() || (field("ajuste_competencia")).isMissingNode() ? null : new G109(field("ajuste_competencia")); }
 public NfeComplementIbsCbs setAjusteCompetencia(G109 value) { put("ajuste_competencia", value == null ? null : value.toJson()); return this; }
 public G110 getEstornoCredito() { return (field("estorno_credito")).isNull() || (field("estorno_credito")).isMissingNode() ? null : new G110(field("estorno_credito")); }
 public NfeComplementIbsCbs setEstornoCredito(G110 value) { put("estorno_credito", value == null ? null : value.toJson()); return this; }
 public NfeComplementIbsCbsBaseCalculo getBaseCalculo() { return (field("base_calculo")).isNull() || (field("base_calculo")).isMissingNode() ? null : new NfeComplementIbsCbsBaseCalculo(field("base_calculo")); }
 public NfeComplementIbsCbs setBaseCalculo(NfeComplementIbsCbsBaseCalculo value) { put("base_calculo", value == null ? null : value.toJson()); return this; }
}
