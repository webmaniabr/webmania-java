package com.webmania.sdk.model.api1fiscal;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api1/fiscal.openapi.json; see contract-provenance.json. */
public final class TaxClassCreatedResult extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("referencia", "descricao", "data");
 public TaxClassCreatedResult() { super(FIELDS); }
 public TaxClassCreatedResult(JsonNode node) { super(node, FIELDS); }
 public String getReferencia() { return stringValue(field("referencia")); }
 public TaxClassCreatedResult setReferencia(String value) { put("referencia", Json.scalar(value)); return this; }
 public String getDescricao() { return stringValue(field("descricao")); }
 public TaxClassCreatedResult setDescricao(String value) { put("descricao", Json.scalar(value)); return this; }
 public String getData() { return stringValue(field("data")); }
 public TaxClassCreatedResult setData(String value) { put("data", Json.scalar(value)); return this; }
}
