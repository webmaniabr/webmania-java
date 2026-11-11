package com.webmania.sdk.model.api1fiscal;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api1/fiscal.openapi.json; see contract-provenance.json. */
public final class IbsCbs112130DetailsItensItem extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("item", "valor_ibs", "valor_cbs", "controle_estoque");
 public IbsCbs112130DetailsItensItem() { super(FIELDS); }
 public IbsCbs112130DetailsItensItem(JsonNode node) { super(node, FIELDS); }
 public IbsCbs112130DetailsItensItemItem getItem() { return (field("item")).isNull() || (field("item")).isMissingNode() ? null : new IbsCbs112130DetailsItensItemItem(field("item")); }
 public IbsCbs112130DetailsItensItem setItem(IbsCbs112130DetailsItensItemItem value) { put("item", value == null ? null : value.toJson()); return this; }
 public IbsCbs112130DetailsItensItemValorIbs getValorIbs() { return (field("valor_ibs")).isNull() || (field("valor_ibs")).isMissingNode() ? null : new IbsCbs112130DetailsItensItemValorIbs(field("valor_ibs")); }
 public IbsCbs112130DetailsItensItem setValorIbs(IbsCbs112130DetailsItensItemValorIbs value) { put("valor_ibs", value == null ? null : value.toJson()); return this; }
 public IbsCbs112130DetailsItensItemValorCbs getValorCbs() { return (field("valor_cbs")).isNull() || (field("valor_cbs")).isMissingNode() ? null : new IbsCbs112130DetailsItensItemValorCbs(field("valor_cbs")); }
 public IbsCbs112130DetailsItensItem setValorCbs(IbsCbs112130DetailsItensItemValorCbs value) { put("valor_cbs", value == null ? null : value.toJson()); return this; }
 public IbsCbs112130DetailsItensItemControleEstoque getControleEstoque() { return (field("controle_estoque")).isNull() || (field("controle_estoque")).isMissingNode() ? null : new IbsCbs112130DetailsItensItemControleEstoque(field("controle_estoque")); }
 public IbsCbs112130DetailsItensItem setControleEstoque(IbsCbs112130DetailsItensItemControleEstoque value) { put("controle_estoque", value == null ? null : value.toJson()); return this; }
}
