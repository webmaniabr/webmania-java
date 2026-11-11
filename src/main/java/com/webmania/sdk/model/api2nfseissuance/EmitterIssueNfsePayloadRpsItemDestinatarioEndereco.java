package com.webmania.sdk.model.api2nfseissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/nfse-issuance.openapi.json; see contract-provenance.json. */
public final class EmitterIssueNfsePayloadRpsItemDestinatarioEndereco extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("bairro", "complemento", "endereco_exterior", "endereco_nacional", "logradouro", "numero");
 public EmitterIssueNfsePayloadRpsItemDestinatarioEndereco() { super(FIELDS); }
 public EmitterIssueNfsePayloadRpsItemDestinatarioEndereco(JsonNode node) { super(node, FIELDS); }
 public String getBairro() { return stringValue(field("bairro")); }
 public EmitterIssueNfsePayloadRpsItemDestinatarioEndereco setBairro(String value) { put("bairro", Json.scalar(value)); return this; }
 public String getComplemento() { return stringValue(field("complemento")); }
 public EmitterIssueNfsePayloadRpsItemDestinatarioEndereco setComplemento(String value) { put("complemento", Json.scalar(value)); return this; }
 public EmitterIssueNfsePayloadRpsItemDestinatarioEnderecoEnderecoExterior getEnderecoExterior() { return (field("endereco_exterior")).isNull() || (field("endereco_exterior")).isMissingNode() ? null : new EmitterIssueNfsePayloadRpsItemDestinatarioEnderecoEnderecoExterior(field("endereco_exterior")); }
 public EmitterIssueNfsePayloadRpsItemDestinatarioEndereco setEnderecoExterior(EmitterIssueNfsePayloadRpsItemDestinatarioEnderecoEnderecoExterior value) { put("endereco_exterior", value == null ? null : value.toJson()); return this; }
 public EmitterIssueNfsePayloadRpsItemDestinatarioEnderecoEnderecoNacional getEnderecoNacional() { return (field("endereco_nacional")).isNull() || (field("endereco_nacional")).isMissingNode() ? null : new EmitterIssueNfsePayloadRpsItemDestinatarioEnderecoEnderecoNacional(field("endereco_nacional")); }
 public EmitterIssueNfsePayloadRpsItemDestinatarioEndereco setEnderecoNacional(EmitterIssueNfsePayloadRpsItemDestinatarioEnderecoEnderecoNacional value) { put("endereco_nacional", value == null ? null : value.toJson()); return this; }
 public String getLogradouro() { return stringValue(field("logradouro")); }
 public EmitterIssueNfsePayloadRpsItemDestinatarioEndereco setLogradouro(String value) { put("logradouro", Json.scalar(value)); return this; }
 public String getNumero() { return stringValue(field("numero")); }
 public EmitterIssueNfsePayloadRpsItemDestinatarioEndereco setNumero(String value) { put("numero", Json.scalar(value)); return this; }
}
