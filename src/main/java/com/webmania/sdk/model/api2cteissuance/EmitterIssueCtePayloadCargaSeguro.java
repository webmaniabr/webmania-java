package com.webmania.sdk.model.api2cteissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/cte-issuance.openapi.json; see contract-provenance.json. */
public final class EmitterIssueCtePayloadCargaSeguro extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("nome_razao_seguradora", "numero_apolice", "responsavel");
 public EmitterIssueCtePayloadCargaSeguro() { super(FIELDS); }
 public EmitterIssueCtePayloadCargaSeguro(JsonNode node) { super(node, FIELDS); }
 public String getNomeRazaoSeguradora() { return stringValue(field("nome_razao_seguradora")); }
 public EmitterIssueCtePayloadCargaSeguro setNomeRazaoSeguradora(String value) { put("nome_razao_seguradora", Json.scalar(value)); return this; }
 public String getNumeroApolice() { return stringValue(field("numero_apolice")); }
 public EmitterIssueCtePayloadCargaSeguro setNumeroApolice(String value) { put("numero_apolice", Json.scalar(value)); return this; }
 public String getResponsavel() { return stringValue(field("responsavel")); }
 public EmitterIssueCtePayloadCargaSeguro setResponsavel(String value) { put("responsavel", Json.scalar(value)); return this; }
}
