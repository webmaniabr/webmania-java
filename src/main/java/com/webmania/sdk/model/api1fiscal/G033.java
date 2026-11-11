package com.webmania.sdk.model.api1fiscal;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api1/fiscal.openapi.json; see contract-provenance.json. */
public final class G033 extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("tipo", "uf", "serie", "numero");
 public G033() { super(FIELDS); }
 public G033(JsonNode node) { super(node, FIELDS); }
 public java.math.BigInteger getTipo() { return integerValue(field("tipo")); }
 public G033 setTipo(java.math.BigInteger value) { put("tipo", Json.scalar(value)); return this; }
 public String getUf() { return stringValue(field("uf")); }
 public G033 setUf(String value) { put("uf", Json.scalar(value)); return this; }
 public String getSerie() { return stringValue(field("serie")); }
 public G033 setSerie(String value) { put("serie", Json.scalar(value)); return this; }
 public String getNumero() { return stringValue(field("numero")); }
 public G033 setNumero(String value) { put("numero", Json.scalar(value)); return this; }
}
