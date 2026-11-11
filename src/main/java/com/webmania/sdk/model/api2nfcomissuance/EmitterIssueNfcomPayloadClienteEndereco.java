package com.webmania.sdk.model.api2nfcomissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/nfcom-issuance.openapi.json; see contract-provenance.json. */
public final class EmitterIssueNfcomPayloadClienteEndereco extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("bairro", "cep", "codigo_municipio", "codigo_pais", "complemento", "logradouro", "municipio", "numero", "pais", "telefone", "uf");
 public EmitterIssueNfcomPayloadClienteEndereco() { super(FIELDS); }
 public EmitterIssueNfcomPayloadClienteEndereco(JsonNode node) { super(node, FIELDS); }
 public String getBairro() { return stringValue(field("bairro")); }
 public EmitterIssueNfcomPayloadClienteEndereco setBairro(String value) { put("bairro", Json.scalar(value)); return this; }
 public String getCep() { return stringValue(field("cep")); }
 public EmitterIssueNfcomPayloadClienteEndereco setCep(String value) { put("cep", Json.scalar(value)); return this; }
 public String getCodigoMunicipio() { return stringValue(field("codigo_municipio")); }
 public EmitterIssueNfcomPayloadClienteEndereco setCodigoMunicipio(String value) { put("codigo_municipio", Json.scalar(value)); return this; }
 public EmitterIssueNfcomPayloadClienteEnderecoCodigoPais getCodigoPais() { return (field("codigo_pais")).isNull() || (field("codigo_pais")).isMissingNode() ? null : new EmitterIssueNfcomPayloadClienteEnderecoCodigoPais(field("codigo_pais")); }
 public EmitterIssueNfcomPayloadClienteEndereco setCodigoPais(EmitterIssueNfcomPayloadClienteEnderecoCodigoPais value) { put("codigo_pais", value == null ? null : value.toJson()); return this; }
 public EmitterIssueNfcomPayloadClienteEnderecoComplemento getComplemento() { return (field("complemento")).isNull() || (field("complemento")).isMissingNode() ? null : new EmitterIssueNfcomPayloadClienteEnderecoComplemento(field("complemento")); }
 public EmitterIssueNfcomPayloadClienteEndereco setComplemento(EmitterIssueNfcomPayloadClienteEnderecoComplemento value) { put("complemento", value == null ? null : value.toJson()); return this; }
 public String getLogradouro() { return stringValue(field("logradouro")); }
 public EmitterIssueNfcomPayloadClienteEndereco setLogradouro(String value) { put("logradouro", Json.scalar(value)); return this; }
 public String getMunicipio() { return stringValue(field("municipio")); }
 public EmitterIssueNfcomPayloadClienteEndereco setMunicipio(String value) { put("municipio", Json.scalar(value)); return this; }
 public String getNumero() { return stringValue(field("numero")); }
 public EmitterIssueNfcomPayloadClienteEndereco setNumero(String value) { put("numero", Json.scalar(value)); return this; }
 public EmitterIssueNfcomPayloadClienteEnderecoPais getPais() { return (field("pais")).isNull() || (field("pais")).isMissingNode() ? null : new EmitterIssueNfcomPayloadClienteEnderecoPais(field("pais")); }
 public EmitterIssueNfcomPayloadClienteEndereco setPais(EmitterIssueNfcomPayloadClienteEnderecoPais value) { put("pais", value == null ? null : value.toJson()); return this; }
 public EmitterIssueNfcomPayloadClienteEnderecoTelefone getTelefone() { return (field("telefone")).isNull() || (field("telefone")).isMissingNode() ? null : new EmitterIssueNfcomPayloadClienteEnderecoTelefone(field("telefone")); }
 public EmitterIssueNfcomPayloadClienteEndereco setTelefone(EmitterIssueNfcomPayloadClienteEnderecoTelefone value) { put("telefone", value == null ? null : value.toJson()); return this; }
 public String getUf() { return stringValue(field("uf")); }
 public EmitterIssueNfcomPayloadClienteEndereco setUf(String value) { put("uf", Json.scalar(value)); return this; }
}
