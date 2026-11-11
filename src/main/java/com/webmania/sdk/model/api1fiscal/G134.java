package com.webmania.sdk.model.api1fiscal;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api1/fiscal.openapi.json; see contract-provenance.json. */
public final class G134 extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("item", "valor_ibs", "valor_cbs", "controle_estoque");
 public G134() { super(FIELDS); }
 public G134(JsonNode node) { super(node, FIELDS); }
 public java.math.BigInteger getItem() { return integerValue(field("item")); }
 public G134 setItem(java.math.BigInteger value) { put("item", Json.scalar(value)); return this; }
 public G134ValorIbs getValorIbs() { return (field("valor_ibs")).isNull() || (field("valor_ibs")).isMissingNode() ? null : new G134ValorIbs(field("valor_ibs")); }
 public G134 setValorIbs(G134ValorIbs value) { put("valor_ibs", value == null ? null : value.toJson()); return this; }
 public G134ValorCbs getValorCbs() { return (field("valor_cbs")).isNull() || (field("valor_cbs")).isMissingNode() ? null : new G134ValorCbs(field("valor_cbs")); }
 public G134 setValorCbs(G134ValorCbs value) { put("valor_cbs", value == null ? null : value.toJson()); return this; }
 public G134ControleEstoque getControleEstoque() { return (field("controle_estoque")).isNull() || (field("controle_estoque")).isMissingNode() ? null : new G134ControleEstoque(field("controle_estoque")); }
 public G134 setControleEstoque(G134ControleEstoque value) { put("controle_estoque", value == null ? null : value.toJson()); return this; }
}
