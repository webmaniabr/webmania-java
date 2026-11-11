package com.webmania.sdk.model.api1fiscal;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api1/fiscal.openapi.json; see contract-provenance.json. */
public final class G015 extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("chave", "item");
 public G015() { super(FIELDS); }
 public G015(JsonNode node) { super(node, FIELDS); }
 public String getChave() { return stringValue(field("chave")); }
 public G015 setChave(String value) { put("chave", Json.scalar(value)); return this; }
 public java.math.BigInteger getItem() { return integerValue(field("item")); }
 public G015 setItem(java.math.BigInteger value) { put("item", Json.scalar(value)); return this; }
}
