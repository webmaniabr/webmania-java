package com.webmania.sdk.model.api1fiscal;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api1/fiscal.openapi.json; see contract-provenance.json. */
public final class G067 extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("referencia");
 public G067() { super(FIELDS); }
 public G067(JsonNode node) { super(node, FIELDS); }
 public G067Referencia getReferencia() { return (field("referencia")).isNull() || (field("referencia")).isMissingNode() ? null : new G067Referencia(field("referencia")); }
 public G067 setReferencia(G067Referencia value) { put("referencia", value == null ? null : value.toJson()); return this; }
}
