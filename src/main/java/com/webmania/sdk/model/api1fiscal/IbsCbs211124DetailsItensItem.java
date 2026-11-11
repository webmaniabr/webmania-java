package com.webmania.sdk.model.api1fiscal;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api1/fiscal.openapi.json; see contract-provenance.json. */
public final class IbsCbs211124DetailsItensItem extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("item", "valor_ibs", "valor_cbs", "controle_estoque");
 public IbsCbs211124DetailsItensItem() { super(FIELDS); }
 public IbsCbs211124DetailsItensItem(JsonNode node) { super(node, FIELDS); }
 public IbsCbs211124DetailsItensItemItem getItem() { return (field("item")).isNull() || (field("item")).isMissingNode() ? null : new IbsCbs211124DetailsItensItemItem(field("item")); }
 public IbsCbs211124DetailsItensItem setItem(IbsCbs211124DetailsItensItemItem value) { put("item", value == null ? null : value.toJson()); return this; }
 public IbsCbs211124DetailsItensItemValorIbs getValorIbs() { return (field("valor_ibs")).isNull() || (field("valor_ibs")).isMissingNode() ? null : new IbsCbs211124DetailsItensItemValorIbs(field("valor_ibs")); }
 public IbsCbs211124DetailsItensItem setValorIbs(IbsCbs211124DetailsItensItemValorIbs value) { put("valor_ibs", value == null ? null : value.toJson()); return this; }
 public IbsCbs211124DetailsItensItemValorCbs getValorCbs() { return (field("valor_cbs")).isNull() || (field("valor_cbs")).isMissingNode() ? null : new IbsCbs211124DetailsItensItemValorCbs(field("valor_cbs")); }
 public IbsCbs211124DetailsItensItem setValorCbs(IbsCbs211124DetailsItensItemValorCbs value) { put("valor_cbs", value == null ? null : value.toJson()); return this; }
 public IbsCbs211124DetailsItensItemControleEstoque getControleEstoque() { return (field("controle_estoque")).isNull() || (field("controle_estoque")).isMissingNode() ? null : new IbsCbs211124DetailsItensItemControleEstoque(field("controle_estoque")); }
 public IbsCbs211124DetailsItensItem setControleEstoque(IbsCbs211124DetailsItensItemControleEstoque value) { put("controle_estoque", value == null ? null : value.toJson()); return this; }
}
