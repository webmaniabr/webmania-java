package com.webmania.sdk.model.api1fiscal;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api1/fiscal.openapi.json; see contract-provenance.json. */
public final class G127 extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("item", "valor_ibs", "valor_cbs", "controle_estoque");
 public G127() { super(FIELDS); }
 public G127(JsonNode node) { super(node, FIELDS); }
 public java.math.BigInteger getItem() { return integerValue(field("item")); }
 public G127 setItem(java.math.BigInteger value) { put("item", Json.scalar(value)); return this; }
 public G127ValorIbs getValorIbs() { return (field("valor_ibs")).isNull() || (field("valor_ibs")).isMissingNode() ? null : new G127ValorIbs(field("valor_ibs")); }
 public G127 setValorIbs(G127ValorIbs value) { put("valor_ibs", value == null ? null : value.toJson()); return this; }
 public G127ValorCbs getValorCbs() { return (field("valor_cbs")).isNull() || (field("valor_cbs")).isMissingNode() ? null : new G127ValorCbs(field("valor_cbs")); }
 public G127 setValorCbs(G127ValorCbs value) { put("valor_cbs", value == null ? null : value.toJson()); return this; }
 public G127ControleEstoque getControleEstoque() { return (field("controle_estoque")).isNull() || (field("controle_estoque")).isMissingNode() ? null : new G127ControleEstoque(field("controle_estoque")); }
 public G127 setControleEstoque(G127ControleEstoque value) { put("controle_estoque", value == null ? null : value.toJson()); return this; }
}
