package com.webmania.sdk.model.api1fiscal;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api1/fiscal.openapi.json; see contract-provenance.json. */
public final class G019 extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("tipo", "serie_arma", "serie_cano", "descricao");
 public G019() { super(FIELDS); }
 public G019(JsonNode node) { super(node, FIELDS); }
 public java.math.BigInteger getTipo() { return integerValue(field("tipo")); }
 public G019 setTipo(java.math.BigInteger value) { put("tipo", Json.scalar(value)); return this; }
 public String getSerieArma() { return stringValue(field("serie_arma")); }
 public G019 setSerieArma(String value) { put("serie_arma", Json.scalar(value)); return this; }
 public String getSerieCano() { return stringValue(field("serie_cano")); }
 public G019 setSerieCano(String value) { put("serie_cano", Json.scalar(value)); return this; }
 public String getDescricao() { return stringValue(field("descricao")); }
 public G019 setDescricao(String value) { put("descricao", Json.scalar(value)); return this; }
}
