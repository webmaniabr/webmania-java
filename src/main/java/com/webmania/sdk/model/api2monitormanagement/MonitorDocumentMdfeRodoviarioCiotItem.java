package com.webmania.sdk.model.api2monitormanagement;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/monitor-management.openapi.json; see contract-provenance.json. */
public final class MonitorDocumentMdfeRodoviarioCiotItem extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("cnpj_responsavel", "cpf_responsavel", "numero", "cpf_cnpj", "codigo_ciot");
 public MonitorDocumentMdfeRodoviarioCiotItem() { super(FIELDS); }
 public MonitorDocumentMdfeRodoviarioCiotItem(JsonNode node) { super(node, FIELDS); }
 public String getCnpjResponsavel() { return stringValue(field("cnpj_responsavel")); }
 public MonitorDocumentMdfeRodoviarioCiotItem setCnpjResponsavel(String value) { put("cnpj_responsavel", Json.scalar(value)); return this; }
 public String getCpfResponsavel() { return stringValue(field("cpf_responsavel")); }
 public MonitorDocumentMdfeRodoviarioCiotItem setCpfResponsavel(String value) { put("cpf_responsavel", Json.scalar(value)); return this; }
 public String getNumero() { return stringValue(field("numero")); }
 public MonitorDocumentMdfeRodoviarioCiotItem setNumero(String value) { put("numero", Json.scalar(value)); return this; }
 public String getCpfCnpj() { return stringValue(field("cpf_cnpj")); }
 public MonitorDocumentMdfeRodoviarioCiotItem setCpfCnpj(String value) { put("cpf_cnpj", Json.scalar(value)); return this; }
 public String getCodigoCiot() { return stringValue(field("codigo_ciot")); }
 public MonitorDocumentMdfeRodoviarioCiotItem setCodigoCiot(String value) { put("codigo_ciot", Json.scalar(value)); return this; }
}
