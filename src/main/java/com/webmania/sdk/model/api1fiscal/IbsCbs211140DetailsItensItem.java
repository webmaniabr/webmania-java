package com.webmania.sdk.model.api1fiscal;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api1/fiscal.openapi.json; see contract-provenance.json. */
public final class IbsCbs211140DetailsItensItem extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("item", "valor_ibs", "valor_cbs", "controle_estoque");
 public IbsCbs211140DetailsItensItem() { super(FIELDS); }
 public IbsCbs211140DetailsItensItem(JsonNode node) { super(node, FIELDS); }
 public IbsCbs211140DetailsItensItemItem getItem() { return (field("item")).isNull() || (field("item")).isMissingNode() ? null : new IbsCbs211140DetailsItensItemItem(field("item")); }
 public IbsCbs211140DetailsItensItem setItem(IbsCbs211140DetailsItensItemItem value) { put("item", value == null ? null : value.toJson()); return this; }
 public IbsCbs211140DetailsItensItemValorIbs getValorIbs() { return (field("valor_ibs")).isNull() || (field("valor_ibs")).isMissingNode() ? null : new IbsCbs211140DetailsItensItemValorIbs(field("valor_ibs")); }
 public IbsCbs211140DetailsItensItem setValorIbs(IbsCbs211140DetailsItensItemValorIbs value) { put("valor_ibs", value == null ? null : value.toJson()); return this; }
 public IbsCbs211140DetailsItensItemValorCbs getValorCbs() { return (field("valor_cbs")).isNull() || (field("valor_cbs")).isMissingNode() ? null : new IbsCbs211140DetailsItensItemValorCbs(field("valor_cbs")); }
 public IbsCbs211140DetailsItensItem setValorCbs(IbsCbs211140DetailsItensItemValorCbs value) { put("valor_cbs", value == null ? null : value.toJson()); return this; }
 public IbsCbs211140DetailsItensItemControleEstoque getControleEstoque() { return (field("controle_estoque")).isNull() || (field("controle_estoque")).isMissingNode() ? null : new IbsCbs211140DetailsItensItemControleEstoque(field("controle_estoque")); }
 public IbsCbs211140DetailsItensItem setControleEstoque(IbsCbs211140DetailsItensItemControleEstoque value) { put("controle_estoque", value == null ? null : value.toJson()); return this; }
}
