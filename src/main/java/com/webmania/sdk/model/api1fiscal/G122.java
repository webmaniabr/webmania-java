package com.webmania.sdk.model.api1fiscal;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api1/fiscal.openapi.json; see contract-provenance.json. */
public final class G122 extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("dfe_referenciado");
 public G122() { super(FIELDS); }
 public G122(JsonNode node) { super(node, FIELDS); }
 public G122DfeReferenciado getDfeReferenciado() { return (field("dfe_referenciado")).isNull() || (field("dfe_referenciado")).isMissingNode() ? null : new G122DfeReferenciado(field("dfe_referenciado")); }
 public G122 setDfeReferenciado(G122DfeReferenciado value) { put("dfe_referenciado", value == null ? null : value.toJson()); return this; }
}
