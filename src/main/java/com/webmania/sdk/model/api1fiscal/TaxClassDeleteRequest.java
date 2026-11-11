package com.webmania.sdk.model.api1fiscal;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api1/fiscal.openapi.json; see contract-provenance.json. */
public final class TaxClassDeleteRequest extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("referencia");
 public TaxClassDeleteRequest() { super(FIELDS); }
 public TaxClassDeleteRequest(JsonNode node) { super(node, FIELDS); }
 public TaxClassDeleteRequestReferencia getReferencia() { return (field("referencia")).isNull() || (field("referencia")).isMissingNode() ? null : new TaxClassDeleteRequestReferencia(field("referencia")); }
 public TaxClassDeleteRequest setReferencia(TaxClassDeleteRequestReferencia value) { put("referencia", value == null ? null : value.toJson()); return this; }
}
