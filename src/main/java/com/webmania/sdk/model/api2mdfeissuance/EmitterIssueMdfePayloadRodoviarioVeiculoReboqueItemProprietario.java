package com.webmania.sdk.model.api2mdfeissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/mdfe-issuance.openapi.json; see contract-provenance.json. */
public final class EmitterIssueMdfePayloadRodoviarioVeiculoReboqueItemProprietario extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("cnpj", "cpf", "ie", "nome", "razao_social", "rntrc", "tipo_proprietario", "uf");
 public EmitterIssueMdfePayloadRodoviarioVeiculoReboqueItemProprietario() { super(FIELDS); }
 public EmitterIssueMdfePayloadRodoviarioVeiculoReboqueItemProprietario(JsonNode node) { super(node, FIELDS); }
 public String getCnpj() { return stringValue(field("cnpj")); }
 public EmitterIssueMdfePayloadRodoviarioVeiculoReboqueItemProprietario setCnpj(String value) { put("cnpj", Json.scalar(value)); return this; }
 public String getCpf() { return stringValue(field("cpf")); }
 public EmitterIssueMdfePayloadRodoviarioVeiculoReboqueItemProprietario setCpf(String value) { put("cpf", Json.scalar(value)); return this; }
 public String getIe() { return stringValue(field("ie")); }
 public EmitterIssueMdfePayloadRodoviarioVeiculoReboqueItemProprietario setIe(String value) { put("ie", Json.scalar(value)); return this; }
 public String getNome() { return stringValue(field("nome")); }
 public EmitterIssueMdfePayloadRodoviarioVeiculoReboqueItemProprietario setNome(String value) { put("nome", Json.scalar(value)); return this; }
 public String getRazaoSocial() { return stringValue(field("razao_social")); }
 public EmitterIssueMdfePayloadRodoviarioVeiculoReboqueItemProprietario setRazaoSocial(String value) { put("razao_social", Json.scalar(value)); return this; }
 public String getRntrc() { return stringValue(field("rntrc")); }
 public EmitterIssueMdfePayloadRodoviarioVeiculoReboqueItemProprietario setRntrc(String value) { put("rntrc", Json.scalar(value)); return this; }
 public JsonValue getTipoProprietario() { return (field("tipo_proprietario")).isNull() || (field("tipo_proprietario")).isMissingNode() ? null : new JsonValue(field("tipo_proprietario")); }
 public EmitterIssueMdfePayloadRodoviarioVeiculoReboqueItemProprietario setTipoProprietario(JsonValue value) { put("tipo_proprietario", value == null ? null : value.toJson()); return this; }
 public String getUf() { return stringValue(field("uf")); }
 public EmitterIssueMdfePayloadRodoviarioVeiculoReboqueItemProprietario setUf(String value) { put("uf", Json.scalar(value)); return this; }
}
