package com.webmania.sdk.model.api2cteissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/cte-issuance.openapi.json; see contract-provenance.json. */
public final class EmitterIssueCtePayloadDocumentosAnterioresItemEmissor extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("cnpj", "cpf", "ie", "nome_razao", "uf");
 public EmitterIssueCtePayloadDocumentosAnterioresItemEmissor() { super(FIELDS); }
 public EmitterIssueCtePayloadDocumentosAnterioresItemEmissor(JsonNode node) { super(node, FIELDS); }
 public String getCnpj() { return stringValue(field("cnpj")); }
 public EmitterIssueCtePayloadDocumentosAnterioresItemEmissor setCnpj(String value) { put("cnpj", Json.scalar(value)); return this; }
 public String getCpf() { return stringValue(field("cpf")); }
 public EmitterIssueCtePayloadDocumentosAnterioresItemEmissor setCpf(String value) { put("cpf", Json.scalar(value)); return this; }
 public String getIe() { return stringValue(field("ie")); }
 public EmitterIssueCtePayloadDocumentosAnterioresItemEmissor setIe(String value) { put("ie", Json.scalar(value)); return this; }
 public String getNomeRazao() { return stringValue(field("nome_razao")); }
 public EmitterIssueCtePayloadDocumentosAnterioresItemEmissor setNomeRazao(String value) { put("nome_razao", Json.scalar(value)); return this; }
 public String getUf() { return stringValue(field("uf")); }
 public EmitterIssueCtePayloadDocumentosAnterioresItemEmissor setUf(String value) { put("uf", Json.scalar(value)); return this; }
}
