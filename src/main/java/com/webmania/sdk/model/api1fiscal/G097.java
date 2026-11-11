package com.webmania.sdk.model.api1fiscal;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api1/fiscal.openapi.json; see contract-provenance.json. */
public final class G097 extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("aliquota", "iof");
 public G097() { super(FIELDS); }
 public G097(JsonNode node) { super(node, FIELDS); }
 public G097Aliquota getAliquota() { return (field("aliquota")).isNull() || (field("aliquota")).isMissingNode() ? null : new G097Aliquota(field("aliquota")); }
 public G097 setAliquota(G097Aliquota value) { put("aliquota", value == null ? null : value.toJson()); return this; }
 public G097Iof getIof() { return (field("iof")).isNull() || (field("iof")).isMissingNode() ? null : new G097Iof(field("iof")); }
 public G097 setIof(G097Iof value) { put("iof", value == null ? null : value.toJson()); return this; }
}
