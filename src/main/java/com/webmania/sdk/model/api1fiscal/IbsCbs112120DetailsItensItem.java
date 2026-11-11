package com.webmania.sdk.model.api1fiscal;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api1/fiscal.openapi.json; see contract-provenance.json. */
public final class IbsCbs112120DetailsItensItem extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("item", "valor_ibs", "valor_cbs", "controle_estoque");
 public IbsCbs112120DetailsItensItem() { super(FIELDS); }
 public IbsCbs112120DetailsItensItem(JsonNode node) { super(node, FIELDS); }
 public IbsCbs112120DetailsItensItemItem getItem() { return (field("item")).isNull() || (field("item")).isMissingNode() ? null : new IbsCbs112120DetailsItensItemItem(field("item")); }
 public IbsCbs112120DetailsItensItem setItem(IbsCbs112120DetailsItensItemItem value) { put("item", value == null ? null : value.toJson()); return this; }
 public IbsCbs112120DetailsItensItemValorIbs getValorIbs() { return (field("valor_ibs")).isNull() || (field("valor_ibs")).isMissingNode() ? null : new IbsCbs112120DetailsItensItemValorIbs(field("valor_ibs")); }
 public IbsCbs112120DetailsItensItem setValorIbs(IbsCbs112120DetailsItensItemValorIbs value) { put("valor_ibs", value == null ? null : value.toJson()); return this; }
 public IbsCbs112120DetailsItensItemValorCbs getValorCbs() { return (field("valor_cbs")).isNull() || (field("valor_cbs")).isMissingNode() ? null : new IbsCbs112120DetailsItensItemValorCbs(field("valor_cbs")); }
 public IbsCbs112120DetailsItensItem setValorCbs(IbsCbs112120DetailsItensItemValorCbs value) { put("valor_cbs", value == null ? null : value.toJson()); return this; }
 public IbsCbs112120DetailsItensItemControleEstoque getControleEstoque() { return (field("controle_estoque")).isNull() || (field("controle_estoque")).isMissingNode() ? null : new IbsCbs112120DetailsItensItemControleEstoque(field("controle_estoque")); }
 public IbsCbs112120DetailsItensItem setControleEstoque(IbsCbs112120DetailsItensItemControleEstoque value) { put("controle_estoque", value == null ? null : value.toJson()); return this; }
}
