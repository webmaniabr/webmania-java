package com.webmania.sdk.model.api1fiscal;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api1/fiscal.openapi.json; see contract-provenance.json. */
public final class G024 extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("cnpj", "razao_social", "ie", "cpf", "nome_completo", "endereco", "uf", "cidade", "cep", "placa", "uf_veiculo", "rntc", "seguro");
 public G024() { super(FIELDS); }
 public G024(JsonNode node) { super(node, FIELDS); }
 public String getCnpj() { return stringValue(field("cnpj")); }
 public G024 setCnpj(String value) { put("cnpj", Json.scalar(value)); return this; }
 public String getRazaoSocial() { return stringValue(field("razao_social")); }
 public G024 setRazaoSocial(String value) { put("razao_social", Json.scalar(value)); return this; }
 public String getIe() { return stringValue(field("ie")); }
 public G024 setIe(String value) { put("ie", Json.scalar(value)); return this; }
 public String getCpf() { return stringValue(field("cpf")); }
 public G024 setCpf(String value) { put("cpf", Json.scalar(value)); return this; }
 public String getNomeCompleto() { return stringValue(field("nome_completo")); }
 public G024 setNomeCompleto(String value) { put("nome_completo", Json.scalar(value)); return this; }
 public String getEndereco() { return stringValue(field("endereco")); }
 public G024 setEndereco(String value) { put("endereco", Json.scalar(value)); return this; }
 public String getUf() { return stringValue(field("uf")); }
 public G024 setUf(String value) { put("uf", Json.scalar(value)); return this; }
 public String getCidade() { return stringValue(field("cidade")); }
 public G024 setCidade(String value) { put("cidade", Json.scalar(value)); return this; }
 public String getCep() { return stringValue(field("cep")); }
 public G024 setCep(String value) { put("cep", Json.scalar(value)); return this; }
 public String getPlaca() { return stringValue(field("placa")); }
 public G024 setPlaca(String value) { put("placa", Json.scalar(value)); return this; }
 public String getUfVeiculo() { return stringValue(field("uf_veiculo")); }
 public G024 setUfVeiculo(String value) { put("uf_veiculo", Json.scalar(value)); return this; }
 public String getRntc() { return stringValue(field("rntc")); }
 public G024 setRntc(String value) { put("rntc", Json.scalar(value)); return this; }
 public G024Seguro getSeguro() { return (field("seguro")).isNull() || (field("seguro")).isMissingNode() ? null : new G024Seguro(field("seguro")); }
 public G024 setSeguro(G024Seguro value) { put("seguro", value == null ? null : value.toJson()); return this; }
}
