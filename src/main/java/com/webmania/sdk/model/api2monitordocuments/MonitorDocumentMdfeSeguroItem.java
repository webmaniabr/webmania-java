package com.webmania.sdk.model.api2monitordocuments;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/monitor-documents.openapi.json; see contract-provenance.json. */
public final class MonitorDocumentMdfeSeguroItem extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("responsavel", "seguradora", "numero_apolice", "numero_averbacao");
 public MonitorDocumentMdfeSeguroItem() { super(FIELDS); }
 public MonitorDocumentMdfeSeguroItem(JsonNode node) { super(node, FIELDS); }
 public MonitorDocumentMdfeSeguroItemResponsavel getResponsavel() { return (field("responsavel")).isNull() || (field("responsavel")).isMissingNode() ? null : new MonitorDocumentMdfeSeguroItemResponsavel(field("responsavel")); }
 public MonitorDocumentMdfeSeguroItem setResponsavel(MonitorDocumentMdfeSeguroItemResponsavel value) { put("responsavel", value == null ? null : value.toJson()); return this; }
 public MonitorDocumentMdfeSeguroItemSeguradora getSeguradora() { return (field("seguradora")).isNull() || (field("seguradora")).isMissingNode() ? null : new MonitorDocumentMdfeSeguroItemSeguradora(field("seguradora")); }
 public MonitorDocumentMdfeSeguroItem setSeguradora(MonitorDocumentMdfeSeguroItemSeguradora value) { put("seguradora", value == null ? null : value.toJson()); return this; }
 public String getNumeroApolice() { return stringValue(field("numero_apolice")); }
 public MonitorDocumentMdfeSeguroItem setNumeroApolice(String value) { put("numero_apolice", Json.scalar(value)); return this; }
 public java.util.List<String> getNumeroAverbacao() { return list(field("numero_averbacao"), v -> stringValue(v)); }
 public MonitorDocumentMdfeSeguroItem setNumeroAverbacao(java.util.List<String> value) { put("numero_averbacao", array(value, v -> Json.scalar(v))); return this; }
}
