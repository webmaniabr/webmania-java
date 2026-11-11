package com.webmania.sdk.model.api1fiscal;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api1/fiscal.openapi.json; see contract-provenance.json. */
public final class G120 extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("finalidade", "tipo_credito", "nfe_referenciada");
 public G120() { super(FIELDS); }
 public G120(JsonNode node) { super(node, FIELDS); }
 public java.math.BigInteger getFinalidade() { return integerValue(field("finalidade")); }
 public G120 setFinalidade(java.math.BigInteger value) { put("finalidade", Json.scalar(value)); return this; }
 public java.math.BigInteger getTipoCredito() { return integerValue(field("tipo_credito")); }
 public G120 setTipoCredito(java.math.BigInteger value) { put("tipo_credito", Json.scalar(value)); return this; }
 public G120NfeReferenciada getNfeReferenciada() { return (field("nfe_referenciada")).isNull() || (field("nfe_referenciada")).isMissingNode() ? null : new G120NfeReferenciada(field("nfe_referenciada")); }
 public G120 setNfeReferenciada(G120NfeReferenciada value) { put("nfe_referenciada", value == null ? null : value.toJson()); return this; }
}
