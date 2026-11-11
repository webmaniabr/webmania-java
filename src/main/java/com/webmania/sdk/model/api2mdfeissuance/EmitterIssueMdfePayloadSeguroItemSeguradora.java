package com.webmania.sdk.model.api2mdfeissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/mdfe-issuance.openapi.json; see contract-provenance.json. */
public final class EmitterIssueMdfePayloadSeguroItemSeguradora extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("cnpj", "nome_seguradora");
 public EmitterIssueMdfePayloadSeguroItemSeguradora() { super(FIELDS); }
 public EmitterIssueMdfePayloadSeguroItemSeguradora(JsonNode node) { super(node, FIELDS); }
 public String getCnpj() { return stringValue(field("cnpj")); }
 public EmitterIssueMdfePayloadSeguroItemSeguradora setCnpj(String value) { put("cnpj", Json.scalar(value)); return this; }
 public String getNomeSeguradora() { return stringValue(field("nome_seguradora")); }
 public EmitterIssueMdfePayloadSeguroItemSeguradora setNomeSeguradora(String value) { put("nome_seguradora", Json.scalar(value)); return this; }
}
