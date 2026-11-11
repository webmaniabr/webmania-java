package com.webmania.sdk.model.api2nfseissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/nfse-issuance.openapi.json; see contract-provenance.json. */
public final class NfseServiceGroupDeducaoReducaoDocumentosItemFornecedor extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("bairro", "caepf", "cep", "cep_exterior", "cidade", "cnpj", "codigo_municipio", "codigo_pais", "complemento", "cpf", "email", "endereco", "estado", "id_estrangeiro", "im", "motivo_sem_nif", "nome_completo", "nome_estrangeiro", "numero", "razao_social", "telefone");
 public NfseServiceGroupDeducaoReducaoDocumentosItemFornecedor() { super(FIELDS); }
 public NfseServiceGroupDeducaoReducaoDocumentosItemFornecedor(JsonNode node) { super(node, FIELDS); }
 public String getBairro() { return stringValue(field("bairro")); }
 public NfseServiceGroupDeducaoReducaoDocumentosItemFornecedor setBairro(String value) { put("bairro", Json.scalar(value)); return this; }
 public String getCaepf() { return stringValue(field("caepf")); }
 public NfseServiceGroupDeducaoReducaoDocumentosItemFornecedor setCaepf(String value) { put("caepf", Json.scalar(value)); return this; }
 public String getCep() { return stringValue(field("cep")); }
 public NfseServiceGroupDeducaoReducaoDocumentosItemFornecedor setCep(String value) { put("cep", Json.scalar(value)); return this; }
 public String getCepExterior() { return stringValue(field("cep_exterior")); }
 public NfseServiceGroupDeducaoReducaoDocumentosItemFornecedor setCepExterior(String value) { put("cep_exterior", Json.scalar(value)); return this; }
 public String getCidade() { return stringValue(field("cidade")); }
 public NfseServiceGroupDeducaoReducaoDocumentosItemFornecedor setCidade(String value) { put("cidade", Json.scalar(value)); return this; }
 public String getCnpj() { return stringValue(field("cnpj")); }
 public NfseServiceGroupDeducaoReducaoDocumentosItemFornecedor setCnpj(String value) { put("cnpj", Json.scalar(value)); return this; }
 public String getCodigoMunicipio() { return stringValue(field("codigo_municipio")); }
 public NfseServiceGroupDeducaoReducaoDocumentosItemFornecedor setCodigoMunicipio(String value) { put("codigo_municipio", Json.scalar(value)); return this; }
 public String getCodigoPais() { return stringValue(field("codigo_pais")); }
 public NfseServiceGroupDeducaoReducaoDocumentosItemFornecedor setCodigoPais(String value) { put("codigo_pais", Json.scalar(value)); return this; }
 public String getComplemento() { return stringValue(field("complemento")); }
 public NfseServiceGroupDeducaoReducaoDocumentosItemFornecedor setComplemento(String value) { put("complemento", Json.scalar(value)); return this; }
 public String getCpf() { return stringValue(field("cpf")); }
 public NfseServiceGroupDeducaoReducaoDocumentosItemFornecedor setCpf(String value) { put("cpf", Json.scalar(value)); return this; }
 public String getEmail() { return stringValue(field("email")); }
 public NfseServiceGroupDeducaoReducaoDocumentosItemFornecedor setEmail(String value) { put("email", Json.scalar(value)); return this; }
 public String getEndereco() { return stringValue(field("endereco")); }
 public NfseServiceGroupDeducaoReducaoDocumentosItemFornecedor setEndereco(String value) { put("endereco", Json.scalar(value)); return this; }
 public String getEstado() { return stringValue(field("estado")); }
 public NfseServiceGroupDeducaoReducaoDocumentosItemFornecedor setEstado(String value) { put("estado", Json.scalar(value)); return this; }
 public String getIdEstrangeiro() { return stringValue(field("id_estrangeiro")); }
 public NfseServiceGroupDeducaoReducaoDocumentosItemFornecedor setIdEstrangeiro(String value) { put("id_estrangeiro", Json.scalar(value)); return this; }
 public String getIm() { return stringValue(field("im")); }
 public NfseServiceGroupDeducaoReducaoDocumentosItemFornecedor setIm(String value) { put("im", Json.scalar(value)); return this; }
 public JsonValue getMotivoSemNif() { return (field("motivo_sem_nif")).isNull() || (field("motivo_sem_nif")).isMissingNode() ? null : new JsonValue(field("motivo_sem_nif")); }
 public NfseServiceGroupDeducaoReducaoDocumentosItemFornecedor setMotivoSemNif(JsonValue value) { put("motivo_sem_nif", value == null ? null : value.toJson()); return this; }
 public String getNomeCompleto() { return stringValue(field("nome_completo")); }
 public NfseServiceGroupDeducaoReducaoDocumentosItemFornecedor setNomeCompleto(String value) { put("nome_completo", Json.scalar(value)); return this; }
 public String getNomeEstrangeiro() { return stringValue(field("nome_estrangeiro")); }
 public NfseServiceGroupDeducaoReducaoDocumentosItemFornecedor setNomeEstrangeiro(String value) { put("nome_estrangeiro", Json.scalar(value)); return this; }
 public String getNumero() { return stringValue(field("numero")); }
 public NfseServiceGroupDeducaoReducaoDocumentosItemFornecedor setNumero(String value) { put("numero", Json.scalar(value)); return this; }
 public String getRazaoSocial() { return stringValue(field("razao_social")); }
 public NfseServiceGroupDeducaoReducaoDocumentosItemFornecedor setRazaoSocial(String value) { put("razao_social", Json.scalar(value)); return this; }
 public String getTelefone() { return stringValue(field("telefone")); }
 public NfseServiceGroupDeducaoReducaoDocumentosItemFornecedor setTelefone(String value) { put("telefone", Json.scalar(value)); return this; }
}
