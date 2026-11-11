package com.webmania.sdk.model.api1fiscal;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api1/fiscal.openapi.json; see contract-provenance.json. */
public final class NfeContributorObservation extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("campo", "texto");
 public NfeContributorObservation() { super(FIELDS); }
 public NfeContributorObservation(JsonNode node) { super(node, FIELDS); }
 public String getCampo() { return stringValue(field("campo")); }
 public NfeContributorObservation setCampo(String value) { put("campo", Json.scalar(value)); return this; }
 public String getTexto() { return stringValue(field("texto")); }
 public NfeContributorObservation setTexto(String value) { put("texto", Json.scalar(value)); return this; }
}
