package com.webmania.sdk.model.api2monitordocuments;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/monitor-documents.openapi.json; see contract-provenance.json. */
public final class MonitorDocumentMdfeRodoviarioCondutorItem extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("cpf", "nome");
 public MonitorDocumentMdfeRodoviarioCondutorItem() { super(FIELDS); }
 public MonitorDocumentMdfeRodoviarioCondutorItem(JsonNode node) { super(node, FIELDS); }
 public String getCpf() { return stringValue(field("cpf")); }
 public MonitorDocumentMdfeRodoviarioCondutorItem setCpf(String value) { put("cpf", Json.scalar(value)); return this; }
 public String getNome() { return stringValue(field("nome")); }
 public MonitorDocumentMdfeRodoviarioCondutorItem setNome(String value) { put("nome", Json.scalar(value)); return this; }
}
