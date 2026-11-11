package com.webmania.sdk.model.api1fiscal;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api1/fiscal.openapi.json; see contract-provenance.json. */
public final class G040 extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("estado", "aliquota");
 public G040() { super(FIELDS); }
 public G040(JsonNode node) { super(node, FIELDS); }
 public String getEstado() { return stringValue(field("estado")); }
 public G040 setEstado(String value) { put("estado", Json.scalar(value)); return this; }
 public G040Aliquota getAliquota() { return (field("aliquota")).isNull() || (field("aliquota")).isMissingNode() ? null : new G040Aliquota(field("aliquota")); }
 public G040 setAliquota(G040Aliquota value) { put("aliquota", value == null ? null : value.toJson()); return this; }
}
