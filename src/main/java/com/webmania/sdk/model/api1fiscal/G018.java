package com.webmania.sdk.model.api1fiscal;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api1/fiscal.openapi.json; see contract-provenance.json. */
public final class G018 extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("codigo_anvisa", "pmc");
 public G018() { super(FIELDS); }
 public G018(JsonNode node) { super(node, FIELDS); }
 public String getCodigoAnvisa() { return stringValue(field("codigo_anvisa")); }
 public G018 setCodigoAnvisa(String value) { put("codigo_anvisa", Json.scalar(value)); return this; }
 public G018Pmc getPmc() { return (field("pmc")).isNull() || (field("pmc")).isMissingNode() ? null : new G018Pmc(field("pmc")); }
 public G018 setPmc(G018Pmc value) { put("pmc", value == null ? null : value.toJson()); return this; }
}
