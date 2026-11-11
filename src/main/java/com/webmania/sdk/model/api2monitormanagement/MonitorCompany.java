package com.webmania.sdk.model.api2monitormanagement;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/monitor-management.openapi.json; see contract-provenance.json. */
public final class MonitorCompany extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("uuid", "status", "cpf", "cnpj", "nome_completo", "razao_social", "im", "endereco", "modelos_download", "categorias_download", "ambiente_download", "certificado_vencimento", "url_notificacao", "dfe_retroativas", "dfe_retroativas_total");
 public MonitorCompany() { super(FIELDS); }
 public MonitorCompany(JsonNode node) { super(node, FIELDS); }
 public String getUuid() { return stringValue(field("uuid")); }
 public MonitorCompany setUuid(String value) { put("uuid", Json.scalar(value)); return this; }
 public java.math.BigInteger getStatus() { return integerValue(field("status")); }
 public MonitorCompany setStatus(java.math.BigInteger value) { put("status", Json.scalar(value)); return this; }
 public String getCpf() { return stringValue(field("cpf")); }
 public MonitorCompany setCpf(String value) { put("cpf", Json.scalar(value)); return this; }
 public String getCnpj() { return stringValue(field("cnpj")); }
 public MonitorCompany setCnpj(String value) { put("cnpj", Json.scalar(value)); return this; }
 public String getNomeCompleto() { return stringValue(field("nome_completo")); }
 public MonitorCompany setNomeCompleto(String value) { put("nome_completo", Json.scalar(value)); return this; }
 public String getRazaoSocial() { return stringValue(field("razao_social")); }
 public MonitorCompany setRazaoSocial(String value) { put("razao_social", Json.scalar(value)); return this; }
 public String getIm() { return stringValue(field("im")); }
 public MonitorCompany setIm(String value) { put("im", Json.scalar(value)); return this; }
 public MonitorAddress getEndereco() { return (field("endereco")).isNull() || (field("endereco")).isMissingNode() ? null : new MonitorAddress(field("endereco")); }
 public MonitorCompany setEndereco(MonitorAddress value) { put("endereco", value == null ? null : value.toJson()); return this; }
 public java.util.List<String> getModelosDownload() { return list(field("modelos_download"), v -> stringValue(v)); }
 public MonitorCompany setModelosDownload(java.util.List<String> value) { put("modelos_download", array(value, v -> Json.scalar(v))); return this; }
 public java.math.BigInteger getCategoriasDownload() { return integerValue(field("categorias_download")); }
 public MonitorCompany setCategoriasDownload(java.math.BigInteger value) { put("categorias_download", Json.scalar(value)); return this; }
 public java.math.BigInteger getAmbienteDownload() { return integerValue(field("ambiente_download")); }
 public MonitorCompany setAmbienteDownload(java.math.BigInteger value) { put("ambiente_download", Json.scalar(value)); return this; }
 public String getCertificadoVencimento() { return stringValue(field("certificado_vencimento")); }
 public MonitorCompany setCertificadoVencimento(String value) { put("certificado_vencimento", Json.scalar(value)); return this; }
 public String getUrlNotificacao() { return stringValue(field("url_notificacao")); }
 public MonitorCompany setUrlNotificacao(String value) { put("url_notificacao", Json.scalar(value)); return this; }
 public Boolean getDfeRetroativas() { return booleanValue(field("dfe_retroativas")); }
 public MonitorCompany setDfeRetroativas(Boolean value) { put("dfe_retroativas", Json.scalar(value)); return this; }
 public java.math.BigInteger getDfeRetroativasTotal() { return integerValue(field("dfe_retroativas_total")); }
 public MonitorCompany setDfeRetroativasTotal(java.math.BigInteger value) { put("dfe_retroativas_total", Json.scalar(value)); return this; }
}
