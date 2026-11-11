package com.webmania.sdk.model.api2nfseissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/nfse-issuance.openapi.json; see contract-provenance.json. */
public final class EmitterIssueNfsePayloadRpsItemDestinatario extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("cnpj", "cpf", "email", "endereco", "id_estrangeiro", "indicador_nao_nif", "nome", "telefone", "nif");
 public EmitterIssueNfsePayloadRpsItemDestinatario() { super(FIELDS); }
 public EmitterIssueNfsePayloadRpsItemDestinatario(JsonNode node) { super(node, FIELDS); }
 public String getCnpj() { return stringValue(field("cnpj")); }
 public EmitterIssueNfsePayloadRpsItemDestinatario setCnpj(String value) { put("cnpj", Json.scalar(value)); return this; }
 public String getCpf() { return stringValue(field("cpf")); }
 public EmitterIssueNfsePayloadRpsItemDestinatario setCpf(String value) { put("cpf", Json.scalar(value)); return this; }
 public String getEmail() { return stringValue(field("email")); }
 public EmitterIssueNfsePayloadRpsItemDestinatario setEmail(String value) { put("email", Json.scalar(value)); return this; }
 public EmitterIssueNfsePayloadRpsItemDestinatarioEndereco getEndereco() { return (field("endereco")).isNull() || (field("endereco")).isMissingNode() ? null : new EmitterIssueNfsePayloadRpsItemDestinatarioEndereco(field("endereco")); }
 public EmitterIssueNfsePayloadRpsItemDestinatario setEndereco(EmitterIssueNfsePayloadRpsItemDestinatarioEndereco value) { put("endereco", value == null ? null : value.toJson()); return this; }
 public String getIdEstrangeiro() { return stringValue(field("id_estrangeiro")); }
 public EmitterIssueNfsePayloadRpsItemDestinatario setIdEstrangeiro(String value) { put("id_estrangeiro", Json.scalar(value)); return this; }
 public JsonValue getIndicadorNaoNif() { return (field("indicador_nao_nif")).isNull() || (field("indicador_nao_nif")).isMissingNode() ? null : new JsonValue(field("indicador_nao_nif")); }
 public EmitterIssueNfsePayloadRpsItemDestinatario setIndicadorNaoNif(JsonValue value) { put("indicador_nao_nif", value == null ? null : value.toJson()); return this; }
 public String getNome() { return stringValue(field("nome")); }
 public EmitterIssueNfsePayloadRpsItemDestinatario setNome(String value) { put("nome", Json.scalar(value)); return this; }
 public String getTelefone() { return stringValue(field("telefone")); }
 public EmitterIssueNfsePayloadRpsItemDestinatario setTelefone(String value) { put("telefone", Json.scalar(value)); return this; }
 public String getNif() { return stringValue(field("nif")); }
 public EmitterIssueNfsePayloadRpsItemDestinatario setNif(String value) { put("nif", Json.scalar(value)); return this; }
}
