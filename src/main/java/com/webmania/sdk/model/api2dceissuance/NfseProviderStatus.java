package com.webmania.sdk.model.api2dceissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/dce-issuance.openapi.json; see contract-provenance.json. */
public final class NfseProviderStatus extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("status", "modelo", "versao", "ambientes", "autenticacao", "emissao", "funcoes", "pdf_nfse", "pdf_sincrono", "codigo_servico", "parametros_disponiveis");
 public NfseProviderStatus() { super(FIELDS); }
 public NfseProviderStatus(JsonNode node) { super(node, FIELDS); }
 public JsonValue getStatus() { return (field("status")).isNull() || (field("status")).isMissingNode() ? null : new JsonValue(field("status")); }
 public NfseProviderStatus setStatus(JsonValue value) { put("status", value == null ? null : value.toJson()); return this; }
 public String getModelo() { return stringValue(field("modelo")); }
 public NfseProviderStatus setModelo(String value) { put("modelo", Json.scalar(value)); return this; }
 public String getVersao() { return stringValue(field("versao")); }
 public NfseProviderStatus setVersao(String value) { put("versao", Json.scalar(value)); return this; }
 public java.util.List<java.math.BigInteger> getAmbientes() { return list(field("ambientes"), v -> integerValue(v)); }
 public NfseProviderStatus setAmbientes(java.util.List<java.math.BigInteger> value) { put("ambientes", array(value, v -> Json.scalar(v))); return this; }
 public java.util.List<String> getAutenticacao() { return list(field("autenticacao"), v -> stringValue(v)); }
 public NfseProviderStatus setAutenticacao(java.util.List<String> value) { put("autenticacao", array(value, v -> Json.scalar(v))); return this; }
 public java.util.List<String> getEmissao() { return list(field("emissao"), v -> stringValue(v)); }
 public NfseProviderStatus setEmissao(java.util.List<String> value) { put("emissao", array(value, v -> Json.scalar(v))); return this; }
 public java.util.List<String> getFuncoes() { return list(field("funcoes"), v -> stringValue(v)); }
 public NfseProviderStatus setFuncoes(java.util.List<String> value) { put("funcoes", array(value, v -> Json.scalar(v))); return this; }
 public Boolean getPdfNfse() { return booleanValue(field("pdf_nfse")); }
 public NfseProviderStatus setPdfNfse(Boolean value) { put("pdf_nfse", Json.scalar(value)); return this; }
 public Boolean getPdfSincrono() { return booleanValue(field("pdf_sincrono")); }
 public NfseProviderStatus setPdfSincrono(Boolean value) { put("pdf_sincrono", Json.scalar(value)); return this; }
 public java.util.List<NfseServiceCode> getCodigoServico() { return list(field("codigo_servico"), v -> (v).isNull() || (v).isMissingNode() ? null : new NfseServiceCode(v)); }
 public NfseProviderStatus setCodigoServico(java.util.List<NfseServiceCode> value) { put("codigo_servico", array(value, v -> v == null ? null : v.toJson())); return this; }
 public NfseParameterRequirements getParametrosDisponiveis() { return (field("parametros_disponiveis")).isNull() || (field("parametros_disponiveis")).isMissingNode() ? null : new NfseParameterRequirements(field("parametros_disponiveis")); }
 public NfseProviderStatus setParametrosDisponiveis(NfseParameterRequirements value) { put("parametros_disponiveis", value == null ? null : value.toJson()); return this; }
}
