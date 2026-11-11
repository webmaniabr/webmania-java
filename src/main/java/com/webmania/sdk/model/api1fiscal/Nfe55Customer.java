package com.webmania.sdk.model.api1fiscal;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api1/fiscal.openapi.json; see contract-provenance.json. */
public final class Nfe55Customer extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("cpf", "nome_completo", "cnpj", "razao_social", "ie", "suframa", "substituto_tributario", "consumidor_final", "contribuinte", "microcervejaria", "endereco", "complemento", "numero", "bairro", "cidade", "uf", "cep", "telefone", "email", "id_estrangeiro", "nome_estrangeiro", "cod_pais", "nome_pais");
 public Nfe55Customer() { super(FIELDS); }
 public Nfe55Customer(JsonNode node) { super(node, FIELDS); }
 public String getCpf() { return stringValue(field("cpf")); }
 public Nfe55Customer setCpf(String value) { put("cpf", Json.scalar(value)); return this; }
 public String getNomeCompleto() { return stringValue(field("nome_completo")); }
 public Nfe55Customer setNomeCompleto(String value) { put("nome_completo", Json.scalar(value)); return this; }
 public String getCnpj() { return stringValue(field("cnpj")); }
 public Nfe55Customer setCnpj(String value) { put("cnpj", Json.scalar(value)); return this; }
 public String getRazaoSocial() { return stringValue(field("razao_social")); }
 public Nfe55Customer setRazaoSocial(String value) { put("razao_social", Json.scalar(value)); return this; }
 public String getIe() { return stringValue(field("ie")); }
 public Nfe55Customer setIe(String value) { put("ie", Json.scalar(value)); return this; }
 public String getSuframa() { return stringValue(field("suframa")); }
 public Nfe55Customer setSuframa(String value) { put("suframa", Json.scalar(value)); return this; }
 public String getSubstitutoTributario() { return stringValue(field("substituto_tributario")); }
 public Nfe55Customer setSubstitutoTributario(String value) { put("substituto_tributario", Json.scalar(value)); return this; }
 public java.math.BigInteger getConsumidorFinal() { return integerValue(field("consumidor_final")); }
 public Nfe55Customer setConsumidorFinal(java.math.BigInteger value) { put("consumidor_final", Json.scalar(value)); return this; }
 public java.math.BigInteger getContribuinte() { return integerValue(field("contribuinte")); }
 public Nfe55Customer setContribuinte(java.math.BigInteger value) { put("contribuinte", Json.scalar(value)); return this; }
 public Boolean getMicrocervejaria() { return booleanValue(field("microcervejaria")); }
 public Nfe55Customer setMicrocervejaria(Boolean value) { put("microcervejaria", Json.scalar(value)); return this; }
 public String getEndereco() { return stringValue(field("endereco")); }
 public Nfe55Customer setEndereco(String value) { put("endereco", Json.scalar(value)); return this; }
 public String getComplemento() { return stringValue(field("complemento")); }
 public Nfe55Customer setComplemento(String value) { put("complemento", Json.scalar(value)); return this; }
 public String getNumero() { return stringValue(field("numero")); }
 public Nfe55Customer setNumero(String value) { put("numero", Json.scalar(value)); return this; }
 public String getBairro() { return stringValue(field("bairro")); }
 public Nfe55Customer setBairro(String value) { put("bairro", Json.scalar(value)); return this; }
 public String getCidade() { return stringValue(field("cidade")); }
 public Nfe55Customer setCidade(String value) { put("cidade", Json.scalar(value)); return this; }
 public String getUf() { return stringValue(field("uf")); }
 public Nfe55Customer setUf(String value) { put("uf", Json.scalar(value)); return this; }
 public String getCep() { return stringValue(field("cep")); }
 public Nfe55Customer setCep(String value) { put("cep", Json.scalar(value)); return this; }
 public String getTelefone() { return stringValue(field("telefone")); }
 public Nfe55Customer setTelefone(String value) { put("telefone", Json.scalar(value)); return this; }
 public String getEmail() { return stringValue(field("email")); }
 public Nfe55Customer setEmail(String value) { put("email", Json.scalar(value)); return this; }
 public String getIdEstrangeiro() { return stringValue(field("id_estrangeiro")); }
 public Nfe55Customer setIdEstrangeiro(String value) { put("id_estrangeiro", Json.scalar(value)); return this; }
 public String getNomeEstrangeiro() { return stringValue(field("nome_estrangeiro")); }
 public Nfe55Customer setNomeEstrangeiro(String value) { put("nome_estrangeiro", Json.scalar(value)); return this; }
 public String getCodPais() { return stringValue(field("cod_pais")); }
 public Nfe55Customer setCodPais(String value) { put("cod_pais", Json.scalar(value)); return this; }
 public String getNomePais() { return stringValue(field("nome_pais")); }
 public Nfe55Customer setNomePais(String value) { put("nome_pais", Json.scalar(value)); return this; }
}
