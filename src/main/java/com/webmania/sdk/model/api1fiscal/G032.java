package com.webmania.sdk.model.api1fiscal;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api1/fiscal.openapi.json; see contract-provenance.json. */
public final class G032 extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("numero_receituario", "cpf_responsavel_tecnico");
 public G032() { super(FIELDS); }
 public G032(JsonNode node) { super(node, FIELDS); }
 public String getNumeroReceituario() { return stringValue(field("numero_receituario")); }
 public G032 setNumeroReceituario(String value) { put("numero_receituario", Json.scalar(value)); return this; }
 public String getCpfResponsavelTecnico() { return stringValue(field("cpf_responsavel_tecnico")); }
 public G032 setCpfResponsavelTecnico(String value) { put("cpf_responsavel_tecnico", Json.scalar(value)); return this; }
}
