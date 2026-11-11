package com.webmania.sdk.model.api2monitordocuments;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/monitor-documents.openapi.json; see contract-provenance.json. */
public final class MonitorDocumentMdfeSeguroItemResponsavel extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("tipo_responsavel", "cnpj", "cpf");
 public MonitorDocumentMdfeSeguroItemResponsavel() { super(FIELDS); }
 public MonitorDocumentMdfeSeguroItemResponsavel(JsonNode node) { super(node, FIELDS); }
 public String getTipoResponsavel() { return stringValue(field("tipo_responsavel")); }
 public MonitorDocumentMdfeSeguroItemResponsavel setTipoResponsavel(String value) { put("tipo_responsavel", Json.scalar(value)); return this; }
 public String getCnpj() { return stringValue(field("cnpj")); }
 public MonitorDocumentMdfeSeguroItemResponsavel setCnpj(String value) { put("cnpj", Json.scalar(value)); return this; }
 public String getCpf() { return stringValue(field("cpf")); }
 public MonitorDocumentMdfeSeguroItemResponsavel setCpf(String value) { put("cpf", Json.scalar(value)); return this; }
}
