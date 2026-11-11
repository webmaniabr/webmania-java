package com.webmania.sdk.model.api2nfseissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/nfse-issuance.openapi.json; see contract-provenance.json. */
public final class NfseServiceGroupImpostosIbsCbs extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("cbs", "classificacao_tributaria", "classificacao_tributaria_regular", "codigo_localidade_incidencia", "credito_presumido", "ibs_estadual", "ibs_municipal", "pRedutor", "p_redutor", "situacao_tributaria", "situacao_tributaria_regular", "transferencia_credito");
 public NfseServiceGroupImpostosIbsCbs() { super(FIELDS); }
 public NfseServiceGroupImpostosIbsCbs(JsonNode node) { super(node, FIELDS); }
 public NfseServiceGroupImpostosIbsCbsCbs getCbs() { return (field("cbs")).isNull() || (field("cbs")).isMissingNode() ? null : new NfseServiceGroupImpostosIbsCbsCbs(field("cbs")); }
 public NfseServiceGroupImpostosIbsCbs setCbs(NfseServiceGroupImpostosIbsCbsCbs value) { put("cbs", value == null ? null : value.toJson()); return this; }
 public String getClassificacaoTributaria() { return stringValue(field("classificacao_tributaria")); }
 public NfseServiceGroupImpostosIbsCbs setClassificacaoTributaria(String value) { put("classificacao_tributaria", Json.scalar(value)); return this; }
 public String getClassificacaoTributariaRegular() { return stringValue(field("classificacao_tributaria_regular")); }
 public NfseServiceGroupImpostosIbsCbs setClassificacaoTributariaRegular(String value) { put("classificacao_tributaria_regular", Json.scalar(value)); return this; }
 public String getCodigoLocalidadeIncidencia() { return stringValue(field("codigo_localidade_incidencia")); }
 public NfseServiceGroupImpostosIbsCbs setCodigoLocalidadeIncidencia(String value) { put("codigo_localidade_incidencia", Json.scalar(value)); return this; }
 public NfseServiceGroupImpostosIbsCbsCreditoPresumido getCreditoPresumido() { return (field("credito_presumido")).isNull() || (field("credito_presumido")).isMissingNode() ? null : new NfseServiceGroupImpostosIbsCbsCreditoPresumido(field("credito_presumido")); }
 public NfseServiceGroupImpostosIbsCbs setCreditoPresumido(NfseServiceGroupImpostosIbsCbsCreditoPresumido value) { put("credito_presumido", value == null ? null : value.toJson()); return this; }
 public NfseServiceGroupImpostosIbsCbsIbsEstadual getIbsEstadual() { return (field("ibs_estadual")).isNull() || (field("ibs_estadual")).isMissingNode() ? null : new NfseServiceGroupImpostosIbsCbsIbsEstadual(field("ibs_estadual")); }
 public NfseServiceGroupImpostosIbsCbs setIbsEstadual(NfseServiceGroupImpostosIbsCbsIbsEstadual value) { put("ibs_estadual", value == null ? null : value.toJson()); return this; }
 public NfseServiceGroupImpostosIbsCbsIbsMunicipal getIbsMunicipal() { return (field("ibs_municipal")).isNull() || (field("ibs_municipal")).isMissingNode() ? null : new NfseServiceGroupImpostosIbsCbsIbsMunicipal(field("ibs_municipal")); }
 public NfseServiceGroupImpostosIbsCbs setIbsMunicipal(NfseServiceGroupImpostosIbsCbsIbsMunicipal value) { put("ibs_municipal", value == null ? null : value.toJson()); return this; }
 public NfseServiceGroupImpostosIbsCbsPRedutor getPRedutor() { return (field("pRedutor")).isNull() || (field("pRedutor")).isMissingNode() ? null : new NfseServiceGroupImpostosIbsCbsPRedutor(field("pRedutor")); }
 public NfseServiceGroupImpostosIbsCbs setPRedutor(NfseServiceGroupImpostosIbsCbsPRedutor value) { put("pRedutor", value == null ? null : value.toJson()); return this; }
 public NfseServiceGroupImpostosIbsCbsPRedutor194675 getPRedutor194675() { return (field("p_redutor")).isNull() || (field("p_redutor")).isMissingNode() ? null : new NfseServiceGroupImpostosIbsCbsPRedutor194675(field("p_redutor")); }
 public NfseServiceGroupImpostosIbsCbs setPRedutor194675(NfseServiceGroupImpostosIbsCbsPRedutor194675 value) { put("p_redutor", value == null ? null : value.toJson()); return this; }
 public String getSituacaoTributaria() { return stringValue(field("situacao_tributaria")); }
 public NfseServiceGroupImpostosIbsCbs setSituacaoTributaria(String value) { put("situacao_tributaria", Json.scalar(value)); return this; }
 public String getSituacaoTributariaRegular() { return stringValue(field("situacao_tributaria_regular")); }
 public NfseServiceGroupImpostosIbsCbs setSituacaoTributariaRegular(String value) { put("situacao_tributaria_regular", Json.scalar(value)); return this; }
 public NfseServiceGroupImpostosIbsCbsTransferenciaCredito getTransferenciaCredito() { return (field("transferencia_credito")).isNull() || (field("transferencia_credito")).isMissingNode() ? null : new NfseServiceGroupImpostosIbsCbsTransferenciaCredito(field("transferencia_credito")); }
 public NfseServiceGroupImpostosIbsCbs setTransferenciaCredito(NfseServiceGroupImpostosIbsCbsTransferenciaCredito value) { put("transferencia_credito", value == null ? null : value.toJson()); return this; }
}
