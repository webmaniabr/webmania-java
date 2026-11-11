package com.webmania.sdk.model.api1fiscal;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api1/fiscal.openapi.json; see contract-provenance.json. */
public final class G049 extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("cenario", "tipo_pessoa", "situacao_tributaria", "classificacao_tributaria", "situacao_tributaria_regular", "classificacao_tributaria_regular", "ibs_estadual", "ibs_municipal", "cbs", "credito_presumido");
 public G049() { super(FIELDS); }
 public G049(JsonNode node) { super(node, FIELDS); }
 public String getCenario() { return stringValue(field("cenario")); }
 public G049 setCenario(String value) { put("cenario", Json.scalar(value)); return this; }
 public String getTipoPessoa() { return stringValue(field("tipo_pessoa")); }
 public G049 setTipoPessoa(String value) { put("tipo_pessoa", Json.scalar(value)); return this; }
 public String getSituacaoTributaria() { return stringValue(field("situacao_tributaria")); }
 public G049 setSituacaoTributaria(String value) { put("situacao_tributaria", Json.scalar(value)); return this; }
 public String getClassificacaoTributaria() { return stringValue(field("classificacao_tributaria")); }
 public G049 setClassificacaoTributaria(String value) { put("classificacao_tributaria", Json.scalar(value)); return this; }
 public String getSituacaoTributariaRegular() { return stringValue(field("situacao_tributaria_regular")); }
 public G049 setSituacaoTributariaRegular(String value) { put("situacao_tributaria_regular", Json.scalar(value)); return this; }
 public String getClassificacaoTributariaRegular() { return stringValue(field("classificacao_tributaria_regular")); }
 public G049 setClassificacaoTributariaRegular(String value) { put("classificacao_tributaria_regular", Json.scalar(value)); return this; }
 public G050 getIbsEstadual() { return (field("ibs_estadual")).isNull() || (field("ibs_estadual")).isMissingNode() ? null : new G050(field("ibs_estadual")); }
 public G049 setIbsEstadual(G050 value) { put("ibs_estadual", value == null ? null : value.toJson()); return this; }
 public G050 getIbsMunicipal() { return (field("ibs_municipal")).isNull() || (field("ibs_municipal")).isMissingNode() ? null : new G050(field("ibs_municipal")); }
 public G049 setIbsMunicipal(G050 value) { put("ibs_municipal", value == null ? null : value.toJson()); return this; }
 public G050 getCbs() { return (field("cbs")).isNull() || (field("cbs")).isMissingNode() ? null : new G050(field("cbs")); }
 public G049 setCbs(G050 value) { put("cbs", value == null ? null : value.toJson()); return this; }
 public G051 getCreditoPresumido() { return (field("credito_presumido")).isNull() || (field("credito_presumido")).isMissingNode() ? null : new G051(field("credito_presumido")); }
 public G049 setCreditoPresumido(G051 value) { put("credito_presumido", value == null ? null : value.toJson()); return this; }
}
