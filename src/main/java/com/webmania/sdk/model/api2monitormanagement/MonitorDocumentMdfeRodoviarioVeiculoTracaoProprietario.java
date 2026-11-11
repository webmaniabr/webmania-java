package com.webmania.sdk.model.api2monitormanagement;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/monitor-management.openapi.json; see contract-provenance.json. */
public final class MonitorDocumentMdfeRodoviarioVeiculoTracaoProprietario extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("cnpj", "cpf", "razao_social", "nome_completo", "ie", "rntrc", "uf", "tipo_proprietario");
 public MonitorDocumentMdfeRodoviarioVeiculoTracaoProprietario() { super(FIELDS); }
 public MonitorDocumentMdfeRodoviarioVeiculoTracaoProprietario(JsonNode node) { super(node, FIELDS); }
 public String getCnpj() { return stringValue(field("cnpj")); }
 public MonitorDocumentMdfeRodoviarioVeiculoTracaoProprietario setCnpj(String value) { put("cnpj", Json.scalar(value)); return this; }
 public String getCpf() { return stringValue(field("cpf")); }
 public MonitorDocumentMdfeRodoviarioVeiculoTracaoProprietario setCpf(String value) { put("cpf", Json.scalar(value)); return this; }
 public String getRazaoSocial() { return stringValue(field("razao_social")); }
 public MonitorDocumentMdfeRodoviarioVeiculoTracaoProprietario setRazaoSocial(String value) { put("razao_social", Json.scalar(value)); return this; }
 public String getNomeCompleto() { return stringValue(field("nome_completo")); }
 public MonitorDocumentMdfeRodoviarioVeiculoTracaoProprietario setNomeCompleto(String value) { put("nome_completo", Json.scalar(value)); return this; }
 public String getIe() { return stringValue(field("ie")); }
 public MonitorDocumentMdfeRodoviarioVeiculoTracaoProprietario setIe(String value) { put("ie", Json.scalar(value)); return this; }
 public String getRntrc() { return stringValue(field("rntrc")); }
 public MonitorDocumentMdfeRodoviarioVeiculoTracaoProprietario setRntrc(String value) { put("rntrc", Json.scalar(value)); return this; }
 public String getUf() { return stringValue(field("uf")); }
 public MonitorDocumentMdfeRodoviarioVeiculoTracaoProprietario setUf(String value) { put("uf", Json.scalar(value)); return this; }
 public java.math.BigDecimal getTipoProprietario() { return decimalValue(field("tipo_proprietario")); }
 public MonitorDocumentMdfeRodoviarioVeiculoTracaoProprietario setTipoProprietario(java.math.BigDecimal value) { put("tipo_proprietario", Json.scalar(value)); return this; }
}
