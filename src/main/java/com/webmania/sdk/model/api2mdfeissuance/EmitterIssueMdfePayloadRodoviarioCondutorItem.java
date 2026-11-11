package com.webmania.sdk.model.api2mdfeissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/mdfe-issuance.openapi.json; see contract-provenance.json. */
public final class EmitterIssueMdfePayloadRodoviarioCondutorItem extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("cpf", "nome");
 public EmitterIssueMdfePayloadRodoviarioCondutorItem() { super(FIELDS); }
 public EmitterIssueMdfePayloadRodoviarioCondutorItem(JsonNode node) { super(node, FIELDS); }
 public String getCpf() { return stringValue(field("cpf")); }
 public EmitterIssueMdfePayloadRodoviarioCondutorItem setCpf(String value) { put("cpf", Json.scalar(value)); return this; }
 public String getNome() { return stringValue(field("nome")); }
 public EmitterIssueMdfePayloadRodoviarioCondutorItem setNome(String value) { put("nome", Json.scalar(value)); return this; }
}
