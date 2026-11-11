package com.webmania.sdk.model.api1fiscal;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api1/fiscal.openapi.json; see contract-provenance.json. */
public final class G132 extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("item", "valor_ibs", "valor_cbs", "controle_estoque");
 public G132() { super(FIELDS); }
 public G132(JsonNode node) { super(node, FIELDS); }
 public java.math.BigInteger getItem() { return integerValue(field("item")); }
 public G132 setItem(java.math.BigInteger value) { put("item", Json.scalar(value)); return this; }
 public G132ValorIbs getValorIbs() { return (field("valor_ibs")).isNull() || (field("valor_ibs")).isMissingNode() ? null : new G132ValorIbs(field("valor_ibs")); }
 public G132 setValorIbs(G132ValorIbs value) { put("valor_ibs", value == null ? null : value.toJson()); return this; }
 public G132ValorCbs getValorCbs() { return (field("valor_cbs")).isNull() || (field("valor_cbs")).isMissingNode() ? null : new G132ValorCbs(field("valor_cbs")); }
 public G132 setValorCbs(G132ValorCbs value) { put("valor_cbs", value == null ? null : value.toJson()); return this; }
 public G132ControleEstoque getControleEstoque() { return (field("controle_estoque")).isNull() || (field("controle_estoque")).isMissingNode() ? null : new G132ControleEstoque(field("controle_estoque")); }
 public G132 setControleEstoque(G132ControleEstoque value) { put("controle_estoque", value == null ? null : value.toJson()); return this; }
}
