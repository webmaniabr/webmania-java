package com.webmania.sdk.model.api2cteissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/cte-issuance.openapi.json; see contract-provenance.json. */
public final class EmitterIssueCtePayloadLocalTerminoPrestacao extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("cidade", "cod_ibge", "codigo_municipio", "uf");
 public EmitterIssueCtePayloadLocalTerminoPrestacao() { super(FIELDS); }
 public EmitterIssueCtePayloadLocalTerminoPrestacao(JsonNode node) { super(node, FIELDS); }
 public String getCidade() { return stringValue(field("cidade")); }
 public EmitterIssueCtePayloadLocalTerminoPrestacao setCidade(String value) { put("cidade", Json.scalar(value)); return this; }
 public String getCodIbge() { return stringValue(field("cod_ibge")); }
 public EmitterIssueCtePayloadLocalTerminoPrestacao setCodIbge(String value) { put("cod_ibge", Json.scalar(value)); return this; }
 public EmitterIssueCtePayloadLocalTerminoPrestacaoCodigoMunicipio getCodigoMunicipio() { return (field("codigo_municipio")).isNull() || (field("codigo_municipio")).isMissingNode() ? null : new EmitterIssueCtePayloadLocalTerminoPrestacaoCodigoMunicipio(field("codigo_municipio")); }
 public EmitterIssueCtePayloadLocalTerminoPrestacao setCodigoMunicipio(EmitterIssueCtePayloadLocalTerminoPrestacaoCodigoMunicipio value) { put("codigo_municipio", value == null ? null : value.toJson()); return this; }
 public String getUf() { return stringValue(field("uf")); }
 public EmitterIssueCtePayloadLocalTerminoPrestacao setUf(String value) { put("uf", Json.scalar(value)); return this; }
}
