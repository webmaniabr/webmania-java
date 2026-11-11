package com.webmania.sdk.model.api1fiscal;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api1/fiscal.openapi.json; see contract-provenance.json. */
public final class G043 extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("estado", "codigo");
 public G043() { super(FIELDS); }
 public G043(JsonNode node) { super(node, FIELDS); }
 public String getEstado() { return stringValue(field("estado")); }
 public G043 setEstado(String value) { put("estado", Json.scalar(value)); return this; }
 public String getCodigo() { return stringValue(field("codigo")); }
 public G043 setCodigo(String value) { put("codigo", Json.scalar(value)); return this; }
}
