package com.webmania.sdk.model.api2monitordocuments;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/monitor-documents.openapi.json; see contract-provenance.json. */
public final class MonitorDocumentNfeTransporteRetirada extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("cnpj", "cpf", "razao_social", "nome_completo", "nome_fantasia", "ie", "endereco", "numero", "complemento", "bairro", "cep", "cidade", "uf", "telefone", "email");
 public MonitorDocumentNfeTransporteRetirada() { super(FIELDS); }
 public MonitorDocumentNfeTransporteRetirada(JsonNode node) { super(node, FIELDS); }
 public String getCnpj() { return stringValue(field("cnpj")); }
 public MonitorDocumentNfeTransporteRetirada setCnpj(String value) { put("cnpj", Json.scalar(value)); return this; }
 public String getCpf() { return stringValue(field("cpf")); }
 public MonitorDocumentNfeTransporteRetirada setCpf(String value) { put("cpf", Json.scalar(value)); return this; }
 public String getRazaoSocial() { return stringValue(field("razao_social")); }
 public MonitorDocumentNfeTransporteRetirada setRazaoSocial(String value) { put("razao_social", Json.scalar(value)); return this; }
 public String getNomeCompleto() { return stringValue(field("nome_completo")); }
 public MonitorDocumentNfeTransporteRetirada setNomeCompleto(String value) { put("nome_completo", Json.scalar(value)); return this; }
 public String getNomeFantasia() { return stringValue(field("nome_fantasia")); }
 public MonitorDocumentNfeTransporteRetirada setNomeFantasia(String value) { put("nome_fantasia", Json.scalar(value)); return this; }
 public String getIe() { return stringValue(field("ie")); }
 public MonitorDocumentNfeTransporteRetirada setIe(String value) { put("ie", Json.scalar(value)); return this; }
 public String getEndereco() { return stringValue(field("endereco")); }
 public MonitorDocumentNfeTransporteRetirada setEndereco(String value) { put("endereco", Json.scalar(value)); return this; }
 public String getNumero() { return stringValue(field("numero")); }
 public MonitorDocumentNfeTransporteRetirada setNumero(String value) { put("numero", Json.scalar(value)); return this; }
 public String getComplemento() { return stringValue(field("complemento")); }
 public MonitorDocumentNfeTransporteRetirada setComplemento(String value) { put("complemento", Json.scalar(value)); return this; }
 public String getBairro() { return stringValue(field("bairro")); }
 public MonitorDocumentNfeTransporteRetirada setBairro(String value) { put("bairro", Json.scalar(value)); return this; }
 public String getCep() { return stringValue(field("cep")); }
 public MonitorDocumentNfeTransporteRetirada setCep(String value) { put("cep", Json.scalar(value)); return this; }
 public String getCidade() { return stringValue(field("cidade")); }
 public MonitorDocumentNfeTransporteRetirada setCidade(String value) { put("cidade", Json.scalar(value)); return this; }
 public String getUf() { return stringValue(field("uf")); }
 public MonitorDocumentNfeTransporteRetirada setUf(String value) { put("uf", Json.scalar(value)); return this; }
 public String getTelefone() { return stringValue(field("telefone")); }
 public MonitorDocumentNfeTransporteRetirada setTelefone(String value) { put("telefone", Json.scalar(value)); return this; }
 public String getEmail() { return stringValue(field("email")); }
 public MonitorDocumentNfeTransporteRetirada setEmail(String value) { put("email", Json.scalar(value)); return this; }
}
