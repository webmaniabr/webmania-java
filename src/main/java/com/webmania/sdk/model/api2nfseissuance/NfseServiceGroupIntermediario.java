package com.webmania.sdk.model.api2nfseissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/nfse-issuance.openapi.json; see contract-provenance.json. */
public final class NfseServiceGroupIntermediario extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("cnpj", "cpf", "im", "nome_completo", "razao_social", "cidade", "uf", "ie", "endereco", "cep", "bairro", "numero", "complemento");
 public NfseServiceGroupIntermediario() { super(FIELDS); }
 public NfseServiceGroupIntermediario(JsonNode node) { super(node, FIELDS); }
 public String getCnpj() { return stringValue(field("cnpj")); }
 public NfseServiceGroupIntermediario setCnpj(String value) { put("cnpj", Json.scalar(value)); return this; }
 public String getCpf() { return stringValue(field("cpf")); }
 public NfseServiceGroupIntermediario setCpf(String value) { put("cpf", Json.scalar(value)); return this; }
 public String getIm() { return stringValue(field("im")); }
 public NfseServiceGroupIntermediario setIm(String value) { put("im", Json.scalar(value)); return this; }
 public String getNomeCompleto() { return stringValue(field("nome_completo")); }
 public NfseServiceGroupIntermediario setNomeCompleto(String value) { put("nome_completo", Json.scalar(value)); return this; }
 public String getRazaoSocial() { return stringValue(field("razao_social")); }
 public NfseServiceGroupIntermediario setRazaoSocial(String value) { put("razao_social", Json.scalar(value)); return this; }
 public String getCidade() { return stringValue(field("cidade")); }
 public NfseServiceGroupIntermediario setCidade(String value) { put("cidade", Json.scalar(value)); return this; }
 public String getUf() { return stringValue(field("uf")); }
 public NfseServiceGroupIntermediario setUf(String value) { put("uf", Json.scalar(value)); return this; }
 public String getIe() { return stringValue(field("ie")); }
 public NfseServiceGroupIntermediario setIe(String value) { put("ie", Json.scalar(value)); return this; }
 public String getEndereco() { return stringValue(field("endereco")); }
 public NfseServiceGroupIntermediario setEndereco(String value) { put("endereco", Json.scalar(value)); return this; }
 public String getCep() { return stringValue(field("cep")); }
 public NfseServiceGroupIntermediario setCep(String value) { put("cep", Json.scalar(value)); return this; }
 public String getBairro() { return stringValue(field("bairro")); }
 public NfseServiceGroupIntermediario setBairro(String value) { put("bairro", Json.scalar(value)); return this; }
 public String getNumero() { return stringValue(field("numero")); }
 public NfseServiceGroupIntermediario setNumero(String value) { put("numero", Json.scalar(value)); return this; }
 public String getComplemento() { return stringValue(field("complemento")); }
 public NfseServiceGroupIntermediario setComplemento(String value) { put("complemento", Json.scalar(value)); return this; }
}
