package com.webmania.sdk.model.api1fiscal;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api1/fiscal.openapi.json; see contract-provenance.json. */
public final class IbsCbs112140DetailsItensItem extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("item", "valor_ibs", "valor_cbs", "controle_estoque");
 public IbsCbs112140DetailsItensItem() { super(FIELDS); }
 public IbsCbs112140DetailsItensItem(JsonNode node) { super(node, FIELDS); }
 public IbsCbs112140DetailsItensItemItem getItem() { return (field("item")).isNull() || (field("item")).isMissingNode() ? null : new IbsCbs112140DetailsItensItemItem(field("item")); }
 public IbsCbs112140DetailsItensItem setItem(IbsCbs112140DetailsItensItemItem value) { put("item", value == null ? null : value.toJson()); return this; }
 public IbsCbs112140DetailsItensItemValorIbs getValorIbs() { return (field("valor_ibs")).isNull() || (field("valor_ibs")).isMissingNode() ? null : new IbsCbs112140DetailsItensItemValorIbs(field("valor_ibs")); }
 public IbsCbs112140DetailsItensItem setValorIbs(IbsCbs112140DetailsItensItemValorIbs value) { put("valor_ibs", value == null ? null : value.toJson()); return this; }
 public IbsCbs112140DetailsItensItemValorCbs getValorCbs() { return (field("valor_cbs")).isNull() || (field("valor_cbs")).isMissingNode() ? null : new IbsCbs112140DetailsItensItemValorCbs(field("valor_cbs")); }
 public IbsCbs112140DetailsItensItem setValorCbs(IbsCbs112140DetailsItensItemValorCbs value) { put("valor_cbs", value == null ? null : value.toJson()); return this; }
 public IbsCbs112140DetailsItensItemControleEstoque getControleEstoque() { return (field("controle_estoque")).isNull() || (field("controle_estoque")).isMissingNode() ? null : new IbsCbs112140DetailsItensItemControleEstoque(field("controle_estoque")); }
 public IbsCbs112140DetailsItensItem setControleEstoque(IbsCbs112140DetailsItensItemControleEstoque value) { put("controle_estoque", value == null ? null : value.toJson()); return this; }
}
