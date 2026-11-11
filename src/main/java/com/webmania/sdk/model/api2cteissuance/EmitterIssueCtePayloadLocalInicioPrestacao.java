package com.webmania.sdk.model.api2cteissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/cte-issuance.openapi.json; see contract-provenance.json. */
public final class EmitterIssueCtePayloadLocalInicioPrestacao extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("cidade", "cod_ibge", "codigo_municipio", "uf");
 public EmitterIssueCtePayloadLocalInicioPrestacao() { super(FIELDS); }
 public EmitterIssueCtePayloadLocalInicioPrestacao(JsonNode node) { super(node, FIELDS); }
 public String getCidade() { return stringValue(field("cidade")); }
 public EmitterIssueCtePayloadLocalInicioPrestacao setCidade(String value) { put("cidade", Json.scalar(value)); return this; }
 public String getCodIbge() { return stringValue(field("cod_ibge")); }
 public EmitterIssueCtePayloadLocalInicioPrestacao setCodIbge(String value) { put("cod_ibge", Json.scalar(value)); return this; }
 public EmitterIssueCtePayloadLocalInicioPrestacaoCodigoMunicipio getCodigoMunicipio() { return (field("codigo_municipio")).isNull() || (field("codigo_municipio")).isMissingNode() ? null : new EmitterIssueCtePayloadLocalInicioPrestacaoCodigoMunicipio(field("codigo_municipio")); }
 public EmitterIssueCtePayloadLocalInicioPrestacao setCodigoMunicipio(EmitterIssueCtePayloadLocalInicioPrestacaoCodigoMunicipio value) { put("codigo_municipio", value == null ? null : value.toJson()); return this; }
 public String getUf() { return stringValue(field("uf")); }
 public EmitterIssueCtePayloadLocalInicioPrestacao setUf(String value) { put("uf", Json.scalar(value)); return this; }
}
