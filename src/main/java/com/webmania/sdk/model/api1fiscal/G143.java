package com.webmania.sdk.model.api1fiscal;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api1/fiscal.openapi.json; see contract-provenance.json. */
public final class G143 extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("sequencia", "motivo", "ambiente", "serie", "modelo");
 public G143() { super(FIELDS); }
 public G143(JsonNode node) { super(node, FIELDS); }
 public String getSequencia() { return stringValue(field("sequencia")); }
 public G143 setSequencia(String value) { put("sequencia", Json.scalar(value)); return this; }
 public String getMotivo() { return stringValue(field("motivo")); }
 public G143 setMotivo(String value) { put("motivo", Json.scalar(value)); return this; }
 public java.math.BigInteger getAmbiente() { return integerValue(field("ambiente")); }
 public G143 setAmbiente(java.math.BigInteger value) { put("ambiente", Json.scalar(value)); return this; }
 public String getSerie() { return stringValue(field("serie")); }
 public G143 setSerie(String value) { put("serie", Json.scalar(value)); return this; }
 public String getModelo() { return stringValue(field("modelo")); }
 public G143 setModelo(String value) { put("modelo", Json.scalar(value)); return this; }
}
