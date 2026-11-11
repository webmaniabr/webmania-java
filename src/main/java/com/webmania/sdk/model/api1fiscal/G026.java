package com.webmania.sdk.model.api1fiscal;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api1/fiscal.openapi.json; see contract-provenance.json. */
public final class G026 extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("cnpj", "razao_social", "ie", "cpf", "nome_completo", "nome_estrangeiro", "cod_pais", "pais", "uf", "cep", "endereco", "numero", "complemento", "bairro", "cidade", "telefone", "email");
 public G026() { super(FIELDS); }
 public G026(JsonNode node) { super(node, FIELDS); }
 public String getCnpj() { return stringValue(field("cnpj")); }
 public G026 setCnpj(String value) { put("cnpj", Json.scalar(value)); return this; }
 public String getRazaoSocial() { return stringValue(field("razao_social")); }
 public G026 setRazaoSocial(String value) { put("razao_social", Json.scalar(value)); return this; }
 public String getIe() { return stringValue(field("ie")); }
 public G026 setIe(String value) { put("ie", Json.scalar(value)); return this; }
 public String getCpf() { return stringValue(field("cpf")); }
 public G026 setCpf(String value) { put("cpf", Json.scalar(value)); return this; }
 public String getNomeCompleto() { return stringValue(field("nome_completo")); }
 public G026 setNomeCompleto(String value) { put("nome_completo", Json.scalar(value)); return this; }
 public String getNomeEstrangeiro() { return stringValue(field("nome_estrangeiro")); }
 public G026 setNomeEstrangeiro(String value) { put("nome_estrangeiro", Json.scalar(value)); return this; }
 public String getCodPais() { return stringValue(field("cod_pais")); }
 public G026 setCodPais(String value) { put("cod_pais", Json.scalar(value)); return this; }
 public String getPais() { return stringValue(field("pais")); }
 public G026 setPais(String value) { put("pais", Json.scalar(value)); return this; }
 public String getUf() { return stringValue(field("uf")); }
 public G026 setUf(String value) { put("uf", Json.scalar(value)); return this; }
 public String getCep() { return stringValue(field("cep")); }
 public G026 setCep(String value) { put("cep", Json.scalar(value)); return this; }
 public String getEndereco() { return stringValue(field("endereco")); }
 public G026 setEndereco(String value) { put("endereco", Json.scalar(value)); return this; }
 public String getNumero() { return stringValue(field("numero")); }
 public G026 setNumero(String value) { put("numero", Json.scalar(value)); return this; }
 public String getComplemento() { return stringValue(field("complemento")); }
 public G026 setComplemento(String value) { put("complemento", Json.scalar(value)); return this; }
 public String getBairro() { return stringValue(field("bairro")); }
 public G026 setBairro(String value) { put("bairro", Json.scalar(value)); return this; }
 public String getCidade() { return stringValue(field("cidade")); }
 public G026 setCidade(String value) { put("cidade", Json.scalar(value)); return this; }
 public String getTelefone() { return stringValue(field("telefone")); }
 public G026 setTelefone(String value) { put("telefone", Json.scalar(value)); return this; }
 public String getEmail() { return stringValue(field("email")); }
 public G026 setEmail(String value) { put("email", Json.scalar(value)); return this; }
}
