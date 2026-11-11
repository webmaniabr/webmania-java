package com.webmania.sdk.model.api1fiscal;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api1/fiscal.openapi.json; see contract-provenance.json. */
public final class IbsCbs112130RequestItensItem extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("item", "valor_ibs", "valor_cbs", "controle_estoque");
 public IbsCbs112130RequestItensItem() { super(FIELDS); }
 public IbsCbs112130RequestItensItem(JsonNode node) { super(node, FIELDS); }
 public IbsCbs112130RequestItensItemItem getItem() { return (field("item")).isNull() || (field("item")).isMissingNode() ? null : new IbsCbs112130RequestItensItemItem(field("item")); }
 public IbsCbs112130RequestItensItem setItem(IbsCbs112130RequestItensItemItem value) { put("item", value == null ? null : value.toJson()); return this; }
 public IbsCbs112130RequestItensItemValorIbs getValorIbs() { return (field("valor_ibs")).isNull() || (field("valor_ibs")).isMissingNode() ? null : new IbsCbs112130RequestItensItemValorIbs(field("valor_ibs")); }
 public IbsCbs112130RequestItensItem setValorIbs(IbsCbs112130RequestItensItemValorIbs value) { put("valor_ibs", value == null ? null : value.toJson()); return this; }
 public IbsCbs112130RequestItensItemValorCbs getValorCbs() { return (field("valor_cbs")).isNull() || (field("valor_cbs")).isMissingNode() ? null : new IbsCbs112130RequestItensItemValorCbs(field("valor_cbs")); }
 public IbsCbs112130RequestItensItem setValorCbs(IbsCbs112130RequestItensItemValorCbs value) { put("valor_cbs", value == null ? null : value.toJson()); return this; }
 public IbsCbs112130RequestItensItemControleEstoque getControleEstoque() { return (field("controle_estoque")).isNull() || (field("controle_estoque")).isMissingNode() ? null : new IbsCbs112130RequestItensItemControleEstoque(field("controle_estoque")); }
 public IbsCbs112130RequestItensItem setControleEstoque(IbsCbs112130RequestItensItemControleEstoque value) { put("controle_estoque", value == null ? null : value.toJson()); return this; }
}
