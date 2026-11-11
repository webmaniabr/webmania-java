package com.webmania.sdk.model.api1fiscal;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api1/fiscal.openapi.json; see contract-provenance.json. */
public final class G030 extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("uf_embarque", "local_embarque", "local_despacho");
 public G030() { super(FIELDS); }
 public G030(JsonNode node) { super(node, FIELDS); }
 public String getUfEmbarque() { return stringValue(field("uf_embarque")); }
 public G030 setUfEmbarque(String value) { put("uf_embarque", Json.scalar(value)); return this; }
 public String getLocalEmbarque() { return stringValue(field("local_embarque")); }
 public G030 setLocalEmbarque(String value) { put("local_embarque", Json.scalar(value)); return this; }
 public String getLocalDespacho() { return stringValue(field("local_despacho")); }
 public G030 setLocalDespacho(String value) { put("local_despacho", Json.scalar(value)); return this; }
}
