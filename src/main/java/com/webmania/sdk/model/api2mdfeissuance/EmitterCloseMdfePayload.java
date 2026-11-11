package com.webmania.sdk.model.api2mdfeissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/mdfe-issuance.openapi.json; see contract-provenance.json. */
public final class EmitterCloseMdfePayload extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("chave", "codigo_municipio", "municipio", "uf", "uuid");
 public EmitterCloseMdfePayload() { super(FIELDS); }
 public EmitterCloseMdfePayload(JsonNode node) { super(node, FIELDS); }
 public String getChave() { return stringValue(field("chave")); }
 public EmitterCloseMdfePayload setChave(String value) { put("chave", Json.scalar(value)); return this; }
 public String getCodigoMunicipio() { return stringValue(field("codigo_municipio")); }
 public EmitterCloseMdfePayload setCodigoMunicipio(String value) { put("codigo_municipio", Json.scalar(value)); return this; }
 public String getMunicipio() { return stringValue(field("municipio")); }
 public EmitterCloseMdfePayload setMunicipio(String value) { put("municipio", Json.scalar(value)); return this; }
 public String getUf() { return stringValue(field("uf")); }
 public EmitterCloseMdfePayload setUf(String value) { put("uf", Json.scalar(value)); return this; }
 public String getUuid() { return stringValue(field("uuid")); }
 public EmitterCloseMdfePayload setUuid(String value) { put("uuid", Json.scalar(value)); return this; }
}
