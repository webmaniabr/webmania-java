package com.webmania.sdk.model.api1fiscal;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api1/fiscal.openapi.json; see contract-provenance.json. */
public final class G025 extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("placa", "uf_veiculo", "rntc", "vagao", "balsa");
 public G025() { super(FIELDS); }
 public G025(JsonNode node) { super(node, FIELDS); }
 public String getPlaca() { return stringValue(field("placa")); }
 public G025 setPlaca(String value) { put("placa", Json.scalar(value)); return this; }
 public String getUfVeiculo() { return stringValue(field("uf_veiculo")); }
 public G025 setUfVeiculo(String value) { put("uf_veiculo", Json.scalar(value)); return this; }
 public String getRntc() { return stringValue(field("rntc")); }
 public G025 setRntc(String value) { put("rntc", Json.scalar(value)); return this; }
 public java.math.BigInteger getVagao() { return integerValue(field("vagao")); }
 public G025 setVagao(java.math.BigInteger value) { put("vagao", Json.scalar(value)); return this; }
 public String getBalsa() { return stringValue(field("balsa")); }
 public G025 setBalsa(String value) { put("balsa", Json.scalar(value)); return this; }
}
