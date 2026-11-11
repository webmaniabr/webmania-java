package com.webmania.sdk.model.api2nfseissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/nfse-issuance.openapi.json; see contract-provenance.json. */
public final class NfseDocumentedGroup516 extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("status", "modelo", "versao", "ambientes", "autenticacao", "emissao", "funcoes", "codigo_servico", "parametros_disponiveis");
 public NfseDocumentedGroup516() { super(FIELDS); }
 public NfseDocumentedGroup516(JsonNode node) { super(node, FIELDS); }
 public Boolean getStatus() { return booleanValue(field("status")); }
 public NfseDocumentedGroup516 setStatus(Boolean value) { put("status", Json.scalar(value)); return this; }
 public String getModelo() { return stringValue(field("modelo")); }
 public NfseDocumentedGroup516 setModelo(String value) { put("modelo", Json.scalar(value)); return this; }
 public String getVersao() { return stringValue(field("versao")); }
 public NfseDocumentedGroup516 setVersao(String value) { put("versao", Json.scalar(value)); return this; }
 public java.util.List<JsonValue> getAmbientes() { return list(field("ambientes"), v -> (v).isNull() || (v).isMissingNode() ? null : new JsonValue(v)); }
 public NfseDocumentedGroup516 setAmbientes(java.util.List<JsonValue> value) { put("ambientes", array(value, v -> v == null ? null : v.toJson())); return this; }
 public java.util.List<JsonValue> getAutenticacao() { return list(field("autenticacao"), v -> (v).isNull() || (v).isMissingNode() ? null : new JsonValue(v)); }
 public NfseDocumentedGroup516 setAutenticacao(java.util.List<JsonValue> value) { put("autenticacao", array(value, v -> v == null ? null : v.toJson())); return this; }
 public java.util.List<JsonValue> getEmissao() { return list(field("emissao"), v -> (v).isNull() || (v).isMissingNode() ? null : new JsonValue(v)); }
 public NfseDocumentedGroup516 setEmissao(java.util.List<JsonValue> value) { put("emissao", array(value, v -> v == null ? null : v.toJson())); return this; }
 public java.util.List<JsonValue> getFuncoes() { return list(field("funcoes"), v -> (v).isNull() || (v).isMissingNode() ? null : new JsonValue(v)); }
 public NfseDocumentedGroup516 setFuncoes(java.util.List<JsonValue> value) { put("funcoes", array(value, v -> v == null ? null : v.toJson())); return this; }
 public java.util.List<JsonValue> getCodigoServico() { return list(field("codigo_servico"), v -> (v).isNull() || (v).isMissingNode() ? null : new JsonValue(v)); }
 public NfseDocumentedGroup516 setCodigoServico(java.util.List<JsonValue> value) { put("codigo_servico", array(value, v -> v == null ? null : v.toJson())); return this; }
 public NfseDocumentedGroup516ParametrosDisponiveis getParametrosDisponiveis() { return (field("parametros_disponiveis")).isNull() || (field("parametros_disponiveis")).isMissingNode() ? null : new NfseDocumentedGroup516ParametrosDisponiveis(field("parametros_disponiveis")); }
 public NfseDocumentedGroup516 setParametrosDisponiveis(NfseDocumentedGroup516ParametrosDisponiveis value) { put("parametros_disponiveis", value == null ? null : value.toJson()); return this; }
}
