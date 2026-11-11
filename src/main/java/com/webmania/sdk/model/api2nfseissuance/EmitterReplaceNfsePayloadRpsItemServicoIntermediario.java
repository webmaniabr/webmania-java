package com.webmania.sdk.model.api2nfseissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/nfse-issuance.openapi.json; see contract-provenance.json. */
public final class EmitterReplaceNfsePayloadRpsItemServicoIntermediario extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("cnpj", "cpf", "im", "nome_completo", "razao_social");
 public EmitterReplaceNfsePayloadRpsItemServicoIntermediario() { super(FIELDS); }
 public EmitterReplaceNfsePayloadRpsItemServicoIntermediario(JsonNode node) { super(node, FIELDS); }
 public String getCnpj() { return stringValue(field("cnpj")); }
 public EmitterReplaceNfsePayloadRpsItemServicoIntermediario setCnpj(String value) { put("cnpj", Json.scalar(value)); return this; }
 public String getCpf() { return stringValue(field("cpf")); }
 public EmitterReplaceNfsePayloadRpsItemServicoIntermediario setCpf(String value) { put("cpf", Json.scalar(value)); return this; }
 public String getIm() { return stringValue(field("im")); }
 public EmitterReplaceNfsePayloadRpsItemServicoIntermediario setIm(String value) { put("im", Json.scalar(value)); return this; }
 public String getNomeCompleto() { return stringValue(field("nome_completo")); }
 public EmitterReplaceNfsePayloadRpsItemServicoIntermediario setNomeCompleto(String value) { put("nome_completo", Json.scalar(value)); return this; }
 public String getRazaoSocial() { return stringValue(field("razao_social")); }
 public EmitterReplaceNfsePayloadRpsItemServicoIntermediario setRazaoSocial(String value) { put("razao_social", Json.scalar(value)); return this; }
}
