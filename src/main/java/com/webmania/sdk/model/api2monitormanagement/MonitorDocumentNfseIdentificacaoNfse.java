package com.webmania.sdk.model.api2monitormanagement;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/monitor-management.openapi.json; see contract-provenance.json. */
public final class MonitorDocumentNfseIdentificacaoNfse extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("data_competencia", "rps", "codigo_verificacao", "chave", "provedor", "nfse_substituida");
 public MonitorDocumentNfseIdentificacaoNfse() { super(FIELDS); }
 public MonitorDocumentNfseIdentificacaoNfse(JsonNode node) { super(node, FIELDS); }
 public String getDataCompetencia() { return stringValue(field("data_competencia")); }
 public MonitorDocumentNfseIdentificacaoNfse setDataCompetencia(String value) { put("data_competencia", Json.scalar(value)); return this; }
 public MonitorDocumentNfseIdentificacaoNfseRps getRps() { return (field("rps")).isNull() || (field("rps")).isMissingNode() ? null : new MonitorDocumentNfseIdentificacaoNfseRps(field("rps")); }
 public MonitorDocumentNfseIdentificacaoNfse setRps(MonitorDocumentNfseIdentificacaoNfseRps value) { put("rps", value == null ? null : value.toJson()); return this; }
 public String getCodigoVerificacao() { return stringValue(field("codigo_verificacao")); }
 public MonitorDocumentNfseIdentificacaoNfse setCodigoVerificacao(String value) { put("codigo_verificacao", Json.scalar(value)); return this; }
 public String getChave() { return stringValue(field("chave")); }
 public MonitorDocumentNfseIdentificacaoNfse setChave(String value) { put("chave", Json.scalar(value)); return this; }
 public String getProvedor() { return stringValue(field("provedor")); }
 public MonitorDocumentNfseIdentificacaoNfse setProvedor(String value) { put("provedor", Json.scalar(value)); return this; }
 public MonitorDocumentNfseIdentificacaoNfseNfseSubstituida getNfseSubstituida() { return (field("nfse_substituida")).isNull() || (field("nfse_substituida")).isMissingNode() ? null : new MonitorDocumentNfseIdentificacaoNfseNfseSubstituida(field("nfse_substituida")); }
 public MonitorDocumentNfseIdentificacaoNfse setNfseSubstituida(MonitorDocumentNfseIdentificacaoNfseNfseSubstituida value) { put("nfse_substituida", value == null ? null : value.toJson()); return this; }
}
