package com.webmania.sdk.model.api1fiscal;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api1/fiscal.openapi.json; see contract-provenance.json. */
public final class G135 extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("item", "valor_ibs", "valor_cbs", "controle_estoque");
 public G135() { super(FIELDS); }
 public G135(JsonNode node) { super(node, FIELDS); }
 public java.math.BigInteger getItem() { return integerValue(field("item")); }
 public G135 setItem(java.math.BigInteger value) { put("item", Json.scalar(value)); return this; }
 public G135ValorIbs getValorIbs() { return (field("valor_ibs")).isNull() || (field("valor_ibs")).isMissingNode() ? null : new G135ValorIbs(field("valor_ibs")); }
 public G135 setValorIbs(G135ValorIbs value) { put("valor_ibs", value == null ? null : value.toJson()); return this; }
 public G135ValorCbs getValorCbs() { return (field("valor_cbs")).isNull() || (field("valor_cbs")).isMissingNode() ? null : new G135ValorCbs(field("valor_cbs")); }
 public G135 setValorCbs(G135ValorCbs value) { put("valor_cbs", value == null ? null : value.toJson()); return this; }
 public G135ControleEstoque getControleEstoque() { return (field("controle_estoque")).isNull() || (field("controle_estoque")).isMissingNode() ? null : new G135ControleEstoque(field("controle_estoque")); }
 public G135 setControleEstoque(G135ControleEstoque value) { put("controle_estoque", value == null ? null : value.toJson()); return this; }
}
