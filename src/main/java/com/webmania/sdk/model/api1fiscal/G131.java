package com.webmania.sdk.model.api1fiscal;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api1/fiscal.openapi.json; see contract-provenance.json. */
public final class G131 extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("item", "base_calculo", "credito_presumido");
 public G131() { super(FIELDS); }
 public G131(JsonNode node) { super(node, FIELDS); }
 public java.math.BigInteger getItem() { return integerValue(field("item")); }
 public G131 setItem(java.math.BigInteger value) { put("item", Json.scalar(value)); return this; }
 public G131BaseCalculo getBaseCalculo() { return (field("base_calculo")).isNull() || (field("base_calculo")).isMissingNode() ? null : new G131BaseCalculo(field("base_calculo")); }
 public G131 setBaseCalculo(G131BaseCalculo value) { put("base_calculo", value == null ? null : value.toJson()); return this; }
 public G131CreditoPresumido getCreditoPresumido() { return (field("credito_presumido")).isNull() || (field("credito_presumido")).isMissingNode() ? null : new G131CreditoPresumido(field("credito_presumido")); }
 public G131 setCreditoPresumido(G131CreditoPresumido value) { put("credito_presumido", value == null ? null : value.toJson()); return this; }
}
