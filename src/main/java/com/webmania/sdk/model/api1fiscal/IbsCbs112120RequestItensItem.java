package com.webmania.sdk.model.api1fiscal;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api1/fiscal.openapi.json; see contract-provenance.json. */
public final class IbsCbs112120RequestItensItem extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("item", "valor_ibs", "valor_cbs", "controle_estoque");
 public IbsCbs112120RequestItensItem() { super(FIELDS); }
 public IbsCbs112120RequestItensItem(JsonNode node) { super(node, FIELDS); }
 public IbsCbs112120RequestItensItemItem getItem() { return (field("item")).isNull() || (field("item")).isMissingNode() ? null : new IbsCbs112120RequestItensItemItem(field("item")); }
 public IbsCbs112120RequestItensItem setItem(IbsCbs112120RequestItensItemItem value) { put("item", value == null ? null : value.toJson()); return this; }
 public IbsCbs112120RequestItensItemValorIbs getValorIbs() { return (field("valor_ibs")).isNull() || (field("valor_ibs")).isMissingNode() ? null : new IbsCbs112120RequestItensItemValorIbs(field("valor_ibs")); }
 public IbsCbs112120RequestItensItem setValorIbs(IbsCbs112120RequestItensItemValorIbs value) { put("valor_ibs", value == null ? null : value.toJson()); return this; }
 public IbsCbs112120RequestItensItemValorCbs getValorCbs() { return (field("valor_cbs")).isNull() || (field("valor_cbs")).isMissingNode() ? null : new IbsCbs112120RequestItensItemValorCbs(field("valor_cbs")); }
 public IbsCbs112120RequestItensItem setValorCbs(IbsCbs112120RequestItensItemValorCbs value) { put("valor_cbs", value == null ? null : value.toJson()); return this; }
 public IbsCbs112120RequestItensItemControleEstoque getControleEstoque() { return (field("controle_estoque")).isNull() || (field("controle_estoque")).isMissingNode() ? null : new IbsCbs112120RequestItensItemControleEstoque(field("controle_estoque")); }
 public IbsCbs112120RequestItensItem setControleEstoque(IbsCbs112120RequestItensItemControleEstoque value) { put("controle_estoque", value == null ? null : value.toJson()); return this; }
}
