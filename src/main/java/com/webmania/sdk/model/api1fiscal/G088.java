package com.webmania.sdk.model.api1fiscal;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api1/fiscal.openapi.json; see contract-provenance.json. */
public final class G088 extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("aliquota_mva");
 public G088() { super(FIELDS); }
 public G088(JsonNode node) { super(node, FIELDS); }
 public G088AliquotaMva getAliquotaMva() { return (field("aliquota_mva")).isNull() || (field("aliquota_mva")).isMissingNode() ? null : new G088AliquotaMva(field("aliquota_mva")); }
 public G088 setAliquotaMva(G088AliquotaMva value) { put("aliquota_mva", value == null ? null : value.toJson()); return this; }
}
