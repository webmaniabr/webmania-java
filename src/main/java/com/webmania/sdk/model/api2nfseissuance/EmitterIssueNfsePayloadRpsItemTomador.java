package com.webmania.sdk.model.api2nfseissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/nfse-issuance.openapi.json; see contract-provenance.json. */
public final class EmitterIssueNfsePayloadRpsItemTomador extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("bairro", "cep", "cidade", "cidade_exterior", "cnpj", "codigo_municipio", "codigo_pais", "codigo_postal", "complemento", "cpf", "email", "endereco", "endereco_completo", "endereco_completo_exterior", "estado_provincia", "fantasia", "id_estrangeiro", "ie", "im", "nif", "nome_completo", "nome_estrangeiro", "nome_pais", "numero", "pais", "razao_social", "sigla_pais", "telefone", "uf", "documento_estrangeiro", "cidade_estrangeira");
 public EmitterIssueNfsePayloadRpsItemTomador() { super(FIELDS); }
 public EmitterIssueNfsePayloadRpsItemTomador(JsonNode node) { super(node, FIELDS); }
 public String getBairro() { return stringValue(field("bairro")); }
 public EmitterIssueNfsePayloadRpsItemTomador setBairro(String value) { put("bairro", Json.scalar(value)); return this; }
 public String getCep() { return stringValue(field("cep")); }
 public EmitterIssueNfsePayloadRpsItemTomador setCep(String value) { put("cep", Json.scalar(value)); return this; }
 public String getCidade() { return stringValue(field("cidade")); }
 public EmitterIssueNfsePayloadRpsItemTomador setCidade(String value) { put("cidade", Json.scalar(value)); return this; }
 public String getCidadeExterior() { return stringValue(field("cidade_exterior")); }
 public EmitterIssueNfsePayloadRpsItemTomador setCidadeExterior(String value) { put("cidade_exterior", Json.scalar(value)); return this; }
 public String getCnpj() { return stringValue(field("cnpj")); }
 public EmitterIssueNfsePayloadRpsItemTomador setCnpj(String value) { put("cnpj", Json.scalar(value)); return this; }
 public String getCodigoMunicipio() { return stringValue(field("codigo_municipio")); }
 public EmitterIssueNfsePayloadRpsItemTomador setCodigoMunicipio(String value) { put("codigo_municipio", Json.scalar(value)); return this; }
 public EmitterIssueNfsePayloadRpsItemTomadorCodigoPais getCodigoPais() { return (field("codigo_pais")).isNull() || (field("codigo_pais")).isMissingNode() ? null : new EmitterIssueNfsePayloadRpsItemTomadorCodigoPais(field("codigo_pais")); }
 public EmitterIssueNfsePayloadRpsItemTomador setCodigoPais(EmitterIssueNfsePayloadRpsItemTomadorCodigoPais value) { put("codigo_pais", value == null ? null : value.toJson()); return this; }
 public String getCodigoPostal() { return stringValue(field("codigo_postal")); }
 public EmitterIssueNfsePayloadRpsItemTomador setCodigoPostal(String value) { put("codigo_postal", Json.scalar(value)); return this; }
 public String getComplemento() { return stringValue(field("complemento")); }
 public EmitterIssueNfsePayloadRpsItemTomador setComplemento(String value) { put("complemento", Json.scalar(value)); return this; }
 public String getCpf() { return stringValue(field("cpf")); }
 public EmitterIssueNfsePayloadRpsItemTomador setCpf(String value) { put("cpf", Json.scalar(value)); return this; }
 public String getEmail() { return stringValue(field("email")); }
 public EmitterIssueNfsePayloadRpsItemTomador setEmail(String value) { put("email", Json.scalar(value)); return this; }
 public String getEndereco() { return stringValue(field("endereco")); }
 public EmitterIssueNfsePayloadRpsItemTomador setEndereco(String value) { put("endereco", Json.scalar(value)); return this; }
 public EmitterIssueNfsePayloadRpsItemTomadorEnderecoCompleto getEnderecoCompleto() { return (field("endereco_completo")).isNull() || (field("endereco_completo")).isMissingNode() ? null : new EmitterIssueNfsePayloadRpsItemTomadorEnderecoCompleto(field("endereco_completo")); }
 public EmitterIssueNfsePayloadRpsItemTomador setEnderecoCompleto(EmitterIssueNfsePayloadRpsItemTomadorEnderecoCompleto value) { put("endereco_completo", value == null ? null : value.toJson()); return this; }
 public String getEnderecoCompletoExterior() { return stringValue(field("endereco_completo_exterior")); }
 public EmitterIssueNfsePayloadRpsItemTomador setEnderecoCompletoExterior(String value) { put("endereco_completo_exterior", Json.scalar(value)); return this; }
 public String getEstadoProvincia() { return stringValue(field("estado_provincia")); }
 public EmitterIssueNfsePayloadRpsItemTomador setEstadoProvincia(String value) { put("estado_provincia", Json.scalar(value)); return this; }
 public String getFantasia() { return stringValue(field("fantasia")); }
 public EmitterIssueNfsePayloadRpsItemTomador setFantasia(String value) { put("fantasia", Json.scalar(value)); return this; }
 public EmitterIssueNfsePayloadRpsItemTomadorIdEstrangeiro getIdEstrangeiro() { return (field("id_estrangeiro")).isNull() || (field("id_estrangeiro")).isMissingNode() ? null : new EmitterIssueNfsePayloadRpsItemTomadorIdEstrangeiro(field("id_estrangeiro")); }
 public EmitterIssueNfsePayloadRpsItemTomador setIdEstrangeiro(EmitterIssueNfsePayloadRpsItemTomadorIdEstrangeiro value) { put("id_estrangeiro", value == null ? null : value.toJson()); return this; }
 public String getIe() { return stringValue(field("ie")); }
 public EmitterIssueNfsePayloadRpsItemTomador setIe(String value) { put("ie", Json.scalar(value)); return this; }
 public String getIm() { return stringValue(field("im")); }
 public EmitterIssueNfsePayloadRpsItemTomador setIm(String value) { put("im", Json.scalar(value)); return this; }
 public String getNif() { return stringValue(field("nif")); }
 public EmitterIssueNfsePayloadRpsItemTomador setNif(String value) { put("nif", Json.scalar(value)); return this; }
 public String getNomeCompleto() { return stringValue(field("nome_completo")); }
 public EmitterIssueNfsePayloadRpsItemTomador setNomeCompleto(String value) { put("nome_completo", Json.scalar(value)); return this; }
 public EmitterIssueNfsePayloadRpsItemTomadorNomeEstrangeiro getNomeEstrangeiro() { return (field("nome_estrangeiro")).isNull() || (field("nome_estrangeiro")).isMissingNode() ? null : new EmitterIssueNfsePayloadRpsItemTomadorNomeEstrangeiro(field("nome_estrangeiro")); }
 public EmitterIssueNfsePayloadRpsItemTomador setNomeEstrangeiro(EmitterIssueNfsePayloadRpsItemTomadorNomeEstrangeiro value) { put("nome_estrangeiro", value == null ? null : value.toJson()); return this; }
 public EmitterIssueNfsePayloadRpsItemTomadorNomePais getNomePais() { return (field("nome_pais")).isNull() || (field("nome_pais")).isMissingNode() ? null : new EmitterIssueNfsePayloadRpsItemTomadorNomePais(field("nome_pais")); }
 public EmitterIssueNfsePayloadRpsItemTomador setNomePais(EmitterIssueNfsePayloadRpsItemTomadorNomePais value) { put("nome_pais", value == null ? null : value.toJson()); return this; }
 public String getNumero() { return stringValue(field("numero")); }
 public EmitterIssueNfsePayloadRpsItemTomador setNumero(String value) { put("numero", Json.scalar(value)); return this; }
 public String getPais() { return stringValue(field("pais")); }
 public EmitterIssueNfsePayloadRpsItemTomador setPais(String value) { put("pais", Json.scalar(value)); return this; }
 public EmitterIssueNfsePayloadRpsItemTomadorRazaoSocial getRazaoSocial() { return (field("razao_social")).isNull() || (field("razao_social")).isMissingNode() ? null : new EmitterIssueNfsePayloadRpsItemTomadorRazaoSocial(field("razao_social")); }
 public EmitterIssueNfsePayloadRpsItemTomador setRazaoSocial(EmitterIssueNfsePayloadRpsItemTomadorRazaoSocial value) { put("razao_social", value == null ? null : value.toJson()); return this; }
 public String getSiglaPais() { return stringValue(field("sigla_pais")); }
 public EmitterIssueNfsePayloadRpsItemTomador setSiglaPais(String value) { put("sigla_pais", Json.scalar(value)); return this; }
 public String getTelefone() { return stringValue(field("telefone")); }
 public EmitterIssueNfsePayloadRpsItemTomador setTelefone(String value) { put("telefone", Json.scalar(value)); return this; }
 public String getUf() { return stringValue(field("uf")); }
 public EmitterIssueNfsePayloadRpsItemTomador setUf(String value) { put("uf", Json.scalar(value)); return this; }
 public String getDocumentoEstrangeiro() { return stringValue(field("documento_estrangeiro")); }
 public EmitterIssueNfsePayloadRpsItemTomador setDocumentoEstrangeiro(String value) { put("documento_estrangeiro", Json.scalar(value)); return this; }
 public String getCidadeEstrangeira() { return stringValue(field("cidade_estrangeira")); }
 public EmitterIssueNfsePayloadRpsItemTomador setCidadeEstrangeira(String value) { put("cidade_estrangeira", Json.scalar(value)); return this; }
}
