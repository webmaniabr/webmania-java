package com.webmania.sdk.model.api2nfseissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/nfse-issuance.openapi.json; see contract-provenance.json. */
public final class EmitterReplaceNfsePayloadRpsItemTomador extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("bairro", "cep", "cidade", "cidade_exterior", "cnpj", "codigo_municipio", "codigo_pais", "codigo_postal", "complemento", "cpf", "email", "endereco", "endereco_completo_exterior", "estado_provincia", "fantasia", "id_estrangeiro", "ie", "im", "nif", "nome_completo", "nome_estrangeiro", "numero", "pais", "razao_social", "sigla_pais", "telefone", "uf");
 public EmitterReplaceNfsePayloadRpsItemTomador() { super(FIELDS); }
 public EmitterReplaceNfsePayloadRpsItemTomador(JsonNode node) { super(node, FIELDS); }
 public String getBairro() { return stringValue(field("bairro")); }
 public EmitterReplaceNfsePayloadRpsItemTomador setBairro(String value) { put("bairro", Json.scalar(value)); return this; }
 public String getCep() { return stringValue(field("cep")); }
 public EmitterReplaceNfsePayloadRpsItemTomador setCep(String value) { put("cep", Json.scalar(value)); return this; }
 public String getCidade() { return stringValue(field("cidade")); }
 public EmitterReplaceNfsePayloadRpsItemTomador setCidade(String value) { put("cidade", Json.scalar(value)); return this; }
 public String getCidadeExterior() { return stringValue(field("cidade_exterior")); }
 public EmitterReplaceNfsePayloadRpsItemTomador setCidadeExterior(String value) { put("cidade_exterior", Json.scalar(value)); return this; }
 public String getCnpj() { return stringValue(field("cnpj")); }
 public EmitterReplaceNfsePayloadRpsItemTomador setCnpj(String value) { put("cnpj", Json.scalar(value)); return this; }
 public String getCodigoMunicipio() { return stringValue(field("codigo_municipio")); }
 public EmitterReplaceNfsePayloadRpsItemTomador setCodigoMunicipio(String value) { put("codigo_municipio", Json.scalar(value)); return this; }
 public String getCodigoPais() { return stringValue(field("codigo_pais")); }
 public EmitterReplaceNfsePayloadRpsItemTomador setCodigoPais(String value) { put("codigo_pais", Json.scalar(value)); return this; }
 public String getCodigoPostal() { return stringValue(field("codigo_postal")); }
 public EmitterReplaceNfsePayloadRpsItemTomador setCodigoPostal(String value) { put("codigo_postal", Json.scalar(value)); return this; }
 public EmitterReplaceNfsePayloadRpsItemTomadorComplemento getComplemento() { return (field("complemento")).isNull() || (field("complemento")).isMissingNode() ? null : new EmitterReplaceNfsePayloadRpsItemTomadorComplemento(field("complemento")); }
 public EmitterReplaceNfsePayloadRpsItemTomador setComplemento(EmitterReplaceNfsePayloadRpsItemTomadorComplemento value) { put("complemento", value == null ? null : value.toJson()); return this; }
 public String getCpf() { return stringValue(field("cpf")); }
 public EmitterReplaceNfsePayloadRpsItemTomador setCpf(String value) { put("cpf", Json.scalar(value)); return this; }
 public String getEmail() { return stringValue(field("email")); }
 public EmitterReplaceNfsePayloadRpsItemTomador setEmail(String value) { put("email", Json.scalar(value)); return this; }
 public String getEndereco() { return stringValue(field("endereco")); }
 public EmitterReplaceNfsePayloadRpsItemTomador setEndereco(String value) { put("endereco", Json.scalar(value)); return this; }
 public String getEnderecoCompletoExterior() { return stringValue(field("endereco_completo_exterior")); }
 public EmitterReplaceNfsePayloadRpsItemTomador setEnderecoCompletoExterior(String value) { put("endereco_completo_exterior", Json.scalar(value)); return this; }
 public String getEstadoProvincia() { return stringValue(field("estado_provincia")); }
 public EmitterReplaceNfsePayloadRpsItemTomador setEstadoProvincia(String value) { put("estado_provincia", Json.scalar(value)); return this; }
 public String getFantasia() { return stringValue(field("fantasia")); }
 public EmitterReplaceNfsePayloadRpsItemTomador setFantasia(String value) { put("fantasia", Json.scalar(value)); return this; }
 public String getIdEstrangeiro() { return stringValue(field("id_estrangeiro")); }
 public EmitterReplaceNfsePayloadRpsItemTomador setIdEstrangeiro(String value) { put("id_estrangeiro", Json.scalar(value)); return this; }
 public String getIe() { return stringValue(field("ie")); }
 public EmitterReplaceNfsePayloadRpsItemTomador setIe(String value) { put("ie", Json.scalar(value)); return this; }
 public String getIm() { return stringValue(field("im")); }
 public EmitterReplaceNfsePayloadRpsItemTomador setIm(String value) { put("im", Json.scalar(value)); return this; }
 public String getNif() { return stringValue(field("nif")); }
 public EmitterReplaceNfsePayloadRpsItemTomador setNif(String value) { put("nif", Json.scalar(value)); return this; }
 public String getNomeCompleto() { return stringValue(field("nome_completo")); }
 public EmitterReplaceNfsePayloadRpsItemTomador setNomeCompleto(String value) { put("nome_completo", Json.scalar(value)); return this; }
 public String getNomeEstrangeiro() { return stringValue(field("nome_estrangeiro")); }
 public EmitterReplaceNfsePayloadRpsItemTomador setNomeEstrangeiro(String value) { put("nome_estrangeiro", Json.scalar(value)); return this; }
 public String getNumero() { return stringValue(field("numero")); }
 public EmitterReplaceNfsePayloadRpsItemTomador setNumero(String value) { put("numero", Json.scalar(value)); return this; }
 public String getPais() { return stringValue(field("pais")); }
 public EmitterReplaceNfsePayloadRpsItemTomador setPais(String value) { put("pais", Json.scalar(value)); return this; }
 public EmitterReplaceNfsePayloadRpsItemTomadorRazaoSocial getRazaoSocial() { return (field("razao_social")).isNull() || (field("razao_social")).isMissingNode() ? null : new EmitterReplaceNfsePayloadRpsItemTomadorRazaoSocial(field("razao_social")); }
 public EmitterReplaceNfsePayloadRpsItemTomador setRazaoSocial(EmitterReplaceNfsePayloadRpsItemTomadorRazaoSocial value) { put("razao_social", value == null ? null : value.toJson()); return this; }
 public String getSiglaPais() { return stringValue(field("sigla_pais")); }
 public EmitterReplaceNfsePayloadRpsItemTomador setSiglaPais(String value) { put("sigla_pais", Json.scalar(value)); return this; }
 public String getTelefone() { return stringValue(field("telefone")); }
 public EmitterReplaceNfsePayloadRpsItemTomador setTelefone(String value) { put("telefone", Json.scalar(value)); return this; }
 public String getUf() { return stringValue(field("uf")); }
 public EmitterReplaceNfsePayloadRpsItemTomador setUf(String value) { put("uf", Json.scalar(value)); return this; }
}
