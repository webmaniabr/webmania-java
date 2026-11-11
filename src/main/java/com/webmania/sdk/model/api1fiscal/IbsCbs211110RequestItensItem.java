package com.webmania.sdk.model.api1fiscal;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api1/fiscal.openapi.json; see contract-provenance.json. */
public final class IbsCbs211110RequestItensItem extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("item", "base_calculo", "credito_presumido");
 public IbsCbs211110RequestItensItem() { super(FIELDS); }
 public IbsCbs211110RequestItensItem(JsonNode node) { super(node, FIELDS); }
 public IbsCbs211110RequestItensItemItem getItem() { return (field("item")).isNull() || (field("item")).isMissingNode() ? null : new IbsCbs211110RequestItensItemItem(field("item")); }
 public IbsCbs211110RequestItensItem setItem(IbsCbs211110RequestItensItemItem value) { put("item", value == null ? null : value.toJson()); return this; }
 public IbsCbs211110RequestItensItemBaseCalculo getBaseCalculo() { return (field("base_calculo")).isNull() || (field("base_calculo")).isMissingNode() ? null : new IbsCbs211110RequestItensItemBaseCalculo(field("base_calculo")); }
 public IbsCbs211110RequestItensItem setBaseCalculo(IbsCbs211110RequestItensItemBaseCalculo value) { put("base_calculo", value == null ? null : value.toJson()); return this; }
 public IbsCbs211110RequestItensItemCreditoPresumido getCreditoPresumido() { return (field("credito_presumido")).isNull() || (field("credito_presumido")).isMissingNode() ? null : new IbsCbs211110RequestItensItemCreditoPresumido(field("credito_presumido")); }
 public IbsCbs211110RequestItensItem setCreditoPresumido(IbsCbs211110RequestItensItemCreditoPresumido value) { put("credito_presumido", value == null ? null : value.toJson()); return this; }
}
