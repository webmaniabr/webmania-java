package com.webmania.sdk.model.api1fiscal;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api1/fiscal.openapi.json; see contract-provenance.json. */
public final class G077 extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("quantidade_bc");
 public G077() { super(FIELDS); }
 public G077(JsonNode node) { super(node, FIELDS); }
 public G077QuantidadeBc getQuantidadeBc() { return (field("quantidade_bc")).isNull() || (field("quantidade_bc")).isMissingNode() ? null : new G077QuantidadeBc(field("quantidade_bc")); }
 public G077 setQuantidadeBc(G077QuantidadeBc value) { put("quantidade_bc", value == null ? null : value.toJson()); return this; }
}
