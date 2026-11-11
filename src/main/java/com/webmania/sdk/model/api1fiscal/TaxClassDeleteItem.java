package com.webmania.sdk.model.api1fiscal;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api1/fiscal.openapi.json; see contract-provenance.json. */
public final class TaxClassDeleteItem extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("referencia", "msg", "error");
 public TaxClassDeleteItem() { super(FIELDS); }
 public TaxClassDeleteItem(JsonNode node) { super(node, FIELDS); }
 public String getReferencia() { return stringValue(field("referencia")); }
 public TaxClassDeleteItem setReferencia(String value) { put("referencia", Json.scalar(value)); return this; }
 public String getMsg() { return stringValue(field("msg")); }
 public TaxClassDeleteItem setMsg(String value) { put("msg", Json.scalar(value)); return this; }
 public String getError() { return stringValue(field("error")); }
 public TaxClassDeleteItem setError(String value) { put("error", Json.scalar(value)); return this; }
}
