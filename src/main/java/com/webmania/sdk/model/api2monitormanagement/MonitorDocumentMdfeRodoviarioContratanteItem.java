package com.webmania.sdk.model.api2monitormanagement;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/monitor-management.openapi.json; see contract-provenance.json. */
public final class MonitorDocumentMdfeRodoviarioContratanteItem extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("cnpj", "cpf");
 public MonitorDocumentMdfeRodoviarioContratanteItem() { super(FIELDS); }
 public MonitorDocumentMdfeRodoviarioContratanteItem(JsonNode node) { super(node, FIELDS); }
 public String getCnpj() { return stringValue(field("cnpj")); }
 public MonitorDocumentMdfeRodoviarioContratanteItem setCnpj(String value) { put("cnpj", Json.scalar(value)); return this; }
 public String getCpf() { return stringValue(field("cpf")); }
 public MonitorDocumentMdfeRodoviarioContratanteItem setCpf(String value) { put("cpf", Json.scalar(value)); return this; }
}
