package com.webmania.sdk.model.api1fiscal;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api1/fiscal.openapi.json; see contract-provenance.json. */
public final class IbsCbs211110DetailsItensItem extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("item", "base_calculo", "credito_presumido");
 public IbsCbs211110DetailsItensItem() { super(FIELDS); }
 public IbsCbs211110DetailsItensItem(JsonNode node) { super(node, FIELDS); }
 public IbsCbs211110DetailsItensItemItem getItem() { return (field("item")).isNull() || (field("item")).isMissingNode() ? null : new IbsCbs211110DetailsItensItemItem(field("item")); }
 public IbsCbs211110DetailsItensItem setItem(IbsCbs211110DetailsItensItemItem value) { put("item", value == null ? null : value.toJson()); return this; }
 public IbsCbs211110DetailsItensItemBaseCalculo getBaseCalculo() { return (field("base_calculo")).isNull() || (field("base_calculo")).isMissingNode() ? null : new IbsCbs211110DetailsItensItemBaseCalculo(field("base_calculo")); }
 public IbsCbs211110DetailsItensItem setBaseCalculo(IbsCbs211110DetailsItensItemBaseCalculo value) { put("base_calculo", value == null ? null : value.toJson()); return this; }
 public IbsCbs211110DetailsItensItemCreditoPresumido getCreditoPresumido() { return (field("credito_presumido")).isNull() || (field("credito_presumido")).isMissingNode() ? null : new IbsCbs211110DetailsItensItemCreditoPresumido(field("credito_presumido")); }
 public IbsCbs211110DetailsItensItem setCreditoPresumido(IbsCbs211110DetailsItensItemCreditoPresumido value) { put("credito_presumido", value == null ? null : value.toJson()); return this; }
}
