package com.webmania.sdk.model.api2nfseissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/nfse-issuance.openapi.json; see contract-provenance.json. */
public final class EmitterIssueNfsePayloadRpsItemServicoReembolsoRepasseDocumentosItemFornecedor extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("cnpj", "cpf", "id_estrangeiro", "indicador_nao_nif", "nome");
 public EmitterIssueNfsePayloadRpsItemServicoReembolsoRepasseDocumentosItemFornecedor() { super(FIELDS); }
 public EmitterIssueNfsePayloadRpsItemServicoReembolsoRepasseDocumentosItemFornecedor(JsonNode node) { super(node, FIELDS); }
 public String getCnpj() { return stringValue(field("cnpj")); }
 public EmitterIssueNfsePayloadRpsItemServicoReembolsoRepasseDocumentosItemFornecedor setCnpj(String value) { put("cnpj", Json.scalar(value)); return this; }
 public String getCpf() { return stringValue(field("cpf")); }
 public EmitterIssueNfsePayloadRpsItemServicoReembolsoRepasseDocumentosItemFornecedor setCpf(String value) { put("cpf", Json.scalar(value)); return this; }
 public String getIdEstrangeiro() { return stringValue(field("id_estrangeiro")); }
 public EmitterIssueNfsePayloadRpsItemServicoReembolsoRepasseDocumentosItemFornecedor setIdEstrangeiro(String value) { put("id_estrangeiro", Json.scalar(value)); return this; }
 public JsonValue getIndicadorNaoNif() { return (field("indicador_nao_nif")).isNull() || (field("indicador_nao_nif")).isMissingNode() ? null : new JsonValue(field("indicador_nao_nif")); }
 public EmitterIssueNfsePayloadRpsItemServicoReembolsoRepasseDocumentosItemFornecedor setIndicadorNaoNif(JsonValue value) { put("indicador_nao_nif", value == null ? null : value.toJson()); return this; }
 public String getNome() { return stringValue(field("nome")); }
 public EmitterIssueNfsePayloadRpsItemServicoReembolsoRepasseDocumentosItemFornecedor setNome(String value) { put("nome", Json.scalar(value)); return this; }
}
