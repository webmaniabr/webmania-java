package com.webmania.sdk.model.api2nfseissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/nfse-issuance.openapi.json; see contract-provenance.json. */
public final class EmitterIssueNfsePayloadRpsItemServicoDeducaoReducaoDocumentosItemFornecedor extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("bairro", "caepf", "cep", "cep_exterior", "cidade", "cnpj", "codigo_municipio", "codigo_pais", "complemento", "cpf", "email", "endereco", "estado", "id_estrangeiro", "im", "motivo_sem_nif", "nome_completo", "nome_estrangeiro", "numero", "razao_social", "telefone");
 public EmitterIssueNfsePayloadRpsItemServicoDeducaoReducaoDocumentosItemFornecedor() { super(FIELDS); }
 public EmitterIssueNfsePayloadRpsItemServicoDeducaoReducaoDocumentosItemFornecedor(JsonNode node) { super(node, FIELDS); }
 public String getBairro() { return stringValue(field("bairro")); }
 public EmitterIssueNfsePayloadRpsItemServicoDeducaoReducaoDocumentosItemFornecedor setBairro(String value) { put("bairro", Json.scalar(value)); return this; }
 public String getCaepf() { return stringValue(field("caepf")); }
 public EmitterIssueNfsePayloadRpsItemServicoDeducaoReducaoDocumentosItemFornecedor setCaepf(String value) { put("caepf", Json.scalar(value)); return this; }
 public String getCep() { return stringValue(field("cep")); }
 public EmitterIssueNfsePayloadRpsItemServicoDeducaoReducaoDocumentosItemFornecedor setCep(String value) { put("cep", Json.scalar(value)); return this; }
 public String getCepExterior() { return stringValue(field("cep_exterior")); }
 public EmitterIssueNfsePayloadRpsItemServicoDeducaoReducaoDocumentosItemFornecedor setCepExterior(String value) { put("cep_exterior", Json.scalar(value)); return this; }
 public String getCidade() { return stringValue(field("cidade")); }
 public EmitterIssueNfsePayloadRpsItemServicoDeducaoReducaoDocumentosItemFornecedor setCidade(String value) { put("cidade", Json.scalar(value)); return this; }
 public String getCnpj() { return stringValue(field("cnpj")); }
 public EmitterIssueNfsePayloadRpsItemServicoDeducaoReducaoDocumentosItemFornecedor setCnpj(String value) { put("cnpj", Json.scalar(value)); return this; }
 public String getCodigoMunicipio() { return stringValue(field("codigo_municipio")); }
 public EmitterIssueNfsePayloadRpsItemServicoDeducaoReducaoDocumentosItemFornecedor setCodigoMunicipio(String value) { put("codigo_municipio", Json.scalar(value)); return this; }
 public String getCodigoPais() { return stringValue(field("codigo_pais")); }
 public EmitterIssueNfsePayloadRpsItemServicoDeducaoReducaoDocumentosItemFornecedor setCodigoPais(String value) { put("codigo_pais", Json.scalar(value)); return this; }
 public String getComplemento() { return stringValue(field("complemento")); }
 public EmitterIssueNfsePayloadRpsItemServicoDeducaoReducaoDocumentosItemFornecedor setComplemento(String value) { put("complemento", Json.scalar(value)); return this; }
 public String getCpf() { return stringValue(field("cpf")); }
 public EmitterIssueNfsePayloadRpsItemServicoDeducaoReducaoDocumentosItemFornecedor setCpf(String value) { put("cpf", Json.scalar(value)); return this; }
 public String getEmail() { return stringValue(field("email")); }
 public EmitterIssueNfsePayloadRpsItemServicoDeducaoReducaoDocumentosItemFornecedor setEmail(String value) { put("email", Json.scalar(value)); return this; }
 public String getEndereco() { return stringValue(field("endereco")); }
 public EmitterIssueNfsePayloadRpsItemServicoDeducaoReducaoDocumentosItemFornecedor setEndereco(String value) { put("endereco", Json.scalar(value)); return this; }
 public String getEstado() { return stringValue(field("estado")); }
 public EmitterIssueNfsePayloadRpsItemServicoDeducaoReducaoDocumentosItemFornecedor setEstado(String value) { put("estado", Json.scalar(value)); return this; }
 public String getIdEstrangeiro() { return stringValue(field("id_estrangeiro")); }
 public EmitterIssueNfsePayloadRpsItemServicoDeducaoReducaoDocumentosItemFornecedor setIdEstrangeiro(String value) { put("id_estrangeiro", Json.scalar(value)); return this; }
 public String getIm() { return stringValue(field("im")); }
 public EmitterIssueNfsePayloadRpsItemServicoDeducaoReducaoDocumentosItemFornecedor setIm(String value) { put("im", Json.scalar(value)); return this; }
 public JsonValue getMotivoSemNif() { return (field("motivo_sem_nif")).isNull() || (field("motivo_sem_nif")).isMissingNode() ? null : new JsonValue(field("motivo_sem_nif")); }
 public EmitterIssueNfsePayloadRpsItemServicoDeducaoReducaoDocumentosItemFornecedor setMotivoSemNif(JsonValue value) { put("motivo_sem_nif", value == null ? null : value.toJson()); return this; }
 public String getNomeCompleto() { return stringValue(field("nome_completo")); }
 public EmitterIssueNfsePayloadRpsItemServicoDeducaoReducaoDocumentosItemFornecedor setNomeCompleto(String value) { put("nome_completo", Json.scalar(value)); return this; }
 public String getNomeEstrangeiro() { return stringValue(field("nome_estrangeiro")); }
 public EmitterIssueNfsePayloadRpsItemServicoDeducaoReducaoDocumentosItemFornecedor setNomeEstrangeiro(String value) { put("nome_estrangeiro", Json.scalar(value)); return this; }
 public String getNumero() { return stringValue(field("numero")); }
 public EmitterIssueNfsePayloadRpsItemServicoDeducaoReducaoDocumentosItemFornecedor setNumero(String value) { put("numero", Json.scalar(value)); return this; }
 public String getRazaoSocial() { return stringValue(field("razao_social")); }
 public EmitterIssueNfsePayloadRpsItemServicoDeducaoReducaoDocumentosItemFornecedor setRazaoSocial(String value) { put("razao_social", Json.scalar(value)); return this; }
 public String getTelefone() { return stringValue(field("telefone")); }
 public EmitterIssueNfsePayloadRpsItemServicoDeducaoReducaoDocumentosItemFornecedor setTelefone(String value) { put("telefone", Json.scalar(value)); return this; }
}
