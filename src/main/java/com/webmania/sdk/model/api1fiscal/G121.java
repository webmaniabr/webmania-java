package com.webmania.sdk.model.api1fiscal;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api1/fiscal.openapi.json; see contract-provenance.json. */
public final class G121 extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("finalidade", "tipo_debito");
 public G121() { super(FIELDS); }
 public G121(JsonNode node) { super(node, FIELDS); }
 public java.math.BigInteger getFinalidade() { return integerValue(field("finalidade")); }
 public G121 setFinalidade(java.math.BigInteger value) { put("finalidade", Json.scalar(value)); return this; }
 public java.math.BigInteger getTipoDebito() { return integerValue(field("tipo_debito")); }
 public G121 setTipoDebito(java.math.BigInteger value) { put("tipo_debito", Json.scalar(value)); return this; }
}
