package com.webmania.sdk.model.api2cteissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/cte-issuance.openapi.json; see contract-provenance.json. */
public final class EmitterIssueCtePayloadDestinatario extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("bairro", "cep", "cidade", "cnpj", "codigo_pais", "complemento", "cpf", "email", "endereco", "ie", "isuf", "nome_razao", "numero", "telefone", "uf", "nome_fantasia");
 public EmitterIssueCtePayloadDestinatario() { super(FIELDS); }
 public EmitterIssueCtePayloadDestinatario(JsonNode node) { super(node, FIELDS); }
 public String getBairro() { return stringValue(field("bairro")); }
 public EmitterIssueCtePayloadDestinatario setBairro(String value) { put("bairro", Json.scalar(value)); return this; }
 public String getCep() { return stringValue(field("cep")); }
 public EmitterIssueCtePayloadDestinatario setCep(String value) { put("cep", Json.scalar(value)); return this; }
 public String getCidade() { return stringValue(field("cidade")); }
 public EmitterIssueCtePayloadDestinatario setCidade(String value) { put("cidade", Json.scalar(value)); return this; }
 public String getCnpj() { return stringValue(field("cnpj")); }
 public EmitterIssueCtePayloadDestinatario setCnpj(String value) { put("cnpj", Json.scalar(value)); return this; }
 public String getCodigoPais() { return stringValue(field("codigo_pais")); }
 public EmitterIssueCtePayloadDestinatario setCodigoPais(String value) { put("codigo_pais", Json.scalar(value)); return this; }
 public String getComplemento() { return stringValue(field("complemento")); }
 public EmitterIssueCtePayloadDestinatario setComplemento(String value) { put("complemento", Json.scalar(value)); return this; }
 public String getCpf() { return stringValue(field("cpf")); }
 public EmitterIssueCtePayloadDestinatario setCpf(String value) { put("cpf", Json.scalar(value)); return this; }
 public String getEmail() { return stringValue(field("email")); }
 public EmitterIssueCtePayloadDestinatario setEmail(String value) { put("email", Json.scalar(value)); return this; }
 public String getEndereco() { return stringValue(field("endereco")); }
 public EmitterIssueCtePayloadDestinatario setEndereco(String value) { put("endereco", Json.scalar(value)); return this; }
 public String getIe() { return stringValue(field("ie")); }
 public EmitterIssueCtePayloadDestinatario setIe(String value) { put("ie", Json.scalar(value)); return this; }
 public String getIsuf() { return stringValue(field("isuf")); }
 public EmitterIssueCtePayloadDestinatario setIsuf(String value) { put("isuf", Json.scalar(value)); return this; }
 public String getNomeRazao() { return stringValue(field("nome_razao")); }
 public EmitterIssueCtePayloadDestinatario setNomeRazao(String value) { put("nome_razao", Json.scalar(value)); return this; }
 public String getNumero() { return stringValue(field("numero")); }
 public EmitterIssueCtePayloadDestinatario setNumero(String value) { put("numero", Json.scalar(value)); return this; }
 public String getTelefone() { return stringValue(field("telefone")); }
 public EmitterIssueCtePayloadDestinatario setTelefone(String value) { put("telefone", Json.scalar(value)); return this; }
 public String getUf() { return stringValue(field("uf")); }
 public EmitterIssueCtePayloadDestinatario setUf(String value) { put("uf", Json.scalar(value)); return this; }
 public String getNomeFantasia() { return stringValue(field("nome_fantasia")); }
 public EmitterIssueCtePayloadDestinatario setNomeFantasia(String value) { put("nome_fantasia", Json.scalar(value)); return this; }
}
