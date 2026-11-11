package com.webmania.sdk.model.api1fiscal;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api1/fiscal.openapi.json; see contract-provenance.json. */
public final class TaxClassNoResults extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("msg");
 public TaxClassNoResults() { super(FIELDS); }
 public TaxClassNoResults(JsonNode node) { super(node, FIELDS); }
 public String getMsg() { return stringValue(field("msg")); }
 public TaxClassNoResults setMsg(String value) { put("msg", Json.scalar(value)); return this; }
}
