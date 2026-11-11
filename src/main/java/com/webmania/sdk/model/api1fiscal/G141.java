package com.webmania.sdk.model.api1fiscal;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api1/fiscal.openapi.json; see contract-provenance.json. */
public final class G141 extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("chave", "uuid", "ID");
 public G141() { super(FIELDS); }
 public G141(JsonNode node) { super(node, FIELDS); }
 public String getChave() { return stringValue(field("chave")); }
 public G141 setChave(String value) { put("chave", Json.scalar(value)); return this; }
 public String getUuid() { return stringValue(field("uuid")); }
 public G141 setUuid(String value) { put("uuid", Json.scalar(value)); return this; }
 public String getID() { return stringValue(field("ID")); }
 public G141 setID(String value) { put("ID", Json.scalar(value)); return this; }
}
