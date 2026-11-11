package com.webmania.sdk.model.api2cteissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/cte-issuance.openapi.json; see contract-provenance.json. */
public final class EmitterIssueCtePayloadMultimodalSeguro extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("cnpj_seguradora", "nome_razao_seguradora", "numero_apolice", "numero_averbacao");
 public EmitterIssueCtePayloadMultimodalSeguro() { super(FIELDS); }
 public EmitterIssueCtePayloadMultimodalSeguro(JsonNode node) { super(node, FIELDS); }
 public String getCnpjSeguradora() { return stringValue(field("cnpj_seguradora")); }
 public EmitterIssueCtePayloadMultimodalSeguro setCnpjSeguradora(String value) { put("cnpj_seguradora", Json.scalar(value)); return this; }
 public String getNomeRazaoSeguradora() { return stringValue(field("nome_razao_seguradora")); }
 public EmitterIssueCtePayloadMultimodalSeguro setNomeRazaoSeguradora(String value) { put("nome_razao_seguradora", Json.scalar(value)); return this; }
 public String getNumeroApolice() { return stringValue(field("numero_apolice")); }
 public EmitterIssueCtePayloadMultimodalSeguro setNumeroApolice(String value) { put("numero_apolice", Json.scalar(value)); return this; }
 public String getNumeroAverbacao() { return stringValue(field("numero_averbacao")); }
 public EmitterIssueCtePayloadMultimodalSeguro setNumeroAverbacao(String value) { put("numero_averbacao", Json.scalar(value)); return this; }
}
