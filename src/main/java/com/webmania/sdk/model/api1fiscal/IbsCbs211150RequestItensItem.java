package com.webmania.sdk.model.api1fiscal;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api1/fiscal.openapi.json; see contract-provenance.json. */
public final class IbsCbs211150RequestItensItem extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("item", "valor_credito_ibs", "valor_credito_cbs");
 public IbsCbs211150RequestItensItem() { super(FIELDS); }
 public IbsCbs211150RequestItensItem(JsonNode node) { super(node, FIELDS); }
 public IbsCbs211150RequestItensItemItem getItem() { return (field("item")).isNull() || (field("item")).isMissingNode() ? null : new IbsCbs211150RequestItensItemItem(field("item")); }
 public IbsCbs211150RequestItensItem setItem(IbsCbs211150RequestItensItemItem value) { put("item", value == null ? null : value.toJson()); return this; }
 public IbsCbs211150RequestItensItemValorCreditoIbs getValorCreditoIbs() { return (field("valor_credito_ibs")).isNull() || (field("valor_credito_ibs")).isMissingNode() ? null : new IbsCbs211150RequestItensItemValorCreditoIbs(field("valor_credito_ibs")); }
 public IbsCbs211150RequestItensItem setValorCreditoIbs(IbsCbs211150RequestItensItemValorCreditoIbs value) { put("valor_credito_ibs", value == null ? null : value.toJson()); return this; }
 public IbsCbs211150RequestItensItemValorCreditoCbs getValorCreditoCbs() { return (field("valor_credito_cbs")).isNull() || (field("valor_credito_cbs")).isMissingNode() ? null : new IbsCbs211150RequestItensItemValorCreditoCbs(field("valor_credito_cbs")); }
 public IbsCbs211150RequestItensItem setValorCreditoCbs(IbsCbs211150RequestItensItemValorCreditoCbs value) { put("valor_credito_cbs", value == null ? null : value.toJson()); return this; }
}
