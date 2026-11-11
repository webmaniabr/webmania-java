package com.webmania.sdk.model.api1fiscal;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api1/fiscal.openapi.json; see contract-provenance.json. */
public final class G108 extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("valor_ibs", "valor_cbs");
 public G108() { super(FIELDS); }
 public G108(JsonNode node) { super(node, FIELDS); }
 public G108ValorIbs getValorIbs() { return (field("valor_ibs")).isNull() || (field("valor_ibs")).isMissingNode() ? null : new G108ValorIbs(field("valor_ibs")); }
 public G108 setValorIbs(G108ValorIbs value) { put("valor_ibs", value == null ? null : value.toJson()); return this; }
 public G108ValorCbs getValorCbs() { return (field("valor_cbs")).isNull() || (field("valor_cbs")).isMissingNode() ? null : new G108ValorCbs(field("valor_cbs")); }
 public G108 setValorCbs(G108ValorCbs value) { put("valor_cbs", value == null ? null : value.toJson()); return this; }
}
