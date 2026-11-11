package com.webmania.sdk.model.api2monitormanagement;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/monitor-management.openapi.json; see contract-provenance.json. */
public final class MonitorUpdateCompanyRequest extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("cnpj", "cpf", "razao_social", "cep", "im", "certificado_base64", "certificado_senha", "modelos_download", "categorias_download", "ambiente_download", "url_notificacao", "dfe_retroativas", "status");
 public MonitorUpdateCompanyRequest() { super(FIELDS); }
 public MonitorUpdateCompanyRequest(JsonNode node) { super(node, FIELDS); }
 public String getCnpj() { return stringValue(field("cnpj")); }
 public MonitorUpdateCompanyRequest setCnpj(String value) { put("cnpj", Json.scalar(value)); return this; }
 public String getCpf() { return stringValue(field("cpf")); }
 public MonitorUpdateCompanyRequest setCpf(String value) { put("cpf", Json.scalar(value)); return this; }
 public String getRazaoSocial() { return stringValue(field("razao_social")); }
 public MonitorUpdateCompanyRequest setRazaoSocial(String value) { put("razao_social", Json.scalar(value)); return this; }
 public String getCep() { return stringValue(field("cep")); }
 public MonitorUpdateCompanyRequest setCep(String value) { put("cep", Json.scalar(value)); return this; }
 public String getIm() { return stringValue(field("im")); }
 public MonitorUpdateCompanyRequest setIm(String value) { put("im", Json.scalar(value)); return this; }
 public String getCertificadoBase64() { return stringValue(field("certificado_base64")); }
 public MonitorUpdateCompanyRequest setCertificadoBase64(String value) { put("certificado_base64", Json.scalar(value)); return this; }
 public String getCertificadoSenha() { return stringValue(field("certificado_senha")); }
 public MonitorUpdateCompanyRequest setCertificadoSenha(String value) { put("certificado_senha", Json.scalar(value)); return this; }
 public java.util.List<String> getModelosDownload() { return list(field("modelos_download"), v -> stringValue(v)); }
 public MonitorUpdateCompanyRequest setModelosDownload(java.util.List<String> value) { put("modelos_download", array(value, v -> Json.scalar(v))); return this; }
 public java.math.BigInteger getCategoriasDownload() { return integerValue(field("categorias_download")); }
 public MonitorUpdateCompanyRequest setCategoriasDownload(java.math.BigInteger value) { put("categorias_download", Json.scalar(value)); return this; }
 public MonitorUpdateCompanyRequestAmbienteDownload getAmbienteDownload() { return (field("ambiente_download")).isNull() || (field("ambiente_download")).isMissingNode() ? null : new MonitorUpdateCompanyRequestAmbienteDownload(field("ambiente_download")); }
 public MonitorUpdateCompanyRequest setAmbienteDownload(MonitorUpdateCompanyRequestAmbienteDownload value) { put("ambiente_download", value == null ? null : value.toJson()); return this; }
 public String getUrlNotificacao() { return stringValue(field("url_notificacao")); }
 public MonitorUpdateCompanyRequest setUrlNotificacao(String value) { put("url_notificacao", Json.scalar(value)); return this; }
 public Boolean getDfeRetroativas() { return booleanValue(field("dfe_retroativas")); }
 public MonitorUpdateCompanyRequest setDfeRetroativas(Boolean value) { put("dfe_retroativas", Json.scalar(value)); return this; }
 public MonitorUpdateCompanyRequestStatus getStatus() { return (field("status")).isNull() || (field("status")).isMissingNode() ? null : new MonitorUpdateCompanyRequestStatus(field("status")); }
 public MonitorUpdateCompanyRequest setStatus(MonitorUpdateCompanyRequestStatus value) { put("status", value == null ? null : value.toJson()); return this; }
}
