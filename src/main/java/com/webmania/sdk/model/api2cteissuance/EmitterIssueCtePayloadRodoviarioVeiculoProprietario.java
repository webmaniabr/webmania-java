package com.webmania.sdk.model.api2cteissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/cte-issuance.openapi.json; see contract-provenance.json. */
public final class EmitterIssueCtePayloadRodoviarioVeiculoProprietario extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("cnpj", "cpf", "ie", "nome_razao", "registro_estadual", "taf", "tipo", "uf");
 public EmitterIssueCtePayloadRodoviarioVeiculoProprietario() { super(FIELDS); }
 public EmitterIssueCtePayloadRodoviarioVeiculoProprietario(JsonNode node) { super(node, FIELDS); }
 public String getCnpj() { return stringValue(field("cnpj")); }
 public EmitterIssueCtePayloadRodoviarioVeiculoProprietario setCnpj(String value) { put("cnpj", Json.scalar(value)); return this; }
 public String getCpf() { return stringValue(field("cpf")); }
 public EmitterIssueCtePayloadRodoviarioVeiculoProprietario setCpf(String value) { put("cpf", Json.scalar(value)); return this; }
 public String getIe() { return stringValue(field("ie")); }
 public EmitterIssueCtePayloadRodoviarioVeiculoProprietario setIe(String value) { put("ie", Json.scalar(value)); return this; }
 public String getNomeRazao() { return stringValue(field("nome_razao")); }
 public EmitterIssueCtePayloadRodoviarioVeiculoProprietario setNomeRazao(String value) { put("nome_razao", Json.scalar(value)); return this; }
 public String getRegistroEstadual() { return stringValue(field("registro_estadual")); }
 public EmitterIssueCtePayloadRodoviarioVeiculoProprietario setRegistroEstadual(String value) { put("registro_estadual", Json.scalar(value)); return this; }
 public String getTaf() { return stringValue(field("taf")); }
 public EmitterIssueCtePayloadRodoviarioVeiculoProprietario setTaf(String value) { put("taf", Json.scalar(value)); return this; }
 public String getTipo() { return stringValue(field("tipo")); }
 public EmitterIssueCtePayloadRodoviarioVeiculoProprietario setTipo(String value) { put("tipo", Json.scalar(value)); return this; }
 public String getUf() { return stringValue(field("uf")); }
 public EmitterIssueCtePayloadRodoviarioVeiculoProprietario setUf(String value) { put("uf", Json.scalar(value)); return this; }
}
