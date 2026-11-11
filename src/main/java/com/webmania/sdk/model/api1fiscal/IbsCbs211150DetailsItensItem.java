package com.webmania.sdk.model.api1fiscal;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api1/fiscal.openapi.json; see contract-provenance.json. */
public final class IbsCbs211150DetailsItensItem extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("item", "valor_credito_ibs", "valor_credito_cbs");
 public IbsCbs211150DetailsItensItem() { super(FIELDS); }
 public IbsCbs211150DetailsItensItem(JsonNode node) { super(node, FIELDS); }
 public IbsCbs211150DetailsItensItemItem getItem() { return (field("item")).isNull() || (field("item")).isMissingNode() ? null : new IbsCbs211150DetailsItensItemItem(field("item")); }
 public IbsCbs211150DetailsItensItem setItem(IbsCbs211150DetailsItensItemItem value) { put("item", value == null ? null : value.toJson()); return this; }
 public IbsCbs211150DetailsItensItemValorCreditoIbs getValorCreditoIbs() { return (field("valor_credito_ibs")).isNull() || (field("valor_credito_ibs")).isMissingNode() ? null : new IbsCbs211150DetailsItensItemValorCreditoIbs(field("valor_credito_ibs")); }
 public IbsCbs211150DetailsItensItem setValorCreditoIbs(IbsCbs211150DetailsItensItemValorCreditoIbs value) { put("valor_credito_ibs", value == null ? null : value.toJson()); return this; }
 public IbsCbs211150DetailsItensItemValorCreditoCbs getValorCreditoCbs() { return (field("valor_credito_cbs")).isNull() || (field("valor_credito_cbs")).isMissingNode() ? null : new IbsCbs211150DetailsItensItemValorCreditoCbs(field("valor_credito_cbs")); }
 public IbsCbs211150DetailsItensItem setValorCreditoCbs(IbsCbs211150DetailsItensItemValorCreditoCbs value) { put("valor_credito_cbs", value == null ? null : value.toJson()); return this; }
}
