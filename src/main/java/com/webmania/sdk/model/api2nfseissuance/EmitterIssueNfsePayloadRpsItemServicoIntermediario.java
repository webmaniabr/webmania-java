package com.webmania.sdk.model.api2nfseissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/nfse-issuance.openapi.json; see contract-provenance.json. */
public final class EmitterIssueNfsePayloadRpsItemServicoIntermediario extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("cnpj", "cpf", "im", "nome_completo", "razao_social", "cidade", "uf", "ie", "endereco", "cep", "bairro", "numero", "complemento");
 public EmitterIssueNfsePayloadRpsItemServicoIntermediario() { super(FIELDS); }
 public EmitterIssueNfsePayloadRpsItemServicoIntermediario(JsonNode node) { super(node, FIELDS); }
 public String getCnpj() { return stringValue(field("cnpj")); }
 public EmitterIssueNfsePayloadRpsItemServicoIntermediario setCnpj(String value) { put("cnpj", Json.scalar(value)); return this; }
 public String getCpf() { return stringValue(field("cpf")); }
 public EmitterIssueNfsePayloadRpsItemServicoIntermediario setCpf(String value) { put("cpf", Json.scalar(value)); return this; }
 public String getIm() { return stringValue(field("im")); }
 public EmitterIssueNfsePayloadRpsItemServicoIntermediario setIm(String value) { put("im", Json.scalar(value)); return this; }
 public String getNomeCompleto() { return stringValue(field("nome_completo")); }
 public EmitterIssueNfsePayloadRpsItemServicoIntermediario setNomeCompleto(String value) { put("nome_completo", Json.scalar(value)); return this; }
 public String getRazaoSocial() { return stringValue(field("razao_social")); }
 public EmitterIssueNfsePayloadRpsItemServicoIntermediario setRazaoSocial(String value) { put("razao_social", Json.scalar(value)); return this; }
 public String getCidade() { return stringValue(field("cidade")); }
 public EmitterIssueNfsePayloadRpsItemServicoIntermediario setCidade(String value) { put("cidade", Json.scalar(value)); return this; }
 public String getUf() { return stringValue(field("uf")); }
 public EmitterIssueNfsePayloadRpsItemServicoIntermediario setUf(String value) { put("uf", Json.scalar(value)); return this; }
 public String getIe() { return stringValue(field("ie")); }
 public EmitterIssueNfsePayloadRpsItemServicoIntermediario setIe(String value) { put("ie", Json.scalar(value)); return this; }
 public String getEndereco() { return stringValue(field("endereco")); }
 public EmitterIssueNfsePayloadRpsItemServicoIntermediario setEndereco(String value) { put("endereco", Json.scalar(value)); return this; }
 public String getCep() { return stringValue(field("cep")); }
 public EmitterIssueNfsePayloadRpsItemServicoIntermediario setCep(String value) { put("cep", Json.scalar(value)); return this; }
 public String getBairro() { return stringValue(field("bairro")); }
 public EmitterIssueNfsePayloadRpsItemServicoIntermediario setBairro(String value) { put("bairro", Json.scalar(value)); return this; }
 public String getNumero() { return stringValue(field("numero")); }
 public EmitterIssueNfsePayloadRpsItemServicoIntermediario setNumero(String value) { put("numero", Json.scalar(value)); return this; }
 public String getComplemento() { return stringValue(field("complemento")); }
 public EmitterIssueNfsePayloadRpsItemServicoIntermediario setComplemento(String value) { put("complemento", Json.scalar(value)); return this; }
}
