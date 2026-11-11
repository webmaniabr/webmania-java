package com.webmania.sdk.model.api2monitormanagement;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/monitor-management.openapi.json; see contract-provenance.json. */
public final class MonitorPerson extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("cnpj", "cpf", "razao_social", "nome_completo", "ie", "im", "endereco", "numero", "complemento", "bairro", "cep", "cidade", "uf", "telefone", "email");
 public MonitorPerson() { super(FIELDS); }
 public MonitorPerson(JsonNode node) { super(node, FIELDS); }
 public String getCnpj() { return stringValue(field("cnpj")); }
 public MonitorPerson setCnpj(String value) { put("cnpj", Json.scalar(value)); return this; }
 public String getCpf() { return stringValue(field("cpf")); }
 public MonitorPerson setCpf(String value) { put("cpf", Json.scalar(value)); return this; }
 public String getRazaoSocial() { return stringValue(field("razao_social")); }
 public MonitorPerson setRazaoSocial(String value) { put("razao_social", Json.scalar(value)); return this; }
 public String getNomeCompleto() { return stringValue(field("nome_completo")); }
 public MonitorPerson setNomeCompleto(String value) { put("nome_completo", Json.scalar(value)); return this; }
 public String getIe() { return stringValue(field("ie")); }
 public MonitorPerson setIe(String value) { put("ie", Json.scalar(value)); return this; }
 public String getIm() { return stringValue(field("im")); }
 public MonitorPerson setIm(String value) { put("im", Json.scalar(value)); return this; }
 public String getEndereco() { return stringValue(field("endereco")); }
 public MonitorPerson setEndereco(String value) { put("endereco", Json.scalar(value)); return this; }
 public String getNumero() { return stringValue(field("numero")); }
 public MonitorPerson setNumero(String value) { put("numero", Json.scalar(value)); return this; }
 public String getComplemento() { return stringValue(field("complemento")); }
 public MonitorPerson setComplemento(String value) { put("complemento", Json.scalar(value)); return this; }
 public String getBairro() { return stringValue(field("bairro")); }
 public MonitorPerson setBairro(String value) { put("bairro", Json.scalar(value)); return this; }
 public String getCep() { return stringValue(field("cep")); }
 public MonitorPerson setCep(String value) { put("cep", Json.scalar(value)); return this; }
 public String getCidade() { return stringValue(field("cidade")); }
 public MonitorPerson setCidade(String value) { put("cidade", Json.scalar(value)); return this; }
 public String getUf() { return stringValue(field("uf")); }
 public MonitorPerson setUf(String value) { put("uf", Json.scalar(value)); return this; }
 public String getTelefone() { return stringValue(field("telefone")); }
 public MonitorPerson setTelefone(String value) { put("telefone", Json.scalar(value)); return this; }
 public String getEmail() { return stringValue(field("email")); }
 public MonitorPerson setEmail(String value) { put("email", Json.scalar(value)); return this; }
}
