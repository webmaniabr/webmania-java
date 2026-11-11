package com.webmania.sdk.model.api1fiscal;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api1/fiscal.openapi.json; see contract-provenance.json. */
public final class IbsCbs211130RequestItensItem extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("item", "valor_ibs", "valor_cbs", "controle_estoque");
 public IbsCbs211130RequestItensItem() { super(FIELDS); }
 public IbsCbs211130RequestItensItem(JsonNode node) { super(node, FIELDS); }
 public IbsCbs211130RequestItensItemItem getItem() { return (field("item")).isNull() || (field("item")).isMissingNode() ? null : new IbsCbs211130RequestItensItemItem(field("item")); }
 public IbsCbs211130RequestItensItem setItem(IbsCbs211130RequestItensItemItem value) { put("item", value == null ? null : value.toJson()); return this; }
 public IbsCbs211130RequestItensItemValorIbs getValorIbs() { return (field("valor_ibs")).isNull() || (field("valor_ibs")).isMissingNode() ? null : new IbsCbs211130RequestItensItemValorIbs(field("valor_ibs")); }
 public IbsCbs211130RequestItensItem setValorIbs(IbsCbs211130RequestItensItemValorIbs value) { put("valor_ibs", value == null ? null : value.toJson()); return this; }
 public IbsCbs211130RequestItensItemValorCbs getValorCbs() { return (field("valor_cbs")).isNull() || (field("valor_cbs")).isMissingNode() ? null : new IbsCbs211130RequestItensItemValorCbs(field("valor_cbs")); }
 public IbsCbs211130RequestItensItem setValorCbs(IbsCbs211130RequestItensItemValorCbs value) { put("valor_cbs", value == null ? null : value.toJson()); return this; }
 public IbsCbs211130RequestItensItemControleEstoque getControleEstoque() { return (field("controle_estoque")).isNull() || (field("controle_estoque")).isMissingNode() ? null : new IbsCbs211130RequestItensItemControleEstoque(field("controle_estoque")); }
 public IbsCbs211130RequestItensItem setControleEstoque(IbsCbs211130RequestItensItemControleEstoque value) { put("controle_estoque", value == null ? null : value.toJson()); return this; }
}
