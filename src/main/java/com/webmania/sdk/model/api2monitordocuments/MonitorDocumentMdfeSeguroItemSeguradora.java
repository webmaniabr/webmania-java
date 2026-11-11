package com.webmania.sdk.model.api2monitordocuments;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/monitor-documents.openapi.json; see contract-provenance.json. */
public final class MonitorDocumentMdfeSeguroItemSeguradora extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("cnpj", "nome_seguradora");
 public MonitorDocumentMdfeSeguroItemSeguradora() { super(FIELDS); }
 public MonitorDocumentMdfeSeguroItemSeguradora(JsonNode node) { super(node, FIELDS); }
 public String getCnpj() { return stringValue(field("cnpj")); }
 public MonitorDocumentMdfeSeguroItemSeguradora setCnpj(String value) { put("cnpj", Json.scalar(value)); return this; }
 public String getNomeSeguradora() { return stringValue(field("nome_seguradora")); }
 public MonitorDocumentMdfeSeguroItemSeguradora setNomeSeguradora(String value) { put("nome_seguradora", Json.scalar(value)); return this; }
}
