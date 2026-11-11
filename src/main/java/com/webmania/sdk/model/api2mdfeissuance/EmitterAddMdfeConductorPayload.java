package com.webmania.sdk.model.api2mdfeissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/mdfe-issuance.openapi.json; see contract-provenance.json. */
public final class EmitterAddMdfeConductorPayload extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("chave", "cpf", "nome", "uuid");
 public EmitterAddMdfeConductorPayload() { super(FIELDS); }
 public EmitterAddMdfeConductorPayload(JsonNode node) { super(node, FIELDS); }
 public String getChave() { return stringValue(field("chave")); }
 public EmitterAddMdfeConductorPayload setChave(String value) { put("chave", Json.scalar(value)); return this; }
 public String getCpf() { return stringValue(field("cpf")); }
 public EmitterAddMdfeConductorPayload setCpf(String value) { put("cpf", Json.scalar(value)); return this; }
 public String getNome() { return stringValue(field("nome")); }
 public EmitterAddMdfeConductorPayload setNome(String value) { put("nome", Json.scalar(value)); return this; }
 public String getUuid() { return stringValue(field("uuid")); }
 public EmitterAddMdfeConductorPayload setUuid(String value) { put("uuid", Json.scalar(value)); return this; }
}
