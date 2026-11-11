package com.webmania.sdk.model.api2mdfeissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/mdfe-issuance.openapi.json; see contract-provenance.json. */
public final class EmitterIssueMdfePayloadRodoviarioContratanteItem extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("cnpj", "cpf");
 public EmitterIssueMdfePayloadRodoviarioContratanteItem() { super(FIELDS); }
 public EmitterIssueMdfePayloadRodoviarioContratanteItem(JsonNode node) { super(node, FIELDS); }
 public String getCnpj() { return stringValue(field("cnpj")); }
 public EmitterIssueMdfePayloadRodoviarioContratanteItem setCnpj(String value) { put("cnpj", Json.scalar(value)); return this; }
 public String getCpf() { return stringValue(field("cpf")); }
 public EmitterIssueMdfePayloadRodoviarioContratanteItem setCpf(String value) { put("cpf", Json.scalar(value)); return this; }
}
