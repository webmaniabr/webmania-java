package com.webmania.sdk.model.api2mdfeissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/mdfe-issuance.openapi.json; see contract-provenance.json. */
public final class EmitterIssueMdfePayloadSeguroItemResponsavel extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("cnpj", "cpf", "tipo_responsavel");
 public EmitterIssueMdfePayloadSeguroItemResponsavel() { super(FIELDS); }
 public EmitterIssueMdfePayloadSeguroItemResponsavel(JsonNode node) { super(node, FIELDS); }
 public String getCnpj() { return stringValue(field("cnpj")); }
 public EmitterIssueMdfePayloadSeguroItemResponsavel setCnpj(String value) { put("cnpj", Json.scalar(value)); return this; }
 public String getCpf() { return stringValue(field("cpf")); }
 public EmitterIssueMdfePayloadSeguroItemResponsavel setCpf(String value) { put("cpf", Json.scalar(value)); return this; }
 public JsonValue getTipoResponsavel() { return (field("tipo_responsavel")).isNull() || (field("tipo_responsavel")).isMissingNode() ? null : new JsonValue(field("tipo_responsavel")); }
 public EmitterIssueMdfePayloadSeguroItemResponsavel setTipoResponsavel(JsonValue value) { put("tipo_responsavel", value == null ? null : value.toJson()); return this; }
}
