package com.webmania.sdk.model.api1fiscal;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api1/fiscal.openapi.json; see contract-provenance.json. */
public final class TaxClassListStateRate extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("estado", "aliquota");
 public TaxClassListStateRate() { super(FIELDS); }
 public TaxClassListStateRate(JsonNode node) { super(node, FIELDS); }
 public String getEstado() { return stringValue(field("estado")); }
 public TaxClassListStateRate setEstado(String value) { put("estado", Json.scalar(value)); return this; }
 public TaxClassListStateRateAliquota getAliquota() { return (field("aliquota")).isNull() || (field("aliquota")).isMissingNode() ? null : new TaxClassListStateRateAliquota(field("aliquota")); }
 public TaxClassListStateRate setAliquota(TaxClassListStateRateAliquota value) { put("aliquota", value == null ? null : value.toJson()); return this; }
}
