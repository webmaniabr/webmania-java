package com.webmania.sdk.model.api1fiscal;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api1/fiscal.openapi.json; see contract-provenance.json. */
public final class G031 extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("defensivos", "guia_transito");
 public G031() { super(FIELDS); }
 public G031(JsonNode node) { super(node, FIELDS); }
 public java.util.List<G032> getDefensivos() { return list(field("defensivos"), v -> (v).isNull() || (v).isMissingNode() ? null : new G032(v)); }
 public G031 setDefensivos(java.util.List<G032> value) { put("defensivos", array(value, v -> v == null ? null : v.toJson())); return this; }
 public G033 getGuiaTransito() { return (field("guia_transito")).isNull() || (field("guia_transito")).isMissingNode() ? null : new G033(field("guia_transito")); }
 public G031 setGuiaTransito(G033 value) { put("guia_transito", value == null ? null : value.toJson()); return this; }
}
