package com.webmania.sdk.model.api2monitordocuments;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/monitor-documents.openapi.json; see contract-provenance.json. */
public final class MonitorDocumentNfeResponsavelTecnico extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("telefone", "razao_social", "cnpj", "contato", "email");
 public MonitorDocumentNfeResponsavelTecnico() { super(FIELDS); }
 public MonitorDocumentNfeResponsavelTecnico(JsonNode node) { super(node, FIELDS); }
 public String getTelefone() { return stringValue(field("telefone")); }
 public MonitorDocumentNfeResponsavelTecnico setTelefone(String value) { put("telefone", Json.scalar(value)); return this; }
 public String getRazaoSocial() { return stringValue(field("razao_social")); }
 public MonitorDocumentNfeResponsavelTecnico setRazaoSocial(String value) { put("razao_social", Json.scalar(value)); return this; }
 public String getCnpj() { return stringValue(field("cnpj")); }
 public MonitorDocumentNfeResponsavelTecnico setCnpj(String value) { put("cnpj", Json.scalar(value)); return this; }
 public String getContato() { return stringValue(field("contato")); }
 public MonitorDocumentNfeResponsavelTecnico setContato(String value) { put("contato", Json.scalar(value)); return this; }
 public String getEmail() { return stringValue(field("email")); }
 public MonitorDocumentNfeResponsavelTecnico setEmail(String value) { put("email", Json.scalar(value)); return this; }
}
