package com.webmania.sdk.model.api1fiscal;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api1/fiscal.openapi.json; see contract-provenance.json. */
public final class IbsCbs211140RequestItensItem extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("item", "valor_ibs", "valor_cbs", "controle_estoque");
 public IbsCbs211140RequestItensItem() { super(FIELDS); }
 public IbsCbs211140RequestItensItem(JsonNode node) { super(node, FIELDS); }
 public IbsCbs211140RequestItensItemItem getItem() { return (field("item")).isNull() || (field("item")).isMissingNode() ? null : new IbsCbs211140RequestItensItemItem(field("item")); }
 public IbsCbs211140RequestItensItem setItem(IbsCbs211140RequestItensItemItem value) { put("item", value == null ? null : value.toJson()); return this; }
 public IbsCbs211140RequestItensItemValorIbs getValorIbs() { return (field("valor_ibs")).isNull() || (field("valor_ibs")).isMissingNode() ? null : new IbsCbs211140RequestItensItemValorIbs(field("valor_ibs")); }
 public IbsCbs211140RequestItensItem setValorIbs(IbsCbs211140RequestItensItemValorIbs value) { put("valor_ibs", value == null ? null : value.toJson()); return this; }
 public IbsCbs211140RequestItensItemValorCbs getValorCbs() { return (field("valor_cbs")).isNull() || (field("valor_cbs")).isMissingNode() ? null : new IbsCbs211140RequestItensItemValorCbs(field("valor_cbs")); }
 public IbsCbs211140RequestItensItem setValorCbs(IbsCbs211140RequestItensItemValorCbs value) { put("valor_cbs", value == null ? null : value.toJson()); return this; }
 public IbsCbs211140RequestItensItemControleEstoque getControleEstoque() { return (field("controle_estoque")).isNull() || (field("controle_estoque")).isMissingNode() ? null : new IbsCbs211140RequestItensItemControleEstoque(field("controle_estoque")); }
 public IbsCbs211140RequestItensItem setControleEstoque(IbsCbs211140RequestItensItemControleEstoque value) { put("controle_estoque", value == null ? null : value.toJson()); return this; }
}
