package com.webmania.sdk.model.api1fiscal;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api1/fiscal.openapi.json; see contract-provenance.json. */
public final class IbsCbs112140RequestItensItem extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("item", "valor_ibs", "valor_cbs", "controle_estoque");
 public IbsCbs112140RequestItensItem() { super(FIELDS); }
 public IbsCbs112140RequestItensItem(JsonNode node) { super(node, FIELDS); }
 public IbsCbs112140RequestItensItemItem getItem() { return (field("item")).isNull() || (field("item")).isMissingNode() ? null : new IbsCbs112140RequestItensItemItem(field("item")); }
 public IbsCbs112140RequestItensItem setItem(IbsCbs112140RequestItensItemItem value) { put("item", value == null ? null : value.toJson()); return this; }
 public IbsCbs112140RequestItensItemValorIbs getValorIbs() { return (field("valor_ibs")).isNull() || (field("valor_ibs")).isMissingNode() ? null : new IbsCbs112140RequestItensItemValorIbs(field("valor_ibs")); }
 public IbsCbs112140RequestItensItem setValorIbs(IbsCbs112140RequestItensItemValorIbs value) { put("valor_ibs", value == null ? null : value.toJson()); return this; }
 public IbsCbs112140RequestItensItemValorCbs getValorCbs() { return (field("valor_cbs")).isNull() || (field("valor_cbs")).isMissingNode() ? null : new IbsCbs112140RequestItensItemValorCbs(field("valor_cbs")); }
 public IbsCbs112140RequestItensItem setValorCbs(IbsCbs112140RequestItensItemValorCbs value) { put("valor_cbs", value == null ? null : value.toJson()); return this; }
 public IbsCbs112140RequestItensItemControleEstoque getControleEstoque() { return (field("controle_estoque")).isNull() || (field("controle_estoque")).isMissingNode() ? null : new IbsCbs112140RequestItensItemControleEstoque(field("controle_estoque")); }
 public IbsCbs112140RequestItensItem setControleEstoque(IbsCbs112140RequestItensItemControleEstoque value) { put("controle_estoque", value == null ? null : value.toJson()); return this; }
}
