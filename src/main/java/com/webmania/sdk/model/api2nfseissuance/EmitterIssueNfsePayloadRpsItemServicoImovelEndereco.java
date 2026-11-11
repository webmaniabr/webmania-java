package com.webmania.sdk.model.api2nfseissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/nfse-issuance.openapi.json; see contract-provenance.json. */
public final class EmitterIssueNfsePayloadRpsItemServicoImovelEndereco extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("bairro", "complemento", "endereco_exterior", "endereco_nacional", "logradouro", "numero");
 public EmitterIssueNfsePayloadRpsItemServicoImovelEndereco() { super(FIELDS); }
 public EmitterIssueNfsePayloadRpsItemServicoImovelEndereco(JsonNode node) { super(node, FIELDS); }
 public String getBairro() { return stringValue(field("bairro")); }
 public EmitterIssueNfsePayloadRpsItemServicoImovelEndereco setBairro(String value) { put("bairro", Json.scalar(value)); return this; }
 public String getComplemento() { return stringValue(field("complemento")); }
 public EmitterIssueNfsePayloadRpsItemServicoImovelEndereco setComplemento(String value) { put("complemento", Json.scalar(value)); return this; }
 public EmitterIssueNfsePayloadRpsItemServicoImovelEnderecoEnderecoExterior getEnderecoExterior() { return (field("endereco_exterior")).isNull() || (field("endereco_exterior")).isMissingNode() ? null : new EmitterIssueNfsePayloadRpsItemServicoImovelEnderecoEnderecoExterior(field("endereco_exterior")); }
 public EmitterIssueNfsePayloadRpsItemServicoImovelEndereco setEnderecoExterior(EmitterIssueNfsePayloadRpsItemServicoImovelEnderecoEnderecoExterior value) { put("endereco_exterior", value == null ? null : value.toJson()); return this; }
 public EmitterIssueNfsePayloadRpsItemServicoImovelEnderecoEnderecoNacional getEnderecoNacional() { return (field("endereco_nacional")).isNull() || (field("endereco_nacional")).isMissingNode() ? null : new EmitterIssueNfsePayloadRpsItemServicoImovelEnderecoEnderecoNacional(field("endereco_nacional")); }
 public EmitterIssueNfsePayloadRpsItemServicoImovelEndereco setEnderecoNacional(EmitterIssueNfsePayloadRpsItemServicoImovelEnderecoEnderecoNacional value) { put("endereco_nacional", value == null ? null : value.toJson()); return this; }
 public String getLogradouro() { return stringValue(field("logradouro")); }
 public EmitterIssueNfsePayloadRpsItemServicoImovelEndereco setLogradouro(String value) { put("logradouro", Json.scalar(value)); return this; }
 public String getNumero() { return stringValue(field("numero")); }
 public EmitterIssueNfsePayloadRpsItemServicoImovelEndereco setNumero(String value) { put("numero", Json.scalar(value)); return this; }
}
