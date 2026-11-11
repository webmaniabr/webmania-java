package com.webmania.sdk.model.api2monitordocuments;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/monitor-documents.openapi.json; see contract-provenance.json. */
public final class MonitorDocumentNfeTransporteEntrega extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("cnpj", "cpf", "razao_social", "nome_completo", "nome_fantasia", "ie", "endereco", "numero", "complemento", "bairro", "cep", "cidade", "uf", "telefone", "email");
 public MonitorDocumentNfeTransporteEntrega() { super(FIELDS); }
 public MonitorDocumentNfeTransporteEntrega(JsonNode node) { super(node, FIELDS); }
 public String getCnpj() { return stringValue(field("cnpj")); }
 public MonitorDocumentNfeTransporteEntrega setCnpj(String value) { put("cnpj", Json.scalar(value)); return this; }
 public String getCpf() { return stringValue(field("cpf")); }
 public MonitorDocumentNfeTransporteEntrega setCpf(String value) { put("cpf", Json.scalar(value)); return this; }
 public String getRazaoSocial() { return stringValue(field("razao_social")); }
 public MonitorDocumentNfeTransporteEntrega setRazaoSocial(String value) { put("razao_social", Json.scalar(value)); return this; }
 public String getNomeCompleto() { return stringValue(field("nome_completo")); }
 public MonitorDocumentNfeTransporteEntrega setNomeCompleto(String value) { put("nome_completo", Json.scalar(value)); return this; }
 public String getNomeFantasia() { return stringValue(field("nome_fantasia")); }
 public MonitorDocumentNfeTransporteEntrega setNomeFantasia(String value) { put("nome_fantasia", Json.scalar(value)); return this; }
 public String getIe() { return stringValue(field("ie")); }
 public MonitorDocumentNfeTransporteEntrega setIe(String value) { put("ie", Json.scalar(value)); return this; }
 public String getEndereco() { return stringValue(field("endereco")); }
 public MonitorDocumentNfeTransporteEntrega setEndereco(String value) { put("endereco", Json.scalar(value)); return this; }
 public String getNumero() { return stringValue(field("numero")); }
 public MonitorDocumentNfeTransporteEntrega setNumero(String value) { put("numero", Json.scalar(value)); return this; }
 public String getComplemento() { return stringValue(field("complemento")); }
 public MonitorDocumentNfeTransporteEntrega setComplemento(String value) { put("complemento", Json.scalar(value)); return this; }
 public String getBairro() { return stringValue(field("bairro")); }
 public MonitorDocumentNfeTransporteEntrega setBairro(String value) { put("bairro", Json.scalar(value)); return this; }
 public String getCep() { return stringValue(field("cep")); }
 public MonitorDocumentNfeTransporteEntrega setCep(String value) { put("cep", Json.scalar(value)); return this; }
 public String getCidade() { return stringValue(field("cidade")); }
 public MonitorDocumentNfeTransporteEntrega setCidade(String value) { put("cidade", Json.scalar(value)); return this; }
 public String getUf() { return stringValue(field("uf")); }
 public MonitorDocumentNfeTransporteEntrega setUf(String value) { put("uf", Json.scalar(value)); return this; }
 public String getTelefone() { return stringValue(field("telefone")); }
 public MonitorDocumentNfeTransporteEntrega setTelefone(String value) { put("telefone", Json.scalar(value)); return this; }
 public String getEmail() { return stringValue(field("email")); }
 public MonitorDocumentNfeTransporteEntrega setEmail(String value) { put("email", Json.scalar(value)); return this; }
}
