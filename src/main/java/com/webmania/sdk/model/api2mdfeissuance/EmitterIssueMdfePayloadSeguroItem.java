package com.webmania.sdk.model.api2mdfeissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/mdfe-issuance.openapi.json; see contract-provenance.json. */
public final class EmitterIssueMdfePayloadSeguroItem extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("numero_apolice", "numero_averbacao", "responsavel", "seguradora");
 public EmitterIssueMdfePayloadSeguroItem() { super(FIELDS); }
 public EmitterIssueMdfePayloadSeguroItem(JsonNode node) { super(node, FIELDS); }
 public String getNumeroApolice() { return stringValue(field("numero_apolice")); }
 public EmitterIssueMdfePayloadSeguroItem setNumeroApolice(String value) { put("numero_apolice", Json.scalar(value)); return this; }
 public java.util.List<String> getNumeroAverbacao() { return list(field("numero_averbacao"), v -> stringValue(v)); }
 public EmitterIssueMdfePayloadSeguroItem setNumeroAverbacao(java.util.List<String> value) { put("numero_averbacao", array(value, v -> Json.scalar(v))); return this; }
 public EmitterIssueMdfePayloadSeguroItemResponsavel getResponsavel() { return (field("responsavel")).isNull() || (field("responsavel")).isMissingNode() ? null : new EmitterIssueMdfePayloadSeguroItemResponsavel(field("responsavel")); }
 public EmitterIssueMdfePayloadSeguroItem setResponsavel(EmitterIssueMdfePayloadSeguroItemResponsavel value) { put("responsavel", value == null ? null : value.toJson()); return this; }
 public EmitterIssueMdfePayloadSeguroItemSeguradora getSeguradora() { return (field("seguradora")).isNull() || (field("seguradora")).isMissingNode() ? null : new EmitterIssueMdfePayloadSeguroItemSeguradora(field("seguradora")); }
 public EmitterIssueMdfePayloadSeguroItem setSeguradora(EmitterIssueMdfePayloadSeguroItemSeguradora value) { put("seguradora", value == null ? null : value.toJson()); return this; }
}
