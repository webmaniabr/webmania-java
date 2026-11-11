package com.webmania.sdk.model.api1fiscal;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api1/fiscal.openapi.json; see contract-provenance.json. */
public final class IbsCbs211124RequestItensItem extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("item", "valor_ibs", "valor_cbs", "controle_estoque");
 public IbsCbs211124RequestItensItem() { super(FIELDS); }
 public IbsCbs211124RequestItensItem(JsonNode node) { super(node, FIELDS); }
 public IbsCbs211124RequestItensItemItem getItem() { return (field("item")).isNull() || (field("item")).isMissingNode() ? null : new IbsCbs211124RequestItensItemItem(field("item")); }
 public IbsCbs211124RequestItensItem setItem(IbsCbs211124RequestItensItemItem value) { put("item", value == null ? null : value.toJson()); return this; }
 public IbsCbs211124RequestItensItemValorIbs getValorIbs() { return (field("valor_ibs")).isNull() || (field("valor_ibs")).isMissingNode() ? null : new IbsCbs211124RequestItensItemValorIbs(field("valor_ibs")); }
 public IbsCbs211124RequestItensItem setValorIbs(IbsCbs211124RequestItensItemValorIbs value) { put("valor_ibs", value == null ? null : value.toJson()); return this; }
 public IbsCbs211124RequestItensItemValorCbs getValorCbs() { return (field("valor_cbs")).isNull() || (field("valor_cbs")).isMissingNode() ? null : new IbsCbs211124RequestItensItemValorCbs(field("valor_cbs")); }
 public IbsCbs211124RequestItensItem setValorCbs(IbsCbs211124RequestItensItemValorCbs value) { put("valor_cbs", value == null ? null : value.toJson()); return this; }
 public IbsCbs211124RequestItensItemControleEstoque getControleEstoque() { return (field("controle_estoque")).isNull() || (field("controle_estoque")).isMissingNode() ? null : new IbsCbs211124RequestItensItemControleEstoque(field("controle_estoque")); }
 public IbsCbs211124RequestItensItem setControleEstoque(IbsCbs211124RequestItensItemControleEstoque value) { put("controle_estoque", value == null ? null : value.toJson()); return this; }
}
