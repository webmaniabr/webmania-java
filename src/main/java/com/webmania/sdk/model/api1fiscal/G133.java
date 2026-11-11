package com.webmania.sdk.model.api1fiscal;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api1/fiscal.openapi.json; see contract-provenance.json. */
public final class G133 extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("indicador_aceitacao");
 public G133() { super(FIELDS); }
 public G133(JsonNode node) { super(node, FIELDS); }
 public java.math.BigInteger getIndicadorAceitacao() { return integerValue(field("indicador_aceitacao")); }
 public G133 setIndicadorAceitacao(java.math.BigInteger value) { put("indicador_aceitacao", Json.scalar(value)); return this; }
}
