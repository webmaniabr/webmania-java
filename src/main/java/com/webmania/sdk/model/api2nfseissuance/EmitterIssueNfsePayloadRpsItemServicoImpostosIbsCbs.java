package com.webmania.sdk.model.api2nfseissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/nfse-issuance.openapi.json; see contract-provenance.json. */
public final class EmitterIssueNfsePayloadRpsItemServicoImpostosIbsCbs extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("cbs", "classificacao_tributaria", "classificacao_tributaria_regular", "codigo_localidade_incidencia", "credito_presumido", "ibs_estadual", "ibs_municipal", "pRedutor", "p_redutor", "situacao_tributaria", "situacao_tributaria_regular", "transferencia_credito");
 public EmitterIssueNfsePayloadRpsItemServicoImpostosIbsCbs() { super(FIELDS); }
 public EmitterIssueNfsePayloadRpsItemServicoImpostosIbsCbs(JsonNode node) { super(node, FIELDS); }
 public EmitterIssueNfsePayloadRpsItemServicoImpostosIbsCbsCbs getCbs() { return (field("cbs")).isNull() || (field("cbs")).isMissingNode() ? null : new EmitterIssueNfsePayloadRpsItemServicoImpostosIbsCbsCbs(field("cbs")); }
 public EmitterIssueNfsePayloadRpsItemServicoImpostosIbsCbs setCbs(EmitterIssueNfsePayloadRpsItemServicoImpostosIbsCbsCbs value) { put("cbs", value == null ? null : value.toJson()); return this; }
 public String getClassificacaoTributaria() { return stringValue(field("classificacao_tributaria")); }
 public EmitterIssueNfsePayloadRpsItemServicoImpostosIbsCbs setClassificacaoTributaria(String value) { put("classificacao_tributaria", Json.scalar(value)); return this; }
 public String getClassificacaoTributariaRegular() { return stringValue(field("classificacao_tributaria_regular")); }
 public EmitterIssueNfsePayloadRpsItemServicoImpostosIbsCbs setClassificacaoTributariaRegular(String value) { put("classificacao_tributaria_regular", Json.scalar(value)); return this; }
 public String getCodigoLocalidadeIncidencia() { return stringValue(field("codigo_localidade_incidencia")); }
 public EmitterIssueNfsePayloadRpsItemServicoImpostosIbsCbs setCodigoLocalidadeIncidencia(String value) { put("codigo_localidade_incidencia", Json.scalar(value)); return this; }
 public EmitterIssueNfsePayloadRpsItemServicoImpostosIbsCbsCreditoPresumido getCreditoPresumido() { return (field("credito_presumido")).isNull() || (field("credito_presumido")).isMissingNode() ? null : new EmitterIssueNfsePayloadRpsItemServicoImpostosIbsCbsCreditoPresumido(field("credito_presumido")); }
 public EmitterIssueNfsePayloadRpsItemServicoImpostosIbsCbs setCreditoPresumido(EmitterIssueNfsePayloadRpsItemServicoImpostosIbsCbsCreditoPresumido value) { put("credito_presumido", value == null ? null : value.toJson()); return this; }
 public EmitterIssueNfsePayloadRpsItemServicoImpostosIbsCbsIbsEstadual getIbsEstadual() { return (field("ibs_estadual")).isNull() || (field("ibs_estadual")).isMissingNode() ? null : new EmitterIssueNfsePayloadRpsItemServicoImpostosIbsCbsIbsEstadual(field("ibs_estadual")); }
 public EmitterIssueNfsePayloadRpsItemServicoImpostosIbsCbs setIbsEstadual(EmitterIssueNfsePayloadRpsItemServicoImpostosIbsCbsIbsEstadual value) { put("ibs_estadual", value == null ? null : value.toJson()); return this; }
 public EmitterIssueNfsePayloadRpsItemServicoImpostosIbsCbsIbsMunicipal getIbsMunicipal() { return (field("ibs_municipal")).isNull() || (field("ibs_municipal")).isMissingNode() ? null : new EmitterIssueNfsePayloadRpsItemServicoImpostosIbsCbsIbsMunicipal(field("ibs_municipal")); }
 public EmitterIssueNfsePayloadRpsItemServicoImpostosIbsCbs setIbsMunicipal(EmitterIssueNfsePayloadRpsItemServicoImpostosIbsCbsIbsMunicipal value) { put("ibs_municipal", value == null ? null : value.toJson()); return this; }
 public EmitterIssueNfsePayloadRpsItemServicoImpostosIbsCbsPRedutor getPRedutor() { return (field("pRedutor")).isNull() || (field("pRedutor")).isMissingNode() ? null : new EmitterIssueNfsePayloadRpsItemServicoImpostosIbsCbsPRedutor(field("pRedutor")); }
 public EmitterIssueNfsePayloadRpsItemServicoImpostosIbsCbs setPRedutor(EmitterIssueNfsePayloadRpsItemServicoImpostosIbsCbsPRedutor value) { put("pRedutor", value == null ? null : value.toJson()); return this; }
 public EmitterIssueNfsePayloadRpsItemServicoImpostosIbsCbsPRedutor194675 getPRedutor194675() { return (field("p_redutor")).isNull() || (field("p_redutor")).isMissingNode() ? null : new EmitterIssueNfsePayloadRpsItemServicoImpostosIbsCbsPRedutor194675(field("p_redutor")); }
 public EmitterIssueNfsePayloadRpsItemServicoImpostosIbsCbs setPRedutor194675(EmitterIssueNfsePayloadRpsItemServicoImpostosIbsCbsPRedutor194675 value) { put("p_redutor", value == null ? null : value.toJson()); return this; }
 public String getSituacaoTributaria() { return stringValue(field("situacao_tributaria")); }
 public EmitterIssueNfsePayloadRpsItemServicoImpostosIbsCbs setSituacaoTributaria(String value) { put("situacao_tributaria", Json.scalar(value)); return this; }
 public String getSituacaoTributariaRegular() { return stringValue(field("situacao_tributaria_regular")); }
 public EmitterIssueNfsePayloadRpsItemServicoImpostosIbsCbs setSituacaoTributariaRegular(String value) { put("situacao_tributaria_regular", Json.scalar(value)); return this; }
 public EmitterIssueNfsePayloadRpsItemServicoImpostosIbsCbsTransferenciaCredito getTransferenciaCredito() { return (field("transferencia_credito")).isNull() || (field("transferencia_credito")).isMissingNode() ? null : new EmitterIssueNfsePayloadRpsItemServicoImpostosIbsCbsTransferenciaCredito(field("transferencia_credito")); }
 public EmitterIssueNfsePayloadRpsItemServicoImpostosIbsCbs setTransferenciaCredito(EmitterIssueNfsePayloadRpsItemServicoImpostosIbsCbsTransferenciaCredito value) { put("transferencia_credito", value == null ? null : value.toJson()); return this; }
}
