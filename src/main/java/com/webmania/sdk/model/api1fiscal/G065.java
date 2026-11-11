package com.webmania.sdk.model.api1fiscal;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api1/fiscal.openapi.json; see contract-provenance.json. */
public final class G065 extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("situacao_tributaria", "classificacao_tributaria", "situacao_tributaria_regular", "classificacao_tributaria_regular", "ibs_estadual", "ibs_municipal", "cbs", "credito_presumido");
 public G065() { super(FIELDS); }
 public G065(JsonNode node) { super(node, FIELDS); }
 public String getSituacaoTributaria() { return stringValue(field("situacao_tributaria")); }
 public G065 setSituacaoTributaria(String value) { put("situacao_tributaria", Json.scalar(value)); return this; }
 public String getClassificacaoTributaria() { return stringValue(field("classificacao_tributaria")); }
 public G065 setClassificacaoTributaria(String value) { put("classificacao_tributaria", Json.scalar(value)); return this; }
 public String getSituacaoTributariaRegular() { return stringValue(field("situacao_tributaria_regular")); }
 public G065 setSituacaoTributariaRegular(String value) { put("situacao_tributaria_regular", Json.scalar(value)); return this; }
 public String getClassificacaoTributariaRegular() { return stringValue(field("classificacao_tributaria_regular")); }
 public G065 setClassificacaoTributariaRegular(String value) { put("classificacao_tributaria_regular", Json.scalar(value)); return this; }
 public G054 getIbsEstadual() { return (field("ibs_estadual")).isNull() || (field("ibs_estadual")).isMissingNode() ? null : new G054(field("ibs_estadual")); }
 public G065 setIbsEstadual(G054 value) { put("ibs_estadual", value == null ? null : value.toJson()); return this; }
 public G054 getIbsMunicipal() { return (field("ibs_municipal")).isNull() || (field("ibs_municipal")).isMissingNode() ? null : new G054(field("ibs_municipal")); }
 public G065 setIbsMunicipal(G054 value) { put("ibs_municipal", value == null ? null : value.toJson()); return this; }
 public G054 getCbs() { return (field("cbs")).isNull() || (field("cbs")).isMissingNode() ? null : new G054(field("cbs")); }
 public G065 setCbs(G054 value) { put("cbs", value == null ? null : value.toJson()); return this; }
 public String getCreditoPresumido() { return stringValue(field("credito_presumido")); }
 public G065 setCreditoPresumido(String value) { put("credito_presumido", Json.scalar(value)); return this; }
}
