package com.webmania.sdk.model.api1fiscal;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api1/fiscal.openapi.json; see contract-provenance.json. */
public final class IbsCbs211130DetailsItensItem extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("item", "valor_ibs", "valor_cbs", "controle_estoque");
 public IbsCbs211130DetailsItensItem() { super(FIELDS); }
 public IbsCbs211130DetailsItensItem(JsonNode node) { super(node, FIELDS); }
 public IbsCbs211130DetailsItensItemItem getItem() { return (field("item")).isNull() || (field("item")).isMissingNode() ? null : new IbsCbs211130DetailsItensItemItem(field("item")); }
 public IbsCbs211130DetailsItensItem setItem(IbsCbs211130DetailsItensItemItem value) { put("item", value == null ? null : value.toJson()); return this; }
 public IbsCbs211130DetailsItensItemValorIbs getValorIbs() { return (field("valor_ibs")).isNull() || (field("valor_ibs")).isMissingNode() ? null : new IbsCbs211130DetailsItensItemValorIbs(field("valor_ibs")); }
 public IbsCbs211130DetailsItensItem setValorIbs(IbsCbs211130DetailsItensItemValorIbs value) { put("valor_ibs", value == null ? null : value.toJson()); return this; }
 public IbsCbs211130DetailsItensItemValorCbs getValorCbs() { return (field("valor_cbs")).isNull() || (field("valor_cbs")).isMissingNode() ? null : new IbsCbs211130DetailsItensItemValorCbs(field("valor_cbs")); }
 public IbsCbs211130DetailsItensItem setValorCbs(IbsCbs211130DetailsItensItemValorCbs value) { put("valor_cbs", value == null ? null : value.toJson()); return this; }
 public IbsCbs211130DetailsItensItemControleEstoque getControleEstoque() { return (field("controle_estoque")).isNull() || (field("controle_estoque")).isMissingNode() ? null : new IbsCbs211130DetailsItensItemControleEstoque(field("controle_estoque")); }
 public IbsCbs211130DetailsItensItem setControleEstoque(IbsCbs211130DetailsItensItemControleEstoque value) { put("controle_estoque", value == null ? null : value.toJson()); return this; }
}
