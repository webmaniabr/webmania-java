package com.webmania.sdk.model.api1fiscal;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api1/fiscal.openapi.json; see contract-provenance.json. */
public final class TaxClassListIbsCbs extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("cenario", "tipo_pessoa", "situacao_tributaria", "classificacao_tributaria", "situacao_tributaria_regular", "classificacao_tributaria_regular", "ibs_estadual", "ibs_municipal", "cbs", "credito_presumido");
 public TaxClassListIbsCbs() { super(FIELDS); }
 public TaxClassListIbsCbs(JsonNode node) { super(node, FIELDS); }
 public String getCenario() { return stringValue(field("cenario")); }
 public TaxClassListIbsCbs setCenario(String value) { put("cenario", Json.scalar(value)); return this; }
 public String getTipoPessoa() { return stringValue(field("tipo_pessoa")); }
 public TaxClassListIbsCbs setTipoPessoa(String value) { put("tipo_pessoa", Json.scalar(value)); return this; }
 public String getSituacaoTributaria() { return stringValue(field("situacao_tributaria")); }
 public TaxClassListIbsCbs setSituacaoTributaria(String value) { put("situacao_tributaria", Json.scalar(value)); return this; }
 public String getClassificacaoTributaria() { return stringValue(field("classificacao_tributaria")); }
 public TaxClassListIbsCbs setClassificacaoTributaria(String value) { put("classificacao_tributaria", Json.scalar(value)); return this; }
 public String getSituacaoTributariaRegular() { return stringValue(field("situacao_tributaria_regular")); }
 public TaxClassListIbsCbs setSituacaoTributariaRegular(String value) { put("situacao_tributaria_regular", Json.scalar(value)); return this; }
 public String getClassificacaoTributariaRegular() { return stringValue(field("classificacao_tributaria_regular")); }
 public TaxClassListIbsCbs setClassificacaoTributariaRegular(String value) { put("classificacao_tributaria_regular", Json.scalar(value)); return this; }
 public TaxClassListIbsCbsDeferral getIbsEstadual() { return (field("ibs_estadual")).isNull() || (field("ibs_estadual")).isMissingNode() ? null : new TaxClassListIbsCbsDeferral(field("ibs_estadual")); }
 public TaxClassListIbsCbs setIbsEstadual(TaxClassListIbsCbsDeferral value) { put("ibs_estadual", value == null ? null : value.toJson()); return this; }
 public TaxClassListIbsCbsDeferral getIbsMunicipal() { return (field("ibs_municipal")).isNull() || (field("ibs_municipal")).isMissingNode() ? null : new TaxClassListIbsCbsDeferral(field("ibs_municipal")); }
 public TaxClassListIbsCbs setIbsMunicipal(TaxClassListIbsCbsDeferral value) { put("ibs_municipal", value == null ? null : value.toJson()); return this; }
 public TaxClassListIbsCbsDeferral getCbs() { return (field("cbs")).isNull() || (field("cbs")).isMissingNode() ? null : new TaxClassListIbsCbsDeferral(field("cbs")); }
 public TaxClassListIbsCbs setCbs(TaxClassListIbsCbsDeferral value) { put("cbs", value == null ? null : value.toJson()); return this; }
 public TaxClassListPresumedCredit getCreditoPresumido() { return (field("credito_presumido")).isNull() || (field("credito_presumido")).isMissingNode() ? null : new TaxClassListPresumedCredit(field("credito_presumido")); }
 public TaxClassListIbsCbs setCreditoPresumido(TaxClassListPresumedCredit value) { put("credito_presumido", value == null ? null : value.toJson()); return this; }
}
