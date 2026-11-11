package com.webmania.sdk.model.api2monitordocuments;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/monitor-documents.openapi.json; see contract-provenance.json. */
public final class MonitorDocumentMdfeRodoviarioContratantesItem extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("cnpj", "razao_social");
 public MonitorDocumentMdfeRodoviarioContratantesItem() { super(FIELDS); }
 public MonitorDocumentMdfeRodoviarioContratantesItem(JsonNode node) { super(node, FIELDS); }
 public String getCnpj() { return stringValue(field("cnpj")); }
 public MonitorDocumentMdfeRodoviarioContratantesItem setCnpj(String value) { put("cnpj", Json.scalar(value)); return this; }
 public String getRazaoSocial() { return stringValue(field("razao_social")); }
 public MonitorDocumentMdfeRodoviarioContratantesItem setRazaoSocial(String value) { put("razao_social", Json.scalar(value)); return this; }
}
