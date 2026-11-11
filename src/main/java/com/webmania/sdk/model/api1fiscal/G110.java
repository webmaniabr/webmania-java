package com.webmania.sdk.model.api1fiscal;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api1/fiscal.openapi.json; see contract-provenance.json. */
public final class G110 extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("valor_ibs", "valor_cbs");
 public G110() { super(FIELDS); }
 public G110(JsonNode node) { super(node, FIELDS); }
 public G110ValorIbs getValorIbs() { return (field("valor_ibs")).isNull() || (field("valor_ibs")).isMissingNode() ? null : new G110ValorIbs(field("valor_ibs")); }
 public G110 setValorIbs(G110ValorIbs value) { put("valor_ibs", value == null ? null : value.toJson()); return this; }
 public G110ValorCbs getValorCbs() { return (field("valor_cbs")).isNull() || (field("valor_cbs")).isMissingNode() ? null : new G110ValorCbs(field("valor_cbs")); }
 public G110 setValorCbs(G110ValorCbs value) { put("valor_cbs", value == null ? null : value.toJson()); return this; }
}
