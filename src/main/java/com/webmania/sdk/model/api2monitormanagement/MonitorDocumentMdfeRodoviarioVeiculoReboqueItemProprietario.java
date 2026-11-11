package com.webmania.sdk.model.api2monitormanagement;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/monitor-management.openapi.json; see contract-provenance.json. */
public final class MonitorDocumentMdfeRodoviarioVeiculoReboqueItemProprietario extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("cnpj", "cpf", "razao_social", "nome_completo", "ie", "rntrc", "uf", "tipo_proprietario");
 public MonitorDocumentMdfeRodoviarioVeiculoReboqueItemProprietario() { super(FIELDS); }
 public MonitorDocumentMdfeRodoviarioVeiculoReboqueItemProprietario(JsonNode node) { super(node, FIELDS); }
 public String getCnpj() { return stringValue(field("cnpj")); }
 public MonitorDocumentMdfeRodoviarioVeiculoReboqueItemProprietario setCnpj(String value) { put("cnpj", Json.scalar(value)); return this; }
 public String getCpf() { return stringValue(field("cpf")); }
 public MonitorDocumentMdfeRodoviarioVeiculoReboqueItemProprietario setCpf(String value) { put("cpf", Json.scalar(value)); return this; }
 public String getRazaoSocial() { return stringValue(field("razao_social")); }
 public MonitorDocumentMdfeRodoviarioVeiculoReboqueItemProprietario setRazaoSocial(String value) { put("razao_social", Json.scalar(value)); return this; }
 public String getNomeCompleto() { return stringValue(field("nome_completo")); }
 public MonitorDocumentMdfeRodoviarioVeiculoReboqueItemProprietario setNomeCompleto(String value) { put("nome_completo", Json.scalar(value)); return this; }
 public String getIe() { return stringValue(field("ie")); }
 public MonitorDocumentMdfeRodoviarioVeiculoReboqueItemProprietario setIe(String value) { put("ie", Json.scalar(value)); return this; }
 public String getRntrc() { return stringValue(field("rntrc")); }
 public MonitorDocumentMdfeRodoviarioVeiculoReboqueItemProprietario setRntrc(String value) { put("rntrc", Json.scalar(value)); return this; }
 public String getUf() { return stringValue(field("uf")); }
 public MonitorDocumentMdfeRodoviarioVeiculoReboqueItemProprietario setUf(String value) { put("uf", Json.scalar(value)); return this; }
 public java.math.BigDecimal getTipoProprietario() { return decimalValue(field("tipo_proprietario")); }
 public MonitorDocumentMdfeRodoviarioVeiculoReboqueItemProprietario setTipoProprietario(java.math.BigDecimal value) { put("tipo_proprietario", Json.scalar(value)); return this; }
}
