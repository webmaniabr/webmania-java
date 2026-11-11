package com.webmania.sdk.model.api2dceissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/dce-issuance.openapi.json; see contract-provenance.json. */
public final class EmitterIssueDcePayloadCliente extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("bairro", "cep", "cnpj", "codigo_municipio", "codigo_pais", "complemento", "cpf", "email", "endereco", "identificacao_alternativa", "logradouro", "municipio", "nome_completo", "numero", "pais", "razao_social", "telefone", "uf");
 public EmitterIssueDcePayloadCliente() { super(FIELDS); }
 public EmitterIssueDcePayloadCliente(JsonNode node) { super(node, FIELDS); }
 public String getBairro() { return stringValue(field("bairro")); }
 public EmitterIssueDcePayloadCliente setBairro(String value) { put("bairro", Json.scalar(value)); return this; }
 public String getCep() { return stringValue(field("cep")); }
 public EmitterIssueDcePayloadCliente setCep(String value) { put("cep", Json.scalar(value)); return this; }
 public String getCnpj() { return stringValue(field("cnpj")); }
 public EmitterIssueDcePayloadCliente setCnpj(String value) { put("cnpj", Json.scalar(value)); return this; }
 public String getCodigoMunicipio() { return stringValue(field("codigo_municipio")); }
 public EmitterIssueDcePayloadCliente setCodigoMunicipio(String value) { put("codigo_municipio", Json.scalar(value)); return this; }
 public String getCodigoPais() { return stringValue(field("codigo_pais")); }
 public EmitterIssueDcePayloadCliente setCodigoPais(String value) { put("codigo_pais", Json.scalar(value)); return this; }
 public EmitterIssueDcePayloadClienteComplemento getComplemento() { return (field("complemento")).isNull() || (field("complemento")).isMissingNode() ? null : new EmitterIssueDcePayloadClienteComplemento(field("complemento")); }
 public EmitterIssueDcePayloadCliente setComplemento(EmitterIssueDcePayloadClienteComplemento value) { put("complemento", value == null ? null : value.toJson()); return this; }
 public String getCpf() { return stringValue(field("cpf")); }
 public EmitterIssueDcePayloadCliente setCpf(String value) { put("cpf", Json.scalar(value)); return this; }
 public EmitterIssueDcePayloadClienteEmail getEmail() { return (field("email")).isNull() || (field("email")).isMissingNode() ? null : new EmitterIssueDcePayloadClienteEmail(field("email")); }
 public EmitterIssueDcePayloadCliente setEmail(EmitterIssueDcePayloadClienteEmail value) { put("email", value == null ? null : value.toJson()); return this; }
 public java.util.List<JsonValue> getEndereco() { return list(field("endereco"), v -> (v).isNull() || (v).isMissingNode() ? null : new JsonValue(v)); }
 public EmitterIssueDcePayloadCliente setEndereco(java.util.List<JsonValue> value) { put("endereco", array(value, v -> v == null ? null : v.toJson())); return this; }
 public String getIdentificacaoAlternativa() { return stringValue(field("identificacao_alternativa")); }
 public EmitterIssueDcePayloadCliente setIdentificacaoAlternativa(String value) { put("identificacao_alternativa", Json.scalar(value)); return this; }
 public String getLogradouro() { return stringValue(field("logradouro")); }
 public EmitterIssueDcePayloadCliente setLogradouro(String value) { put("logradouro", Json.scalar(value)); return this; }
 public String getMunicipio() { return stringValue(field("municipio")); }
 public EmitterIssueDcePayloadCliente setMunicipio(String value) { put("municipio", Json.scalar(value)); return this; }
 public String getNomeCompleto() { return stringValue(field("nome_completo")); }
 public EmitterIssueDcePayloadCliente setNomeCompleto(String value) { put("nome_completo", Json.scalar(value)); return this; }
 public String getNumero() { return stringValue(field("numero")); }
 public EmitterIssueDcePayloadCliente setNumero(String value) { put("numero", Json.scalar(value)); return this; }
 public String getPais() { return stringValue(field("pais")); }
 public EmitterIssueDcePayloadCliente setPais(String value) { put("pais", Json.scalar(value)); return this; }
 public String getRazaoSocial() { return stringValue(field("razao_social")); }
 public EmitterIssueDcePayloadCliente setRazaoSocial(String value) { put("razao_social", Json.scalar(value)); return this; }
 public EmitterIssueDcePayloadClienteTelefone getTelefone() { return (field("telefone")).isNull() || (field("telefone")).isMissingNode() ? null : new EmitterIssueDcePayloadClienteTelefone(field("telefone")); }
 public EmitterIssueDcePayloadCliente setTelefone(EmitterIssueDcePayloadClienteTelefone value) { put("telefone", value == null ? null : value.toJson()); return this; }
 public String getUf() { return stringValue(field("uf")); }
 public EmitterIssueDcePayloadCliente setUf(String value) { put("uf", Json.scalar(value)); return this; }
}
