package com.webmania.sdk.model.api1fiscal;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api1/fiscal.openapi.json; see contract-provenance.json. */
public final class G006 extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("modelo", "n_ecf", "n_coo");
 public G006() { super(FIELDS); }
 public G006(JsonNode node) { super(node, FIELDS); }
 public String getModelo() { return stringValue(field("modelo")); }
 public G006 setModelo(String value) { put("modelo", Json.scalar(value)); return this; }
 public String getNEcf() { return stringValue(field("n_ecf")); }
 public G006 setNEcf(String value) { put("n_ecf", Json.scalar(value)); return this; }
 public String getNCoo() { return stringValue(field("n_coo")); }
 public G006 setNCoo(String value) { put("n_coo", Json.scalar(value)); return this; }
}
