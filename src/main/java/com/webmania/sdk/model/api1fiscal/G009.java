package com.webmania.sdk.model.api1fiscal;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api1/fiscal.openapi.json; see contract-provenance.json. */
public final class G009 extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("cpf", "nome_completo", "cnpj", "razao_social", "ie", "suframa", "substituto_tributario", "consumidor_final", "contribuinte", "microcervejaria", "endereco", "complemento", "numero", "bairro", "cidade", "uf", "cep", "telefone", "email");
 public G009() { super(FIELDS); }
 public G009(JsonNode node) { super(node, FIELDS); }
 public String getCpf() { return stringValue(field("cpf")); }
 public G009 setCpf(String value) { put("cpf", Json.scalar(value)); return this; }
 public String getNomeCompleto() { return stringValue(field("nome_completo")); }
 public G009 setNomeCompleto(String value) { put("nome_completo", Json.scalar(value)); return this; }
 public String getCnpj() { return stringValue(field("cnpj")); }
 public G009 setCnpj(String value) { put("cnpj", Json.scalar(value)); return this; }
 public String getRazaoSocial() { return stringValue(field("razao_social")); }
 public G009 setRazaoSocial(String value) { put("razao_social", Json.scalar(value)); return this; }
 public String getIe() { return stringValue(field("ie")); }
 public G009 setIe(String value) { put("ie", Json.scalar(value)); return this; }
 public String getSuframa() { return stringValue(field("suframa")); }
 public G009 setSuframa(String value) { put("suframa", Json.scalar(value)); return this; }
 public String getSubstitutoTributario() { return stringValue(field("substituto_tributario")); }
 public G009 setSubstitutoTributario(String value) { put("substituto_tributario", Json.scalar(value)); return this; }
 public java.math.BigInteger getConsumidorFinal() { return integerValue(field("consumidor_final")); }
 public G009 setConsumidorFinal(java.math.BigInteger value) { put("consumidor_final", Json.scalar(value)); return this; }
 public java.math.BigInteger getContribuinte() { return integerValue(field("contribuinte")); }
 public G009 setContribuinte(java.math.BigInteger value) { put("contribuinte", Json.scalar(value)); return this; }
 public Boolean getMicrocervejaria() { return booleanValue(field("microcervejaria")); }
 public G009 setMicrocervejaria(Boolean value) { put("microcervejaria", Json.scalar(value)); return this; }
 public String getEndereco() { return stringValue(field("endereco")); }
 public G009 setEndereco(String value) { put("endereco", Json.scalar(value)); return this; }
 public String getComplemento() { return stringValue(field("complemento")); }
 public G009 setComplemento(String value) { put("complemento", Json.scalar(value)); return this; }
 public String getNumero() { return stringValue(field("numero")); }
 public G009 setNumero(String value) { put("numero", Json.scalar(value)); return this; }
 public String getBairro() { return stringValue(field("bairro")); }
 public G009 setBairro(String value) { put("bairro", Json.scalar(value)); return this; }
 public String getCidade() { return stringValue(field("cidade")); }
 public G009 setCidade(String value) { put("cidade", Json.scalar(value)); return this; }
 public String getUf() { return stringValue(field("uf")); }
 public G009 setUf(String value) { put("uf", Json.scalar(value)); return this; }
 public String getCep() { return stringValue(field("cep")); }
 public G009 setCep(String value) { put("cep", Json.scalar(value)); return this; }
 public String getTelefone() { return stringValue(field("telefone")); }
 public G009 setTelefone(String value) { put("telefone", Json.scalar(value)); return this; }
 public String getEmail() { return stringValue(field("email")); }
 public G009 setEmail(String value) { put("email", Json.scalar(value)); return this; }
}
