package com.webmania.sdk.model.api2dceissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/dce-issuance.openapi.json; see contract-provenance.json. */
public final class EmitterIssueDcePayloadEmitente extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("bairro", "cep", "cnpj", "codigo_municipio", "complemento", "cpf", "endereco", "identificacao_alternativa", "logradouro", "municipio", "nome_completo", "numero", "razao_social", "telefone", "uf");
 public EmitterIssueDcePayloadEmitente() { super(FIELDS); }
 public EmitterIssueDcePayloadEmitente(JsonNode node) { super(node, FIELDS); }
 public String getBairro() { return stringValue(field("bairro")); }
 public EmitterIssueDcePayloadEmitente setBairro(String value) { put("bairro", Json.scalar(value)); return this; }
 public String getCep() { return stringValue(field("cep")); }
 public EmitterIssueDcePayloadEmitente setCep(String value) { put("cep", Json.scalar(value)); return this; }
 public String getCnpj() { return stringValue(field("cnpj")); }
 public EmitterIssueDcePayloadEmitente setCnpj(String value) { put("cnpj", Json.scalar(value)); return this; }
 public String getCodigoMunicipio() { return stringValue(field("codigo_municipio")); }
 public EmitterIssueDcePayloadEmitente setCodigoMunicipio(String value) { put("codigo_municipio", Json.scalar(value)); return this; }
 public EmitterIssueDcePayloadEmitenteComplemento getComplemento() { return (field("complemento")).isNull() || (field("complemento")).isMissingNode() ? null : new EmitterIssueDcePayloadEmitenteComplemento(field("complemento")); }
 public EmitterIssueDcePayloadEmitente setComplemento(EmitterIssueDcePayloadEmitenteComplemento value) { put("complemento", value == null ? null : value.toJson()); return this; }
 public String getCpf() { return stringValue(field("cpf")); }
 public EmitterIssueDcePayloadEmitente setCpf(String value) { put("cpf", Json.scalar(value)); return this; }
 public java.util.List<JsonValue> getEndereco() { return list(field("endereco"), v -> (v).isNull() || (v).isMissingNode() ? null : new JsonValue(v)); }
 public EmitterIssueDcePayloadEmitente setEndereco(java.util.List<JsonValue> value) { put("endereco", array(value, v -> v == null ? null : v.toJson())); return this; }
 public String getIdentificacaoAlternativa() { return stringValue(field("identificacao_alternativa")); }
 public EmitterIssueDcePayloadEmitente setIdentificacaoAlternativa(String value) { put("identificacao_alternativa", Json.scalar(value)); return this; }
 public String getLogradouro() { return stringValue(field("logradouro")); }
 public EmitterIssueDcePayloadEmitente setLogradouro(String value) { put("logradouro", Json.scalar(value)); return this; }
 public String getMunicipio() { return stringValue(field("municipio")); }
 public EmitterIssueDcePayloadEmitente setMunicipio(String value) { put("municipio", Json.scalar(value)); return this; }
 public String getNomeCompleto() { return stringValue(field("nome_completo")); }
 public EmitterIssueDcePayloadEmitente setNomeCompleto(String value) { put("nome_completo", Json.scalar(value)); return this; }
 public String getNumero() { return stringValue(field("numero")); }
 public EmitterIssueDcePayloadEmitente setNumero(String value) { put("numero", Json.scalar(value)); return this; }
 public String getRazaoSocial() { return stringValue(field("razao_social")); }
 public EmitterIssueDcePayloadEmitente setRazaoSocial(String value) { put("razao_social", Json.scalar(value)); return this; }
 public EmitterIssueDcePayloadEmitenteTelefone getTelefone() { return (field("telefone")).isNull() || (field("telefone")).isMissingNode() ? null : new EmitterIssueDcePayloadEmitenteTelefone(field("telefone")); }
 public EmitterIssueDcePayloadEmitente setTelefone(EmitterIssueDcePayloadEmitenteTelefone value) { put("telefone", value == null ? null : value.toJson()); return this; }
 public String getUf() { return stringValue(field("uf")); }
 public EmitterIssueDcePayloadEmitente setUf(String value) { put("uf", Json.scalar(value)); return this; }
}
