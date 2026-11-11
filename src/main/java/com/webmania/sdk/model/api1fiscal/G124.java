package com.webmania.sdk.model.api1fiscal;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api1/fiscal.openapi.json; see contract-provenance.json. */
public final class G124 extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("chave", "ambiente", "evento", "justificativa");
 public G124() { super(FIELDS); }
 public G124(JsonNode node) { super(node, FIELDS); }
 public String getChave() { return stringValue(field("chave")); }
 public G124 setChave(String value) { put("chave", Json.scalar(value)); return this; }
 public java.math.BigInteger getAmbiente() { return integerValue(field("ambiente")); }
 public G124 setAmbiente(java.math.BigInteger value) { put("ambiente", Json.scalar(value)); return this; }
 public String getEvento() { return stringValue(field("evento")); }
 public G124 setEvento(String value) { put("evento", Json.scalar(value)); return this; }
 public String getJustificativa() { return stringValue(field("justificativa")); }
 public G124 setJustificativa(String value) { put("justificativa", Json.scalar(value)); return this; }
}
