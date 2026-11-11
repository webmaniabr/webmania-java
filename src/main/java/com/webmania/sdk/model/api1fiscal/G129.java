package com.webmania.sdk.model.api1fiscal;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api1/fiscal.openapi.json; see contract-provenance.json. */
public final class G129 extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("item", "valor_ibs", "valor_cbs", "controle_estoque");
 public G129() { super(FIELDS); }
 public G129(JsonNode node) { super(node, FIELDS); }
 public java.math.BigInteger getItem() { return integerValue(field("item")); }
 public G129 setItem(java.math.BigInteger value) { put("item", Json.scalar(value)); return this; }
 public G129ValorIbs getValorIbs() { return (field("valor_ibs")).isNull() || (field("valor_ibs")).isMissingNode() ? null : new G129ValorIbs(field("valor_ibs")); }
 public G129 setValorIbs(G129ValorIbs value) { put("valor_ibs", value == null ? null : value.toJson()); return this; }
 public G129ValorCbs getValorCbs() { return (field("valor_cbs")).isNull() || (field("valor_cbs")).isMissingNode() ? null : new G129ValorCbs(field("valor_cbs")); }
 public G129 setValorCbs(G129ValorCbs value) { put("valor_cbs", value == null ? null : value.toJson()); return this; }
 public G129ControleEstoque getControleEstoque() { return (field("controle_estoque")).isNull() || (field("controle_estoque")).isMissingNode() ? null : new G129ControleEstoque(field("controle_estoque")); }
 public G129 setControleEstoque(G129ControleEstoque value) { put("controle_estoque", value == null ? null : value.toJson()); return this; }
}
