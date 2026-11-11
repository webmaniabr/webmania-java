package com.webmania.sdk.model.api2mdfeissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/mdfe-issuance.openapi.json; see contract-provenance.json. */
public final class MdfeDocumentedGroup3362 extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("uuid", "cpf", "nome");
 public MdfeDocumentedGroup3362() { super(FIELDS); }
 public MdfeDocumentedGroup3362(JsonNode node) { super(node, FIELDS); }
 public String getUuid() { return stringValue(field("uuid")); }
 public MdfeDocumentedGroup3362 setUuid(String value) { put("uuid", Json.scalar(value)); return this; }
 public String getCpf() { return stringValue(field("cpf")); }
 public MdfeDocumentedGroup3362 setCpf(String value) { put("cpf", Json.scalar(value)); return this; }
 public String getNome() { return stringValue(field("nome")); }
 public MdfeDocumentedGroup3362 setNome(String value) { put("nome", Json.scalar(value)); return this; }
}
