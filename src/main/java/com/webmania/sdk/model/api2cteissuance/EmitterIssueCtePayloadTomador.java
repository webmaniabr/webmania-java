package com.webmania.sdk.model.api2cteissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/cte-issuance.openapi.json; see contract-provenance.json. */
public final class EmitterIssueCtePayloadTomador extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("bairro", "cep", "cidade", "cnpj", "codigo_pais", "complemento", "cpf", "email", "endereco", "ie", "nome_fantasia", "nome_razao", "numero", "telefone", "uf");
 public EmitterIssueCtePayloadTomador() { super(FIELDS); }
 public EmitterIssueCtePayloadTomador(JsonNode node) { super(node, FIELDS); }
 public String getBairro() { return stringValue(field("bairro")); }
 public EmitterIssueCtePayloadTomador setBairro(String value) { put("bairro", Json.scalar(value)); return this; }
 public String getCep() { return stringValue(field("cep")); }
 public EmitterIssueCtePayloadTomador setCep(String value) { put("cep", Json.scalar(value)); return this; }
 public String getCidade() { return stringValue(field("cidade")); }
 public EmitterIssueCtePayloadTomador setCidade(String value) { put("cidade", Json.scalar(value)); return this; }
 public String getCnpj() { return stringValue(field("cnpj")); }
 public EmitterIssueCtePayloadTomador setCnpj(String value) { put("cnpj", Json.scalar(value)); return this; }
 public String getCodigoPais() { return stringValue(field("codigo_pais")); }
 public EmitterIssueCtePayloadTomador setCodigoPais(String value) { put("codigo_pais", Json.scalar(value)); return this; }
 public String getComplemento() { return stringValue(field("complemento")); }
 public EmitterIssueCtePayloadTomador setComplemento(String value) { put("complemento", Json.scalar(value)); return this; }
 public String getCpf() { return stringValue(field("cpf")); }
 public EmitterIssueCtePayloadTomador setCpf(String value) { put("cpf", Json.scalar(value)); return this; }
 public String getEmail() { return stringValue(field("email")); }
 public EmitterIssueCtePayloadTomador setEmail(String value) { put("email", Json.scalar(value)); return this; }
 public String getEndereco() { return stringValue(field("endereco")); }
 public EmitterIssueCtePayloadTomador setEndereco(String value) { put("endereco", Json.scalar(value)); return this; }
 public String getIe() { return stringValue(field("ie")); }
 public EmitterIssueCtePayloadTomador setIe(String value) { put("ie", Json.scalar(value)); return this; }
 public String getNomeFantasia() { return stringValue(field("nome_fantasia")); }
 public EmitterIssueCtePayloadTomador setNomeFantasia(String value) { put("nome_fantasia", Json.scalar(value)); return this; }
 public String getNomeRazao() { return stringValue(field("nome_razao")); }
 public EmitterIssueCtePayloadTomador setNomeRazao(String value) { put("nome_razao", Json.scalar(value)); return this; }
 public String getNumero() { return stringValue(field("numero")); }
 public EmitterIssueCtePayloadTomador setNumero(String value) { put("numero", Json.scalar(value)); return this; }
 public String getTelefone() { return stringValue(field("telefone")); }
 public EmitterIssueCtePayloadTomador setTelefone(String value) { put("telefone", Json.scalar(value)); return this; }
 public String getUf() { return stringValue(field("uf")); }
 public EmitterIssueCtePayloadTomador setUf(String value) { put("uf", Json.scalar(value)); return this; }
}
