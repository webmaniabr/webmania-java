package com.webmania.sdk.model.api1fiscal;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api1/fiscal.openapi.json; see contract-provenance.json. */
public final class G059 extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("cenario", "codigo_cfps");
 public G059() { super(FIELDS); }
 public G059(JsonNode node) { super(node, FIELDS); }
 public String getCenario() { return stringValue(field("cenario")); }
 public G059 setCenario(String value) { put("cenario", Json.scalar(value)); return this; }
 public String getCodigoCfps() { return stringValue(field("codigo_cfps")); }
 public G059 setCodigoCfps(String value) { put("codigo_cfps", Json.scalar(value)); return this; }
}
