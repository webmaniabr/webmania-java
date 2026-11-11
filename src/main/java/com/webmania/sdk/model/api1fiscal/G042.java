package com.webmania.sdk.model.api1fiscal;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api1/fiscal.openapi.json; see contract-provenance.json. */
public final class G042 extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("estado", "aliquota");
 public G042() { super(FIELDS); }
 public G042(JsonNode node) { super(node, FIELDS); }
 public String getEstado() { return stringValue(field("estado")); }
 public G042 setEstado(String value) { put("estado", Json.scalar(value)); return this; }
 public G042Aliquota getAliquota() { return (field("aliquota")).isNull() || (field("aliquota")).isMissingNode() ? null : new G042Aliquota(field("aliquota")); }
 public G042 setAliquota(G042Aliquota value) { put("aliquota", value == null ? null : value.toJson()); return this; }
}
